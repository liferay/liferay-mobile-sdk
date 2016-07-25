package com.liferay.mobile.sdk.v7.user;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/user")
public interface UserService {
  @Path("/add-group-users")
  Call<Response> addGroupUsers(@Param(name = "groupId") long groupId, @Param(name = "userIds") JSONArray userIds, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-organization-users")
  Call<Response> addOrganizationUsers(@Param(name = "organizationId") long organizationId, @Param(name = "userIds") JSONArray userIds);

  @Path("/add-password-policy-users")
  Call<Response> addPasswordPolicyUsers(@Param(name = "passwordPolicyId") long passwordPolicyId, @Param(name = "userIds") JSONArray userIds);

  @Path("/add-role-users")
  Call<Response> addRoleUsers(@Param(name = "roleId") long roleId, @Param(name = "userIds") JSONArray userIds);

  @Path("/add-team-users")
  Call<Response> addTeamUsers(@Param(name = "teamId") long teamId, @Param(name = "userIds") JSONArray userIds);

  @Path("/add-user")
  Call<JSONObject> addUser(@Param(name = "companyId") long companyId, @Param(name = "autoPassword") boolean autoPassword, @Param(name = "password1") String password1, @Param(name = "password2") String password2, @Param(name = "autoScreenName") boolean autoScreenName, @Param(name = "screenName") String screenName, @Param(name = "emailAddress") String emailAddress, @Param(name = "facebookId") long facebookId, @Param(name = "openId") String openId, @Param(name = "locale") String locale, @Param(name = "firstName") String firstName, @Param(name = "middleName") String middleName, @Param(name = "lastName") String lastName, @Param(name = "prefixId") long prefixId, @Param(name = "suffixId") long suffixId, @Param(name = "male") boolean male, @Param(name = "birthdayMonth") int birthdayMonth, @Param(name = "birthdayDay") int birthdayDay, @Param(name = "birthdayYear") int birthdayYear, @Param(name = "jobTitle") String jobTitle, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "organizationIds") JSONArray organizationIds, @Param(name = "roleIds") JSONArray roleIds, @Param(name = "userGroupIds") JSONArray userGroupIds, @Param(name = "sendEmail") boolean sendEmail, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-user")
  Call<JSONObject> addUser(@Param(name = "companyId") long companyId, @Param(name = "autoPassword") boolean autoPassword, @Param(name = "password1") String password1, @Param(name = "password2") String password2, @Param(name = "autoScreenName") boolean autoScreenName, @Param(name = "screenName") String screenName, @Param(name = "emailAddress") String emailAddress, @Param(name = "facebookId") long facebookId, @Param(name = "openId") String openId, @Param(name = "locale") String locale, @Param(name = "firstName") String firstName, @Param(name = "middleName") String middleName, @Param(name = "lastName") String lastName, @Param(name = "prefixId") long prefixId, @Param(name = "suffixId") long suffixId, @Param(name = "male") boolean male, @Param(name = "birthdayMonth") int birthdayMonth, @Param(name = "birthdayDay") int birthdayDay, @Param(name = "birthdayYear") int birthdayYear, @Param(name = "jobTitle") String jobTitle, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "organizationIds") JSONArray organizationIds, @Param(name = "roleIds") JSONArray roleIds, @Param(name = "userGroupIds") JSONArray userGroupIds, @Param(name = "addresses") JSONArray addresses, @Param(name = "emailAddresses") JSONArray emailAddresses, @Param(name = "phones") JSONArray phones, @Param(name = "websites") JSONArray websites, @Param(name = "announcementsDelivers") JSONArray announcementsDelivers, @Param(name = "sendEmail") boolean sendEmail, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-user-group-users")
  Call<Response> addUserGroupUsers(@Param(name = "userGroupId") long userGroupId, @Param(name = "userIds") JSONArray userIds);

  @Path("/add-user-with-workflow")
  Call<JSONObject> addUserWithWorkflow(@Param(name = "companyId") long companyId, @Param(name = "autoPassword") boolean autoPassword, @Param(name = "password1") String password1, @Param(name = "password2") String password2, @Param(name = "autoScreenName") boolean autoScreenName, @Param(name = "screenName") String screenName, @Param(name = "emailAddress") String emailAddress, @Param(name = "facebookId") long facebookId, @Param(name = "openId") String openId, @Param(name = "locale") String locale, @Param(name = "firstName") String firstName, @Param(name = "middleName") String middleName, @Param(name = "lastName") String lastName, @Param(name = "prefixId") long prefixId, @Param(name = "suffixId") long suffixId, @Param(name = "male") boolean male, @Param(name = "birthdayMonth") int birthdayMonth, @Param(name = "birthdayDay") int birthdayDay, @Param(name = "birthdayYear") int birthdayYear, @Param(name = "jobTitle") String jobTitle, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "organizationIds") JSONArray organizationIds, @Param(name = "roleIds") JSONArray roleIds, @Param(name = "userGroupIds") JSONArray userGroupIds, @Param(name = "sendEmail") boolean sendEmail, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-user-with-workflow")
  Call<JSONObject> addUserWithWorkflow(@Param(name = "companyId") long companyId, @Param(name = "autoPassword") boolean autoPassword, @Param(name = "password1") String password1, @Param(name = "password2") String password2, @Param(name = "autoScreenName") boolean autoScreenName, @Param(name = "screenName") String screenName, @Param(name = "emailAddress") String emailAddress, @Param(name = "facebookId") long facebookId, @Param(name = "openId") String openId, @Param(name = "locale") String locale, @Param(name = "firstName") String firstName, @Param(name = "middleName") String middleName, @Param(name = "lastName") String lastName, @Param(name = "prefixId") long prefixId, @Param(name = "suffixId") long suffixId, @Param(name = "male") boolean male, @Param(name = "birthdayMonth") int birthdayMonth, @Param(name = "birthdayDay") int birthdayDay, @Param(name = "birthdayYear") int birthdayYear, @Param(name = "jobTitle") String jobTitle, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "organizationIds") JSONArray organizationIds, @Param(name = "roleIds") JSONArray roleIds, @Param(name = "userGroupIds") JSONArray userGroupIds, @Param(name = "addresses") JSONArray addresses, @Param(name = "emailAddresses") JSONArray emailAddresses, @Param(name = "phones") JSONArray phones, @Param(name = "websites") JSONArray websites, @Param(name = "announcementsDelivers") JSONArray announcementsDelivers, @Param(name = "sendEmail") boolean sendEmail, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-portrait")
  Call<Response> deletePortrait(@Param(name = "userId") long userId);

  @Path("/delete-role-user")
  Call<Response> deleteRoleUser(@Param(name = "roleId") long roleId, @Param(name = "userId") long userId);

  @Path("/delete-user")
  Call<Response> deleteUser(@Param(name = "userId") long userId);

  @Path("/get-company-users")
  Call<JSONArray> getCompanyUsers(@Param(name = "companyId") long companyId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-company-users-count")
  Call<Integer> getCompanyUsersCount(@Param(name = "companyId") long companyId);

  @Path("/get-current-user")
  Call<JSONObject> getCurrentUser();

  @Path("/get-group-user-ids")
  Call<JSONArray> getGroupUserIds(@Param(name = "groupId") long groupId);

  @Path("/get-group-users")
  Call<JSONArray> getGroupUsers(@Param(name = "groupId") long groupId);

  @Path("/get-organization-user-ids")
  Call<JSONArray> getOrganizationUserIds(@Param(name = "organizationId") long organizationId);

  @Path("/get-organization-users")
  Call<JSONArray> getOrganizationUsers(@Param(name = "organizationId") long organizationId);

  @Path("/get-role-user-ids")
  Call<JSONArray> getRoleUserIds(@Param(name = "roleId") long roleId);

  @Path("/get-user-by-email-address")
  Call<JSONObject> getUserByEmailAddress(@Param(name = "companyId") long companyId, @Param(name = "emailAddress") String emailAddress);

  @Path("/get-user-by-id")
  Call<JSONObject> getUserById(@Param(name = "userId") long userId);

  @Path("/get-user-by-screen-name")
  Call<JSONObject> getUserByScreenName(@Param(name = "companyId") long companyId, @Param(name = "screenName") String screenName);

  @Path("/get-user-group-users")
  Call<JSONArray> getUserGroupUsers(@Param(name = "userGroupId") long userGroupId);

  @Path("/get-user-id-by-email-address")
  Call<Long> getUserIdByEmailAddress(@Param(name = "companyId") long companyId, @Param(name = "emailAddress") String emailAddress);

  @Path("/get-user-id-by-screen-name")
  Call<Long> getUserIdByScreenName(@Param(name = "companyId") long companyId, @Param(name = "screenName") String screenName);

  @Path("/has-group-user")
  Call<Boolean> hasGroupUser(@Param(name = "groupId") long groupId, @Param(name = "userId") long userId);

  @Path("/has-role-user")
  Call<Boolean> hasRoleUser(@Param(name = "roleId") long roleId, @Param(name = "userId") long userId);

  @Path("/has-role-user")
  Call<Boolean> hasRoleUser(@Param(name = "companyId") long companyId, @Param(name = "name") String name, @Param(name = "userId") long userId, @Param(name = "inherited") boolean inherited);

  @Path("/send-password-by-email-address")
  Call<Boolean> sendPasswordByEmailAddress(@Param(name = "companyId") long companyId, @Param(name = "emailAddress") String emailAddress);

  @Path("/send-password-by-screen-name")
  Call<Boolean> sendPasswordByScreenName(@Param(name = "companyId") long companyId, @Param(name = "screenName") String screenName);

  @Path("/send-password-by-user-id")
  Call<Boolean> sendPasswordByUserId(@Param(name = "userId") long userId);

  @Path("/set-role-users")
  Call<Response> setRoleUsers(@Param(name = "roleId") long roleId, @Param(name = "userIds") JSONArray userIds);

  @Path("/set-user-group-users")
  Call<Response> setUserGroupUsers(@Param(name = "userGroupId") long userGroupId, @Param(name = "userIds") JSONArray userIds);

  @Path("/unset-group-teams-users")
  Call<Response> unsetGroupTeamsUsers(@Param(name = "groupId") long groupId, @Param(name = "userIds") JSONArray userIds);

  @Path("/unset-group-users")
  Call<Response> unsetGroupUsers(@Param(name = "groupId") long groupId, @Param(name = "userIds") JSONArray userIds, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/unset-organization-users")
  Call<Response> unsetOrganizationUsers(@Param(name = "organizationId") long organizationId, @Param(name = "userIds") JSONArray userIds);

  @Path("/unset-password-policy-users")
  Call<Response> unsetPasswordPolicyUsers(@Param(name = "passwordPolicyId") long passwordPolicyId, @Param(name = "userIds") JSONArray userIds);

  @Path("/unset-role-users")
  Call<Response> unsetRoleUsers(@Param(name = "roleId") long roleId, @Param(name = "userIds") JSONArray userIds);

  @Path("/unset-team-users")
  Call<Response> unsetTeamUsers(@Param(name = "teamId") long teamId, @Param(name = "userIds") JSONArray userIds);

  @Path("/unset-user-group-users")
  Call<Response> unsetUserGroupUsers(@Param(name = "userGroupId") long userGroupId, @Param(name = "userIds") JSONArray userIds);

  @Path("/update-agreed-to-terms-of-use")
  Call<JSONObject> updateAgreedToTermsOfUse(@Param(name = "userId") long userId, @Param(name = "agreedToTermsOfUse") boolean agreedToTermsOfUse);

  @Path("/update-email-address")
  Call<JSONObject> updateEmailAddress(@Param(name = "userId") long userId, @Param(name = "password") String password, @Param(name = "emailAddress1") String emailAddress1, @Param(name = "emailAddress2") String emailAddress2, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-incomplete-user")
  Call<JSONObject> updateIncompleteUser(@Param(name = "companyId") long companyId, @Param(name = "autoPassword") boolean autoPassword, @Param(name = "password1") String password1, @Param(name = "password2") String password2, @Param(name = "autoScreenName") boolean autoScreenName, @Param(name = "screenName") String screenName, @Param(name = "emailAddress") String emailAddress, @Param(name = "facebookId") long facebookId, @Param(name = "openId") String openId, @Param(name = "locale") String locale, @Param(name = "firstName") String firstName, @Param(name = "middleName") String middleName, @Param(name = "lastName") String lastName, @Param(name = "prefixId") long prefixId, @Param(name = "suffixId") long suffixId, @Param(name = "male") boolean male, @Param(name = "birthdayMonth") int birthdayMonth, @Param(name = "birthdayDay") int birthdayDay, @Param(name = "birthdayYear") int birthdayYear, @Param(name = "jobTitle") String jobTitle, @Param(name = "updateUserInformation") boolean updateUserInformation, @Param(name = "sendEmail") boolean sendEmail, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-lockout-by-id")
  Call<JSONObject> updateLockoutById(@Param(name = "userId") long userId, @Param(name = "lockout") boolean lockout);

  @Path("/update-open-id")
  Call<JSONObject> updateOpenId(@Param(name = "userId") long userId, @Param(name = "openId") String openId);

  @Path("/update-organizations")
  Call<Response> updateOrganizations(@Param(name = "userId") long userId, @Param(name = "organizationIds") JSONArray organizationIds, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-password")
  Call<JSONObject> updatePassword(@Param(name = "userId") long userId, @Param(name = "password1") String password1, @Param(name = "password2") String password2, @Param(name = "passwordReset") boolean passwordReset);

  @Path("/update-portrait")
  Call<JSONObject> updatePortrait(@Param(name = "userId") long userId, @Param(name = "bytes") byte[] bytes);

  @Path("/update-reminder-query")
  Call<JSONObject> updateReminderQuery(@Param(name = "userId") long userId, @Param(name = "question") String question, @Param(name = "answer") String answer);

  @Path("/update-screen-name")
  Call<JSONObject> updateScreenName(@Param(name = "userId") long userId, @Param(name = "screenName") String screenName);

  @Path("/update-status")
  Call<JSONObject> updateStatus(@Param(name = "userId") long userId, @Param(name = "status") int status);

  @Path("/update-status")
  Call<JSONObject> updateStatus(@Param(name = "userId") long userId, @Param(name = "status") int status, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-user")
  Call<JSONObject> updateUser(@Param(name = "userId") long userId, @Param(name = "oldPassword") String oldPassword, @Param(name = "newPassword1") String newPassword1, @Param(name = "newPassword2") String newPassword2, @Param(name = "passwordReset") boolean passwordReset, @Param(name = "reminderQueryQuestion") String reminderQueryQuestion, @Param(name = "reminderQueryAnswer") String reminderQueryAnswer, @Param(name = "screenName") String screenName, @Param(name = "emailAddress") String emailAddress, @Param(name = "facebookId") long facebookId, @Param(name = "openId") String openId, @Param(name = "languageId") String languageId, @Param(name = "timeZoneId") String timeZoneId, @Param(name = "greeting") String greeting, @Param(name = "comments") String comments, @Param(name = "firstName") String firstName, @Param(name = "middleName") String middleName, @Param(name = "lastName") String lastName, @Param(name = "prefixId") long prefixId, @Param(name = "suffixId") long suffixId, @Param(name = "male") boolean male, @Param(name = "birthdayMonth") int birthdayMonth, @Param(name = "birthdayDay") int birthdayDay, @Param(name = "birthdayYear") int birthdayYear, @Param(name = "smsSn") String smsSn, @Param(name = "facebookSn") String facebookSn, @Param(name = "jabberSn") String jabberSn, @Param(name = "skypeSn") String skypeSn, @Param(name = "twitterSn") String twitterSn, @Param(name = "jobTitle") String jobTitle, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "organizationIds") JSONArray organizationIds, @Param(name = "roleIds") JSONArray roleIds, @Param(name = "userGroupRoles") JSONArray userGroupRoles, @Param(name = "userGroupIds") JSONArray userGroupIds, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-user")
  Call<JSONObject> updateUser(@Param(name = "userId") long userId, @Param(name = "oldPassword") String oldPassword, @Param(name = "newPassword1") String newPassword1, @Param(name = "newPassword2") String newPassword2, @Param(name = "passwordReset") boolean passwordReset, @Param(name = "reminderQueryQuestion") String reminderQueryQuestion, @Param(name = "reminderQueryAnswer") String reminderQueryAnswer, @Param(name = "screenName") String screenName, @Param(name = "emailAddress") String emailAddress, @Param(name = "facebookId") long facebookId, @Param(name = "openId") String openId, @Param(name = "languageId") String languageId, @Param(name = "timeZoneId") String timeZoneId, @Param(name = "greeting") String greeting, @Param(name = "comments") String comments, @Param(name = "firstName") String firstName, @Param(name = "middleName") String middleName, @Param(name = "lastName") String lastName, @Param(name = "prefixId") long prefixId, @Param(name = "suffixId") long suffixId, @Param(name = "male") boolean male, @Param(name = "birthdayMonth") int birthdayMonth, @Param(name = "birthdayDay") int birthdayDay, @Param(name = "birthdayYear") int birthdayYear, @Param(name = "smsSn") String smsSn, @Param(name = "facebookSn") String facebookSn, @Param(name = "jabberSn") String jabberSn, @Param(name = "skypeSn") String skypeSn, @Param(name = "twitterSn") String twitterSn, @Param(name = "jobTitle") String jobTitle, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "organizationIds") JSONArray organizationIds, @Param(name = "roleIds") JSONArray roleIds, @Param(name = "userGroupRoles") JSONArray userGroupRoles, @Param(name = "userGroupIds") JSONArray userGroupIds, @Param(name = "addresses") JSONArray addresses, @Param(name = "emailAddresses") JSONArray emailAddresses, @Param(name = "phones") JSONArray phones, @Param(name = "websites") JSONArray websites, @Param(name = "announcementsDelivers") JSONArray announcementsDelivers, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-user")
  Call<JSONObject> updateUser(@Param(name = "userId") long userId, @Param(name = "oldPassword") String oldPassword, @Param(name = "newPassword1") String newPassword1, @Param(name = "newPassword2") String newPassword2, @Param(name = "passwordReset") boolean passwordReset, @Param(name = "reminderQueryQuestion") String reminderQueryQuestion, @Param(name = "reminderQueryAnswer") String reminderQueryAnswer, @Param(name = "screenName") String screenName, @Param(name = "emailAddress") String emailAddress, @Param(name = "facebookId") long facebookId, @Param(name = "openId") String openId, @Param(name = "portrait") boolean portrait, @Param(name = "portraitBytes") byte[] portraitBytes, @Param(name = "languageId") String languageId, @Param(name = "timeZoneId") String timeZoneId, @Param(name = "greeting") String greeting, @Param(name = "comments") String comments, @Param(name = "firstName") String firstName, @Param(name = "middleName") String middleName, @Param(name = "lastName") String lastName, @Param(name = "prefixId") long prefixId, @Param(name = "suffixId") long suffixId, @Param(name = "male") boolean male, @Param(name = "birthdayMonth") int birthdayMonth, @Param(name = "birthdayDay") int birthdayDay, @Param(name = "birthdayYear") int birthdayYear, @Param(name = "smsSn") String smsSn, @Param(name = "facebookSn") String facebookSn, @Param(name = "jabberSn") String jabberSn, @Param(name = "skypeSn") String skypeSn, @Param(name = "twitterSn") String twitterSn, @Param(name = "jobTitle") String jobTitle, @Param(name = "groupIds") JSONArray groupIds, @Param(name = "organizationIds") JSONArray organizationIds, @Param(name = "roleIds") JSONArray roleIds, @Param(name = "userGroupRoles") JSONArray userGroupRoles, @Param(name = "userGroupIds") JSONArray userGroupIds, @Param(name = "addresses") JSONArray addresses, @Param(name = "emailAddresses") JSONArray emailAddresses, @Param(name = "phones") JSONArray phones, @Param(name = "websites") JSONArray websites, @Param(name = "announcementsDelivers") JSONArray announcementsDelivers, @Param(name = "serviceContext", className = "com.liferay.portal.kernel.service.ServiceContext") JSONObject serviceContext);
}
