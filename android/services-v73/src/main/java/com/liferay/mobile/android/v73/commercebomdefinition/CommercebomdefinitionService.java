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

package com.liferay.mobile.android.v73.commercebomdefinition;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommercebomdefinitionService extends BaseService {

	public CommercebomdefinitionService(Session session) {
		super(session);
	}

	public JSONObject addCommerceBomDefinition(long userId, long commerceBOMFolderId, long cpAttachmentFileEntryId, String name, String friendlyUrl) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceBOMFolderId", commerceBOMFolderId);
			_params.put("cpAttachmentFileEntryId", cpAttachmentFileEntryId);
			_params.put("friendlyUrl", checkNull(friendlyUrl));
			_params.put("name", checkNull(name));
			_params.put("userId", userId);

			_command.put("/commerce.commercebomdefinition/add-commerce-bom-definition", _params);
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

	public void deleteCommerceBomDefinition(long commerceBOMDefinitionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceBOMDefinitionId", commerceBOMDefinitionId);

			_command.put("/commerce.commercebomdefinition/delete-commerce-bom-definition", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject getCommerceBomDefinition(long commerceBOMDefinitionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceBOMDefinitionId", commerceBOMDefinitionId);

			_command.put("/commerce.commercebomdefinition/get-commerce-bom-definition", _params);
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

	public JSONArray getCommerceBomDefinitions(long commerceBOMFolderId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceBOMFolderId", commerceBOMFolderId);
			_params.put("end", end);
			_params.put("start", start);

			_command.put("/commerce.commercebomdefinition/get-commerce-bom-definitions", _params);
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

	public Integer getCommerceBomDefinitionsCount(long commerceBOMFolderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceBOMFolderId", commerceBOMFolderId);

			_command.put("/commerce.commercebomdefinition/get-commerce-bom-definitions-count", _params);
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

	public JSONObject updateCommerceBomDefinition(long commerceBOMDefinitionId, long cpAttachmentFileEntryId, String name) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceBOMDefinitionId", commerceBOMDefinitionId);
			_params.put("cpAttachmentFileEntryId", cpAttachmentFileEntryId);
			_params.put("name", checkNull(name));

			_command.put("/commerce.commercebomdefinition/update-commerce-bom-definition", _params);
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