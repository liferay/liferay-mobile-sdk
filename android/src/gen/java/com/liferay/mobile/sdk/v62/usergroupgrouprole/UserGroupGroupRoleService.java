package com.liferay.mobile.sdk.v62.usergroupgrouprole;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import org.json.JSONArray;

@Path("/usergroupgrouprole")
public interface UserGroupGroupRoleService {
  @Path("/add-user-group-group-roles")
  Call<Response> addUserGroupGroupRoles(@Param("userGroupId") long userGroupId, @Param("groupId") long groupId, @Param("roleIds") JSONArray roleIds);

  @Path("/add-user-group-group-roles")
  Call<Response> addUserGroupGroupRoles(@Param("userGroupIds") JSONArray userGroupIds, @Param("groupId") long groupId, @Param("roleId") long roleId);

  @Path("/delete-user-group-group-roles")
  Call<Response> deleteUserGroupGroupRoles(@Param("userGroupId") long userGroupId, @Param("groupId") long groupId, @Param("roleIds") JSONArray roleIds);

  @Path("/delete-user-group-group-roles")
  Call<Response> deleteUserGroupGroupRoles(@Param("userGroupIds") JSONArray userGroupIds, @Param("groupId") long groupId, @Param("roleId") long roleId);
}
