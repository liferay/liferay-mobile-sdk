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
@interface LRCommercewishlistService_v73 : LRBaseService

- (NSDictionary *)addCommerceWishListWithName:(NSString *)name defaultWishList:(BOOL)defaultWishList serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteCommerceWishListWithCommerceWishListId:(long long)commerceWishListId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchCommerceWishListWithGroupId:(long long)groupId userId:(long long)userId defaultWishList:(BOOL)defaultWishList orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCommerceWishListsWithGroupId:(long long)groupId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCommerceWishListsWithGroupId:(long long)groupId userId:(long long)userId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getCommerceWishListsCountWithGroupId:(long long)groupId userId:(long long)userId error:(NSError **)error;
- (NSNumber *)getCommerceWishListsCountWithGroupId:(long long)groupId error:(NSError **)error;
- (NSDictionary *)getDefaultCommerceWishListWithGroupId:(long long)groupId userId:(long long)userId error:(NSError **)error;
- (NSDictionary *)updateCommerceWishListWithCommerceWishListId:(long long)commerceWishListId name:(NSString *)name defaultWishList:(BOOL)defaultWishList error:(NSError **)error;
- (NSDictionary *)getCommerceWishListWithCommerceWishListId:(long long)commerceWishListId error:(NSError **)error;

@end