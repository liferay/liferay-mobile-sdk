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

#import "LRUserService_v62.h"

/**
 * author Bruno Farache
 */
@implementation LRUserService_v62

- (void)addGroupUsersWithGroupId:(long)groupId userIds:(NSArray *)userIds serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userIds": userIds,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/user/add-group-users": _params};

	[self.session invoke:_command error:error];
}

- (void)addOrganizationUsersWithOrganizationId:(long)organizationId userIds:(NSArray *)userIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"organizationId": @(organizationId),
		@"userIds": userIds
	};

	NSDictionary *_command = @{@"/user/add-organization-users": _params};

	[self.session invoke:_command error:error];
}

- (void)addPasswordPolicyUsersWithPasswordPolicyId:(long)passwordPolicyId userIds:(NSArray *)userIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"passwordPolicyId": @(passwordPolicyId),
		@"userIds": userIds
	};

	NSDictionary *_command = @{@"/user/add-password-policy-users": _params};

	[self.session invoke:_command error:error];
}

- (void)addRoleUsersWithRoleId:(long)roleId userIds:(NSArray *)userIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"roleId": @(roleId),
		@"userIds": userIds
	};

	NSDictionary *_command = @{@"/user/add-role-users": _params};

	[self.session invoke:_command error:error];
}

