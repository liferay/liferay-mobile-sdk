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

#import "ExpandoColumnService_v62.h"

/**
 * author Bruno Farache
 */
@implementation ExpandoColumnService_v62

- (NSDictionary *)addColumn:(NSNumber *)tableId name:(NSString *)name type:(NSNumber *)type defaultData:(NSDictionary *)defaultData {
	NSDictionary *_params = @{
		@"tableId": tableId,
		@"name": name,
		@"type": type,
		@"defaultData": defaultData
	};

	NSDictionary *_command = @{@"/expandocolumn/add-column": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)deleteColumn:(NSNumber *)columnId {
	NSDictionary *_params = @{
		@"columnId": columnId
	};

	NSDictionary *_command = @{@"/expandocolumn/delete-column": _params};

	[session invoke:_command];
}

- (NSDictionary *)updateTypeSettings:(NSNumber *)columnId typeSettings:(NSString *)typeSettings {
	NSDictionary *_params = @{
		@"columnId": columnId,
		@"typeSettings": typeSettings
	};

	NSDictionary *_command = @{@"/expandocolumn/update-type-settings": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)updateColumn:(NSNumber *)columnId name:(NSString *)name type:(NSNumber *)type defaultData:(NSDictionary *)defaultData {
	NSDictionary *_params = @{
		@"columnId": columnId,
		@"name": name,
		@"type": type,
		@"defaultData": defaultData
	};

	NSDictionary *_command = @{@"/expandocolumn/update-column": _params};

	return (NSDictionary *)[session invoke:_command];
}

@end