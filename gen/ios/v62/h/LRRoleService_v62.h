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
@interface LRRoleService_v62 : BaseService

- (NSDictionary *)addRoleWithName:(NSString *)name titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap type:(int)type error:(NSError **)error;
- (NSDictionary *)addRoleWithClassName:(NSString *)className classPK:(long)classPK name:(NSString *)name titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap type:(int)type subtype:(NSString *)subtype serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)addUserRolesWithUserId:(long)userId roleIds:(NSArray *)roleIds error:(NSError **)error;
- (void)deleteRoleWithRoleId:(long)roleId error:(NSError **)error;
- (NSArray *)getGroupRolesWithGroupId:(long)groupId error:(NSError **)error;
- (NSDictionary *)getRoleWithRoleId:(long)roleId error:(NSError **)error;
- (NSDictionary *)getRoleWithCompanyId:(long)companyId name:(NSString *)name error:(NSError **)error;
- (NSArray *)getUserGroupGroupRolesWithUserId:(long)userId groupId:(long)groupId error:(NSError **)error;
- (NSArray *)getUserGroupRolesWithUserId:(long)userId groupId:(long)groupId error:(NSError **)error;
- (NSArray *)getUserRelatedRolesWithUserId:(long)userId groups:(NSArray *)groups error:(NSError **)error;
- (NSArray *)getUserRolesWithUserId:(long)userId error:(NSError **)error;
- (BOOL)hasUserRoleWithUserId:(long)userId companyId:(long)companyId name:(NSString *)name inherited:(BOOL)inherited error:(NSError **)error;
- (BOOL)hasUserRolesWithUserId:(long)userId companyId:(long)companyId names:(NSArray *)names inherited:(BOOL)inherited error:(NSError **)error;
- (void)unsetUserRolesWithUserId:(long)userId roleIds:(NSArray *)roleIds error:(NSError **)error;
- (NSDictionary *)updateRoleWithRoleId:(long)roleId name:(NSString *)name titleMap:(NSDictionary *)titleMap descriptionMap:(NSDictionary *)descriptionMap subtype:(NSString *)subtype serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;

@end