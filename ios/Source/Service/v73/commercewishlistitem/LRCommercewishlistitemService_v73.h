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
@interface LRCommercewishlistitemService_v73 : LRBaseService

- (NSArray *)getCommerceWishListItemsWithCommerceWishListId:(long long)commerceWishListId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSDictionary *)addCommerceWishListItemWithCommerceAccountId:(long long)commerceAccountId commerceWishListId:(long long)commerceWishListId cProductId:(long long)cProductId cpInstanceUuid:(NSString *)cpInstanceUuid json:(NSString *)json serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)getCommerceWishListItemWithCommerceWishListItemId:(long long)commerceWishListItemId error:(NSError **)error;
- (NSDictionary *)getCommerceWishListItemWithCommerceWishListId:(long long)commerceWishListId cpInstanceUuid:(NSString *)cpInstanceUuid cProductId:(long long)cProductId error:(NSError **)error;
- (NSNumber *)getCommerceWishListItemByContainsCpInstanceCountWithCommerceWishListId:(long long)commerceWishListId cpInstanceUuid:(NSString *)cpInstanceUuid error:(NSError **)error;
- (NSNumber *)getCommerceWishListItemByContainsCProductCountWithCommerceWishListId:(long long)commerceWishListId cProductId:(long long)cProductId error:(NSError **)error;
- (NSNumber *)getCommerceWishListItemsCountWithCommerceWishListId:(long long)commerceWishListId error:(NSError **)error;
- (void)deleteCommerceWishListItemWithCommerceWishListItemId:(long long)commerceWishListItemId error:(NSError **)error CONVERT_ERROR_TO_THROWS;

@end