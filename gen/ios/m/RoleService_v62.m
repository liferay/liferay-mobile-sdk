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

#import "RoleService_v62.h"

/**
 * author Bruno Farache
 */
@implementation RoleService_v62

- (BOOL)hasUserRole:(NSNumber *)userId companyId:(NSNumber *)companyId name:(NSString *)name inherited:(BOOL)inherited {
	NSDictionary *_params = @{
		@"userId": userId,
		@"companyId": companyId,
		@"name": name,
		@"inherited": inherited
	};

	NSDictionary *_command = @{@"/role/has-user-role": _params};

	return (BOOL)[session invoke:_command];
}

- (NSArray *)getUserGroupRoles:(NSNumber *)userId groupId:(NSNumber *)groupId {
	NSDictionary *_params = @{
		@"userId": userId,
		@"groupId": groupId
	};

	NSDictionary *_command = @{@"/role/get-user-group-roles": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)addRole:(NSString *)className classPK:(NSNumber *)classPK name:(NSString *)name titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap type:(NSNumber *)type subtype:(NSString *)subtype serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"className": className,
		@"classPK": classPK,
		@"name": name,
		@"titleMap": titleMap,
		@"descriptionMap": descriptionMap,
		@"type": type,
		@"subtype": subtype,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/role/add-role": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)unsetUserRoles:(NSNumber *)userId roleIds:(NSArray *)roleIds {
	NSDictionary *_params = @{
		@"userId": userId,
		@"roleIds": roleIds
	};

	NSDictionary *_command = @{@"/role/unset-user-roles": _params};

	[session invoke:_command];
}

- (NSArray *)getUserRoles:(NSNumber *)userId {
	NSDictionary *_params = @{
		@"userId": userId
	};

	NSDictionary *_command = @{@"/role/get-user-roles": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSArray *)getUserRelatedRoles:(NSNumber *)userId groups:(NSArray *)groups {
	NSDictionary *_params = @{
		@"userId": userId,
		@"groups": groups
	};

	NSDictionary *_command = @{@"/role/get-user-related-roles": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)getRole:(NSNumber *)companyId name:(NSString *)name {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"name": name
	};

	NSDictionary *_command = @{@"/role/get-role": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)updateRole:(NSNumber *)roleId name:(NSString *)name titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap subtype:(NSString *)subtype serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"roleId": roleId,
		@"name": name,
		@"titleMap": titleMap,
		@"descriptionMap": descriptionMap,
		@"subtype": subtype,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/role/update-role": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getGroupRoles:(NSNumber *)groupId {
	NSDictionary *_params = @{
		@"groupId": groupId
	};

	NSDictionary *_command = @{@"/role/get-group-roles": _params};

	return (NSArray *)[session invoke:_command];
}

- (void)deleteRole:(NSNumber *)roleId {
	NSDictionary *_params = @{
		@"roleId": roleId
	};

	NSDictionary *_command = @{@"/role/delete-role": _params};

	[session invoke:_command];
}

- (BOOL)hasUserRoles:(NSNumber *)userId companyId:(NSNumber *)companyId names:(NSArray *)names inherited:(BOOL)inherited {
	NSDictionary *_params = @{
		@"userId": userId,
		@"companyId": companyId,
		@"names": names,
		@"inherited": inherited
	};

	NSDictionary *_command = @{@"/role/has-user-roles": _params};

	return (BOOL)[session invoke:_command];
}

- (void)addUserRoles:(NSNumber *)userId roleIds:(NSArray *)roleIds {
	NSDictionary *_params = @{
		@"userId": userId,
		@"roleIds": roleIds
	};

	NSDictionary *_command = @{@"/role/add-user-roles": _params};

	[session invoke:_command];
}

- (NSArray *)getUserGroupGroupRoles:(NSNumber *)userId groupId:(NSNumber *)groupId {
	NSDictionary *_params = @{
		@"userId": userId,
		@"groupId": groupId
	};

	NSDictionary *_command = @{@"/role/get-user-group-group-roles": _params};

	return (NSArray *)[session invoke:_command];
}

@end