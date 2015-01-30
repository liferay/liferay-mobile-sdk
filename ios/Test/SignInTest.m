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
#import "LRSignIn.h"
#import "TRVSMonitor.h"

/**
 * @author Bruno Farache
 */
@interface SignInTest : BaseTest
@end

@implementation SignInTest

- (void)testSignInFailure {
	TRVSMonitor *monitor = [TRVSMonitor monitor];
	__block NSDictionary *user;
	__block NSError *error;

	LRSession *session = [[LRSession alloc] initWithSession:self.session];
	LRBasicAuthentication *authentication =
		(LRBasicAuthentication *)session.authentication;

	[authentication setPassword:@"wrong-password"];

	[session
		onSuccess:^(id result) {
			user = result;
			[monitor signal];
		}
	 	onFailure:^(NSError *e) {
			error = e;
			[monitor signal];
		}
	];

	[LRSignIn signInWithSession:session callback:session.callback error:&error];
	[monitor wait];

	XCTAssertNotNil(error);
	XCTAssertNil(user);

	XCTAssertEqualObjects(
		error.localizedDescription, @"Authenticated access required");
}

- (void)testSignInSuccess {
	TRVSMonitor *monitor = [TRVSMonitor monitor];
	__block NSDictionary *user;
	__block NSError *error;

	LRSession *session = [[LRSession alloc] initWithSession:self.session];

	[session
		onSuccess:^(id result) {
			user = result;
			[monitor signal];
		}
		onFailure:^(NSError *e) {
			error = e;
			[monitor signal];
		}
	];

	[LRSignIn signInWithSession:session callback:session.callback error:&error];
	[monitor wait];

	XCTAssertNil(error);
	XCTAssertNotNil(user);

	LRBasicAuthentication *authentication =
		(LRBasicAuthentication *)session.authentication;

	XCTAssertEqualObjects(user[@"emailAddress"], authentication.username);
}

@end