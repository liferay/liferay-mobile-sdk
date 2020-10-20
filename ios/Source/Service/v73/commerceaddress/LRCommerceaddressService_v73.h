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
@interface LRCommerceaddressService_v73 : LRBaseService

- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error;
- (NSDictionary *)addCommerceAddressWithClassName:(NSString *)className classPK:(long long)classPK name:(NSString *)name description:(NSString *)description street1:(NSString *)street1 street2:(NSString *)street2 street3:(NSString *)street3 city:(NSString *)city zip:(NSString *)zip commerceRegionId:(long long)commerceRegionId commerceCountryId:(long long)commerceCountryId phoneNumber:(NSString *)phoneNumber type:(int)type externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addCommerceAddressWithClassName:(NSString *)className classPK:(long long)classPK name:(NSString *)name description:(NSString *)description street1:(NSString *)street1 street2:(NSString *)street2 street3:(NSString *)street3 city:(NSString *)city zip:(NSString *)zip commerceRegionId:(long long)commerceRegionId commerceCountryId:(long long)commerceCountryId phoneNumber:(NSString *)phoneNumber type:(int)type serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addCommerceAddressWithClassName:(NSString *)className classPK:(long long)classPK name:(NSString *)name description:(NSString *)description street1:(NSString *)street1 street2:(NSString *)street2 street3:(NSString *)street3 city:(NSString *)city zip:(NSString *)zip commerceRegionId:(long long)commerceRegionId commerceCountryId:(long long)commerceCountryId phoneNumber:(NSString *)phoneNumber defaultBilling:(BOOL)defaultBilling defaultShipping:(BOOL)defaultShipping serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteCommerceAddressWithCommerceAddressId:(long long)commerceAddressId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSArray *)getBillingCommerceAddressesWithCompanyId:(long long)companyId className:(NSString *)className classPK:(long long)classPK error:(NSError **)error;
- (NSArray *)getBillingCommerceAddressesWithCompanyId:(long long)companyId className:(NSString *)className classPK:(long long)classPK keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error;
- (NSNumber *)getBillingCommerceAddressesCountWithCompanyId:(long long)companyId className:(NSString *)className classPK:(long long)classPK keywords:(NSString *)keywords error:(NSError **)error;
- (NSArray *)getCommerceAddressesWithClassName:(NSString *)className classPK:(long long)classPK start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCommerceAddressesWithGroupId:(long long)groupId className:(NSString *)className classPK:(long long)classPK error:(NSError **)error;
- (NSArray *)getCommerceAddressesWithGroupId:(long long)groupId className:(NSString *)className classPK:(long long)classPK start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCommerceAddressesByCompanyIdWithCompanyId:(long long)companyId className:(NSString *)className classPK:(long long)classPK error:(NSError **)error;
- (NSArray *)getCommerceAddressesByCompanyIdWithCompanyId:(long long)companyId className:(NSString *)className classPK:(long long)classPK start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getCommerceAddressesCountWithClassName:(NSString *)className classPK:(long long)classPK error:(NSError **)error;
- (NSNumber *)getCommerceAddressesCountWithGroupId:(long long)groupId className:(NSString *)className classPK:(long long)classPK error:(NSError **)error;
- (NSNumber *)getCommerceAddressesCountByCompanyIdWithCompanyId:(long long)companyId className:(NSString *)className classPK:(long long)classPK error:(NSError **)error;
- (NSArray *)getShippingCommerceAddressesWithCompanyId:(long long)companyId className:(NSString *)className classPK:(long long)classPK keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error;
- (NSArray *)getShippingCommerceAddressesWithCompanyId:(long long)companyId className:(NSString *)className classPK:(long long)classPK error:(NSError **)error;
- (NSNumber *)getShippingCommerceAddressesCountWithCompanyId:(long long)companyId className:(NSString *)className classPK:(long long)classPK keywords:(NSString *)keywords error:(NSError **)error;
- (NSDictionary *)searchCommerceAddressesWithCompanyId:(long long)companyId groupId:(long long)groupId className:(NSString *)className classPK:(long long)classPK keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error;
- (NSDictionary *)searchCommerceAddressesWithCompanyId:(long long)companyId className:(NSString *)className classPK:(long long)classPK keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error;
- (NSDictionary *)updateCommerceAddressWithCommerceAddressId:(long long)commerceAddressId name:(NSString *)name description:(NSString *)description street1:(NSString *)street1 street2:(NSString *)street2 street3:(NSString *)street3 city:(NSString *)city zip:(NSString *)zip commerceRegionId:(long long)commerceRegionId commerceCountryId:(long long)commerceCountryId phoneNumber:(NSString *)phoneNumber type:(int)type serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateCommerceAddressWithCommerceAddressId:(long long)commerceAddressId name:(NSString *)name description:(NSString *)description street1:(NSString *)street1 street2:(NSString *)street2 street3:(NSString *)street3 city:(NSString *)city zip:(NSString *)zip commerceRegionId:(long long)commerceRegionId commerceCountryId:(long long)commerceCountryId phoneNumber:(NSString *)phoneNumber defaultBilling:(BOOL)defaultBilling defaultShipping:(BOOL)defaultShipping serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)fetchCommerceAddressWithCommerceAddressId:(long long)commerceAddressId error:(NSError **)error;
- (NSDictionary *)getCommerceAddressWithCommerceAddressId:(long long)commerceAddressId error:(NSError **)error;

@end