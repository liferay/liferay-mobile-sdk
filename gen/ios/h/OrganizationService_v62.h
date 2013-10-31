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
@interface OrganizationService_v62 : BaseService

- (int)getOrganizationsCount:(long)companyId parentOrganizationId:(long)parentOrganizationId;
- (void)unsetGroupOrganizations:(long)groupId organizationIds:(NSArray *)organizationIds;
- (NSArray *)getUserOrganizations:(long)userId;
- (NSArray *)getOrganizations:(long)companyId parentOrganizationId:(long)parentOrganizationId start:(int)start end:(int)end;
- (void)addPasswordPolicyOrganizations:(long)passwordPolicyId organizationIds:(NSArray *)organizationIds;
- (void)deleteOrganization:(long)organizationId;
- (NSDictionary *)updateOrganization:(long)organizationId parentOrganizationId:(long)parentOrganizationId name:(NSString *)name type:(NSString *)type recursable:(BOOL)recursable regionId:(long)regionId countryId:(long)countryId statusId:(int)statusId comments:(NSString *)comments site:(BOOL)site addresses:(NSArray *)addresses emailAddresses:(NSArray *)emailAddresses orgLabors:(NSArray *)orgLabors phones:(NSArray *)phones websites:(NSArray *)websites serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)getOrganization:(long)organizationId;
- (void)deleteLogo:(long)organizationId;
- (long)getOrganizationId:(long)companyId name:(NSString *)name;
- (NSDictionary *)addOrganization:(long)parentOrganizationId name:(NSString *)name type:(NSString *)type regionId:(long)regionId countryId:(long)countryId statusId:(int)statusId comments:(NSString *)comments site:(BOOL)site serviceContext:(NSDictionary *)serviceContext;
- (void)addGroupOrganizations:(long)groupId organizationIds:(NSArray *)organizationIds;
- (void)unsetPasswordPolicyOrganizations:(long)passwordPolicyId organizationIds:(NSArray *)organizationIds;
- (NSArray *)getManageableOrganizations:(NSString *)actionId max:(int)max;
- (void)setGroupOrganizations:(long)groupId organizationIds:(NSArray *)organizationIds;

@end