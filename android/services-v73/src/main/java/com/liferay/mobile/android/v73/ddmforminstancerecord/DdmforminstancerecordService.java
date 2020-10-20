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

package com.liferay.mobile.android.v73.ddmforminstancerecord;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class DdmforminstancerecordService extends BaseService {

	public DdmforminstancerecordService(Session session) {
		super(session);
	}

	public JSONObject addFormInstanceRecord(long groupId, long ddmFormInstanceId, JSONObjectWrapper ddmFormValues, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmFormInstanceId", ddmFormInstanceId);
			_params.put("groupId", groupId);
			mangleWrapper(_params, "ddmFormValues", "com.liferay.dynamic.data.mapping.storage.DDMFormValues", ddmFormValues);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/ddm.ddmforminstancerecord/add-form-instance-record", _params);
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

	public void deleteFormInstanceRecord(long ddmFormInstanceRecordId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmFormInstanceRecordId", ddmFormInstanceRecordId);

			_command.put("/ddm.ddmforminstancerecord/delete-form-instance-record", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject getFormInstanceRecord(long ddmFormInstanceRecordId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmFormInstanceRecordId", ddmFormInstanceRecordId);

			_command.put("/ddm.ddmforminstancerecord/get-form-instance-record", _params);
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

	public JSONArray getFormInstanceRecords(long ddmFormInstanceId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmFormInstanceId", ddmFormInstanceId);

			_command.put("/ddm.ddmforminstancerecord/get-form-instance-records", _params);
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

	public JSONArray getFormInstanceRecords(long ddmFormInstanceId, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmFormInstanceId", ddmFormInstanceId);
			_params.put("end", end);
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.dynamic.data.mapping.model.DDMFormInstanceRecord>", orderByComparator);

			_command.put("/ddm.ddmforminstancerecord/get-form-instance-records", _params);
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

	public Integer getFormInstanceRecordsCount(long ddmFormInstanceId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmFormInstanceId", ddmFormInstanceId);

			_command.put("/ddm.ddmforminstancerecord/get-form-instance-records-count", _params);
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

	public void revertFormInstanceRecord(long ddmFormInstanceRecordId, String version, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmFormInstanceRecordId", ddmFormInstanceRecordId);
			_params.put("version", checkNull(version));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/ddm.ddmforminstancerecord/revert-form-instance-record", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject searchFormInstanceRecords(long ddmFormInstanceId, JSONArray notEmptyFields, int status, int start, int end, JSONObjectWrapper sort) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmFormInstanceId", ddmFormInstanceId);
			_params.put("end", end);
			_params.put("notEmptyFields", checkNull(notEmptyFields));
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "sort", "com.liferay.portal.kernel.search.Sort", sort);

			_command.put("/ddm.ddmforminstancerecord/search-form-instance-records", _params);
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

	public JSONObject updateFormInstanceRecord(long ddmFormInstanceRecordId, boolean majorVersion, JSONObjectWrapper ddmFormValues, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmFormInstanceRecordId", ddmFormInstanceRecordId);
			_params.put("majorVersion", majorVersion);
			mangleWrapper(_params, "ddmFormValues", "com.liferay.dynamic.data.mapping.storage.DDMFormValues", ddmFormValues);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/ddm.ddmforminstancerecord/update-form-instance-record", _params);
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