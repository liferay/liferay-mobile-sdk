/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

#import "LRCookieAuthentication.h"

/**
 * @author Victor Galán
 */
@implementation LRCookieAuthentication

- (id)initWithAuthToken:(NSString *)authToken
		cookieHeader:(NSString *)cookieHeader
		username:(NSString *)username
		password:(NSString *) password {

	return [self initWithAuthToken:authToken
			cookieHeader:cookieHeader
			username:username password:password
			shouldHandleExpiration:YES
			cookieExpirationTime:(15 * 60)
			lastCookieRefresh:0];
}

- (id)initWithAuthToken:(NSString *)authToken
		cookieHeader:(NSString *)cookieHeader
		username:(NSString *)username
		password:(NSString *)password
 		shouldHandleExpiration:(BOOL)shouldHandleExpiration
		cookieExpirationTime:(double)cookieExpirationTime
		lastCookieRefresh:(NSTimeInterval)lastCookieRefresh {

	self = [super init];

	if (self) {
		self.authToken = authToken;
		self.cookieHeader = cookieHeader;
		self.username = username;
		self.password = password;

		self.lastCookieRefresh = lastCookieRefresh;
		self.cookieExpirationTime = cookieExpirationTime;
		self.shouldHandleExpiration = shouldHandleExpiration;
	}

	return self;
}

-(void)authenticate:(NSMutableURLRequest *)request {
	NSString *value = [NSString
		stringWithFormat:@"COOKIE_SUPPORT=true; %@", self.cookieHeader];

	[request setValue:value forHTTPHeaderField:@"Cookie"];
	[request setValue:self.authToken forHTTPHeaderField:@"X-CSRF-Token"];
}

@end
