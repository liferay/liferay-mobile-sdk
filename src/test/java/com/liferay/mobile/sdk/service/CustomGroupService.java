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

package com.liferay.mobile.sdk.service;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.json.GenericListType;

import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CustomGroupService {

	public Call<Map<String, Object>> getGroupAsMap(long groupId) {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);

			_command.put("/group/get-group", _params);
		}
		catch (JSONException _je) {
		}

		return new Call<>(_command, Map.class);
	}

	public Call<Site> getGroupAsSite(long groupId) {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);

			_command.put("/group/get-group", _params);
		}
		catch (JSONException _je) {
		}

		return new Call<>(_command, Site.class);
	}

	public Call<List<Map<String, Object>>> getUserSitesAsListOfMap() {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_command.put("/group/get-user-sites-groups", _params);
		}
		catch (JSONException _je) {
		}

		GenericListType<Map> type = new GenericListType<>(Map.class);

		return new Call<>(_command, type);
	}

	public Call<List<Site>> getUserSitesAsListOfSites() {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_command.put("/group/get-user-sites-groups", _params);
		}
		catch (JSONException _je) {
		}

		GenericListType<Site> type = new GenericListType<>(Site.class);

		return new Call<>(_command, type);
	}

	public Call<JSONArray> getUserSitesGroups() {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_command.put("/group/get-user-sites-groups", _params);
		}
		catch (JSONException _je) {
		}

		return new Call<>(_command, JSONArray.class);
	}

}