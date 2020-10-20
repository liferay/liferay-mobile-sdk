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
@interface LRCommerceaccountuserrelService_v73 : LRBaseService

- (NSArray *)getCommerceAccountUserRelsWithCommerceAccountId:(long long)commerceAccountId start:(int)start end:(int)end error:(NSError **)error;
- (void)addCommerceAccountUserRelsWithCommerceAccountId:(long long)commerceAccountId userIds:(NSArray *)userIds emailAddresses:(NSArray *)emailAddresses roleIds:(NSArray *)roleIds serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)addCommerceAccountUserRelWithCommerceAccountId:(long long)commerceAccountId commerceAccountUserId:(long long)commerceAccountUserId roleIds:(NSArray *)roleIds serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)inviteUserWithCommerceAccountId:(long long)commerceAccountId emailAddress:(NSString *)emailAddress roleIds:(NSArray *)roleIds userExternalReferenceCode:(NSString *)userExternalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteCommerceAccountUserRelsWithCommerceAccountId:(long long)commerceAccountId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)deleteCommerceAccountUserRelsWithCommerceAccountId:(long long)commerceAccountId userIds:(NSArray *)userIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSNumber *)getCommerceAccountUserRelsCountWithCommerceAccountId:(long long)commerceAccountId error:(NSError **)error;
- (void)deleteCommerceAccountUserRelWithCommerceAccountId:(long long)commerceAccountId userId:(long long)userId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchCommerceAccountUserRelWithCommerceAccountUserRelPK:(LRJSONObjectWrapper *)commerceAccountUserRelPK error:(NSError **)error;
- (NSDictionary *)getCommerceAccountUserRelWithCommerceAccountUserRelPK:(LRJSONObjectWrapper *)commerceAccountUserRelPK error:(NSError **)error;

@end