/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

#import "HttpUtil.h"

/**
 * author Bruno Farache
 */
@implementation HttpUtil

+ (NSMutableURLRequest *)getRequest:(Session *)session
		commands:(NSArray *)commands error:(NSError **)error {

	NSURL *URL = [self getURL:session];

	NSMutableURLRequest *request =
		[[NSMutableURLRequest alloc] initWithURL:URL];

	NSString *credentials = [NSString stringWithFormat:@"%@:%@",
		session.username, session.password];

	NSData *auth = [credentials dataUsingEncoding:NSUTF8StringEncoding];
	NSString *encoded = [auth base64EncodedStringWithOptions:0];
	NSString *authHeader = [NSString stringWithFormat:@"Basic %@", encoded];
	NSData *body = [NSJSONSerialization dataWithJSONObject:commands options:0
		error:error];

	[request setHTTPMethod:@"POST"];
	[request setTimeoutInterval:session.connectionTimeout];
	[request setValue:authHeader forHTTPHeaderField:@"Authorization"];
	[request setValue:@"application/json; charset=utf-8"
		forHTTPHeaderField:@"Content-Type"];

	[request setHTTPBody:body];

	return request;
}

+ (NSURL *)getURL:(Session *)session {
	NSString *URL =
		[NSString stringWithFormat:@"%@/api/jsonws/invoke", session.server];

	return [NSURL URLWithString:URL];
}

+ (NSArray *)post:(Session *)session command:(NSDictionary *)command
		error:(NSError **)error {

	NSArray *commands = [NSArray arrayWithObject:command];

	return [self post:session commands:commands error:error];
}

+ (NSArray *)post:(Session *)session commands:(NSArray *)commands
		error:(NSError **)error {

	NSURLRequest *request = [self getRequest:session commands:commands error:error];

	if (*error) {
		return nil;
	}

	id<Callback> callback = session.callback;

	if (callback) {
		NSOperationQueue *queue = [[NSOperationQueue alloc] init];

		Handler handler = ^(NSURLResponse *r, NSData *d, NSError *e) {
			if (e) {
				[callback onFailure:e];
			}
			else {
				NSError *serverError;

				NSArray *json =
					[self handleServerException:d
						response:(NSHTTPURLResponse *)r error:&serverError];

				if (serverError) {
					[callback onFailure:serverError];

					return;
				}

				[callback onSuccess:[json objectAtIndex:0]];
			}
		};

		[NSURLConnection sendAsynchronousRequest:request queue:queue
			completionHandler:handler];

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

+ (NSArray *)handleServerException:(NSData *)data
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
			NSLocalizedDescriptionKey: @"http-error"
		};

		*error = [NSError errorWithDomain:ERROR_DOMAIN code:statusCode
			userInfo:userInfo];

		return nil;
	}

	id jsonObj = [NSJSONSerialization JSONObjectWithData:data options:0
		error:error];

	if (*error) {
		return nil;
	}

	if ([jsonObj isKindOfClass:[NSDictionary class]]) {
		NSString *message = [jsonObj objectForKey:@"exception"];

		if (message) {
			NSDictionary *userInfo = @{
				NSLocalizedDescriptionKey: message
			};

			*error = [NSError errorWithDomain:ERROR_DOMAIN code:-1
				userInfo:userInfo];

			return nil;
		}
	}

	return jsonObj;
}

@end