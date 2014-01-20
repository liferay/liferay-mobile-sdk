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

package com.liferay.mobile.android.v62.ddlrecordset;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class DDLRecordSetService extends BaseService {
	public DDLRecordSetService(Session session) {
		super(session);
	}

	public JSONObject addRecordSet(long groupId, long ddmStructureId,
		String recordSetKey, JSONObject nameMap, JSONObject descriptionMap,
		int minDisplayRows, int scope, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("ddmStructureId", ddmStructureId);
			_params.put("recordSetKey", recordSetKey);
			_params.put("nameMap", nameMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("minDisplayRows", minDisplayRows);
			_params.put("scope", scope);
			_params.put("serviceContext", serviceContext);

			_command.put("/ddlrecordset/add-record-set", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void deleteRecordSet(long recordSetId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("recordSetId", recordSetId);

			_command.put("/ddlrecordset/delete-record-set", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject getRecordSet(long recordSetId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("recordSetId", recordSetId);

			_command.put("/ddlrecordset/get-record-set", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONArray search(long companyId, long groupId, String keywords,
		int scope, int start, int end, JSONObject orderByComparator)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupId", groupId);
			_params.put("keywords", keywords);
			_params.put("scope", scope);
			_params.put("start", start);
			_params.put("end", end);
			_params.put("orderByComparator", orderByComparator);

			_command.put("/ddlrecordset/search", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray search(long companyId, long groupId, String name,
		String description, int scope, boolean andOperator, int start, int end,
		JSONObject orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupId", groupId);
			_params.put("name", name);
			_params.put("description", description);
			_params.put("scope", scope);
			_params.put("andOperator", andOperator);
			_params.put("start", start);
			_params.put("end", end);
			_params.put("orderByComparator", orderByComparator);

			_command.put("/ddlrecordset/search", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer searchCount(long companyId, long groupId, String keywords,
		int scope) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupId", groupId);
			_params.put("keywords", keywords);
			_params.put("scope", scope);

			_command.put("/ddlrecordset/search-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public Integer searchCount(long companyId, long groupId, String name,
		String description, int scope, boolean andOperator)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupId", groupId);
			_params.put("name", name);
			_params.put("description", description);
			_params.put("scope", scope);
			_params.put("andOperator", andOperator);

			_command.put("/ddlrecordset/search-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONObject updateMinDisplayRows(long recordSetId,
		int minDisplayRows, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("recordSetId", recordSetId);
			_params.put("minDisplayRows", minDisplayRows);
			_params.put("serviceContext", serviceContext);

			_command.put("/ddlrecordset/update-min-display-rows", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updateRecordSet(long recordSetId, long ddmStructureId,
		JSONObject nameMap, JSONObject descriptionMap, int minDisplayRows,
		JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("recordSetId", recordSetId);
			_params.put("ddmStructureId", ddmStructureId);
			_params.put("nameMap", nameMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("minDisplayRows", minDisplayRows);
			_params.put("serviceContext", serviceContext);

			_command.put("/ddlrecordset/update-record-set", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updateRecordSet(long groupId, long ddmStructureId,
		String recordSetKey, JSONObject nameMap, JSONObject descriptionMap,
		int minDisplayRows, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("ddmStructureId", ddmStructureId);
			_params.put("recordSetKey", recordSetKey);
			_params.put("nameMap", nameMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("minDisplayRows", minDisplayRows);
			_params.put("serviceContext", serviceContext);

			_command.put("/ddlrecordset/update-record-set", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}
}