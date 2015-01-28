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
#import "LRPortraitUtil.h"

/**
 * @author Josiane Bezerra
 */
@interface PortraitTest : BaseTest
@end

@implementation PortraitTest : BaseTest

- (void)testGetPortraitURL {
	long long portraitId = 1708235;

	NSString *expectedURL = [NSString stringWithFormat:@"%@%lld",
		@"http://localhost:8080/image/user_male_portrait?img_id=", portraitId];

	NSString *uuid;

	NSString *portraitURL = [LRPortraitUtil getPortraitURL:self.session male:YES
		portraitId:portraitId uuid:uuid];

	XCTAssertEqualObjects(expectedURL, portraitURL);

	expectedURL = [NSString stringWithFormat:@"%@%@",
		expectedURL, @"&img_id_token=U6W2%2BvmVgE%2FyBnzvklnWO%2BqHPck%3D"];

	uuid = @"c0c65ba5-c2ba-4bf5-9e42-7330adb1b5b8";

	portraitURL = [LRPortraitUtil getPortraitURL:self.session male:YES
		portraitId:portraitId uuid:uuid];

	XCTAssertEqualObjects(expectedURL, portraitURL);
}

@end