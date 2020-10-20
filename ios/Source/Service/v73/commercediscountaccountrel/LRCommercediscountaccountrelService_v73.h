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
@interface LRCommercediscountaccountrelService_v73 : LRBaseService

- (NSDictionary *)addCommerceDiscountAccountRelWithCommerceDiscountId:(long long)commerceDiscountId commerceAccountId:(long long)commerceAccountId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)getCommerceDiscountAccountRelWithCommerceDiscountAccountRelId:(long long)commerceDiscountAccountRelId error:(NSError **)error;
- (void)deleteCommerceDiscountAccountRelWithCommerceDiscountAccountRelId:(long long)commerceDiscountAccountRelId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)deleteCommerceDiscountAccountRelsByCommerceDiscountIdWithCommerceDiscountId:(long long)commerceDiscountId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchCommerceDiscountAccountRelWithCommerceDiscountId:(long long)commerceDiscountId commerceAccountId:(long long)commerceAccountId error:(NSError **)error;
- (NSArray *)getCommerceDiscountAccountRelsWithCommerceDiscountId:(long long)commerceDiscountId name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getCommerceDiscountAccountRelsWithCommerceDiscountId:(long long)commerceDiscountId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getCommerceDiscountAccountRelsCountWithCommerceDiscountId:(long long)commerceDiscountId error:(NSError **)error;
- (NSNumber *)getCommerceDiscountAccountRelsCountWithCommerceDiscountId:(long long)commerceDiscountId name:(NSString *)name error:(NSError **)error;

@end