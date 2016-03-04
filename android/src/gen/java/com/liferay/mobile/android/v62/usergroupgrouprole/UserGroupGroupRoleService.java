package com.liferay.mobile.android.v62.usergroupgrouprole;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
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
