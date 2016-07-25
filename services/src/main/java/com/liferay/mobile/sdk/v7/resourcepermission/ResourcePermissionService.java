package com.liferay.mobile.sdk.v7.resourcepermission;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import java.util.Map;
import org.json.JSONArray;

@Path("/resourcepermission")
public interface ResourcePermissionService {
  @Path("/add-resource-permission")
  Call<Response> addResourcePermission(@Param(name = "groupId") long groupId, @Param(name = "companyId") long companyId, @Param(name = "name") String name, @Param(name = "scope") int scope, @Param(name = "primKey") String primKey, @Param(name = "roleId") long roleId, @Param(name = "actionId") String actionId);

  @Path("/remove-resource-permission")
  Call<Response> removeResourcePermission(@Param(name = "groupId") long groupId, @Param(name = "companyId") long companyId, @Param(name = "name") String name, @Param(name = "scope") int scope, @Param(name = "primKey") String primKey, @Param(name = "roleId") long roleId, @Param(name = "actionId") String actionId);

  @Path("/remove-resource-permissions")
  Call<Response> removeResourcePermissions(@Param(name = "groupId") long groupId, @Param(name = "companyId") long companyId, @Param(name = "name") String name, @Param(name = "scope") int scope, @Param(name = "roleId") long roleId, @Param(name = "actionId") String actionId);

  @Path("/set-individual-resource-permissions")
  Call<Response> setIndividualResourcePermissions(@Param(name = "groupId") long groupId, @Param(name = "companyId") long companyId, @Param(name = "name") String name, @Param(name = "primKey") String primKey, @Param(name = "roleIdsToActionIds") Map roleIdsToActionIds);

  @Path("/set-individual-resource-permissions")
  Call<Response> setIndividualResourcePermissions(@Param(name = "groupId") long groupId, @Param(name = "companyId") long companyId, @Param(name = "name") String name, @Param(name = "primKey") String primKey, @Param(name = "roleId") long roleId, @Param(name = "actionIds") JSONArray actionIds);
}
