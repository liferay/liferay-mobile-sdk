package com.liferay.mobile.sdk.v62.usergroup;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.annotation.JsonObject;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/usergroup")
public interface UserGroupService {
  @Path("/add-group-user-groups")
  Call<Response> addGroupUserGroups(@Param("groupId") long groupId, @Param("userGroupIds") JSONArray userGroupIds);

  @Path("/add-team-user-groups")
  Call<Response> addTeamUserGroups(@Param("teamId") long teamId, @Param("userGroupIds") JSONArray userGroupIds);

  @Path("/add-user-group")
  Call<JSONObject> addUserGroup(@Param("name") String name, @Param("description") String description);

  @Path("/add-user-group")
  Call<JSONObject> addUserGroup(@Param("name") String name, @Param("description") String description, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-user-group")
  Call<Response> deleteUserGroup(@Param("userGroupId") long userGroupId);

  @Path("/get-user-group")
  Call<JSONObject> getUserGroup(@Param("name") String name);

  @Path("/get-user-group")
  Call<JSONObject> getUserGroup(@Param("userGroupId") long userGroupId);

  @Path("/get-user-user-groups")
  Call<JSONArray> getUserUserGroups(@Param("userId") long userId);

  @Path("/unset-group-user-groups")
  Call<Response> unsetGroupUserGroups(@Param("groupId") long groupId, @Param("userGroupIds") JSONArray userGroupIds);

  @Path("/unset-team-user-groups")
  Call<Response> unsetTeamUserGroups(@Param("teamId") long teamId, @Param("userGroupIds") JSONArray userGroupIds);

  @Path("/update-user-group")
  Call<JSONObject> updateUserGroup(@Param("userGroupId") long userGroupId, @Param("name") String name, @Param("description") String description);

  @Path("/update-user-group")
  Call<JSONObject> updateUserGroup(@Param("userGroupId") long userGroupId, @Param("name") String name, @Param("description") String description, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
