/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

#import "LRFlagsEntryService_v62.h"

/**
 * author Bruno Farache
 */
@implementation LRFlagsEntryService_v62

- (void)addEntryWithClassName:(NSString *)className classPK:(long long)classPK reporterEmailAddress:(NSString *)reporterEmailAddress reportedUserId:(long long)reportedUserId contentTitle:(NSString *)contentTitle contentURL:(NSString *)contentURL reason:(NSString *)reason serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"className": className,
		@"classPK": @(classPK),
		@"reporterEmailAddress": reporterEmailAddress,
		@"reportedUserId": @(reportedUserId),
		@"contentTitle": contentTitle,
		@"contentURL": contentURL,
		@"reason": reason,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/flagsentry/add-entry": _params};

	[self.session invoke:_command error:error];
}

@end