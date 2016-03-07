package com.liferay.mobile.android.v62.resourcepermission;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.JsonObject;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/resourcepermission")
public interface ResourcePermissionService {
  @Path("/add-resource-permission")
  Call<Response> addResourcePermission(@Param("groupId") long groupId, @Param("companyId") long companyId, @Param("name") String name, @Param("scope") int scope, @Param("primKey") String primKey, @Param("roleId") long roleId, @Param("actionId") String actionId);

  @Path("/remove-resource-permission")
  Call<Response> removeResourcePermission(@Param("groupId") long groupId, @Param("companyId") long companyId, @Param("name") String name, @Param("scope") int scope, @Param("primKey") String primKey, @Param("roleId") long roleId, @Param("actionId") String actionId);

  @Path("/remove-resource-permissions")
  Call<Response> removeResourcePermissions(@Param("groupId") long groupId, @Param("companyId") long companyId, @Param("name") String name, @Param("scope") int scope, @Param("roleId") long roleId, @Param("actionId") String actionId);

  @Path("/set-individual-resource-permissions")
  Call<Response> setIndividualResourcePermissions(@Param("groupId") long groupId, @Param("companyId") long companyId, @Param("name") String name, @Param("primKey") String primKey, @JsonObject(name = "roleIdsToActionIds", className = "") JSONObject roleIdsToActionIds);

  @Path("/set-individual-resource-permissions")
  Call<Response> setIndividualResourcePermissions(@Param("groupId") long groupId, @Param("companyId") long companyId, @Param("name") String name, @Param("primKey") String primKey, @Param("roleId") long roleId, @Param("actionIds") JSONArray actionIds);
}
