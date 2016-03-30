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

package com.liferay.mobile.sdk;

import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.v2.JsonParser;

import java.lang.reflect.Type;

import static com.liferay.mobile.sdk.callback.MainThreadRunner.run;

/**
 * @author Bruno Farache
 */
public abstract class Callback<T> {

	public void doFailure(final Exception e) {
		run(new Runnable() {

			@Override
			public void run() {
				onFailure(e);
			}

		});
	}

	public void doSuccess(final T result) {
		run(new Runnable() {

			@Override
			public void run() {
				onSuccess(result);
			}

		});
	}

	public void inBackground(Response response) {
		try {
			T result = JsonParser.fromJson(response, type);
			doSuccess(result);
		}
		catch (Exception e) {
			doFailure(e);
		}
	}

	public abstract void onFailure(Exception exception);

	public abstract void onSuccess(T result);

	protected void type(Type type) {
		this.type = type;
	}

	protected Type type;

}