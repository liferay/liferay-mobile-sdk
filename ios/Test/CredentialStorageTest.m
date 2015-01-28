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
#import "LRCredentialStorage.h"

/**
 * @author Jose M. Navarro
 * @author Bruno Farache
 */
@interface CredentialStorageTest : BaseTest
@end

@implementation CredentialStorageTest

- (void)testGetCredential {
	[self testStoreCredential];

	NSURLCredential *credential = [LRCredentialStorage getCredential];
	NSString *server = [LRCredentialStorage getServer];

	XCTAssertNotNil(credential);
	XCTAssertNotNil(server);

	XCTAssertEqualObjects(self.session.username, credential.user);
	XCTAssertEqualObjects(self.session.password, credential.password);
	XCTAssertEqualObjects(self.session.server, server);
}

- (void)testGetSession {
	[self testStoreCredential];

	LRSession *session = [LRCredentialStorage getSession];

	XCTAssertNotNil(session);

	XCTAssertEqualObjects(self.session.username, session.username);
	XCTAssertEqualObjects(self.session.password, session.password);
	XCTAssertEqualObjects(self.session.server, session.server);
}

- (void)testRemoveCredential {
	[self testStoreCredential];

	[LRCredentialStorage removeCredential];

	NSURLCredential *credential = [LRCredentialStorage getCredential];
	NSString *server = [LRCredentialStorage getServer];

	XCTAssertNil(credential);
	XCTAssertNil(server);
}

- (void)testStoreCredential {
	NSURLCredential *credential = [LRCredentialStorage
		storeCredentialForServer:self.session.server
		username:self.session.username password:self.session.password];

	NSString *server = [LRCredentialStorage getServer];

	XCTAssertEqualObjects(self.session.username, credential.user);
	XCTAssertEqualObjects(self.session.password, credential.password);
	XCTAssertEqualObjects(self.session.server, server);
}

- (void)testStoreCredentialEmpty {
	[LRCredentialStorage storeCredentialForServer:@" " username:nil
		password:@""];

	NSURLCredential *credential = [LRCredentialStorage getCredential];
	NSString *server = [LRCredentialStorage getServer];
	LRSession *session = [LRCredentialStorage getSession];

	XCTAssertNil(credential);
	XCTAssertNil(server);
	XCTAssertNil(session);
}

- (void)setUp {
	[super setUp];

	[LRCredentialStorage removeCredential];
}

@end