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
@interface LRCommercepricelistcommerceaccountgrouprelService_v73 : LRBaseService

- (void)deleteCommercePriceListAccountGroupRelsByCommercePriceListIdWithCommercePriceListId:(long long)commercePriceListId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)addCommercePriceListCommerceAccountGroupRelWithCommercePriceListId:(long long)commercePriceListId commerceAccountGroupId:(long long)commerceAccountGroupId order:(int)order serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteCommercePriceListCommerceAccountGroupRelWithCommercePriceListCommerceAccountGroupRelId:(long long)commercePriceListCommerceAccountGroupRelId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchCommercePriceListCommerceAccountGroupRelWithCommercePriceListId:(long long)commercePriceListId commerceAccountGroupId:(long long)commerceAccountGroupId error:(NSError **)error;
- (NSArray *)getCommercePriceListCommerceAccountGroupRelsWithCommercePriceListId:(long long)commercePriceListId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCommercePriceListCommerceAccountGroupRelsWithCommercePriceListId:(long long)commercePriceListId name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getCommercePriceListCommerceAccountGroupRelsWithCommercePriceListId:(long long)commercePriceListId error:(NSError **)error;
- (NSNumber *)getCommercePriceListCommerceAccountGroupRelsCountWithCommercePriceListId:(long long)commercePriceListId error:(NSError **)error;
- (NSNumber *)getCommercePriceListCommerceAccountGroupRelsCountWithCommercePriceListId:(long long)commercePriceListId name:(NSString *)name error:(NSError **)error;
- (NSDictionary *)updateCommercePriceListCommerceAccountGroupRelWithCommercePriceListCommerceAccountGroupRelId:(long long)commercePriceListCommerceAccountGroupRelId order:(int)order serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)getCommercePriceListCommerceAccountGroupRelWithCommercePriceListCommerceAccoungGroupRelId:(long long)commercePriceListCommerceAccoungGroupRelId error:(NSError **)error;

@end