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

package com.liferay.mobile.android.v62.mdrrule;

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

			_params.put("ruleGroupId", ruleGroupId);
			_params.put("nameMap", nameMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("type", type);
			_params.put("typeSettings", typeSettings);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/mdrrule/add-rule", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return session.invoke(_command).getJSONObject(0);
	}

	public void deleteRule(long ruleId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ruleId", ruleId);

			_command.put("/mdrrule/delete-rule", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject fetchRule(long ruleId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ruleId", ruleId);

			_command.put("/mdrrule/fetch-rule", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return session.invoke(_command).getJSONObject(0);
	}

	public JSONObject getRule(long ruleId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ruleId", ruleId);

			_command.put("/mdrrule/get-rule", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return session.invoke(_command).getJSONObject(0);
	}

	public JSONObject updateRule(long ruleId, JSONObject nameMap, JSONObject descriptionMap, String type, String typeSettings, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ruleId", ruleId);
			_params.put("nameMap", nameMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("type", type);
			_params.put("typeSettings", typeSettings);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/mdrrule/update-rule", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return session.invoke(_command).getJSONObject(0);
	}

	public JSONObject updateRule(long ruleId, JSONObject nameMap, JSONObject descriptionMap, String type, JSONObjectWrapper typeSettingsProperties, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ruleId", ruleId);
			_params.put("nameMap", nameMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("type", type);
			mangleWrapper(_params, "typeSettingsProperties", "com.liferay.portal.kernel.util.UnicodeProperties", typeSettingsProperties);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/mdrrule/update-rule", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return session.invoke(_command).getJSONObject(0);
	}

}