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
@interface ResourceBlockService_v62 : BaseService

- (void)setCompanyScopePermissions:(long)scopeGroupId companyId:(long)companyId name:(NSString *)name roleId:(long)roleId actionIds:(NSArray *)actionIds;
- (void)addGroupScopePermission:(long)scopeGroupId companyId:(long)companyId groupId:(long)groupId name:(NSString *)name roleId:(long)roleId actionId:(NSString *)actionId;
- (void)addCompanyScopePermission:(long)scopeGroupId companyId:(long)companyId name:(NSString *)name roleId:(long)roleId actionId:(NSString *)actionId;
- (void)removeGroupScopePermission:(long)scopeGroupId companyId:(long)companyId groupId:(long)groupId name:(NSString *)name roleId:(long)roleId actionId:(NSString *)actionId;
- (void)setGroupScopePermissions:(long)scopeGroupId companyId:(long)companyId groupId:(long)groupId name:(NSString *)name roleId:(long)roleId actionIds:(NSArray *)actionIds;
- (void)removeCompanyScopePermission:(long)scopeGroupId companyId:(long)companyId name:(NSString *)name roleId:(long)roleId actionId:(NSString *)actionId;
- (void)removeIndividualScopePermission:(long)companyId groupId:(long)groupId name:(NSString *)name primKey:(long)primKey roleId:(long)roleId actionId:(NSString *)actionId;
- (void)removeAllGroupScopePermissions:(long)scopeGroupId companyId:(long)companyId name:(NSString *)name roleId:(long)roleId actionId:(NSString *)actionId;
- (void)addIndividualScopePermission:(long)companyId groupId:(long)groupId name:(NSString *)name primKey:(long)primKey roleId:(long)roleId actionId:(NSString *)actionId;
- (void)setIndividualScopePermissions:(long)companyId groupId:(long)groupId name:(NSString *)name primKey:(long)primKey roleId:(long)roleId actionIds:(NSArray *)actionIds;

@end