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
	NSDictionary *_params = @{
		@"roleId": roleId,
		@"groupIds": groupIds
	};

	NSDictionary *_command = @{@"/group/unset-role-groups": _params};

	[session invoke:_command];
}

- (NSDictionary *)addGroup:(NSNumber *)parentGroupId name:(NSString *)name description:(NSString *)description type:(NSNumber *)type friendlyURL:(NSString *)friendlyURL site:(BOOL)site active:(BOOL)active serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"parentGroupId": parentGroupId,
		@"name": name,
		@"description": description,
		@"type": type,
		@"friendlyURL": friendlyURL,
		@"site": site,
		@"active": active,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/group/add-group": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (BOOL)hasUserGroup:(NSNumber *)userId groupId:(NSNumber *)groupId {
	NSDictionary *_params = @{
		@"userId": userId,
		@"groupId": groupId
	};

	NSDictionary *_command = @{@"/group/has-user-group": _params};

	return (BOOL)[session invoke:_command];
}

- (NSDictionary *)updateFriendlyUrl:(NSNumber *)groupId friendlyURL:(NSString *)friendlyURL {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"friendlyURL": friendlyURL
	};

	NSDictionary *_command = @{@"/group/update-friendly-url": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getOrganizationsGroups:(NSArray *)organizations {
	NSDictionary *_params = @{
		@"organizations": organizations
	};

	NSDictionary *_command = @{@"/group/get-organizations-groups": _params};

	return (NSArray *)[session invoke:_command];
}

- (void)checkRemoteStagingGroup:(NSNumber *)groupId {
	NSDictionary *_params = @{
		@"groupId": groupId
	};

	NSDictionary *_command = @{@"/group/check-remote-staging-group": _params};

	[session invoke:_command];
}

- (NSNumber *)getUserPlacesCount: {
	NSDictionary *_params = @{
	};

	NSDictionary *_command = @{@"/group/get-user-places-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (void)enableStaging:(NSNumber *)groupId {
	NSDictionary *_params = @{
		@"groupId": groupId
	};

	NSDictionary *_command = @{@"/group/enable-staging": _params};

	[session invoke:_command];
}

- (NSArray *)getUserGroupsGroups:(NSArray *)userGroups {
	NSDictionary *_params = @{
		@"userGroups": userGroups
	};

	NSDictionary *_command = @{@"/group/get-user-groups-groups": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSNumber *)getUserSitesGroupsCount: {
	NSDictionary *_params = @{
	};

	NSDictionary *_command = @{@"/group/get-user-sites-groups-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSDictionary *)getUserGroup:(NSNumber *)companyId userId:(NSNumber *)userId {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"userId": userId
	};

	NSDictionary *_command = @{@"/group/get-user-group": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getUserOrganizationsGroups:(NSNumber *)userId start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"userId": userId,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/group/get-user-organizations-groups": _params};

	return (NSArray *)[session invoke:_command];
}

- (void)setRoleGroups:(NSNumber *)roleId groupIds:(NSArray *)groupIds {
	NSDictionary *_params = @{
		@"roleId": roleId,
		@"groupIds": groupIds
	};

	NSDictionary *_command = @{@"/group/set-role-groups": _params};

	[session invoke:_command];
}

- (NSArray *)getManageableSites:(NSDictionary *)portlets max:(NSNumber *)max {
	NSDictionary *_params = @{
		@"portlets": portlets,
		@"max": max
	};

	NSDictionary *_command = @{@"/group/get-manageable-sites": _params};

	return (NSArray *)[session invoke:_command];
}

- (void)addRoleGroups:(NSNumber *)roleId groupIds:(NSArray *)groupIds {
	NSDictionary *_params = @{
		@"roleId": roleId,
		@"groupIds": groupIds
	};

	NSDictionary *_command = @{@"/group/add-role-groups": _params};

	[session invoke:_command];
}

- (NSArray *)getUserSites: {
	NSDictionary *_params = @{
	};

	NSDictionary *_command = @{@"/group/get-user-sites": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)getGroup:(NSNumber *)companyId name:(NSString *)name {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"name": name
	};

	NSDictionary *_command = @{@"/group/get-group": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)getCompanyGroup:(NSNumber *)companyId {
	NSDictionary *_params = @{
		@"companyId": companyId
	};

	NSDictionary *_command = @{@"/group/get-company-group": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getUserPlaces:(NSNumber *)userId classNames:(NSArray *)classNames includeControlPanel:(BOOL)includeControlPanel max:(NSNumber *)max {
	NSDictionary *_params = @{
		@"userId": userId,
		@"classNames": classNames,
		@"includeControlPanel": includeControlPanel,
		@"max": max
	};

	NSDictionary *_command = @{@"/group/get-user-places": _params};

	return (NSArray *)[session invoke:_command];
}

- (void)disableStaging:(NSNumber *)groupId {
	NSDictionary *_params = @{
		@"groupId": groupId
	};

	NSDictionary *_command = @{@"/group/disable-staging": _params};

	[session invoke:_command];
}

- (void)deleteGroup:(NSNumber *)groupId {
	NSDictionary *_params = @{
		@"groupId": groupId
	};

	NSDictionary *_command = @{@"/group/delete-group": _params};

	[session invoke:_command];
}

- (void)updateStagedPortlets:(NSNumber *)groupId stagedPortletIds:(NSDictionary *)stagedPortletIds {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"stagedPortletIds": stagedPortletIds
	};

	NSDictionary *_command = @{@"/group/update-staged-portlets": _params};

	[session invoke:_command];
}

- (NSNumber *)searchCount:(NSNumber *)companyId name:(NSString *)name description:(NSString *)description params:(NSArray *)params {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"name": name,
		@"description": description,
		@"params": params
	};

	NSDictionary *_command = @{@"/group/search-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSArray *)getManageableSiteGroups:(NSDictionary *)portlets max:(NSNumber *)max {
	NSDictionary *_params = @{
		@"portlets": portlets,
		@"max": max
	};

	NSDictionary *_command = @{@"/group/get-manageable-site-groups": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)updateGroup:(NSNumber *)groupId typeSettings:(NSString *)typeSettings {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"typeSettings": typeSettings
	};

	NSDictionary *_command = @{@"/group/update-group": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)search:(NSNumber *)companyId name:(NSString *)name description:(NSString *)description params:(NSArray *)params start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"name": name,
		@"description": description,
		@"params": params,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/group/search": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSArray *)getUserSitesGroups:(NSNumber *)userId classNames:(NSArray *)classNames includeControlPanel:(BOOL)includeControlPanel max:(NSNumber *)max {
	NSDictionary *_params = @{
		@"userId": userId,
		@"classNames": classNames,
		@"includeControlPanel": includeControlPanel,
		@"max": max
	};

	NSDictionary *_command = @{@"/group/get-user-sites-groups": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSArray *)getGroups:(NSNumber *)companyId parentGroupId:(NSNumber *)parentGroupId site:(BOOL)site {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"parentGroupId": parentGroupId,
		@"site": site
	};

	NSDictionary *_command = @{@"/group/get-groups": _params};

	return (NSArray *)[session invoke:_command];
}

@end