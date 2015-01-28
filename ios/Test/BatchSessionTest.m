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

#import "LRBatchSession.h"
#import "GroupServiceTest.h"
#import "LRGroupService_v62.h"

/**
 * @author Bruno Farache
 */
@interface BatchSessionTest : GroupServiceTest
@end

@implementation BatchSessionTest

- (void)testBatch {
	LRBatchSession *session = [[LRBatchSession alloc]
		initWithSession:self.session];

	LRGroupService_v62 *service = [[LRGroupService_v62 alloc]
		initWithSession:session];

	NSError *error;
	[service getUserSites:&error];
	[service getUserSites:&error];

	NSArray *commands = session.commands;
	XCTAssertEqual([commands count], 2);

	NSArray *result = [session invoke:&error];

	commands = session.commands;
	XCTAssertEqual([commands count], 0);

	[self assert:result[0] error:error];
	[self assert:result[1] error:error];

	result = [session invoke:&error];

	XCTAssertNil(result);
}

@end