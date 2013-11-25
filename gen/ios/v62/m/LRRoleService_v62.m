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

#import "LRRoleService_v62.h"

/**
 * author Bruno Farache
 */
@implementation LRRoleService_v62

- (NSDictionary *)addRoleWithName:(NSString *)name titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap type:(int)type error:(NSError **)error {
	NSDictionary *_params = @{
		@"name": name,
		@"titleMap": titleMap,
		@"descriptionMap": descriptionMap,
		@"type": @(type)
	};

	NSDictionary *_command = @{@"/role/add-role": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addRoleWithClassName:(NSString *)className classPK:(long long)classPK name:(NSString *)name titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap type:(int)type subtype:(NSString *)subtype serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
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

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)addUserRolesWithUserId:(long long)userId roleIds:(NSArray *)roleIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"roleIds": roleIds
	};

	NSDictionary *_command = @{@"/role/add-user-roles": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteRoleWithRoleId:(long long)roleId error:(NSError **)error {
	NSDictionary *_params = @{
		@"roleId": @(roleId)
	};

	NSDictionary *_command = @{@"/role/delete-role": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getGroupRolesWithGroupId:(long long)groupId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/role/get-group-roles": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getRoleWithRoleId:(long long)roleId error:(NSError **)error {
	NSDictionary *_params = @{
		@"roleId": @(roleId)
	};

	NSDictionary *_command = @{@"/role/get-role": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getRoleWithCompanyId:(long long)companyId name:(NSString *)name error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"name": name
	};

	NSDictionary *_command = @{@"/role/get-role": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getUserGroupGroupRolesWithUserId:(long long)userId groupId:(long long)groupId error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/role/get-user-group-group-roles": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getUserGroupRolesWithUserId:(long long)userId groupId:(long long)groupId error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/role/get-user-group-roles": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getUserRelatedRolesWithUserId:(long long)userId groups:(NSArray *)groups error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"groups": groups
	};

	NSDictionary *_command = @{@"/role/get-user-related-roles": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getUserRolesWithUserId:(long long)userId error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId)
	};

	NSDictionary *_command = @{@"/role/get-user-roles": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (BOOL)hasUserRoleWithUserId:(long long)userId companyId:(long long)companyId name:(NSString *)name inherited:(BOOL)inherited error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"companyId": @(companyId),
		@"name": name,
		@"inherited": @(inherited)
	};

	NSDictionary *_command = @{@"/role/has-user-role": _params};

	return [self boolValue:(NSNumber *)[self.session invoke:_command error:error]];
}

- (BOOL)hasUserRolesWithUserId:(long long)userId companyId:(long long)companyId names:(NSArray *)names inherited:(BOOL)inherited error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"companyId": @(companyId),
		@"names": names,
		@"inherited": @(inherited)
	};

	NSDictionary *_command = @{@"/role/has-user-roles": _params};

	return [self boolValue:(NSNumber *)[self.session invoke:_command error:error]];
}

- (void)unsetUserRolesWithUserId:(long long)userId roleIds:(NSArray *)roleIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"roleIds": roleIds
	};

	NSDictionary *_command = @{@"/role/unset-user-roles": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)updateRoleWithRoleId:(long long)roleId name:(NSString *)name titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap subtype:(NSString *)subtype serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"roleId": @(roleId),
		@"name": name,
		@"titleMap": titleMap,
		@"descriptionMap": descriptionMap,
		@"subtype": subtype,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/role/update-role": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end