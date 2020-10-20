/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

#import "LRUserGroupService_v73.h"

/**
 * @author Bruno Farache
 */
@implementation LRUserGroupService_v73

- (NSDictionary *)addUserGroupWithName:(NSString *)name description:(NSString *)description serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/usergroup/add-user-group": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateUserGroupWithUserGroupId:(long long)userGroupId name:(NSString *)name description:(NSString *)description serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userGroupId": @(userGroupId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
	}];

	[self mangleWrapperWithParams:_params name:@"serviceContext" className:@"com.liferay.portal.kernel.service.ServiceContext" wrapper:serviceContext];

	NSDictionary *_command = @{@"/usergroup/update-user-group": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getUserGroupWithUserGroupId:(long long)userGroupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userGroupId": @(userGroupId)
	}];

	NSDictionary *_command = @{@"/usergroup/get-user-group": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getUserGroupWithName:(NSString *)name error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"name": [self checkNull: name]
	}];

	NSDictionary *_command = @{@"/usergroup/get-user-group": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getUserGroupsWithCompanyId:(long long)companyId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId)
	}];

	NSDictionary *_command = @{@"/usergroup/get-user-groups": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getUserGroupsWithCompanyId:(long long)companyId name:(NSString *)name start:(int)start end:(int)end error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"name": [self checkNull: name],
		@"start": @(start),
		@"end": @(end)
	}];

	NSDictionary *_command = @{@"/usergroup/get-user-groups": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)fetchUserGroupWithUserGroupId:(long long)userGroupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userGroupId": @(userGroupId)
	}];

	NSDictionary *_command = @{@"/usergroup/fetch-user-group": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getUserUserGroupsWithUserId:(long long)userId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userId": @(userId)
	}];

	NSDictionary *_command = @{@"/usergroup/get-user-user-groups": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (void)deleteUserGroupWithUserGroupId:(long long)userGroupId error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"userGroupId": @(userGroupId)
	}];

	NSDictionary *_command = @{@"/usergroup/delete-user-group": _params};

	[self.session invoke:_command error:error];
}

- (NSNumber *)getUserGroupsCountWithCompanyId:(long long)companyId name:(NSString *)name error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"name": [self checkNull: name]
	}];

	NSDictionary *_command = @{@"/usergroup/get-user-groups-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)searchCountWithCompanyId:(long long)companyId name:(NSString *)name description:(NSString *)description params:(NSDictionary *)params andOperator:(BOOL)andOperator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"params": [self checkNull: params],
		@"andOperator": @(andOperator)
	}];

	NSDictionary *_command = @{@"/usergroup/search-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)searchCountWithCompanyId:(long long)companyId keywords:(NSString *)keywords params:(NSDictionary *)params error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"keywords": [self checkNull: keywords],
		@"params": [self checkNull: params]
	}];

	NSDictionary *_command = @{@"/usergroup/search-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (void)addGroupUserGroupsWithGroupId:(long long)groupId userGroupIds:(NSArray *)userGroupIds error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"userGroupIds": [self checkNull: userGroupIds]
	}];

	NSDictionary *_command = @{@"/usergroup/add-group-user-groups": _params};

	[self.session invoke:_command error:error];
}

- (void)unsetGroupUserGroupsWithGroupId:(long long)groupId userGroupIds:(NSArray *)userGroupIds error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"groupId": @(groupId),
		@"userGroupIds": [self checkNull: userGroupIds]
	}];

	NSDictionary *_command = @{@"/usergroup/unset-group-user-groups": _params};

	[self.session invoke:_command error:error];
}

- (void)unsetTeamUserGroupsWithTeamId:(long long)teamId userGroupIds:(NSArray *)userGroupIds error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"teamId": @(teamId),
		@"userGroupIds": [self checkNull: userGroupIds]
	}];

	NSDictionary *_command = @{@"/usergroup/unset-team-user-groups": _params};

	[self.session invoke:_command error:error];
}

- (void)addTeamUserGroupsWithTeamId:(long long)teamId userGroupIds:(NSArray *)userGroupIds error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"teamId": @(teamId),
		@"userGroupIds": [self checkNull: userGroupIds]
	}];

	NSDictionary *_command = @{@"/usergroup/add-team-user-groups": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getGtUserGroupsWithGtUserGroupId:(long long)gtUserGroupId companyId:(long long)companyId parentUserGroupId:(long long)parentUserGroupId size:(int)size error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"gtUserGroupId": @(gtUserGroupId),
		@"companyId": @(companyId),
		@"parentUserGroupId": @(parentUserGroupId),
		@"size": @(size)
	}];

	NSDictionary *_command = @{@"/usergroup/get-gt-user-groups": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)searchWithCompanyId:(long long)companyId name:(NSString *)name description:(NSString *)description params:(NSDictionary *)params andOperator:(BOOL)andOperator start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"name": [self checkNull: name],
		@"description": [self checkNull: description],
		@"params": [self checkNull: params],
		@"andOperator": @(andOperator),
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.portal.kernel.model.UserGroup>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/usergroup/search": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)searchWithCompanyId:(long long)companyId keywords:(NSString *)keywords params:(NSDictionary *)params start:(int)start end:(int)end orderByComparator:(LRJSONObjectWrapper *)orderByComparator error:(NSError **)error {
	NSMutableDictionary *_params = [NSMutableDictionary dictionaryWithDictionary:@{
		@"companyId": @(companyId),
		@"keywords": [self checkNull: keywords],
		@"params": [self checkNull: params],
		@"start": @(start),
		@"end": @(end),
	}];

	[self mangleWrapperWithParams:_params name:@"orderByComparator" className:@"com.liferay.portal.kernel.util.OrderByComparator<com.liferay.portal.kernel.model.UserGroup>" wrapper:orderByComparator];

	NSDictionary *_command = @{@"/usergroup/search": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

@end