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

package com.liferay.mobile.android.v73.mdrrule;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class MDRRuleService extends BaseService {

	public MDRRuleService(Session session) {
		super(session);
	}

	public JSONObject addRule(long ruleGroupId, JSONObject nameMap, JSONObject descriptionMap, String type, String typeSettings, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("nameMap", checkNull(nameMap));
			_params.put("ruleGroupId", ruleGroupId);
			_params.put("type", checkNull(type));
			_params.put("typeSettings", checkNull(typeSettings));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/mdr.mdrrule/add-rule", _params);
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

	public void deleteRule(long ruleId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ruleId", ruleId);

			_command.put("/mdr.mdrrule/delete-rule", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchRule(long ruleId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ruleId", ruleId);

			_command.put("/mdr.mdrrule/fetch-rule", _params);
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

	public JSONObject getRule(long ruleId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ruleId", ruleId);

			_command.put("/mdr.mdrrule/get-rule", _params);
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

	public JSONObject updateRule(long ruleId, JSONObject nameMap, JSONObject descriptionMap, String type, JSONObject typeSettingsUnicodeProperties, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("nameMap", checkNull(nameMap));
			_params.put("ruleId", ruleId);
			_params.put("type", checkNull(type));
			_params.put("typeSettingsUnicodeProperties", checkNull(typeSettingsUnicodeProperties));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/mdr.mdrrule/update-rule", _params);
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

	public JSONObject updateRule(long ruleId, JSONObject nameMap, JSONObject descriptionMap, String type, String typeSettings, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("nameMap", checkNull(nameMap));
			_params.put("ruleId", ruleId);
			_params.put("type", checkNull(type));
			_params.put("typeSettings", checkNull(typeSettings));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/mdr.mdrrule/update-rule", _params);
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