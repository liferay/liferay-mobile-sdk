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
			onSuccess(inBackground(new JSONArray(body)));
		}
		catch (Exception e) {
			onFailure(e);
		}
	}

	public abstract void onSuccess(T result);

}