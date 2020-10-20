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

package com.liferay.mobile.android.v73.definition;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class DefinitionService extends BaseService {

	public DefinitionService(Session session) {
		super(session);
	}

	public JSONObject deleteDefinition(long definitionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("definitionId", definitionId);

			_command.put("/reports.definition/delete-definition", _params);
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

	public JSONObject getDefinition(long definitionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("definitionId", definitionId);

			_command.put("/reports.definition/get-definition", _params);
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

	public JSONArray getDefinitions(long groupId, String definitionName, String description, String sourceId, String reportName, boolean andSearch, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("andSearch", andSearch);
			_params.put("definitionName", checkNull(definitionName));
			_params.put("description", checkNull(description));
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("reportName", checkNull(reportName));
			_params.put("sourceId", checkNull(sourceId));
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.portal.reports.engine.console.model.Definition>", orderByComparator);

			_command.put("/reports.definition/get-definitions", _params);
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

	public Integer getDefinitionsCount(long groupId, String definitionName, String description, String sourceId, String reportName, boolean andSearch) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("andSearch", andSearch);
			_params.put("definitionName", checkNull(definitionName));
			_params.put("description", checkNull(description));
			_params.put("groupId", groupId);
			_params.put("reportName", checkNull(reportName));
			_params.put("sourceId", checkNull(sourceId));

			_command.put("/reports.definition/get-definitions-count", _params);
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

}