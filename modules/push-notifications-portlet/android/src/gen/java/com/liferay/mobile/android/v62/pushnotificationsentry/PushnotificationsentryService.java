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

package com.liferay.mobile.android.v62.pushnotificationsentry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class PushnotificationsentryService extends BaseService {

	public PushnotificationsentryService(Session session) {
		super(session);
	}

	public JSONObject addPushNotificationsEntry(String payload) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("payload", payload);

			_command.put("/push-notifications-portlet/pushnotificationsentry/add-push-notifications-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject addPushNotificationsEntry(long parentPushNotificationsEntryId, String payload) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("parentPushNotificationsEntryId", parentPushNotificationsEntryId);
			_params.put("payload", payload);

			_command.put("/push-notifications-portlet/pushnotificationsentry/add-push-notifications-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONArray getPushNotificationsEntries(long parentPushNotificationsEntryId, long lastAccessTime, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("parentPushNotificationsEntryId", parentPushNotificationsEntryId);
			_params.put("lastAccessTime", lastAccessTime);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/push-notifications-portlet/pushnotificationsentry/get-push-notifications-entries", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONObject likePushNotificationsEntry(long pushNotificationsEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("pushNotificationsEntryId", pushNotificationsEntryId);

			_command.put("/push-notifications-portlet/pushnotificationsentry/like-push-notifications-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject unlikePushNotificationsEntry(long pushNotificationsEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("pushNotificationsEntryId", pushNotificationsEntryId);

			_command.put("/push-notifications-portlet/pushnotificationsentry/unlike-push-notifications-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

}