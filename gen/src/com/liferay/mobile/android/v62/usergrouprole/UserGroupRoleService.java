/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.mobile.android.v62.usergrouprole;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.ServiceContext;
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class UserGroupRoleService extends BaseService {
	public UserGroupRoleService(ServiceContext context) {
		super(context);
	}

	public UserGroupRoleService(ServiceContext context,
		AsyncTaskCallback callback) {
		super(context, callback);
	}

	public UserGroupRoleService(ServiceContext context, boolean batch) {
		super(context, batch);
	}

	public void addUserGroupRoles(JSONArray userIds, long groupId, long roleId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userIds", userIds);
			_params.put("groupId", groupId);
			_params.put("roleId", roleId);

			_command.put("/usergrouprole/add-user-group-roles", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		post(_command);
	}

	public void deleteUserGroupRoles(JSONArray userIds, long groupId,
		long roleId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userIds", userIds);
			_params.put("groupId", groupId);
			_params.put("roleId", roleId);

			_command.put("/usergrouprole/delete-user-group-roles", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		post(_command);
	}
}