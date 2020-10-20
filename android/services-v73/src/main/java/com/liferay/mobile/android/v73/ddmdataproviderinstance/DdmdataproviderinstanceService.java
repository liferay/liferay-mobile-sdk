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

package com.liferay.mobile.android.v73.ddmdataproviderinstance;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class DdmdataproviderinstanceService extends BaseService {

	public DdmdataproviderinstanceService(Session session) {
		super(session);
	}

	public JSONObject addDataProviderInstance(long groupId, JSONObject nameMap, JSONObject descriptionMap, JSONObjectWrapper ddmFormValues, String type, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("groupId", groupId);
			_params.put("nameMap", checkNull(nameMap));
			mangleWrapper(_params, "ddmFormValues", "com.liferay.dynamic.data.mapping.storage.DDMFormValues", ddmFormValues);
			_params.put("type", checkNull(type));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/ddm.ddmdataproviderinstance/add-data-provider-instance", _params);
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

	public void deleteDataProviderInstance(long dataProviderInstanceId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("dataProviderInstanceId", dataProviderInstanceId);

			_command.put("/ddm.ddmdataproviderinstance/delete-data-provider-instance", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchDataProviderInstance(long dataProviderInstanceId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("dataProviderInstanceId", dataProviderInstanceId);

			_command.put("/ddm.ddmdataproviderinstance/fetch-data-provider-instance", _params);
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

	public JSONObject fetchDataProviderInstanceByUuid(String uuid) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("uuid", checkNull(uuid));

			_command.put("/ddm.ddmdataproviderinstance/fetch-data-provider-instance-by-uuid", _params);
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

	public JSONObject getDataProviderInstance(long dataProviderInstanceId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("dataProviderInstanceId", dataProviderInstanceId);

			_command.put("/ddm.ddmdataproviderinstance/get-data-provider-instance", _params);
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

	public JSONObject getDataProviderInstanceByUuid(String uuid) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("uuid", checkNull(uuid));

			_command.put("/ddm.ddmdataproviderinstance/get-data-provider-instance-by-uuid", _params);
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

	public JSONArray getDataProviderInstances(long companyId, JSONArray groupIds, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("groupIds", checkNull(groupIds));
			_params.put("start", start);

			_command.put("/ddm.ddmdataproviderinstance/get-data-provider-instances", _params);
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

	public Integer getDataProviderInstancesCount(long companyId, JSONArray groupIds) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupIds", checkNull(groupIds));

			_command.put("/ddm.ddmdataproviderinstance/get-data-provider-instances-count", _params);
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

	public JSONArray search(long companyId, JSONArray groupIds, String keywords, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("groupIds", checkNull(groupIds));
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.dynamic.data.mapping.model.DDMDataProviderInstance>", orderByComparator);

			_command.put("/ddm.ddmdataproviderinstance/search", _params);
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

	public JSONArray search(long companyId, JSONArray groupIds, String name, String description, boolean andOperator, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("andOperator", andOperator);
			_params.put("companyId", companyId);
			_params.put("description", checkNull(description));
			_params.put("end", end);
			_params.put("groupIds", checkNull(groupIds));
			_params.put("name", checkNull(name));
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.dynamic.data.mapping.model.DDMDataProviderInstance>", orderByComparator);

			_command.put("/ddm.ddmdataproviderinstance/search", _params);
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

	public Integer searchCount(long companyId, JSONArray groupIds, String keywords) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupIds", checkNull(groupIds));
			_params.put("keywords", checkNull(keywords));

			_command.put("/ddm.ddmdataproviderinstance/search-count", _params);
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

	public Integer searchCount(long companyId, JSONArray groupIds, String name, String description, boolean andOperator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("andOperator", andOperator);
			_params.put("companyId", companyId);
			_params.put("description", checkNull(description));
			_params.put("groupIds", checkNull(groupIds));
			_params.put("name", checkNull(name));

			_command.put("/ddm.ddmdataproviderinstance/search-count", _params);
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

	public JSONObject updateDataProviderInstance(long dataProviderInstanceId, JSONObject nameMap, JSONObject descriptionMap, JSONObjectWrapper ddmFormValues, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("dataProviderInstanceId", dataProviderInstanceId);
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("nameMap", checkNull(nameMap));
			mangleWrapper(_params, "ddmFormValues", "com.liferay.dynamic.data.mapping.storage.DDMFormValues", ddmFormValues);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/ddm.ddmdataproviderinstance/update-data-provider-instance", _params);
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