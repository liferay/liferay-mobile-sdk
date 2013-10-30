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

#import "UserGroupService_v62.h"

/**
 * author Bruno Farache
 */
@implementation UserGroupService_v62

- (void)unsetTeamUserGroups:(NSNumber *)teamId userGroupIds:(NSArray *)userGroupIds {
}

- (void)addTeamUserGroups:(NSNumber *)teamId userGroupIds:(NSArray *)userGroupIds {
}

- (void)addGroupUserGroups:(NSNumber *)groupId userGroupIds:(NSArray *)userGroupIds {
}

- (NSDictionary *)getUserGroup:(NSNumber *)userGroupId {
}

- (NSDictionary *)updateUserGroup:(NSNumber *)userGroupId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext {
}

- (NSDictionary *)addUserGroup:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext {
}

- (void)deleteUserGroup:(NSNumber *)userGroupId {
}

- (void)unsetGroupUserGroups:(NSNumber *)groupId userGroupIds:(NSArray *)userGroupIds {
}

- (NSArray *)getUserUserGroups:(NSNumber *)userId {
}

@end