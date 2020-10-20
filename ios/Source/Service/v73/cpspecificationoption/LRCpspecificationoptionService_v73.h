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
@interface LRCpspecificationoptionService_v73 : LRBaseService

- (NSDictionary *)fetchCpSpecificationOptionWithCompanyId:(long long)companyId key:(NSString *)key error:(NSError **)error;
- (NSDictionary *)getCpSpecificationOptionWithCpSpecificationOptionId:(long long)cpSpecificationOptionId error:(NSError **)error;
- (NSDictionary *)addCpSpecificationOptionWithCpOptionCategoryId:(long long)cpOptionCategoryId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap facetable:(BOOL)facetable key:(NSString *)key serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteCpSpecificationOptionWithCpSpecificationOptionId:(long long)cpSpecificationOptionId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)searchCpSpecificationOptionsWithCompanyId:(long long)companyId facetable:(BOOL)facetable keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error;
- (NSDictionary *)updateCpSpecificationOptionWithCpSpecificationOptionId:(long long)cpSpecificationOptionId cpOptionCategoryId:(long long)cpOptionCategoryId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap facetable:(BOOL)facetable key:(NSString *)key serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;

@end