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
@interface LRCommercediscountrelService_v73 : LRBaseService

- (NSArray *)getClassPKsWithCommerceDiscountId:(long long)commerceDiscountId className:(NSString *)className error:(NSError **)error;
- (NSDictionary *)addCommerceDiscountRelWithCommerceDiscountId:(long long)commerceDiscountId className:(NSString *)className classPK:(long long)classPK serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteCommerceDiscountRelWithCommerceDiscountRelId:(long long)commerceDiscountRelId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchCommerceDiscountRelWithClassName:(NSString *)className classPK:(long long)classPK error:(NSError **)error;
- (NSArray *)getCommerceDiscountRelsWithCommerceDiscountId:(long long)commerceDiscountId className:(NSString *)className start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCommerceDiscountRelsWithCommerceDiscountId:(long long)commerceDiscountId className:(NSString *)className error:(NSError **)error;
- (NSArray *)getCategoriesByCommerceDiscountIdWithCommerceDiscountId:(long long)commerceDiscountId name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error;
- (NSNumber *)getCategoriesByCommerceDiscountIdCountWithCommerceDiscountId:(long long)commerceDiscountId name:(NSString *)name error:(NSError **)error;
- (NSNumber *)getCommerceDiscountRelsCountWithCommerceDiscountId:(long long)commerceDiscountId className:(NSString *)className error:(NSError **)error;
- (NSArray *)getCommercePricingClassesByCommerceDiscountIdWithCommerceDiscountId:(long long)commerceDiscountId title:(NSString *)title start:(int)start end:(int)end error:(NSError **)error;
- (NSNumber *)getCommercePricingClassesByCommerceDiscountIdCountWithCommerceDiscountId:(long long)commerceDiscountId title:(NSString *)title error:(NSError **)error;
- (NSArray *)getCpDefinitionsByCommerceDiscountIdWithCommerceDiscountId:(long long)commerceDiscountId name:(NSString *)name languageId:(NSString *)languageId start:(int)start end:(int)end error:(NSError **)error;
- (NSNumber *)getCpDefinitionsByCommerceDiscountIdCountWithCommerceDiscountId:(long long)commerceDiscountId name:(NSString *)name languageId:(NSString *)languageId error:(NSError **)error;
- (NSDictionary *)getCommerceDiscountRelWithCommerceDiscountRelId:(long long)commerceDiscountRelId error:(NSError **)error;

@end