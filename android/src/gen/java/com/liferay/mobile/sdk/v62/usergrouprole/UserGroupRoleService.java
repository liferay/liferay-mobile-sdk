package com.liferay.mobile.sdk.v62.usergrouprole;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import org.json.JSONArray;

@Path("/usergrouprole")
public interface UserGroupRoleService {
  @Path("/add-user-group-roles")
  Call<Response> addUserGroupRoles(@Param("userId") long userId, @Param("groupId") long groupId, @Param("roleIds") JSONArray roleIds);

  @Path("/add-user-group-roles")
  Call<Response> addUserGroupRoles(@Param("userIds") JSONArray userIds, @Param("groupId") long groupId, @Param("roleId") long roleId);

  @Path("/delete-user-group-roles")
  Call<Response> deleteUserGroupRoles(@Param("userId") long userId, @Param("groupId") long groupId, @Param("roleIds") JSONArray roleIds);

  @Path("/delete-user-group-roles")
  Call<Response> deleteUserGroupRoles(@Param("userIds") JSONArray userIds, @Param("groupId") long groupId, @Param("roleId") long roleId);
}
