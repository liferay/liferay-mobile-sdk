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

#import <Foundation/Foundation.h>
#import "LRBaseService.h"

/**
 * author Bruno Farache
 */
@interface LRShoppingCategoryService_v62 : LRBaseService

- (NSDictionary *)addCategoryWithParentCategoryId:(long)parentCategoryId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)deleteCategoryWithCategoryId:(long)categoryId error:(NSError **)error;
- (NSArray *)getCategoriesWithGroupId:(long)groupId error:(NSError **)error;
- (NSArray *)getCategoriesWithGroupId:(long)groupId parentCategoryId:(long)parentCategoryId start:(int)start end:(int)end error:(NSError **)error;
- (int)getCategoriesCountWithGroupId:(long)groupId parentCategoryId:(long)parentCategoryId error:(NSError **)error;
- (NSDictionary *)getCategoryWithCategoryId:(long)categoryId error:(NSError **)error;
- (void)getSubcategoryIdsWithCategoryIds:(NSArray *)categoryIds groupId:(long)groupId categoryId:(long)categoryId error:(NSError **)error;
- (NSDictionary *)updateCategoryWithCategoryId:(long)categoryId parentCategoryId:(long)parentCategoryId name:(NSString *)name description:(NSString *)description mergeWithParentCategory:(BOOL)mergeWithParentCategory serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;

@end