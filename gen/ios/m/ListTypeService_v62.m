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

#import "ListTypeService_v62.h"

/**
 * author Bruno Farache
 */
@implementation ListTypeService_v62

- (void)validate:(NSNumber *)listTypeId classNameId:(NSNumber *)classNameId type:(NSString *)type {
	NSDictionary *_params = @{
		@"listTypeId": listTypeId,
		@"classNameId": classNameId,
		@"type": type
	};

	NSDictionary *_command = @{@"/listtype/validate": _params};

	[session invoke:_command];
}

- (NSArray *)getListTypes:(NSString *)type {
	NSDictionary *_params = @{
		@"type": type
	};

	NSDictionary *_command = @{@"/listtype/get-list-types": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)getListType:(NSNumber *)listTypeId {
	NSDictionary *_params = @{
		@"listTypeId": listTypeId
	};

	NSDictionary *_command = @{@"/listtype/get-list-type": _params};

	return (NSDictionary *)[session invoke:_command];
}

@end