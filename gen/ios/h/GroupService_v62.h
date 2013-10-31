/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

#import <Foundation/Foundation.h>
#import "BaseService.h"

/**
 * author Bruno Farache
 */
@interface GroupService_v62 : BaseService

- (void)unsetRoleGroups:(long)roleId groupIds:(NSArray *)groupIds;
- (NSDictionary *)addGroup:(long)parentGroupId name:(NSString *)name description:(NSString *)description type:(int)type friendlyURL:(NSString *)friendlyURL site:(BOOL)site active:(BOOL)active serviceContext:(NSDictionary *)serviceContext;
- (BOOL)hasUserGroup:(long)userId groupId:(long)groupId;
- (NSDictionary *)updateFriendlyUrl:(long)groupId friendlyURL:(NSString *)friendlyURL;
- (NSArray *)getOrganizationsGroups:(NSArray *)organizations;
- (void)checkRemoteStagingGroup:(long)groupId;
- (int)getUserPlacesCount;
- (void)enableStaging:(long)groupId;
- (NSArray *)getUserGroupsGroups:(NSArray *)userGroups;
- (int)getUserSitesGroupsCount;
- (NSDictionary *)getUserGroup:(long)companyId userId:(long)userId;
- (NSArray *)getUserOrganizationsGroups:(long)userId start:(int)start end:(int)end;
- (void)setRoleGroups:(long)roleId groupIds:(NSArray *)groupIds;
- (NSArray *)getManageableSites:(NSDictionary *)portlets max:(int)max;
- (void)addRoleGroups:(long)roleId groupIds:(NSArray *)groupIds;
- (NSArray *)getUserSites;
- (NSDictionary *)getGroup:(long)companyId name:(NSString *)name;
- (NSDictionary *)getCompanyGroup:(long)companyId;
- (NSArray *)getUserPlaces:(long)userId classNames:(NSArray *)classNames includeControlPanel:(BOOL)includeControlPanel max:(int)max;
- (void)disableStaging:(long)groupId;
- (void)deleteGroup:(long)groupId;
- (void)updateStagedPortlets:(long)groupId stagedPortletIds:(NSDictionary *)stagedPortletIds;
- (int)searchCount:(long)companyId name:(NSString *)name description:(NSString *)description params:(NSArray *)params;
- (NSArray *)getManageableSiteGroups:(NSDictionary *)portlets max:(int)max;
- (NSDictionary *)updateGroup:(long)groupId typeSettings:(NSString *)typeSettings;
- (NSArray *)search:(long)companyId name:(NSString *)name description:(NSString *)description params:(NSArray *)params start:(int)start end:(int)end;
- (NSArray *)getUserSitesGroups:(long)userId classNames:(NSArray *)classNames includeControlPanel:(BOOL)includeControlPanel max:(int)max;
- (NSArray *)getGroups:(long)companyId parentGroupId:(long)parentGroupId site:(BOOL)site;

@end