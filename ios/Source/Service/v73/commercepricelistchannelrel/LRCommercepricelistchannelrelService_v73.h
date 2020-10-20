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
@interface LRCommercepricelistchannelrelService_v73 : LRBaseService

- (NSDictionary *)getCommercePriceListChannelRelWithCommercePriceListChannelRelId:(long long)commercePriceListChannelRelId error:(NSError **)error;
- (void)deleteCommercePriceListChannelRelWithCommercePriceListChannelRelId:(long long)commercePriceListChannelRelId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)fetchCommercePriceListChannelRelWithCommerceChannelId:(long long)commerceChannelId commercePriceListId:(long long)commercePriceListId error:(NSError **)error;
- (NSDictionary *)addCommercePriceListChannelRelWithCommercePriceListId:(long long)commercePriceListId commerceChannelId:(long long)commerceChannelId order:(int)order serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSArray *)getCommercePriceListChannelRelsWithCommercePriceListId:(long long)commercePriceListId name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getCommercePriceListChannelRelsWithCommercePriceListId:(long long)commercePriceListId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getCommercePriceListChannelRelsWithCommercePriceListId:(long long)commercePriceListId error:(NSError **)error;
- (NSNumber *)getCommercePriceListChannelRelsCountWithCommercePriceListId:(long long)commercePriceListId name:(NSString *)name error:(NSError **)error;
- (NSNumber *)getCommercePriceListChannelRelsCountWithCommercePriceListId:(long long)commercePriceListId error:(NSError **)error;

@end