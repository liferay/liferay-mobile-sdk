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

package com.liferay.mobile.android.v71.ddmforminstancerecordversion;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class DdmforminstancerecordversionService extends BaseService {

	public DdmforminstancerecordversionService(Session session) {
		super(session);
	}

	public JSONObject getFormInstanceRecordVersion(long ddmFormInstanceRecordVersionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmFormInstanceRecordVersionId", ddmFormInstanceRecordVersionId);

			_command.put("/ddm.ddmforminstancerecordversion/get-form-instance-record-version", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject getFormInstanceRecordVersion(long ddmFormInstanceRecordId, String version) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmFormInstanceRecordId", ddmFormInstanceRecordId);
			_params.put("version", checkNull(version));

			_command.put("/ddm.ddmforminstancerecordversion/get-form-instance-record-version", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONArray getFormInstanceRecordVersions(long ddmFormInstanceRecordId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmFormInstanceRecordId", ddmFormInstanceRecordId);

			_command.put("/ddm.ddmforminstancerecordversion/get-form-instance-record-versions", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getFormInstanceRecordVersions(long ddmFormInstanceRecordId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmFormInstanceRecordId", ddmFormInstanceRecordId);
			_params.put("start", start);
			_params.put("end", end);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.dynamic.data.mapping.model.DDMFormInstanceRecordVersion>", orderByComparator);

			_command.put("/ddm.ddmforminstancerecordversion/get-form-instance-record-versions", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public Integer getFormInstanceRecordVersionsCount(long ddmFormInstanceRecordId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmFormInstanceRecordId", ddmFormInstanceRecordId);

			_command.put("/ddm.ddmforminstancerecordversion/get-form-instance-record-versions-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

}