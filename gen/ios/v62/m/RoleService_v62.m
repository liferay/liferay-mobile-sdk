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

- (BOOL)hasUserRole:(long)userId companyId:(long)companyId name:(NSString *)name inherited:(BOOL)inherited {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"companyId": @(companyId),
		@"name": name,
		@"inherited": @(inherited)
	};

	NSDictionary *_command = @{@"/role/has-user-role": _params};

	return (BOOL)[self.session invoke:_command];
}

- (NSArray *)getUserGroupRoles:(long)userId groupId:(long)groupId {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/role/get-user-group-roles": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)addRole:(NSString *)className classPK:(long)classPK name:(NSString *)name titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap type:(int)type subtype:(NSString *)subtype serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"className": className,
		@"classPK": @(classPK),
		@"name": name,
		@"titleMap": titleMap,
		@"descriptionMap": descriptionMap,
		@"type": @(type),
		@"subtype": subtype,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/role/add-role": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)unsetUserRoles:(long)userId roleIds:(NSArray *)roleIds {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"roleIds": roleIds
	};

	NSDictionary *_command = @{@"/role/unset-user-roles": _params};

	[self.session invoke:_command];
}

- (NSArray *)getUserRoles:(long)userId {
	NSDictionary *_params = @{
		@"userId": @(userId)
	};

	NSDictionary *_command = @{@"/role/get-user-roles": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSArray *)getUserRelatedRoles:(long)userId groups:(NSArray *)groups {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"groups": groups
	};

	NSDictionary *_command = @{@"/role/get-user-related-roles": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSDictionary *)getRole:(long)companyId name:(NSString *)name {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"name": name
	};

	NSDictionary *_command = @{@"/role/get-role": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)updateRole:(long)roleId name:(NSString *)name titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap subtype:(NSString *)subtype serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"roleId": @(roleId),
		@"name": name,
		@"titleMap": titleMap,
		@"descriptionMap": descriptionMap,
		@"subtype": subtype,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/role/update-role": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSArray *)getGroupRoles:(long)groupId {
	NSDictionary *_params = @{
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/role/get-group-roles": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (void)deleteRole:(long)roleId {
	NSDictionary *_params = @{
		@"roleId": @(roleId)
	};

	NSDictionary *_command = @{@"/role/delete-role": _params};

	[self.session invoke:_command];
}

- (BOOL)hasUserRoles:(long)userId companyId:(long)companyId names:(NSArray *)names inherited:(BOOL)inherited {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"companyId": @(companyId),
		@"names": names,
		@"inherited": @(inherited)
	};

	NSDictionary *_command = @{@"/role/has-user-roles": _params};

	return (BOOL)[self.session invoke:_command];
}

- (void)addUserRoles:(long)userId roleIds:(NSArray *)roleIds {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"roleIds": roleIds
	};

	NSDictionary *_command = @{@"/role/add-user-roles": _params};

	[self.session invoke:_command];
}

- (NSArray *)getUserGroupGroupRoles:(long)userId groupId:(long)groupId {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/role/get-user-group-group-roles": _params};

	return (NSArray *)[self.session invoke:_command];
}

@end