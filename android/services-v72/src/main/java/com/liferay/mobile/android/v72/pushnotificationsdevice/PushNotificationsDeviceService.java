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

package com.liferay.mobile.android.v72.pushnotificationsdevice;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class PushNotificationsDeviceService extends BaseService {

	public PushNotificationsDeviceService(Session session) {
		super(session);
	}

	public JSONObject addPushNotificationsDevice(String token, String platform) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("platform", checkNull(platform));
			_params.put("token", checkNull(token));

			_command.put("/pushnotifications.pushnotificationsdevice/add-push-notifications-device", _params);
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

	public JSONObject deletePushNotificationsDevice(long pushNotificationsDeviceId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("pushNotificationsDeviceId", pushNotificationsDeviceId);

			_command.put("/pushnotifications.pushnotificationsdevice/delete-push-notifications-device", _params);
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

	public JSONObject deletePushNotificationsDevice(String token) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("token", checkNull(token));

			_command.put("/pushnotifications.pushnotificationsdevice/delete-push-notifications-device", _params);
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

	public void sendPushNotification(JSONArray toUserIds, String payload) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("payload", checkNull(payload));
			_params.put("toUserIds", checkNull(toUserIds));

			_command.put("/pushnotifications.pushnotificationsdevice/send-push-notification", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void sendPushNotification(String platform, JSONArray tokens, String payload) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("payload", checkNull(payload));
			_params.put("platform", checkNull(platform));
			_params.put("tokens", checkNull(tokens));

			_command.put("/pushnotifications.pushnotificationsdevice/send-push-notification", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

}