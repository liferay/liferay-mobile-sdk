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

package com.liferay.mobile.android.v62.ddlrecord;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class DDLRecordService extends BaseService {
	public DDLRecordService(Session session) {
		super(session);
	}

	public JSONObject addRecord(long groupId, long recordSetId, int displayIndex, JSONObject fieldsMap, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("recordSetId", recordSetId);
			_params.put("displayIndex", displayIndex);
			_params.put("fieldsMap", fieldsMap);
			_params.put("serviceContext", serviceContext);

			_command.put("/ddlrecord/add-record", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject deleteRecordLocale(long recordId, String locale, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("recordId", recordId);
			_params.put("locale", locale);
			_params.put("serviceContext", serviceContext);

			_command.put("/ddlrecord/delete-record-locale", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject getRecord(long recordId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("recordId", recordId);

			_command.put("/ddlrecord/get-record", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updateRecord(long recordId, int displayIndex, JSONObject fieldsMap, boolean mergeFields, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("recordId", recordId);
			_params.put("displayIndex", displayIndex);
			_params.put("fieldsMap", fieldsMap);
			_params.put("mergeFields", mergeFields);
			_params.put("serviceContext", serviceContext);

			_command.put("/ddlrecord/update-record", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updateRecord(long recordId, boolean majorVersion, int displayIndex, JSONObject fields, boolean mergeFields, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("recordId", recordId);
			_params.put("majorVersion", majorVersion);
			_params.put("displayIndex", displayIndex);
			_params.put("fields", fields);
			_params.put("mergeFields", mergeFields);
			_params.put("serviceContext", serviceContext);

			_command.put("/ddlrecord/update-record", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

}