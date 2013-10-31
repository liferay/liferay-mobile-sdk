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

#import "AssetCategoryPropertyService_v62.h"

/**
 * author Bruno Farache
 */
@implementation AssetCategoryPropertyService_v62

- (NSArray *)getCategoryPropertyValues:(NSNumber *)companyId key:(NSString *)key {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"key": key
	};

	NSDictionary *_command = @{@"/assetcategoryproperty/get-category-property-values": _params};

	return (NSArray *)[session invoke:_command];
}

- (void)deleteCategoryProperty:(NSNumber *)categoryPropertyId {
	NSDictionary *_params = @{
		@"categoryPropertyId": categoryPropertyId
	};

	NSDictionary *_command = @{@"/assetcategoryproperty/delete-category-property": _params};

	[session invoke:_command];
}

- (NSDictionary *)updateCategoryProperty:(NSNumber *)categoryPropertyId key:(NSString *)key value:(NSString *)value {
	NSDictionary *_params = @{
		@"categoryPropertyId": categoryPropertyId,
		@"key": key,
		@"value": value
	};

	NSDictionary *_command = @{@"/assetcategoryproperty/update-category-property": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)addCategoryProperty:(NSNumber *)entryId key:(NSString *)key value:(NSString *)value {
	NSDictionary *_params = @{
		@"entryId": entryId,
		@"key": key,
		@"value": value
	};

	NSDictionary *_command = @{@"/assetcategoryproperty/add-category-property": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getCategoryProperties:(NSNumber *)entryId {
	NSDictionary *_params = @{
		@"entryId": entryId
	};

	NSDictionary *_command = @{@"/assetcategoryproperty/get-category-properties": _params};

	return (NSArray *)[session invoke:_command];
}

@end