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

package com.liferay.mobile.android.v73.ddmforminstance;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class DdmforminstanceService extends BaseService {

	public DdmforminstanceService(Session session) {
		super(session);
	}

	public JSONObject addFormInstance(long groupId, JSONObject nameMap, JSONObject descriptionMap, JSONObjectWrapper ddmForm, JSONObjectWrapper ddmFormLayout, JSONObjectWrapper settingsDDMFormValues, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("groupId", groupId);
			_params.put("nameMap", checkNull(nameMap));
			mangleWrapper(_params, "ddmForm", "com.liferay.dynamic.data.mapping.model.DDMForm", ddmForm);
			mangleWrapper(_params, "ddmFormLayout", "com.liferay.dynamic.data.mapping.model.DDMFormLayout", ddmFormLayout);
			mangleWrapper(_params, "settingsDDMFormValues", "com.liferay.dynamic.data.mapping.storage.DDMFormValues", settingsDDMFormValues);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/ddm.ddmforminstance/add-form-instance", _params);
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

	public JSONObject addFormInstance(long groupId, long ddmStructureId, JSONObject nameMap, JSONObject descriptionMap, JSONObjectWrapper settingsDDMFormValues, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmStructureId", ddmStructureId);
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("groupId", groupId);
			_params.put("nameMap", checkNull(nameMap));
			mangleWrapper(_params, "settingsDDMFormValues", "com.liferay.dynamic.data.mapping.storage.DDMFormValues", settingsDDMFormValues);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/ddm.ddmforminstance/add-form-instance", _params);
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

	public JSONObject copyFormInstance(long groupId, JSONObject nameMap, JSONObjectWrapper ddmFormInstance, JSONObjectWrapper settingsDDMFormValues, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("nameMap", checkNull(nameMap));
			mangleWrapper(_params, "ddmFormInstance", "com.liferay.dynamic.data.mapping.model.DDMFormInstance", ddmFormInstance);
			mangleWrapper(_params, "settingsDDMFormValues", "com.liferay.dynamic.data.mapping.storage.DDMFormValues", settingsDDMFormValues);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/ddm.ddmforminstance/copy-form-instance", _params);
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

	public void deleteFormInstance(long ddmFormInstanceId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmFormInstanceId", ddmFormInstanceId);

			_command.put("/ddm.ddmforminstance/delete-form-instance", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchFormInstance(long ddmFormInstanceId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmFormInstanceId", ddmFormInstanceId);

			_command.put("/ddm.ddmforminstance/fetch-form-instance", _params);
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

	public JSONObject getFormInstance(long ddmFormInstanceId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmFormInstanceId", ddmFormInstanceId);

			_command.put("/ddm.ddmforminstance/get-form-instance", _params);
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

	public JSONArray getFormInstances(long companyId, long groupId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);

			_command.put("/ddm.ddmforminstance/get-form-instances", _params);
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

	public Integer getFormInstancesCount(long companyId, long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupId", groupId);

			_command.put("/ddm.ddmforminstance/get-form-instances-count", _params);
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

	public Integer getFormInstancesCount(String uuid) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("uuid", checkNull(uuid));

			_command.put("/ddm.ddmforminstance/get-form-instances-count", _params);
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

	public JSONArray search(long companyId, long groupId, JSONArray names, JSONArray descriptions, boolean andOperator, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("andOperator", andOperator);
			_params.put("companyId", companyId);
			_params.put("descriptions", checkNull(descriptions));
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("names", checkNull(names));
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.dynamic.data.mapping.model.DDMFormInstance>", orderByComparator);

			_command.put("/ddm.ddmforminstance/search", _params);
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

	public JSONArray search(long companyId, long groupId, String keywords, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.dynamic.data.mapping.model.DDMFormInstance>", orderByComparator);

			_command.put("/ddm.ddmforminstance/search", _params);
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

	public JSONArray search(long companyId, long groupId, String keywords, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.dynamic.data.mapping.model.DDMFormInstance>", orderByComparator);

			_command.put("/ddm.ddmforminstance/search", _params);
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

	public Integer searchCount(long companyId, long groupId, JSONArray names, JSONArray descriptions, boolean andOperator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("andOperator", andOperator);
			_params.put("companyId", companyId);
			_params.put("descriptions", checkNull(descriptions));
			_params.put("groupId", groupId);
			_params.put("names", checkNull(names));

			_command.put("/ddm.ddmforminstance/search-count", _params);
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

	public Integer searchCount(long companyId, long groupId, String keywords) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupId", groupId);
			_params.put("keywords", checkNull(keywords));

			_command.put("/ddm.ddmforminstance/search-count", _params);
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

	public Integer searchCount(long companyId, long groupId, String keywords, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupId", groupId);
			_params.put("keywords", checkNull(keywords));
			_params.put("status", status);

			_command.put("/ddm.ddmforminstance/search-count", _params);
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

	public void sendEmail(long formInstanceId, String message, String subject, JSONArray toEmailAddresses) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("formInstanceId", formInstanceId);
			_params.put("message", checkNull(message));
			_params.put("subject", checkNull(subject));
			_params.put("toEmailAddresses", checkNull(toEmailAddresses));

			_command.put("/ddm.ddmforminstance/send-email", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject updateFormInstance(long ddmFormInstanceId, JSONObject nameMap, JSONObject descriptionMap, JSONObjectWrapper ddmForm, JSONObjectWrapper ddmFormLayout, JSONObjectWrapper settingsDDMFormValues, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmFormInstanceId", ddmFormInstanceId);
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("nameMap", checkNull(nameMap));
			mangleWrapper(_params, "ddmForm", "com.liferay.dynamic.data.mapping.model.DDMForm", ddmForm);
			mangleWrapper(_params, "ddmFormLayout", "com.liferay.dynamic.data.mapping.model.DDMFormLayout", ddmFormLayout);
			mangleWrapper(_params, "settingsDDMFormValues", "com.liferay.dynamic.data.mapping.storage.DDMFormValues", settingsDDMFormValues);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/ddm.ddmforminstance/update-form-instance", _params);
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

	public JSONObject updateFormInstance(long formInstanceId, JSONObjectWrapper settingsDDMFormValues) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("formInstanceId", formInstanceId);
			mangleWrapper(_params, "settingsDDMFormValues", "com.liferay.dynamic.data.mapping.storage.DDMFormValues", settingsDDMFormValues);

			_command.put("/ddm.ddmforminstance/update-form-instance", _params);
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