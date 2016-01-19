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

package com.liferay.mobile.android.v2;

import com.google.gson.reflect.TypeToken;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class GroupService extends BaseService {

	public GroupService(Session session) {
		super(session);
	}

	public <T> Call<List<T>> getUserSites() {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_command.put("/group/get-user-sites", _params);
		}
		catch (JSONException _je) {
		}

		return new Call<List<T>>(
			_command, new TypeToken<List<T>>(){}.getType());
	}

}