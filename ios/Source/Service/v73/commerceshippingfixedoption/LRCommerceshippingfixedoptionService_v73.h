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
@interface LRCommerceshippingfixedoptionService_v73 : LRBaseService

- (NSDictionary *)addCommerceShippingFixedOptionWithCommerceShippingMethodId:(long long)commerceShippingMethodId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap amount:(NSDictionary *)amount priority:(double)priority serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addCommerceShippingFixedOptionWithUserId:(long long)userId groupId:(long long)groupId commerceShippingMethodId:(long long)commerceShippingMethodId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap amount:(NSDictionary *)amount priority:(double)priority error:(NSError **)error;
- (void)deleteCommerceShippingFixedOptionWithCommerceShippingFixedOptionId:(long long)commerceShippingFixedOptionId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSArray *)getCommerceShippingFixedOptionsWithCommerceShippingMethodId:(long long)commerceShippingMethodId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getCommerceShippingFixedOptionsWithCompanyId:(long long)companyId groupId:(long long)groupId commerceShippingMethodId:(long long)commerceShippingMethodId keywords:(NSString *)keywords start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getCommerceShippingFixedOptionsWithCommerceShippingMethodId:(long long)commerceShippingMethodId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getCommerceShippingFixedOptionsCountWithCommerceShippingMethodId:(long long)commerceShippingMethodId error:(NSError **)error;
- (NSDictionary *)updateCommerceShippingFixedOptionWithCommerceShippingFixedOptionId:(long long)commerceShippingFixedOptionId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap amount:(NSDictionary *)amount priority:(double)priority error:(NSError **)error;
- (NSDictionary *)fetchCommerceShippingFixedOptionWithCommerceShippingFixedOptionId:(long long)commerceShippingFixedOptionId error:(NSError **)error;

@end