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
#import "LRBookmarksEntryService_v62.h"
#import "ServiceContextTest.h"

/**
 * @author Bruno Farache
 */
@interface OrderByComparatorTest : BaseTest

@property (nonatomic, strong) NSDictionary *entryA;
@property (nonatomic, strong) NSDictionary *entryB;
@property (nonatomic, strong) ServiceContextTest *serviceContextTest;

@end

@implementation OrderByComparatorTest

- (void)testGetEntriesDescending {
	LRBookmarksEntryService_v62 *service = [[LRBookmarksEntryService_v62 alloc]
		initWithSession:self.session];

	long long groupId = [self.settings[@"groupId"] longLongValue];

	NSString *className =
		@"com.liferay.portlet.bookmarks.util.comparator.EntryNameComparator";

	LRJSONObjectWrapper *orderByComparatorDesc = [[LRJSONObjectWrapper alloc]
		initWithClassName:className jsonObject:[NSDictionary dictionary]];

	NSError *error;

	NSArray *entries = [service getEntriesWithGroupId:groupId
		folderId:PARENT_FOLDER_ID start:-1 end:-1
		orderByComparator:orderByComparatorDesc error:&error];

	XCTAssertNil(error);
	XCTAssertNotNil(entries);
	XCTAssertEqual(2, [entries count]);

	NSDictionary *first = entries[0];
	NSDictionary *second = entries[1];

	XCTAssertEqualObjects(@"B", first[@"name"]);
	XCTAssertEqualObjects(@"A", second[@"name"]);
}

- (void)testNullOrderByComparator {
	LRBookmarksEntryService_v62 *service = [[LRBookmarksEntryService_v62 alloc]
		initWithSession:self.session];

	long long groupId = [self.settings[@"groupId"] longLongValue];

	NSError *error;

	NSArray *entries = [service getEntriesWithGroupId:groupId
		folderId:PARENT_FOLDER_ID start:-1 end:-1 orderByComparator:nil
		error:&error];

	XCTAssertNil(error);
	XCTAssertNotNil(entries);
	XCTAssertEqual(2, [entries count]);

	NSDictionary *first = entries[0];
	NSDictionary *second = entries[1];

	XCTAssertEqualObjects(@"A", first[@"name"]);
	XCTAssertEqualObjects(@"B", second[@"name"]);
}

- (void)setUp {
	[super setUp];

	self.serviceContextTest = [[ServiceContextTest alloc] init];
	[self.serviceContextTest setUp];

	self.entryA = [self.serviceContextTest addBookmarkEntry:@"A"
		serviceContext:nil error:nil];

	self.entryB = [self.serviceContextTest addBookmarkEntry:@"B"
		serviceContext:nil error:nil];
}

- (void)tearDown {
	[self.serviceContextTest deleteBookmarkEntry:self.entryA error:nil];
	[self.serviceContextTest deleteBookmarkEntry:self.entryB error:nil];
}

@end