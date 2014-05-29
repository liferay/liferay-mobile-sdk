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

#import "AFNetworking.h"

NSString *const LR_ERROR_DOMAIN = @"com.liferay.mobile";
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

+ (NSArray *)post:(LRSession *)session command:(NSDictionary *)command
		error:(NSError **)error {

	NSArray *commands = [NSArray arrayWithObject:command];

	return [self post:session commands:commands error:error];
}

+ (NSArray *)post:(LRSession *)session commands:(NSArray *)commands
		error:(NSError **)error {

	NSURL *URL = [self _getURL:session path:@"/invoke"];

	NSMutableURLRequest *request = [[NSMutableURLRequest alloc]
		initWithURL:URL];

	NSData *body = [NSJSONSerialization dataWithJSONObject:commands options:0
		error:error];

	[request setValue:@"application/json; charset=utf-8"
		forHTTPHeaderField:@"Content-Type"];

	[request setHTTPBody:body];

	return [self _sendRequest:request session:session error:error];
}

+ (id)upload:(LRSession *)session command:(NSDictionary *)command
		error:(NSError **)error {

	NSArray *keys = [command allKeys];

	if ([keys count] > 1) {
		return nil;
	}

	NSString *path = keys[0];
	NSString *URL = [[self _getURL:session path:path] absoluteString];

	NSMutableDictionary *parameters = [NSMutableDictionary
		dictionaryWithDictionary:[command valueForKey:path]];

	NSData *data = [self _removeData:parameters];

	AFHTTPRequestOperationManager *manager =
		[AFHTTPRequestOperationManager manager];

	[manager.requestSerializer
		setAuthorizationHeaderFieldWithUsername:session.username
		password:session.password];

	[manager POST:URL parameters:parameters constructingBodyWithBlock:
		^(id<AFMultipartFormData> formData) {
			[formData  appendPartWithFileData:data name:@"file" fileName:@"test.properties" mimeType:@"text/plain"];
		}
		success:^(AFHTTPRequestOperation *operation, id entry) {
			[session.callback onSuccess:entry];
		}
		failure:^(AFHTTPRequestOperation *operation, NSError *error) {
			[session.callback onFailure:error];
		}
	];

	return nil;
}

+ (id)_sendRequest:(NSMutableURLRequest *)request session:(LRSession *)session
		error:(NSError **)error {

	[self _setAuthHeader:session request:request error:error];

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

+ (void)_setAuthHeader:(LRSession *)session
		request:(NSMutableURLRequest *)request error:(NSError **)error {

	NSString *credentials = [NSString stringWithFormat:@"%@:%@",
		session.username, session.password];

	NSData *auth = [credentials dataUsingEncoding:NSUTF8StringEncoding];
	NSString *encoded = [auth base64Encoding];
	NSString *authHeader = [NSString stringWithFormat:@"Basic %@", encoded];

	[request setHTTPMethod:LR_POST];
	[request setValue:authHeader forHTTPHeaderField:@"Authorization"];
	[request setTimeoutInterval:session.connectionTimeout];
}

+ (NSURL *)_getURL:(LRSession *)session path:(NSString *)path {
	NSString *server = session.server;

	if (![server hasSuffix:@"/"]) {
		server = [NSString stringWithFormat:@"%@/", server];
	}

	NSString *URL = [NSString stringWithFormat:@"%@api/jsonws%@", server, path];

	return [NSURL URLWithString:URL];
}

+ (id)_handleServerException:(NSData *)data
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

	id json = [NSJSONSerialization JSONObjectWithData:data options:0
		error:error];

	if (*error) {
		return nil;
	}

	if ([json isKindOfClass:[NSDictionary class]]) {
		NSString *message = [json objectForKey:@"exception"];

		if (message) {
			NSDictionary *userInfo = @{
				NSLocalizedDescriptionKey: message
			};

			*error = [NSError errorWithDomain:LR_ERROR_DOMAIN code:-1
				userInfo:userInfo];

			return nil;
		}
	}

	return json;
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

				id json = [self _handleServerException:d
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

+ (NSData *)_removeData:(NSMutableDictionary *)parameters {
	for (NSString *key in parameters) {
		id parameter = [parameters objectForKey:key];

		if ([parameter isKindOfClass:[NSData class]]) {
			[parameters removeObjectForKey:key];

			return parameter;
		}
	}

	return nil;
}

@end