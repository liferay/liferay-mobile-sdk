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
@interface LRCommerceshippingfixedoptionrelService_v73 : LRBaseService

- (void)deleteCommerceShippingFixedOptionRelWithCommerceShippingFixedOptionRelId:(long long)commerceShippingFixedOptionRelId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)addCommerceShippingFixedOptionRelWithCommerceShippingMethodId:(long long)commerceShippingMethodId commerceShippingFixedOptionId:(long long)commerceShippingFixedOptionId commerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId commerceCountryId:(long long)commerceCountryId commerceRegionId:(long long)commerceRegionId zip:(NSString *)zip weightFrom:(double)weightFrom weightTo:(double)weightTo fixedPrice:(NSDictionary *)fixedPrice rateUnitWeightPrice:(NSDictionary *)rateUnitWeightPrice ratePercentage:(double)ratePercentage serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addCommerceShippingFixedOptionRelWithUserId:(long long)userId groupId:(long long)groupId commerceShippingMethodId:(long long)commerceShippingMethodId commerceShippingFixedOptionId:(long long)commerceShippingFixedOptionId commerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId commerceCountryId:(long long)commerceCountryId commerceRegionId:(long long)commerceRegionId zip:(NSString *)zip weightFrom:(double)weightFrom weightTo:(double)weightTo fixedPrice:(NSDictionary *)fixedPrice rateUnitWeightPrice:(NSDictionary *)rateUnitWeightPrice ratePercentage:(double)ratePercentage error:(NSError **)error;
- (NSDictionary *)fetchCommerceShippingFixedOptionRelWithCommerceShippingFixedOptionRelId:(long long)commerceShippingFixedOptionRelId error:(NSError **)error;
- (NSArray *)getCommerceShippingMethodFixedOptionRelsWithCommerceShippingMethodId:(long long)commerceShippingMethodId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getCommerceShippingMethodFixedOptionRelsCountWithCommerceShippingMethodId:(long long)commerceShippingMethodId error:(NSError **)error;
- (NSDictionary *)updateCommerceShippingFixedOptionRelWithCommerceShippingFixedOptionRelId:(long long)commerceShippingFixedOptionRelId commerceInventoryWarehouseId:(long long)commerceInventoryWarehouseId commerceCountryId:(long long)commerceCountryId commerceRegionId:(long long)commerceRegionId zip:(NSString *)zip weightFrom:(double)weightFrom weightTo:(double)weightTo fixedPrice:(NSDictionary *)fixedPrice rateUnitWeightPrice:(NSDictionary *)rateUnitWeightPrice ratePercentage:(double)ratePercentage error:(NSError **)error;

@end