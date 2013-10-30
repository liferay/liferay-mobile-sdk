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

#import "ResourceBlockService_v62.h"

/**
 * author Bruno Farache
 */
@implementation ResourceBlockService_v62

- (void)setCompanyScopePermissions:(NSNumber *)scopeGroupId companyId:(NSNumber *)companyId name:(NSString *)name roleId:(NSNumber *)roleId actionIds:(NSArray *)actionIds {
}

- (void)addGroupScopePermission:(NSNumber *)scopeGroupId companyId:(NSNumber *)companyId groupId:(NSNumber *)groupId name:(NSString *)name roleId:(NSNumber *)roleId actionId:(NSString *)actionId {
}

- (void)addCompanyScopePermission:(NSNumber *)scopeGroupId companyId:(NSNumber *)companyId name:(NSString *)name roleId:(NSNumber *)roleId actionId:(NSString *)actionId {
}

- (void)removeGroupScopePermission:(NSNumber *)scopeGroupId companyId:(NSNumber *)companyId groupId:(NSNumber *)groupId name:(NSString *)name roleId:(NSNumber *)roleId actionId:(NSString *)actionId {
}

- (void)setGroupScopePermissions:(NSNumber *)scopeGroupId companyId:(NSNumber *)companyId groupId:(NSNumber *)groupId name:(NSString *)name roleId:(NSNumber *)roleId actionIds:(NSArray *)actionIds {
}

- (void)removeCompanyScopePermission:(NSNumber *)scopeGroupId companyId:(NSNumber *)companyId name:(NSString *)name roleId:(NSNumber *)roleId actionId:(NSString *)actionId {
}

- (void)removeIndividualScopePermission:(NSNumber *)companyId groupId:(NSNumber *)groupId name:(NSString *)name primKey:(NSNumber *)primKey roleId:(NSNumber *)roleId actionId:(NSString *)actionId {
}

- (void)removeAllGroupScopePermissions:(NSNumber *)scopeGroupId companyId:(NSNumber *)companyId name:(NSString *)name roleId:(NSNumber *)roleId actionId:(NSString *)actionId {
}

- (void)addIndividualScopePermission:(NSNumber *)companyId groupId:(NSNumber *)groupId name:(NSString *)name primKey:(NSNumber *)primKey roleId:(NSNumber *)roleId actionId:(NSString *)actionId {
}

- (void)setIndividualScopePermissions:(NSNumber *)companyId groupId:(NSNumber *)groupId name:(NSString *)name primKey:(NSNumber *)primKey roleId:(NSNumber *)roleId actionIds:(NSArray *)actionIds {
}

@end