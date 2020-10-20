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
@interface LRCommerceaccountgroupService_v73 : LRBaseService

- (NSDictionary *)getCommerceAccountGroupWithCommerceAccountGroupId:(long long)commerceAccountGroupId error:(NSError **)error;
- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error;
- (NSDictionary *)addCommerceAccountGroupWithCompanyId:(long long)companyId name:(NSString *)name type:(int)type externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteCommerceAccountGroupWithCommerceAccountGroupId:(long long)commerceAccountGroupId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSArray *)getCommerceAccountGroupsWithCompanyId:(long long)companyId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getCommerceAccountGroupsCountWithCompanyId:(long long)companyId error:(NSError **)error;
- (NSArray *)searchCommerceAccountGroupsWithCompanyId:(long long)companyId keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error;
- (NSNumber *)searchCommerceAccountsGroupCountWithCompanyId:(long long)companyId keywords:(NSString *)keywords error:(NSError **)error;
- (NSDictionary *)updateCommerceAccountGroupWithCommerceAccountGroupId:(long long)commerceAccountGroupId name:(NSString *)name serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;

@end