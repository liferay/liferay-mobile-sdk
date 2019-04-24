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
@interface LRSitenavigationmenuitemService_v72 : LRBaseService

- (NSArray *)getSiteNavigationMenuItemsWithSiteNavigationMenuId:(long long)siteNavigationMenuId error:(NSError **)error;
- (NSDictionary *)deleteSiteNavigationMenuItemWithSiteNavigationMenuItemId:(long long)siteNavigationMenuItemId error:(NSError **)error;
- (void)deleteSiteNavigationMenuItemsWithSiteNavigationMenuId:(long long)siteNavigationMenuId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)addSiteNavigationMenuItemWithGroupId:(long long)groupId siteNavigationMenuId:(long long)siteNavigationMenuId parentSiteNavigationMenuItemId:(long long)parentSiteNavigationMenuItemId type:(NSString *)type typeSettings:(NSString *)typeSettings serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateSiteNavigationMenuItemWithSiteNavigationMenuId:(long long)siteNavigationMenuId parentSiteNavigationMenuItemId:(long long)parentSiteNavigationMenuItemId order:(int)order error:(NSError **)error;
- (NSDictionary *)updateSiteNavigationMenuItemWithSiteNavigationMenuId:(long long)siteNavigationMenuId typeSettings:(NSString *)typeSettings serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;

@end