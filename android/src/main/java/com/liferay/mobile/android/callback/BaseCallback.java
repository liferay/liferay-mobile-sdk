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

package com.liferay.mobile.android.callback;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

import com.liferay.mobile.android.http.Response;

import org.json.JSONArray;

/**
 * @author Bruno Farache
 */
public abstract class BaseCallback<T> implements Callback {

	public abstract T inBackground(JSONArray result) throws Exception;

	@Override
	public void inBackground(Response response) {
		try {
			String body = response.getBody();
			_onSuccess(inBackground(new JSONArray(body)));
		}
		catch (Exception e) {
			_onFailure(e);
		}
	}

	public abstract void onSuccess(T result);

	private void _onFailure(final Exception e) {
		if (_handler == null) {
			onFailure(e);
			return;
		}

		_handler.post(new Runnable() {

			@Override
			public void run() {
				onFailure(e);
			}

		});
	}

	private void _onSuccess(final T result) {
		if (_handler == null) {
			onSuccess(result);
			return;
		}

		_handler.post(new Runnable() {

			@Override
			public void run() {
				onSuccess(result);
			}

		});
	}

	private static Handler _handler;

	static {
		try {
			Class.forName("android.os.Build");

			if (Build.VERSION.SDK_INT != 0) {
				_handler = new Handler(Looper.getMainLooper());
			}
		}
		catch (ClassNotFoundException cnfe) {
		}
	}

}