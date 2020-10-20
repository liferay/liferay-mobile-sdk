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
@interface LRCpoptioncategoryService_v73 : LRBaseService

- (NSDictionary *)getCpOptionCategoryWithCpOptionCategoryId:(long long)cpOptionCategoryId error:(NSError **)error;
- (NSDictionary *)addCpOptionCategoryWithTitleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap priority:(double)priority key:(NSString *)key serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteCpOptionCategoryWithCpOptionCategoryId:(long long)cpOptionCategoryId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchCpOptionCategoryWithCpOptionCategoryId:(long long)cpOptionCategoryId error:(NSError **)error;
- (NSDictionary *)searchCpOptionCategoriesWithCompanyId:(long long)companyId keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error;
- (NSDictionary *)updateCpOptionCategoryWithCpOptionCategoryId:(long long)cpOptionCategoryId titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap priority:(double)priority key:(NSString *)key error:(NSError **)error;

@end