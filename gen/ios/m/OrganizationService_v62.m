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

#import "OrganizationService_v62.h"

/**
 * author Bruno Farache
 */
@implementation OrganizationService_v62

- (int)getOrganizationsCount:(long)companyId parentOrganizationId:(long)parentOrganizationId {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"parentOrganizationId": @(parentOrganizationId)
	};

	NSDictionary *_command = @{@"/organization/get-organizations-count": _params};

	return (int)[self.session invoke:_command];
}

- (void)unsetGroupOrganizations:(long)groupId organizationIds:(NSArray *)organizationIds {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"organizationIds": organizationIds
	};

	NSDictionary *_command = @{@"/organization/unset-group-organizations": _params};

	[self.session invoke:_command];
}

- (NSArray *)getUserOrganizations:(long)userId {
	NSDictionary *_params = @{
		@"userId": @(userId)
	};

	NSDictionary *_command = @{@"/organization/get-user-organizations": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (NSArray *)getOrganizations:(long)companyId parentOrganizationId:(long)parentOrganizationId start:(int)start end:(int)end {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"parentOrganizationId": @(parentOrganizationId),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/organization/get-organizations": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (void)addPasswordPolicyOrganizations:(long)passwordPolicyId organizationIds:(NSArray *)organizationIds {
	NSDictionary *_params = @{
		@"passwordPolicyId": @(passwordPolicyId),
		@"organizationIds": organizationIds
	};

	NSDictionary *_command = @{@"/organization/add-password-policy-organizations": _params};

	[self.session invoke:_command];
}

- (void)deleteOrganization:(long)organizationId {
	NSDictionary *_params = @{
		@"organizationId": @(organizationId)
	};

	NSDictionary *_command = @{@"/organization/delete-organization": _params};

	[self.session invoke:_command];
}

- (NSDictionary *)updateOrganization:(long)organizationId parentOrganizationId:(long)parentOrganizationId name:(NSString *)name type:(NSString *)type recursable:(BOOL)recursable regionId:(long)regionId countryId:(long)countryId statusId:(int)statusId comments:(NSString *)comments site:(BOOL)site addresses:(NSArray *)addresses emailAddresses:(NSArray *)emailAddresses orgLabors:(NSArray *)orgLabors phones:(NSArray *)phones websites:(NSArray *)websites serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"organizationId": @(organizationId),
		@"parentOrganizationId": @(parentOrganizationId),
		@"name": name,
		@"type": type,
		@"recursable": @(recursable),
		@"regionId": @(regionId),
		@"countryId": @(countryId),
		@"statusId": @(statusId),
		@"comments": comments,
		@"site": @(site),
		@"addresses": addresses,
		@"emailAddresses": emailAddresses,
		@"orgLabors": orgLabors,
		@"phones": phones,
		@"websites": websites,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/organization/update-organization": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (NSDictionary *)getOrganization:(long)organizationId {
	NSDictionary *_params = @{
		@"organizationId": @(organizationId)
	};

	NSDictionary *_command = @{@"/organization/get-organization": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)deleteLogo:(long)organizationId {
	NSDictionary *_params = @{
		@"organizationId": @(organizationId)
	};

	NSDictionary *_command = @{@"/organization/delete-logo": _params};

	[self.session invoke:_command];
}

- (long)getOrganizationId:(long)companyId name:(NSString *)name {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"name": name
	};

	NSDictionary *_command = @{@"/organization/get-organization-id": _params};

	return (long)[self.session invoke:_command];
}

- (NSDictionary *)addOrganization:(long)parentOrganizationId name:(NSString *)name type:(NSString *)type regionId:(long)regionId countryId:(long)countryId statusId:(int)statusId comments:(NSString *)comments site:(BOOL)site serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"parentOrganizationId": @(parentOrganizationId),
		@"name": name,
		@"type": type,
		@"regionId": @(regionId),
		@"countryId": @(countryId),
		@"statusId": @(statusId),
		@"comments": comments,
		@"site": @(site),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/organization/add-organization": _params};

	return (NSDictionary *)[self.session invoke:_command];
}

- (void)addGroupOrganizations:(long)groupId organizationIds:(NSArray *)organizationIds {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"organizationIds": organizationIds
	};

	NSDictionary *_command = @{@"/organization/add-group-organizations": _params};

	[self.session invoke:_command];
}

- (void)unsetPasswordPolicyOrganizations:(long)passwordPolicyId organizationIds:(NSArray *)organizationIds {
	NSDictionary *_params = @{
		@"passwordPolicyId": @(passwordPolicyId),
		@"organizationIds": organizationIds
	};

	NSDictionary *_command = @{@"/organization/unset-password-policy-organizations": _params};

	[self.session invoke:_command];
}

- (NSArray *)getManageableOrganizations:(NSString *)actionId max:(int)max {
	NSDictionary *_params = @{
		@"actionId": actionId,
		@"max": @(max)
	};

	NSDictionary *_command = @{@"/organization/get-manageable-organizations": _params};

	return (NSArray *)[self.session invoke:_command];
}

- (void)setGroupOrganizations:(long)groupId organizationIds:(NSArray *)organizationIds {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"organizationIds": organizationIds
	};

	NSDictionary *_command = @{@"/organization/set-group-organizations": _params};

	[self.session invoke:_command];
}

@end