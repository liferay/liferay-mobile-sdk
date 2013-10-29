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

/**
 * author: Bruno Farache
 */
@interface ResourcePermissionService_v62 : NSObject

- (void)removeResourcePermissions:(NSNumber *)groupId companyId:(NSNumber *)companyId name:(NSString *)name scope:(NSNumber *)scope roleId:(NSNumber *)roleId actionId:(NSString *)actionId;
- (void)addResourcePermission:(NSNumber *)groupId companyId:(NSNumber *)companyId name:(NSString *)name scope:(NSNumber *)scope primKey:(NSString *)primKey roleId:(NSNumber *)roleId actionId:(NSString *)actionId;
- (void)setIndividualResourcePermissions:(NSNumber *)groupId companyId:(NSNumber *)companyId name:(NSString *)name primKey:(NSString *)primKey roleId:(NSNumber *)roleId actionIds:(NSArray *)actionIds;
- (void)removeResourcePermission:(NSNumber *)groupId companyId:(NSNumber *)companyId name:(NSString *)name scope:(NSNumber *)scope primKey:(NSString *)primKey roleId:(NSNumber *)roleId actionId:(NSString *)actionId;

@end