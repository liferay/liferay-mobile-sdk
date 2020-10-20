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
@interface LRCommerceaccountorganizationrelService_v73 : LRBaseService

- (NSArray *)getCommerceAccountOrganizationRelsWithCommerceAccountId:(long long)commerceAccountId error:(NSError **)error;
- (NSArray *)getCommerceAccountOrganizationRelsWithCommerceAccountId:(long long)commerceAccountId start:(int)start end:(int)end error:(NSError **)error;
- (void)deleteCommerceAccountOrganizationRelWithCommerceAccountId:(long long)commerceAccountId organizationId:(long long)organizationId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)addCommerceAccountOrganizationRelWithCommerceAccountId:(long long)commerceAccountId organizationId:(long long)organizationId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)addCommerceAccountOrganizationRelsWithCommerceAccountId:(long long)commerceAccountId organizationIds:(NSArray *)organizationIds serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)deleteCommerceAccountOrganizationRelsWithCommerceAccountId:(long long)commerceAccountId organizationIds:(NSArray *)organizationIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSArray *)getCommerceAccountOrganizationRelsByOrganizationIdWithOrganizationId:(long long)organizationId start:(int)start end:(int)end error:(NSError **)error;
- (NSNumber *)getCommerceAccountOrganizationRelsByOrganizationIdCountWithOrganizationId:(long long)organizationId error:(NSError **)error;
- (NSNumber *)getCommerceAccountOrganizationRelsCountWithCommerceAccountId:(long long)commerceAccountId error:(NSError **)error;
- (NSDictionary *)fetchCommerceAccountOrganizationRelWithCommerceAccountOrganizationRelPK:(LRJSONObjectWrapper *)commerceAccountOrganizationRelPK error:(NSError **)error;
- (NSDictionary *)getCommerceAccountOrganizationRelWithCommerceAccountOrganizationRelPK:(LRJSONObjectWrapper *)commerceAccountOrganizationRelPK error:(NSError **)error;

@end