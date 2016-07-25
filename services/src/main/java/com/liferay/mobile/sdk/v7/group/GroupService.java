package com.liferay.mobile.sdk.v7.group;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/group")
public interface GroupService {
  @Path("/add-group")
  Call<JSONObject> addGroup(@Param(name = "parentGroupId") long parentGroupId, @Param(name = "liveGroupId") long liveGroupId, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "type") int type, @Param(name = "manualMembership") boolean manualMembership, @Param(name = "membershipRestriction") int membershipRestriction, @Param(name = "friendlyURL") String friendlyURL, @Param(name = "site") boolean site, @Param(name = "active") boolean active, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/add-group")
  Call<JSONObject> addGroup(@Param(name = "parentGroupId") long parentGroupId, @Param(name = "liveGroupId") long liveGroupId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "type") int type, @Param(name = "manualMembership") boolean manualMembership, @Param(name = "membershipRestriction") int membershipRestriction, @Param(name = "friendlyURL") String friendlyURL, @Param(name = "site") boolean site, @Param(name = "active") boolean active, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/add-group")
  Call<JSONObject> addGroup(@Param(name = "parentGroupId") long parentGroupId, @Param(name = "liveGroupId") long liveGroupId, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "type") int type, @Param(name = "manualMembership") boolean manualMembership, @Param(name = "membershipRestriction") int membershipRestriction, @Param(name = "friendlyURL") String friendlyURL, @Param(name = "site") boolean site, @Param(name = "inheritContent") boolean inheritContent, @Param(name = "active") boolean active, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/add-role-groups")
  Call<Response> addRoleGroups(@Param(name = "roleId") long roleId, @Param(name = "groupIds") JSONArray groupIds);

  @Path("/check-remote-staging-group")
  Call<Response> checkRemoteStagingGroup(@Param(name = "groupId") long groupId);

  @Path("/delete-group")
  Call<Response> deleteGroup(@Param(name = "groupId") long groupId);

  @Path("/disable-staging")
  Call<Response> disableStaging(@Param(name = "groupId") long groupId);

  @Path("/enable-staging")
  Call<Response> enableStaging(@Param(name = "groupId") long groupId);

  @Path("/get-company-group")
  Call<JSONObject> getCompanyGroup(@Param(name = "companyId") long companyId);

  @Path("/get-group")
  Call<JSONObject> getGroup(@Param(name = "groupId") long groupId);

  @Path("/get-group")
  Call<JSONObject> getGroup(@Param(name = "companyId") long companyId, @Param(name = "groupKey") String groupKey);

  @Path("/get-group-display-url")
  Call<String> getGroupDisplayURL(@Param(name = "groupId") long groupId, @Param(name = "privateLayout") boolean privateLayout, @Param(name = "secureConnection") boolean secureConnection);

  @Path("/get-groups")
  Call<JSONArray> getGroups(@Param(name = "companyId") long companyId, @Param(name = "parentGroupId") long parentGroupId, @Param(name = "site") boolean site);

  @Path("/get-manageable-site-groups")
  Call<JSONArray> getManageableSiteGroups(@Param(name = "portlets") JSONArray portlets, @Param(name = "max") int max);

  @Path("/get-organizations-groups")
  Call<JSONArray> getOrganizationsGroups(@Param(name = "organizations") JSONArray organizations);

  @Path("/get-user-group")
  Call<JSONObject> getUserGroup(@Param(name = "companyId") long companyId, @Param(name = "userId") long userId);

  @Path("/get-user-groups-groups")
  Call<JSONArray> getUserGroupsGroups(@Param(name = "userGroups") JSONArray userGroups);

  @Path("/get-user-organizations-groups")
  Call<JSONArray> getUserOrganizationsGroups(@Param(name = "userId") long userId, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/get-user-sites-groups")
  Call<JSONArray> getUserSitesGroups();

  @Path("/get-user-sites-groups")
  Call<JSONArray> getUserSitesGroups(@Param(name = "classNames") JSONArray classNames, @Param(name = "max") int max);

  @Path("/get-user-sites-groups")
  Call<JSONArray> getUserSitesGroups(@Param(name = "userId") long userId, @Param(name = "classNames") JSONArray classNames, @Param(name = "max") int max);

  @Path("/get-user-sites-groups-count")
  Call<Integer> getUserSitesGroupsCount();

  @Path("/has-user-group")
  Call<Boolean> hasUserGroup(@Param(name = "userId") long userId, @Param(name = "groupId") long groupId);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "params") JSONArray params, @Param(name = "start") int start, @Param(name = "end") int end);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "classNameIds") JSONArray classNameIds, @Param(name = "keywords") String keywords, @Param(name = "params", className = "") JSONObject params, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "") JSONObject obc);

  @Path("/search")
  Call<JSONArray> search(@Param(name = "companyId") long companyId, @Param(name = "classNameIds") JSONArray classNameIds, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "params", className = "") JSONObject params, @Param(name = "andOperator") boolean andOperator, @Param(name = "start") int start, @Param(name = "end") int end, @Param(name = "obc", className = "") JSONObject obc);

  @Path("/search-count")
  Call<Integer> searchCount(@Param(name = "companyId") long companyId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "params") JSONArray params);

  @Path("/set-role-groups")
  Call<Response> setRoleGroups(@Param(name = "roleId") long roleId, @Param(name = "groupIds") JSONArray groupIds);

  @Path("/unset-role-groups")
  Call<Response> unsetRoleGroups(@Param(name = "roleId") long roleId, @Param(name = "groupIds") JSONArray groupIds);

  @Path("/update-friendly-url")
  Call<JSONObject> updateFriendlyURL(@Param(name = "groupId") long groupId, @Param(name = "friendlyURL") String friendlyURL);

  @Path("/update-group")
  Call<JSONObject> updateGroup(@Param(name = "groupId") long groupId, @Param(name = "typeSettings") String typeSettings);

  @Path("/update-group")
  Call<JSONObject> updateGroup(@Param(name = "groupId") long groupId, @Param(name = "parentGroupId") long parentGroupId, @Param(name = "name") String name, @Param(name = "description") String description, @Param(name = "type") int type, @Param(name = "manualMembership") boolean manualMembership, @Param(name = "membershipRestriction") int membershipRestriction, @Param(name = "friendlyURL") String friendlyURL, @Param(name = "inheritContent") boolean inheritContent, @Param(name = "active") boolean active, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/update-group")
  Call<JSONObject> updateGroup(@Param(name = "groupId") long groupId, @Param(name = "parentGroupId") long parentGroupId, @Param(name = "nameMap", className = "") JSONObject nameMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "type") int type, @Param(name = "manualMembership") boolean manualMembership, @Param(name = "membershipRestriction") int membershipRestriction, @Param(name = "friendlyURL") String friendlyURL, @Param(name = "inheritContent") boolean inheritContent, @Param(name = "active") boolean active, @Param(name = "serviceContext", className = "") JSONObject serviceContext);

  @Path("/update-staged-portlets")
  Call<Response> updateStagedPortlets(@Param(name = "groupId") long groupId, @Param(name = "stagedPortletIds", className = "") JSONObject stagedPortletIds);
}
