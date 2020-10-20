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
@interface LRCommercechannelrelService_v73 : LRBaseService

- (void)deleteCommerceChannelRelsWithClassName:(NSString *)className classPK:(long long)classPK error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)addCommerceChannelRelWithClassName:(NSString *)className classPK:(long long)classPK commerceChannelId:(long long)commerceChannelId serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSNumber *)getCommerceChannelRelsCountWithClassName:(NSString *)className classPK:(long long)classPK error:(NSError **)error;
- (NSNumber *)getCommerceChannelRelsCountWithCommerceChannelId:(long long)commerceChannelId error:(NSError **)error;
- (NSNumber *)getCommerceChannelRelsCountWithClassName:(NSString *)className classPK:(long long)classPK name:(NSString *)name error:(NSError **)error;
- (NSNumber *)getCommerceChannelRelsCountWithClassName:(NSString *)className classPK:(long long)classPK classPKField:(NSString *)classPKField name:(NSString *)name error:(NSError **)error;
- (NSDictionary *)fetchCommerceChannelRelWithClassName:(NSString *)className classPK:(long long)classPK commerceChannelId:(long long)commerceChannelId error:(NSError **)error;
- (NSArray *)getCommerceChannelRelsWithClassName:(NSString *)className classPK:(long long)classPK start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCommerceChannelRelsWithClassName:(NSString *)className classPK:(long long)classPK classPKField:(NSString *)classPKField name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getCommerceChannelRelsWithClassName:(NSString *)className classPK:(long long)classPK name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getCommerceChannelRelsWithCommerceChannelId:(long long)commerceChannelId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (void)deleteCommerceChannelRelWithCommerceChannelRelId:(long long)commerceChannelRelId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)getCommerceChannelRelWithCommerceChannelRelId:(long long)commerceChannelRelId error:(NSError **)error;

@end