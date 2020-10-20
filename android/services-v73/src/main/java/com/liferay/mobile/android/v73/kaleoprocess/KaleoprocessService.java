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

package com.liferay.mobile.android.v73.kaleoprocess;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class KaleoprocessService extends BaseService {

	public KaleoprocessService(Session session) {
		super(session);
	}

	public JSONObject addKaleoProcess(long groupId, long ddmStructureId, JSONObject nameMap, JSONObject descriptionMap, long ddmTemplateId, String workflowDefinitionName, int workflowDefinitionVersion, JSONObjectWrapper kaleoTaskFormPairs, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmStructureId", ddmStructureId);
			_params.put("ddmTemplateId", ddmTemplateId);
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("groupId", groupId);
			_params.put("nameMap", checkNull(nameMap));
			_params.put("workflowDefinitionName", checkNull(workflowDefinitionName));
			_params.put("workflowDefinitionVersion", workflowDefinitionVersion);
			mangleWrapper(_params, "kaleoTaskFormPairs", "com.liferay.portal.workflow.kaleo.forms.model.KaleoTaskFormPairs", kaleoTaskFormPairs);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/kaleoforms.kaleoprocess/add-kaleo-process", _params);
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

	public JSONObject deleteKaleoProcess(long kaleoProcessId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("kaleoProcessId", kaleoProcessId);

			_command.put("/kaleoforms.kaleoprocess/delete-kaleo-process", _params);
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

	public JSONObject getKaleoProcess(long kaleoProcessId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("kaleoProcessId", kaleoProcessId);

			_command.put("/kaleoforms.kaleoprocess/get-kaleo-process", _params);
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

	public JSONArray search(long groupId, String keywords, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.portal.workflow.kaleo.forms.model.KaleoProcess>", orderByComparator);

			_command.put("/kaleoforms.kaleoprocess/search", _params);
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

	public Integer searchCount(long groupId, String keywords) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("keywords", checkNull(keywords));

			_command.put("/kaleoforms.kaleoprocess/search-count", _params);
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

	public JSONObject updateKaleoProcess(long kaleoProcessId, long ddmStructureId, JSONObject nameMap, JSONObject descriptionMap, long ddmTemplateId, String workflowDefinitionName, int workflowDefinitionVersion, JSONObjectWrapper kaleoTaskFormPairs, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmStructureId", ddmStructureId);
			_params.put("ddmTemplateId", ddmTemplateId);
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("kaleoProcessId", kaleoProcessId);
			_params.put("nameMap", checkNull(nameMap));
			_params.put("workflowDefinitionName", checkNull(workflowDefinitionName));
			_params.put("workflowDefinitionVersion", workflowDefinitionVersion);
			mangleWrapper(_params, "kaleoTaskFormPairs", "com.liferay.portal.workflow.kaleo.forms.model.KaleoTaskFormPairs", kaleoTaskFormPairs);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/kaleoforms.kaleoprocess/update-kaleo-process", _params);
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