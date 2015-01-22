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
import com.liferay.mobile.android.task.callback.typed.GenericAsyncTaskCallback;
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

	public Push onFailure(OnFailure onFailure) {
		_onFailure = onFailure;

		return this;
	}

	public Push onSuccess(OnSuccess onSuccess) {
		_onSuccess = onSuccess;

		return this;
	}

	public void register(String registrationId) {
		PushNotificationsDeviceService service =
			new PushNotificationsDeviceService(_session);

		try {
			service.addPushNotificationsDevice(registrationId, ANDROID);
		}
		catch (Exception e) {
			onFailure(e);
		}
	}

	public void send(long userId, JSONObject payload) {
		PushNotificationsDeviceService service =
			new PushNotificationsDeviceService(_session);

		try {
			service.sendPushNotification(userId, payload.toString());
		}
		catch (Exception e) {
			onFailure(e);
		}
	}

	public void unregister(String registrationId) {
		PushNotificationsDeviceService service =
			new PushNotificationsDeviceService(_session);

		try {
			service.deletePushNotificationsDevice(registrationId);
		}
		catch (Exception e) {
			onFailure(e);
		}
	}

	public interface OnFailure {

		public void onFailure(Exception e);

	}

	public interface OnSuccess {

		public void onSuccess(Object result);

	}

	protected Push(Session session) {
		_session = new SessionImpl(session);
		_session.setCallback(new GenericAsyncTaskCallback() {

			@Override
			public void onFailure(Exception e) {
				Push.this.onFailure(e);
			}

			@Override
			public void onSuccess(Object result) {
				if (_onSuccess != null) {
					_onSuccess.onSuccess(result);
				}
			}

			@Override
			public Object transform(Object obj) throws Exception {
				return obj;
			}
		});
	}

	protected void onFailure(Exception e) {
		if (_onFailure != null) {
			_onFailure.onFailure(e);
		}
	}

	private OnFailure _onFailure;
	private OnSuccess _onSuccess;
	private Session _session;

}