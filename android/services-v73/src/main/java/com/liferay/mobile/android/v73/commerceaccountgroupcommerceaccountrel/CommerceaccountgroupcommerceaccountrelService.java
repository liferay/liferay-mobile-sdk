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

package com.liferay.mobile.android.v73.commerceaccountgroupcommerceaccountrel;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommerceaccountgroupcommerceaccountrelService extends BaseService {

	public CommerceaccountgroupcommerceaccountrelService(Session session) {
		super(session);
	}

	public JSONObject addCommerceAccountGroupCommerceAccountRel(long commerceAccountGroupId, long commerceAccountId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountGroupId", commerceAccountGroupId);
			_params.put("commerceAccountId", commerceAccountId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceaccountgroupcommerceaccountrel/add-commerce-account-group-commerce-account-rel", _params);
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

	public void deleteCommerceAccountGroupCommerceAccountRel(long commerceAccountGroupCommerceAccountRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountGroupCommerceAccountRelId", commerceAccountGroupCommerceAccountRelId);

			_command.put("/commerce.commerceaccountgroupcommerceaccountrel/delete-commerce-account-group-commerce-account-rel", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject getCommerceAccountGroupCommerceAccountRel(long commerceAccountGroupId, long commerceAccountId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountGroupId", commerceAccountGroupId);
			_params.put("commerceAccountId", commerceAccountId);

			_command.put("/commerce.commerceaccountgroupcommerceaccountrel/get-commerce-account-group-commerce-account-rel", _params);
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

	public JSONArray getCommerceAccountGroupCommerceAccountRels(long commerceAccountGroupId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountGroupId", commerceAccountGroupId);
			_params.put("end", end);
			_params.put("start", start);

			_command.put("/commerce.commerceaccountgroupcommerceaccountrel/get-commerce-account-group-commerce-account-rels", _params);
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

	public Integer getCommerceAccountGroupCommerceAccountRelsCount(long commerceAccountGroupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountGroupId", commerceAccountGroupId);

			_command.put("/commerce.commerceaccountgroupcommerceaccountrel/get-commerce-account-group-commerce-account-rels-count", _params);
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