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

package com.liferay.mobile.android.v73.commercebomentry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommercebomentryService extends BaseService {

	public CommercebomentryService(Session session) {
		super(session);
	}

	public JSONObject addCommerceBomEntry(long userId, int number, String cpInstanceUuid, long cProductId, long commerceBOMDefinitionId, double positionX, double positionY, double radius) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceBOMDefinitionId", commerceBOMDefinitionId);
			_params.put("cpInstanceUuid", checkNull(cpInstanceUuid));
			_params.put("cProductId", cProductId);
			_params.put("number", number);
			_params.put("positionX", positionX);
			_params.put("positionY", positionY);
			_params.put("radius", radius);
			_params.put("userId", userId);

			_command.put("/commerce.commercebomentry/add-commerce-bom-entry", _params);
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

	public void deleteCommerceBomEntry(long commerceBOMEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceBOMEntryId", commerceBOMEntryId);

			_command.put("/commerce.commercebomentry/delete-commerce-bom-entry", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONArray getCommerceBomEntries(long commerceBOMDefinitionId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceBOMDefinitionId", commerceBOMDefinitionId);
			_params.put("end", end);
			_params.put("start", start);

			_command.put("/commerce.commercebomentry/get-commerce-bom-entries", _params);
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

	public Integer getCommerceBomEntriesCount(long commerceBOMDefinitionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceBOMDefinitionId", commerceBOMDefinitionId);

			_command.put("/commerce.commercebomentry/get-commerce-bom-entries-count", _params);
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

	public JSONObject getCommerceBomEntry(long commerceBOMEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceBOMEntryId", commerceBOMEntryId);

			_command.put("/commerce.commercebomentry/get-commerce-bom-entry", _params);
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

	public JSONObject updateCommerceBomEntry(long commerceBOMEntryId, int number, String cpInstanceUuid, long cProductId, double positionX, double positionY, double radius) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceBOMEntryId", commerceBOMEntryId);
			_params.put("cpInstanceUuid", checkNull(cpInstanceUuid));
			_params.put("cProductId", cProductId);
			_params.put("number", number);
			_params.put("positionX", positionX);
			_params.put("positionY", positionY);
			_params.put("radius", radius);

			_command.put("/commerce.commercebomentry/update-commerce-bom-entry", _params);
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