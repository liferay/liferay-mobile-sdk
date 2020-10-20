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

package com.liferay.mobile.android.v73.commercebomfolder;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommercebomfolderService extends BaseService {

	public CommercebomfolderService(Session session) {
		super(session);
	}

	public JSONObject addCommerceBomFolder(long userId, long parentCommerceBOMFolderId, String name, boolean logo, byte[] logoBytes) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("logo", logo);
			_params.put("logoBytes", toString(logoBytes));
			_params.put("name", checkNull(name));
			_params.put("parentCommerceBOMFolderId", parentCommerceBOMFolderId);
			_params.put("userId", userId);

			_command.put("/commerce.commercebomfolder/add-commerce-bom-folder", _params);
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

	public void deleteCommerceBomFolder(long commerceBOMFolderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceBOMFolderId", commerceBOMFolderId);

			_command.put("/commerce.commercebomfolder/delete-commerce-bom-folder", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject getCommerceBomFolder(long commerceBOMFolderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceBOMFolderId", commerceBOMFolderId);

			_command.put("/commerce.commercebomfolder/get-commerce-bom-folder", _params);
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

	public JSONArray getCommerceBomFolders(long companyId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("start", start);

			_command.put("/commerce.commercebomfolder/get-commerce-bom-folders", _params);
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

	public JSONArray getCommerceBomFolders(long companyId, long parentCommerceBOMFolderId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("parentCommerceBOMFolderId", parentCommerceBOMFolderId);
			_params.put("start", start);

			_command.put("/commerce.commercebomfolder/get-commerce-bom-folders", _params);
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

	public Integer getCommerceBomFoldersCount(long companyId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);

			_command.put("/commerce.commercebomfolder/get-commerce-bom-folders-count", _params);
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

	public Integer getCommerceBomFoldersCount(long companyId, long parentCommerceBOMFolderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("parentCommerceBOMFolderId", parentCommerceBOMFolderId);

			_command.put("/commerce.commercebomfolder/get-commerce-bom-folders-count", _params);
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

	public JSONObject updateCommerceBomFolder(long commerceBOMFolderId, String name, boolean logo, byte[] logoBytes) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceBOMFolderId", commerceBOMFolderId);
			_params.put("logo", logo);
			_params.put("logoBytes", toString(logoBytes));
			_params.put("name", checkNull(name));

			_command.put("/commerce.commercebomfolder/update-commerce-bom-folder", _params);
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