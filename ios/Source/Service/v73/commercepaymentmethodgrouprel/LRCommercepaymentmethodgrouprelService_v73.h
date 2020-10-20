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
@interface LRCommercepaymentmethodgrouprelService_v73 : LRBaseService

- (NSDictionary *)setActiveWithCommercePaymentMethodGroupRelId:(long long)commercePaymentMethodGroupRelId active:(BOOL)active error:(NSError **)error;
- (NSDictionary *)addCommerceAddressRestrictionWithClassPK:(long long)classPK commerceCountryId:(long long)commerceCountryId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addCommerceAddressRestrictionWithUserId:(long long)userId groupId:(long long)groupId classPK:(long long)classPK commerceCountryId:(long long)commerceCountryId error:(NSError **)error;
- (NSArray *)getCommerceAddressRestrictionsWithClassPK:(long long)classPK start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getCommerceAddressRestrictionsCountWithClassPK:(long long)classPK error:(NSError **)error;
- (void)deleteCommerceAddressRestrictionWithCommerceAddressRestrictionId:(long long)commerceAddressRestrictionId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)deleteCommerceAddressRestrictionsWithCommercePaymentMethodGroupRelId:(long long)commercePaymentMethodGroupRelId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)addCommercePaymentMethodGroupRelWithUserId:(long long)userId groupId:(long long)groupId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap imageFile:(LRUploadData *)imageFile engineKey:(NSString *)engineKey priority:(double)priority active:(BOOL)active error:(NSError **)error;
- (void)deleteCommercePaymentMethodGroupRelWithCommercePaymentMethodGroupRelId:(long long)commercePaymentMethodGroupRelId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchCommercePaymentMethodGroupRelWithGroupId:(long long)groupId engineKey:(NSString *)engineKey error:(NSError **)error;
- (NSDictionary *)getCommercePaymentMethodGroupRelWithCommercePaymentMethodGroupRelId:(long long)commercePaymentMethodGroupRelId error:(NSError **)error;
- (NSDictionary *)getCommercePaymentMethodGroupRelWithGroupId:(long long)groupId engineKey:(NSString *)engineKey error:(NSError **)error;
- (NSArray *)getCommercePaymentMethodGroupRelsWithGroupId:(long long)groupId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCommercePaymentMethodGroupRelsWithGroupId:(long long)groupId active:(BOOL)active start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCommercePaymentMethodGroupRelsWithGroupId:(long long)groupId commerceCountryId:(long long)commerceCountryId active:(BOOL)active error:(NSError **)error;
- (NSArray *)getCommercePaymentMethodGroupRelsWithGroupId:(long long)groupId error:(NSError **)error;
- (NSArray *)getCommercePaymentMethodGroupRelsWithGroupId:(long long)groupId active:(BOOL)active error:(NSError **)error;
- (NSArray *)getCommercePaymentMethodGroupRelsWithGroupId:(long long)groupId active:(BOOL)active start:(int)start end:(int)end error:(NSError **)error;
- (NSNumber *)getCommercePaymentMethodGroupRelsCountWithGroupId:(long long)groupId active:(BOOL)active error:(NSError **)error;
- (NSNumber *)getCommercePaymentMethodGroupRelsCountWithGroupId:(long long)groupId error:(NSError **)error;
- (NSDictionary *)updateCommercePaymentMethodGroupRelWithCommercePaymentMethodGroupRelId:(long long)commercePaymentMethodGroupRelId nameMap:(NSDictionary *)nameMap descriptionMap:(NSDictionary *)descriptionMap imageFile:(LRUploadData *)imageFile priority:(double)priority active:(BOOL)active error:(NSError **)error;

@end