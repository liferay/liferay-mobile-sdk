/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.mobile.android.v73.commerceaccountorganizationrel;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommerceaccountorganizationrelService extends BaseService {

	public CommerceaccountorganizationrelService(Session session) {
		super(session);
	}

	public JSONObject addCommerceAccountOrganizationRel(long commerceAccountId, long organizationId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);
			_params.put("organizationId", organizationId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceaccountorganizationrel/add-commerce-account-organization-rel", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public void addCommerceAccountOrganizationRels(long commerceAccountId, JSONArray organizationIds, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);
			_params.put("organizationIds", checkNull(organizationIds));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceaccountorganizationrel/add-commerce-account-organization-rels", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void deleteCommerceAccountOrganizationRel(long commerceAccountId, long organizationId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);
			_params.put("organizationId", organizationId);

			_command.put("/commerce.commerceaccountorganizationrel/delete-commerce-account-organization-rel", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void deleteCommerceAccountOrganizationRels(long commerceAccountId, JSONArray organizationIds) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);
			_params.put("organizationIds", checkNull(organizationIds));

			_command.put("/commerce.commerceaccountorganizationrel/delete-commerce-account-organization-rels", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchCommerceAccountOrganizationRel(JSONObjectWrapper commerceAccountOrganizationRelPK) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			mangleWrapper(_params, "commerceAccountOrganizationRelPK", "com.liferay.commerce.account.service.persistence.CommerceAccountOrganizationRelPK", commerceAccountOrganizationRelPK);

			_command.put("/commerce.commerceaccountorganizationrel/fetch-commerce-account-organization-rel", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject getCommerceAccountOrganizationRel(JSONObjectWrapper commerceAccountOrganizationRelPK) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			mangleWrapper(_params, "commerceAccountOrganizationRelPK", "com.liferay.commerce.account.service.persistence.CommerceAccountOrganizationRelPK", commerceAccountOrganizationRelPK);

			_command.put("/commerce.commerceaccountorganizationrel/get-commerce-account-organization-rel", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONArray getCommerceAccountOrganizationRels(long commerceAccountId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);

			_command.put("/commerce.commerceaccountorganizationrel/get-commerce-account-organization-rels", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getCommerceAccountOrganizationRels(long commerceAccountId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);
			_params.put("end", end);
			_params.put("start", start);

			_command.put("/commerce.commerceaccountorganizationrel/get-commerce-account-organization-rels", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getCommerceAccountOrganizationRelsByOrganizationId(long organizationId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("organizationId", organizationId);
			_params.put("start", start);

			_command.put("/commerce.commerceaccountorganizationrel/get-commerce-account-organization-rels-by-organization-id", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public Integer getCommerceAccountOrganizationRelsByOrganizationIdCount(long organizationId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("organizationId", organizationId);

			_command.put("/commerce.commerceaccountorganizationrel/get-commerce-account-organization-rels-by-organization-id-count", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public Integer getCommerceAccountOrganizationRelsCount(long commerceAccountId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);

			_command.put("/commerce.commerceaccountorganizationrel/get-commerce-account-organization-rels-count", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

}