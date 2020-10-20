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
@interface LRCommercechannelService_v73 : LRBaseService

- (NSDictionary *)getCommerceChannelWithCommerceChannelId:(long long)commerceChannelId error:(NSError **)error;
- (NSDictionary *)addCommerceChannelWithSiteGroupId:(long long)siteGroupId name:(NSString *)name type:(NSString *)type typeSettingsUnicodeProperties:(NSDictionary *)typeSettingsUnicodeProperties commerceCurrencyCode:(NSString *)commerceCurrencyCode externalReferenceCode:(NSString *)externalReferenceCode serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)deleteCommerceChannelWithCommerceChannelId:(long long)commerceChannelId error:(NSError **)error;
- (NSDictionary *)fetchByExternalReferenceCodeWithCompanyId:(long long)companyId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error;
- (NSDictionary *)fetchCommerceChannelWithCommerceChannelId:(long long)commerceChannelId error:(NSError **)error;
- (NSDictionary *)getCommerceChannelByOrderGroupIdWithGroupId:(long long)groupId error:(NSError **)error;
- (NSArray *)getCommerceChannelsWithStart:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getCommerceChannelsWithCompanyId:(long long)companyId error:(NSError **)error;
- (NSArray *)searchCommerceChannelsWithCompanyId:(long long)companyId keywords:(NSString *)keywords start:(int)start end:(int)end sort:(LRJSONObjectWrapper *)sort error:(NSError **)error;
- (NSArray *)searchCommerceChannelsWithCompanyId:(long long)companyId error:(NSError **)error;
- (NSNumber *)searchCommerceChannelsCountWithCompanyId:(long long)companyId keywords:(NSString *)keywords error:(NSError **)error;
- (NSDictionary *)updateCommerceChannelWithCommerceChannelId:(long long)commerceChannelId siteGroupId:(long long)siteGroupId name:(NSString *)name type:(NSString *)type typeSettingsUnicodeProperties:(NSDictionary *)typeSettingsUnicodeProperties commerceCurrencyCode:(NSString *)commerceCurrencyCode priceDisplayType:(NSString *)priceDisplayType discountsTargetNetPrice:(BOOL)discountsTargetNetPrice error:(NSError **)error;
- (NSDictionary *)updateCommerceChannelWithCommerceChannelId:(long long)commerceChannelId siteGroupId:(long long)siteGroupId name:(NSString *)name type:(NSString *)type typeSettingsUnicodeProperties:(NSDictionary *)typeSettingsUnicodeProperties commerceCurrencyCode:(NSString *)commerceCurrencyCode error:(NSError **)error;
- (NSDictionary *)updateCommerceChannelExternalReferenceCodeWithCommerceChannelId:(long long)commerceChannelId externalReferenceCode:(NSString *)externalReferenceCode error:(NSError **)error;

@end