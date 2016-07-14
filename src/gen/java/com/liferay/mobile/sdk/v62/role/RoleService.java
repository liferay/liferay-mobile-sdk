package com.liferay.mobile.sdk.v62.role;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.Boolean;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/role")
public interface RoleService {
  @Path("/add-role")
  Call<JSONObject> addRole(@Param(name = "name") String name, @Param(name = "titleMap", className = "") JSONObject titleMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "type") int type);

  @Path("/add-role")
  Call<JSONObject> addRole(@Param(name = "className") String className, @Param(name = "classPK") long classPK, @Param(name = "name") String name, @Param(name = "titleMap", className = "") JSONObject titleMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "type") int type, @Param(name = "subtype") String subtype, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-user-roles")
  Call<Response> addUserRoles(@Param(name = "userId") long userId, @Param(name = "roleIds") JSONArray roleIds);

  @Path("/delete-role")
  Call<Response> deleteRole(@Param(name = "roleId") long roleId);

  @Path("/get-group-roles")
  Call<JSONArray> getGroupRoles(@Param(name = "groupId") long groupId);

  @Path("/get-role")
  Call<JSONObject> getRole(@Param(name = "roleId") long roleId);

  @Path("/get-role")
  Call<JSONObject> getRole(@Param(name = "companyId") long companyId, @Param(name = "name") String name);

  @Path("/get-user-group-group-roles")
  Call<JSONArray> getUserGroupGroupRoles(@Param(name = "userId") long userId, @Param(name = "groupId") long groupId);

  @Path("/get-user-group-roles")
  Call<JSONArray> getUserGroupRoles(@Param(name = "userId") long userId, @Param(name = "groupId") long groupId);

  @Path("/get-user-related-roles")
  Call<JSONArray> getUserRelatedRoles(@Param(name = "userId") long userId, @Param(name = "groups") JSONArray groups);

  @Path("/get-user-roles")
  Call<JSONArray> getUserRoles(@Param(name = "userId") long userId);

  @Path("/has-user-role")
  Call<Boolean> hasUserRole(@Param(name = "userId") long userId, @Param(name = "companyId") long companyId, @Param(name = "name") String name, @Param(name = "inherited") boolean inherited);

  @Path("/has-user-roles")
  Call<Boolean> hasUserRoles(@Param(name = "userId") long userId, @Param(name = "companyId") long companyId, @Param(name = "names") JSONArray names, @Param(name = "inherited") boolean inherited);

  @Path("/unset-user-roles")
  Call<Response> unsetUserRoles(@Param(name = "userId") long userId, @Param(name = "roleIds") JSONArray roleIds);

  @Path("/update-role")
  Call<JSONObject> updateRole(@Param(name = "roleId") long roleId, @Param(name = "name") String name, @Param(name = "titleMap", className = "") JSONObject titleMap, @Param(name = "descriptionMap", className = "") JSONObject descriptionMap, @Param(name = "subtype") String subtype, @Param(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
