package com.liferay.mobile.sdk.v62.resourceblock;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/resourceblock")
public interface ResourceBlockService {
  @Path("/add-company-scope-permission")
  Call<Response> addCompanyScopePermission(@Param(name = "scopeGroupId") long scopeGroupId, @Param(name = "companyId") long companyId, @Param(name = "name") String name, @Param(name = "roleId") long roleId, @Param(name = "actionId") String actionId);

  @Path("/add-group-scope-permission")
  Call<Response> addGroupScopePermission(@Param(name = "scopeGroupId") long scopeGroupId, @Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "roleId") long roleId, @Param(name = "actionId") String actionId);

  @Path("/add-individual-scope-permission")
  Call<Response> addIndividualScopePermission(@Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "primKey") long primKey, @Param(name = "roleId") long roleId, @Param(name = "actionId") String actionId);

  @Path("/remove-all-group-scope-permissions")
  Call<Response> removeAllGroupScopePermissions(@Param(name = "scopeGroupId") long scopeGroupId, @Param(name = "companyId") long companyId, @Param(name = "name") String name, @Param(name = "roleId") long roleId, @Param(name = "actionId") String actionId);

  @Path("/remove-company-scope-permission")
  Call<Response> removeCompanyScopePermission(@Param(name = "scopeGroupId") long scopeGroupId, @Param(name = "companyId") long companyId, @Param(name = "name") String name, @Param(name = "roleId") long roleId, @Param(name = "actionId") String actionId);

  @Path("/remove-group-scope-permission")
  Call<Response> removeGroupScopePermission(@Param(name = "scopeGroupId") long scopeGroupId, @Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "roleId") long roleId, @Param(name = "actionId") String actionId);

  @Path("/remove-individual-scope-permission")
  Call<Response> removeIndividualScopePermission(@Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "primKey") long primKey, @Param(name = "roleId") long roleId, @Param(name = "actionId") String actionId);

  @Path("/set-company-scope-permissions")
  Call<Response> setCompanyScopePermissions(@Param(name = "scopeGroupId") long scopeGroupId, @Param(name = "companyId") long companyId, @Param(name = "name") String name, @Param(name = "roleId") long roleId, @Param(name = "actionIds") JSONArray actionIds);

  @Path("/set-group-scope-permissions")
  Call<Response> setGroupScopePermissions(@Param(name = "scopeGroupId") long scopeGroupId, @Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "roleId") long roleId, @Param(name = "actionIds") JSONArray actionIds);

  @Path("/set-individual-scope-permissions")
  Call<Response> setIndividualScopePermissions(@Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "primKey") long primKey, @Param(name = "roleIdsToActionIds") JSONObject roleIdsToActionIds);

  @Path("/set-individual-scope-permissions")
  Call<Response> setIndividualScopePermissions(@Param(name = "companyId") long companyId, @Param(name = "groupId") long groupId, @Param(name = "name") String name, @Param(name = "primKey") long primKey, @Param(name = "roleId") long roleId, @Param(name = "actionIds") JSONArray actionIds);
}
