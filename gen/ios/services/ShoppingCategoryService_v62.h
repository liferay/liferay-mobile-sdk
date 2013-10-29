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

/**
 * author: Bruno Farache
 */
@interface ShoppingCategoryService_v62 : NSObject

- (NSDictionary *)addCategory:(NSNumber *)parentCategoryId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (void)deleteCategory:(NSNumber *)categoryId;
- (NSDictionary *)getCategory:(NSNumber *)categoryId;
- (void)getSubcategoryIds:(NSArray *)categoryIds groupId:(NSNumber *)groupId categoryId:(NSNumber *)categoryId;
- (NSArray *)getCategories:(NSNumber *)groupId parentCategoryId:(NSNumber *)parentCategoryId start:(NSNumber *)start end:(NSNumber *)end;
- (NSDictionary *)updateCategory:(NSNumber *)categoryId parentCategoryId:(NSNumber *)parentCategoryId name:(NSString *)name description:(NSString *)description mergeWithParentCategory:(BOOL)mergeWithParentCategory serviceContext:(NSDictionary *)serviceContext;
- (NSNumber *)getCategoriesCount:(NSNumber *)groupId parentCategoryId:(NSNumber *)parentCategoryId;

@end