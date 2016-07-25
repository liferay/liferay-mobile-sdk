package com.liferay.mobile.sdk.v7.usergroupgrouprole;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import org.json.JSONArray;

@Path("/usergroupgrouprole")
public interface UserGroupGroupRoleService {
  @Path("/add-user-group-group-roles")
  Call<Response> addUserGroupGroupRoles(@Param(name = "userGroupIds") JSONArray userGroupIds, @Param(name = "groupId") long groupId, @Param(name = "roleId") long roleId);

  @Path("/add-user-group-group-roles")
  Call<Response> addUserGroupGroupRoles(@Param(name = "userGroupId") long userGroupId, @Param(name = "groupId") long groupId, @Param(name = "roleIds") JSONArray roleIds);

  @Path("/delete-user-group-group-roles")
  Call<Response> deleteUserGroupGroupRoles(@Param(name = "userGroupId") long userGroupId, @Param(name = "groupId") long groupId, @Param(name = "roleIds") JSONArray roleIds);

  @Path("/delete-user-group-group-roles")
  Call<Response> deleteUserGroupGroupRoles(@Param(name = "userGroupIds") JSONArray userGroupIds, @Param(name = "groupId") long groupId, @Param(name = "roleId") long roleId);
}
