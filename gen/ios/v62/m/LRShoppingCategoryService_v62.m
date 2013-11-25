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

#import "LRShoppingCategoryService_v62.h"

/**
 * author Bruno Farache
 */
@implementation LRShoppingCategoryService_v62

- (NSDictionary *)addCategoryWithParentCategoryId:(long long)parentCategoryId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"parentCategoryId": @(parentCategoryId),
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/shoppingcategory/add-category": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteCategoryWithCategoryId:(long long)categoryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"categoryId": @(categoryId)
	};

	NSDictionary *_command = @{@"/shoppingcategory/delete-category": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getCategoriesWithGroupId:(long long)groupId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/shoppingcategory/get-categories": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getCategoriesWithGroupId:(long long)groupId parentCategoryId:(long long)parentCategoryId start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"parentCategoryId": @(parentCategoryId),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/shoppingcategory/get-categories": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCategoriesCountWithGroupId:(long long)groupId parentCategoryId:(long long)parentCategoryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"parentCategoryId": @(parentCategoryId)
	};

	NSDictionary *_command = @{@"/shoppingcategory/get-categories-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getCategoryWithCategoryId:(long long)categoryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"categoryId": @(categoryId)
	};

	NSDictionary *_command = @{@"/shoppingcategory/get-category": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)getSubcategoryIdsWithCategoryIds:(NSArray *)categoryIds groupId:(long long)groupId categoryId:(long long)categoryId error:(NSError **)error {
	NSDictionary *_params = @{
		@"categoryIds": categoryIds,
		@"groupId": @(groupId),
		@"categoryId": @(categoryId)
	};

	NSDictionary *_command = @{@"/shoppingcategory/get-subcategory-ids": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)updateCategoryWithCategoryId:(long long)categoryId parentCategoryId:(long long)parentCategoryId name:(NSString *)name description:(NSString *)description mergeWithParentCategory:(BOOL)mergeWithParentCategory serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"categoryId": @(categoryId),
		@"parentCategoryId": @(parentCategoryId),
		@"name": name,
		@"description": description,
		@"mergeWithParentCategory": @(mergeWithParentCategory),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/shoppingcategory/update-category": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end