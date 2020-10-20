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
@interface LRLayoutSetService_v73 : LRBaseService

- (NSDictionary *)updateVirtualHostWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout virtualHostname:(NSString *)virtualHostname error:(NSError **)error;
- (void)updateLogoWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout hasLogo:(BOOL)hasLogo file:(LRUploadData *)file error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)updateLogoWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout hasLogo:(BOOL)hasLogo bytes:(NSData *)bytes error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)updateVirtualHostsWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout virtualHostnames:(NSDictionary *)virtualHostnames error:(NSError **)error;
- (NSDictionary *)updateLookAndFeelWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout themeId:(NSString *)themeId colorSchemeId:(NSString *)colorSchemeId css:(NSString *)css error:(NSError **)error;
- (NSDictionary *)updateSettingsWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout settings:(NSString *)settings error:(NSError **)error;
- (void)updateLayoutSetPrototypeLinkEnabledWithGroupId:(long long)groupId privateLayout:(BOOL)privateLayout layoutSetPrototypeLinkEnabled:(BOOL)layoutSetPrototypeLinkEnabled layoutSetPrototypeUuid:(NSString *)layoutSetPrototypeUuid error:(NSError **)error CONVERT_ERROR_TO_THROWS;

@end