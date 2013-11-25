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

#import "LRUserGroupService_v62.h"

/**
 * author Bruno Farache
 */
@implementation LRUserGroupService_v62

- (void)addGroupUserGroupsWithGroupId:(long long)groupId userGroupIds:(NSArray *)userGroupIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userGroupIds": userGroupIds
	};

	NSDictionary *_command = @{@"/usergroup/add-group-user-groups": _params};

	[self.session invoke:_command error:error];
}

- (void)addTeamUserGroupsWithTeamId:(long long)teamId userGroupIds:(NSArray *)userGroupIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"teamId": @(teamId),
		@"userGroupIds": userGroupIds
	};

	NSDictionary *_command = @{@"/usergroup/add-team-user-groups": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)addUserGroupWithName:(NSString *)name description:(NSString *)description error:(NSError **)error {
	NSDictionary *_params = @{
		@"name": name,
		@"description": description
	};

	NSDictionary *_command = @{@"/usergroup/add-user-group": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addUserGroupWithName:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/usergroup/add-user-group": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteUserGroupWithUserGroupId:(long long)userGroupId error:(NSError **)error {
	NSDictionary *_params = @{
		@"userGroupId": @(userGroupId)
	};

	NSDictionary *_command = @{@"/usergroup/delete-user-group": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)getUserGroupWithName:(NSString *)name error:(NSError **)error {
	NSDictionary *_params = @{
		@"name": name
	};

	NSDictionary *_command = @{@"/usergroup/get-user-group": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getUserGroupWithUserGroupId:(long long)userGroupId error:(NSError **)error {
	NSDictionary *_params = @{
		@"userGroupId": @(userGroupId)
	};

	NSDictionary *_command = @{@"/usergroup/get-user-group": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getUserUserGroupsWithUserId:(long long)userId error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId)
	};

	NSDictionary *_command = @{@"/usergroup/get-user-user-groups": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (void)unsetGroupUserGroupsWithGroupId:(long long)groupId userGroupIds:(NSArray *)userGroupIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userGroupIds": userGroupIds
	};

	NSDictionary *_command = @{@"/usergroup/unset-group-user-groups": _params};

	[self.session invoke:_command error:error];
}

- (void)unsetTeamUserGroupsWithTeamId:(long long)teamId userGroupIds:(NSArray *)userGroupIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"teamId": @(teamId),
		@"userGroupIds": userGroupIds
	};

	NSDictionary *_command = @{@"/usergroup/unset-team-user-groups": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)updateUserGroupWithUserGroupId:(long long)userGroupId name:(NSString *)name description:(NSString *)description error:(NSError **)error {
	NSDictionary *_params = @{
		@"userGroupId": @(userGroupId),
		@"name": name,
		@"description": description
	};

	NSDictionary *_command = @{@"/usergroup/update-user-group": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateUserGroupWithUserGroupId:(long long)userGroupId name:(NSString *)name description:(NSString *)description serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"userGroupId": @(userGroupId),
		@"name": name,
		@"description": description,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/usergroup/update-user-group": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end