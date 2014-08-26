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
#import "LRDLAppService_v62.h"
#import "TRVSMonitor.h"

NSString *const FILE_CONTENT = @"File content.";
NSString *const GROUP_ID = @"groupId";
NSString *const MIME_TYPE = @"text/plain";
NSString *const NO_REPOSITORY_ID = @"No Repository exists with the primary key -1";
const long long ROOT_FOLDER_ID = 0;
NSString *const SOURCE_FILE_NAME = @"test.properties";
NSString *const TITLE = @"title";

/**
 * @author Bruno Farache
 */
@interface FileUploadTest : BaseTest <LRCallback, LRProgressDelegate>

@property (nonatomic, strong) NSDictionary *entry;
@property (nonatomic, strong) NSError *error;
@property (nonatomic, strong) TRVSMonitor *monitor;
@property (nonatomic) long long progress;
@property (nonatomic, strong) LRDLAppService_v62 *service;

@end

@implementation FileUploadTest

- (void)onFailure:(NSError *)error {
	[self setError:error];
	[self.monitor signal];
}

- (void)onProgressBytes:(NSUInteger)bytes sent:(long long)sent
		total:(long long)total {

	[self setProgress:sent];
}

- (void)onSuccess:(NSDictionary *)entry {
	[self setEntry:entry];
	[self.monitor signal];
}

- (void)testAddFileEntryBytes {
	LRDLAppService_v62 *service =
		[[LRDLAppService_v62 alloc] initWithSession:self.session];

	long long repositoryId = [self.settings[GROUP_ID] longLongValue];

	NSData *bytes = [FILE_CONTENT dataUsingEncoding:NSUTF8StringEncoding];

	NSString *name = [NSString stringWithFormat:@"%@-%@", SOURCE_FILE_NAME,
		[[NSUUID UUID] UUIDString]];

	NSError *error;
	self.entry = [service addFileEntryWithRepositoryId:repositoryId
		folderId:ROOT_FOLDER_ID sourceFileName:name mimeType:MIME_TYPE
		title:name description:@"" changeLog:@"" bytes:bytes serviceContext:nil
		error:&error];

	XCTAssertNil(error);
	XCTAssertEqualObjects(name, self.entry[TITLE]);
}

- (void)testAddFileEntryData {
	long long repositoryId = [self.settings[GROUP_ID] longLongValue];

	LRUploadData *file = [self _uploadData];

	NSString *name = [NSString stringWithFormat:@"%@-%@", SOURCE_FILE_NAME,
		[[NSUUID UUID] UUIDString]];

	NSError *error;
	[self.service addFileEntryWithRepositoryId:repositoryId
		folderId:ROOT_FOLDER_ID sourceFileName:name	mimeType:MIME_TYPE
		title:name description:@"" changeLog:@"" file:file serviceContext:nil
		error:&error];

	XCTAssertNil(error);

	[self.monitor wait];

	XCTAssertNil(self.error);
	XCTAssertEqualObjects(name, self.entry[TITLE]);
}

- (void)testAddFileEntryInputStream {
	long long repositoryId = [self.settings[GROUP_ID] longLongValue];

	NSData *data = [FILE_CONTENT dataUsingEncoding:NSUTF8StringEncoding];
	NSInputStream *is = [[NSInputStream alloc] initWithData:data];
	int64_t length = [data length];

	LRUploadData *file = [[LRUploadData alloc] initWithInputStream:is
		length:length fileName:SOURCE_FILE_NAME mimeType:MIME_TYPE];

	NSString *name = [NSString stringWithFormat:@"%@-%@", SOURCE_FILE_NAME,
		[[NSUUID UUID] UUIDString]];

	NSError *error;
	[self.service addFileEntryWithRepositoryId:repositoryId
		folderId:ROOT_FOLDER_ID sourceFileName:name mimeType:MIME_TYPE
		title:name description:@"" changeLog:@"" file:file serviceContext:nil
		error:&error];

	XCTAssertNil(error);

	[self.monitor wait];

	XCTAssertNil(self.error);
	XCTAssertEqualObjects(name, self.entry[TITLE]);
}

