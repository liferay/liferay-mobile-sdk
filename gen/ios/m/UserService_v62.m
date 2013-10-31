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

#import "UserService_v62.h"

/**
 * author Bruno Farache
 */
@implementation UserService_v62

- (NSDictionary *)updateUser:(NSNumber *)userId oldPassword:(NSString *)oldPassword newPassword1:(NSString *)newPassword1 newPassword2:(NSString *)newPassword2 passwordReset:(BOOL)passwordReset reminderQueryQuestion:(NSString *)reminderQueryQuestion reminderQueryAnswer:(NSString *)reminderQueryAnswer screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(NSNumber *)facebookId openId:(NSString *)openId languageId:(NSString *)languageId timeZoneId:(NSString *)timeZoneId greeting:(NSString *)greeting comments:(NSString *)comments firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(NSNumber *)prefixId suffixId:(NSNumber *)suffixId male:(BOOL)male birthdayMonth:(NSNumber *)birthdayMonth birthdayDay:(NSNumber *)birthdayDay birthdayYear:(NSNumber *)birthdayYear smsSn:(NSString *)smsSn aimSn:(NSString *)aimSn facebookSn:(NSString *)facebookSn icqSn:(NSString *)icqSn jabberSn:(NSString *)jabberSn msnSn:(NSString *)msnSn mySpaceSn:(NSString *)mySpaceSn skypeSn:(NSString *)skypeSn twitterSn:(NSString *)twitterSn ymSn:(NSString *)ymSn jobTitle:(NSString *)jobTitle groupIds:(NSArray *)groupIds organizationIds:(NSArray *)organizationIds roleIds:(NSArray *)roleIds userGroupRoles:(NSArray *)userGroupRoles userGroupIds:(NSArray *)userGroupIds addresses:(NSArray *)addresses emailAddresses:(NSArray *)emailAddresses phones:(NSArray *)phones websites:(NSArray *)websites announcementsDelivers:(NSArray *)announcementsDelivers serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"userId": userId,
		@"oldPassword": oldPassword,
		@"newPassword1": newPassword1,
		@"newPassword2": newPassword2,
		@"passwordReset": passwordReset,
		@"reminderQueryQuestion": reminderQueryQuestion,
		@"reminderQueryAnswer": reminderQueryAnswer,
		@"screenName": screenName,
		@"emailAddress": emailAddress,
		@"facebookId": facebookId,
		@"openId": openId,
		@"languageId": languageId,
		@"timeZoneId": timeZoneId,
		@"greeting": greeting,
		@"comments": comments,
		@"firstName": firstName,
		@"middleName": middleName,
		@"lastName": lastName,
		@"prefixId": prefixId,
		@"suffixId": suffixId,
		@"male": male,
		@"birthdayMonth": birthdayMonth,
		@"birthdayDay": birthdayDay,
		@"birthdayYear": birthdayYear,
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

	return (NSDictionary *)[session invoke:_command];
}

- (NSNumber *)getUserIdByScreenName:(NSNumber *)companyId screenName:(NSString *)screenName {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"screenName": screenName
	};

	NSDictionary *_command = @{@"/user/get-user-id-by-screen-name": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSArray *)getCompanyUsers:(NSNumber *)companyId start:(NSNumber *)start end:(NSNumber *)end {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"start": start,
		@"end": end
	};

	NSDictionary *_command = @{@"/user/get-company-users": _params};

	return (NSArray *)[session invoke:_command];
}

- (void)unsetGroupTeamsUsers:(NSNumber *)groupId userIds:(NSArray *)userIds {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"userIds": userIds
	};

	NSDictionary *_command = @{@"/user/unset-group-teams-users": _params};

	[session invoke:_command];
}

- (void)addUserGroupUsers:(NSNumber *)userGroupId userIds:(NSArray *)userIds {
	NSDictionary *_params = @{
		@"userGroupId": userGroupId,
		@"userIds": userIds
	};

	NSDictionary *_command = @{@"/user/add-user-group-users": _params};

	[session invoke:_command];
}

