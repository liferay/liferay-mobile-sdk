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
@interface LRCommerceaccountgrouprelService_v73 : LRBaseService

- (void)deleteCommerceAccountGroupRelsWithClassName:(NSString *)className classPK:(long long)classPK error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)addCommerceAccountGroupRelWithClassName:(NSString *)className classPK:(long long)classPK commerceAccountGroupId:(long long)commerceAccountGroupId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSArray *)getCommerceAccountGroupRelsWithClassName:(NSString *)className classPK:(long long)classPK start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCommerceAccountGroupRelsWithCommerceAccountGroupId:(long long)commerceAccountGroupId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSNumber *)getCommerceAccountGroupRelsCountWithClassName:(NSString *)className classPK:(long long)classPK error:(NSError **)error;
- (NSNumber *)getCommerceAccountGroupRelsCountWithCommerceAccountGroupId:(long long)commerceAccountGroupId error:(NSError **)error;
- (void)deleteCommerceAccountGroupRelWithCommerceAccountGroupRelId:(long long)commerceAccountGroupRelId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)getCommerceAccountGroupRelWithCommerceAccountGroupRelId:(long long)commerceAccountGroupRelId error:(NSError **)error;

@end