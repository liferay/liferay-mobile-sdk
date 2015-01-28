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
#import "LRServiceFactory.h"

/**
 * @author Bruno Farache
 */
@interface ServiceFactoryTest : GroupServiceTest
@end

@implementation ServiceFactoryTest

- (void)testGetUserSites {
	Class clazz = [LRGroupService_v62 class];

	LRGroupService_v62 *service = (LRGroupService_v62 *)[LRServiceFactory
		getService:clazz session:self.session];

	NSError *error;
	NSArray *groups = [service getUserSites:&error];

	[self assert:groups error:error];
}

@end