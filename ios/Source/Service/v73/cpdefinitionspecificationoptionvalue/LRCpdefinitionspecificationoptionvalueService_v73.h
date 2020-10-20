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
@interface LRCpdefinitionspecificationoptionvalueService_v73 : LRBaseService

- (NSDictionary *)addCpDefinitionSpecificationOptionValueWithCpDefinitionId:(long long)cpDefinitionId cpSpecificationOptionId:(long long)cpSpecificationOptionId cpOptionCategoryId:(long long)cpOptionCategoryId valueMap:(NSDictionary *)valueMap priority:(double)priority serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteCpDefinitionSpecificationOptionValueWithCpDefinitionSpecificationOptionValueId:(long long)cpDefinitionSpecificationOptionValueId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchCpDefinitionSpecificationOptionValueWithCpDefinitionSpecificationOptionValueId:(long long)cpDefinitionSpecificationOptionValueId error:(NSError **)error;
- (NSArray *)getCpDefinitionSpecificationOptionValuesWithCpDefinitionId:(long long)cpDefinitionId cpOptionCategoryId:(long long)cpOptionCategoryId error:(NSError **)error;
- (NSArray *)getCpDefinitionSpecificationOptionValuesWithCpDefinitionId:(long long)cpDefinitionId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getCpDefinitionSpecificationOptionValuesCountWithCpDefinitionId:(long long)cpDefinitionId error:(NSError **)error;
- (NSDictionary *)updateCpDefinitionSpecificationOptionValueWithCpDefinitionSpecificationOptionValueId:(long long)cpDefinitionSpecificationOptionValueId cpOptionCategoryId:(long long)cpOptionCategoryId valueMap:(NSDictionary *)valueMap priority:(double)priority serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)getCpDefinitionSpecificationOptionValueWithCpDefinitionSpecificationOptionValueId:(long long)cpDefinitionSpecificationOptionValueId error:(NSError **)error;

@end