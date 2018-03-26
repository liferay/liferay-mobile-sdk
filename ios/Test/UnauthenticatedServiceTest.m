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
#import "LRGroupService_v7.h"

/**
 * @author Jose M. Navarro
 */
@interface UnauthenticatedServiceTest : BaseTest
@end

@implementation UnauthenticatedServiceTest

- (void)testUnauthenticatedGetUserSites {
	LRSession *session = [[LRSession alloc]
		initWithServer:self.session.server];

	LRGroupService_v7 *service = [[LRGroupService_v7 alloc]
		initWithSession:session];

	NSError *error;

	[service getUserSitesGroups:&error];

	XCTAssertEqual(2, [error code]);
	XCTAssertEqualObjects(@"Access denied to com.liferay.portal.kernel.service.GroupService#getUserSitesGroups",
		[error localizedDescription]);
}

@end
