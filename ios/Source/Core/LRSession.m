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
#import "LRSession.h"

static const int _DEFAULT_CONNECTION_TIMEOUT = 15;
static NSOperationQueue *_QUEUE;

/**
 * @author Bruno Farache
 */
@implementation LRSession

+ (void)initialize {
	if (self == [LRSession self]) {
		_QUEUE = [[NSOperationQueue alloc] init];

		[_QUEUE setName:@"com.liferay.mobile.LRSessionQueue"];
		[_QUEUE setMaxConcurrentOperationCount:1];
	}
}

- (id)init:(LRSession *)session {
	return [self init:session.server username:session.username
		password:session.password connectionTimeout:session.connectionTimeout
		callback:session.callback];
}

- (id)init:(NSString *)server username:(NSString *)username
  		password:(NSString *)password {

	return [self init:server username:username password:password callback:nil];
}

- (id)init:(NSString *)server username:(NSString *)username
		password:(NSString *)password callback:(id<LRCallback>)callback {

	return [self init:server username:username password:password
		connectionTimeout:_DEFAULT_CONNECTION_TIMEOUT callback:callback];
}

- (id)init:(NSString *)server username:(NSString *)username
		password:(NSString *)password connectionTimeout:(int)connectionTimeout
		callback:(id<LRCallback>)callback {

	return [self init:server username:username password:password
		connectionTimeout:connectionTimeout callback:callback queue:nil];
}

- (id)init:(NSString *)server username:(NSString *)username
		password:(NSString *)password connectionTimeout:(int)connectionTimeout
		callback:(id<LRCallback>)callback queue:(NSOperationQueue *)queue {

	self = [super init];

	if (self) {
		self.server = server;
		self.username = username;
		self.password = password;
		self.connectionTimeout = connectionTimeout;
		self.callback = callback;
		self.queue = queue;
	}

	return self;
}

- (id)invoke:(NSDictionary *)command error:(NSError **)error {
	NSArray *json = [LRHttpUtil post:self command:command error:error];

	return [json objectAtIndex:0];
}

- (NSOperationQueue *)queue {
	if (_queue) {
		return _queue;
	}

	return _QUEUE;
}

@end