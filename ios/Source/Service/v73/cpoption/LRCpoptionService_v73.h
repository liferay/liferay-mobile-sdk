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
@interface LRCpoptionService_v73 : LRBaseService

- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error;
- (NSDictionary *)getCpOptionWithCpOptionId:(long long)cpOptionId error:(NSError **)error;
- (NSDictionary *)searchCpOptionsWithCompanyId:(long long)companyId keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error;
- (NSDictionary *)addCpOptionWithNameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmFormFieldTypeName:(NSString *)ddmFormFieldTypeName facetable:(BOOL)facetable required:(BOOL)required skuContributor:(BOOL)skuContributor key:(NSString *)key serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)fetchCpOptionWithCompanyId:(long long)companyId key:(NSString *)key error:(NSError **)error;
- (NSDictionary *)fetchCpOptionWithCpOptionId:(long long)cpOptionId error:(NSError **)error;
- (void)deleteCpOptionWithCpOptionId:(long long)cpOptionId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSArray *)findCpOptionByCompanyIdWithCompanyId:(long long)companyId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSDictionary *)updateCpOptionWithCpOptionId:(long long)cpOptionId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmFormFieldTypeName:(NSString *)ddmFormFieldTypeName facetable:(BOOL)facetable required:(BOOL)required skuContributor:(BOOL)skuContributor key:(NSString *)key serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)upsertCpOptionWithNameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmFormFieldTypeName:(NSString *)ddmFormFieldTypeName facetable:(BOOL)facetable required:(BOOL)required skuContributor:(BOOL)skuContributor key:(NSString *)key externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;

@end