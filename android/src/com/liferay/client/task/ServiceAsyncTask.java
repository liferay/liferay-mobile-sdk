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

package com.liferay.client.task;

import android.os.AsyncTask;

import com.liferay.client.http.HttpUtil;
import com.liferay.client.service.ServiceContext;
import com.liferay.client.task.callback.AsyncTaskCallback;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class ServiceAsyncTask extends AsyncTask<JSONArray, Void, JSONArray> {

	public ServiceAsyncTask(
		ServiceContext context, AsyncTaskCallback callback) {

		_callback = callback;
		_context = context;
	}

	public JSONArray doInBackground(JSONArray... commands) {
		JSONArray array;

		try {
			array = HttpUtil.post(_context, commands[0]);

			return _callback.doInBackground(array);
		}
		catch (Exception e) {
			_exception = e;

			cancel(false);
		}

		return null;
	}

	public void execute(JSONObject command) {
		JSONArray commands = new JSONArray();

		commands.put(command);

		this.execute(commands);
	}

	public void onCancelled() {
		_callback.onFailure(_exception);
	}

	public void onCancelled(JSONArray array) {
		_callback.onFailure(_exception);
	}

	public void onPostExecute(JSONArray array) {
		_callback.onPostExecute(array);
	}

	private AsyncTaskCallback _callback;
	private ServiceContext _context;
	private Exception _exception;

}