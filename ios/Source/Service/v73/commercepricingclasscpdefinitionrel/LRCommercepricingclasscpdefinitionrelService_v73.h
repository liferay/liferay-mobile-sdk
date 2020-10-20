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
@interface LRCommercepricingclasscpdefinitionrelService_v73 : LRBaseService

- (NSArray *)searchByCommercePricingClassIdWithCommercePricingClassId:(long long)commercePricingClassId name:(NSString *)name languageId:(NSString *)languageId start:(int)start end:(int)end error:(NSError **)error;
- (NSDictionary *)addCommercePricingClassCpDefinitionRelWithCommercePricingClassId:(long long)commercePricingClassId cpDefinitionId:(long long)cpDefinitionId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)fetchCommercePricingClassCpDefinitionRelWithCommercePricingClassId:(long long)commercePricingClassId cpDefinitionId:(long long)cpDefinitionId error:(NSError **)error;
- (NSDictionary *)deleteCommercePricingClassCpDefinitionRelWithCommercePricingClassCPDefinitionRelId:(long long)commercePricingClassCPDefinitionRelId error:(NSError **)error;
- (NSDictionary *)deleteCommercePricingClassCpDefinitionRelWithCommercePricingClassCPDefinitionRel:(LRJSONObjectWrapper *)commercePricingClassCPDefinitionRel error:(NSError **)error;
- (NSArray *)getCpDefinitionIdsWithCommercePricingClassId:(long long)commercePricingClassId error:(NSError **)error;
- (NSArray *)getCommercePricingClassCpDefinitionRelsWithCommercePricingClassId:(long long)commercePricingClassId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getCommercePricingClassCpDefinitionRelsCountWithCommercePricingClassId:(long long)commercePricingClassId error:(NSError **)error;
- (NSNumber *)getCommercePricingClassCpDefinitionRelsCountWithCommercePricingClassId:(long long)commercePricingClassId name:(NSString *)name languageId:(NSString *)languageId error:(NSError **)error;
- (NSArray *)getCommercePricingClassCpDefinitionRelByClassIdWithCommercePricingClassId:(long long)commercePricingClassId error:(NSError **)error;
- (NSDictionary *)getCommercePricingClassCpDefinitionRelWithCommercePricingClassCPDefinitionRelId:(long long)commercePricingClassCPDefinitionRelId error:(NSError **)error;

@end