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

package com.liferay.mobile.android.v62.role;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class RoleService extends BaseService {
	public RoleService(Session session) {
		super(session);
	}

	public JSONObject addRole(String name, JSONObject titleMap,
		JSONObject descriptionMap, int type) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("name", name);
			_params.put("titleMap", titleMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("type", type);

			_command.put("/role/add-role", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject addRole(String className, long classPK, String name,
		JSONObject titleMap, JSONObject descriptionMap, int type,
		String subtype, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", className);
			_params.put("classPK", classPK);
			_params.put("name", name);
			_params.put("titleMap", titleMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("type", type);
			_params.put("subtype", subtype);
			_params.put("serviceContext", serviceContext);

			_command.put("/role/add-role", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void addUserRoles(long userId, JSONArray roleIds)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);
			_params.put("roleIds", roleIds);

			_command.put("/role/add-user-roles", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void deleteRole(long roleId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("roleId", roleId);

			_command.put("/role/delete-role", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONArray getGroupRoles(long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);

			_command.put("/role/get-group-roles", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONObject getRole(long roleId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("roleId", roleId);

			_command.put("/role/get-role", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject getRole(long companyId, String name)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("name", name);

			_command.put("/role/get-role", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONArray getUserGroupGroupRoles(long userId, long groupId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);
			_params.put("groupId", groupId);

			_command.put("/role/get-user-group-group-roles", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getUserGroupRoles(long userId, long groupId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);
			_params.put("groupId", groupId);

			_command.put("/role/get-user-group-roles", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getUserRelatedRoles(long userId, JSONArray groups)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);
			_params.put("groups", groups);

			_command.put("/role/get-user-related-roles", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getUserRoles(long userId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);

			_command.put("/role/get-user-roles", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Boolean hasUserRole(long userId, long companyId, String name,
		boolean inherited) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);
			_params.put("companyId", companyId);
			_params.put("name", name);
			_params.put("inherited", inherited);

			_command.put("/role/has-user-role", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Boolean)session.invoke(_command);
	}

	public Boolean hasUserRoles(long userId, long companyId, JSONArray names,
		boolean inherited) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);
			_params.put("companyId", companyId);
			_params.put("names", names);
			_params.put("inherited", inherited);

			_command.put("/role/has-user-roles", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Boolean)session.invoke(_command);
	}

	public void unsetUserRoles(long userId, JSONArray roleIds)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);
			_params.put("roleIds", roleIds);

			_command.put("/role/unset-user-roles", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject updateRole(long roleId, String name, JSONObject titleMap,
		JSONObject descriptionMap, String subtype, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("roleId", roleId);
			_params.put("name", name);
			_params.put("titleMap", titleMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("subtype", subtype);
			_params.put("serviceContext", serviceContext);

			_command.put("/role/update-role", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}
}