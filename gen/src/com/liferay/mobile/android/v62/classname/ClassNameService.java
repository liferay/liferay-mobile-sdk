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

package com.liferay.mobile.android.v62.classname;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.ServiceContext;
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class ClassNameService extends BaseService {
	public ClassNameService(ServiceContext context) {
		super(context);
	}

	public ClassNameService(ServiceContext context, AsyncTaskCallback callback) {
		super(context, callback);
	}

	public ClassNameService(ServiceContext context, boolean batch) {
		super(context, batch);
	}

	public JSONObject fetchClassName(String value) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("value", value);

			_command.put("/classname/fetch-class-name", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public Long fetchClassNameId(String value) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("value", value);

			_command.put("/classname/fetch-class-name-id", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Long)post(_command);
	}
}