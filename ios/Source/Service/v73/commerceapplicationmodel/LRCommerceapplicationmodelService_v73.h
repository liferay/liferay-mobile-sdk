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
@interface LRCommerceapplicationmodelService_v73 : LRBaseService

- (NSDictionary *)getCommerceApplicationModelWithCommerceApplicationModelId:(long long)commerceApplicationModelId error:(NSError **)error;
- (NSArray *)getCommerceApplicationModelsWithCommerceApplicationBrandId:(long long)commerceApplicationBrandId start:(int)start end:(int)end error:(NSError **)error;
- (NSNumber *)getCommerceApplicationModelsCountWithCommerceApplicationBrandId:(long long)commerceApplicationBrandId error:(NSError **)error;
- (NSNumber *)getCommerceApplicationModelsCountByCompanyIdWithCompanyId:(long long)companyId error:(NSError **)error;
- (NSArray *)getCommerceApplicationModelsByCompanyIdWithCompanyId:(long long)companyId start:(int)start end:(int)end error:(NSError **)error;
- (NSDictionary *)addCommerceApplicationModelWithUserId:(long long)userId commerceApplicationBrandId:(long long)commerceApplicationBrandId name:(NSString *)name year:(NSString *)year error:(NSError **)error;
- (void)deleteCommerceApplicationModelWithCommerceApplicationModelId:(long long)commerceApplicationModelId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)updateCommerceApplicationModelWithCommerceApplicationModelId:(long long)commerceApplicationModelId name:(NSString *)name year:(NSString *)year error:(NSError **)error;

@end