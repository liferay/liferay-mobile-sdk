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
@interface LRSocialActivityService_v62 : BaseService

- (NSArray *)getActivitiesWithClassName:(NSString *)className start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getActivitiesWithClassNameId:(long)classNameId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getActivitiesWithMirrorActivityId:(long)mirrorActivityId className:(NSString *)className classPK:(long)classPK start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getActivitiesWithMirrorActivityId:(long)mirrorActivityId classNameId:(long)classNameId classPK:(long)classPK start:(int)start end:(int)end error:(NSError **)error;
- (int)getActivitiesCountWithClassName:(NSString *)className error:(NSError **)error;
- (int)getActivitiesCountWithClassNameId:(long)classNameId error:(NSError **)error;
- (int)getActivitiesCountWithMirrorActivityId:(long)mirrorActivityId className:(NSString *)className classPK:(long)classPK error:(NSError **)error;
- (int)getActivitiesCountWithMirrorActivityId:(long)mirrorActivityId classNameId:(long)classNameId classPK:(long)classPK error:(NSError **)error;
- (NSDictionary *)getActivityWithActivityId:(long)activityId error:(NSError **)error;
- (NSArray *)getActivitySetActivitiesWithActivitySetId:(long)activitySetId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getGroupActivitiesWithGroupId:(long)groupId start:(int)start end:(int)end error:(NSError **)error;
- (int)getGroupActivitiesCountWithGroupId:(long)groupId error:(NSError **)error;
- (NSArray *)getGroupUsersActivitiesWithGroupId:(long)groupId start:(int)start end:(int)end error:(NSError **)error;
- (int)getGroupUsersActivitiesCountWithGroupId:(long)groupId error:(NSError **)error;
- (NSDictionary *)getMirrorActivityWithMirrorActivityId:(long)mirrorActivityId error:(NSError **)error;
- (NSArray *)getOrganizationActivitiesWithOrganizationId:(long)organizationId start:(int)start end:(int)end error:(NSError **)error;
- (int)getOrganizationActivitiesCountWithOrganizationId:(long)organizationId error:(NSError **)error;
- (NSArray *)getOrganizationUsersActivitiesWithOrganizationId:(long)organizationId start:(int)start end:(int)end error:(NSError **)error;
- (int)getOrganizationUsersActivitiesCountWithOrganizationId:(long)organizationId error:(NSError **)error;
- (NSArray *)getRelationActivitiesWithUserId:(long)userId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getRelationActivitiesWithUserId:(long)userId type:(int)type start:(int)start end:(int)end error:(NSError **)error;
- (int)getRelationActivitiesCountWithUserId:(long)userId error:(NSError **)error;
- (int)getRelationActivitiesCountWithUserId:(long)userId type:(int)type error:(NSError **)error;
- (NSArray *)getUserActivitiesWithUserId:(long)userId start:(int)start end:(int)end error:(NSError **)error;
- (int)getUserActivitiesCountWithUserId:(long)userId error:(NSError **)error;
- (NSArray *)getUserGroupsActivitiesWithUserId:(long)userId start:(int)start end:(int)end error:(NSError **)error;
- (int)getUserGroupsActivitiesCountWithUserId:(long)userId error:(NSError **)error;
- (NSArray *)getUserGroupsAndOrganizationsActivitiesWithUserId:(long)userId start:(int)start end:(int)end error:(NSError **)error;
- (int)getUserGroupsAndOrganizationsActivitiesCountWithUserId:(long)userId error:(NSError **)error;
- (NSArray *)getUserOrganizationsActivitiesWithUserId:(long)userId start:(int)start end:(int)end error:(NSError **)error;
- (int)getUserOrganizationsActivitiesCountWithUserId:(long)userId error:(NSError **)error;

@end