- (void)addTeamUsersWithTeamId:(long)teamId userIds:(NSArray *)userIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"teamId": @(teamId),
		@"userIds": userIds
	};

	NSDictionary *_command = @{@"/user/add-team-users": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)addUserWithCompanyId:(long)companyId autoPassword:(BOOL)autoPassword password1:(NSString *)password1 password2:(NSString *)password2 autoScreenName:(BOOL)autoScreenName screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(long)facebookId openId:(NSString *)openId locale:(NSString *)locale firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(int)prefixId suffixId:(int)suffixId male:(BOOL)male birthdayMonth:(int)birthdayMonth birthdayDay:(int)birthdayDay birthdayYear:(int)birthdayYear jobTitle:(NSString *)jobTitle groupIds:(NSArray *)groupIds organizationIds:(NSArray *)organizationIds roleIds:(NSArray *)roleIds userGroupIds:(NSArray *)userGroupIds sendEmail:(BOOL)sendEmail serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"autoPassword": @(autoPassword),
		@"password1": password1,
		@"password2": password2,
		@"autoScreenName": @(autoScreenName),
		@"screenName": screenName,
		@"emailAddress": emailAddress,
		@"facebookId": @(facebookId),
		@"openId": openId,
		@"locale": locale,
		@"firstName": firstName,
		@"middleName": middleName,
		@"lastName": lastName,
		@"prefixId": @(prefixId),
		@"suffixId": @(suffixId),
		@"male": @(male),
		@"birthdayMonth": @(birthdayMonth),
		@"birthdayDay": @(birthdayDay),
		@"birthdayYear": @(birthdayYear),
		@"jobTitle": jobTitle,
		@"groupIds": groupIds,
		@"organizationIds": organizationIds,
		@"roleIds": roleIds,
		@"userGroupIds": userGroupIds,
		@"sendEmail": @(sendEmail),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/user/add-user": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addUserWithCompanyId:(long)companyId autoPassword:(BOOL)autoPassword password1:(NSString *)password1 password2:(NSString *)password2 autoScreenName:(BOOL)autoScreenName screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(long)facebookId openId:(NSString *)openId locale:(NSString *)locale firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(int)prefixId suffixId:(int)suffixId male:(BOOL)male birthdayMonth:(int)birthdayMonth birthdayDay:(int)birthdayDay birthdayYear:(int)birthdayYear jobTitle:(NSString *)jobTitle groupIds:(NSArray *)groupIds organizationIds:(NSArray *)organizationIds roleIds:(NSArray *)roleIds userGroupIds:(NSArray *)userGroupIds addresses:(NSArray *)addresses emailAddresses:(NSArray *)emailAddresses phones:(NSArray *)phones websites:(NSArray *)websites announcementsDelivers:(NSArray *)announcementsDelivers sendEmail:(BOOL)sendEmail serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"autoPassword": @(autoPassword),
		@"password1": password1,
		@"password2": password2,
		@"autoScreenName": @(autoScreenName),
		@"screenName": screenName,
		@"emailAddress": emailAddress,
		@"facebookId": @(facebookId),
		@"openId": openId,
		@"locale": locale,
		@"firstName": firstName,
		@"middleName": middleName,
		@"lastName": lastName,
		@"prefixId": @(prefixId),
		@"suffixId": @(suffixId),
		@"male": @(male),
		@"birthdayMonth": @(birthdayMonth),
		@"birthdayDay": @(birthdayDay),
		@"birthdayYear": @(birthdayYear),
		@"jobTitle": jobTitle,
		@"groupIds": groupIds,
		@"organizationIds": organizationIds,
		@"roleIds": roleIds,
		@"userGroupIds": userGroupIds,
		@"addresses": addresses,
		@"emailAddresses": emailAddresses,
		@"phones": phones,
		@"websites": websites,
		@"announcementsDelivers": announcementsDelivers,
		@"sendEmail": @(sendEmail),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/user/add-user": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)addUserGroupUsersWithUserGroupId:(long)userGroupId userIds:(NSArray *)userIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"userGroupId": @(userGroupId),
		@"userIds": userIds
	};

	NSDictionary *_command = @{@"/user/add-user-group-users": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)addUserWithWorkflowWithCompanyId:(long)companyId autoPassword:(BOOL)autoPassword password1:(NSString *)password1 password2:(NSString *)password2 autoScreenName:(BOOL)autoScreenName screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(long)facebookId openId:(NSString *)openId locale:(NSString *)locale firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(int)prefixId suffixId:(int)suffixId male:(BOOL)male birthdayMonth:(int)birthdayMonth birthdayDay:(int)birthdayDay birthdayYear:(int)birthdayYear jobTitle:(NSString *)jobTitle groupIds:(NSArray *)groupIds organizationIds:(NSArray *)organizationIds roleIds:(NSArray *)roleIds userGroupIds:(NSArray *)userGroupIds sendEmail:(BOOL)sendEmail serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"autoPassword": @(autoPassword),
		@"password1": password1,
		@"password2": password2,
		@"autoScreenName": @(autoScreenName),
		@"screenName": screenName,
		@"emailAddress": emailAddress,
		@"facebookId": @(facebookId),
		@"openId": openId,
		@"locale": locale,
		@"firstName": firstName,
		@"middleName": middleName,
		@"lastName": lastName,
		@"prefixId": @(prefixId),
		@"suffixId": @(suffixId),
		@"male": @(male),
		@"birthdayMonth": @(birthdayMonth),
		@"birthdayDay": @(birthdayDay),
		@"birthdayYear": @(birthdayYear),
		@"jobTitle": jobTitle,
		@"groupIds": groupIds,
		@"organizationIds": organizationIds,
		@"roleIds": roleIds,
		@"userGroupIds": userGroupIds,
		@"sendEmail": @(sendEmail),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/user/add-user-with-workflow": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)addUserWithWorkflowWithCompanyId:(long)companyId autoPassword:(BOOL)autoPassword password1:(NSString *)password1 password2:(NSString *)password2 autoScreenName:(BOOL)autoScreenName screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(long)facebookId openId:(NSString *)openId locale:(NSString *)locale firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(int)prefixId suffixId:(int)suffixId male:(BOOL)male birthdayMonth:(int)birthdayMonth birthdayDay:(int)birthdayDay birthdayYear:(int)birthdayYear jobTitle:(NSString *)jobTitle groupIds:(NSArray *)groupIds organizationIds:(NSArray *)organizationIds roleIds:(NSArray *)roleIds userGroupIds:(NSArray *)userGroupIds addresses:(NSArray *)addresses emailAddresses:(NSArray *)emailAddresses phones:(NSArray *)phones websites:(NSArray *)websites announcementsDelivers:(NSArray *)announcementsDelivers sendEmail:(BOOL)sendEmail serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"autoPassword": @(autoPassword),
		@"password1": password1,
		@"password2": password2,
		@"autoScreenName": @(autoScreenName),
		@"screenName": screenName,
		@"emailAddress": emailAddress,
		@"facebookId": @(facebookId),
		@"openId": openId,
		@"locale": locale,
		@"firstName": firstName,
		@"middleName": middleName,
		@"lastName": lastName,
		@"prefixId": @(prefixId),
		@"suffixId": @(suffixId),
		@"male": @(male),
		@"birthdayMonth": @(birthdayMonth),
		@"birthdayDay": @(birthdayDay),
		@"birthdayYear": @(birthdayYear),
		@"jobTitle": jobTitle,
		@"groupIds": groupIds,
		@"organizationIds": organizationIds,
		@"roleIds": roleIds,
		@"userGroupIds": userGroupIds,
		@"addresses": addresses,
		@"emailAddresses": emailAddresses,
		@"phones": phones,
		@"websites": websites,
		@"announcementsDelivers": announcementsDelivers,
		@"sendEmail": @(sendEmail),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/user/add-user-with-workflow": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)deletePortraitWithUserId:(long)userId error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId)
	};

	NSDictionary *_command = @{@"/user/delete-portrait": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteRoleUserWithRoleId:(long)roleId userId:(long)userId error:(NSError **)error {
	NSDictionary *_params = @{
		@"roleId": @(roleId),
		@"userId": @(userId)
	};

	NSDictionary *_command = @{@"/user/delete-role-user": _params};

	[self.session invoke:_command error:error];
}

- (void)deleteUserWithUserId:(long)userId error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId)
	};

	NSDictionary *_command = @{@"/user/delete-user": _params};

	[self.session invoke:_command error:error];
}

