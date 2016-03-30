package com.liferay.mobile.sdk.v62.role;

import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.v2.Call;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.Boolean;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/role")
public interface RoleService {
  @Path("/add-role")
  Call<JSONObject> addRole(@Param("name") String name, @JsonObject(name = "titleMap", className = "") JSONObject titleMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("type") int type);

  @Path("/add-role")
  Call<JSONObject> addRole(@Param("className") String className, @Param("classPK") long classPK, @Param("name") String name, @JsonObject(name = "titleMap", className = "") JSONObject titleMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("type") int type, @Param("subtype") String subtype, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-user-roles")
  Call<Response> addUserRoles(@Param("userId") long userId, @Param("roleIds") JSONArray roleIds);

  @Path("/delete-role")
  Call<Response> deleteRole(@Param("roleId") long roleId);

  @Path("/get-group-roles")
  Call<JSONArray> getGroupRoles(@Param("groupId") long groupId);

  @Path("/get-role")
  Call<JSONObject> getRole(@Param("roleId") long roleId);

  @Path("/get-role")
  Call<JSONObject> getRole(@Param("companyId") long companyId, @Param("name") String name);

  @Path("/get-user-group-group-roles")
  Call<JSONArray> getUserGroupGroupRoles(@Param("userId") long userId, @Param("groupId") long groupId);

  @Path("/get-user-group-roles")
  Call<JSONArray> getUserGroupRoles(@Param("userId") long userId, @Param("groupId") long groupId);

  @Path("/get-user-related-roles")
  Call<JSONArray> getUserRelatedRoles(@Param("userId") long userId, @Param("groups") JSONArray groups);

  @Path("/get-user-roles")
  Call<JSONArray> getUserRoles(@Param("userId") long userId);

  @Path("/has-user-role")
  Call<Boolean> hasUserRole(@Param("userId") long userId, @Param("companyId") long companyId, @Param("name") String name, @Param("inherited") boolean inherited);

  @Path("/has-user-roles")
  Call<Boolean> hasUserRoles(@Param("userId") long userId, @Param("companyId") long companyId, @Param("names") JSONArray names, @Param("inherited") boolean inherited);

  @Path("/unset-user-roles")
  Call<Response> unsetUserRoles(@Param("userId") long userId, @Param("roleIds") JSONArray roleIds);

  @Path("/update-role")
  Call<JSONObject> updateRole(@Param("roleId") long roleId, @Param("name") String name, @JsonObject(name = "titleMap", className = "") JSONObject titleMap, @JsonObject(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param("subtype") String subtype, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
