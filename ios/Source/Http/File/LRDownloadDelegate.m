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

#import "LRBasicAuthentication.h"
#import "LRError.h"
#import "LRResponseParser.h"

/**
 * @author Bruno Farache
 */
@implementation LRDownloadDelegate

- (id)initWithAuth:(id<LRAuthentication>)auth
		outputStream:(NSOutputStream *)outputStream
		progressDelegate:(id<LRFileProgressDelegate>)progressDelegate {

	self = [super init];

	if (self) {
		self.auth = auth;
		self.outputStream = outputStream;
		self.progressDelegate = progressDelegate;
	}

	return self;
}

#pragma mark - NSURLSessionDelegate

- (void)URLSession:(NSURLSession *)session task:(NSURLSessionTask *)task didCompleteWithError:(NSError *)error {

	if (error) {
		[self.progressDelegate onFailure:error];
	}
	else {
		NSHTTPURLResponse *httpResponse = (NSHTTPURLResponse *)task.response;
		NSInteger code = [httpResponse statusCode];


		if (code != LR_HTTP_STATUS_OK) {
			NSString *description = [NSString stringWithFormat:@"HTTP Error: %li",
									 (long)code];

			NSError *error = [LRError errorWithCode:code description:description];
			[self.progressDelegate onFailure:error];
		}
		else {
			if ([self.progressDelegate respondsToSelector:@selector(onFinished)]) {
				[self.progressDelegate onFinished];
			}
		}
	}
}

- (void)URLSession:(NSURLSession *)session dataTask:(NSURLSessionDataTask *)dataTask didReceiveData:(NSData *)data {
	if (self.downloadProgress == nil) {
		self.downloadProgress = [[NSProgress alloc] initWithParent:nil userInfo:nil];

		__weak typeof(dataTask) weakTask = dataTask;
		self.downloadProgress.cancellable = YES;
		self.downloadProgress.cancellationHandler = ^{
			[weakTask cancel];
		};
	}

	if ([self.progressDelegate respondsToSelector:@selector(isCancelled)] &&
		[self.progressDelegate isCancelled]) {

		[dataTask cancel];

		return;
	}

	NSUInteger length = [data length];
	self.totalBytes = self.totalBytes + length;

	if ([self.outputStream hasSpaceAvailable]) {
		const uint8_t *buffer = (uint8_t *)[data bytes];
		[self.outputStream write:&buffer[0] maxLength:length];
	}

	self.downloadProgress.totalUnitCount = dataTask.countOfBytesExpectedToReceive;
	self.downloadProgress.completedUnitCount = dataTask.countOfBytesReceived;

	dispatch_async(dispatch_get_main_queue(), ^{
		[self.progressDelegate onProgress:self.downloadProgress];
	});
}

- (void)URLSession:(NSURLSession *)session task:(NSURLSessionTask *)task didReceiveChallenge:(NSURLAuthenticationChallenge *)challenge completionHandler:(void (^)(NSURLSessionAuthChallengeDisposition, NSURLCredential * _Nullable))completionHandler {
	if ([challenge previousFailureCount] > 1) {
		NSError *error = [LRError errorWithCode:LRErrorCodeUnauthorized
									description:@"Authentication failed during download"];

		[self.progressDelegate onFailure:error];
	}
	else {
		if (!self.auth) {
			NSError *error = [LRError errorWithCode:LRErrorCodeUnauthorized
										description:@"Session authentication can't be nil"];

			[self.progressDelegate onFailure:error];

			return;
		}

		if ([self.auth class] != [LRBasicAuthentication class]) {
			NSError *error = [LRError errorWithCode:LRErrorCodeUnauthorized
										description:@"Can't download if authentication implementation" \
							  " is not BasicAuthentication"];

			[self.progressDelegate onFailure:error];

			return;
		}
		
		LRBasicAuthentication *basic = (LRBasicAuthentication *)self.auth;

		NSURLCredential *credential = [NSURLCredential
									   credentialWithUser:basic.username password:basic.password
									   persistence:NSURLCredentialPersistenceNone];

		completionHandler(NSURLSessionAuthChallengeUseCredential, credential);
	}
}

@end
