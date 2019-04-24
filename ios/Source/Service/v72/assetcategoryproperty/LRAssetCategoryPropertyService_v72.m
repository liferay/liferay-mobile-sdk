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

#import "LRAssetCategoryPropertyService_v72.h"

/**
 * @author Bruno Farache
 */
@implementation LRAssetCategoryPropertyService_v72

- (NSDictionary *)addCategoryPropertyWithEntryId:(long long)entryId key:(NSString *)key value:(NSString *)value error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"entryId": @(entryId),
		@"key": [self checkNull: key],
		@"value": [self checkNull: value]
	}];

	NSDictionary *_command = @{@"/asset.assetcategoryproperty/add-category-property": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCategoryPropertyWithCategoryPropertyId:(long long)categoryPropertyId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"categoryPropertyId": @(categoryPropertyId)
	}];

	NSDictionary *_command = @{@"/asset.assetcategoryproperty/delete-category-property": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getCategoryPropertiesWithEntryId:(long long)entryId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"entryId": @(entryId)
	}];

	NSDictionary *_command = @{@"/asset.assetcategoryproperty/get-category-properties": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCategoryPropertyValuesWithCompanyId:(long long)companyId key:(NSString *)key error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"key": [self checkNull: key]
	}];

	NSDictionary *_command = @{@"/asset.assetcategoryproperty/get-category-property-values": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCategoryPropertyWithCategoryPropertyId:(long long)categoryPropertyId key:(NSString *)key value:(NSString *)value error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"categoryPropertyId": @(categoryPropertyId),
		@"key": [self checkNull: key],
		@"value": [self checkNull: value]
	}];

	NSDictionary *_command = @{@"/asset.assetcategoryproperty/update-category-property": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCategoryPropertyWithUserId:(long long)userId categoryPropertyId:(long long)categoryPropertyId key:(NSString *)key value:(NSString *)value error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId),
		@"categoryPropertyId": @(categoryPropertyId),
		@"key": [self checkNull: key],
		@"value": [self checkNull: value]
	}];

	NSDictionary *_command = @{@"/asset.assetcategoryproperty/update-category-property": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end