/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.mobile.android.v62.organization;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class OrganizationService extends BaseService {

	public OrganizationService(Session session) {
		super(session);
	}

	public void addGroupOrganizations(long groupId, JSONArray organizationIds) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("organizationIds", organizationIds);

			_command.put("/organization/add-group-organizations", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject addOrganization(long parentOrganizationId, String name, String type, boolean recursable, long regionId, long countryId, int statusId, String comments, boolean site, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("parentOrganizationId", parentOrganizationId);
			_params.put("name", name);
			_params.put("type", type);
			_params.put("recursable", recursable);
			_params.put("regionId", regionId);
			_params.put("countryId", countryId);
			_params.put("statusId", statusId);
			_params.put("comments", comments);
			_params.put("site", site);
			_params.put("serviceContext", serviceContext);

			_command.put("/organization/add-organization", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject addOrganization(long parentOrganizationId, String name, String type, long regionId, long countryId, int statusId, String comments, boolean site, JSONArray addresses, JSONArray emailAddresses, JSONArray orgLabors, JSONArray phones, JSONArray websites, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("parentOrganizationId", parentOrganizationId);
			_params.put("name", name);
			_params.put("type", type);
			_params.put("regionId", regionId);
			_params.put("countryId", countryId);
			_params.put("statusId", statusId);
			_params.put("comments", comments);
			_params.put("site", site);
			_params.put("addresses", addresses);
			_params.put("emailAddresses", emailAddresses);
			_params.put("orgLabors", orgLabors);
			_params.put("phones", phones);
			_params.put("websites", websites);
			_params.put("serviceContext", serviceContext);

			_command.put("/organization/add-organization", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject addOrganization(long parentOrganizationId, String name, String type, boolean recursable, long regionId, long countryId, int statusId, String comments, boolean site, JSONArray addresses, JSONArray emailAddresses, JSONArray orgLabors, JSONArray phones, JSONArray websites, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("parentOrganizationId", parentOrganizationId);
			_params.put("name", name);
			_params.put("type", type);
			_params.put("recursable", recursable);
			_params.put("regionId", regionId);
			_params.put("countryId", countryId);
			_params.put("statusId", statusId);
			_params.put("comments", comments);
			_params.put("site", site);
			_params.put("addresses", addresses);
			_params.put("emailAddresses", emailAddresses);
			_params.put("orgLabors", orgLabors);
			_params.put("phones", phones);
			_params.put("websites", websites);
			_params.put("serviceContext", serviceContext);

			_command.put("/organization/add-organization", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject addOrganization(long parentOrganizationId, String name, String type, long regionId, long countryId, int statusId, String comments, boolean site, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("parentOrganizationId", parentOrganizationId);
			_params.put("name", name);
			_params.put("type", type);
			_params.put("regionId", regionId);
			_params.put("countryId", countryId);
			_params.put("statusId", statusId);
			_params.put("comments", comments);
			_params.put("site", site);
			_params.put("serviceContext", serviceContext);

			_command.put("/organization/add-organization", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void addPasswordPolicyOrganizations(long passwordPolicyId, JSONArray organizationIds) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("passwordPolicyId", passwordPolicyId);
			_params.put("organizationIds", organizationIds);

			_command.put("/organization/add-password-policy-organizations", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void deleteLogo(long organizationId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("organizationId", organizationId);

			_command.put("/organization/delete-logo", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void deleteOrganization(long organizationId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("organizationId", organizationId);

			_command.put("/organization/delete-organization", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONArray getManageableOrganizations(String actionId, int max) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("actionId", actionId);
			_params.put("max", max);

			_command.put("/organization/get-manageable-organizations", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONObject getOrganization(long organizationId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("organizationId", organizationId);

			_command.put("/organization/get-organization", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public Long getOrganizationId(long companyId, String name) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("name", name);

			_command.put("/organization/get-organization-id", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Long)session.invoke(_command);
	}

	public JSONArray getOrganizations(long companyId, long parentOrganizationId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("parentOrganizationId", parentOrganizationId);

			_command.put("/organization/get-organizations", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getOrganizations(long companyId, long parentOrganizationId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("parentOrganizationId", parentOrganizationId);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/organization/get-organizations", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer getOrganizationsCount(long companyId, long parentOrganizationId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("parentOrganizationId", parentOrganizationId);

			_command.put("/organization/get-organizations-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONArray getUserOrganizations(long userId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);

			_command.put("/organization/get-user-organizations", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public void setGroupOrganizations(long groupId, JSONArray organizationIds) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("organizationIds", organizationIds);

			_command.put("/organization/set-group-organizations", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void unsetGroupOrganizations(long groupId, JSONArray organizationIds) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("organizationIds", organizationIds);

			_command.put("/organization/unset-group-organizations", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void unsetPasswordPolicyOrganizations(long passwordPolicyId, JSONArray organizationIds) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("passwordPolicyId", passwordPolicyId);
			_params.put("organizationIds", organizationIds);

			_command.put("/organization/unset-password-policy-organizations", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject updateOrganization(long organizationId, long parentOrganizationId, String name, String type, long regionId, long countryId, int statusId, String comments, boolean site, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("organizationId", organizationId);
			_params.put("parentOrganizationId", parentOrganizationId);
			_params.put("name", name);
			_params.put("type", type);
			_params.put("regionId", regionId);
			_params.put("countryId", countryId);
			_params.put("statusId", statusId);
			_params.put("comments", comments);
			_params.put("site", site);
			_params.put("serviceContext", serviceContext);

			_command.put("/organization/update-organization", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updateOrganization(long organizationId, long parentOrganizationId, String name, String type, boolean recursable, long regionId, long countryId, int statusId, String comments, boolean site, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("organizationId", organizationId);
			_params.put("parentOrganizationId", parentOrganizationId);
			_params.put("name", name);
			_params.put("type", type);
			_params.put("recursable", recursable);
			_params.put("regionId", regionId);
			_params.put("countryId", countryId);
			_params.put("statusId", statusId);
			_params.put("comments", comments);
			_params.put("site", site);
			_params.put("serviceContext", serviceContext);

			_command.put("/organization/update-organization", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updateOrganization(long organizationId, long parentOrganizationId, String name, String type, long regionId, long countryId, int statusId, String comments, boolean site, JSONArray addresses, JSONArray emailAddresses, JSONArray orgLabors, JSONArray phones, JSONArray websites, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("organizationId", organizationId);
			_params.put("parentOrganizationId", parentOrganizationId);
			_params.put("name", name);
			_params.put("type", type);
			_params.put("regionId", regionId);
			_params.put("countryId", countryId);
			_params.put("statusId", statusId);
			_params.put("comments", comments);
			_params.put("site", site);
			_params.put("addresses", addresses);
			_params.put("emailAddresses", emailAddresses);
			_params.put("orgLabors", orgLabors);
			_params.put("phones", phones);
			_params.put("websites", websites);
			_params.put("serviceContext", serviceContext);

			_command.put("/organization/update-organization", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updateOrganization(long organizationId, long parentOrganizationId, String name, String type, boolean recursable, long regionId, long countryId, int statusId, String comments, boolean site, JSONArray addresses, JSONArray emailAddresses, JSONArray orgLabors, JSONArray phones, JSONArray websites, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("organizationId", organizationId);
			_params.put("parentOrganizationId", parentOrganizationId);
			_params.put("name", name);
			_params.put("type", type);
			_params.put("recursable", recursable);
			_params.put("regionId", regionId);
			_params.put("countryId", countryId);
			_params.put("statusId", statusId);
			_params.put("comments", comments);
			_params.put("site", site);
			_params.put("addresses", addresses);
			_params.put("emailAddresses", emailAddresses);
			_params.put("orgLabors", orgLabors);
			_params.put("phones", phones);
			_params.put("websites", websites);
			_params.put("serviceContext", serviceContext);

			_command.put("/organization/update-organization", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

}