- (NSArray *)getCompanyUsersWithCompanyId:(long)companyId start:(int)start end:(int)end error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"start": @(start),
		@"end": @(end)
	};

	NSDictionary *_command = @{@"/user/get-company-users": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getCompanyUsersCountWithCompanyId:(long)companyId error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId)
	};

	NSDictionary *_command = @{@"/user/get-company-users-count": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupUserIdsWithGroupId:(long)groupId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/user/get-group-user-ids": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getGroupUsersWithGroupId:(long)groupId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId)
	};

	NSDictionary *_command = @{@"/user/get-group-users": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getOrganizationUserIdsWithOrganizationId:(long)organizationId error:(NSError **)error {
	NSDictionary *_params = @{
		@"organizationId": @(organizationId)
	};

	NSDictionary *_command = @{@"/user/get-organization-user-ids": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getOrganizationUsersWithOrganizationId:(long)organizationId error:(NSError **)error {
	NSDictionary *_params = @{
		@"organizationId": @(organizationId)
	};

	NSDictionary *_command = @{@"/user/get-organization-users": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSArray *)getRoleUserIdsWithRoleId:(long)roleId error:(NSError **)error {
	NSDictionary *_params = @{
		@"roleId": @(roleId)
	};

	NSDictionary *_command = @{@"/user/get-role-user-ids": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getUserByEmailAddressWithCompanyId:(long)companyId emailAddress:(NSString *)emailAddress error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"emailAddress": emailAddress
	};

	NSDictionary *_command = @{@"/user/get-user-by-email-address": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getUserByIdWithUserId:(long)userId error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId)
	};

	NSDictionary *_command = @{@"/user/get-user-by-id": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)getUserByScreenNameWithCompanyId:(long)companyId screenName:(NSString *)screenName error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"screenName": screenName
	};

	NSDictionary *_command = @{@"/user/get-user-by-screen-name": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSArray *)getUserGroupUsersWithUserGroupId:(long)userGroupId error:(NSError **)error {
	NSDictionary *_params = @{
		@"userGroupId": @(userGroupId)
	};

	NSDictionary *_command = @{@"/user/get-user-group-users": _params};

	return (NSArray *)[self.session invoke:_command error:error];
}

- (NSNumber *)getUserIdByEmailAddressWithCompanyId:(long)companyId emailAddress:(NSString *)emailAddress error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"emailAddress": emailAddress
	};

	NSDictionary *_command = @{@"/user/get-user-id-by-email-address": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (NSNumber *)getUserIdByScreenNameWithCompanyId:(long)companyId screenName:(NSString *)screenName error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"screenName": screenName
	};

	NSDictionary *_command = @{@"/user/get-user-id-by-screen-name": _params};

	return (NSNumber *)[self.session invoke:_command error:error];
}

- (BOOL)hasGroupUserWithGroupId:(long)groupId userId:(long)userId error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userId": @(userId)
	};

	NSDictionary *_command = @{@"/user/has-group-user": _params};

	return (BOOL)[self.session invoke:_command error:error];
}

- (BOOL)hasRoleUserWithRoleId:(long)roleId userId:(long)userId error:(NSError **)error {
	NSDictionary *_params = @{
		@"roleId": @(roleId),
		@"userId": @(userId)
	};

	NSDictionary *_command = @{@"/user/has-role-user": _params};

	return (BOOL)[self.session invoke:_command error:error];
}

