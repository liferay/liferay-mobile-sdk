/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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

package com.liferay.mobile.android.v62.portletpreferences;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class PortletPreferencesService extends BaseService {

	public PortletPreferencesService(Session session) {
		super(session);
	}

	public void deleteArchivedPreferences(long portletItemId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("portletItemId", portletItemId);

			_command.put("/portletpreferences/delete-archived-preferences", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void restoreArchivedPreferences(long groupId, JSONObject layout, String portletId, JSONObject portletItem, JSONObject preferences) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("layout", layout);
			_params.put("portletId", portletId);
			_params.put("portletItem", portletItem);
			_params.put("preferences", preferences);

			_command.put("/portletpreferences/restore-archived-preferences", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void restoreArchivedPreferences(long groupId, JSONObject layout, String portletId, long portletItemId, JSONObject preferences) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("layout", layout);
			_params.put("portletId", portletId);
			_params.put("portletItemId", portletItemId);
			_params.put("preferences", preferences);

			_command.put("/portletpreferences/restore-archived-preferences", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void restoreArchivedPreferences(long groupId, String name, JSONObject layout, String portletId, JSONObject preferences) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("name", name);
			_params.put("layout", layout);
			_params.put("portletId", portletId);
			_params.put("preferences", preferences);

			_command.put("/portletpreferences/restore-archived-preferences", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void updateArchivePreferences(long userId, long groupId, String name, String portletId, JSONObject preferences) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);
			_params.put("groupId", groupId);
			_params.put("name", name);
			_params.put("portletId", portletId);
			_params.put("preferences", preferences);

			_command.put("/portletpreferences/update-archive-preferences", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

}