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

#import "TeamService_v62.h"

/**
 * author Bruno Farache
 */
@implementation TeamService_v62

- (NSDictionary *)addTeam:(NSNumber *)groupId name:(NSString *)name description:(NSString *)description {
}

- (NSArray *)getUserTeams:(NSNumber *)userId groupId:(NSNumber *)groupId {
}

- (NSDictionary *)updateTeam:(NSNumber *)teamId name:(NSString *)name description:(NSString *)description {
}

- (BOOL)hasUserTeam:(NSNumber *)userId teamId:(NSNumber *)teamId {
}

- (NSDictionary *)getTeam:(NSNumber *)groupId name:(NSString *)name {
}

- (NSArray *)getGroupTeams:(NSNumber *)groupId {
}

- (void)deleteTeam:(NSNumber *)teamId {
}

@end