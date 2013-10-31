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

- (void)setCompanyScopePermissions:(NSNumber *)scopeGroupId companyId:(NSNumber *)companyId name:(NSString *)name roleId:(NSNumber *)roleId actionIds:(NSArray *)actionIds {
	NSDictionary *_params = @{
		@"scopeGroupId": scopeGroupId,
		@"companyId": companyId,
		@"name": name,
		@"roleId": roleId,
		@"actionIds": actionIds
	};

	NSDictionary *_command = @{@"/resourceblock/set-company-scope-permissions": _params};

	[session invoke:_command];
}

- (void)addGroupScopePermission:(NSNumber *)scopeGroupId companyId:(NSNumber *)companyId groupId:(NSNumber *)groupId name:(NSString *)name roleId:(NSNumber *)roleId actionId:(NSString *)actionId {
	NSDictionary *_params = @{
		@"scopeGroupId": scopeGroupId,
		@"companyId": companyId,
		@"groupId": groupId,
		@"name": name,
		@"roleId": roleId,
		@"actionId": actionId
	};

	NSDictionary *_command = @{@"/resourceblock/add-group-scope-permission": _params};

	[session invoke:_command];
}

- (void)addCompanyScopePermission:(NSNumber *)scopeGroupId companyId:(NSNumber *)companyId name:(NSString *)name roleId:(NSNumber *)roleId actionId:(NSString *)actionId {
	NSDictionary *_params = @{
		@"scopeGroupId": scopeGroupId,
		@"companyId": companyId,
		@"name": name,
		@"roleId": roleId,
		@"actionId": actionId
	};

	NSDictionary *_command = @{@"/resourceblock/add-company-scope-permission": _params};

	[session invoke:_command];
}

- (void)removeGroupScopePermission:(NSNumber *)scopeGroupId companyId:(NSNumber *)companyId groupId:(NSNumber *)groupId name:(NSString *)name roleId:(NSNumber *)roleId actionId:(NSString *)actionId {
	NSDictionary *_params = @{
		@"scopeGroupId": scopeGroupId,
		@"companyId": companyId,
		@"groupId": groupId,
		@"name": name,
		@"roleId": roleId,
		@"actionId": actionId
	};

	NSDictionary *_command = @{@"/resourceblock/remove-group-scope-permission": _params};

	[session invoke:_command];
}

- (void)setGroupScopePermissions:(NSNumber *)scopeGroupId companyId:(NSNumber *)companyId groupId:(NSNumber *)groupId name:(NSString *)name roleId:(NSNumber *)roleId actionIds:(NSArray *)actionIds {
	NSDictionary *_params = @{
		@"scopeGroupId": scopeGroupId,
		@"companyId": companyId,
		@"groupId": groupId,
		@"name": name,
		@"roleId": roleId,
		@"actionIds": actionIds
	};

	NSDictionary *_command = @{@"/resourceblock/set-group-scope-permissions": _params};

	[session invoke:_command];
}

- (void)removeCompanyScopePermission:(NSNumber *)scopeGroupId companyId:(NSNumber *)companyId name:(NSString *)name roleId:(NSNumber *)roleId actionId:(NSString *)actionId {
	NSDictionary *_params = @{
		@"scopeGroupId": scopeGroupId,
		@"companyId": companyId,
		@"name": name,
		@"roleId": roleId,
		@"actionId": actionId
	};

	NSDictionary *_command = @{@"/resourceblock/remove-company-scope-permission": _params};

	[session invoke:_command];
}

- (void)removeIndividualScopePermission:(NSNumber *)companyId groupId:(NSNumber *)groupId name:(NSString *)name primKey:(NSNumber *)primKey roleId:(NSNumber *)roleId actionId:(NSString *)actionId {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"groupId": groupId,
		@"name": name,
		@"primKey": primKey,
		@"roleId": roleId,
		@"actionId": actionId
	};

	NSDictionary *_command = @{@"/resourceblock/remove-individual-scope-permission": _params};

	[session invoke:_command];
}

- (void)removeAllGroupScopePermissions:(NSNumber *)scopeGroupId companyId:(NSNumber *)companyId name:(NSString *)name roleId:(NSNumber *)roleId actionId:(NSString *)actionId {
	NSDictionary *_params = @{
		@"scopeGroupId": scopeGroupId,
		@"companyId": companyId,
		@"name": name,
		@"roleId": roleId,
		@"actionId": actionId
	};

	NSDictionary *_command = @{@"/resourceblock/remove-all-group-scope-permissions": _params};

	[session invoke:_command];
}

- (void)addIndividualScopePermission:(NSNumber *)companyId groupId:(NSNumber *)groupId name:(NSString *)name primKey:(NSNumber *)primKey roleId:(NSNumber *)roleId actionId:(NSString *)actionId {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"groupId": groupId,
		@"name": name,
		@"primKey": primKey,
		@"roleId": roleId,
		@"actionId": actionId
	};

	NSDictionary *_command = @{@"/resourceblock/add-individual-scope-permission": _params};

	[session invoke:_command];
}

- (void)setIndividualScopePermissions:(NSNumber *)companyId groupId:(NSNumber *)groupId name:(NSString *)name primKey:(NSNumber *)primKey roleId:(NSNumber *)roleId actionIds:(NSArray *)actionIds {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"groupId": groupId,
		@"name": name,
		@"primKey": primKey,
		@"roleId": roleId,
		@"actionIds": actionIds
	};

	NSDictionary *_command = @{@"/resourceblock/set-individual-scope-permissions": _params};

	[session invoke:_command];
}

@end