- (BOOL)hasRoleUserWithCompanyId:(long)companyId name:(NSString *)name userId:(long)userId inherited:(BOOL)inherited error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"name": name,
		@"userId": @(userId),
		@"inherited": @(inherited)
	};

	NSDictionary *_command = @{@"/user/has-role-user": _params};

	return (BOOL)[self.session invoke:_command error:error];
}

- (void)setRoleUsersWithRoleId:(long)roleId userIds:(NSArray *)userIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"roleId": @(roleId),
		@"userIds": userIds
	};

	NSDictionary *_command = @{@"/user/set-role-users": _params};

	[self.session invoke:_command error:error];
}

- (void)setUserGroupUsersWithUserGroupId:(long)userGroupId userIds:(NSArray *)userIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"userGroupId": @(userGroupId),
		@"userIds": userIds
	};

	NSDictionary *_command = @{@"/user/set-user-group-users": _params};

	[self.session invoke:_command error:error];
}

- (void)unsetGroupTeamsUsersWithGroupId:(long)groupId userIds:(NSArray *)userIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userIds": userIds
	};

	NSDictionary *_command = @{@"/user/unset-group-teams-users": _params};

	[self.session invoke:_command error:error];
}

- (void)unsetGroupUsersWithGroupId:(long)groupId userIds:(NSArray *)userIds serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"groupId": @(groupId),
		@"userIds": userIds,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/user/unset-group-users": _params};

	[self.session invoke:_command error:error];
}

- (void)unsetOrganizationUsersWithOrganizationId:(long)organizationId userIds:(NSArray *)userIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"organizationId": @(organizationId),
		@"userIds": userIds
	};

	NSDictionary *_command = @{@"/user/unset-organization-users": _params};

	[self.session invoke:_command error:error];
}

- (void)unsetPasswordPolicyUsersWithPasswordPolicyId:(long)passwordPolicyId userIds:(NSArray *)userIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"passwordPolicyId": @(passwordPolicyId),
		@"userIds": userIds
	};

	NSDictionary *_command = @{@"/user/unset-password-policy-users": _params};

	[self.session invoke:_command error:error];
}

- (void)unsetRoleUsersWithRoleId:(long)roleId userIds:(NSArray *)userIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"roleId": @(roleId),
		@"userIds": userIds
	};

	NSDictionary *_command = @{@"/user/unset-role-users": _params};

	[self.session invoke:_command error:error];
}

- (void)unsetTeamUsersWithTeamId:(long)teamId userIds:(NSArray *)userIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"teamId": @(teamId),
		@"userIds": userIds
	};

	NSDictionary *_command = @{@"/user/unset-team-users": _params};

	[self.session invoke:_command error:error];
}

- (void)unsetUserGroupUsersWithUserGroupId:(long)userGroupId userIds:(NSArray *)userIds error:(NSError **)error {
	NSDictionary *_params = @{
		@"userGroupId": @(userGroupId),
		@"userIds": userIds
	};

	NSDictionary *_command = @{@"/user/unset-user-group-users": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)updateAgreedToTermsOfUseWithUserId:(long)userId agreedToTermsOfUse:(BOOL)agreedToTermsOfUse error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"agreedToTermsOfUse": @(agreedToTermsOfUse)
	};

	NSDictionary *_command = @{@"/user/update-agreed-to-terms-of-use": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateEmailAddressWithUserId:(long)userId password:(NSString *)password emailAddress1:(NSString *)emailAddress1 emailAddress2:(NSString *)emailAddress2 serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"password": password,
		@"emailAddress1": emailAddress1,
		@"emailAddress2": emailAddress2,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/user/update-email-address": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateIncompleteUserWithCompanyId:(long)companyId autoPassword:(BOOL)autoPassword password1:(NSString *)password1 password2:(NSString *)password2 autoScreenName:(BOOL)autoScreenName screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(long)facebookId openId:(NSString *)openId locale:(NSString *)locale firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(int)prefixId suffixId:(int)suffixId male:(BOOL)male birthdayMonth:(int)birthdayMonth birthdayDay:(int)birthdayDay birthdayYear:(int)birthdayYear jobTitle:(NSString *)jobTitle updateUserInformation:(BOOL)updateUserInformation sendEmail:(BOOL)sendEmail serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"companyId": @(companyId),
		@"autoPassword": @(autoPassword),
		@"password1": password1,
		@"password2": password2,
		@"autoScreenName": @(autoScreenName),
		@"screenName": screenName,
		@"emailAddress": emailAddress,
		@"facebookId": @(facebookId),
		@"openId": openId,
		@"locale": locale,
		@"firstName": firstName,
		@"middleName": middleName,
		@"lastName": lastName,
		@"prefixId": @(prefixId),
		@"suffixId": @(suffixId),
		@"male": @(male),
		@"birthdayMonth": @(birthdayMonth),
		@"birthdayDay": @(birthdayDay),
		@"birthdayYear": @(birthdayYear),
		@"jobTitle": jobTitle,
		@"updateUserInformation": @(updateUserInformation),
		@"sendEmail": @(sendEmail),
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/user/update-incomplete-user": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateLockoutByIdWithUserId:(long)userId lockout:(BOOL)lockout error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"lockout": @(lockout)
	};

	NSDictionary *_command = @{@"/user/update-lockout-by-id": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateOpenIdWithUserId:(long)userId openId:(NSString *)openId error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"openId": openId
	};

	NSDictionary *_command = @{@"/user/update-open-id": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (void)updateOrganizationsWithUserId:(long)userId organizationIds:(NSArray *)organizationIds serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"organizationIds": organizationIds,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/user/update-organizations": _params};

	[self.session invoke:_command error:error];
}

