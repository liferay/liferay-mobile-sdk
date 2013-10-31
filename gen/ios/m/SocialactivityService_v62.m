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

#import "SocialactivityService_v62.h"

/**
 * author Bruno Farache
 */
@implementation SocialactivityService_v62

- (int)getUserActivitiesCount:(long)userId {
	NSDictionary *_params = @{
		@"userId": @(userId)
	};

	NSDictionary *_command = @{@"/socialactivity/get-user-activities-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSArray *)getUserGroupsActivities:(long)userId start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/socialactivity/get-user-groups-activities": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (int)getRelationActivitiesCount:(long)userId type:(int)type {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"type": @(type)
	};

	NSDictionary *_command = @{@"/socialactivity/get-relation-activities-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSDictionary *)getMirrorActivity:(long)mirrorActivityId {
	NSDictionary *_params = @{
		@"mirrorActivityId": @(mirrorActivityId)
	};

	NSDictionary *_command = @{@"/socialactivity/get-mirror-activity": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSArray *)getUserGroupsAndOrganizationsActivities:(long)userId start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/socialactivity/get-user-groups-and-organizations-activities": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (int)getUserOrganizationsActivitiesCount:(long)userId {
	NSDictionary *_params = @{
		@"userId": @(userId)
	};

	NSDictionary *_command = @{@"/socialactivity/get-user-organizations-activities-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSDictionary *)getActivity:(long)activityId {
	NSDictionary *_params = @{
		@"activityId": @(activityId)
	};

	NSDictionary *_command = @{@"/socialactivity/get-activity": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (int)getActivitiesCount:(long)mirrorActivityId classNameId:(long)classNameId classPK:(long)classPK {
	NSDictionary *_params = @{
		@"mirrorActivityId": @(mirrorActivityId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK)
	};

	NSDictionary *_command = @{@"/socialactivity/get-activities-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSArray *)getGroupUsersActivities:(long)groupId start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/socialactivity/get-group-users-activities": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSArray *)getOrganizationUsersActivities:(long)organizationId start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"organizationId": @(organizationId),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/socialactivity/get-organization-users-activities": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSArray *)getActivitySetActivities:(long)activitySetId start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"activitySetId": @(activitySetId),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/socialactivity/get-activity-set-activities": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSArray *)getOrganizationActivities:(long)organizationId start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"organizationId": @(organizationId),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/socialactivity/get-organization-activities": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (int)getGroupUsersActivitiesCount:(long)groupId {
	NSDictionary *_params = @{
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/socialactivity/get-group-users-activities-count": _params};

	return (int)[self.session invoke:_command];
}

- (int)getGroupActivitiesCount:(long)groupId {
	NSDictionary *_params = @{
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/socialactivity/get-group-activities-count": _params};

	return (int)[self.session invoke:_command];
}

- (int)getUserGroupsAndOrganizationsActivitiesCount:(long)userId {
	NSDictionary *_params = @{
		@"userId": @(userId)
	};

	NSDictionary *_command = @{@"/socialactivity/get-user-groups-and-organizations-activities-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSArray *)getGroupActivities:(long)groupId start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/socialactivity/get-group-activities": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (int)getUserGroupsActivitiesCount:(long)userId {
	NSDictionary *_params = @{
		@"userId": @(userId)
	};

	NSDictionary *_command = @{@"/socialactivity/get-user-groups-activities-count": _params};

	return (int)[self.session invoke:_command];
}

- (int)getOrganizationUsersActivitiesCount:(long)organizationId {
	NSDictionary *_params = @{
		@"organizationId": @(organizationId)
	};

	NSDictionary *_command = @{@"/socialactivity/get-organization-users-activities-count": _params};

	return (int)[self.session invoke:_command];
}

- (NSArray *)getActivities:(long)mirrorActivityId classNameId:(long)classNameId classPK:(long)classPK start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"mirrorActivityId": @(mirrorActivityId),
		@"classNameId": @(classNameId),
		@"classPK": @(classPK),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/socialactivity/get-activities": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSArray *)getUserActivities:(long)userId start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/socialactivity/get-user-activities": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSArray *)getRelationActivities:(long)userId type:(int)type start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"type": @(type),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/socialactivity/get-relation-activities": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSArray *)getUserOrganizationsActivities:(long)userId start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/socialactivity/get-user-organizations-activities": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (int)getOrganizationActivitiesCount:(long)organizationId {
	NSDictionary *_params = @{
		@"organizationId": @(organizationId)
	};

	NSDictionary *_command = @{@"/socialactivity/get-organization-activities-count": _params};

	return (int)[self.session invoke:_command];
}

@end