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
#import "Push.h"
#import "TRVSMonitor.h"

/**
 * @author Bruno Farache
 */
@interface PushTest : BaseTest
@end

@implementation PushTest

- (void)testRegister {
	TRVSMonitor *monitor = [TRVSMonitor monitor];
	__block NSDictionary *device;
	__block NSError *error;

	NSString *token = @"token";

	Push *push = [[[Push withSession:self.session]
		onSuccess:^(NSDictionary *result) {
			device = result;
			[monitor signal];
		}]
	 	onFailure:^(NSError *e) {
			error = e;
			[monitor signal];
		}];

	[push registerToken:token];
	[monitor wait];

	[self _assert:device token:token error:error];

	[push unregisterToken:token];
	[monitor wait];

	[self _assert:device token:token error:error];
}

- (void)testSendPushNotification {
	TRVSMonitor *monitor = [TRVSMonitor monitor];
	__block NSError *error;

	Push *push = [[[Push withSession:self.session]
		onSuccess:^(NSDictionary *result) {
			[monitor signal];
		}]
	 	onFailure:^(NSError *e) {
			error = e;
			[monitor signal];
		}];

	[push sendToUserId:0 notification:@{@"message": @"hello!"}];
	[monitor wait];

	XCTAssertNil(error);
}

- (void)_assert:(NSDictionary *)device token:(NSString *)token
		error:(NSError *)error {

	XCTAssertNil(error);
	XCTAssertNotNil(device);

	XCTAssertEqualObjects(token, device[@"token"]);
	XCTAssertEqualObjects(@"ios", device[@"platform"]);
}

@end