- (void)testAddFileEntryProgress {
	long long repositoryId = [self.settings[GROUP_ID] longLongValue];
	NSString *sourceFileName = @"logo.png";
	NSString *mimeType = @"image/png";

	NSBundle *bundle =
		[NSBundle bundleWithIdentifier:@"com.liferay.mobile.sdk.Test"];
	NSString *path = [bundle pathForResource:@"logo" ofType:@"png"];
	NSInputStream *is = [[NSInputStream alloc] initWithFileAtPath:path];

	NSDictionary *attributes = [[NSFileManager defaultManager]
		attributesOfItemAtPath:path error:nil];
	NSNumber *fileSize = [attributes objectForKey:NSFileSize];
	int64_t length = [fileSize longLongValue];

	LRUploadData *file = [[LRUploadData alloc] initWithInputStream:is
		length:length fileName:sourceFileName mimeType:mimeType];

	[file setProgressDelegate:self];

	NSString *name = [NSString stringWithFormat:@"%@-%@", sourceFileName,
		[[NSUUID UUID] UUIDString]];

	NSError *error;
	[self.service addFileEntryWithRepositoryId:repositoryId
		folderId:ROOT_FOLDER_ID sourceFileName:name mimeType:mimeType title:name
		description:@"" changeLog:@"" file:file serviceContext:nil
		error:&error];

	XCTAssertNil(error);

	[self.monitor wait];

	XCTAssertNil(self.error);
	XCTAssertEqualObjects(name, self.entry[TITLE]);
	XCTAssertEqual(44288, self.progress);
}

- (void)testRepositoryIdServerExceptionAsynchronous {
	long long repositoryId = -1;

	LRUploadData *file = [self _uploadData];

	NSString *name = [NSString stringWithFormat:@"%@-%@", SOURCE_FILE_NAME,
		[[NSUUID UUID] UUIDString]];

	NSError *error;
	[self.service addFileEntryWithRepositoryId:repositoryId
		folderId:ROOT_FOLDER_ID sourceFileName:name mimeType:MIME_TYPE
		title:name description:@"" changeLog:@"" file:file serviceContext:nil
		error:&error];

	XCTAssertNil(error);

	[self.monitor wait];

	XCTAssert(self.error);
	XCTAssertEqualObjects(NO_REPOSITORY_ID, [self.error localizedDescription]);
}

- (void)testRepositoryIdServerExceptionSynchronous {
	LRDLAppService_v62 *service =
		[[LRDLAppService_v62 alloc] initWithSession:self.session];

	long long repositoryId = -1;

	NSData *bytes = [FILE_CONTENT dataUsingEncoding:NSUTF8StringEncoding];

	NSString *name = [NSString stringWithFormat:@"%@-%@", SOURCE_FILE_NAME,
		[[NSUUID UUID] UUIDString]];

	NSError *error;
	[service addFileEntryWithRepositoryId:repositoryId folderId:ROOT_FOLDER_ID
		sourceFileName:name mimeType:MIME_TYPE title:name description:@""
		changeLog:@"" bytes:bytes serviceContext:nil error:&error];

	XCTAssert(error);
	XCTAssertEqualObjects(NO_REPOSITORY_ID, [error localizedDescription]);
}

- (void)setUp {
	[super setUp];

	self.monitor = [TRVSMonitor monitor];

	LRSession *session = [[LRSession alloc] initWithSession:self.session];
	[session setCallback:self];

	self.service = [[LRDLAppService_v62 alloc] initWithSession:session];
}

- (void)tearDown {
	if (self.entry) {
		NSError *error;
		[self.service.session setCallback:nil];
		long long fileEntryId = [self.entry[@"fileEntryId"] longLongValue];
		[self.service deleteFileEntryWithFileEntryId:fileEntryId error:&error];
	}

	[self setEntry:nil];
	[self setError:nil];
	[self setProgress:0];
}

- (LRUploadData *)_uploadData {
	NSData *data = [FILE_CONTENT dataUsingEncoding:NSUTF8StringEncoding];

	return [[LRUploadData alloc] initWithData:data fileName:SOURCE_FILE_NAME
		mimeType:MIME_TYPE];
}

@end