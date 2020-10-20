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
@interface LRCommercepricingclassService_v73 : LRBaseService

- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error;
- (NSDictionary *)addCommercePricingClassWithUserId:(long long)userId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addCommercePricingClassWithUserId:(long long)userId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)deleteCommercePricingClassWithCommercePricingClassId:(long long)commercePricingClassId error:(NSError **)error;
- (NSDictionary *)fetchCommercePricingClassWithCommercePricingClassId:(long long)commercePricingClassId error:(NSError **)error;
- (NSDictionary *)getCommercePricingClassWithCommercePricingClassId:(long long)commercePricingClassId error:(NSError **)error;
- (NSNumber *)getCommercePricingClassCountByCpDefinitionIdWithCpDefinitionId:(long long)cpDefinitionId title:(NSString *)title error:(NSError **)error;
- (NSArray *)getCommercePricingClassesWithCompanyId:(long long)companyId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getCommercePricingClassesCountWithCpDefinitionId:(long long)cpDefinitionId title:(NSString *)title error:(NSError **)error;
- (NSNumber *)getCommercePricingClassesCountWithCompanyId:(long long)companyId error:(NSError **)error;
- (NSDictionary *)searchCommercePricingClassesWithCompanyId:(long long)companyId keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error;
- (NSArray *)searchCommercePricingClassesByCpDefinitionIdWithCpDefinitionId:(long long)cpDefinitionId title:(NSString *)title start:(int)start end:(int)end error:(NSError **)error;
- (NSDictionary *)updateCommercePricingClassWithCommercePricingClassId:(long long)commercePricingClassId userId:(long long)userId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateCommercePricingClassExternalReferenceCodeWithCommercePricingClassId:(long long)commercePricingClassId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error;
- (NSDictionary *)upsertCommercePricingClassWithCommercePricingClassId:(long long)commercePricingClassId userId:(long long)userId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;

@end