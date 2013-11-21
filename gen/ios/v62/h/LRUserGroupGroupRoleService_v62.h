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
@interface LRUserGroupGroupRoleService_v62 : BaseService

- (void)addUserGroupGroupRolesWithUserGroupId:(long)userGroupId groupId:(long)groupId roleIds:(NSArray *)roleIds error:(NSError **)error;
- (void)addUserGroupGroupRolesWithUserGroupIds:(NSArray *)userGroupIds groupId:(long)groupId roleId:(long)roleId error:(NSError **)error;
- (void)deleteUserGroupGroupRolesWithUserGroupId:(long)userGroupId groupId:(long)groupId roleIds:(NSArray *)roleIds error:(NSError **)error;
- (void)deleteUserGroupGroupRolesWithUserGroupIds:(NSArray *)userGroupIds groupId:(long)groupId roleId:(long)roleId error:(NSError **)error;

@end