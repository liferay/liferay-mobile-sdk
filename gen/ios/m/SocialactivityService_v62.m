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

- (NSNumber *)getUserActivitiesCount:(NSNumber *)userId {
	NSDictionary *_params = @{
		@"userId": userId
	};

	NSDictionary *_command = @{@"/socialactivity/get-user-activities-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSArray *)getUserGroupsActivities:(NSNumber *)userId start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"userId": userId,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/socialactivity/get-user-groups-activities": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSNumber *)getRelationActivitiesCount:(NSNumber *)userId type:(NSNumber *)type {
	NSDictionary *_params = @{
		@"userId": userId,
		@"type": type
	};

	NSDictionary *_command = @{@"/socialactivity/get-relation-activities-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSDictionary *)getMirrorActivity:(NSNumber *)mirrorActivityId {
	NSDictionary *_params = @{
		@"mirrorActivityId": mirrorActivityId
	};

	NSDictionary *_command = @{@"/socialactivity/get-mirror-activity": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getUserGroupsAndOrganizationsActivities:(NSNumber *)userId start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"userId": userId,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/socialactivity/get-user-groups-and-organizations-activities": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSNumber *)getUserOrganizationsActivitiesCount:(NSNumber *)userId {
	NSDictionary *_params = @{
		@"userId": userId
	};

	NSDictionary *_command = @{@"/socialactivity/get-user-organizations-activities-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSDictionary *)getActivity:(NSNumber *)activityId {
	NSDictionary *_params = @{
		@"activityId": activityId
	};

	NSDictionary *_command = @{@"/socialactivity/get-activity": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSNumber *)getActivitiesCount:(NSNumber *)mirrorActivityId classNameId:(NSNumber *)classNameId classPK:(NSNumber *)classPK {
	NSDictionary *_params = @{
		@"mirrorActivityId": mirrorActivityId,
		@"classNameId": classNameId,
		@"classPK": classPK
	};

	NSDictionary *_command = @{@"/socialactivity/get-activities-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSArray *)getGroupUsersActivities:(NSNumber *)groupId start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/socialactivity/get-group-users-activities": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSArray *)getOrganizationUsersActivities:(NSNumber *)organizationId start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"organizationId": organizationId,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/socialactivity/get-organization-users-activities": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSArray *)getActivitySetActivities:(NSNumber *)activitySetId start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"activitySetId": activitySetId,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/socialactivity/get-activity-set-activities": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSArray *)getOrganizationActivities:(NSNumber *)organizationId start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"organizationId": organizationId,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/socialactivity/get-organization-activities": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSNumber *)getGroupUsersActivitiesCount:(NSNumber *)groupId {
	NSDictionary *_params = @{
		@"groupId": groupId
	};

	NSDictionary *_command = @{@"/socialactivity/get-group-users-activities-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSNumber *)getGroupActivitiesCount:(NSNumber *)groupId {
	NSDictionary *_params = @{
		@"groupId": groupId
	};

	NSDictionary *_command = @{@"/socialactivity/get-group-activities-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSNumber *)getUserGroupsAndOrganizationsActivitiesCount:(NSNumber *)userId {
	NSDictionary *_params = @{
		@"userId": userId
	};

	NSDictionary *_command = @{@"/socialactivity/get-user-groups-and-organizations-activities-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSArray *)getGroupActivities:(NSNumber *)groupId start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/socialactivity/get-group-activities": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSNumber *)getUserGroupsActivitiesCount:(NSNumber *)userId {
	NSDictionary *_params = @{
		@"userId": userId
	};

	NSDictionary *_command = @{@"/socialactivity/get-user-groups-activities-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSNumber *)getOrganizationUsersActivitiesCount:(NSNumber *)organizationId {
	NSDictionary *_params = @{
		@"organizationId": organizationId
	};

	NSDictionary *_command = @{@"/socialactivity/get-organization-users-activities-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSArray *)getActivities:(NSNumber *)mirrorActivityId classNameId:(NSNumber *)classNameId classPK:(NSNumber *)classPK start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"mirrorActivityId": mirrorActivityId,
		@"classNameId": classNameId,
		@"classPK": classPK,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/socialactivity/get-activities": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSArray *)getUserActivities:(NSNumber *)userId start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"userId": userId,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/socialactivity/get-user-activities": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSArray *)getRelationActivities:(NSNumber *)userId type:(NSNumber *)type start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"userId": userId,
		@"type": type,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/socialactivity/get-relation-activities": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSArray *)getUserOrganizationsActivities:(NSNumber *)userId start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"userId": userId,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/socialactivity/get-user-organizations-activities": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSNumber *)getOrganizationActivitiesCount:(NSNumber *)organizationId {
	NSDictionary *_params = @{
		@"organizationId": organizationId
	};

	NSDictionary *_command = @{@"/socialactivity/get-organization-activities-count": _params};

	return (NSNumber *)[session invoke:_command];
}

@end