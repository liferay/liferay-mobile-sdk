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
@interface LRCommercecountryService_v73 : LRBaseService

- (NSDictionary *)setActiveWithCommerceCountryId:(long long)commerceCountryId active:(BOOL)active error:(NSError **)error;
- (NSDictionary *)getCommerceCountryWithCompanyId:(long long)companyId twoLettersISOCode:(NSString *)twoLettersISOCode error:(NSError **)error;
- (NSDictionary *)getCommerceCountryWithCommerceCountryId:(long long)commerceCountryId error:(NSError **)error;
- (NSDictionary *)fetchCommerceCountryWithCompanyId:(long long)companyId twoLettersISOCode:(NSString *)twoLettersISOCode error:(NSError **)error;
- (NSDictionary *)addCommerceCountryWithNameMap:(NSDictionary *)nameMap billingAllowed:(BOOL)billingAllowed shippingAllowed:(BOOL)shippingAllowed twoLettersISOCode:(NSString *)twoLettersISOCode threeLettersISOCode:(NSString *)threeLettersISOCode numericISOCode:(int)numericISOCode subjectToVAT:(BOOL)subjectToVAT priority:(double)priority active:(BOOL)active serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteCommerceCountryWithCommerceCountryId:(long long)commerceCountryId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSArray *)getBillingCommerceCountriesWithCompanyId:(long long)companyId billingAllowed:(BOOL)billingAllowed active:(BOOL)active error:(NSError **)error;
- (NSArray *)getBillingCommerceCountriesByChannelIdWithCommerceChannelId:(long long)commerceChannelId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getCommerceCountriesWithCompanyId:(long long)companyId active:(BOOL)active error:(NSError **)error;
- (NSArray *)getCommerceCountriesWithCompanyId:(long long)companyId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCommerceCountriesWithCompanyId:(long long)companyId active:(BOOL)active start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getCommerceCountriesCountWithCompanyId:(long long)companyId active:(BOOL)active error:(NSError **)error;
- (NSNumber *)getCommerceCountriesCountWithCompanyId:(long long)companyId error:(NSError **)error;
- (NSArray *)getShippingCommerceCountriesWithCompanyId:(long long)companyId shippingAllowed:(BOOL)shippingAllowed active:(BOOL)active error:(NSError **)error;
- (NSArray *)getShippingCommerceCountriesByChannelIdWithCommerceChannelId:(long long)commerceChannelId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getWarehouseCommerceCountriesWithCompanyId:(long long)companyId all:(BOOL)all error:(NSError **)error;
- (NSDictionary *)searchCommerceCountriesWithCompanyId:(long long)companyId active:(BOOL)active keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error;
- (NSDictionary *)searchCommerceCountriesWithSearchContext:(LRJSONObjectWrapper *)searchContext error:(NSError **)error;
- (NSDictionary *)updateCommerceCountryWithCommerceCountryId:(long long)commerceCountryId nameMap:(NSDictionary *)nameMap billingAllowed:(BOOL)billingAllowed shippingAllowed:(BOOL)shippingAllowed twoLettersISOCode:(NSString *)twoLettersISOCode threeLettersISOCode:(NSString *)threeLettersISOCode numericISOCode:(int)numericISOCode subjectToVAT:(BOOL)subjectToVAT priority:(double)priority active:(BOOL)active serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateCommerceCountryChannelFilterWithCommerceCountryId:(long long)commerceCountryId enable:(BOOL)enable error:(NSError **)error;

@end