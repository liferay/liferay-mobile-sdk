/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

#if defined(LIFERAY_MOBILE_SDK_FRAMEWORK) && defined(LIFERAY_MOBILE_SDK_APP)
    @import LRMobileSDK;
#else
    #import "LRBaseService.h"
#endif

/**
 * @author Bruno Farache
 */
@interface LROrganizationService_v71 : LRBaseService

- (NSArray *)getUserOrganizationsWithUserId:(long long)userId error:(NSError **)error;
- (NSDictionary *)addOrganizationWithParentOrganizationId:(long long)parentOrganizationId name:(NSString *)name type:(NSString *)type regionId:(long long)regionId countryId:(long long)countryId statusId:(long long)statusId comments:(NSString *)comments site:(BOOL)site serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addOrganizationWithParentOrganizationId:(long long)parentOrganizationId name:(NSString *)name type:(NSString *)type regionId:(long long)regionId countryId:(long long)countryId statusId:(long long)statusId comments:(NSString *)comments site:(BOOL)site addresses:(NSArray *)addresses emailAddresses:(NSArray *)emailAddresses orgLabors:(NSArray *)orgLabors phones:(NSArray *)phones websites:(NSArray *)websites serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateOrganizationWithOrganizationId:(long long)organizationId parentOrganizationId:(long long)parentOrganizationId name:(NSString *)name type:(NSString *)type regionId:(long long)regionId countryId:(long long)countryId statusId:(long long)statusId comments:(NSString *)comments site:(BOOL)site serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateOrganizationWithOrganizationId:(long long)organizationId parentOrganizationId:(long long)parentOrganizationId name:(NSString *)name type:(NSString *)type regionId:(long long)regionId countryId:(long long)countryId statusId:(long long)statusId comments:(NSString *)comments site:(BOOL)site addresses:(NSArray *)addresses emailAddresses:(NSArray *)emailAddresses orgLabors:(NSArray *)orgLabors phones:(NSArray *)phones websites:(NSArray *)websites serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateOrganizationWithOrganizationId:(long long)organizationId parentOrganizationId:(long long)parentOrganizationId name:(NSString *)name type:(NSString *)type regionId:(long long)regionId countryId:(long long)countryId statusId:(long long)statusId comments:(NSString *)comments logo:(BOOL)logo logoBytes:(NSData *)logoBytes site:(BOOL)site addresses:(NSArray *)addresses emailAddresses:(NSArray *)emailAddresses orgLabors:(NSArray *)orgLabors phones:(NSArray *)phones websites:(NSArray *)websites serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)fetchOrganizationWithOrganizationId:(long long)organizationId error:(NSError **)error;
- (void)addGroupOrganizationsWithGroupId:(long long)groupId organizationIds:(NSArray *)organizationIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)addPasswordPolicyOrganizationsWithPasswordPolicyId:(long long)passwordPolicyId organizationIds:(NSArray *)organizationIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)deleteOrganizationWithOrganizationId:(long long)organizationId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSNumber *)getOrganizationsCountWithCompanyId:(long long)companyId parentOrganizationId:(long long)parentOrganizationId error:(NSError **)error;
- (void)unsetGroupOrganizationsWithGroupId:(long long)groupId organizationIds:(NSArray *)organizationIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)unsetPasswordPolicyOrganizationsWithPasswordPolicyId:(long long)passwordPolicyId organizationIds:(NSArray *)organizationIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)deleteLogoWithOrganizationId:(long long)organizationId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)setGroupOrganizationsWithGroupId:(long long)groupId organizationIds:(NSArray *)organizationIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)getOrganizationWithOrganizationId:(long long)organizationId error:(NSError **)error;
- (NSArray *)getOrganizationsWithCompanyId:(long long)companyId parentOrganizationId:(long long)parentOrganizationId error:(NSError **)error;
- (NSArray *)getOrganizationsWithCompanyId:(long long)companyId parentOrganizationId:(long long)parentOrganizationId start:(int)start end:(int)end error:(NSError **)error;
- (NSNumber *)getOrganizationIdWithCompanyId:(long long)companyId name:(NSString *)name error:(NSError **)error;

@end