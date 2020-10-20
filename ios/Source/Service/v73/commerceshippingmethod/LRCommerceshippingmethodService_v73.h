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
@interface LRCommerceshippingmethodService_v73 : LRBaseService

- (NSDictionary *)fetchCommerceShippingMethodWithGroupId:(long long)groupId engineKey:(NSString *)engineKey error:(NSError **)error;
- (NSArray *)getCommerceShippingMethodsWithGroupId:(long long)groupId error:(NSError **)error;
- (NSArray *)getCommerceShippingMethodsWithGroupId:(long long)groupId active:(BOOL)active error:(NSError **)error;
- (NSArray *)getCommerceShippingMethodsWithGroupId:(long long)groupId commerceCountryId:(long long)commerceCountryId active:(BOOL)active error:(NSError **)error;
- (NSDictionary *)updateCommerceShippingMethodWithCommerceShippingMethodId:(long long)commerceShippingMethodId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap imageFile:(LRUploadData *)imageFile priority:(double)priority active:(BOOL)active error:(NSError **)error;
- (NSDictionary *)setActiveWithCommerceShippingMethodId:(long long)commerceShippingMethodId active:(BOOL)active error:(NSError **)error;
- (NSDictionary *)createCommerceShippingMethodWithCommerceShippingMethodId:(long long)commerceShippingMethodId error:(NSError **)error;
- (NSDictionary *)addCommerceAddressRestrictionWithCommerceShippingMethodId:(long long)commerceShippingMethodId commerceCountryId:(long long)commerceCountryId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addCommerceAddressRestrictionWithUserId:(long long)userId groupId:(long long)groupId commerceShippingMethodId:(long long)commerceShippingMethodId commerceCountryId:(long long)commerceCountryId error:(NSError **)error;
- (NSDictionary *)addCommerceShippingMethodWithUserId:(long long)userId groupId:(long long)groupId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap imageFile:(LRUploadData *)imageFile engineKey:(NSString *)engineKey priority:(double)priority active:(BOOL)active error:(NSError **)error;
- (NSDictionary *)getCommerceShippingMethodWithCommerceShippingMethodId:(long long)commerceShippingMethodId error:(NSError **)error;
- (NSArray *)getCommerceAddressRestrictionsWithCommerceShippingMethodId:(long long)commerceShippingMethodId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getCommerceAddressRestrictionsCountWithCommerceShippingMethodId:(long long)commerceShippingMethodId error:(NSError **)error;
- (void)deleteCommerceAddressRestrictionWithCommerceAddressRestrictionId:(long long)commerceAddressRestrictionId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)deleteCommerceAddressRestrictionsWithCommerceShippingMethodId:(long long)commerceShippingMethodId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)deleteCommerceShippingMethodWithCommerceShippingMethodId:(long long)commerceShippingMethodId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSNumber *)getCommerceShippingMethodsCountWithGroupId:(long long)groupId active:(BOOL)active error:(NSError **)error;

@end