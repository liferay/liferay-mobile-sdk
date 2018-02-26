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

#import "BaseTest.h"

#import "LRBasicAuthentication.h"
#import "GroupServiceTest.h"
#import "LRGroupService_v7.h"
#import "LRCookieAuthentication.h"
#import "LRCookieSignIn.h"
#import "TRVSMonitor.h"

@interface CookieAuthenticationTest : GroupServiceTest <LRCookieCallback>

@property (nonatomic, strong) NSError *error;
@property (nonatomic, strong) NSArray *groups;
@property (nonatomic) TRVSMonitor *monitor;

@end

/**
 * @author Victor Galán
 */
@implementation CookieAuthenticationTest

- (void) testCookieSignInWithCookieSession {
	LRBasicAuthentication *basicAuth =
		(LRBasicAuthentication *)self.session.authentication;

	LRCookieAuthentication *auth = [[LRCookieAuthentication alloc]
		initWithAuthToken:@"" cookieHeader:@"" username:basicAuth.username
		password:basicAuth.password];

	LRSession *session = [[LRSession alloc]initWithServer:self.session.server
		authentication:auth];

	self.monitor = [TRVSMonitor monitor];

	[LRCookieSignIn signInWithSession:session callback:self error:nil];

	[self.monitor wait];
	[self assert:self.groups error:self.error];
}

- (void) onSuccess:(LRSession *)session {
	LRGroupService_v7 *service = [[LRGroupService_v7 alloc]
		initWithSession:session];

	NSError *error;
	self.groups = [service getUserSitesGroups:&error];

	[self.monitor signal];
}

- (void)onFailure:(NSError *)error {
	[self setError:error];
	[self.monitor signal];
}

@end
