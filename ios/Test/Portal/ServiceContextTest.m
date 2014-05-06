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

#import "ServiceContextTest.h"
#import "LRBookmarksEntryService_v62.h"
#import "LRJSONObjectWrapper.h"

/**
 * @author Bruno Farache
 */
@implementation ServiceContextTest

- (void)testAddBookmarkEntry {
	LRBookmarksEntryService_v62 *service =
		[[LRBookmarksEntryService_v62 alloc] initWithSession:self.session];

	long long groupId = [self.settings[@"repositoryId"] longLongValue];

	NSString *uuid = [[NSUUID UUID] UUIDString];

	NSDictionary *jsonObject = @{
		@"uuid": uuid
	};

	LRJSONObjectWrapper *serviceContext = [[LRJSONObjectWrapper alloc]
		initWithJSONObject:jsonObject];

	NSError *error;

	NSDictionary *result = [service addEntryWithGroupId:groupId folderId:0
		name:@"test" url:@"http://www.liferay.com" description:@""
		serviceContext:serviceContext error:&error];

	XCTAssertNil(error);
	XCTAssertNotNil(result);
	XCTAssertEqualObjects(uuid, result[@"uuid"]);

	[service deleteEntryWithEntryId:[result[@"entryId"] longLongValue]
		error:&error];

	XCTAssertNil(error);
}

@end