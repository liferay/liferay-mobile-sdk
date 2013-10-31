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

#import "UserGroupRoleService_v62.h"

/**
 * author Bruno Farache
 */
@implementation UserGroupRoleService_v62

- (void)addUserGroupRoles:(NSArray *)userIds groupId:(NSNumber *)groupId roleId:(NSNumber *)roleId {
	NSDictionary *_params = @{
		@"userIds": userIds,
		@"groupId": groupId,
		@"roleId": roleId
	};

	NSDictionary *_command = @{@"/usergrouprole/add-user-group-roles": _params};

	[session invoke:_command];
}

- (void)deleteUserGroupRoles:(NSArray *)userIds groupId:(NSNumber *)groupId roleId:(NSNumber *)roleId {
	NSDictionary *_params = @{
		@"userIds": userIds,
		@"groupId": groupId,
		@"roleId": roleId
	};

	NSDictionary *_command = @{@"/usergrouprole/delete-user-group-roles": _params};

	[session invoke:_command];
}

@end