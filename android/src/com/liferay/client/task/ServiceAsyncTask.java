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
import com.liferay.client.service.JSONWrapper;
import com.liferay.client.service.ServiceContext;

import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class ServiceAsyncTask extends AsyncTask<JSONObject, Void, JSONWrapper> {

	public ServiceAsyncTask(ServiceContext context, TaskCallback callback) {
		_callback = callback;
		_context = context;
	}

	public JSONWrapper doInBackground(JSONObject... params) {
		JSONWrapper result = null;

		try {
			result = HttpUtil.post(_context, params[0]);

			return _callback.doInBackground(result);
		}
		catch (Exception e) {
			result = new JSONWrapper(e);

			_result = result;

			cancel(false);
		}

		return result;
	}

	public void onCancelled() {
		_callback.onCancelled(_result.getException());
	}

	public void onCancelled(JSONWrapper result) {
		_callback.onCancelled(result.getException());
	}

	public void onPostExecute(JSONWrapper result) {
		_callback.onPostExecute(result);
	}

	private TaskCallback _callback;
	private ServiceContext _context;
	private JSONWrapper _result;

}