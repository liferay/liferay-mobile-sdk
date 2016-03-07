package com.liferay.mobile.android.v62.user;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.JsonObject;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/user")
public interface UserService {
  @Path("/add-group-users")
  Call<Response> addGroupUsers(@Param("groupId") long groupId, @Param("userIds") JSONArray userIds, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-organization-users")
  Call<Response> addOrganizationUsers(@Param("organizationId") long organizationId, @Param("userIds") JSONArray userIds);

  @Path("/add-password-policy-users")
  Call<Response> addPasswordPolicyUsers(@Param("passwordPolicyId") long passwordPolicyId, @Param("userIds") JSONArray userIds);

  @Path("/add-role-users")
  Call<Response> addRoleUsers(@Param("roleId") long roleId, @Param("userIds") JSONArray userIds);

  @Path("/add-team-users")
  Call<Response> addTeamUsers(@Param("teamId") long teamId, @Param("userIds") JSONArray userIds);

  @Path("/add-user")
  Call<JSONObject> addUser(@Param("companyId") long companyId, @Param("autoPassword") boolean autoPassword, @Param("password1") String password1, @Param("password2") String password2, @Param("autoScreenName") boolean autoScreenName, @Param("screenName") String screenName, @Param("emailAddress") String emailAddress, @Param("facebookId") long facebookId, @Param("openId") String openId, @Param("locale") String locale, @Param("firstName") String firstName, @Param("middleName") String middleName, @Param("lastName") String lastName, @Param("prefixId") int prefixId, @Param("suffixId") int suffixId, @Param("male") boolean male, @Param("birthdayMonth") int birthdayMonth, @Param("birthdayDay") int birthdayDay, @Param("birthdayYear") int birthdayYear, @Param("jobTitle") String jobTitle, @Param("groupIds") JSONArray groupIds, @Param("organizationIds") JSONArray organizationIds, @Param("roleIds") JSONArray roleIds, @Param("userGroupIds") JSONArray userGroupIds, @Param("sendEmail") boolean sendEmail, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-user")
  Call<JSONObject> addUser(@Param("companyId") long companyId, @Param("autoPassword") boolean autoPassword, @Param("password1") String password1, @Param("password2") String password2, @Param("autoScreenName") boolean autoScreenName, @Param("screenName") String screenName, @Param("emailAddress") String emailAddress, @Param("facebookId") long facebookId, @Param("openId") String openId, @Param("locale") String locale, @Param("firstName") String firstName, @Param("middleName") String middleName, @Param("lastName") String lastName, @Param("prefixId") int prefixId, @Param("suffixId") int suffixId, @Param("male") boolean male, @Param("birthdayMonth") int birthdayMonth, @Param("birthdayDay") int birthdayDay, @Param("birthdayYear") int birthdayYear, @Param("jobTitle") String jobTitle, @Param("groupIds") JSONArray groupIds, @Param("organizationIds") JSONArray organizationIds, @Param("roleIds") JSONArray roleIds, @Param("userGroupIds") JSONArray userGroupIds, @Param("addresses") JSONArray addresses, @Param("emailAddresses") JSONArray emailAddresses, @Param("phones") JSONArray phones, @Param("websites") JSONArray websites, @Param("announcementsDelivers") JSONArray announcementsDelivers, @Param("sendEmail") boolean sendEmail, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-user-group-users")
  Call<Response> addUserGroupUsers(@Param("userGroupId") long userGroupId, @Param("userIds") JSONArray userIds);

  @Path("/add-user-with-workflow")
  Call<JSONObject> addUserWithWorkflow(@Param("companyId") long companyId, @Param("autoPassword") boolean autoPassword, @Param("password1") String password1, @Param("password2") String password2, @Param("autoScreenName") boolean autoScreenName, @Param("screenName") String screenName, @Param("emailAddress") String emailAddress, @Param("facebookId") long facebookId, @Param("openId") String openId, @Param("locale") String locale, @Param("firstName") String firstName, @Param("middleName") String middleName, @Param("lastName") String lastName, @Param("prefixId") int prefixId, @Param("suffixId") int suffixId, @Param("male") boolean male, @Param("birthdayMonth") int birthdayMonth, @Param("birthdayDay") int birthdayDay, @Param("birthdayYear") int birthdayYear, @Param("jobTitle") String jobTitle, @Param("groupIds") JSONArray groupIds, @Param("organizationIds") JSONArray organizationIds, @Param("roleIds") JSONArray roleIds, @Param("userGroupIds") JSONArray userGroupIds, @Param("sendEmail") boolean sendEmail, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-user-with-workflow")
  Call<JSONObject> addUserWithWorkflow(@Param("companyId") long companyId, @Param("autoPassword") boolean autoPassword, @Param("password1") String password1, @Param("password2") String password2, @Param("autoScreenName") boolean autoScreenName, @Param("screenName") String screenName, @Param("emailAddress") String emailAddress, @Param("facebookId") long facebookId, @Param("openId") String openId, @Param("locale") String locale, @Param("firstName") String firstName, @Param("middleName") String middleName, @Param("lastName") String lastName, @Param("prefixId") int prefixId, @Param("suffixId") int suffixId, @Param("male") boolean male, @Param("birthdayMonth") int birthdayMonth, @Param("birthdayDay") int birthdayDay, @Param("birthdayYear") int birthdayYear, @Param("jobTitle") String jobTitle, @Param("groupIds") JSONArray groupIds, @Param("organizationIds") JSONArray organizationIds, @Param("roleIds") JSONArray roleIds, @Param("userGroupIds") JSONArray userGroupIds, @Param("addresses") JSONArray addresses, @Param("emailAddresses") JSONArray emailAddresses, @Param("phones") JSONArray phones, @Param("websites") JSONArray websites, @Param("announcementsDelivers") JSONArray announcementsDelivers, @Param("sendEmail") boolean sendEmail, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-portrait")
  Call<Response> deletePortrait(@Param("userId") long userId);

  @Path("/delete-role-user")
  Call<Response> deleteRoleUser(@Param("roleId") long roleId, @Param("userId") long userId);

  @Path("/delete-user")
  Call<Response> deleteUser(@Param("userId") long userId);

  @Path("/get-company-users")
  Call<JSONArray> getCompanyUsers(@Param("companyId") long companyId, @Param("start") int start, @Param("end") int end);

  @Path("/get-company-users-count")
  Call<Integer> getCompanyUsersCount(@Param("companyId") long companyId);

  @Path("/get-group-user-ids")
  Call<JSONArray> getGroupUserIds(@Param("groupId") long groupId);

  @Path("/get-group-users")
  Call<JSONArray> getGroupUsers(@Param("groupId") long groupId);

  @Path("/get-organization-user-ids")
  Call<JSONArray> getOrganizationUserIds(@Param("organizationId") long organizationId);

  @Path("/get-organization-users")
  Call<JSONArray> getOrganizationUsers(@Param("organizationId") long organizationId);

  @Path("/get-role-user-ids")
  Call<JSONArray> getRoleUserIds(@Param("roleId") long roleId);

  @Path("/get-user-by-email-address")
  Call<JSONObject> getUserByEmailAddress(@Param("companyId") long companyId, @Param("emailAddress") String emailAddress);

  @Path("/get-user-by-id")
  Call<JSONObject> getUserById(@Param("userId") long userId);

  @Path("/get-user-by-screen-name")
  Call<JSONObject> getUserByScreenName(@Param("companyId") long companyId, @Param("screenName") String screenName);

  @Path("/get-user-group-users")
  Call<JSONArray> getUserGroupUsers(@Param("userGroupId") long userGroupId);

  @Path("/get-user-id-by-email-address")
  Call<Long> getUserIdByEmailAddress(@Param("companyId") long companyId, @Param("emailAddress") String emailAddress);

  @Path("/get-user-id-by-screen-name")
  Call<Long> getUserIdByScreenName(@Param("companyId") long companyId, @Param("screenName") String screenName);

  @Path("/has-group-user")
  Call<Boolean> hasGroupUser(@Param("groupId") long groupId, @Param("userId") long userId);

  @Path("/has-role-user")
  Call<Boolean> hasRoleUser(@Param("roleId") long roleId, @Param("userId") long userId);

  @Path("/has-role-user")
  Call<Boolean> hasRoleUser(@Param("companyId") long companyId, @Param("name") String name, @Param("userId") long userId, @Param("inherited") boolean inherited);

  @Path("/set-role-users")
  Call<Response> setRoleUsers(@Param("roleId") long roleId, @Param("userIds") JSONArray userIds);

  @Path("/set-user-group-users")
  Call<Response> setUserGroupUsers(@Param("userGroupId") long userGroupId, @Param("userIds") JSONArray userIds);

  @Path("/unset-group-teams-users")
  Call<Response> unsetGroupTeamsUsers(@Param("groupId") long groupId, @Param("userIds") JSONArray userIds);

  @Path("/unset-group-users")
  Call<Response> unsetGroupUsers(@Param("groupId") long groupId, @Param("userIds") JSONArray userIds, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/unset-organization-users")
  Call<Response> unsetOrganizationUsers(@Param("organizationId") long organizationId, @Param("userIds") JSONArray userIds);

  @Path("/unset-password-policy-users")
  Call<Response> unsetPasswordPolicyUsers(@Param("passwordPolicyId") long passwordPolicyId, @Param("userIds") JSONArray userIds);

  @Path("/unset-role-users")
  Call<Response> unsetRoleUsers(@Param("roleId") long roleId, @Param("userIds") JSONArray userIds);

  @Path("/unset-team-users")
  Call<Response> unsetTeamUsers(@Param("teamId") long teamId, @Param("userIds") JSONArray userIds);

  @Path("/unset-user-group-users")
  Call<Response> unsetUserGroupUsers(@Param("userGroupId") long userGroupId, @Param("userIds") JSONArray userIds);

  @Path("/update-agreed-to-terms-of-use")
  Call<JSONObject> updateAgreedToTermsOfUse(@Param("userId") long userId, @Param("agreedToTermsOfUse") boolean agreedToTermsOfUse);

  @Path("/update-email-address")
  Call<JSONObject> updateEmailAddress(@Param("userId") long userId, @Param("password") String password, @Param("emailAddress1") String emailAddress1, @Param("emailAddress2") String emailAddress2, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-incomplete-user")
  Call<JSONObject> updateIncompleteUser(@Param("companyId") long companyId, @Param("autoPassword") boolean autoPassword, @Param("password1") String password1, @Param("password2") String password2, @Param("autoScreenName") boolean autoScreenName, @Param("screenName") String screenName, @Param("emailAddress") String emailAddress, @Param("facebookId") long facebookId, @Param("openId") String openId, @Param("locale") String locale, @Param("firstName") String firstName, @Param("middleName") String middleName, @Param("lastName") String lastName, @Param("prefixId") int prefixId, @Param("suffixId") int suffixId, @Param("male") boolean male, @Param("birthdayMonth") int birthdayMonth, @Param("birthdayDay") int birthdayDay, @Param("birthdayYear") int birthdayYear, @Param("jobTitle") String jobTitle, @Param("updateUserInformation") boolean updateUserInformation, @Param("sendEmail") boolean sendEmail, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-lockout-by-id")
  Call<JSONObject> updateLockoutById(@Param("userId") long userId, @Param("lockout") boolean lockout);

  @Path("/update-open-id")
  Call<JSONObject> updateOpenId(@Param("userId") long userId, @Param("openId") String openId);

  @Path("/update-organizations")
  Call<Response> updateOrganizations(@Param("userId") long userId, @Param("organizationIds") JSONArray organizationIds, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-password")
  Call<JSONObject> updatePassword(@Param("userId") long userId, @Param("password1") String password1, @Param("password2") String password2, @Param("passwordReset") boolean passwordReset);

  @Path("/update-portrait")
  Call<JSONObject> updatePortrait(@Param("userId") long userId, @Param("bytes") byte[] bytes);

  @Path("/update-reminder-query")
  Call<JSONObject> updateReminderQuery(@Param("userId") long userId, @Param("question") String question, @Param("answer") String answer);

  @Path("/update-screen-name")
  Call<JSONObject> updateScreenName(@Param("userId") long userId, @Param("screenName") String screenName);

  @Path("/update-status")
  Call<JSONObject> updateStatus(@Param("userId") long userId, @Param("status") int status);

  @Path("/update-user")
  Call<JSONObject> updateUser(@Param("userId") long userId, @Param("oldPassword") String oldPassword, @Param("newPassword1") String newPassword1, @Param("newPassword2") String newPassword2, @Param("passwordReset") boolean passwordReset, @Param("reminderQueryQuestion") String reminderQueryQuestion, @Param("reminderQueryAnswer") String reminderQueryAnswer, @Param("screenName") String screenName, @Param("emailAddress") String emailAddress, @Param("facebookId") long facebookId, @Param("openId") String openId, @Param("languageId") String languageId, @Param("timeZoneId") String timeZoneId, @Param("greeting") String greeting, @Param("comments") String comments, @Param("firstName") String firstName, @Param("middleName") String middleName, @Param("lastName") String lastName, @Param("prefixId") int prefixId, @Param("suffixId") int suffixId, @Param("male") boolean male, @Param("birthdayMonth") int birthdayMonth, @Param("birthdayDay") int birthdayDay, @Param("birthdayYear") int birthdayYear, @Param("smsSn") String smsSn, @Param("aimSn") String aimSn, @Param("facebookSn") String facebookSn, @Param("icqSn") String icqSn, @Param("jabberSn") String jabberSn, @Param("msnSn") String msnSn, @Param("mySpaceSn") String mySpaceSn, @Param("skypeSn") String skypeSn, @Param("twitterSn") String twitterSn, @Param("ymSn") String ymSn, @Param("jobTitle") String jobTitle, @Param("groupIds") JSONArray groupIds, @Param("organizationIds") JSONArray organizationIds, @Param("roleIds") JSONArray roleIds, @Param("userGroupRoles") JSONArray userGroupRoles, @Param("userGroupIds") JSONArray userGroupIds, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-user")
  Call<JSONObject> updateUser(@Param("userId") long userId, @Param("oldPassword") String oldPassword, @Param("newPassword1") String newPassword1, @Param("newPassword2") String newPassword2, @Param("passwordReset") boolean passwordReset, @Param("reminderQueryQuestion") String reminderQueryQuestion, @Param("reminderQueryAnswer") String reminderQueryAnswer, @Param("screenName") String screenName, @Param("emailAddress") String emailAddress, @Param("facebookId") long facebookId, @Param("openId") String openId, @Param("languageId") String languageId, @Param("timeZoneId") String timeZoneId, @Param("greeting") String greeting, @Param("comments") String comments, @Param("firstName") String firstName, @Param("middleName") String middleName, @Param("lastName") String lastName, @Param("prefixId") int prefixId, @Param("suffixId") int suffixId, @Param("male") boolean male, @Param("birthdayMonth") int birthdayMonth, @Param("birthdayDay") int birthdayDay, @Param("birthdayYear") int birthdayYear, @Param("smsSn") String smsSn, @Param("aimSn") String aimSn, @Param("facebookSn") String facebookSn, @Param("icqSn") String icqSn, @Param("jabberSn") String jabberSn, @Param("msnSn") String msnSn, @Param("mySpaceSn") String mySpaceSn, @Param("skypeSn") String skypeSn, @Param("twitterSn") String twitterSn, @Param("ymSn") String ymSn, @Param("jobTitle") String jobTitle, @Param("groupIds") JSONArray groupIds, @Param("organizationIds") JSONArray organizationIds, @Param("roleIds") JSONArray roleIds, @Param("userGroupRoles") JSONArray userGroupRoles, @Param("userGroupIds") JSONArray userGroupIds, @Param("addresses") JSONArray addresses, @Param("emailAddresses") JSONArray emailAddresses, @Param("phones") JSONArray phones, @Param("websites") JSONArray websites, @Param("announcementsDelivers") JSONArray announcementsDelivers, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