- (NSNumber *)getCompanyUsersCount:(NSNumber *)companyId {
	NSDictionary *_params = @{
		@"companyId": companyId
	};

	NSDictionary *_command = @{@"/user/get-company-users-count": _params};

	return (NSNumber *)[session invoke:_command];
}

- (NSDictionary *)updateLockoutById:(NSNumber *)userId lockout:(BOOL)lockout {
	NSDictionary *_params = @{
		@"userId": userId,
		@"lockout": lockout
	};

	NSDictionary *_command = @{@"/user/update-lockout-by-id": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getUserGroupUsers:(NSNumber *)userGroupId {
	NSDictionary *_params = @{
		@"userGroupId": userGroupId
	};

	NSDictionary *_command = @{@"/user/get-user-group-users": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)updateReminderQuery:(NSNumber *)userId question:(NSString *)question answer:(NSString *)answer {
	NSDictionary *_params = @{
		@"userId": userId,
		@"question": question,
		@"answer": answer
	};

	NSDictionary *_command = @{@"/user/update-reminder-query": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)deleteRoleUser:(NSNumber *)roleId userId:(NSNumber *)userId {
	NSDictionary *_params = @{
		@"roleId": roleId,
		@"userId": userId
	};

	NSDictionary *_command = @{@"/user/delete-role-user": _params};

	[session invoke:_command];
}

- (NSArray *)getGroupUsers:(NSNumber *)groupId {
	NSDictionary *_params = @{
		@"groupId": groupId
	};

	NSDictionary *_command = @{@"/user/get-group-users": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSArray *)getRoleUserIds:(NSNumber *)roleId {
	NSDictionary *_params = @{
		@"roleId": roleId
	};

	NSDictionary *_command = @{@"/user/get-role-user-ids": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)updatePassword:(NSNumber *)userId password1:(NSString *)password1 password2:(NSString *)password2 passwordReset:(BOOL)passwordReset {
	NSDictionary *_params = @{
		@"userId": userId,
		@"password1": password1,
		@"password2": password2,
		@"passwordReset": passwordReset
	};

	NSDictionary *_command = @{@"/user/update-password": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSArray *)getOrganizationUsers:(NSNumber *)organizationId {
	NSDictionary *_params = @{
		@"organizationId": organizationId
	};

	NSDictionary *_command = @{@"/user/get-organization-users": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSDictionary *)updateIncompleteUser:(NSNumber *)companyId autoPassword:(BOOL)autoPassword password1:(NSString *)password1 password2:(NSString *)password2 autoScreenName:(BOOL)autoScreenName screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(NSNumber *)facebookId openId:(NSString *)openId locale:(NSString *)locale firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(NSNumber *)prefixId suffixId:(NSNumber *)suffixId male:(BOOL)male birthdayMonth:(NSNumber *)birthdayMonth birthdayDay:(NSNumber *)birthdayDay birthdayYear:(NSNumber *)birthdayYear jobTitle:(NSString *)jobTitle updateUserInformation:(BOOL)updateUserInformation sendEmail:(BOOL)sendEmail serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"autoPassword": autoPassword,
		@"password1": password1,
		@"password2": password2,
		@"autoScreenName": autoScreenName,
		@"screenName": screenName,
		@"emailAddress": emailAddress,
		@"facebookId": facebookId,
		@"openId": openId,
		@"locale": locale,
		@"firstName": firstName,
		@"middleName": middleName,
		@"lastName": lastName,
		@"prefixId": prefixId,
		@"suffixId": suffixId,
		@"male": male,
		@"birthdayMonth": birthdayMonth,
		@"birthdayDay": birthdayDay,
		@"birthdayYear": birthdayYear,
		@"jobTitle": jobTitle,
		@"updateUserInformation": updateUserInformation,
		@"sendEmail": sendEmail,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/user/update-incomplete-user": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)updateOpenId:(NSNumber *)userId openId:(NSString *)openId {
	NSDictionary *_params = @{
		@"userId": userId,
		@"openId": openId
	};

	NSDictionary *_command = @{@"/user/update-open-id": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)unsetOrganizationUsers:(NSNumber *)organizationId userIds:(NSArray *)userIds {
	NSDictionary *_params = @{
		@"organizationId": organizationId,
		@"userIds": userIds
	};

	NSDictionary *_command = @{@"/user/unset-organization-users": _params};

	[session invoke:_command];
}

- (void)deletePortrait:(NSNumber *)userId {
	NSDictionary *_params = @{
		@"userId": userId
	};

	NSDictionary *_command = @{@"/user/delete-portrait": _params};

	[session invoke:_command];
}

- (NSDictionary *)updateAgreedToTermsOfUse:(NSNumber *)userId agreedToTermsOfUse:(BOOL)agreedToTermsOfUse {
	NSDictionary *_params = @{
		@"userId": userId,
		@"agreedToTermsOfUse": agreedToTermsOfUse
	};

	NSDictionary *_command = @{@"/user/update-agreed-to-terms-of-use": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)setRoleUsers:(NSNumber *)roleId userIds:(NSArray *)userIds {
	NSDictionary *_params = @{
		@"roleId": roleId,
		@"userIds": userIds
	};

	NSDictionary *_command = @{@"/user/set-role-users": _params};

	[session invoke:_command];
}

- (void)updateOrganizations:(NSNumber *)userId organizationIds:(NSArray *)organizationIds serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"userId": userId,
		@"organizationIds": organizationIds,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/user/update-organizations": _params};

	[session invoke:_command];
}

- (void)addGroupUsers:(NSNumber *)groupId userIds:(NSArray *)userIds serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"userIds": userIds,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/user/add-group-users": _params};

	[session invoke:_command];
}

- (void)addPasswordPolicyUsers:(NSNumber *)passwordPolicyId userIds:(NSArray *)userIds {
	NSDictionary *_params = @{
		@"passwordPolicyId": passwordPolicyId,
		@"userIds": userIds
	};

	NSDictionary *_command = @{@"/user/add-password-policy-users": _params};

	[session invoke:_command];
}

- (void)unsetTeamUsers:(NSNumber *)teamId userIds:(NSArray *)userIds {
	NSDictionary *_params = @{
		@"teamId": teamId,
		@"userIds": userIds
	};

	NSDictionary *_command = @{@"/user/unset-team-users": _params};

	[session invoke:_command];
}

- (void)unsetRoleUsers:(NSNumber *)roleId userIds:(NSArray *)userIds {
	NSDictionary *_params = @{
		@"roleId": roleId,
		@"userIds": userIds
	};

	NSDictionary *_command = @{@"/user/unset-role-users": _params};

	[session invoke:_command];
}

- (void)addOrganizationUsers:(NSNumber *)organizationId userIds:(NSArray *)userIds {
	NSDictionary *_params = @{
		@"organizationId": organizationId,
		@"userIds": userIds
	};

	NSDictionary *_command = @{@"/user/add-organization-users": _params};

	[session invoke:_command];
}

- (void)addTeamUsers:(NSNumber *)teamId userIds:(NSArray *)userIds {
	NSDictionary *_params = @{
		@"teamId": teamId,
		@"userIds": userIds
	};

	NSDictionary *_command = @{@"/user/add-team-users": _params};

	[session invoke:_command];
}

- (NSArray *)getGroupUserIds:(NSNumber *)groupId {
	NSDictionary *_params = @{
		@"groupId": groupId
	};

	NSDictionary *_command = @{@"/user/get-group-user-ids": _params};

	return (NSArray *)[session invoke:_command];
}

- (NSNumber *)getUserIdByEmailAddress:(NSNumber *)companyId emailAddress:(NSString *)emailAddress {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"emailAddress": emailAddress
	};

	NSDictionary *_command = @{@"/user/get-user-id-by-email-address": _params};

	return (NSNumber *)[session invoke:_command];
}

- (void)unsetGroupUsers:(NSNumber *)groupId userIds:(NSArray *)userIds serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"userIds": userIds,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/user/unset-group-users": _params};

	[session invoke:_command];
}

- (NSArray *)getOrganizationUserIds:(NSNumber *)organizationId {
	NSDictionary *_params = @{
		@"organizationId": organizationId
	};

	NSDictionary *_command = @{@"/user/get-organization-user-ids": _params};

	return (NSArray *)[session invoke:_command];
}

- (void)unsetPasswordPolicyUsers:(NSNumber *)passwordPolicyId userIds:(NSArray *)userIds {
	NSDictionary *_params = @{
		@"passwordPolicyId": passwordPolicyId,
		@"userIds": userIds
	};

	NSDictionary *_command = @{@"/user/unset-password-policy-users": _params};

	[session invoke:_command];
}

- (NSDictionary *)addUser:(NSNumber *)companyId autoPassword:(BOOL)autoPassword password1:(NSString *)password1 password2:(NSString *)password2 autoScreenName:(BOOL)autoScreenName screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(NSNumber *)facebookId openId:(NSString *)openId locale:(NSString *)locale firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(NSNumber *)prefixId suffixId:(NSNumber *)suffixId male:(BOOL)male birthdayMonth:(NSNumber *)birthdayMonth birthdayDay:(NSNumber *)birthdayDay birthdayYear:(NSNumber *)birthdayYear jobTitle:(NSString *)jobTitle groupIds:(NSArray *)groupIds organizationIds:(NSArray *)organizationIds roleIds:(NSArray *)roleIds userGroupIds:(NSArray *)userGroupIds addresses:(NSArray *)addresses emailAddresses:(NSArray *)emailAddresses phones:(NSArray *)phones websites:(NSArray *)websites announcementsDelivers:(NSArray *)announcementsDelivers sendEmail:(BOOL)sendEmail serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"autoPassword": autoPassword,
		@"password1": password1,
		@"password2": password2,
		@"autoScreenName": autoScreenName,
		@"screenName": screenName,
		@"emailAddress": emailAddress,
		@"facebookId": facebookId,
		@"openId": openId,
		@"locale": locale,
		@"firstName": firstName,
		@"middleName": middleName,
		@"lastName": lastName,
		@"prefixId": prefixId,
		@"suffixId": suffixId,
		@"male": male,
		@"birthdayMonth": birthdayMonth,
		@"birthdayDay": birthdayDay,
		@"birthdayYear": birthdayYear,
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
		@"sendEmail": sendEmail,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/user/add-user": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)updatePortrait:(NSNumber *)userId bytes:(NSArray *)bytes {
	NSDictionary *_params = @{
		@"userId": userId,
		@"bytes": bytes
	};

	NSDictionary *_command = @{@"/user/update-portrait": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)getUserById:(NSNumber *)userId {
	NSDictionary *_params = @{
		@"userId": userId
	};

	NSDictionary *_command = @{@"/user/get-user-by-id": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (BOOL)hasRoleUser:(NSNumber *)companyId name:(NSString *)name userId:(NSNumber *)userId inherited:(BOOL)inherited {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"name": name,
		@"userId": userId,
		@"inherited": inherited
	};

	NSDictionary *_command = @{@"/user/has-role-user": _params};

	return (BOOL)[session invoke:_command];
}

- (BOOL)hasGroupUser:(NSNumber *)groupId userId:(NSNumber *)userId {
	NSDictionary *_params = @{
		@"groupId": groupId,
		@"userId": userId
	};

	NSDictionary *_command = @{@"/user/has-group-user": _params};

	return (BOOL)[session invoke:_command];
}

- (NSDictionary *)updateStatus:(NSNumber *)userId status:(NSNumber *)status {
	NSDictionary *_params = @{
		@"userId": userId,
		@"status": status
	};

	NSDictionary *_command = @{@"/user/update-status": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)addRoleUsers:(NSNumber *)roleId userIds:(NSArray *)userIds {
	NSDictionary *_params = @{
		@"roleId": roleId,
		@"userIds": userIds
	};

	NSDictionary *_command = @{@"/user/add-role-users": _params};

	[session invoke:_command];
}

- (NSDictionary *)updateEmailAddress:(NSNumber *)userId password:(NSString *)password emailAddress1:(NSString *)emailAddress1 emailAddress2:(NSString *)emailAddress2 serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"userId": userId,
		@"password": password,
		@"emailAddress1": emailAddress1,
		@"emailAddress2": emailAddress2,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/user/update-email-address": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)addUserWithWorkflow:(NSNumber *)companyId autoPassword:(BOOL)autoPassword password1:(NSString *)password1 password2:(NSString *)password2 autoScreenName:(BOOL)autoScreenName screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(NSNumber *)facebookId openId:(NSString *)openId locale:(NSString *)locale firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(NSNumber *)prefixId suffixId:(NSNumber *)suffixId male:(BOOL)male birthdayMonth:(NSNumber *)birthdayMonth birthdayDay:(NSNumber *)birthdayDay birthdayYear:(NSNumber *)birthdayYear jobTitle:(NSString *)jobTitle groupIds:(NSArray *)groupIds organizationIds:(NSArray *)organizationIds roleIds:(NSArray *)roleIds userGroupIds:(NSArray *)userGroupIds addresses:(NSArray *)addresses emailAddresses:(NSArray *)emailAddresses phones:(NSArray *)phones websites:(NSArray *)websites announcementsDelivers:(NSArray *)announcementsDelivers sendEmail:(BOOL)sendEmail serviceContext:(NSDictionary *)serviceContext {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"autoPassword": autoPassword,
		@"password1": password1,
		@"password2": password2,
		@"autoScreenName": autoScreenName,
		@"screenName": screenName,
		@"emailAddress": emailAddress,
		@"facebookId": facebookId,
		@"openId": openId,
		@"locale": locale,
		@"firstName": firstName,
		@"middleName": middleName,
		@"lastName": lastName,
		@"prefixId": prefixId,
		@"suffixId": suffixId,
		@"male": male,
		@"birthdayMonth": birthdayMonth,
		@"birthdayDay": birthdayDay,
		@"birthdayYear": birthdayYear,
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
		@"sendEmail": sendEmail,
		@"serviceContext": serviceContext
	};

	NSDictionary *_command = @{@"/user/add-user-with-workflow": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)updateScreenName:(NSNumber *)userId screenName:(NSString *)screenName {
	NSDictionary *_params = @{
		@"userId": userId,
		@"screenName": screenName
	};

	NSDictionary *_command = @{@"/user/update-screen-name": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (NSDictionary *)getUserByEmailAddress:(NSNumber *)companyId emailAddress:(NSString *)emailAddress {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"emailAddress": emailAddress
	};

	NSDictionary *_command = @{@"/user/get-user-by-email-address": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)deleteUser:(NSNumber *)userId {
	NSDictionary *_params = @{
		@"userId": userId
	};

	NSDictionary *_command = @{@"/user/delete-user": _params};

	[session invoke:_command];
}

- (NSDictionary *)getUserByScreenName:(NSNumber *)companyId screenName:(NSString *)screenName {
	NSDictionary *_params = @{
		@"companyId": companyId,
		@"screenName": screenName
	};

	NSDictionary *_command = @{@"/user/get-user-by-screen-name": _params};

	return (NSDictionary *)[session invoke:_command];
}

- (void)unsetUserGroupUsers:(NSNumber *)userGroupId userIds:(NSArray *)userIds {
	NSDictionary *_params = @{
		@"userGroupId": userGroupId,
		@"userIds": userIds
	};

	NSDictionary *_command = @{@"/user/unset-user-group-users": _params};

	[session invoke:_command];
}

- (void)setUserGroupUsers:(NSNumber *)userGroupId userIds:(NSArray *)userIds {
	NSDictionary *_params = @{
		@"userGroupId": userGroupId,
		@"userIds": userIds
	};

	NSDictionary *_command = @{@"/user/set-user-group-users": _params};

	[session invoke:_command];
}

@end