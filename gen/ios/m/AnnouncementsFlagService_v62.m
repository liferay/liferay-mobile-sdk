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

#import "AnnouncementsFlagService_v62.h"

/**
 * author Bruno Farache
 */
@implementation AnnouncementsFlagService_v62

- (void)addFlag:(long)entryId value:(int)value {
	NSDictionary *_params = @{
		@"entryId": @(entryId),
		@"value": @(value)
	};

	NSDictionary *_command = @{@"/announcementsflag/add-flag": _params};

	[self.session invoke:_command];
}

- (void)deleteFlag:(long)flagId {
	NSDictionary *_params = @{
		@"flagId": @(flagId)
	};

	NSDictionary *_command = @{@"/announcementsflag/delete-flag": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)getFlag:(long)entryId value:(int)value {
	NSDictionary *_params = @{
		@"entryId": @(entryId),
		@"value": @(value)
	};

	NSDictionary *_command = @{@"/announcementsflag/get-flag": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

@end