package com.liferay.mobile.sdk.v62.usergrouprole;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import org.json.JSONArray;

@Path("/usergrouprole")
public interface UserGroupRoleService {
  @Path("/add-user-group-roles")
  Call<Response> addUserGroupRoles(@Param(name = "userId") long userId, @Param(name = "groupId") long groupId, @Param(name = "roleIds") JSONArray roleIds);

  @Path("/add-user-group-roles")
  Call<Response> addUserGroupRoles(@Param(name = "userIds") JSONArray userIds, @Param(name = "groupId") long groupId, @Param(name = "roleId") long roleId);

  @Path("/delete-user-group-roles")
  Call<Response> deleteUserGroupRoles(@Param(name = "userId") long userId, @Param(name = "groupId") long groupId, @Param(name = "roleIds") JSONArray roleIds);

  @Path("/delete-user-group-roles")
  Call<Response> deleteUserGroupRoles(@Param(name = "userIds") JSONArray userIds, @Param(name = "groupId") long groupId, @Param(name = "roleId") long roleId);
}
