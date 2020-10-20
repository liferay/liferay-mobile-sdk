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
@interface LRCommercetaxfixedrateService_v73 : LRBaseService

- (NSDictionary *)addCommerceTaxFixedRateWithCommerceTaxMethodId:(long long)commerceTaxMethodId cpTaxCategoryId:(long long)cpTaxCategoryId rate:(double)rate serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addCommerceTaxFixedRateWithUserId:(long long)userId groupId:(long long)groupId commerceTaxMethodId:(long long)commerceTaxMethodId cpTaxCategoryId:(long long)cpTaxCategoryId rate:(double)rate error:(NSError **)error;
- (NSArray *)getCommerceTaxFixedRatesWithGroupId:(long long)groupId commerceTaxMethodId:(long long)commerceTaxMethodId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSDictionary *)fetchCommerceTaxFixedRateWithCommerceTaxFixedRateId:(long long)commerceTaxFixedRateId error:(NSError **)error;
- (NSDictionary *)fetchCommerceTaxFixedRateWithCpTaxCategoryId:(long long)cpTaxCategoryId commerceTaxMethodId:(long long)commerceTaxMethodId error:(NSError **)error;
- (NSNumber *)getCommerceTaxFixedRatesCountWithGroupId:(long long)groupId commerceTaxMethodId:(long long)commerceTaxMethodId error:(NSError **)error;
- (NSDictionary *)updateCommerceTaxFixedRateWithCommerceTaxFixedRateId:(long long)commerceTaxFixedRateId rate:(double)rate error:(NSError **)error;
- (void)deleteCommerceTaxFixedRateWithCommerceTaxFixedRateId:(long long)commerceTaxFixedRateId error:(NSError **)error CONVERT_ERROR_TO_THROWS;

@end