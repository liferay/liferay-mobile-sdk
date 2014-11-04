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
#import "LRResponseParser.h"

NSString *const LR_GET = @"GET";
NSString *const LR_HEAD = @"HEAD";
NSString *const LR_POST = @"POST";

static NSString *_JSONWS_PATH = @"api/jsonws";

/**
 * @author Bruno Farache
 */
@implementation LRHttpUtil

typedef void (^LRHandler)(NSURLResponse *response, NSData *data, NSError *error);

+ (NSURL *)getURL:(LRSession *)session path:(NSString *)path {
	NSString *server = session.server;

	if (![server hasSuffix:@"/"]) {
		server = [NSString stringWithFormat:@"%@/", server];
	}

	NSString *URL = [NSString stringWithFormat:@"%@%@%@", server, _JSONWS_PATH,
		path];

	return [NSURL URLWithString:URL];
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

+ (void)setJSONWSPath:(NSString *)path {
	_JSONWS_PATH = path;
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

		long statusCode = [response statusCode];

		return [LRResponseParser parse:data statusCode:statusCode error:error];
	}
}

+ (void)_sendAsynchronousRequest:(NSURLRequest *)request
		session:(LRSession *)session {

	id<LRCallback> callback = session.callback;

	LRHandler handler = ^(NSURLResponse *response, NSData *data, NSError *e) {
		dispatch_async(dispatch_get_main_queue(), ^{
			if (e) {
				[callback onFailure:e];
			}
			else {
				NSError *serverError;

				long statusCode = [(NSHTTPURLResponse *)response statusCode];

				id json = [LRResponseParser parse:data statusCode:statusCode
					error:&serverError];

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