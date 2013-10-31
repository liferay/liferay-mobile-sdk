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
@interface RoleService_v62 : BaseService

- (BOOL)hasUserRole:(long)userId companyId:(long)companyId name:(NSString *)name inherited:(BOOL)inherited;
- (NSArray *)getUserGroupRoles:(long)userId groupId:(long)groupId;
- (NSDictionary *)addRole:(NSString *)className classPK:(long)classPK name:(NSString *)name titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap type:(int)type subtype:(NSString *)subtype serviceContext:(NSDictionary *)serviceContext;
- (void)unsetUserRoles:(long)userId roleIds:(NSArray *)roleIds;
- (NSArray *)getUserRoles:(long)userId;
- (NSArray *)getUserRelatedRoles:(long)userId groups:(NSArray *)groups;
- (NSDictionary *)getRole:(long)companyId name:(NSString *)name;
- (NSDictionary *)updateRole:(long)roleId name:(NSString *)name titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap subtype:(NSString *)subtype serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getGroupRoles:(long)groupId;
- (void)deleteRole:(long)roleId;
- (BOOL)hasUserRoles:(long)userId companyId:(long)companyId names:(NSArray *)names inherited:(BOOL)inherited;
- (void)addUserRoles:(long)userId roleIds:(NSArray *)roleIds;
- (NSArray *)getUserGroupGroupRoles:(long)userId groupId:(long)groupId;

@end