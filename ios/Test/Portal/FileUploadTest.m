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

/**
 * @author Bruno Faracje
 */
@interface FileUploadTest : BaseTest <LRCallback>

@property (nonatomic, strong) NSDictionary *entry;
@property (nonatomic, strong) NSError *error;
@property (nonatomic, strong) TRVSMonitor *monitor;

@end

@implementation FileUploadTest

- (void)onFailure:(NSError *)error {
	self.error = error;
	[self.monitor signal];
}

- (void)onSuccess:(NSDictionary *)entry {
	self.entry = entry;
	[self.monitor signal];
}

- (void)testAddFileEntryData {
	self.monitor = [TRVSMonitor monitor];

	LRSession *session = [[LRSession alloc] init:self.session];
	[session setCallback:self];

	LRDLAppService_v62 *service =
		[[LRDLAppService_v62 alloc] initWithSession:session];

	long long repositoryId = [self.settings[@"groupId"] longLongValue];

	NSHTTPCookieStorage *cookieStorage =
		[NSHTTPCookieStorage sharedHTTPCookieStorage];

	[cookieStorage setCookieAcceptPolicy:NSHTTPCookieAcceptPolicyNever];

	NSString *sourceFileName = @"test.properties";
	NSString *mimeType = @"text/plain";
	NSString *title = @"test.properties";

	NSData *bytes = [@"Hello" dataUsingEncoding:NSUTF8StringEncoding];

	NSError *error;
	[service addFileEntryWithRepositoryId:repositoryId
		folderId:0 sourceFileName:sourceFileName mimeType:mimeType
		title:title description:@"" changeLog:@"" file:bytes serviceContext:nil
		error:&error];

	XCTAssertNil(error);

	[self.monitor wait];

	XCTAssertNil(self.error);
	XCTAssertEqualObjects(title, self.entry[@"title"]);
}

@end