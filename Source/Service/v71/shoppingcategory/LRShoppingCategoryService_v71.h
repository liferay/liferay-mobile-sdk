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

#if defined(LIFERAY_MOBILE_SDK_FRAMEWORK) && defined(LIFERAY_MOBILE_SDK_APP)
    @import LRMobileSDK;
#else
    #import "LRBaseService.h"
#endif

/**
 * @author Bruno Farache
 */
@interface LRShoppingCategoryService_v71 : LRBaseService

- (NSArray *)getCategoriesWithGroupId:(long long)groupId parentCategoryId:(long long)parentCategoryId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getCategoriesWithGroupId:(long long)groupId error:(NSError **)error;
- (NSDictionary *)addCategoryWithParentCategoryId:(long long)parentCategoryId name:(NSString *)name description:(NSString *)description serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteCategoryWithCategoryId:(long long)categoryId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)getSubcategoryIdsWithCategoryIds:(NSArray *)categoryIds groupId:(long long)groupId categoryId:(long long)categoryId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)updateCategoryWithCategoryId:(long long)categoryId parentCategoryId:(long long)parentCategoryId name:(NSString *)name description:(NSString *)description mergeWithParentCategory:(BOOL)mergeWithParentCategory serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSArray *)getCategoriesAndItemsWithGroupId:(long long)groupId categoryId:(long long)categoryId start:(int)start end:(int)end obc:(LRJSONObjectWrapper *)obc error:(NSError **)error;
- (NSNumber *)getCategoriesAndItemsCountWithGroupId:(long long)groupId categoryId:(long long)categoryId error:(NSError **)error;
- (NSNumber *)getCategoriesCountWithGroupId:(long long)groupId parentCategoryId:(long long)parentCategoryId error:(NSError **)error;
- (NSDictionary *)getCategoryWithCategoryId:(long long)categoryId error:(NSError **)error;

@end