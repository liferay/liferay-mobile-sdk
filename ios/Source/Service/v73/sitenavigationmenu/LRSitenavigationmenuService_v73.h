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
@interface LRSitenavigationmenuService_v73 : LRBaseService

- (NSDictionary *)addSiteNavigationMenuWithGroupId:(long long)groupId name:(NSString *)name serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addSiteNavigationMenuWithGroupId:(long long)groupId name:(NSString *)name type:(int)type automatic:(BOOL)automatic serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addSiteNavigationMenuWithGroupId:(long long)groupId name:(NSString *)name type:(int)type serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateSiteNavigationMenuWithSiteNavigationMenuId:(long long)siteNavigationMenuId type:(int)type automatic:(BOOL)automatic serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateSiteNavigationMenuWithSiteNavigationMenuId:(long long)siteNavigationMenuId name:(NSString *)name serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSArray *)getSiteNavigationMenusWithGroupId:(long long)groupId keywords:(NSString *)keywords start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getSiteNavigationMenusWithGroupIds:(NSArray *)groupIds start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getSiteNavigationMenusWithGroupIds:(NSArray *)groupIds keywords:(NSString *)keywords start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getSiteNavigationMenusWithGroupId:(long long)groupId start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error;
- (NSArray *)getSiteNavigationMenusWithGroupId:(long long)groupId error:(NSError **)error;
- (NSDictionary *)deleteSiteNavigationMenuWithSiteNavigationMenuId:(long long)siteNavigationMenuId error:(NSError **)error;
- (NSDictionary *)fetchSiteNavigationMenuWithSiteNavigationMenuId:(long long)siteNavigationMenuId error:(NSError **)error;
- (NSNumber *)getSiteNavigationMenusCountWithGroupIds:(NSArray *)groupIds keywords:(NSString *)keywords error:(NSError **)error;
- (NSNumber *)getSiteNavigationMenusCountWithGroupIds:(NSArray *)groupIds error:(NSError **)error;
- (NSNumber *)getSiteNavigationMenusCountWithGroupId:(long long)groupId keywords:(NSString *)keywords error:(NSError **)error;
- (NSNumber *)getSiteNavigationMenusCountWithGroupId:(long long)groupId error:(NSError **)error;

@end
