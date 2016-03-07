package com.liferay.mobile.android.v62.group;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.JsonObject;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/group")
public interface GroupService {
  @Path("/add-group")
  Call<JSONObject> addGroup(@Param("parentGroupId") long parentGroupId, @Param("liveGroupId") long liveGroupId, @Param("name") String name, @Param("description") String description, @Param("type") int type, @Param("manualMembership") boolean manualMembership, @Param("membershipRestriction") int membershipRestriction, @Param("friendlyURL") String friendlyURL, @Param("site") boolean site, @Param("active") boolean active, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-group")
  Call<JSONObject> addGroup(@Param("name") String name, @Param("description") String description, @Param("type") int type, @Param("friendlyURL") String friendlyURL, @Param("site") boolean site, @Param("active") boolean active, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-group")
  Call<JSONObject> addGroup(@Param("parentGroupId") long parentGroupId, @Param("name") String name, @Param("description") String description, @Param("type") int type, @Param("friendlyURL") String friendlyURL, @Param("site") boolean site, @Param("active") boolean active, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-role-groups")
  Call<Response> addRoleGroups(@Param("roleId") long roleId, @Param("groupIds") JSONArray groupIds);

  @Path("/check-remote-staging-group")
  Call<Response> checkRemoteStagingGroup(@Param("groupId") long groupId);

  @Path("/delete-group")
  Call<Response> deleteGroup(@Param("groupId") long groupId);

  @Path("/disable-staging")
  Call<Response> disableStaging(@Param("groupId") long groupId);

  @Path("/enable-staging")
  Call<Response> enableStaging(@Param("groupId") long groupId);

  @Path("/get-company-group")
  Call<JSONObject> getCompanyGroup(@Param("companyId") long companyId);

  @Path("/get-group")
  Call<JSONObject> getGroup(@Param("groupId") long groupId);

  @Path("/get-group")
  Call<JSONObject> getGroup(@Param("companyId") long companyId, @Param("name") String name);

  @Path("/get-groups")
  Call<JSONArray> getGroups(@Param("companyId") long companyId, @Param("parentGroupId") long parentGroupId, @Param("site") boolean site);

  @Path("/get-manageable-site-groups")
  Call<JSONArray> getManageableSiteGroups(@JsonObject(name = "portlets", className = "") JSONObject portlets, @Param("max") int max);

  @Path("/get-manageable-sites")
  Call<JSONArray> getManageableSites(@JsonObject(name = "portlets", className = "") JSONObject portlets, @Param("max") int max);

  @Path("/get-organizations-groups")
  Call<JSONArray> getOrganizationsGroups(@Param("organizations") JSONArray organizations);

  @Path("/get-user-group")
  Call<JSONObject> getUserGroup(@Param("companyId") long companyId, @Param("userId") long userId);

  @Path("/get-user-groups-groups")
  Call<JSONArray> getUserGroupsGroups(@Param("userGroups") JSONArray userGroups);

  @Path("/get-user-organizations-groups")
  Call<JSONArray> getUserOrganizationsGroups(@Param("userId") long userId, @Param("start") int start, @Param("end") int end);

  @Path("/get-user-places")
  Call<JSONArray> getUserPlaces(@Param("classNames") JSONArray classNames, @Param("max") int max);

  @Path("/get-user-places")
  Call<JSONArray> getUserPlaces(@Param("userId") long userId, @Param("classNames") JSONArray classNames, @Param("max") int max);

  @Path("/get-user-places")
  Call<JSONArray> getUserPlaces(@Param("userId") long userId, @Param("classNames") JSONArray classNames, @Param("includeControlPanel") boolean includeControlPanel, @Param("max") int max);

  @Path("/get-user-places-count")
  Call<Integer> getUserPlacesCount();

  @Path("/get-user-sites")
  Call<JSONArray> getUserSites();

  @Path("/get-user-sites-groups")
  Call<JSONArray> getUserSitesGroups();

  @Path("/get-user-sites-groups")
  Call<JSONArray> getUserSitesGroups(@Param("classNames") JSONArray classNames, @Param("max") int max);

  @Path("/get-user-sites-groups")
  Call<JSONArray> getUserSitesGroups(@Param("userId") long userId, @Param("classNames") JSONArray classNames, @Param("max") int max);

  @Path("/get-user-sites-groups")
  Call<JSONArray> getUserSitesGroups(@Param("userId") long userId, @Param("classNames") JSONArray classNames, @Param("includeControlPanel") boolean includeControlPanel, @Param("max") int max);

  @Path("/get-user-sites-groups-count")
  Call<Integer> getUserSitesGroupsCount();

  @Path("/has-user-group")
  Call<Boolean> hasUserGroup(@Param("userId") long userId, @Param("groupId") long groupId);

  @Path("/search")
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("name") String name, @Param("description") String description, @Param("params") JSONArray params, @Param("start") int start, @Param("end") int end);

  @Path("/search-count")
  Call<Integer> searchCount(@Param("companyId") long companyId, @Param("name") String name, @Param("description") String description, @Param("params") JSONArray params);

  @Path("/set-role-groups")
  Call<Response> setRoleGroups(@Param("roleId") long roleId, @Param("groupIds") JSONArray groupIds);

  @Path("/unset-role-groups")
  Call<Response> unsetRoleGroups(@Param("roleId") long roleId, @Param("groupIds") JSONArray groupIds);

  @Path("/update-friendly-url")
  Call<JSONObject> updateFriendlyUrl(@Param("groupId") long groupId, @Param("friendlyURL") String friendlyURL);

  @Path("/update-group")
  Call<JSONObject> updateGroup(@Param("groupId") long groupId, @Param("parentGroupId") long parentGroupId, @Param("name") String name, @Param("description") String description, @Param("type") int type, @Param("manualMembership") boolean manualMembership, @Param("membershipRestriction") int membershipRestriction, @Param("friendlyURL") String friendlyURL, @Param("active") boolean active, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-group")
  Call<JSONObject> updateGroup(@Param("groupId") long groupId, @Param("typeSettings") String typeSettings);

  @Path("/update-staged-portlets")
  Call<Response> updateStagedPortlets(@Param("groupId") long groupId, @JsonObject(name = "stagedPortletIds", className = "") JSONObject stagedPortletIds);
}
