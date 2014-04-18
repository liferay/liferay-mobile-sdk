/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

#import "LRHttpUtil.h"

const int V_UNKNOWN = -1;
const int V_6_2 = 6200;

NSString *const ERROR_DOMAIN = @"com.liferay.mobile.sync.ErrorDomain";

static NSString *const GET = @"GET";
static NSString *const HEAD = @"HEAD";
static NSString *const POST = @"POST";

static NSString *const IF_MODIFIED_SINCE = @"If-Modified-Since";
static NSString *const LAST_MODIFIED = @"Last-Modified";

static const int STATUS_OK = 200;
static const int STATUS_UNAUTHORIZED = 401;

/**
 * @author Bruno Farache
 */
@implementation LRHttpUtil

static NSMutableDictionary *_versions;

+ (void)initialize {
	if (!_versions) {
		_versions = [[NSMutableDictionary alloc] init];
	}
}

+ (int)getPortalVersion:(LRSession *)session error:(NSError **)error {
	return [self getPortalVersionWithURL:session.server error:error];
}

+ (int)getPortalVersionWithURL:(NSString *)URL error:(NSError **)error {
	NSNumber *version = [_versions objectForKey:URL];

	if (version) {
		return [version intValue];
	}

	NSMutableURLRequest *request =
		[[NSMutableURLRequest alloc] initWithURL:[NSURL URLWithString:URL]];

	[request setHTTPMethod:HEAD];

	NSHTTPURLResponse *response;

	[NSURLConnection sendSynchronousRequest:request returningResponse:&response
		error:error];

	if (*error) {
		return V_UNKNOWN;
	}

	NSDictionary *headers = [response allHeaderFields];
	NSString *portalHeader = [headers objectForKey:@"Liferay-Portal"];

	if (!portalHeader) {
		version = @(V_UNKNOWN);

		[_versions setObject:version forKey:URL];

		return [version intValue];
	}

	NSRange buildRange;
	NSRange searchRange = NSMakeRange(0, [portalHeader length]);

	buildRange =
		[portalHeader rangeOfString:@"Build" options:NSCaseInsensitiveSearch
			range:searchRange];

	if (buildRange.location == NSNotFound) {
		version = @(V_UNKNOWN);
	}
	else {
		int indexOfBuild = buildRange.location + buildRange.length;
		NSRange versionRange = NSMakeRange(indexOfBuild, 5);
		NSString *buildNumber = [portalHeader substringWithRange:versionRange];

		version = [NSNumber numberWithInt:[buildNumber intValue]];
	}

	[_versions setObject:version forKey:URL];

	return [version intValue];
}

+ (NSArray *)post:(LRSession *)session command:(NSDictionary *)command
		error:(NSError **)error {

	NSArray *commands = [NSArray arrayWithObject:command];

	return [self post:session commands:commands error:error];
}

+ (NSArray *)post:(LRSession *)session commands:(NSArray *)commands
		error:(NSError **)error {

	NSURLRequest *request = [self _getRequest:session commands:commands
		error:error];

	if (*error) {
		return nil;
	}

	if (session.callback) {
		[self _sendAsynchronousRequest:request session:session];

		return nil;
	}
	else {
		NSHTTPURLResponse *response;

		NSData *data = [NSURLConnection sendSynchronousRequest:request
			returningResponse:&response error:error];

		if (*error) {
			return nil;
		}

		return [self _handleServerException:data response:response error:error];
	}
}

+ (NSMutableURLRequest *)_getRequest:(LRSession *)session
		commands:(NSArray *)commands error:(NSError **)error {

	NSURL *URL = [self _getURL:session];

	NSMutableURLRequest *request =
		[[NSMutableURLRequest alloc] initWithURL:URL];

	NSString *credentials = [NSString stringWithFormat:@"%@:%@",
		session.username, session.password];

	NSData *auth = [credentials dataUsingEncoding:NSUTF8StringEncoding];
	NSString *encoded = [auth base64Encoding];
	NSString *authHeader = [NSString stringWithFormat:@"Basic %@", encoded];
	NSData *body = [NSJSONSerialization dataWithJSONObject:commands options:0
		error:error];

	[request setHTTPMethod:POST];
	[request setTimeoutInterval:session.connectionTimeout];
	[request setValue:authHeader forHTTPHeaderField:@"Authorization"];
	[request setValue:@"application/json; charset=utf-8"
		forHTTPHeaderField:@"Content-Type"];

	[request setHTTPBody:body];

	return request;
}

+ (NSURL *)_getURL:(LRSession *)session {
	NSString *server = session.server;

	if (![server hasSuffix:@"/"]) {
		server = [NSString stringWithFormat:@"%@/", server];
	}

	NSString *URL = [NSString stringWithFormat:@"%@api/jsonws/invoke", server];

	return [NSURL URLWithString:URL];
}

+ (NSArray *)_handleServerException:(NSData *)data
		response:(NSHTTPURLResponse *)response error:(NSError **) error {

	int statusCode = [response statusCode];

	if (statusCode == STATUS_UNAUTHORIZED) {
		NSDictionary *userInfo = @{
		   NSLocalizedDescriptionKey: @"wrong-credentials"
		};

		*error = [NSError errorWithDomain:ERROR_DOMAIN code:STATUS_UNAUTHORIZED
			userInfo:userInfo];

		return nil;
	}

	if (statusCode != STATUS_OK) {
		NSDictionary *userInfo = @{
			NSLocalizedDescriptionKey: @"server-error"
		};

		*error = [NSError errorWithDomain:ERROR_DOMAIN code:statusCode
			userInfo:userInfo];

		return nil;
	}

	id jsonArray = [NSJSONSerialization JSONObjectWithData:data options:0
		error:error];

	if (*error) {
		return nil;
	}

	if ([jsonArray isKindOfClass:[NSDictionary class]]) {
		NSString *message = [jsonArray objectForKey:@"exception"];

		if (message) {
			NSDictionary *userInfo = @{
				NSLocalizedDescriptionKey: message
			};

			*error = [NSError errorWithDomain:ERROR_DOMAIN code:-1
				userInfo:userInfo];

			return nil;
		}
	}

	return jsonArray;
}

+ (void)_sendAsynchronousRequest:(NSURLRequest *)request
		session:(LRSession *)session {

	id<LRCallback> callback = session.callback;

	NSOperationQueue *queue = [[NSOperationQueue alloc] init];

	LRHandler handler = ^(NSURLResponse *r, NSData *d, NSError *e) {
		dispatch_async(dispatch_get_main_queue(), ^{
			if (e) {
				[callback onFailure:e];
			}
			else {
				NSError *serverError;

				NSArray *jsonArray = [self _handleServerException:d
					response:(NSHTTPURLResponse *)r error:&serverError];

				if (serverError) {
					[callback onFailure:serverError];

					return;
				}

				if ([session isKindOfClass:[LRBatchSession class]]) {
					[callback onSuccess:jsonArray];
				}
				else {
					[callback onSuccess:[jsonArray objectAtIndex:0]];
				}
			}
		});
	};

	[NSURLConnection sendAsynchronousRequest:request queue:queue
		completionHandler:handler];
}

@end