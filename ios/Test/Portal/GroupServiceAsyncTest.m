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

#import "GroupServiceAsyncTest.h"

#import "LRGroupService_v62.h"

/**
 * @author Bruno Farache
 */
@implementation GroupServiceAsyncTest

- (void)onFailure:(NSError *)error {
	self.error = error;
	[self.monitor signal];
}

- (void)onSuccess:(NSArray *)groups {
	self.groups = groups;
	[self.monitor signal];
}

- (void)testGetUserSites {
	self.monitor = [TRVSMonitor monitor];

	LRSession *session = [[LRSession alloc] init:self.session];
	[session setCallback:self];

	LRGroupService_v62 *service =
		[[LRGroupService_v62 alloc] initWithSession:session];

	NSError *error;
	[service getUserSites:&error];
	[self.monitor wait];

	XCTAssertNil(error);

	[self assert:self.groups error:self.error];
}

@end