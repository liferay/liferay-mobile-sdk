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

package com.liferay.mobile.android.service;

import com.liferay.mobile.android.auth.Authentication;
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public interface Session {

	public Authentication getAuthentication();

	public AsyncTaskCallback getCallback();

	public int getConnectionTimeout();

	public String getServer();

	public JSONArray invoke(JSONObject command) throws Exception;

	public void setAuthentication(Authentication authentication);

	public void setCallback(AsyncTaskCallback callback);

	public void setConnectionTimeout(int connectionTimeout);

	public void setServer(String server);

	public JSONArray upload(JSONObject command) throws Exception;

}