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

#import "RatingsEntryService_v62.h"

/**
 * author Bruno Farache
 */
@implementation RatingsEntryService_v62

- (NSDictionary *)updateEntry:(NSString *)className classPK:(long)classPK score:(double)score {
	NSDictionary *_params = @{
		@"className": className,
		@"classPK": @(classPK),
		@"score": @(score)
	};

	NSDictionary *_command = @{@"/ratingsentry/update-entry": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)deleteEntry:(NSString *)className classPK:(long)classPK {
	NSDictionary *_params = @{
		@"className": className,
		@"classPK": @(classPK)
	};

	NSDictionary *_command = @{@"/ratingsentry/delete-entry": _params};

	[self.session invoke:_command];
}

@end