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

package com.liferay.mobile.android.v62.expandovalue;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class ExpandoValueService extends BaseService {

	public ExpandoValueService(Session session) {
		super(session);
	}

	public JSONObject addValue(long companyId, String className, String tableName, String columnName, long classPK, String data) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("className", className);
			_params.put("tableName", tableName);
			_params.put("columnName", columnName);
			_params.put("classPK", classPK);
			_params.put("data", data);

			_command.put("/expandovalue/add-value", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return session.invoke(_command).getJSONObject(0);
	}

	public void addValues(long companyId, String className, String tableName, long classPK, JSONObject attributeValues) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("className", className);
			_params.put("tableName", tableName);
			_params.put("classPK", classPK);
			_params.put("attributeValues", attributeValues);

			_command.put("/expandovalue/add-values", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject getData(long companyId, String className, String tableName, String columnName, long classPK) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("className", className);
			_params.put("tableName", tableName);
			_params.put("columnName", columnName);
			_params.put("classPK", classPK);

			_command.put("/expandovalue/get-data", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return session.invoke(_command).getJSONObject(0);
	}

	public JSONObject getData(long companyId, String className, String tableName, JSONObject columnNames, long classPK) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("className", className);
			_params.put("tableName", tableName);
			_params.put("columnNames", columnNames);
			_params.put("classPK", classPK);

			_command.put("/expandovalue/get-data", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return session.invoke(_command).getJSONObject(0);
	}

	public JSONObject getJsonData(long companyId, String className, String tableName, String columnName, long classPK) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("className", className);
			_params.put("tableName", tableName);
			_params.put("columnName", columnName);
			_params.put("classPK", classPK);

			_command.put("/expandovalue/get-json-data", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return session.invoke(_command).getJSONObject(0);
	}

}