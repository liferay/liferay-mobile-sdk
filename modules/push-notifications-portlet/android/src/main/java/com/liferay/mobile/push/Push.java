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

package com.liferay.mobile.push;

import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.service.SessionImpl;
import com.liferay.mobile.android.task.callback.typed.JSONObjectAsyncTaskCallback;
import com.liferay.mobile.android.v62.pushnotificationsdevice.PushNotificationsDeviceService;

import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class Push {

	public static final String ANDROID = "android";

	public static Push with(Session session) {
		return new Push(session);
	}

	public Push callback(Callback callback) {
		_callback = callback;

		return this;
	}

	public void register(String registrationId) {
		PushNotificationsDeviceService service =
			new PushNotificationsDeviceService(_session);

		try {
			service.addPushNotificationsDevice(registrationId, ANDROID);
		}
		catch (Exception e) {
			onError(e);
		}
	}

	public void send(long userId, JSONObject payload) {
		PushNotificationsDeviceService service =
			new PushNotificationsDeviceService(_session);

		try {
			service.sendPushNotification(userId, payload.toString());
		}
		catch (Exception e) {
			onError(e);
		}
	}

	public void unregister(String registrationId) {
		PushNotificationsDeviceService service =
			new PushNotificationsDeviceService(_session);

		try {
			service.deletePushNotificationsDevice(registrationId);
		}
		catch (Exception e) {
			onError(e);
		}
	}

	public interface Callback {

		public void on(Event event, Object result);

	}

	public enum Event {

		ERROR, SUCCESS;

	}

	protected Push(Session session) {
		_session = new SessionImpl(session);
		_session.setCallback(new JSONObjectAsyncTaskCallback() {

			@Override
			public void onFailure(Exception e) {
				Push.this.onError(e);
			}

			@Override
			public void onSuccess(JSONObject result) {
				if (_callback != null) {
					_callback.on(Event.SUCCESS, result);
				}
			}

		});
	}

	protected void onError(Exception e) {
		if (_callback != null) {
			_callback.on(Event.ERROR, e);
		}
	}

	private Callback _callback;
	private Session _session;

}