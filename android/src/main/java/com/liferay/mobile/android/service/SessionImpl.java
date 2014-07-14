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

import com.liferay.mobile.android.http.HttpUtil;
import com.liferay.mobile.android.task.ServiceAsyncTask;
import com.liferay.mobile.android.task.UploadAsyncTask;
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;

import org.apache.http.Header;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.impl.auth.BasicScheme;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class SessionImpl implements Session {

	public static final int DEFAULT_CONNECTION_TIMEOUT = 15000;

	public SessionImpl(Session session) {
		this(
			session.getServer(), session.getUsername(), session.getPassword(),
			session.getConnectionTimeout(), session.getCallback());
	}

	public SessionImpl(String server, String username, String password) {
		this(server, username, password, DEFAULT_CONNECTION_TIMEOUT, null);
	}

	public SessionImpl(
		String server, String username, String password,
		AsyncTaskCallback callback) {

		this(server, username, password, DEFAULT_CONNECTION_TIMEOUT, callback);
	}

	public SessionImpl(
		String server, String username, String password, int connectionTimeout,
		AsyncTaskCallback callback) {

		this.server = server;
		this.username = username;
		this.password = password;
		this.connectionTimeout = connectionTimeout;
		this.callback = callback;
	}

	public Header getAuthHeader() {
		String username = getUsername();
		if (username == null || username.length() == 0) {
			return null;
		}

		UsernamePasswordCredentials credentials =
			new UsernamePasswordCredentials(username, getPassword());

		Header authorization = BasicScheme.authenticate(
			credentials, "UTF-8", false);

		return authorization;
	}

	public AsyncTaskCallback getCallback() {
		return callback;
	}

	public int getConnectionTimeout() {
		return connectionTimeout;
	}

	public String getPassword() {
		return password;
	}

	public String getServer() {
		return server;
	}

	public String getUsername() {
		return username;
	}

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

	public void setCallback(AsyncTaskCallback callback) {
		this.callback = callback;
	}

	public void setConnectionTimeout(int connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public void setUsername(String username) {
		this.username = username;
	}

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

	protected AsyncTaskCallback callback;
	protected int connectionTimeout;
	protected String password;
	protected String server;
	protected String username;

}