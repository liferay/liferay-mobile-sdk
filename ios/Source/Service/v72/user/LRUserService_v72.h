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
@interface LRUserService_v72 : LRBaseService

- (NSDictionary *)updatePasswordWithUserId:(long long)userId password1:(NSString *)password1 password2:(NSString *)password2 passwordReset:(BOOL)passwordReset error:(NSError **)error;
- (void)unsetGroupUsersWithGroupId:(long long)groupId userIds:(NSArray *)userIds serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSNumber *)getGroupUsersCountWithGroupId:(long long)groupId status:(int)status error:(NSError **)error;
- (NSDictionary *)addUserWithCompanyId:(long long)companyId autoPassword:(BOOL)autoPassword password1:(NSString *)password1 password2:(NSString *)password2 autoScreenName:(BOOL)autoScreenName screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(long long)facebookId openId:(NSString *)openId locale:(NSString *)locale firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(long long)prefixId suffixId:(long long)suffixId male:(BOOL)male birthdayMonth:(int)birthdayMonth birthdayDay:(int)birthdayDay birthdayYear:(int)birthdayYear jobTitle:(NSString *)jobTitle groupIds:(NSArray *)groupIds organizationIds:(NSArray *)organizationIds roleIds:(NSArray *)roleIds userGroupIds:(NSArray *)userGroupIds sendEmail:(BOOL)sendEmail serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addUserWithCompanyId:(long long)companyId autoPassword:(BOOL)autoPassword password1:(NSString *)password1 password2:(NSString *)password2 autoScreenName:(BOOL)autoScreenName screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(long long)facebookId openId:(NSString *)openId locale:(NSString *)locale firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(long long)prefixId suffixId:(long long)suffixId male:(BOOL)male birthdayMonth:(int)birthdayMonth birthdayDay:(int)birthdayDay birthdayYear:(int)birthdayYear jobTitle:(NSString *)jobTitle groupIds:(NSArray *)groupIds organizationIds:(NSArray *)organizationIds roleIds:(NSArray *)roleIds userGroupIds:(NSArray *)userGroupIds addresses:(NSArray *)addresses emailAddresses:(NSArray *)emailAddresses phones:(NSArray *)phones websites:(NSArray *)websites announcementsDelivers:(NSArray *)announcementsDelivers sendEmail:(BOOL)sendEmail serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateUserWithUserId:(long long)userId oldPassword:(NSString *)oldPassword newPassword1:(NSString *)newPassword1 newPassword2:(NSString *)newPassword2 passwordReset:(BOOL)passwordReset reminderQueryQuestion:(NSString *)reminderQueryQuestion reminderQueryAnswer:(NSString *)reminderQueryAnswer screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(long long)facebookId openId:(NSString *)openId languageId:(NSString *)languageId timeZoneId:(NSString *)timeZoneId greeting:(NSString *)greeting comments:(NSString *)comments firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(long long)prefixId suffixId:(long long)suffixId male:(BOOL)male birthdayMonth:(int)birthdayMonth birthdayDay:(int)birthdayDay birthdayYear:(int)birthdayYear smsSn:(NSString *)smsSn facebookSn:(NSString *)facebookSn jabberSn:(NSString *)jabberSn skypeSn:(NSString *)skypeSn twitterSn:(NSString *)twitterSn jobTitle:(NSString *)jobTitle groupIds:(NSArray *)groupIds organizationIds:(NSArray *)organizationIds roleIds:(NSArray *)roleIds userGroupRoles:(NSArray *)userGroupRoles userGroupIds:(NSArray *)userGroupIds serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateUserWithUserId:(long long)userId oldPassword:(NSString *)oldPassword newPassword1:(NSString *)newPassword1 newPassword2:(NSString *)newPassword2 passwordReset:(BOOL)passwordReset reminderQueryQuestion:(NSString *)reminderQueryQuestion reminderQueryAnswer:(NSString *)reminderQueryAnswer screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(long long)facebookId openId:(NSString *)openId portrait:(BOOL)portrait portraitBytes:(NSData *)portraitBytes languageId:(NSString *)languageId timeZoneId:(NSString *)timeZoneId greeting:(NSString *)greeting comments:(NSString *)comments firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(long long)prefixId suffixId:(long long)suffixId male:(BOOL)male birthdayMonth:(int)birthdayMonth birthdayDay:(int)birthdayDay birthdayYear:(int)birthdayYear smsSn:(NSString *)smsSn facebookSn:(NSString *)facebookSn jabberSn:(NSString *)jabberSn skypeSn:(NSString *)skypeSn twitterSn:(NSString *)twitterSn jobTitle:(NSString *)jobTitle groupIds:(NSArray *)groupIds organizationIds:(NSArray *)organizationIds roleIds:(NSArray *)roleIds userGroupRoles:(NSArray *)userGroupRoles userGroupIds:(NSArray *)userGroupIds addresses:(NSArray *)addresses emailAddresses:(NSArray *)emailAddresses phones:(NSArray *)phones websites:(NSArray *)websites announcementsDelivers:(NSArray *)announcementsDelivers serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)getUserByIdWithUserId:(long long)userId error:(NSError **)error;
- (NSDictionary *)updateStatusWithUserId:(long long)userId status:(int)status serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateEmailAddressWithUserId:(long long)userId password:(NSString *)password emailAddress1:(NSString *)emailAddress1 emailAddress2:(NSString *)emailAddress2 serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deleteUserWithUserId:(long long)userId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSArray *)getRoleUserIdsWithRoleId:(long long)roleId error:(NSError **)error;
- (NSDictionary *)updateLockoutByIdWithUserId:(long long)userId lockout:(BOOL)lockout error:(NSError **)error;
- (NSDictionary *)getCurrentUser:(NSError **)error;
- (void)addOrganizationUsersWithOrganizationId:(long long)organizationId userIds:(NSArray *)userIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)addPasswordPolicyUsersWithPasswordPolicyId:(long long)passwordPolicyId userIds:(NSArray *)userIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)addRoleUsersWithRoleId:(long long)roleId userIds:(NSArray *)userIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)addTeamUsersWithTeamId:(long long)teamId userIds:(NSArray *)userIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)addUserGroupUsersWithUserGroupId:(long long)userGroupId userIds:(NSArray *)userIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)addUserWithWorkflowWithCompanyId:(long long)companyId autoPassword:(BOOL)autoPassword password1:(NSString *)password1 password2:(NSString *)password2 autoScreenName:(BOOL)autoScreenName screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(long long)facebookId openId:(NSString *)openId locale:(NSString *)locale firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(long long)prefixId suffixId:(long long)suffixId male:(BOOL)male birthdayMonth:(int)birthdayMonth birthdayDay:(int)birthdayDay birthdayYear:(int)birthdayYear jobTitle:(NSString *)jobTitle groupIds:(NSArray *)groupIds organizationIds:(NSArray *)organizationIds roleIds:(NSArray *)roleIds userGroupIds:(NSArray *)userGroupIds addresses:(NSArray *)addresses emailAddresses:(NSArray *)emailAddresses phones:(NSArray *)phones websites:(NSArray *)websites announcementsDelivers:(NSArray *)announcementsDelivers sendEmail:(BOOL)sendEmail serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)addUserWithWorkflowWithCompanyId:(long long)companyId autoPassword:(BOOL)autoPassword password1:(NSString *)password1 password2:(NSString *)password2 autoScreenName:(BOOL)autoScreenName screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(long long)facebookId openId:(NSString *)openId locale:(NSString *)locale firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(long long)prefixId suffixId:(long long)suffixId male:(BOOL)male birthdayMonth:(int)birthdayMonth birthdayDay:(int)birthdayDay birthdayYear:(int)birthdayYear jobTitle:(NSString *)jobTitle groupIds:(NSArray *)groupIds organizationIds:(NSArray *)organizationIds roleIds:(NSArray *)roleIds userGroupIds:(NSArray *)userGroupIds sendEmail:(BOOL)sendEmail serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (void)deletePortraitWithUserId:(long long)userId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)deleteRoleUserWithRoleId:(long long)roleId userId:(long long)userId error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSArray *)getCompanyUsersWithCompanyId:(long long)companyId start:(int)start end:(int)end error:(NSError **)error;
- (NSNumber *)getCompanyUsersCountWithCompanyId:(long long)companyId error:(NSError **)error;
- (NSArray *)getGroupUserIdsWithGroupId:(long long)groupId error:(NSError **)error;
- (NSArray *)getGroupUsersWithGroupId:(long long)groupId status:(int)status obc:(LRJSONObjectWrapper *)obc error:(NSError **)error;
- (NSArray *)getGroupUsersWithGroupId:(long long)groupId error:(NSError **)error;
- (NSArray *)getGroupUsersWithGroupId:(long long)groupId status:(int)status start:(int)start end:(int)end obc:(LRJSONObjectWrapper *)obc error:(NSError **)error;
- (NSNumber *)getOrganizationsAndUserGroupsUsersCountWithOrganizationIds:(NSArray *)organizationIds userGroupIds:(NSArray *)userGroupIds error:(NSError **)error;
- (NSArray *)getOrganizationUserIdsWithOrganizationId:(long long)organizationId error:(NSError **)error;
- (NSArray *)getOrganizationUsersWithOrganizationId:(long long)organizationId status:(int)status start:(int)start end:(int)end obc:(LRJSONObjectWrapper *)obc error:(NSError **)error;
- (NSArray *)getOrganizationUsersWithOrganizationId:(long long)organizationId error:(NSError **)error;
- (NSArray *)getOrganizationUsersWithOrganizationId:(long long)organizationId status:(int)status obc:(LRJSONObjectWrapper *)obc error:(NSError **)error;
- (NSNumber *)getOrganizationUsersCountWithOrganizationId:(long long)organizationId status:(int)status error:(NSError **)error;
- (NSDictionary *)getUserByEmailAddressWithCompanyId:(long long)companyId emailAddress:(NSString *)emailAddress error:(NSError **)error;
- (NSDictionary *)getUserByScreenNameWithCompanyId:(long long)companyId screenName:(NSString *)screenName error:(NSError **)error;
- (NSNumber *)getUserIdByEmailAddressWithCompanyId:(long long)companyId emailAddress:(NSString *)emailAddress error:(NSError **)error;
- (NSNumber *)getUserIdByScreenNameWithCompanyId:(long long)companyId screenName:(NSString *)screenName error:(NSError **)error;
- (BOOL)hasRoleUserWithRoleId:(long long)roleId userId:(long long)userId error:(NSError **)error;
- (BOOL)hasRoleUserWithCompanyId:(long long)companyId name:(NSString *)name userId:(long long)userId inherited:(BOOL)inherited error:(NSError **)error;
- (BOOL)sendPasswordByEmailAddressWithCompanyId:(long long)companyId emailAddress:(NSString *)emailAddress error:(NSError **)error;
- (BOOL)sendPasswordByScreenNameWithCompanyId:(long long)companyId screenName:(NSString *)screenName error:(NSError **)error;
- (BOOL)sendPasswordByUserIdWithUserId:(long long)userId error:(NSError **)error;
- (void)setRoleUsersWithRoleId:(long long)roleId userIds:(NSArray *)userIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)setUserGroupUsersWithUserGroupId:(long long)userGroupId userIds:(NSArray *)userIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)unsetGroupTeamsUsersWithGroupId:(long long)groupId userIds:(NSArray *)userIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)unsetOrganizationUsersWithOrganizationId:(long long)organizationId userIds:(NSArray *)userIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)unsetPasswordPolicyUsersWithPasswordPolicyId:(long long)passwordPolicyId userIds:(NSArray *)userIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)unsetRoleUsersWithRoleId:(long long)roleId userIds:(NSArray *)userIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)unsetTeamUsersWithTeamId:(long long)teamId userIds:(NSArray *)userIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (void)unsetUserGroupUsersWithUserGroupId:(long long)userGroupId userIds:(NSArray *)userIds error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)updateAgreedToTermsOfUseWithUserId:(long long)userId agreedToTermsOfUse:(BOOL)agreedToTermsOfUse error:(NSError **)error;
- (NSDictionary *)updateIncompleteUserWithCompanyId:(long long)companyId autoPassword:(BOOL)autoPassword password1:(NSString *)password1 password2:(NSString *)password2 autoScreenName:(BOOL)autoScreenName screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(long long)facebookId openId:(NSString *)openId locale:(NSString *)locale firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(long long)prefixId suffixId:(long long)suffixId male:(BOOL)male birthdayMonth:(int)birthdayMonth birthdayDay:(int)birthdayDay birthdayYear:(int)birthdayYear jobTitle:(NSString *)jobTitle updateUserInformation:(BOOL)updateUserInformation sendEmail:(BOOL)sendEmail serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateOpenIdWithUserId:(long long)userId openId:(NSString *)openId error:(NSError **)error;
- (void)updateOrganizationsWithUserId:(long long)userId organizationIds:(NSArray *)organizationIds serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error CONVERT_ERROR_TO_THROWS;
- (NSDictionary *)updatePortraitWithUserId:(long long)userId bytes:(NSData *)bytes error:(NSError **)error;
- (NSDictionary *)updateReminderQueryWithUserId:(long long)userId question:(NSString *)question answer:(NSString *)answer error:(NSError **)error;
- (NSDictionary *)updateScreenNameWithUserId:(long long)userId screenName:(NSString *)screenName error:(NSError **)error;
- (BOOL)hasGroupUserWithGroupId:(long long)groupId userId:(long long)userId error:(NSError **)error;
- (NSArray *)getUserGroupUsersWithUserGroupId:(long long)userGroupId error:(NSError **)error;
- (NSArray *)getUserGroupUsersWithUserGroupId:(long long)userGroupId start:(int)start end:(int)end error:(NSError **)error;
- (NSArray *)getGtCompanyUsersWithGtUserId:(long long)gtUserId companyId:(long long)companyId size:(int)size error:(NSError **)error;
- (NSArray *)getGtOrganizationUsersWithGtUserId:(long long)gtUserId organizationId:(long long)organizationId size:(int)size error:(NSError **)error;
- (NSArray *)getGtUserGroupUsersWithGtUserId:(long long)gtUserId userGroupId:(long long)userGroupId size:(int)size error:(NSError **)error;
- (void)addGroupUsersWithGroupId:(long long)groupId userIds:(NSArray *)userIds serviceContext:(LRJSONObjectWrapper *)serviceContext error:(NSError **)error CONVERT_ERROR_TO_THROWS;

@end