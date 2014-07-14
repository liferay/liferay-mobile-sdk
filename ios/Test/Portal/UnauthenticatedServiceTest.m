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
#import "LRGroupService_v62.h"

/**
 * @author Jose M. Navarro
 */
@interface UnauthenticatedServiceTest : BaseTest

@end


@implementation UnauthenticatedServiceTest

- (void)testServiceWithNilUsername {
	LRSession *anonymousSession = [[LRSession alloc] init:self.session];

	anonymousSession.username = nil;

	[self _callSecureServiceWithSession:anonymousSession];
}

- (void)testServiceWithEmptyUsername {
	LRSession *anonymousSession = [[LRSession alloc] init:self.session];

	anonymousSession.username = @"";

	[self _callSecureServiceWithSession:anonymousSession];

}

- (void)_callSecureServiceWithSession:(LRSession *)session {
	LRGroupService_v62 *service =
		[[LRGroupService_v62 alloc] initWithSession:session];

	NSError *error;
	[service getUserSites:&error];

	XCTAssertEqualObjects(@"Authenticated access required",
		[error localizedDescription]);
}


@end