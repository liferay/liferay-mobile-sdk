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

#import "LRTeamService_v62.h"

/**
 * author Bruno Farache
 */
@implementation LRTeamService_v62

- (NSDictionary *)addTeamWithGroupId:(long)groupId name:(NSString *)name description:(NSString *)description error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name,
		@"description": description
	};

	NSDictionary *_command = @{@"/team/add-team": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deleteTeamWithTeamId:(long)teamId error:(NSError **)error {
	NSDictionary *_params = @{
		@"teamId": @(teamId)
	};

	NSDictionary *_command = @{@"/team/delete-team": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getGroupTeamsWithGroupId:(long)groupId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/team/get-group-teams": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getTeamWithTeamId:(long)teamId error:(NSError **)error {
	NSDictionary *_params = @{
		@"teamId": @(teamId)
	};

	NSDictionary *_command = @{@"/team/get-team": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getTeamWithGroupId:(long)groupId name:(NSString *)name error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"name": name
	};

	NSDictionary *_command = @{@"/team/get-team": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getUserTeamsWithUserId:(long)userId error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId)
	};

	NSDictionary *_command = @{@"/team/get-user-teams": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getUserTeamsWithUserId:(long)userId groupId:(long)groupId error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/team/get-user-teams": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (BOOL)hasUserTeamWithUserId:(long)userId teamId:(long)teamId error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"teamId": @(teamId)
	};

	NSDictionary *_command = @{@"/team/has-user-team": _params};

	return (BOOL)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateTeamWithTeamId:(long)teamId name:(NSString *)name description:(NSString *)description error:(NSError **)error {
	NSDictionary *_params = @{
		@"teamId": @(teamId),
		@"name": name,
		@"description": description
	};

	NSDictionary *_command = @{@"/team/update-team": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end