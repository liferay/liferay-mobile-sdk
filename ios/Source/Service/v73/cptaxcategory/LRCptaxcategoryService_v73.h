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
@interface LRCptaxcategoryService_v73 : LRBaseService

- (NSDictionary *)addCpTaxCategoryWithExternalReferenceCode:(NSString *)externalReferenceCode nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addCpTaxCategoryWithNameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSNumber *)countCpTaxCategoriesByCompanyIdWithCompanyId:(long long)companyId keyword:(NSString *)keyword error:(NSError **)error;
- (void)deleteCpTaxCategoryWithCpTaxCategoryId:(long long)cpTaxCategoryId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSArray *)findCpTaxCategoriesByCompanyIdWithCompanyId:(long long)companyId keyword:(NSString *)keyword start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getCpTaxCategoriesWithCompanyId:(long long)companyId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCpTaxCategoriesWithCompanyId:(long long)companyId error:(NSError **)error;
- (NSNumber *)getCpTaxCategoriesCountWithCompanyId:(long long)companyId error:(NSError **)error;
- (NSDictionary *)updateCpTaxCategoryWithCpTaxCategoryId:(long long)cpTaxCategoryId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap error:(NSError **)error;
- (NSDictionary *)updateCpTaxCategoryWithExternalReferenceCode:(NSString *)externalReferenceCode cpTaxCategoryId:(long long)cpTaxCategoryId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap error:(NSError **)error;
- (NSDictionary *)getCpTaxCategoryWithCpTaxCategoryId:(long long)cpTaxCategoryId error:(NSError **)error;

@end