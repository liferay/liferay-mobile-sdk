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

package com.liferay.mobile.android.v73.commercetaxmethod;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommercetaxmethodService extends BaseService {

	public CommercetaxmethodService(Session session) {
		super(session);
	}

	public JSONObject addCommerceTaxMethod(JSONObject nameMap, JSONObject descriptionMap, String engineKey, boolean percentage, boolean active, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("engineKey", checkNull(engineKey));
			_params.put("nameMap", checkNull(nameMap));
			_params.put("percentage", percentage);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercetaxmethod/add-commerce-tax-method", _params);
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

	public JSONObject addCommerceTaxMethod(long userId, long groupId, JSONObject nameMap, JSONObject descriptionMap, String engineKey, boolean percentage, boolean active) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("engineKey", checkNull(engineKey));
			_params.put("groupId", groupId);
			_params.put("nameMap", checkNull(nameMap));
			_params.put("percentage", percentage);
			_params.put("userId", userId);

			_command.put("/commerce.commercetaxmethod/add-commerce-tax-method", _params);
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

	public JSONObject createCommerceTaxMethod(long groupId, long commerceTaxMethodId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceTaxMethodId", commerceTaxMethodId);
			_params.put("groupId", groupId);

			_command.put("/commerce.commercetaxmethod/create-commerce-tax-method", _params);
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

	public void deleteCommerceTaxMethod(long commerceTaxMethodId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceTaxMethodId", commerceTaxMethodId);

			_command.put("/commerce.commercetaxmethod/delete-commerce-tax-method", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchCommerceTaxMethod(long groupId, String engineKey) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("engineKey", checkNull(engineKey));
			_params.put("groupId", groupId);

			_command.put("/commerce.commercetaxmethod/fetch-commerce-tax-method", _params);
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

	public JSONObject getCommerceTaxMethod(long commerceTaxMethodId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceTaxMethodId", commerceTaxMethodId);

			_command.put("/commerce.commercetaxmethod/get-commerce-tax-method", _params);
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

	public JSONArray getCommerceTaxMethods(long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);

			_command.put("/commerce.commercetaxmethod/get-commerce-tax-methods", _params);
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

	public JSONArray getCommerceTaxMethods(long groupId, boolean active) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("groupId", groupId);

			_command.put("/commerce.commercetaxmethod/get-commerce-tax-methods", _params);
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

	public JSONObject setActive(long commerceTaxMethodId, boolean active) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("commerceTaxMethodId", commerceTaxMethodId);

			_command.put("/commerce.commercetaxmethod/set-active", _params);
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

	public JSONObject updateCommerceTaxMethod(long commerceTaxMethodId, JSONObject nameMap, JSONObject descriptionMap, boolean percentage, boolean active) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("commerceTaxMethodId", commerceTaxMethodId);
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("nameMap", checkNull(nameMap));
			_params.put("percentage", percentage);

			_command.put("/commerce.commercetaxmethod/update-commerce-tax-method", _params);
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

}