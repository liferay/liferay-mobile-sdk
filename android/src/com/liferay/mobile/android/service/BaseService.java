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
public class BaseService {

	public BaseService(Session session) {
		this(session, null);
	}

	public BaseService(Session session, AsyncTaskCallback callback) {
		this(session, callback, false);
	}

	public BaseService(Session session, boolean batch) {
		this(session, null, batch);
	}

	public AsyncTaskCallback getCallback() {
		return callback;
	}

	public Session getContext() {
		return session;
	}

	public JSONArray invoke() throws Exception {
		JSONArray jsonArray = HttpUtil.post(getContext(), commands);

		commands = new JSONArray();

		return jsonArray;
	}

	public void invoke(BatchAsyncTaskCallback callback) {
		ServiceAsyncTask task = new ServiceAsyncTask(getContext(), callback);

		task.execute(commands);

		commands = new JSONArray();
	}

	public boolean isBatch() {
		return batch;
	}

	public void setBatch(boolean batch) {
		this.batch = batch;
	}

	public void setCallback(AsyncTaskCallback callback) {
		this.callback = callback;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	protected BaseService(
		Session session, AsyncTaskCallback callback, boolean batch) {

		this.session = session;
		this.callback = callback;
		this.batch = batch;
	}

	protected void addCommand(JSONObject command) {
		commands.put(command);
	}

	protected Object post(JSONObject command) throws Exception {
		if (isBatch()) {
			addCommand(command);

			return null;
		}

		if (callback != null) {
			ServiceAsyncTask task = new ServiceAsyncTask(session, callback);

			task.execute(command);

			return null;
		}
		else {
			JSONArray _json = HttpUtil.post(getContext(), command);

			return _json.get(0);
		}
	}

	protected boolean batch;
	protected AsyncTaskCallback callback;
	protected JSONArray commands = new JSONArray();
	protected Session session;

}