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

package com.liferay.mobile.android.v73.commercebomfolderapplicationrel;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommercebomfolderapplicationrelService extends BaseService {

	public CommercebomfolderapplicationrelService(Session session) {
		super(session);
	}

	public JSONObject addCommerceBomFolderApplicationRel(long userId, long commerceBOMFolderId, long commerceApplicationModelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceApplicationModelId", commerceApplicationModelId);
			_params.put("commerceBOMFolderId", commerceBOMFolderId);
			_params.put("userId", userId);

			_command.put("/commerce.commercebomfolderapplicationrel/add-commerce-bom-folder-application-rel", _params);
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

	public void deleteCommerceBomFolderApplicationRel(long commerceBOMFolderApplicationRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceBOMFolderApplicationRelId", commerceBOMFolderApplicationRelId);

			_command.put("/commerce.commercebomfolderapplicationrel/delete-commerce-bom-folder-application-rel", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONArray getCommerceBomFolderApplicationRelsByCamId(long commerceApplicationModelId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceApplicationModelId", commerceApplicationModelId);
			_params.put("end", end);
			_params.put("start", start);

			_command.put("/commerce.commercebomfolderapplicationrel/get-commerce-bom-folder-application-rels-by-cam-id", _params);
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

	public JSONArray getCommerceBomFolderApplicationRelsByCommerceBomFolderId(long commerceBOMFolderId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceBOMFolderId", commerceBOMFolderId);
			_params.put("end", end);
			_params.put("start", start);

			_command.put("/commerce.commercebomfolderapplicationrel/get-commerce-bom-folder-application-rels-by-commerce-bom-folder-id", _params);
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

	public Integer getCommerceBomFolderApplicationRelsCountByCamId(long commerceApplicationModelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceApplicationModelId", commerceApplicationModelId);

			_command.put("/commerce.commercebomfolderapplicationrel/get-commerce-bom-folder-application-rels-count-by-cam-id", _params);
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

	public Integer getCommerceBomFolderApplicationRelsCountByCommerceBomFolderId(long commerceBOMFolderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceBOMFolderId", commerceBOMFolderId);

			_command.put("/commerce.commercebomfolderapplicationrel/get-commerce-bom-folder-application-rels-count-by-commerce-bom-folder-id", _params);
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