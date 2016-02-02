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

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class UserService extends BaseService {

	public UserService(Session session) {
		super(session);
	}

	public Call<Integer> getCompanyUsersCount(long companyId) {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);

			_command.put("/user/get-company-users-count", _params);
		}
		catch (JSONException _je) {
		}

		return new Call<Integer>(_command, Integer.class);
	}

	public Call<Long> getUserIdByEmailAddress(long companyId, String emailAddress) {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("emailAddress", checkNull(emailAddress));

			_command.put("/user/get-user-id-by-email-address", _params);
		}
		catch (JSONException _je) {
		}

		return new Call<Long>(_command, Long.class);
	}

	public Call<Boolean> hasGroupUser(long groupId, long userId) {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("userId", userId);

			_command.put("/user/has-group-user", _params);
		}
		catch (JSONException _je) {
		}

		return new Call<Boolean>(_command, Boolean.class);
	}

}