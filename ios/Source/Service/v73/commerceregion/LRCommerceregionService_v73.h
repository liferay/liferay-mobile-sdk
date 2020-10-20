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
@interface LRCommerceregionService_v73 : LRBaseService

- (NSDictionary *)setActiveWithCommerceRegionId:(long long)commerceRegionId active:(BOOL)active error:(NSError **)error;
- (NSDictionary *)getCommerceRegionWithCommerceRegionId:(long long)commerceRegionId error:(NSError **)error;
- (void)deleteCommerceRegionWithCommerceRegionId:(long long)commerceRegionId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)addCommerceRegionWithCommerceCountryId:(long long)commerceCountryId name:(NSString *)name code:(NSString *)code priority:(double)priority active:(BOOL)active serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSArray *)getCommerceRegionsWithCommerceCountryId:(long long)commerceCountryId active:(BOOL)active start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCommerceRegionsWithCompanyId:(long long)companyId countryTwoLettersISOCode:(NSString *)countryTwoLettersISOCode active:(BOOL)active error:(NSError **)error;
- (NSArray *)getCommerceRegionsWithCommerceCountryId:(long long)commerceCountryId active:(BOOL)active error:(NSError **)error;
- (NSArray *)getCommerceRegionsWithCommerceCountryId:(long long)commerceCountryId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getCommerceRegionsCountWithCommerceCountryId:(long long)commerceCountryId active:(BOOL)active error:(NSError **)error;
- (NSNumber *)getCommerceRegionsCountWithCommerceCountryId:(long long)commerceCountryId error:(NSError **)error;
- (NSDictionary *)updateCommerceRegionWithCommerceRegionId:(long long)commerceRegionId name:(NSString *)name code:(NSString *)code priority:(double)priority active:(BOOL)active serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;

@end