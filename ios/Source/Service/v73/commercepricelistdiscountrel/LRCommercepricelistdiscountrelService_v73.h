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
@interface LRCommercepricelistdiscountrelService_v73 : LRBaseService

- (NSDictionary *)addCommercePriceListDiscountRelWithCommercePriceListId:(long long)commercePriceListId commerceDiscountId:(long long)commerceDiscountId order:(int)order serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)getCommercePriceListDiscountRelWithCommercePriceListDiscountRelId:(long long)commercePriceListDiscountRelId error:(NSError **)error;
- (void)deleteCommercePriceListDiscountRelWithCommercePriceListDiscountRelId:(long long)commercePriceListDiscountRelId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchCommercePriceListDiscountRelWithCommercePriceListId:(long long)commercePriceListId commerceDiscountId:(long long)commerceDiscountId error:(NSError **)error;
- (NSArray *)getCommercePriceListDiscountRelsWithCommercePriceListId:(long long)commercePriceListId error:(NSError **)error;
- (NSArray *)getCommercePriceListDiscountRelsWithCommercePriceListId:(long long)commercePriceListId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getCommercePriceListDiscountRelsCountWithCommercePriceListId:(long long)commercePriceListId error:(NSError **)error;

@end