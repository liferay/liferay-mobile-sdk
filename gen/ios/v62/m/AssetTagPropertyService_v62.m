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

#import "AssetTagPropertyService_v62.h"

/**
 * author Bruno Farache
 */
@implementation AssetTagPropertyService_v62

- (NSArray *)getTagProperties:(long)tagId {
	NSDictionary *_params = @{
		@"tagId": @(tagId)
	};

	NSDictionary *_command = @{@"/assettagproperty/get-tag-properties": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)updateTagProperty:(long)tagPropertyId key:(NSString *)key value:(NSString *)value {
	NSDictionary *_params = @{
		@"tagPropertyId": @(tagPropertyId),
		@"key": key,
		@"value": value
	};

	NSDictionary *_command = @{@"/assettagproperty/update-tag-property": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)addTagProperty:(long)tagId key:(NSString *)key value:(NSString *)value {
	NSDictionary *_params = @{
		@"tagId": @(tagId),
		@"key": key,
		@"value": value
	};

	NSDictionary *_command = @{@"/assettagproperty/add-tag-property": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSArray *)getTagPropertyValues:(long)companyId key:(NSString *)key {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"key": key
	};

	NSDictionary *_command = @{@"/assettagproperty/get-tag-property-values": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (void)deleteTagProperty:(long)tagPropertyId {
	NSDictionary *_params = @{
		@"tagPropertyId": @(tagPropertyId)
	};

	NSDictionary *_command = @{@"/assettagproperty/delete-tag-property": _params};

	[self.session invoke:_command];
}

@end