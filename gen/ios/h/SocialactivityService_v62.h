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
@interface SocialactivityService_v62 : BaseService

- (int)getUserActivitiesCount:(long)userId;
- (NSArray *)getUserGroupsActivities:(long)userId start:(int)start end:(int)end;
- (int)getRelationActivitiesCount:(long)userId type:(int)type;
- (NSDictionary *)getMirrorActivity:(long)mirrorActivityId;
- (NSArray *)getUserGroupsAndOrganizationsActivities:(long)userId start:(int)start end:(int)end;
- (int)getUserOrganizationsActivitiesCount:(long)userId;
- (NSDictionary *)getActivity:(long)activityId;
- (int)getActivitiesCount:(long)mirrorActivityId classNameId:(long)classNameId classPK:(long)classPK;
- (NSArray *)getGroupUsersActivities:(long)groupId start:(int)start end:(int)end;
- (NSArray *)getOrganizationUsersActivities:(long)organizationId start:(int)start end:(int)end;
- (NSArray *)getActivitySetActivities:(long)activitySetId start:(int)start end:(int)end;
- (NSArray *)getOrganizationActivities:(long)organizationId start:(int)start end:(int)end;
- (int)getGroupUsersActivitiesCount:(long)groupId;
- (int)getGroupActivitiesCount:(long)groupId;
- (int)getUserGroupsAndOrganizationsActivitiesCount:(long)userId;
- (NSArray *)getGroupActivities:(long)groupId start:(int)start end:(int)end;
- (int)getUserGroupsActivitiesCount:(long)userId;
- (int)getOrganizationUsersActivitiesCount:(long)organizationId;
- (NSArray *)getActivities:(long)mirrorActivityId classNameId:(long)classNameId classPK:(long)classPK start:(int)start end:(int)end;
- (NSArray *)getUserActivities:(long)userId start:(int)start end:(int)end;
- (NSArray *)getRelationActivities:(long)userId type:(int)type start:(int)start end:(int)end;
- (NSArray *)getUserOrganizationsActivities:(long)userId start:(int)start end:(int)end;
- (int)getOrganizationActivitiesCount:(long)organizationId;

@end