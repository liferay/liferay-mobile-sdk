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

#import "LRDownloadDelegate.h"

/**
 * @author Bruno Farache
 */
@implementation LRDownloadDelegate

- (id)initWithDownloadProgressBlock:(LRDownloadProgress)downloadProgress {
	self = [super init];

	if (self) {
		self.downloadProgress = downloadProgress;
	}

	return self;
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

	self.downloadProgress(totalBytesWritten);
}

@end