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

#import "BaseTest.h"
#import "LRSession.h"

NSString *const SERVER = @"http://my-portal:8080";
NSString *const USERNAME = @"test@liferay.com";
NSString *const PASSWORD = @"test";

/**
 * @author Jose M. Navarro
 */
@interface SecureStoreCredentialTest : BaseTest

@property (nonatomic, strong) LRSession *session;

@end

@implementation SecureStoreCredentialTest

- (void)testStoreCredential {
	self.session.username = nil;
	self.session.password = nil;
	XCTAssertFalse([self.session storeCredential]);

	self.session.username = nil;
	self.session.password = PASSWORD;
	XCTAssertFalse([self.session storeCredential]);

	self.session.username = USERNAME;
	self.session.password = nil;
	XCTAssertFalse([self.session storeCredential]);

	self.session.username = USERNAME;
	self.session.password = PASSWORD;
	XCTAssertTrue([self.session storeCredential]);
}

- (void)testLoadCredential {
	XCTAssertFalse([self.session loadCredential]);

	self.session.username = USERNAME;
	self.session.password = PASSWORD;
	XCTAssertTrue([self.session storeCredential]);

	self.session = [[LRSession alloc] initWithServer:SERVER];
	XCTAssertTrue([self.session loadCredential]);

	XCTAssertEqualObjects(self.session.username, USERNAME);
	XCTAssertEqualObjects(self.session.password, PASSWORD);
}

- (void)testRemoveStoredCredential {
	XCTAssertFalse([self.session removeStoredCredential]);

	self.session.username = USERNAME;
	self.session.password = PASSWORD;
	XCTAssertTrue([self.session storeCredential]);

	XCTAssertTrue([self.session removeStoredCredential]);

	self.session = [[LRSession alloc] initWithServer:SERVER];
	XCTAssertFalse([self.session loadCredential]);
}

- (void)setUp {
	[super setUp];

	self.session = [[LRSession alloc] initWithServer:SERVER];

	[self.session removeStoredCredential];
}

@end