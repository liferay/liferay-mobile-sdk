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
@interface LRCpdefinitionoptionrelService_v73 : LRBaseService

- (NSDictionary *)addCpDefinitionOptionRelWithCpDefinitionId:(long long)cpDefinitionId cpOptionId:(long long)cpOptionId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmFormFieldTypeName:(NSString *)ddmFormFieldTypeName priority:(double)priority facetable:(BOOL)facetable required:(BOOL)required skuContributor:(BOOL)skuContributor importOptionValue:(BOOL)importOptionValue priceType:(NSString *)priceType serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addCpDefinitionOptionRelWithCpDefinitionId:(long long)cpDefinitionId cpOptionId:(long long)cpOptionId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmFormFieldTypeName:(NSString *)ddmFormFieldTypeName priority:(double)priority facetable:(BOOL)facetable required:(BOOL)required skuContributor:(BOOL)skuContributor importOptionValue:(BOOL)importOptionValue serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addCpDefinitionOptionRelWithCpDefinitionId:(long long)cpDefinitionId cpOptionId:(long long)cpOptionId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteCpDefinitionOptionRelWithCpDefinitionOptionRelId:(long long)cpDefinitionOptionRelId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchCpDefinitionOptionRelWithCpDefinitionId:(long long)cpDefinitionId cpOptionId:(long long)cpOptionId error:(NSError **)error;
- (NSDictionary *)fetchCpDefinitionOptionRelWithCpDefinitionOptionRelId:(long long)cpDefinitionOptionRelId error:(NSError **)error;
- (NSDictionary *)getCpDefinitionOptionRelWithCpDefinitionOptionRelId:(long long)cpDefinitionOptionRelId error:(NSError **)error;
- (NSDictionary *)getCpDefinitionOptionRelCpDefinitionOptionValueRelIdsWithCpDefinitionId:(long long)cpDefinitionId json:(NSString *)json error:(NSError **)error;
- (NSDictionary *)getCpDefinitionOptionRelKeysCpDefinitionOptionValueRelKeysWithCpInstanceId:(long long)cpInstanceId error:(NSError **)error;
- (NSArray *)getCpDefinitionOptionRelsWithCpDefinitionId:(long long)cpDefinitionId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCpDefinitionOptionRelsWithCpDefinitionId:(long long)cpDefinitionId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getCpDefinitionOptionRelsWithCpDefinitionId:(long long)cpDefinitionId skuContributor:(BOOL)skuContributor error:(NSError **)error;
- (NSNumber *)getCpDefinitionOptionRelsCountWithCpDefinitionId:(long long)cpDefinitionId error:(NSError **)error;
- (NSNumber *)getCpDefinitionOptionRelsCountWithCpDefinitionId:(long long)cpDefinitionId skuContributor:(BOOL)skuContributor error:(NSError **)error;
- (NSDictionary *)searchCpDefinitionOptionRelsWithCompanyId:(long long)companyId groupId:(long long)groupId cpDefinitionId:(long long)cpDefinitionId keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error;
- (NSDictionary *)updateCpDefinitionOptionRelWithCpDefinitionOptionRelId:(long long)cpDefinitionOptionRelId cpOptionId:(long long)cpOptionId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmFormFieldTypeName:(NSString *)ddmFormFieldTypeName priority:(double)priority facetable:(BOOL)facetable required:(BOOL)required skuContributor:(BOOL)skuContributor serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateCpDefinitionOptionRelWithCpDefinitionOptionRelId:(long long)cpDefinitionOptionRelId cpOptionId:(long long)cpOptionId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap ddmFormFieldTypeName:(NSString *)ddmFormFieldTypeName priority:(double)priority facetable:(BOOL)facetable required:(BOOL)required skuContributor:(BOOL)skuContributor priceType:(NSString *)priceType serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;

@end