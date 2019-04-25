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

package com.liferay.mobile.android.v72.tasksentry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class TasksentryService extends BaseService {

	public TasksentryService(Session session) {
		super(session);
	}

	public JSONObject addTasksEntry(String title, int priority, long assigneeUserId, int dueDateMonth, int dueDateDay, int dueDateYear, int dueDateHour, int dueDateMinute, boolean neverDue, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("assigneeUserId", assigneeUserId);
			_params.put("dueDateDay", dueDateDay);
			_params.put("dueDateHour", dueDateHour);
			_params.put("dueDateMinute", dueDateMinute);
			_params.put("dueDateMonth", dueDateMonth);
			_params.put("dueDateYear", dueDateYear);
			_params.put("neverDue", neverDue);
			_params.put("priority", priority);
			_params.put("title", checkNull(title));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/tasks-portlet.tasksentry/add-tasks-entry", _params);
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

	public JSONObject deleteTasksEntry(long tasksEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("tasksEntryId", tasksEntryId);

			_command.put("/tasks-portlet.tasksentry/delete-tasks-entry", _params);
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

	public JSONObject getTasksEntry(long tasksEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("tasksEntryId", tasksEntryId);

			_command.put("/tasks-portlet.tasksentry/get-tasks-entry", _params);
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

	public JSONObject updateTasksEntry(long tasksEntryId, String title, int priority, long assigneeUserId, long resolverUserId, int dueDateMonth, int dueDateDay, int dueDateYear, int dueDateHour, int dueDateMinute, boolean neverDue, int status, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("assigneeUserId", assigneeUserId);
			_params.put("dueDateDay", dueDateDay);
			_params.put("dueDateHour", dueDateHour);
			_params.put("dueDateMinute", dueDateMinute);
			_params.put("dueDateMonth", dueDateMonth);
			_params.put("dueDateYear", dueDateYear);
			_params.put("neverDue", neverDue);
			_params.put("priority", priority);
			_params.put("resolverUserId", resolverUserId);
			_params.put("status", status);
			_params.put("tasksEntryId", tasksEntryId);
			_params.put("title", checkNull(title));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/tasks-portlet.tasksentry/update-tasks-entry", _params);
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

	public JSONObject updateTasksEntryStatus(long tasksEntryId, long resolverUserId, int status, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("resolverUserId", resolverUserId);
			_params.put("status", status);
			_params.put("tasksEntryId", tasksEntryId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/tasks-portlet.tasksentry/update-tasks-entry-status", _params);
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