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

#import "ShoppingCategoryService_v62.h"

/**
 * author Bruno Farache
 */
@implementation ShoppingCategoryService_v62

- (NSDictionary *)addCategory:(long)parentCategoryId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"parentCategoryId": @(parentCategoryId),
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/shoppingcategory/add-category": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)deleteCategory:(long)categoryId {
	NSDictionary *_params = @{
		@"categoryId": @(categoryId)
	};

	NSDictionary *_command = @{@"/shoppingcategory/delete-category": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)getCategory:(long)categoryId {
	NSDictionary *_params = @{
		@"categoryId": @(categoryId)
	};

	NSDictionary *_command = @{@"/shoppingcategory/get-category": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)getSubcategoryIds:(NSArray *)categoryIds groupId:(long)groupId categoryId:(long)categoryId {
	NSDictionary *_params = @{
		@"categoryIds": categoryIds,
		@"groupId": @(groupId),
		@"categoryId": @(categoryId)
	};

	NSDictionary *_command = @{@"/shoppingcategory/get-subcategory-ids": _params};

	[self.session invoke:_command];
}

- (NSArray *)getCategories:(long)groupId parentCategoryId:(long)parentCategoryId start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"parentCategoryId": @(parentCategoryId),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/shoppingcategory/get-categories": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)updateCategory:(long)categoryId parentCategoryId:(long)parentCategoryId name:(NSString *)name description:(NSString *)description mergeWithParentCategory:(BOOL)mergeWithParentCategory serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"categoryId": @(categoryId),
		@"parentCategoryId": @(parentCategoryId),
		@"name": name,
		@"description": description,
		@"mergeWithParentCategory": @(mergeWithParentCategory),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/shoppingcategory/update-category": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (int)getCategoriesCount:(long)groupId parentCategoryId:(long)parentCategoryId {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"parentCategoryId": @(parentCategoryId)
	};

	NSDictionary *_command = @{@"/shoppingcategory/get-categories-count": _params};

	return (int)[self.session invoke:_command];
}

@end