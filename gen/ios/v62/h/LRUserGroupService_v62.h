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
@interface LRUserGroupService_v62 : BaseService

- (void)addGroupUserGroupsWithGroupId:(long)groupId userGroupIds:(NSArray *)userGroupIds error:(NSError **)error;
- (void)addTeamUserGroupsWithTeamId:(long)teamId userGroupIds:(NSArray *)userGroupIds error:(NSError **)error;
- (NSDictionary *)addUserGroupWithName:(NSString *)name description:(NSString *)description error:(NSError **)error;
- (NSDictionary *)addUserGroupWithName:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)deleteUserGroupWithUserGroupId:(long)userGroupId error:(NSError **)error;
- (NSDictionary *)getUserGroupWithName:(NSString *)name error:(NSError **)error;
- (NSDictionary *)getUserGroupWithUserGroupId:(long)userGroupId error:(NSError **)error;
- (NSArray *)getUserUserGroupsWithUserId:(long)userId error:(NSError **)error;
- (void)unsetGroupUserGroupsWithGroupId:(long)groupId userGroupIds:(NSArray *)userGroupIds error:(NSError **)error;
- (void)unsetTeamUserGroupsWithTeamId:(long)teamId userGroupIds:(NSArray *)userGroupIds error:(NSError **)error;
- (NSDictionary *)updateUserGroupWithUserGroupId:(long)userGroupId name:(NSString *)name description:(NSString *)description error:(NSError **)error;
- (NSDictionary *)updateUserGroupWithUserGroupId:(long)userGroupId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;

@end