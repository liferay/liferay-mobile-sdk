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

+ (NSMutableURLRequest *)getRequest:(id<Session>)session
		commands:(NSArray *)commands {

	NSURL *URL = [self getURL:session];

	NSMutableURLRequest *request =
		[[NSMutableURLRequest alloc] initWithURL:URL];

	NSString *credentials = [NSString stringWithFormat:@"%@:%@",
		session.username, session.password];

	NSData *auth = [credentials dataUsingEncoding:NSUTF8StringEncoding];
	NSString *encoded = [auth base64EncodedStringWithOptions:0];
	NSString *authHeader = [NSString stringWithFormat:@"Basic %@", encoded];
	NSError *error;
	NSData *body = [NSJSONSerialization dataWithJSONObject:commands options:0
		error:&error];

	[request setHTTPMethod:@"POST"];
	[request setTimeoutInterval:session.connectionTimeout];
	[request setValue:authHeader forHTTPHeaderField:@"Authorization"];
	[request setValue:@"application/json; charset=utf-8"
		forHTTPHeaderField:@"Content-Type"];

	[request setHTTPBody:body];

	return request;
}

+ (NSURL *)getURL:(id<Session>)session {
	NSString *URL =
		[NSString stringWithFormat:@"%@/api/jsonws/invoke", session.server];

	return [NSURL URLWithString:URL];
}

+ (NSArray *)post:(id<Session>)session command:(NSDictionary *)command {
	NSArray *commands = [NSArray arrayWithObject:command];

	return [self post:session commands:commands];
}

+ (NSArray *)post:(id<Session>)session commands:(NSArray *)commands {
	NSURLRequest *request = [self getRequest:session commands:commands];

	NSURLResponse *response;
	__block NSError *error;
	id<Callback> callback = session.callback;

	if (callback) {
		NSOperationQueue *queue = [[NSOperationQueue alloc] init];

		Handler handler = ^(NSURLResponse *r, NSData *d, NSError *e) {
			if (e) {
				[callback onFailure:e];
			}
			else {
				NSArray *json = [NSJSONSerialization JSONObjectWithData:d
					options:0 error:&error];

				[callback onSuccess:[json objectAtIndex:0]];
			}
		};

		[NSURLConnection sendAsynchronousRequest:request queue:queue
			completionHandler:handler];

		return nil;
	}
	else {
		NSData *data = [NSURLConnection sendSynchronousRequest:request
			returningResponse:&response error:&error];

		NSArray *json = [NSJSONSerialization JSONObjectWithData:data options:0
			error:&error];

		return json;
	}
}

@end