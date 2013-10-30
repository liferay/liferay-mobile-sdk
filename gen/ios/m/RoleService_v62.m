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

#import "RoleService_v62.h"

/**
 * author Bruno Farache
 */
@implementation RoleService_v62

- (BOOL)hasUserRole:(NSNumber *)userId companyId:(NSNumber *)companyId name:(NSString *)name inherited:(BOOL)inherited {
}

- (NSArray *)getUserGroupRoles:(NSNumber *)userId groupId:(NSNumber *)groupId {
}

- (NSDictionary *)addRole:(NSString *)className classPK:(NSNumber *)classPK name:(NSString *)name titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap type:(NSNumber *)type subtype:(NSString *)subtype serviceContext:(NSDictionary *)serviceContext {
}

- (void)unsetUserRoles:(NSNumber *)userId roleIds:(NSArray *)roleIds {
}

- (NSArray *)getUserRoles:(NSNumber *)userId {
}

- (NSArray *)getUserRelatedRoles:(NSNumber *)userId groups:(NSArray *)groups {
}

- (NSDictionary *)getRole:(NSNumber *)companyId name:(NSString *)name {
}

- (NSDictionary *)updateRole:(NSNumber *)roleId name:(NSString *)name titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap subtype:(NSString *)subtype serviceContext:(NSDictionary *)serviceContext {
}

- (NSArray *)getGroupRoles:(NSNumber *)groupId {
}

- (void)deleteRole:(NSNumber *)roleId {
}

- (BOOL)hasUserRoles:(NSNumber *)userId companyId:(NSNumber *)companyId names:(NSArray *)names inherited:(BOOL)inherited {
}

- (void)addUserRoles:(NSNumber *)userId roleIds:(NSArray *)roleIds {
}

- (NSArray *)getUserGroupGroupRoles:(NSNumber *)userId groupId:(NSNumber *)groupId {
}

@end