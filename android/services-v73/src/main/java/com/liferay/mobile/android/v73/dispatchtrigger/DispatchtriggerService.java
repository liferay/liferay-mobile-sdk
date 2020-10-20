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

package com.liferay.mobile.android.v73.dispatchtrigger;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class DispatchtriggerService extends BaseService {

	public DispatchtriggerService(Session session) {
		super(session);
	}

	public JSONObject addDispatchTrigger(long userId, String name, JSONObject taskSettingsUnicodeProperties, String taskType) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("name", checkNull(name));
			_params.put("taskSettingsUnicodeProperties", checkNull(taskSettingsUnicodeProperties));
			_params.put("taskType", checkNull(taskType));
			_params.put("userId", userId);

			_command.put("/dispatch.dispatchtrigger/add-dispatch-trigger", _params);
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

	public void deleteDispatchTrigger(long dispatchTriggerId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("dispatchTriggerId", dispatchTriggerId);

			_command.put("/dispatch.dispatchtrigger/delete-dispatch-trigger", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONArray getDispatchTriggers(int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("start", start);

			_command.put("/dispatch.dispatchtrigger/get-dispatch-triggers", _params);
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

	public Integer getDispatchTriggersCount() throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_command.put("/dispatch.dispatchtrigger/get-dispatch-triggers-count", _params);
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

	public JSONObject updateDispatchTrigger(long dispatchTriggerId, boolean active, String cronExpression, int endDateMonth, int endDateDay, int endDateYear, int endDateHour, int endDateMinute, boolean neverEnd, boolean overlapAllowed, int startDateMonth, int startDateDay, int startDateYear, int startDateHour, int startDateMinute) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("cronExpression", checkNull(cronExpression));
			_params.put("dispatchTriggerId", dispatchTriggerId);
			_params.put("endDateDay", endDateDay);
			_params.put("endDateHour", endDateHour);
			_params.put("endDateMinute", endDateMinute);
			_params.put("endDateMonth", endDateMonth);
			_params.put("endDateYear", endDateYear);
			_params.put("neverEnd", neverEnd);
			_params.put("overlapAllowed", overlapAllowed);
			_params.put("startDateDay", startDateDay);
			_params.put("startDateHour", startDateHour);
			_params.put("startDateMinute", startDateMinute);
			_params.put("startDateMonth", startDateMonth);
			_params.put("startDateYear", startDateYear);

			_command.put("/dispatch.dispatchtrigger/update-dispatch-trigger", _params);
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

	public JSONObject updateDispatchTrigger(long dispatchTriggerId, String name, JSONObject taskSettingsUnicodeProperties) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("dispatchTriggerId", dispatchTriggerId);
			_params.put("name", checkNull(name));
			_params.put("taskSettingsUnicodeProperties", checkNull(taskSettingsUnicodeProperties));

			_command.put("/dispatch.dispatchtrigger/update-dispatch-trigger", _params);
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