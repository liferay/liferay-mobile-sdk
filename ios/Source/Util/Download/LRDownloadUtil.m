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

#import "LRDownloadUtil.h"

#import "LRHttpUtil.h"

/**
 * @author Bruno Farache
 */
@implementation LRDownloadUtil

+ (NSURLSessionDownloadTask *)downloadWithSession:(LRSession *)session
		URL:(NSString *)URL outputStream:(NSOutputStream *)outputStream
		downloadProgress:(LRDownloadProgress)downloadProgress {

	NSURLSessionConfiguration *configuration = [NSURLSessionConfiguration
		defaultSessionConfiguration];

	LRDownloadDelegate *delegate = [[LRDownloadDelegate alloc]
		initWithDownloadProgressBlock:downloadProgress];

	NSURLSession *urlSession = [NSURLSession
		sessionWithConfiguration:configuration delegate:delegate
		delegateQueue:nil];

	NSMutableURLRequest *request = [LRHttpUtil getRequestWithSession:session
		URL:[NSURL URLWithString:URL]];

	NSURLSessionDownloadTask *task = [urlSession
		downloadTaskWithRequest:request completionHandler:
			^(NSURL *l, NSURLResponse *r, NSError *e) {
				NSLog(@"Getting 401 %@", r.description);
			}
	];

	[task resume];

	return task;
}

+ (NSURLSessionDownloadTask *)downloadFileWithSession:(LRSession *)session
		groupFriendlyURL:(NSString *)groupFriendlyURL
		folderPath:(NSString *)folderPath fileTitle:(NSString *)fileTitle
		outputStream:(NSOutputStream *)outputStream
		downloadProgress:(LRDownloadProgress)downloadProgress {

	NSString *URL = [LRDownloadUtil getDownloadURLWithSession:session
		groupFriendlyURL:groupFriendlyURL folderPath:folderPath
		fileTitle:fileTitle];

	return [LRDownloadUtil downloadWithSession:session URL:URL
		outputStream:outputStream downloadProgress:downloadProgress];
}

+ (NSString *)getDownloadURLWithSession:(LRSession *)session
		groupFriendlyURL:(NSString *)groupFriendlyURL
		folderPath:(NSString *)folderPath fileTitle:(NSString *)fileTitle {

	NSString *webdavPath = [NSString stringWithFormat:@"%@/%@", folderPath,
		fileTitle];

	NSString *webdavPathEscaped = [LRHttpUtil
		escape:webdavPath include:@":?#[]@!$ &'()*+,;=\"<>%{}|\\^~`"
		ignore:@"/"];

	return [NSString
		stringWithFormat:@"%@/webdav%@/document_library%@",
		session.server, groupFriendlyURL, webdavPathEscaped];
}

#pragma mark - NSURLSessionDownloadDelegate

- (void)URLSession:(NSURLSession *)session
	downloadTask:(NSURLSessionDownloadTask *)downloadTask
	didFinishDownloadingToURL:(NSURL *)location {
}

- (void)URLSession:(NSURLSession *)session
	downloadTask:(NSURLSessionDownloadTask *)downloadTask
	didWriteData:(int64_t)bytesWritten
	totalBytesWritten:(int64_t)totalBytesWritten
	totalBytesExpectedToWrite:(int64_t)totalBytesExpectedToWrite {
}

@end