- (NSDictionary *)updatePasswordWithUserId:(long)userId password1:(NSString *)password1 password2:(NSString *)password2 passwordReset:(BOOL)passwordReset error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"password1": password1,
		@"password2": password2,
		@"passwordReset": @(passwordReset)
	};

	NSDictionary *_command = @{@"/user/update-password": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updatePortraitWithUserId:(long)userId bytes:(NSArray *)bytes error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"bytes": bytes
	};

	NSDictionary *_command = @{@"/user/update-portrait": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateReminderQueryWithUserId:(long)userId question:(NSString *)question answer:(NSString *)answer error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"question": question,
		@"answer": answer
	};

	NSDictionary *_command = @{@"/user/update-reminder-query": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateScreenNameWithUserId:(long)userId screenName:(NSString *)screenName error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"screenName": screenName
	};

	NSDictionary *_command = @{@"/user/update-screen-name": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateStatusWithUserId:(long)userId status:(int)status error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"status": @(status)
	};

	NSDictionary *_command = @{@"/user/update-status": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateUserWithUserId:(long)userId oldPassword:(NSString *)oldPassword newPassword1:(NSString *)newPassword1 newPassword2:(NSString *)newPassword2 passwordReset:(BOOL)passwordReset reminderQueryQuestion:(NSString *)reminderQueryQuestion reminderQueryAnswer:(NSString *)reminderQueryAnswer screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(long)facebookId openId:(NSString *)openId languageId:(NSString *)languageId timeZoneId:(NSString *)timeZoneId greeting:(NSString *)greeting comments:(NSString *)comments firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(int)prefixId suffixId:(int)suffixId male:(BOOL)male birthdayMonth:(int)birthdayMonth birthdayDay:(int)birthdayDay birthdayYear:(int)birthdayYear smsSn:(NSString *)smsSn aimSn:(NSString *)aimSn facebookSn:(NSString *)facebookSn icqSn:(NSString *)icqSn jabberSn:(NSString *)jabberSn msnSn:(NSString *)msnSn mySpaceSn:(NSString *)mySpaceSn skypeSn:(NSString *)skypeSn twitterSn:(NSString *)twitterSn ymSn:(NSString *)ymSn jobTitle:(NSString *)jobTitle groupIds:(NSArray *)groupIds organizationIds:(NSArray *)organizationIds roleIds:(NSArray *)roleIds userGroupRoles:(NSArray *)userGroupRoles userGroupIds:(NSArray *)userGroupIds serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"oldPassword": oldPassword,
		@"newPassword1": newPassword1,
		@"newPassword2": newPassword2,
		@"passwordReset": @(passwordReset),
		@"reminderQueryQuestion": reminderQueryQuestion,
		@"reminderQueryAnswer": reminderQueryAnswer,
		@"screenName": screenName,
		@"emailAddress": emailAddress,
		@"facebookId": @(facebookId),
		@"openId": openId,
		@"languageId": languageId,
		@"timeZoneId": timeZoneId,
		@"greeting": greeting,
		@"comments": comments,
		@"firstName": firstName,
		@"middleName": middleName,
		@"lastName": lastName,
		@"prefixId": @(prefixId),
		@"suffixId": @(suffixId),
		@"male": @(male),
		@"birthdayMonth": @(birthdayMonth),
		@"birthdayDay": @(birthdayDay),
		@"birthdayYear": @(birthdayYear),
		@"smsSn": smsSn,
		@"aimSn": aimSn,
		@"facebookSn": facebookSn,
		@"icqSn": icqSn,
		@"jabberSn": jabberSn,
		@"msnSn": msnSn,
		@"mySpaceSn": mySpaceSn,
		@"skypeSn": skypeSn,
		@"twitterSn": twitterSn,
		@"ymSn": ymSn,
		@"jobTitle": jobTitle,
		@"groupIds": groupIds,
		@"organizationIds": organizationIds,
		@"roleIds": roleIds,
		@"userGroupRoles": userGroupRoles,
		@"userGroupIds": userGroupIds,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/user/update-user": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

- (NSDictionary *)updateUserWithUserId:(long)userId oldPassword:(NSString *)oldPassword newPassword1:(NSString *)newPassword1 newPassword2:(NSString *)newPassword2 passwordReset:(BOOL)passwordReset reminderQueryQuestion:(NSString *)reminderQueryQuestion reminderQueryAnswer:(NSString *)reminderQueryAnswer screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(long)facebookId openId:(NSString *)openId languageId:(NSString *)languageId timeZoneId:(NSString *)timeZoneId greeting:(NSString *)greeting comments:(NSString *)comments firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(int)prefixId suffixId:(int)suffixId male:(BOOL)male birthdayMonth:(int)birthdayMonth birthdayDay:(int)birthdayDay birthdayYear:(int)birthdayYear smsSn:(NSString *)smsSn aimSn:(NSString *)aimSn facebookSn:(NSString *)facebookSn icqSn:(NSString *)icqSn jabberSn:(NSString *)jabberSn msnSn:(NSString *)msnSn mySpaceSn:(NSString *)mySpaceSn skypeSn:(NSString *)skypeSn twitterSn:(NSString *)twitterSn ymSn:(NSString *)ymSn jobTitle:(NSString *)jobTitle groupIds:(NSArray *)groupIds organizationIds:(NSArray *)organizationIds roleIds:(NSArray *)roleIds userGroupRoles:(NSArray *)userGroupRoles userGroupIds:(NSArray *)userGroupIds addresses:(NSArray *)addresses emailAddresses:(NSArray *)emailAddresses phones:(NSArray *)phones websites:(NSArray *)websites announcementsDelivers:(NSArray *)announcementsDelivers serviceContext:(NSDictionary *)serviceContext error:(NSError **)error {
	NSDictionary *_params = @{
		@"userId": @(userId),
		@"oldPassword": oldPassword,
		@"newPassword1": newPassword1,
		@"newPassword2": newPassword2,
		@"passwordReset": @(passwordReset),
		@"reminderQueryQuestion": reminderQueryQuestion,
		@"reminderQueryAnswer": reminderQueryAnswer,
		@"screenName": screenName,
		@"emailAddress": emailAddress,
		@"facebookId": @(facebookId),
		@"openId": openId,
		@"languageId": languageId,
		@"timeZoneId": timeZoneId,
		@"greeting": greeting,
		@"comments": comments,
		@"firstName": firstName,
		@"middleName": middleName,
		@"lastName": lastName,
		@"prefixId": @(prefixId),
		@"suffixId": @(suffixId),
		@"male": @(male),
		@"birthdayMonth": @(birthdayMonth),
		@"birthdayDay": @(birthdayDay),
		@"birthdayYear": @(birthdayYear),
		@"smsSn": smsSn,
		@"aimSn": aimSn,
		@"facebookSn": facebookSn,
		@"icqSn": icqSn,
		@"jabberSn": jabberSn,
		@"msnSn": msnSn,
		@"mySpaceSn": mySpaceSn,
		@"skypeSn": skypeSn,
		@"twitterSn": twitterSn,
		@"ymSn": ymSn,
		@"jobTitle": jobTitle,
		@"groupIds": groupIds,
		@"organizationIds": organizationIds,
		@"roleIds": roleIds,
		@"userGroupRoles": userGroupRoles,
		@"userGroupIds": userGroupIds,
		@"addresses": addresses,
		@"emailAddresses": emailAddresses,
		@"phones": phones,
		@"websites": websites,
		@"announcementsDelivers": announcementsDelivers,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/user/update-user": _params};

	return (NSDictionary *)[self.session invoke:_command error:error];
}

@end