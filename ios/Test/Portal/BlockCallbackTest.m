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

#import "GroupServiceTest.h"
#import "LRGroupService_v62.h"
#import "TRVSMonitor.h"

/**
 * @author Bruno Farache
 */
@interface BlockCallbackTest : GroupServiceTest

@property (nonatomic, strong) NSError *error;
@property (nonatomic, strong) NSArray *groups;
@property (nonatomic, strong) TRVSMonitor *monitor;

@end

@implementation BlockCallbackTest

- (void)testGetUserSites {
	self.monitor = [TRVSMonitor monitor];

	LRSession *session = [[LRSession alloc] initWithSession:self.session];

	[session
		onSuccess:^(id groups) {
			[self setGroups:groups];
			[self.monitor signal];
		}
		onFailure:^(NSError *error) {
			[self setError:error];
			[self.monitor signal];
		}
	];

	LRGroupService_v62 *service = [[LRGroupService_v62 alloc]
		initWithSession:session];

	NSError *error;
	[service getUserSites:&error];
	[self.monitor wait];

	XCTAssertNil(error);

	[self assert:self.groups error:self.error];
}

@end