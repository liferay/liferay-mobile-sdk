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

NSString *const LR_ERROR_DOMAIN = @"com.liferay.mobile";
NSString *const LR_GET = @"GET";
NSString *const LR_HEAD = @"HEAD";
NSString *const LR_IF_MODIFIED_SINCE = @"If-Modified-Since";
NSString *const LR_LAST_MODIFIED = @"Last-Modified";
NSString *const LR_POST = @"POST";
const int LR_STATUS_OK = 200;
const int LR_STATUS_UNAUTHORIZED = 401;
const int LR_UNKNOWN_VERSION = -1;
const int LR_VERSION_6_2 = 6200;

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

	[request setHTTPMethod:LR_HEAD];

	NSHTTPURLResponse *response;

	[NSURLConnection sendSynchronousRequest:request returningResponse:&response
		error:error];

	if (*error) {
		return LR_UNKNOWN_VERSION;
	}

	NSDictionary *headers = [response allHeaderFields];
	NSString *portalHeader = [headers objectForKey:@"Liferay-Portal"];

	if (!portalHeader) {
		version = @(LR_UNKNOWN_VERSION);

		[_versions setObject:version forKey:URL];

		return [version intValue];
	}

	NSRange buildRange;
	NSRange searchRange = NSMakeRange(0, [portalHeader length]);

	buildRange =
		[portalHeader rangeOfString:@"Build" options:NSCaseInsensitiveSearch
			range:searchRange];

	if (buildRange.location == NSNotFound) {
		version = @(LR_UNKNOWN_VERSION);
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

	[request setHTTPMethod:LR_POST];
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
		response:(NSHTTPURLResponse *)response error:(NSError **)error {

	int statusCode = [response statusCode];

	if (statusCode == LR_STATUS_UNAUTHORIZED) {
		NSDictionary *userInfo = @{
			NSLocalizedDescriptionKey: @"wrong-credentials"
		};

		*error = [NSError errorWithDomain:LR_ERROR_DOMAIN
			code:LR_STATUS_UNAUTHORIZED userInfo:userInfo];

		return nil;
	}

	if (statusCode != LR_STATUS_OK) {
		NSDictionary *userInfo = @{
			NSLocalizedDescriptionKey: @"server-error"
		};

		*error = [NSError errorWithDomain:LR_ERROR_DOMAIN code:statusCode
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

			*error = [NSError errorWithDomain:LR_ERROR_DOMAIN code:-1
				userInfo:userInfo];

			return nil;
		}
	}

	return jsonArray;
}

+ (void)_sendAsynchronousRequest:(NSURLRequest *)request
		session:(LRSession *)session {

	id<LRCallback> callback = session.callback;

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

	[NSURLConnection sendAsynchronousRequest:request queue:session.queue
		completionHandler:handler];
}

@end