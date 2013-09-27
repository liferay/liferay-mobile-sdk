/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;
import com.liferay.mobile.android.task.callback.BatchAsyncTaskCallback;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class Session {

	public static final int DEFAULT_CONNECTION_TIMEOUT = 15000;

	public Session(String server, String username, String password) {
		this(
			server, username, password, DEFAULT_CONNECTION_TIMEOUT, null,
			false);
	}

	public Session(
		String server, String username, String password, int connectionTimeout,
		AsyncTaskCallback callback, boolean batch) {

		_server = server;
		_username = username;
		_password = password;
		_connectionTimeout = connectionTimeout;
		_callback = callback;
		_batch = batch;
	}

	public AsyncTaskCallback getCallback() {
		return _callback;
	}

	public int getConnectionTimeout() {
		return _connectionTimeout;
	}

	public String getPassword() {
		return _password;
	}

	public String getServer() {
		return _server;
	}

	public String getUsername() {
		return _username;
	}

	public JSONArray invoke() throws Exception {
		JSONArray jsonArray = HttpUtil.post(this, _commands);

		_commands = new JSONArray();

		return jsonArray;
	}

	public void invoke(BatchAsyncTaskCallback callback) {
		ServiceAsyncTask task = new ServiceAsyncTask(this, callback);

		task.execute(_commands);

		_commands = new JSONArray();
	}

	public Object invoke(JSONObject command) throws Exception {
		if (isBatch()) {
			addCommand(command);

			return null;
		}

		if (_callback != null) {
			ServiceAsyncTask task = new ServiceAsyncTask(this, _callback);

			task.execute(command);

			return null;
		}
		else {
			JSONArray _json = HttpUtil.post(this, command);

			return _json.get(0);
		}
	}

	public boolean isBatch() {
		return _batch;
	}

	public void setBatch(boolean batch) {
		_batch = batch;
	}

	public void setCallback(AsyncTaskCallback callback) {
		_callback = callback;
	}

	public void setConnectionTimeout(int connectionTimeout) {
		_connectionTimeout = connectionTimeout;
	}

	public void setPassword(String password) {
		_password = password;
	}

	public void setServer(String server) {
		_server = server;
	}

	public void setUsername(String username) {
		_username = username;
	}

	protected void addCommand(JSONObject command) {
		_commands.put(command);
	}

	private boolean _batch;
	private AsyncTaskCallback _callback;
	private JSONArray _commands = new JSONArray();
	private int _connectionTimeout;
	private String _password;
	private String _server;
	private String _username;

}