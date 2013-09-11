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
import com.liferay.client.task.callback.AsyncTaskCallback;

import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class ServiceAsyncTask<T> extends AsyncTask<JSONObject, Void, T> {

	public ServiceAsyncTask(
		ServiceContext context, AsyncTaskCallback<T> callback) {

		_callback = callback;
		_context = context;
	}

	@SuppressWarnings("unchecked")
	public T doInBackground(JSONObject... params) {
		JSONWrapper wrapper;

		try {
			wrapper = HttpUtil.post(_context, params[0]);

			Object json = wrapper.getJSONArray();

			if (json == null) {
				json = wrapper.getJSONObject();
			}

			return _callback.doInBackground((T)json);
		}
		catch (Exception e) {
			wrapper = new JSONWrapper(e);

			_result = wrapper;

			cancel(false);
		}

		return null;
	}

	public void onCancelled() {
		_callback.onCancelled(_result.getException());
	}

	public void onCancelled(JSONWrapper result) {
		_callback.onCancelled(_result.getException());
	}

	public void onPostExecute(T result) {
		_callback.onPostExecute(result);
	}

	private AsyncTaskCallback<T> _callback;
	private ServiceContext _context;
	private JSONWrapper _result;

}