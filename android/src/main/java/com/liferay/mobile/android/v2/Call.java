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

import java.lang.reflect.Type;

import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class Call<T> {

	public Call(JSONObject command, Type type) {
		this.command = command;
		this.type = type;
	}

	public void async(Callback<T> callback) {
		callback.setCall(this);
	}

	public T execute() throws Exception {
		return null;
	}

	protected JSONObject command;
	protected Type type;

}