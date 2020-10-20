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
@interface LRCommercetaxfixedrateaddressrelService_v73 : LRBaseService

- (NSDictionary *)addCommerceTaxFixedRateAddressRelWithCommerceTaxMethodId:(long long)commerceTaxMethodId cpTaxCategoryId:(long long)cpTaxCategoryId commerceCountryId:(long long)commerceCountryId commerceRegionId:(long long)commerceRegionId zip:(NSString *)zip rate:(double)rate serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addCommerceTaxFixedRateAddressRelWithUserId:(long long)userId groupId:(long long)groupId commerceTaxMethodId:(long long)commerceTaxMethodId cpTaxCategoryId:(long long)cpTaxCategoryId commerceCountryId:(long long)commerceCountryId commerceRegionId:(long long)commerceRegionId zip:(NSString *)zip rate:(double)rate error:(NSError **)error;
- (void)deleteCommerceTaxFixedRateAddressRelWithCommerceTaxFixedRateAddressRelId:(long long)commerceTaxFixedRateAddressRelId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchCommerceTaxFixedRateAddressRelWithCommerceTaxFixedRateAddressRelId:(long long)commerceTaxFixedRateAddressRelId error:(NSError **)error;
- (NSArray *)getCommerceTaxMethodFixedRateAddressRelsWithGroupId:(long long)groupId commerceTaxMethodId:(long long)commerceTaxMethodId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getCommerceTaxMethodFixedRateAddressRelsCountWithGroupId:(long long)groupId commerceTaxMethodId:(long long)commerceTaxMethodId error:(NSError **)error;
- (NSDictionary *)updateCommerceTaxFixedRateAddressRelWithCommerceTaxFixedRateAddressRelId:(long long)commerceTaxFixedRateAddressRelId commerceCountryId:(long long)commerceCountryId commerceRegionId:(long long)commerceRegionId zip:(NSString *)zip rate:(double)rate error:(NSError **)error;

@end