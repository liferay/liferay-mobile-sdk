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

- (void)unsetTeamUserGroups:(long)teamId userGroupIds:(NSArray *)userGroupIds {
	NSDictionary *_params = @{
		@"teamId": @(teamId),
		@"userGroupIds": userGroupIds
	};

	NSDictionary *_command = @{@"/usergroup/unset-team-user-groups": _params};

	[self.session invoke:_command];
}

- (void)addTeamUserGroups:(long)teamId userGroupIds:(NSArray *)userGroupIds {
	NSDictionary *_params = @{
		@"teamId": @(teamId),
		@"userGroupIds": userGroupIds
	};

	NSDictionary *_command = @{@"/usergroup/add-team-user-groups": _params};

	[self.session invoke:_command];
}

- (void)addGroupUserGroups:(long)groupId userGroupIds:(NSArray *)userGroupIds {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userGroupIds": userGroupIds
	};

	NSDictionary *_command = @{@"/usergroup/add-group-user-groups": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)getUserGroup:(long)userGroupId {
	NSDictionary *_params = @{
		@"userGroupId": @(userGroupId)
	};

	NSDictionary *_command = @{@"/usergroup/get-user-group": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)updateUserGroup:(long)userGroupId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"userGroupId": @(userGroupId),
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/usergroup/update-user-group": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)addUserGroup:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/usergroup/add-user-group": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)deleteUserGroup:(long)userGroupId {
	NSDictionary *_params = @{
		@"userGroupId": @(userGroupId)
	};

	NSDictionary *_command = @{@"/usergroup/delete-user-group": _params};

	[self.session invoke:_command];
}

- (void)unsetGroupUserGroups:(long)groupId userGroupIds:(NSArray *)userGroupIds {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userGroupIds": userGroupIds
	};

	NSDictionary *_command = @{@"/usergroup/unset-group-user-groups": _params};

	[self.session invoke:_command];
}

- (NSArray *)getUserUserGroups:(long)userId {
	NSDictionary *_params = @{
		@"userId": @(userId)
	};

	NSDictionary *_command = @{@"/usergroup/get-user-user-groups": _params};

	return (NSArray *)[self.session invoke:_command];
}

@end