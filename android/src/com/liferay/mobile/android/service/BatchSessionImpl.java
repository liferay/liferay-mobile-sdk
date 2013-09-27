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
public class BatchSessionImpl extends SessionImpl {

	public static final int DEFAULT_CONNECTION_TIMEOUT = 15000;

	public BatchSessionImpl(Session session) {
		super(session);
	}

	public BatchSessionImpl(String server, String username, String password) {
		super(server, username, password);
	}

	public BatchSessionImpl(
		String server, String username, String password,
		AsyncTaskCallback callback) {

		super(server, username, password, callback);
	}

	public BatchSessionImpl(
		String server, String username, String password, int connectionTimeout,
		AsyncTaskCallback callback) {

		super(server, username, password, connectionTimeout, callback);
	}

	public JSONArray invoke() throws Exception {
		try {
			if (callback != null) {
				ServiceAsyncTask task = new ServiceAsyncTask(this, callback);

				task.execute(commands);

				return null;
			}
			else {
				return HttpUtil.post(this, commands);
			}
		}
		finally {
			commands = new JSONArray();
		}
	}

	public Object invoke(JSONObject command) throws Exception {
		addCommand(command);

		return null;
	}

	public void setCallback(BatchAsyncTaskCallback callback) {
		this.callback = callback;
	}

	protected void addCommand(JSONObject command) {
		commands.put(command);
	}

	protected JSONArray commands = new JSONArray();

}