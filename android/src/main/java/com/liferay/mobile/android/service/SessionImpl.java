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

package com.liferay.mobile.android.service;

import com.liferay.mobile.android.auth.Auth;
import com.liferay.mobile.android.http.HttpUtil;
import com.liferay.mobile.android.task.ServiceAsyncTask;
import com.liferay.mobile.android.task.UploadAsyncTask;
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class SessionImpl implements Session {

	public static final int DEFAULT_CONNECTION_TIMEOUT = 15000;

	public SessionImpl(Session session) {
		this(
			session.getServer(), session.getAuth(),
			session.getConnectionTimeout(), session.getCallback());
	}

	public SessionImpl(String server) {
		this(server, null, null);
	}

	public SessionImpl(String server, AsyncTaskCallback callback) {
		this(server, null, callback);
	}

	public SessionImpl(String server, Auth auth) {
		this(server, auth, null);
	}

	public SessionImpl(String server, Auth auth, AsyncTaskCallback callback) {
		this(server, auth, DEFAULT_CONNECTION_TIMEOUT, callback);
	}

	public SessionImpl(
		String server, Auth auth, int connectionTimeout,
		AsyncTaskCallback callback) {

		this.server = server;
		this.auth = auth;
		this.connectionTimeout = connectionTimeout;
		this.callback = callback;
	}

	@Override
	public Auth getAuth() {
		return auth;
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
	public String getPassword() {
		return password;
	}

	@Override
	public String getServer() {
		return server;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public Object invoke(JSONObject command) throws Exception {
		if (callback != null) {
			ServiceAsyncTask task = new ServiceAsyncTask(this, callback);
			task.execute(command);

			return null;
		}
		else {
			JSONArray json = HttpUtil.post(this, command);

			return json.get(0);
		}
	}

	@Override
	public void setAuth(Auth auth) {
		this.auth = auth;
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
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void setServer(String server) {
		this.server = server;
	}

	@Override
	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public Object upload(JSONObject command) throws Exception {
		if (callback != null) {
			UploadAsyncTask task = new UploadAsyncTask(this, callback);
			task.execute(command);

			return null;
		}
		else {
			return HttpUtil.upload(this, command, null);
		}
	}

	protected Auth auth;
	protected AsyncTaskCallback callback;
	protected int connectionTimeout;
	protected String password;
	protected String server;
	protected String username;

}