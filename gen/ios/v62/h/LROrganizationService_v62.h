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
#import "LRBaseService.h"

/**
 * author Bruno Farache
 */
@interface LROrganizationService_v62 : LRBaseService

- (void)addGroupOrganizationsWithGroupId:(long)groupId organizationIds:(NSArray *)organizationIds error:(NSError **)error;
- (NSDictionary *)addOrganizationWithParentOrganizationId:(long)parentOrganizationId name:(NSString *)name type:(NSString *)type recursable:(BOOL)recursable regionId:(long)regionId countryId:(long)countryId statusId:(int)statusId comments:(NSString *)comments site:(BOOL)site serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addOrganizationWithParentOrganizationId:(long)parentOrganizationId name:(NSString *)name type:(NSString *)type regionId:(long)regionId countryId:(long)countryId statusId:(int)statusId comments:(NSString *)comments site:(BOOL)site addresses:(NSArray *)addresses emailAddresses:(NSArray *)emailAddresses orgLabors:(NSArray *)orgLabors phones:(NSArray *)phones websites:(NSArray *)websites serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addOrganizationWithParentOrganizationId:(long)parentOrganizationId name:(NSString *)name type:(NSString *)type recursable:(BOOL)recursable regionId:(long)regionId countryId:(long)countryId statusId:(int)statusId comments:(NSString *)comments site:(BOOL)site addresses:(NSArray *)addresses emailAddresses:(NSArray *)emailAddresses orgLabors:(NSArray *)orgLabors phones:(NSArray *)phones websites:(NSArray *)websites serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addOrganizationWithParentOrganizationId:(long)parentOrganizationId name:(NSString *)name type:(NSString *)type regionId:(long)regionId countryId:(long)countryId statusId:(int)statusId comments:(NSString *)comments site:(BOOL)site serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)addPasswordPolicyOrganizationsWithPasswordPolicyId:(long)passwordPolicyId organizationIds:(NSArray *)organizationIds error:(NSError **)error;
- (void)deleteLogoWithOrganizationId:(long)organizationId error:(NSError **)error;
- (void)deleteOrganizationWithOrganizationId:(long)organizationId error:(NSError **)error;
- (NSArray *)getManageableOrganizationsWithActionId:(NSString *)actionId max:(int)max error:(NSError **)error;
- (NSDictionary *)getOrganizationWithOrganizationId:(long)organizationId error:(NSError **)error;
- (long)getOrganizationIdWithCompanyId:(long)companyId name:(NSString *)name error:(NSError **)error;
- (NSArray *)getOrganizationsWithCompanyId:(long)companyId parentOrganizationId:(long)parentOrganizationId error:(NSError **)error;
- (NSArray *)getOrganizationsWithCompanyId:(long)companyId parentOrganizationId:(long)parentOrganizationId start:(int)start end:(int)end error:(NSError **)error;
- (int)getOrganizationsCountWithCompanyId:(long)companyId parentOrganizationId:(long)parentOrganizationId error:(NSError **)error;
- (NSArray *)getUserOrganizationsWithUserId:(long)userId error:(NSError **)error;
- (void)setGroupOrganizationsWithGroupId:(long)groupId organizationIds:(NSArray *)organizationIds error:(NSError **)error;
- (void)unsetGroupOrganizationsWithGroupId:(long)groupId organizationIds:(NSArray *)organizationIds error:(NSError **)error;
- (void)unsetPasswordPolicyOrganizationsWithPasswordPolicyId:(long)passwordPolicyId organizationIds:(NSArray *)organizationIds error:(NSError **)error;
- (NSDictionary *)updateOrganizationWithOrganizationId:(long)organizationId parentOrganizationId:(long)parentOrganizationId name:(NSString *)name type:(NSString *)type regionId:(long)regionId countryId:(long)countryId statusId:(int)statusId comments:(NSString *)comments site:(BOOL)site serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateOrganizationWithOrganizationId:(long)organizationId parentOrganizationId:(long)parentOrganizationId name:(NSString *)name type:(NSString *)type recursable:(BOOL)recursable regionId:(long)regionId countryId:(long)countryId statusId:(int)statusId comments:(NSString *)comments site:(BOOL)site serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateOrganizationWithOrganizationId:(long)organizationId parentOrganizationId:(long)parentOrganizationId name:(NSString *)name type:(NSString *)type regionId:(long)regionId countryId:(long)countryId statusId:(int)statusId comments:(NSString *)comments site:(BOOL)site addresses:(NSArray *)addresses emailAddresses:(NSArray *)emailAddresses orgLabors:(NSArray *)orgLabors phones:(NSArray *)phones websites:(NSArray *)websites serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateOrganizationWithOrganizationId:(long)organizationId parentOrganizationId:(long)parentOrganizationId name:(NSString *)name type:(NSString *)type recursable:(BOOL)recursable regionId:(long)regionId countryId:(long)countryId statusId:(int)statusId comments:(NSString *)comments site:(BOOL)site addresses:(NSArray *)addresses emailAddresses:(NSArray *)emailAddresses orgLabors:(NSArray *)orgLabors phones:(NSArray *)phones websites:(NSArray *)websites serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;

@end