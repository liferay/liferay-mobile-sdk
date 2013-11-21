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
@interface LRResourcePermissionService_v62 : BaseService

- (void)addResourcePermissionWithGroupId:(long)groupId companyId:(long)companyId name:(NSString *)name scope:(int)scope primKey:(NSString *)primKey roleId:(long)roleId actionId:(NSString *)actionId error:(NSError **)error;
- (void)removeResourcePermissionWithGroupId:(long)groupId companyId:(long)companyId name:(NSString *)name scope:(int)scope primKey:(NSString *)primKey roleId:(long)roleId actionId:(NSString *)actionId error:(NSError **)error;
- (void)removeResourcePermissionsWithGroupId:(long)groupId companyId:(long)companyId name:(NSString *)name scope:(int)scope roleId:(long)roleId actionId:(NSString *)actionId error:(NSError **)error;
- (void)setIndividualResourcePermissionsWithGroupId:(long)groupId companyId:(long)companyId name:(NSString *)name primKey:(NSString *)primKey roleIdsToActionIds:(NSDictionary *)roleIdsToActionIds error:(NSError **)error;
- (void)setIndividualResourcePermissionsWithGroupId:(long)groupId companyId:(long)companyId name:(NSString *)name primKey:(NSString *)primKey roleId:(long)roleId actionIds:(NSArray *)actionIds error:(NSError **)error;

@end