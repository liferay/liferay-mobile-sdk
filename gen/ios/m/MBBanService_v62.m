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

#import "MBBanService_v62.h"

/**
 * author Bruno Farache
 */
@implementation MBBanService_v62

- (void)deleteBan:(long)banUserId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"banUserId": @(banUserId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/mbban/delete-ban": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)addBan:(long)banUserId serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"banUserId": @(banUserId),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/mbban/add-ban": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

@end