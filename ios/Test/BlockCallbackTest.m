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

#import "GroupServiceTest.h"
#import "LRGroupService_v62.h"
#import "TRVSMonitor.h"

/**
 * @author Bruno Farache
 */
@interface BlockCallbackTest : GroupServiceTest
@end

@implementation BlockCallbackTest

- (void)testGetUserSites {
	TRVSMonitor *monitor = [TRVSMonitor monitor];
	__block NSArray *groups;
	__block NSError *error;

	LRSession *session = [[LRSession alloc] initWithSession:self.session];

	[session
		onSuccess:^(id result) {
			XCTAssertTrue([NSThread isMainThread]);
			groups = result;
			[monitor signal];
		}
		onFailure:^(NSError *e) {
			error = e;
			[monitor signal];
		}
	];

	LRGroupService_v62 *service = [[LRGroupService_v62 alloc]
		initWithSession:session];

	[service getUserSites:&error];
	[monitor wait];

	[self assert:groups error:error];
}

@end