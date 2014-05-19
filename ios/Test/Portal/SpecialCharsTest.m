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

#import "SpecialCharsTest.h"

/**
 * @author Bruno Farache
 */
@implementation SpecialCharsTest

- (void)testGetEntriesDescending {
	NSString *name = @"entry áéíòúñ";

	NSError *error;
	NSDictionary *entry = [self.serviceContextTest addBookmarkEntry:name
		serviceContext:nil error:error];

	XCTAssertNil(error);
	XCTAssertEqualObjects(name, entry[@"name"]);

	[self.serviceContextTest deleteBookmarkEntry:entry error:error];
}

- (void)setUp {
	[super setUp];

	self.serviceContextTest = [[ServiceContextTest alloc] init];
	[self.serviceContextTest setUp];
}

@end