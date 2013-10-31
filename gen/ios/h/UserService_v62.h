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
@interface UserService_v62 : BaseService

- (NSDictionary *)updateUser:(long)userId oldPassword:(NSString *)oldPassword newPassword1:(NSString *)newPassword1 newPassword2:(NSString *)newPassword2 passwordReset:(BOOL)passwordReset reminderQueryQuestion:(NSString *)reminderQueryQuestion reminderQueryAnswer:(NSString *)reminderQueryAnswer screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(long)facebookId openId:(NSString *)openId languageId:(NSString *)languageId timeZoneId:(NSString *)timeZoneId greeting:(NSString *)greeting comments:(NSString *)comments firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(int)prefixId suffixId:(int)suffixId male:(BOOL)male birthdayMonth:(int)birthdayMonth birthdayDay:(int)birthdayDay birthdayYear:(int)birthdayYear smsSn:(NSString *)smsSn aimSn:(NSString *)aimSn facebookSn:(NSString *)facebookSn icqSn:(NSString *)icqSn jabberSn:(NSString *)jabberSn msnSn:(NSString *)msnSn mySpaceSn:(NSString *)mySpaceSn skypeSn:(NSString *)skypeSn twitterSn:(NSString *)twitterSn ymSn:(NSString *)ymSn jobTitle:(NSString *)jobTitle groupIds:(NSArray *)groupIds organizationIds:(NSArray *)organizationIds roleIds:(NSArray *)roleIds userGroupRoles:(NSArray *)userGroupRoles userGroupIds:(NSArray *)userGroupIds addresses:(NSArray *)addresses emailAddresses:(NSArray *)emailAddresses phones:(NSArray *)phones websites:(NSArray *)websites announcementsDelivers:(NSArray *)announcementsDelivers serviceContext:(NSDictionary *)serviceContext;
- (long)getUserIdByScreenName:(long)companyId screenName:(NSString *)screenName;
- (NSArray *)getCompanyUsers:(long)companyId start:(int)start end:(int)end;
- (void)unsetGroupTeamsUsers:(long)groupId userIds:(NSArray *)userIds;
- (void)addUserGroupUsers:(long)userGroupId userIds:(NSArray *)userIds;
- (int)getCompanyUsersCount:(long)companyId;
- (NSDictionary *)updateLockoutById:(long)userId lockout:(BOOL)lockout;
- (NSArray *)getUserGroupUsers:(long)userGroupId;
- (NSDictionary *)updateReminderQuery:(long)userId question:(NSString *)question answer:(NSString *)answer;
- (void)deleteRoleUser:(long)roleId userId:(long)userId;
- (NSArray *)getGroupUsers:(long)groupId;
- (NSArray *)getRoleUserIds:(long)roleId;
- (NSDictionary *)updatePassword:(long)userId password1:(NSString *)password1 password2:(NSString *)password2 passwordReset:(BOOL)passwordReset;
- (NSArray *)getOrganizationUsers:(long)organizationId;
- (NSDictionary *)updateIncompleteUser:(long)companyId autoPassword:(BOOL)autoPassword password1:(NSString *)password1 password2:(NSString *)password2 autoScreenName:(BOOL)autoScreenName screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(long)facebookId openId:(NSString *)openId locale:(NSString *)locale firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(int)prefixId suffixId:(int)suffixId male:(BOOL)male birthdayMonth:(int)birthdayMonth birthdayDay:(int)birthdayDay birthdayYear:(int)birthdayYear jobTitle:(NSString *)jobTitle updateUserInformation:(BOOL)updateUserInformation sendEmail:(BOOL)sendEmail serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)updateOpenId:(long)userId openId:(NSString *)openId;
- (void)unsetOrganizationUsers:(long)organizationId userIds:(NSArray *)userIds;
- (void)deletePortrait:(long)userId;
- (NSDictionary *)updateAgreedToTermsOfUse:(long)userId agreedToTermsOfUse:(BOOL)agreedToTermsOfUse;
- (void)setRoleUsers:(long)roleId userIds:(NSArray *)userIds;
- (void)updateOrganizations:(long)userId organizationIds:(NSArray *)organizationIds serviceContext:(NSDictionary *)serviceContext;
- (void)addGroupUsers:(long)groupId userIds:(NSArray *)userIds serviceContext:(NSDictionary *)serviceContext;
- (void)addPasswordPolicyUsers:(long)passwordPolicyId userIds:(NSArray *)userIds;
- (void)unsetTeamUsers:(long)teamId userIds:(NSArray *)userIds;
- (void)unsetRoleUsers:(long)roleId userIds:(NSArray *)userIds;
- (void)addOrganizationUsers:(long)organizationId userIds:(NSArray *)userIds;
- (void)addTeamUsers:(long)teamId userIds:(NSArray *)userIds;
- (NSArray *)getGroupUserIds:(long)groupId;
- (long)getUserIdByEmailAddress:(long)companyId emailAddress:(NSString *)emailAddress;
- (void)unsetGroupUsers:(long)groupId userIds:(NSArray *)userIds serviceContext:(NSDictionary *)serviceContext;
- (NSArray *)getOrganizationUserIds:(long)organizationId;
- (void)unsetPasswordPolicyUsers:(long)passwordPolicyId userIds:(NSArray *)userIds;
- (NSDictionary *)addUser:(long)companyId autoPassword:(BOOL)autoPassword password1:(NSString *)password1 password2:(NSString *)password2 autoScreenName:(BOOL)autoScreenName screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(long)facebookId openId:(NSString *)openId locale:(NSString *)locale firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(int)prefixId suffixId:(int)suffixId male:(BOOL)male birthdayMonth:(int)birthdayMonth birthdayDay:(int)birthdayDay birthdayYear:(int)birthdayYear jobTitle:(NSString *)jobTitle groupIds:(NSArray *)groupIds organizationIds:(NSArray *)organizationIds roleIds:(NSArray *)roleIds userGroupIds:(NSArray *)userGroupIds addresses:(NSArray *)addresses emailAddresses:(NSArray *)emailAddresses phones:(NSArray *)phones websites:(NSArray *)websites announcementsDelivers:(NSArray *)announcementsDelivers sendEmail:(BOOL)sendEmail serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)updatePortrait:(long)userId bytes:(NSArray *)bytes;
- (NSDictionary *)getUserById:(long)userId;
- (BOOL)hasRoleUser:(long)companyId name:(NSString *)name userId:(long)userId inherited:(BOOL)inherited;
- (BOOL)hasGroupUser:(long)groupId userId:(long)userId;
- (NSDictionary *)updateStatus:(long)userId status:(int)status;
- (void)addRoleUsers:(long)roleId userIds:(NSArray *)userIds;
- (NSDictionary *)updateEmailAddress:(long)userId password:(NSString *)password emailAddress1:(NSString *)emailAddress1 emailAddress2:(NSString *)emailAddress2 serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)addUserWithWorkflow:(long)companyId autoPassword:(BOOL)autoPassword password1:(NSString *)password1 password2:(NSString *)password2 autoScreenName:(BOOL)autoScreenName screenName:(NSString *)screenName emailAddress:(NSString *)emailAddress facebookId:(long)facebookId openId:(NSString *)openId locale:(NSString *)locale firstName:(NSString *)firstName middleName:(NSString *)middleName lastName:(NSString *)lastName prefixId:(int)prefixId suffixId:(int)suffixId male:(BOOL)male birthdayMonth:(int)birthdayMonth birthdayDay:(int)birthdayDay birthdayYear:(int)birthdayYear jobTitle:(NSString *)jobTitle groupIds:(NSArray *)groupIds organizationIds:(NSArray *)organizationIds roleIds:(NSArray *)roleIds userGroupIds:(NSArray *)userGroupIds addresses:(NSArray *)addresses emailAddresses:(NSArray *)emailAddresses phones:(NSArray *)phones websites:(NSArray *)websites announcementsDelivers:(NSArray *)announcementsDelivers sendEmail:(BOOL)sendEmail serviceContext:(NSDictionary *)serviceContext;
- (NSDictionary *)updateScreenName:(long)userId screenName:(NSString *)screenName;
- (NSDictionary *)getUserByEmailAddress:(long)companyId emailAddress:(NSString *)emailAddress;
- (void)deleteUser:(long)userId;
- (NSDictionary *)getUserByScreenName:(long)companyId screenName:(NSString *)screenName;
- (void)unsetUserGroupUsers:(long)userGroupId userIds:(NSArray *)userIds;
- (void)setUserGroupUsers:(long)userGroupId userIds:(NSArray *)userIds;

@end