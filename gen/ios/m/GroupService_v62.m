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

#import "GroupService_v62.h"

/**
 * author Bruno Farache
 */
@implementation GroupService_v62

- (void)unsetRoleGroups:(NSNumber *)roleId groupIds:(NSArray *)groupIds {
}

- (NSDictionary *)addGroup:(NSNumber *)parentGroupId name:(NSString *)name description:(NSString *)description type:(NSNumber *)type friendlyURL:(NSString *)friendlyURL site:(BOOL)site active:(BOOL)active serviceContext:(NSDictionary *)serviceContext {
}

- (BOOL)hasUserGroup:(NSNumber *)userId groupId:(NSNumber *)groupId {
}

- (NSDictionary *)updateFriendlyUrl:(NSNumber *)groupId friendlyURL:(NSString *)friendlyURL {
}

- (NSArray *)getOrganizationsGroups:(NSArray *)organizations {
}

- (void)checkRemoteStagingGroup:(NSNumber *)groupId {
}

- (NSNumber *)getUserPlacesCount: {
}

- (void)enableStaging:(NSNumber *)groupId {
}

- (NSArray *)getUserGroupsGroups:(NSArray *)userGroups {
}

- (NSNumber *)getUserSitesGroupsCount: {
}

- (NSDictionary *)getUserGroup:(NSNumber *)companyId userId:(NSNumber *)userId {
}

- (NSArray *)getUserOrganizationsGroups:(NSNumber *)userId start:(NSNumber *)start end:(NSNumber *)end {
}

- (void)setRoleGroups:(NSNumber *)roleId groupIds:(NSArray *)groupIds {
}

- (NSArray *)getManageableSites:(NSDictionary *)portlets max:(NSNumber *)max {
}

- (void)addRoleGroups:(NSNumber *)roleId groupIds:(NSArray *)groupIds {
}

- (NSArray *)getUserSites: {
}

- (NSDictionary *)getGroup:(NSNumber *)companyId name:(NSString *)name {
}

- (NSDictionary *)getCompanyGroup:(NSNumber *)companyId {
}

- (NSArray *)getUserPlaces:(NSNumber *)userId classNames:(NSArray *)classNames includeControlPanel:(BOOL)includeControlPanel max:(NSNumber *)max {
}

- (void)disableStaging:(NSNumber *)groupId {
}

- (void)deleteGroup:(NSNumber *)groupId {
}

- (void)updateStagedPortlets:(NSNumber *)groupId stagedPortletIds:(NSDictionary *)stagedPortletIds {
}

- (NSNumber *)searchCount:(NSNumber *)companyId name:(NSString *)name description:(NSString *)description params:(NSArray *)params {
}

- (NSArray *)getManageableSiteGroups:(NSDictionary *)portlets max:(NSNumber *)max {
}

- (NSDictionary *)updateGroup:(NSNumber *)groupId typeSettings:(NSString *)typeSettings {
}

- (NSArray *)search:(NSNumber *)companyId name:(NSString *)name description:(NSString *)description params:(NSArray *)params start:(NSNumber *)start end:(NSNumber *)end {
}

- (NSArray *)getUserSitesGroups:(NSNumber *)userId classNames:(NSArray *)classNames includeControlPanel:(BOOL)includeControlPanel max:(NSNumber *)max {
}

- (NSArray *)getGroups:(NSNumber *)companyId parentGroupId:(NSNumber *)parentGroupId site:(BOOL)site {
}

@end