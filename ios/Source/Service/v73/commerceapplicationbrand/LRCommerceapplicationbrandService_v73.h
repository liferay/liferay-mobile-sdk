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
@interface LRCommerceapplicationbrandService_v73 : LRBaseService

- (NSDictionary *)addCommerceApplicationBrandWithUserId:(long long)userId name:(NSString *)name logo:(BOOL)logo logoBytes:(NSData *)logoBytes error:(NSError **)error;
- (void)deleteCommerceApplicationBrandWithCommerceApplicationBrandId:(long long)commerceApplicationBrandId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)updateCommerceApplicationBrandWithCommerceApplicationBrandId:(long long)commerceApplicationBrandId name:(NSString *)name logo:(BOOL)logo logoBytes:(NSData *)logoBytes error:(NSError **)error;
- (NSDictionary *)getCommerceApplicationBrandWithCommerceApplicationBrandId:(long long)commerceApplicationBrandId error:(NSError **)error;
- (NSArray *)getCommerceApplicationBrandsWithCompanyId:(long long)companyId start:(int)start end:(int)end error:(NSError **)error;
- (NSNumber *)getCommerceApplicationBrandsCountWithCompanyId:(long long)companyId error:(NSError **)error;

@end