package com.liferay.mobile.android.v62.resourceblock;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.JsonObject;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/resourceblock")
public interface ResourceBlockService {
  @Path("/add-company-scope-permission")
  Call<Response> addCompanyScopePermission(@Param("scopeGroupId") long scopeGroupId, @Param("companyId") long companyId, @Param("name") String name, @Param("roleId") long roleId, @Param("actionId") String actionId);

  @Path("/add-group-scope-permission")
  Call<Response> addGroupScopePermission(@Param("scopeGroupId") long scopeGroupId, @Param("companyId") long companyId, @Param("groupId") long groupId, @Param("name") String name, @Param("roleId") long roleId, @Param("actionId") String actionId);

  @Path("/add-individual-scope-permission")
  Call<Response> addIndividualScopePermission(@Param("companyId") long companyId, @Param("groupId") long groupId, @Param("name") String name, @Param("primKey") long primKey, @Param("roleId") long roleId, @Param("actionId") String actionId);

  @Path("/remove-all-group-scope-permissions")
  Call<Response> removeAllGroupScopePermissions(@Param("scopeGroupId") long scopeGroupId, @Param("companyId") long companyId, @Param("name") String name, @Param("roleId") long roleId, @Param("actionId") String actionId);

  @Path("/remove-company-scope-permission")
  Call<Response> removeCompanyScopePermission(@Param("scopeGroupId") long scopeGroupId, @Param("companyId") long companyId, @Param("name") String name, @Param("roleId") long roleId, @Param("actionId") String actionId);

  @Path("/remove-group-scope-permission")
  Call<Response> removeGroupScopePermission(@Param("scopeGroupId") long scopeGroupId, @Param("companyId") long companyId, @Param("groupId") long groupId, @Param("name") String name, @Param("roleId") long roleId, @Param("actionId") String actionId);

  @Path("/remove-individual-scope-permission")
  Call<Response> removeIndividualScopePermission(@Param("companyId") long companyId, @Param("groupId") long groupId, @Param("name") String name, @Param("primKey") long primKey, @Param("roleId") long roleId, @Param("actionId") String actionId);

  @Path("/set-company-scope-permissions")
  Call<Response> setCompanyScopePermissions(@Param("scopeGroupId") long scopeGroupId, @Param("companyId") long companyId, @Param("name") String name, @Param("roleId") long roleId, @Param("actionIds") JSONArray actionIds);

  @Path("/set-group-scope-permissions")
  Call<Response> setGroupScopePermissions(@Param("scopeGroupId") long scopeGroupId, @Param("companyId") long companyId, @Param("groupId") long groupId, @Param("name") String name, @Param("roleId") long roleId, @Param("actionIds") JSONArray actionIds);

  @Path("/set-individual-scope-permissions")
  Call<Response> setIndividualScopePermissions(@Param("companyId") long companyId, @Param("groupId") long groupId, @Param("name") String name, @Param("primKey") long primKey, @JsonObject(name = "roleIdsToActionIds", className = "") JSONObject roleIdsToActionIds);

  @Path("/set-individual-scope-permissions")
  Call<Response> setIndividualScopePermissions(@Param("companyId") long companyId, @Param("groupId") long groupId, @Param("name") String name, @Param("primKey") long primKey, @Param("roleId") long roleId, @Param("actionIds") JSONArray actionIds);
}
