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

package com.liferay.mobile.android.v62.scframeworkversion;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class SCFrameworkVersionService extends BaseService {

	public SCFrameworkVersionService(Session session) {
		super(session);
	}

	public JSONObject addFrameworkVersion(String name, String url, boolean active, int priority, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("name", name);
			_params.put("url", url);
			_params.put("active", active);
			_params.put("priority", priority);
			_params.put("serviceContext", serviceContext);

			_command.put("/scframeworkversion/add-framework-version", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void deleteFrameworkVersion(long frameworkVersionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("frameworkVersionId", frameworkVersionId);

			_command.put("/scframeworkversion/delete-framework-version", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject getFrameworkVersion(long frameworkVersionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("frameworkVersionId", frameworkVersionId);

			_command.put("/scframeworkversion/get-framework-version", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONArray getFrameworkVersions(long groupId, boolean active) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("active", active);

			_command.put("/scframeworkversion/get-framework-versions", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getFrameworkVersions(long groupId, boolean active, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("active", active);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/scframeworkversion/get-framework-versions", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONObject updateFrameworkVersion(long frameworkVersionId, String name, String url, boolean active, int priority) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("frameworkVersionId", frameworkVersionId);
			_params.put("name", name);
			_params.put("url", url);
			_params.put("active", active);
			_params.put("priority", priority);

			_command.put("/scframeworkversion/update-framework-version", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

}