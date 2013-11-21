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
@interface LRUserService_v62 : BaseService

- (void)addGroupUsersWithGroupId:(long)groupId userIds:(NSArray *)userIds serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)addOrganizationUsersWithOrganizationId:(long)organizationId userIds:(NSArray *)userIds error:(NSError **)error;
- (void)addPasswordPolicyUsersWithPasswordPolicyId:(long)passwordPolicyId userIds:(NSArray *)userIds error:(NSError **)error;
- (void)addRoleUsersWithRoleId:(long)roleId userIds:(NSArray *)userIds error:(NSError **)error;
- (void)addTeamUsersWithTeamId:(long)teamId userIds:(NSArray *)userIds error:(NSError **)error;
- (NSDictionary *)addUserWithCompanyId:(long)companyId autoPassword:(BOOL)autoPassword password1:(NSString *)password1 password2:(NSString *)password2 autoScreenName:(BOOL)autoScreenName screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(long)facebookId openId:(NSString *)openId locale:(NSString *)locale firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(int)prefixId suffixId:(int)suffixId male:(BOOL)male birthdayMonth:(int)birthdayMonth birthdayDay:(int)birthdayDay birthdayYear:(int)birthdayYear jobTitle:(NSString *)jobTitle groupIds:(NSArray *)groupIds organizationIds:(NSArray *)organizationIds roleIds:(NSArray *)roleIds userGroupIds:(NSArray *)userGroupIds sendEmail:(BOOL)sendEmail serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addUserWithCompanyId:(long)companyId autoPassword:(BOOL)autoPassword password1:(NSString *)password1 password2:(NSString *)password2 autoScreenName:(BOOL)autoScreenName screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(long)facebookId openId:(NSString *)openId locale:(NSString *)locale firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(int)prefixId suffixId:(int)suffixId male:(BOOL)male birthdayMonth:(int)birthdayMonth birthdayDay:(int)birthdayDay birthdayYear:(int)birthdayYear jobTitle:(NSString *)jobTitle groupIds:(NSArray *)groupIds organizationIds:(NSArray *)organizationIds roleIds:(NSArray *)roleIds userGroupIds:(NSArray *)userGroupIds addresses:(NSArray *)addresses emailAddresses:(NSArray *)emailAddresses phones:(NSArray *)phones websites:(NSArray *)websites announcementsDelivers:(NSArray *)announcementsDelivers sendEmail:(BOOL)sendEmail serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)addUserGroupUsersWithUserGroupId:(long)userGroupId userIds:(NSArray *)userIds error:(NSError **)error;
- (NSDictionary *)addUserWithWorkflowWithCompanyId:(long)companyId autoPassword:(BOOL)autoPassword password1:(NSString *)password1 password2:(NSString *)password2 autoScreenName:(BOOL)autoScreenName screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(long)facebookId openId:(NSString *)openId locale:(NSString *)locale firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(int)prefixId suffixId:(int)suffixId male:(BOOL)male birthdayMonth:(int)birthdayMonth birthdayDay:(int)birthdayDay birthdayYear:(int)birthdayYear jobTitle:(NSString *)jobTitle groupIds:(NSArray *)groupIds organizationIds:(NSArray *)organizationIds roleIds:(NSArray *)roleIds userGroupIds:(NSArray *)userGroupIds sendEmail:(BOOL)sendEmail serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)addUserWithWorkflowWithCompanyId:(long)companyId autoPassword:(BOOL)autoPassword password1:(NSString *)password1 password2:(NSString *)password2 autoScreenName:(BOOL)autoScreenName screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(long)facebookId openId:(NSString *)openId locale:(NSString *)locale firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(int)prefixId suffixId:(int)suffixId male:(BOOL)male birthdayMonth:(int)birthdayMonth birthdayDay:(int)birthdayDay birthdayYear:(int)birthdayYear jobTitle:(NSString *)jobTitle groupIds:(NSArray *)groupIds organizationIds:(NSArray *)organizationIds roleIds:(NSArray *)roleIds userGroupIds:(NSArray *)userGroupIds addresses:(NSArray *)addresses emailAddresses:(NSArray *)emailAddresses phones:(NSArray *)phones websites:(NSArray *)websites announcementsDelivers:(NSArray *)announcementsDelivers sendEmail:(BOOL)sendEmail serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)deletePortraitWithUserId:(long)userId error:(NSError **)error;
- (void)deleteRoleUserWithRoleId:(long)roleId userId:(long)userId error:(NSError **)error;
- (void)deleteUserWithUserId:(long)userId error:(NSError **)error;
- (NSArray *)getCompanyUsersWithCompanyId:(long)companyId start:(int)start end:(int)end error:(NSError **)error;
- (int)getCompanyUsersCountWithCompanyId:(long)companyId error:(NSError **)error;
- (NSArray *)getGroupUserIdsWithGroupId:(long)groupId error:(NSError **)error;
- (NSArray *)getGroupUsersWithGroupId:(long)groupId error:(NSError **)error;
- (NSArray *)getOrganizationUserIdsWithOrganizationId:(long)organizationId error:(NSError **)error;
- (NSArray *)getOrganizationUsersWithOrganizationId:(long)organizationId error:(NSError **)error;
- (NSArray *)getRoleUserIdsWithRoleId:(long)roleId error:(NSError **)error;
- (NSDictionary *)getUserByEmailAddressWithCompanyId:(long)companyId emailAddress:(NSString *)emailAddress error:(NSError **)error;
- (NSDictionary *)getUserByIdWithUserId:(long)userId error:(NSError **)error;
- (NSDictionary *)getUserByScreenNameWithCompanyId:(long)companyId screenName:(NSString *)screenName error:(NSError **)error;
- (NSArray *)getUserGroupUsersWithUserGroupId:(long)userGroupId error:(NSError **)error;
- (long)getUserIdByEmailAddressWithCompanyId:(long)companyId emailAddress:(NSString *)emailAddress error:(NSError **)error;
- (long)getUserIdByScreenNameWithCompanyId:(long)companyId screenName:(NSString *)screenName error:(NSError **)error;
- (BOOL)hasGroupUserWithGroupId:(long)groupId userId:(long)userId error:(NSError **)error;
- (BOOL)hasRoleUserWithRoleId:(long)roleId userId:(long)userId error:(NSError **)error;
- (BOOL)hasRoleUserWithCompanyId:(long)companyId name:(NSString *)name userId:(long)userId inherited:(BOOL)inherited error:(NSError **)error;
- (void)setRoleUsersWithRoleId:(long)roleId userIds:(NSArray *)userIds error:(NSError **)error;
- (void)setUserGroupUsersWithUserGroupId:(long)userGroupId userIds:(NSArray *)userIds error:(NSError **)error;
- (void)unsetGroupTeamsUsersWithGroupId:(long)groupId userIds:(NSArray *)userIds error:(NSError **)error;
- (void)unsetGroupUsersWithGroupId:(long)groupId userIds:(NSArray *)userIds serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (void)unsetOrganizationUsersWithOrganizationId:(long)organizationId userIds:(NSArray *)userIds error:(NSError **)error;
- (void)unsetPasswordPolicyUsersWithPasswordPolicyId:(long)passwordPolicyId userIds:(NSArray *)userIds error:(NSError **)error;
- (void)unsetRoleUsersWithRoleId:(long)roleId userIds:(NSArray *)userIds error:(NSError **)error;
- (void)unsetTeamUsersWithTeamId:(long)teamId userIds:(NSArray *)userIds error:(NSError **)error;
- (void)unsetUserGroupUsersWithUserGroupId:(long)userGroupId userIds:(NSArray *)userIds error:(NSError **)error;
- (NSDictionary *)updateAgreedToTermsOfUseWithUserId:(long)userId agreedToTermsOfUse:(BOOL)agreedToTermsOfUse error:(NSError **)error;
- (NSDictionary *)updateEmailAddressWithUserId:(long)userId password:(NSString *)password emailAddress1:(NSString *)emailAddress1 emailAddress2:(NSString *)emailAddress2 serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateIncompleteUserWithCompanyId:(long)companyId autoPassword:(BOOL)autoPassword password1:(NSString *)password1 password2:(NSString *)password2 autoScreenName:(BOOL)autoScreenName screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(long)facebookId openId:(NSString *)openId locale:(NSString *)locale firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(int)prefixId suffixId:(int)suffixId male:(BOOL)male birthdayMonth:(int)birthdayMonth birthdayDay:(int)birthdayDay birthdayYear:(int)birthdayYear jobTitle:(NSString *)jobTitle updateUserInformation:(BOOL)updateUserInformation sendEmail:(BOOL)sendEmail serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateLockoutByIdWithUserId:(long)userId lockout:(BOOL)lockout error:(NSError **)error;
- (NSDictionary *)updateOpenIdWithUserId:(long)userId openId:(NSString *)openId error:(NSError **)error;
- (void)updateOrganizationsWithUserId:(long)userId organizationIds:(NSArray *)organizationIds serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)updatePasswordWithUserId:(long)userId password1:(NSString *)password1 password2:(NSString *)password2 passwordReset:(BOOL)passwordReset error:(NSError **)error;
- (NSDictionary *)updatePortraitWithUserId:(long)userId bytes:(NSArray *)bytes error:(NSError **)error;
- (NSDictionary *)updateReminderQueryWithUserId:(long)userId question:(NSString *)question answer:(NSString *)answer error:(NSError **)error;
- (NSDictionary *)updateScreenNameWithUserId:(long)userId screenName:(NSString *)screenName error:(NSError **)error;
- (NSDictionary *)updateStatusWithUserId:(long)userId status:(int)status error:(NSError **)error;
- (NSDictionary *)updateUserWithUserId:(long)userId oldPassword:(NSString *)oldPassword newPassword1:(NSString *)newPassword1 newPassword2:(NSString *)newPassword2 passwordReset:(BOOL)passwordReset reminderQueryQuestion:(NSString *)reminderQueryQuestion reminderQueryAnswer:(NSString *)reminderQueryAnswer screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(long)facebookId openId:(NSString *)openId languageId:(NSString *)languageId timeZoneId:(NSString *)timeZoneId greeting:(NSString *)greeting comments:(NSString *)comments firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(int)prefixId suffixId:(int)suffixId male:(BOOL)male birthdayMonth:(int)birthdayMonth birthdayDay:(int)birthdayDay birthdayYear:(int)birthdayYear smsSn:(NSString *)smsSn aimSn:(NSString *)aimSn facebookSn:(NSString *)facebookSn icqSn:(NSString *)icqSn jabberSn:(NSString *)jabberSn msnSn:(NSString *)msnSn mySpaceSn:(NSString *)mySpaceSn skypeSn:(NSString *)skypeSn twitterSn:(NSString *)twitterSn ymSn:(NSString *)ymSn jobTitle:(NSString *)jobTitle groupIds:(NSArray *)groupIds organizationIds:(NSArray *)organizationIds roleIds:(NSArray *)roleIds userGroupRoles:(NSArray *)userGroupRoles userGroupIds:(NSArray *)userGroupIds serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;
- (NSDictionary *)updateUserWithUserId:(long)userId oldPassword:(NSString *)oldPassword newPassword1:(NSString *)newPassword1 newPassword2:(NSString *)newPassword2 passwordReset:(BOOL)passwordReset reminderQueryQuestion:(NSString *)reminderQueryQuestion reminderQueryAnswer:(NSString *)reminderQueryAnswer screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(long)facebookId openId:(NSString *)openId languageId:(NSString *)languageId timeZoneId:(NSString *)timeZoneId greeting:(NSString *)greeting comments:(NSString *)comments firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(int)prefixId suffixId:(int)suffixId male:(BOOL)male birthdayMonth:(int)birthdayMonth birthdayDay:(int)birthdayDay birthdayYear:(int)birthdayYear smsSn:(NSString *)smsSn aimSn:(NSString *)aimSn facebookSn:(NSString *)facebookSn icqSn:(NSString *)icqSn jabberSn:(NSString *)jabberSn msnSn:(NSString *)msnSn mySpaceSn:(NSString *)mySpaceSn skypeSn:(NSString *)skypeSn twitterSn:(NSString *)twitterSn ymSn:(NSString *)ymSn jobTitle:(NSString *)jobTitle groupIds:(NSArray *)groupIds organizationIds:(NSArray *)organizationIds roleIds:(NSArray *)roleIds userGroupRoles:(NSArray *)userGroupRoles userGroupIds:(NSArray *)userGroupIds addresses:(NSArray *)addresses emailAddresses:(NSArray *)emailAddresses phones:(NSArray *)phones websites:(NSArray *)websites announcementsDelivers:(NSArray *)announcementsDelivers serviceContext:(NSDictionary *)serviceContext error:(NSError **)error;

@end