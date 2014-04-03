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

#import "LRPortletService_v62.h"
#import "PortletServiceTest.h"

/**
 * @author Bruno Farache
 */
@implementation PortletServiceTest

- (void)testGetUserSitesGroups {
	LRPortletService_v62 *service =
		[[LRPortletService_v62 alloc] initWithSession:self.session];

	NSError *error;
	NSArray *array = [service getWarPortlets:&error];

	XCTAssertNil(error);
	XCTAssertNotNil(array);
	XCTAssertTrue([array count] > 0);
}

@end