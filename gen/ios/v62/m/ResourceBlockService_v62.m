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

#import "ResourceBlockService_v62.h"

/**
 * author Bruno Farache
 */
@implementation ResourceBlockService_v62

- (void)addCompanyScopePermissionWithScopeGroupId:(long)scopeGroupId companyId:(long)companyId name:(NSString *)name roleId:(long)roleId actionId:(NSString *)actionId error:(NSError **)error {
	NSDictionary *_params = @{
		@"scopeGroupId": @(scopeGroupId),
		@"companyId": @(companyId),
		@"name": name,
		@"roleId": @(roleId),
		@"actionId": actionId
	};

	NSDictionary *_command = @{@"/resourceblock/add-company-scope-permission": _params};

	[self.session invoke:_command error:error];
}

- (void)addGroupScopePermissionWithScopeGroupId:(long)scopeGroupId companyId:(long)companyId groupId:(long)groupId name:(NSString *)name roleId:(long)roleId actionId:(NSString *)actionId error:(NSError **)error {
	NSDictionary *_params = @{
		@"scopeGroupId": @(scopeGroupId),
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"name": name,
		@"roleId": @(roleId),
		@"actionId": actionId
	};

	NSDictionary *_command = @{@"/resourceblock/add-group-scope-permission": _params};

	[self.session invoke:_command error:error];
}

- (void)addIndividualScopePermissionWithCompanyId:(long)companyId groupId:(long)groupId name:(NSString *)name primKey:(long)primKey roleId:(long)roleId actionId:(NSString *)actionId error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"name": name,
		@"primKey": @(primKey),
		@"roleId": @(roleId),
		@"actionId": actionId
	};

	NSDictionary *_command = @{@"/resourceblock/add-individual-scope-permission": _params};

	[self.session invoke:_command error:error];
}

- (void)removeAllGroupScopePermissionsWithScopeGroupId:(long)scopeGroupId companyId:(long)companyId name:(NSString *)name roleId:(long)roleId actionId:(NSString *)actionId error:(NSError **)error {
	NSDictionary *_params = @{
		@"scopeGroupId": @(scopeGroupId),
		@"companyId": @(companyId),
		@"name": name,
		@"roleId": @(roleId),
		@"actionId": actionId
	};

	NSDictionary *_command = @{@"/resourceblock/remove-all-group-scope-permissions": _params};

	[self.session invoke:_command error:error];
}

- (void)removeCompanyScopePermissionWithScopeGroupId:(long)scopeGroupId companyId:(long)companyId name:(NSString *)name roleId:(long)roleId actionId:(NSString *)actionId error:(NSError **)error {
	NSDictionary *_params = @{
		@"scopeGroupId": @(scopeGroupId),
		@"companyId": @(companyId),
		@"name": name,
		@"roleId": @(roleId),
		@"actionId": actionId
	};

	NSDictionary *_command = @{@"/resourceblock/remove-company-scope-permission": _params};

	[self.session invoke:_command error:error];
}

- (void)removeGroupScopePermissionWithScopeGroupId:(long)scopeGroupId companyId:(long)companyId groupId:(long)groupId name:(NSString *)name roleId:(long)roleId actionId:(NSString *)actionId error:(NSError **)error {
	NSDictionary *_params = @{
		@"scopeGroupId": @(scopeGroupId),
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"name": name,
		@"roleId": @(roleId),
		@"actionId": actionId
	};

	NSDictionary *_command = @{@"/resourceblock/remove-group-scope-permission": _params};

	[self.session invoke:_command error:error];
}

- (void)removeIndividualScopePermissionWithCompanyId:(long)companyId groupId:(long)groupId name:(NSString *)name primKey:(long)primKey roleId:(long)roleId actionId:(NSString *)actionId error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"name": name,
		@"primKey": @(primKey),
		@"roleId": @(roleId),
		@"actionId": actionId
	};

	NSDictionary *_command = @{@"/resourceblock/remove-individual-scope-permission": _params};

	[self.session invoke:_command error:error];
}

- (void)setCompanyScopePermissionsWithScopeGroupId:(long)scopeGroupId companyId:(long)companyId name:(NSString *)name roleId:(long)roleId actionIds:(NSArray *)actionIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"scopeGroupId": @(scopeGroupId),
		@"companyId": @(companyId),
		@"name": name,
		@"roleId": @(roleId),
		@"actionIds": actionIds
	};

	NSDictionary *_command = @{@"/resourceblock/set-company-scope-permissions": _params};

	[self.session invoke:_command error:error];
}

- (void)setGroupScopePermissionsWithScopeGroupId:(long)scopeGroupId companyId:(long)companyId groupId:(long)groupId name:(NSString *)name roleId:(long)roleId actionIds:(NSArray *)actionIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"scopeGroupId": @(scopeGroupId),
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"name": name,
		@"roleId": @(roleId),
		@"actionIds": actionIds
	};

	NSDictionary *_command = @{@"/resourceblock/set-group-scope-permissions": _params};

	[self.session invoke:_command error:error];
}

- (void)setIndividualScopePermissionsWithCompanyId:(long)companyId groupId:(long)groupId name:(NSString *)name primKey:(long)primKey roleIdsToActionIds:(NSDictionary *)roleIdsToActionIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"name": name,
		@"primKey": @(primKey),
		@"roleIdsToActionIds": roleIdsToActionIds
	};

	NSDictionary *_command = @{@"/resourceblock/set-individual-scope-permissions": _params};

	[self.session invoke:_command error:error];
}

- (void)setIndividualScopePermissionsWithCompanyId:(long)companyId groupId:(long)groupId name:(NSString *)name primKey:(long)primKey roleId:(long)roleId actionIds:(NSArray *)actionIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"groupId": @(groupId),
		@"name": name,
		@"primKey": @(primKey),
		@"roleId": @(roleId),
		@"actionIds": actionIds
	};

	NSDictionary *_command = @{@"/resourceblock/set-individual-scope-permissions": _params};

	[self.session invoke:_command error:error];
}

@end