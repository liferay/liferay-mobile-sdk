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

#import "LRBatchSession.h"

NSString *const LR_ERROR_DOMAIN = @"com.liferay.mobile";
NSInteger const LR_ERROR_CODE_SERVER_EXCEPTION = -1;
NSInteger const LR_ERROR_CODE_PARSE = -2;
NSString *const LR_ERROR_EXCEPTION_PARSE = @"com.liferay.ParseException";
NSString *const LR_GET = @"GET";
NSString *const LR_HEAD = @"HEAD";
NSString *const LR_IF_MODIFIED_SINCE = @"If-Modified-Since";
NSString *const LR_LAST_MODIFIED = @"Last-Modified";
NSString *const LR_POST = @"POST";
const int LR_STATUS_OK = 200;
const int LR_STATUS_UNAUTHORIZED = 401;

/**
 * @author Bruno Farache
 */
@implementation LRHttpUtil

+ (NSURL *)getURL:(LRSession *)session path:(NSString *)path {
	NSString *server = session.server;

	if (![server hasSuffix:@"/"]) {
		server = [NSString stringWithFormat:@"%@/", server];
	}

	NSString *URL = [NSString stringWithFormat:@"%@api/jsonws%@", server, path];

	return [NSURL URLWithString:URL];
}

+ (id)handleServerException:(id)data response:(NSHTTPURLResponse *)response
		error:(NSError **)error {

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

	id json = data;

	if ([data isKindOfClass:[NSData class]]) {
		NSError *parseError;

		json = [NSJSONSerialization JSONObjectWithData:data options:0
			error:&parseError];

		if (parseError) {
			NSDictionary *userInfo = @{
				NSLocalizedDescriptionKey:@"Fatal error happened processing \
					server data",
				NSLocalizedFailureReasonErrorKey:LR_ERROR_EXCEPTION_PARSE,
				NSUnderlyingErrorKey:parseError
			};

			*error = [NSError errorWithDomain:LR_ERROR_DOMAIN
				code:LR_ERROR_CODE_PARSE userInfo:userInfo];

			return nil;
		}
	}

			return nil;
		}
	}

	return json;
}

+ (NSArray *)post:(LRSession *)session command:(NSDictionary *)command
		error:(NSError **)error {

	NSArray *commands = [NSArray arrayWithObject:command];

	return [self post:session commands:commands error:error];
}

+ (NSArray *)post:(LRSession *)session commands:(NSArray *)commands
		error:(NSError **)error {

	NSURL *URL = [self getURL:session path:@"/invoke"];

	NSMutableURLRequest *request = [[NSMutableURLRequest alloc]
		initWithURL:URL];

	NSData *body = [NSJSONSerialization dataWithJSONObject:commands options:0
		error:error];

	[request setHTTPBody:body];
	[request setHTTPMethod:LR_POST];
	[request setValue:@"application/json; charset=utf-8"
		forHTTPHeaderField:@"Content-Type"];

	[self setAuthHeader:session request:request];

	return [self _sendRequest:request session:session error:error];
}

+ (void)setAuthHeader:(LRSession *)session
		request:(NSMutableURLRequest *)request {

	NSString *authHeader = [session getAuthHeader];

	if (authHeader) {
		[request setValue:authHeader forHTTPHeaderField:@"Authorization"];
	}

	[request setTimeoutInterval:session.connectionTimeout];
}

+ (id)_sendRequest:(NSMutableURLRequest *)request session:(LRSession *)session
		error:(NSError **)error {

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

		return [self handleServerException:data response:response error:error];
	}
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

				id json = [self handleServerException:d
					response:(NSHTTPURLResponse *)r error:&serverError];

				if (serverError) {
					[callback onFailure:serverError];

					return;
				}

				if ([session isKindOfClass:[LRBatchSession class]]) {
					[callback onSuccess:json];
				}
				else if ([json isKindOfClass:[NSArray class]]){
					[callback onSuccess:[json objectAtIndex:0]];
				}
			}
		});
	};

	[NSURLConnection sendAsynchronousRequest:request queue:session.queue
		completionHandler:handler];
}

@end