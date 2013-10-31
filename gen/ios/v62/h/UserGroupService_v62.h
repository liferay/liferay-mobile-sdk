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
#import "BaseService.h"

/**
 * author Bruno Farache
 */
@interface UserGroupService_v62 : BaseService

- (void)unsetTeamUserGroups:(long)teamId userGroupIds:(NSArray *)userGroupIds;
- (void)addTeamUserGroups:(long)teamId userGroupIds:(NSArray *)userGroupIds;
- (void)addGroupUserGroups:(long)groupId userGroupIds:(NSArray *)userGroupIds;
- (NSDictionary *)getUserGroup:(long)userGroupId;
- (NSDictionary *)updateUserGroup:(long)userGroupId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)addUserGroup:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext;
- (void)deleteUserGroup:(long)userGroupId;
- (void)unsetGroupUserGroups:(long)groupId userGroupIds:(NSArray *)userGroupIds;
- (NSArray *)getUserUserGroups:(long)userId;

@end