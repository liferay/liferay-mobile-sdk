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

package com.liferay.mobile.android.v73.dlfileentrytype;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
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

	public JSONObject addFileEntryType(long groupId, long dataDefinitionId, String fileEntryTypeKey, JSONObject nameMap, JSONObject descriptionMap, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("dataDefinitionId", dataDefinitionId);
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("fileEntryTypeKey", checkNull(fileEntryTypeKey));
			_params.put("groupId", groupId);
			_params.put("nameMap", checkNull(nameMap));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/dlfileentrytype/add-file-entry-type", _params);
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

	public JSONObject addFileEntryType(long groupId, String fileEntryTypeKey, JSONObject nameMap, JSONObject descriptionMap, JSONArray ddmStructureIds, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmStructureIds", checkNull(ddmStructureIds));
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("fileEntryTypeKey", checkNull(fileEntryTypeKey));
			_params.put("groupId", groupId);
			_params.put("nameMap", checkNull(nameMap));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/dlfileentrytype/add-file-entry-type", _params);
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

	public JSONObject addFileEntryType(long groupId, String name, String description, JSONArray ddmStructureIds, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmStructureIds", checkNull(ddmStructureIds));
			_params.put("description", checkNull(description));
			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/dlfileentrytype/add-file-entry-type", _params);
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

	public void deleteFileEntryType(long fileEntryTypeId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fileEntryTypeId", fileEntryTypeId);

			_command.put("/dlfileentrytype/delete-file-entry-type", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
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
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONArray getFileEntryTypes(JSONArray groupIds) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupIds", checkNull(groupIds));

			_command.put("/dlfileentrytype/get-file-entry-types", _params);
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

	public JSONArray getFileEntryTypes(JSONArray groupIds, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupIds", checkNull(groupIds));
			_params.put("start", start);

			_command.put("/dlfileentrytype/get-file-entry-types", _params);
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

	public Integer getFileEntryTypesCount(JSONArray groupIds) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupIds", checkNull(groupIds));

			_command.put("/dlfileentrytype/get-file-entry-types-count", _params);
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

	public JSONArray getFolderFileEntryTypes(JSONArray groupIds, long folderId, boolean inherited) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("groupIds", checkNull(groupIds));
			_params.put("inherited", inherited);

			_command.put("/dlfileentrytype/get-folder-file-entry-types", _params);
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

	public JSONArray search(long companyId, JSONArray groupIds, String keywords, boolean includeBasicFileEntryType, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("groupIds", checkNull(groupIds));
			_params.put("includeBasicFileEntryType", includeBasicFileEntryType);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.document.library.kernel.model.DLFileEntryType>", orderByComparator);

			_command.put("/dlfileentrytype/search", _params);
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

	public JSONArray search(long companyId, long folderId, JSONArray groupIds, String keywords, boolean includeBasicFileEntryType, boolean inherited, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("folderId", folderId);
			_params.put("groupIds", checkNull(groupIds));
			_params.put("includeBasicFileEntryType", includeBasicFileEntryType);
			_params.put("inherited", inherited);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);

			_command.put("/dlfileentrytype/search", _params);
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

	public Integer searchCount(long companyId, JSONArray groupIds, String keywords, boolean includeBasicFileEntryType) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupIds", checkNull(groupIds));
			_params.put("includeBasicFileEntryType", includeBasicFileEntryType);
			_params.put("keywords", checkNull(keywords));

			_command.put("/dlfileentrytype/search-count", _params);
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

	public Integer searchCount(long companyId, long folderId, JSONArray groupIds, String keywords, boolean includeBasicFileEntryType, boolean inherited) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("folderId", folderId);
			_params.put("groupIds", checkNull(groupIds));
			_params.put("includeBasicFileEntryType", includeBasicFileEntryType);
			_params.put("inherited", inherited);
			_params.put("keywords", checkNull(keywords));

			_command.put("/dlfileentrytype/search-count", _params);
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

	public JSONObject updateFileEntryType(long fileEntryTypeId, JSONObject nameMap, JSONObject descriptionMap) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("fileEntryTypeId", fileEntryTypeId);
			_params.put("nameMap", checkNull(nameMap));

			_command.put("/dlfileentrytype/update-file-entry-type", _params);
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

	public void updateFileEntryType(long fileEntryTypeId, JSONObject nameMap, JSONObject descriptionMap, JSONArray ddmStructureIds, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmStructureIds", checkNull(ddmStructureIds));
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("fileEntryTypeId", fileEntryTypeId);
			_params.put("nameMap", checkNull(nameMap));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/dlfileentrytype/update-file-entry-type", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void updateFileEntryType(long fileEntryTypeId, String name, String description, JSONArray ddmStructureIds, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ddmStructureIds", checkNull(ddmStructureIds));
			_params.put("description", checkNull(description));
			_params.put("fileEntryTypeId", fileEntryTypeId);
			_params.put("name", checkNull(name));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/dlfileentrytype/update-file-entry-type", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

}