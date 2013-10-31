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

#import "UserGroupGroupRoleService_v62.h"

/**
 * author Bruno Farache
 */
@implementation UserGroupGroupRoleService_v62

- (void)deleteUserGroupGroupRoles:(NSArray *)userGroupIds groupId:(NSNumber *)groupId roleId:(NSNumber *)roleId {
	NSDictionary *_params = @{
		@"userGroupIds": userGroupIds,
		@"groupId": groupId,
		@"roleId": roleId
	};

	NSDictionary *_command = @{@"/usergroupgrouprole/delete-user-group-group-roles": _params};

	[session invoke:_command];
}

- (void)addUserGroupGroupRoles:(NSArray *)userGroupIds groupId:(NSNumber *)groupId roleId:(NSNumber *)roleId {
	NSDictionary *_params = @{
		@"userGroupIds": userGroupIds,
		@"groupId": groupId,
		@"roleId": roleId
	};

	NSDictionary *_command = @{@"/usergroupgrouprole/add-user-group-group-roles": _params};

	[session invoke:_command];
}

@end