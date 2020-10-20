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

package com.liferay.mobile.android.v73.source;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class SourceService extends BaseService {

	public SourceService(Session session) {
		super(session);
	}

	public JSONObject addSource(long groupId, JSONObject nameMap, String driverClassName, String driverUrl, String driverUserName, String driverPassword, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("driverClassName", checkNull(driverClassName));
			_params.put("driverPassword", checkNull(driverPassword));
			_params.put("driverUrl", checkNull(driverUrl));
			_params.put("driverUserName", checkNull(driverUserName));
			_params.put("groupId", groupId);
			_params.put("nameMap", checkNull(nameMap));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/reports.source/add-source", _params);
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

	public JSONObject deleteSource(long sourceId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("sourceId", sourceId);

			_command.put("/reports.source/delete-source", _params);
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

	public JSONObject getSource(long sourceId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("sourceId", sourceId);

			_command.put("/reports.source/get-source", _params);
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

	public JSONArray getSources(long groupId, String name, String driverUrl, boolean andSearch, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("andSearch", andSearch);
			_params.put("driverUrl", checkNull(driverUrl));
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.portal.reports.engine.console.model.Source>", orderByComparator);

			_command.put("/reports.source/get-sources", _params);
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

	public Integer getSourcesCount(long groupId, String name, String driverUrl, boolean andSearch) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("andSearch", andSearch);
			_params.put("driverUrl", checkNull(driverUrl));
			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));

			_command.put("/reports.source/get-sources-count", _params);
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

	public JSONObject updateSource(long sourceId, JSONObject nameMap, String driverClassName, String driverUrl, String driverUserName, String driverPassword, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("driverClassName", checkNull(driverClassName));
			_params.put("driverPassword", checkNull(driverPassword));
			_params.put("driverUrl", checkNull(driverUrl));
			_params.put("driverUserName", checkNull(driverUserName));
			_params.put("nameMap", checkNull(nameMap));
			_params.put("sourceId", sourceId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/reports.source/update-source", _params);
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