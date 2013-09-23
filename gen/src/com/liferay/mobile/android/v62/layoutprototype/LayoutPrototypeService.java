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

package com.liferay.mobile.android.v62.layoutprototype;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.ServiceContext;
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class LayoutPrototypeService extends BaseService {
	public LayoutPrototypeService(ServiceContext context) {
		super(context);
	}

	public LayoutPrototypeService(ServiceContext context,
		AsyncTaskCallback callback) {
		super(context, callback);
	}

	public LayoutPrototypeService(ServiceContext context, boolean batch) {
		super(context, batch);
	}

	public JSONObject addLayoutPrototype(JSONObject nameMap,
		String description, boolean active, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nameMap", nameMap);
			_params.put("description", description);
			_params.put("active", active);
			_params.put("serviceContext", serviceContext);

			_command.put("/layoutprototype/add-layout-prototype", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public void deleteLayoutPrototype(long layoutPrototypeId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("layoutPrototypeId", layoutPrototypeId);

			_command.put("/layoutprototype/delete-layout-prototype", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		post(_command);
	}

	public JSONObject getLayoutPrototype(long layoutPrototypeId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("layoutPrototypeId", layoutPrototypeId);

			_command.put("/layoutprototype/get-layout-prototype", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONArray search(long companyId, JSONObject active, JSONObject obc)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("active", active);
			_params.put("obc", obc);

			_command.put("/layoutprototype/search", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public JSONObject updateLayoutPrototype(long layoutPrototypeId,
		JSONObject nameMap, String description, boolean active,
		JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("layoutPrototypeId", layoutPrototypeId);
			_params.put("nameMap", nameMap);
			_params.put("description", description);
			_params.put("active", active);
			_params.put("serviceContext", serviceContext);

			_command.put("/layoutprototype/update-layout-prototype", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}
}