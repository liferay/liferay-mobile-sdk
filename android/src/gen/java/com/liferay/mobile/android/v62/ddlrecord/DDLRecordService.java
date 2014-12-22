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
import com.liferay.mobile.android.service.JSONObjectWrapper;
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

	public JSONObject addRecord(long groupId, long recordSetId, int displayIndex, JSONObject fieldsMap, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("recordSetId", recordSetId);
			_params.put("displayIndex", displayIndex);
			_params.put("fieldsMap", fieldsMap);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/ddlrecord/add-record", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return session.invoke(_command).getJSONObject(0);
	}

	public void deleteRecord(long recordId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("recordId", recordId);

			_command.put("/ddlrecord/delete-record", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject deleteRecordLocale(long recordId, String locale, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("recordId", recordId);
			_params.put("locale", locale);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/ddlrecord/delete-record-locale", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return session.invoke(_command).getJSONObject(0);
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

		return session.invoke(_command).getJSONObject(0);
	}

	public void revertRecordVersion(long recordId, String version, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("recordId", recordId);
			_params.put("version", version);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/ddlrecord/revert-record-version", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject updateRecord(long recordId, int displayIndex, JSONObject fieldsMap, boolean mergeFields, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("recordId", recordId);
			_params.put("displayIndex", displayIndex);
			_params.put("fieldsMap", fieldsMap);
			_params.put("mergeFields", mergeFields);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/ddlrecord/update-record", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return session.invoke(_command).getJSONObject(0);
	}

	public JSONObject updateRecord(long recordId, boolean majorVersion, int displayIndex, JSONObjectWrapper fields, boolean mergeFields, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("recordId", recordId);
			_params.put("majorVersion", majorVersion);
			_params.put("displayIndex", displayIndex);
			mangleWrapper(_params, "fields", "com.liferay.portlet.dynamicdatamapping.storage.Fields", fields);
			_params.put("mergeFields", mergeFields);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/ddlrecord/update-record", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return session.invoke(_command).getJSONObject(0);
	}

}