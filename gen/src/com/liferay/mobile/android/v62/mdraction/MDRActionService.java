/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.mobile.android.v62.mdraction;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class MDRActionService extends BaseService {
	public MDRActionService(Session session) {
		super(session);
	}

	public MDRActionService(Session session, AsyncTaskCallback callback) {
		super(session, callback);
	}

	public MDRActionService(Session session, boolean batch) {
		super(session, batch);
	}

	public JSONObject addAction(long ruleGroupInstanceId, JSONObject nameMap,
		JSONObject descriptionMap, String type,
		JSONObject typeSettingsProperties, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ruleGroupInstanceId", ruleGroupInstanceId);
			_params.put("nameMap", nameMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("type", type);
			_params.put("typeSettingsProperties", typeSettingsProperties);
			_params.put("serviceContext", serviceContext);

			_command.put("/mdraction/add-action", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public void deleteAction(long actionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("actionId", actionId);

			_command.put("/mdraction/delete-action", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		post(_command);
	}

	public JSONObject fetchAction(long actionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("actionId", actionId);

			_command.put("/mdraction/fetch-action", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONObject getAction(long actionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("actionId", actionId);

			_command.put("/mdraction/get-action", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONObject updateAction(long actionId, JSONObject nameMap,
		JSONObject descriptionMap, String type,
		JSONObject typeSettingsProperties, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("actionId", actionId);
			_params.put("nameMap", nameMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("type", type);
			_params.put("typeSettingsProperties", typeSettingsProperties);
			_params.put("serviceContext", serviceContext);

			_command.put("/mdraction/update-action", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}
}