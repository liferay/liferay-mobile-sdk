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
@interface TeamService_v62 : BaseService

- (NSDictionary *)addTeam:(long)groupId name:(NSString *)name description:(NSString *)description;
- (NSArray *)getUserTeams:(long)userId groupId:(long)groupId;
- (NSDictionary *)updateTeam:(long)teamId name:(NSString *)name description:(NSString *)description;
- (BOOL)hasUserTeam:(long)userId teamId:(long)teamId;
- (NSDictionary *)getTeam:(long)groupId name:(NSString *)name;
- (NSArray *)getGroupTeams:(long)groupId;
- (void)deleteTeam:(long)teamId;

@end