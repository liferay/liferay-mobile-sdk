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

import com.google.gson.Gson;

import com.liferay.mobile.android.http.Response;

import static com.liferay.mobile.android.callback.MainThreadRunner.run;

/**
 * @author Bruno Farache
 */
public abstract class Callback<T> {

	public void inBackground(Response response) {
		try {
			String body = response.getBody();
			T result = gson.fromJson(body, clazz);
			doSuccess(result);
		}
		catch (Exception e) {
			doFailure(e);
		}
	}

	public abstract void onFailure(Exception exception);

	public abstract void onSuccess(T result);

	protected void doFailure(final Exception e) {
		run(new Runnable() {

			@Override
			public void run() {
				onFailure(e);
			}

		});
	}

	protected void doSuccess(final T result) {
		run(new Runnable() {

			@Override
			public void run() {
				onSuccess(result);
			}

		});
	}

	protected void setClazz(Class<T> clazz) {
		this.clazz = clazz;
	}

	protected Class<T> clazz;
	protected Gson gson = new Gson();

}