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

#import "BaseTest.h"
#import "DLAppServiceTest.h"
#import "LRDLAppService_v62.h"
#import "TRVSMonitor.h"

/**
 * @author Bruno Farache
 */
@interface FileUploadTest : BaseTest <LRCallback>

@property (nonatomic, strong) NSDictionary *entry;
@property (nonatomic, strong) NSError *error;
@property (nonatomic, strong) TRVSMonitor *monitor;

@end

@implementation FileUploadTest

- (void)onFailure:(NSError *)error {
	[self setError:error];
	[self.monitor signal];
}

- (void)onSuccess:(NSDictionary *)entry {
	[self setEntry:entry];
	[self.monitor signal];
}

- (void)testAddFileEntryData {
	self.monitor = [TRVSMonitor monitor];

	LRSession *session = [[LRSession alloc] init:self.session];
	[session setCallback:self];

	LRDLAppService_v62 *service =
		[[LRDLAppService_v62 alloc] initWithSession:session];

	long long repositoryId = [self.settings[@"groupId"] longLongValue];

	LRUploadData *file = [self _uploadData];

	NSError *error;
	[service addFileEntryWithRepositoryId:repositoryId
		folderId:ROOT_FOLDER_ID sourceFileName:SOURCE_FILE_NAME
		mimeType:MIME_TYPE title:SOURCE_FILE_NAME description:@"" changeLog:@""
		file:file serviceContext:nil error:&error];

	XCTAssertNil(error);

	[self.monitor wait];

	XCTAssertNil(self.error);
	XCTAssertEqualObjects(SOURCE_FILE_NAME, self.entry[@"title"]);

	[session setCallback:nil];
	long long fileEntryId = [self.entry[@"fileEntryId"] longLongValue];
	[service deleteFileEntryWithFileEntryId:fileEntryId error:&error];
	XCTAssertNil(error);

	[self setEntry:nil];
	[self setError:nil];
}

- (void)testAddFileEntryInputStream {
	self.monitor = [TRVSMonitor monitor];

	LRSession *session = [[LRSession alloc] init:self.session];
	[session setCallback:self];

	LRDLAppService_v62 *service =
		[[LRDLAppService_v62 alloc] initWithSession:session];

	long long repositoryId = [self.settings[@"groupId"] longLongValue];

	NSData *data = [@"File content." dataUsingEncoding:NSUTF8StringEncoding];
	NSInputStream *is = [[NSInputStream alloc] initWithData:data];
	int64_t length = [data length];

	LRUploadData *file = [[LRUploadData alloc] initWithInputStream:is
		length:length fileName:SOURCE_FILE_NAME mimeType:MIME_TYPE];

	NSError *error;
	[service addFileEntryWithRepositoryId:repositoryId
		folderId:ROOT_FOLDER_ID sourceFileName:SOURCE_FILE_NAME
		mimeType:MIME_TYPE title:SOURCE_FILE_NAME description:@"" changeLog:@""
		file:file serviceContext:nil error:&error];

	XCTAssertNil(error);

	[self.monitor wait];

	XCTAssertNil(self.error);
	XCTAssertEqualObjects(SOURCE_FILE_NAME, self.entry[@"title"]);

	[session setCallback:nil];
	long long fileEntryId = [self.entry[@"fileEntryId"] longLongValue];
	[service deleteFileEntryWithFileEntryId:fileEntryId error:&error];
	XCTAssertNil(error);

	[self setEntry:nil];
	[self setError:nil];
}

- (void)testRepositoryIdServerException {
	self.monitor = [TRVSMonitor monitor];

	LRSession *session = [[LRSession alloc] init:self.session];
	[session setCallback:self];

	LRDLAppService_v62 *service =
		[[LRDLAppService_v62 alloc] initWithSession:session];

	long long repositoryId = -1;

	LRUploadData *file = [self _uploadData];

	NSError *error;
	[service addFileEntryWithRepositoryId:repositoryId folderId:ROOT_FOLDER_ID
		sourceFileName:SOURCE_FILE_NAME mimeType:MIME_TYPE
		title:SOURCE_FILE_NAME description:@"" changeLog:@"" file:file
		serviceContext:nil error:&error];

	XCTAssertNil(error);

	[self.monitor wait];

	XCTAssert(self.error);
	XCTAssertEqualObjects(
		@"No Repository exists with the primary key -1",
		[self.error localizedDescription]);

	[self setEntry:nil];
	[self setError:nil];
}

- (LRUploadData *)_uploadData {
	NSData *data = [@"File content." dataUsingEncoding:NSUTF8StringEncoding];

	return [[LRUploadData alloc] initWithData:data fileName:SOURCE_FILE_NAME
		mimeType:MIME_TYPE];
}

@end