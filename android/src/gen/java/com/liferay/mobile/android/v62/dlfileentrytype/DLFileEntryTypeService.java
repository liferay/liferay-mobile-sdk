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

package com.liferay.mobile.android.v62.dlfileentrytype;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class DLFileEntryTypeService extends BaseService {
	public DLFileEntryTypeService(Session session) {
		super(session);
	}

	public JSONObject addFileEntryType(long groupId, String name, String description, JSONArray ddmStructureIds, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("name", name);
			_params.put("description", description);
			_params.put("ddmStructureIds", ddmStructureIds);
			_params.put("serviceContext", serviceContext);

			_command.put("/dlfileentrytype/add-file-entry-type", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject addFileEntryType(long groupId, String fileEntryTypeKey, JSONObject nameMap, JSONObject descriptionMap, JSONArray ddmStructureIds, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("fileEntryTypeKey", fileEntryTypeKey);
			_params.put("nameMap", nameMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("ddmStructureIds", ddmStructureIds);
			_params.put("serviceContext", serviceContext);

			_command.put("/dlfileentrytype/add-file-entry-type", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void deleteFileEntryType(long fileEntryTypeId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fileEntryTypeId", fileEntryTypeId);

			_command.put("/dlfileentrytype/delete-file-entry-type", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject getFileEntryType(long fileEntryTypeId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fileEntryTypeId", fileEntryTypeId);

			_command.put("/dlfileentrytype/get-file-entry-type", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONArray getFileEntryTypes(JSONArray groupIds) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupIds", groupIds);

			_command.put("/dlfileentrytype/get-file-entry-types", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getFileEntryTypes(JSONArray groupIds, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupIds", groupIds);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/dlfileentrytype/get-file-entry-types", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer getFileEntryTypesCount(JSONArray groupIds) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupIds", groupIds);

			_command.put("/dlfileentrytype/get-file-entry-types-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONArray getFolderFileEntryTypes(JSONArray groupIds, long folderId, boolean inherited) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupIds", groupIds);
			_params.put("folderId", folderId);
			_params.put("inherited", inherited);

			_command.put("/dlfileentrytype/get-folder-file-entry-types", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray search(long companyId, JSONArray groupIds, String keywords, boolean includeBasicFileEntryType, int start, int end, JSONObject orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupIds", groupIds);
			_params.put("keywords", keywords);
			_params.put("includeBasicFileEntryType", includeBasicFileEntryType);
			_params.put("start", start);
			_params.put("end", end);
			_params.put("orderByComparator", orderByComparator);

			_command.put("/dlfileentrytype/search", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer searchCount(long companyId, JSONArray groupIds, String keywords, boolean includeBasicFileEntryType) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupIds", groupIds);
			_params.put("keywords", keywords);
			_params.put("includeBasicFileEntryType", includeBasicFileEntryType);

			_command.put("/dlfileentrytype/search-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public void updateFileEntryType(long fileEntryTypeId, String name, String description, JSONArray ddmStructureIds, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fileEntryTypeId", fileEntryTypeId);
			_params.put("name", name);
			_params.put("description", description);
			_params.put("ddmStructureIds", ddmStructureIds);
			_params.put("serviceContext", serviceContext);

			_command.put("/dlfileentrytype/update-file-entry-type", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void updateFileEntryType(long fileEntryTypeId, JSONObject nameMap, JSONObject descriptionMap, JSONArray ddmStructureIds, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fileEntryTypeId", fileEntryTypeId);
			_params.put("nameMap", nameMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("ddmStructureIds", ddmStructureIds);
			_params.put("serviceContext", serviceContext);

			_command.put("/dlfileentrytype/update-file-entry-type", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

}