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
#import "LRGroupService_v7.h"

/**
 * @author Jose M. Navarro
 */
@implementation GroupServiceTest

- (void)testGetUserSites {
	LRGroupService_v7 *service = [[LRGroupService_v7 alloc]
		initWithSession:self.session];

	NSError *error;
	NSArray *groups = [service getUserSitesGroups:&error];

	[self assert:groups error:error];
}

- (void)assert:(NSArray *)groups error:(NSError *)error {
	XCTAssertNil(error);
	XCTAssertEqual(3, [groups count]);

	NSDictionary *group = groups[0];
	XCTAssertEqualObjects(@"/test", group[@"friendlyURL"]);

	group = groups[1];
	XCTAssertEqualObjects(@"/global", group[@"friendlyURL"]);

	group = groups[2];
	XCTAssertEqualObjects(@"/guest", group[@"friendlyURL"]);
}

@end