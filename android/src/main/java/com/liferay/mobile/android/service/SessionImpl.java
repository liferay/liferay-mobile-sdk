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
import com.liferay.mobile.android.http.HttpUtil;
import com.liferay.mobile.android.task.ServiceAsyncTask;
import com.liferay.mobile.android.task.UploadAsyncTask;
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;

import java.util.Iterator;

import org.apache.http.entity.mime.content.InputStreamBody;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class SessionImpl implements Session {

	public static final int DEFAULT_CONNECTION_TIMEOUT = 15000;

	public SessionImpl(Session session) {
		this(
			session.getServer(), session.getAuthentication(),
			session.getConnectionTimeout(), session.getCallback());
	}

	public SessionImpl(String server) {
		this(server, null, null);
	}

	public SessionImpl(String server, AsyncTaskCallback callback) {
		this(server, null, callback);
	}

	public SessionImpl(String server, Authentication authentication) {
		this(server, authentication, null);
	}

	public SessionImpl(
		String server, Authentication authentication,
		AsyncTaskCallback callback) {

		this(server, authentication, DEFAULT_CONNECTION_TIMEOUT, callback);
	}

	public SessionImpl(
		String server, Authentication authentication, int connectionTimeout,
		AsyncTaskCallback callback) {

		this.server = server;
		this.authentication = authentication;
		this.connectionTimeout = connectionTimeout;
		this.callback = callback;
	}

	@Override
	public Authentication getAuthentication() {
		return authentication;
	}

	@Override
	public AsyncTaskCallback getCallback() {
		return callback;
	}

	@Override
	public int getConnectionTimeout() {
		return connectionTimeout;
	}

	@Override
	public String getServer() {
		return server;
	}

	@Override
	public JSONArray invoke(JSONObject command) throws Exception {
		if (callback != null) {
			ServiceAsyncTask task = new ServiceAsyncTask(this, callback);
			task.execute(command);

			return null;
		}
		else {
			return HttpUtil.post(this, command);
		}
	}

	@Override
	public void setAuthentication(Authentication authentication) {
		this.authentication = authentication;
	}

	@Override
	public void setCallback(AsyncTaskCallback callback) {
		this.callback = callback;
	}

	@Override
	public void setConnectionTimeout(int connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
	}

	@Override
	public void setServer(String server) {
		this.server = server;
	}

	@Override
	public JSONArray upload(JSONObject command) throws Exception {
		if (!hasInputStreamBody(command)) {
			return invoke(command);
		}

		if (callback != null) {
			UploadAsyncTask task = new UploadAsyncTask(this, callback);
			task.execute(command);

			return null;
		}
		else {
			return HttpUtil.upload(this, command);
		}
	}

	protected boolean hasInputStreamBody(JSONObject command)
		throws JSONException {

		if (command.length() == 0) {
			return false;
		}

		String first = command.names().getString(0);
		JSONObject params = command.getJSONObject(first);

		Iterator<String> keys = params.keys();

		while (keys.hasNext()) {
			String key = keys.next();

			if (params.get(key) instanceof InputStreamBody) {
				return true;
			}
		}

		return false;
	}

	protected Authentication authentication;
	protected AsyncTaskCallback callback;
	protected int connectionTimeout;
	protected String server;

}