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

/**
 * @author Jose Navarro
 */
@implementation BaseTest

- (void)setUp {
	NSBundle *bundle =
		[NSBundle bundleWithIdentifier:@"com.liferay.mobile.sdk.Test"];

	NSString *path = [bundle pathForResource:@"settings" ofType:@"plist"];

	self.settings = [[NSDictionary alloc] initWithContentsOfFile:path];

	NSString *url = self.settings[@"url"];
	NSString *username = self.settings[@"username"];
	NSString *password = self.settings[@"password"];

	self.session =
		[[LRSession alloc] init:url username:username password:password];
}

@end