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
@interface LRCommercediscountruleService_v73 : LRBaseService

- (NSDictionary *)addCommerceDiscountRuleWithCommerceDiscountId:(long long)commerceDiscountId name:(NSString *)name type:(NSString *)type typeSettings:(NSString *)typeSettings serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addCommerceDiscountRuleWithCommerceDiscountId:(long long)commerceDiscountId type:(NSString *)type typeSettings:(NSString *)typeSettings serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteCommerceDiscountRuleWithCommerceDiscountRuleId:(long long)commerceDiscountRuleId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSArray *)getCommerceDiscountRulesWithCommerceDiscountId:(long long)commerceDiscountId name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getCommerceDiscountRulesWithCommerceDiscountId:(long long)commerceDiscountId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getCommerceDiscountRulesCountWithCommerceDiscountId:(long long)commerceDiscountId error:(NSError **)error;
- (NSNumber *)getCommerceDiscountRulesCountWithCommerceDiscountId:(long long)commerceDiscountId name:(NSString *)name error:(NSError **)error;
- (NSDictionary *)updateCommerceDiscountRuleWithCommerceDiscountRuleId:(long long)commerceDiscountRuleId name:(NSString *)name type:(NSString *)type typeSettings:(NSString *)typeSettings error:(NSError **)error;
- (NSDictionary *)updateCommerceDiscountRuleWithCommerceDiscountRuleId:(long long)commerceDiscountRuleId type:(NSString *)type typeSettings:(NSString *)typeSettings error:(NSError **)error;
- (NSDictionary *)fetchCommerceDiscountRuleWithCommerceDiscountRuleId:(long long)commerceDiscountRuleId error:(NSError **)error;
- (NSDictionary *)getCommerceDiscountRuleWithCommerceDiscountRuleId:(long long)commerceDiscountRuleId error:(NSError **)error;

@end