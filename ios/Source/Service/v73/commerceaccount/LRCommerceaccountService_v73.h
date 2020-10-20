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
@interface LRCommerceaccountService_v73 : LRBaseService

- (NSDictionary *)setActiveWithCommerceAccountId:(long long)commerceAccountId active:(BOOL)active error:(NSError **)error;
- (NSDictionary *)getCommerceAccountWithCommerceAccountId:(long long)commerceAccountId error:(NSError **)error;
- (NSDictionary *)addBusinessCommerceAccountWithName:(NSString *)name parentCommerceAccountId:(long long)parentCommerceAccountId email:(NSString *)email taxId:(NSString *)taxId active:(BOOL)active externalReferenceCode:(NSString *)externalReferenceCode userIds:(NSArray *)userIds emailAddresses:(NSArray *)emailAddresses serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error;
- (NSDictionary *)addCommerceAccountWithName:(NSString *)name parentCommerceAccountId:(long long)parentCommerceAccountId email:(NSString *)email taxId:(NSString *)taxId type:(int)type active:(BOOL)active externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteCommerceAccountWithCommerceAccountId:(long long)commerceAccountId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchCommerceAccountWithCommerceAccountId:(long long)commerceAccountId error:(NSError **)error;
- (NSDictionary *)getPersonalCommerceAccountWithUserId:(long long)userId error:(NSError **)error;
- (NSArray *)getUserCommerceAccountsWithUserId:(long long)userId parentCommerceAccountId:(long long)parentCommerceAccountId commerceSiteType:(int)commerceSiteType keywords:(NSString *)keywords start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getUserCommerceAccountsWithUserId:(long long)userId parentCommerceAccountId:(long long)parentCommerceAccountId commerceSiteType:(int)commerceSiteType keywords:(NSString *)keywords active:(BOOL)active start:(int)start end:(int)end error:(NSError **)error;
- (NSNumber *)getUserCommerceAccountsCountWithUserId:(long long)userId parentCommerceAccountId:(long long)parentCommerceAccountId commerceSiteType:(int)commerceSiteType keywords:(NSString *)keywords error:(NSError **)error;
- (NSNumber *)getUserCommerceAccountsCountWithUserId:(long long)userId parentCommerceAccountId:(long long)parentCommerceAccountId commerceSiteType:(int)commerceSiteType keywords:(NSString *)keywords active:(BOOL)active error:(NSError **)error;
- (NSDictionary *)updateCommerceAccountWithCommerceAccountId:(long long)commerceAccountId name:(NSString *)name logo:(BOOL)logo logoBytes:(NSData *)logoBytes email:(NSString *)email taxId:(NSString *)taxId active:(BOOL)active defaultBillingAddressId:(long long)defaultBillingAddressId defaultShippingAddressId:(long long)defaultShippingAddressId externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateCommerceAccountWithCommerceAccountId:(long long)commerceAccountId name:(NSString *)name logo:(BOOL)logo logoBytes:(NSData *)logoBytes email:(NSString *)email taxId:(NSString *)taxId active:(BOOL)active defaultBillingAddressId:(long long)defaultBillingAddressId defaultShippingAddressId:(long long)defaultShippingAddressId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateCommerceAccountWithCommerceAccountId:(long long)commerceAccountId name:(NSString *)name logo:(BOOL)logo logoBytes:(NSData *)logoBytes email:(NSString *)email taxId:(NSString *)taxId active:(BOOL)active serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateDefaultBillingAddressWithCommerceAccountId:(long long)commerceAccountId commerceAddressId:(long long)commerceAddressId error:(NSError **)error;
- (NSDictionary *)updateDefaultShippingAddressWithCommerceAccountId:(long long)commerceAccountId commerceAddressId:(long long)commerceAddressId error:(NSError **)error;
- (NSDictionary *)upsertCommerceAccountWithName:(NSString *)name parentCommerceAccountId:(long long)parentCommerceAccountId logo:(BOOL)logo logoBytes:(NSData *)logoBytes email:(NSString *)email taxId:(NSString *)taxId type:(int)type active:(BOOL)active externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;

@end