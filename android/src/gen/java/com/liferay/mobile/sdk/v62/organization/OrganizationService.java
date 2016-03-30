package com.liferay.mobile.sdk.v62.organization;

import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.v2.Call;
import com.liferay.mobile.sdk.v2.JsonObject;
import com.liferay.mobile.sdk.v2.Param;
import com.liferay.mobile.sdk.v2.Path;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/organization")
public interface OrganizationService {
  @Path("/add-group-organizations")
  Call<Response> addGroupOrganizations(@Param("groupId") long groupId, @Param("organizationIds") JSONArray organizationIds);

  @Path("/add-organization")
  Call<JSONObject> addOrganization(@Param("parentOrganizationId") long parentOrganizationId, @Param("name") String name, @Param("type") String type, @Param("recursable") boolean recursable, @Param("regionId") long regionId, @Param("countryId") long countryId, @Param("statusId") int statusId, @Param("comments") String comments, @Param("site") boolean site, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-organization")
  Call<JSONObject> addOrganization(@Param("parentOrganizationId") long parentOrganizationId, @Param("name") String name, @Param("type") String type, @Param("regionId") long regionId, @Param("countryId") long countryId, @Param("statusId") int statusId, @Param("comments") String comments, @Param("site") boolean site, @Param("addresses") JSONArray addresses, @Param("emailAddresses") JSONArray emailAddresses, @Param("orgLabors") JSONArray orgLabors, @Param("phones") JSONArray phones, @Param("websites") JSONArray websites, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-organization")
  Call<JSONObject> addOrganization(@Param("parentOrganizationId") long parentOrganizationId, @Param("name") String name, @Param("type") String type, @Param("recursable") boolean recursable, @Param("regionId") long regionId, @Param("countryId") long countryId, @Param("statusId") int statusId, @Param("comments") String comments, @Param("site") boolean site, @Param("addresses") JSONArray addresses, @Param("emailAddresses") JSONArray emailAddresses, @Param("orgLabors") JSONArray orgLabors, @Param("phones") JSONArray phones, @Param("websites") JSONArray websites, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-organization")
  Call<JSONObject> addOrganization(@Param("parentOrganizationId") long parentOrganizationId, @Param("name") String name, @Param("type") String type, @Param("regionId") long regionId, @Param("countryId") long countryId, @Param("statusId") int statusId, @Param("comments") String comments, @Param("site") boolean site, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/add-password-policy-organizations")
  Call<Response> addPasswordPolicyOrganizations(@Param("passwordPolicyId") long passwordPolicyId, @Param("organizationIds") JSONArray organizationIds);

  @Path("/delete-logo")
  Call<Response> deleteLogo(@Param("organizationId") long organizationId);

  @Path("/delete-organization")
  Call<Response> deleteOrganization(@Param("organizationId") long organizationId);

  @Path("/get-manageable-organizations")
  Call<JSONArray> getManageableOrganizations(@Param("actionId") String actionId, @Param("max") int max);

  @Path("/get-organization")
  Call<JSONObject> getOrganization(@Param("organizationId") long organizationId);

  @Path("/get-organization-id")
  Call<Long> getOrganizationId(@Param("companyId") long companyId, @Param("name") String name);

  @Path("/get-organizations")
  Call<JSONArray> getOrganizations(@Param("companyId") long companyId, @Param("parentOrganizationId") long parentOrganizationId);

  @Path("/get-organizations")
  Call<JSONArray> getOrganizations(@Param("companyId") long companyId, @Param("parentOrganizationId") long parentOrganizationId, @Param("start") int start, @Param("end") int end);

  @Path("/get-organizations-count")
  Call<Integer> getOrganizationsCount(@Param("companyId") long companyId, @Param("parentOrganizationId") long parentOrganizationId);

  @Path("/get-user-organizations")
  Call<JSONArray> getUserOrganizations(@Param("userId") long userId);

  @Path("/set-group-organizations")
  Call<Response> setGroupOrganizations(@Param("groupId") long groupId, @Param("organizationIds") JSONArray organizationIds);

  @Path("/unset-group-organizations")
  Call<Response> unsetGroupOrganizations(@Param("groupId") long groupId, @Param("organizationIds") JSONArray organizationIds);

  @Path("/unset-password-policy-organizations")
  Call<Response> unsetPasswordPolicyOrganizations(@Param("passwordPolicyId") long passwordPolicyId, @Param("organizationIds") JSONArray organizationIds);

  @Path("/update-organization")
  Call<JSONObject> updateOrganization(@Param("organizationId") long organizationId, @Param("parentOrganizationId") long parentOrganizationId, @Param("name") String name, @Param("type") String type, @Param("regionId") long regionId, @Param("countryId") long countryId, @Param("statusId") int statusId, @Param("comments") String comments, @Param("site") boolean site, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-organization")
  Call<JSONObject> updateOrganization(@Param("organizationId") long organizationId, @Param("parentOrganizationId") long parentOrganizationId, @Param("name") String name, @Param("type") String type, @Param("recursable") boolean recursable, @Param("regionId") long regionId, @Param("countryId") long countryId, @Param("statusId") int statusId, @Param("comments") String comments, @Param("site") boolean site, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-organization")
  Call<JSONObject> updateOrganization(@Param("organizationId") long organizationId, @Param("parentOrganizationId") long parentOrganizationId, @Param("name") String name, @Param("type") String type, @Param("regionId") long regionId, @Param("countryId") long countryId, @Param("statusId") int statusId, @Param("comments") String comments, @Param("site") boolean site, @Param("addresses") JSONArray addresses, @Param("emailAddresses") JSONArray emailAddresses, @Param("orgLabors") JSONArray orgLabors, @Param("phones") JSONArray phones, @Param("websites") JSONArray websites, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/update-organization")
  Call<JSONObject> updateOrganization(@Param("organizationId") long organizationId, @Param("parentOrganizationId") long parentOrganizationId, @Param("name") String name, @Param("type") String type, @Param("recursable") boolean recursable, @Param("regionId") long regionId, @Param("countryId") long countryId, @Param("statusId") int statusId, @Param("comments") String comments, @Param("site") boolean site, @Param("addresses") JSONArray addresses, @Param("emailAddresses") JSONArray emailAddresses, @Param("orgLabors") JSONArray orgLabors, @Param("phones") JSONArray phones, @Param("websites") JSONArray websites, @JsonObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);
}
