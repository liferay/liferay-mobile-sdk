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
#import "LRUserService_v7.h"
#import "LROAuth2SignIn.h"
#import "TRVSMonitor.h"

@interface OAuth2AuthenticationTest : BaseTest

@property (nonatomic, strong) NSError *error;
@property (nonatomic, strong) LRSession *oauthSession;
@property (nonatomic) TRVSMonitor *monitor;

@end

static NSString *const OAuth2Server = @"https://liferay-oauth2.wedeploy.io";
static NSString *const OAuth2password = @"";

/**
 * @author Victor Galán
 */
@implementation OAuth2AuthenticationTest

- (void)testOAuth2SignInWithPassword {
	LRSession *session = [[LRSession alloc] initWithServer:OAuth2Server];

	self.monitor = [TRVSMonitor monitor];

	[LROAuth2SignIn signInWithUsername:@"test@liferay.com" password:OAuth2password session:session clientId:@"12345" clientSecret:@"12345" scopes:@[] callback:^(LRSession *oauthSession, NSError *error) {
		self.oauthSession = oauthSession;
		self.error = error;

		[self.monitor signal];
	} error:nil];

	[self.monitor wait];

	XCTAssertNotNil(self.oauthSession.authentication);
	XCTAssertNil(self.error);

	LRUserService_v7 *service = [[LRUserService_v7 alloc] initWithSession:self.oauthSession];
	NSError *error;
	NSDictionary *userAttrs = [service getCurrentUser:&error];

	XCTAssertNotNil(userAttrs);
	XCTAssertNil(error);
}

- (void)testOAuth2SignInWithClientCredentials {
	LRSession *session = [[LRSession alloc] initWithServer:OAuth2Server];

	self.monitor = [TRVSMonitor monitor];

	[LROAuth2SignIn clientCredentialsSignInWithSession:session clientId:@"12345" clientSecret:@"12345" scopes:@[] callback:^(LRSession *oauthSession, NSError *error) {
		self.oauthSession = oauthSession;
		self.error = error;

		[self.monitor signal];
	} error:nil];

	[self.monitor wait];

	XCTAssertNotNil(self.oauthSession.authentication);
	XCTAssertNil(self.error);

	LRUserService_v7 *service = [[LRUserService_v7 alloc] initWithSession:self.oauthSession];
	NSError *error;
	NSDictionary *userAttrs = [service getCurrentUser:&error];

	XCTAssertNotNil(userAttrs);
	XCTAssertNil(error);
}

@end
