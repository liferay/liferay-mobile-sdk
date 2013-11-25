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
#import "LRBaseService.h"

/**
 * author Bruno Farache
 */
@interface LRGroupService_v62 : LRBaseService

- (NSDictionary *)addGroupWithParentGroupId:(long)parentGroupId liveGroupId:(long)liveGroupId name:(NSString *)name description:(NSString *)description type:(int)type manualMembership:(BOOL)manualMembership membershipRestriction:(int)membershipRestriction friendlyURL:(NSString *)friendlyURL site:(BOOL)site active:(BOOL)active serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addGroupWithName:(NSString *)name description:(NSString *)description type:(int)type friendlyURL:(NSString *)friendlyURL site:(BOOL)site active:(BOOL)active serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addGroupWithParentGroupId:(long)parentGroupId name:(NSString *)name description:(NSString *)description type:(int)type friendlyURL:(NSString *)friendlyURL site:(BOOL)site active:(BOOL)active serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)addRoleGroupsWithRoleId:(long)roleId groupIds:(NSArray *)groupIds error:(NSError **)error;
- (void)checkRemoteStagingGroupWithGroupId:(long)groupId error:(NSError **)error;
- (void)deleteGroupWithGroupId:(long)groupId error:(NSError **)error;
- (void)disableStagingWithGroupId:(long)groupId error:(NSError **)error;
- (void)enableStagingWithGroupId:(long)groupId error:(NSError **)error;
- (NSDictionary *)getCompanyGroupWithCompanyId:(long)companyId error:(NSError **)error;
- (NSDictionary *)getGroupWithGroupId:(long)groupId error:(NSError **)error;
- (NSDictionary *)getGroupWithCompanyId:(long)companyId name:(NSString *)name error:(NSError **)error;
- (NSArray *)getGroupsWithCompanyId:(long)companyId parentGroupId:(long)parentGroupId site:(BOOL)site error:(NSError **)error;
- (NSArray *)getManageableSiteGroupsWithPortlets:(NSDictionary *)portlets max:(int)max error:(NSError **)error;
- (NSArray *)getManageableSitesWithPortlets:(NSDictionary *)portlets max:(int)max error:(NSError **)error;
- (NSArray *)getOrganizationsGroupsWithOrganizations:(NSArray *)organizations error:(NSError **)error;
- (NSDictionary *)getUserGroupWithCompanyId:(long)companyId userId:(long)userId error:(NSError **)error;
- (NSArray *)getUserGroupsGroupsWithUserGroups:(NSArray *)userGroups error:(NSError **)error;
- (NSArray *)getUserOrganizationsGroupsWithUserId:(long)userId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getUserPlacesWithClassNames:(NSArray *)classNames max:(int)max error:(NSError **)error;
- (NSArray *)getUserPlacesWithUserId:(long)userId classNames:(NSArray *)classNames max:(int)max error:(NSError **)error;
- (NSArray *)getUserPlacesWithUserId:(long)userId classNames:(NSArray *)classNames includeControlPanel:(BOOL)includeControlPanel max:(int)max error:(NSError **)error;
- (NSNumber *)getUserPlacesCount:(NSError **)error;
- (NSArray *)getUserSites:(NSError **)error;
- (NSArray *)getUserSitesGroups:(NSError **)error;
- (NSArray *)getUserSitesGroupsWithClassNames:(NSArray *)classNames max:(int)max error:(NSError **)error;
- (NSArray *)getUserSitesGroupsWithUserId:(long)userId classNames:(NSArray *)classNames max:(int)max error:(NSError **)error;
- (NSArray *)getUserSitesGroupsWithUserId:(long)userId classNames:(NSArray *)classNames includeControlPanel:(BOOL)includeControlPanel max:(int)max error:(NSError **)error;
- (NSNumber *)getUserSitesGroupsCount:(NSError **)error;
- (BOOL)hasUserGroupWithUserId:(long)userId groupId:(long)groupId error:(NSError **)error;
- (NSArray *)searchWithCompanyId:(long)companyId name:(NSString *)name description:(NSString *)description params:(NSArray *)params start:(int)start end:(int)end error:(NSError **)error;
- (NSNumber *)searchCountWithCompanyId:(long)companyId name:(NSString *)name description:(NSString *)description params:(NSArray *)params error:(NSError **)error;
- (void)setRoleGroupsWithRoleId:(long)roleId groupIds:(NSArray *)groupIds error:(NSError **)error;
- (void)unsetRoleGroupsWithRoleId:(long)roleId groupIds:(NSArray *)groupIds error:(NSError **)error;
- (NSDictionary *)updateFriendlyUrlWithGroupId:(long)groupId friendlyURL:(NSString *)friendlyURL error:(NSError **)error;
- (NSDictionary *)updateGroupWithGroupId:(long)groupId parentGroupId:(long)parentGroupId name:(NSString *)name description:(NSString *)description type:(int)type manualMembership:(BOOL)manualMembership membershipRestriction:(int)membershipRestriction friendlyURL:(NSString *)friendlyURL active:(BOOL)active serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateGroupWithGroupId:(long)groupId typeSettings:(NSString *)typeSettings error:(NSError **)error;
- (void)updateStagedPortletsWithGroupId:(long)groupId stagedPortletIds:(NSDictionary *)stagedPortletIds error:(NSError **)error;

@end