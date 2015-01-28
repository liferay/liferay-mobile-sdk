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

#import "ServiceContextTest.h"
#import "LRBookmarksEntryService_v62.h"

const int PARENT_FOLDER_ID = 0;

/**
 * @author Bruno Farache
 */
@implementation ServiceContextTest

- (void)testAddBookmarkEntry {
	NSString *uuid = [[NSUUID UUID] UUIDString];

	NSDictionary *jsonObject = @{
		@"uuid": uuid,
		@"addGroupPermissions": @(YES),
		@"addGuestPermissions":@(YES)
	};

	LRJSONObjectWrapper *serviceContext = [[LRJSONObjectWrapper alloc]
		initWithJSONObject:jsonObject];

	NSError *error;

	NSDictionary *entry = [self addBookmarkEntry:@"test"
		serviceContext:serviceContext error:error];

	XCTAssertNil(error);
	XCTAssertNotNil(entry);
	XCTAssertEqualObjects(uuid, entry[@"uuid"]);

	[self deleteBookmarkEntry:entry error:error];

	XCTAssertNil(error);
}

- (NSDictionary *)addBookmarkEntry:(NSString *)name
		serviceContext:(LRJSONObjectWrapper *)serviceContext
		error:(NSError *)error {

	LRBookmarksEntryService_v62 *service = [[LRBookmarksEntryService_v62 alloc]
		initWithSession:self.session];

	long long groupId = [self.settings[@"groupId"] longLongValue];

	NSDictionary *entry = [service addEntryWithGroupId:groupId
		folderId:PARENT_FOLDER_ID name:name url:@"http://www.liferay.com"
		description:@"" serviceContext:serviceContext error:&error];

	return entry;
}

- (void)deleteBookmarkEntry:(NSDictionary *)entry error:(NSError *)error {
	LRBookmarksEntryService_v62 *service = [[LRBookmarksEntryService_v62 alloc]
		initWithSession:self.session];

	[service deleteEntryWithEntryId:[entry[@"entryId"] longLongValue]
		error:&error];
}

@end