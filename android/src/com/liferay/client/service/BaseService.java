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

package com.liferay.client.service;

import com.liferay.client.http.HttpUtil;
import com.liferay.client.task.ServiceAsyncTask;
import com.liferay.client.task.callback.AsyncTaskCallback;
import com.liferay.client.task.callback.BatchAsyncTaskCallback;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class BaseService {

	public BaseService(ServiceContext context) {
		this(context, null);
	}

	public BaseService(ServiceContext context, AsyncTaskCallback callback) {
		this(context, callback, false);
	}

	public BaseService(ServiceContext context, boolean batch) {
		this(context, null, batch);
	}

	public AsyncTaskCallback getCallback() {
		return callback;
	}

	public ServiceContext getContext() {
		return context;
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

	public void setContext(ServiceContext context) {
		this.context = context;
	}

	protected BaseService(
		ServiceContext context, AsyncTaskCallback callback, boolean batch) {

		this.context = context;
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
			ServiceAsyncTask task = new ServiceAsyncTask(context, callback);

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
	protected ServiceContext context;

}