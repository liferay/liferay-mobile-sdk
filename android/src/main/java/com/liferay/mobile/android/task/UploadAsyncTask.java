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

package com.liferay.mobile.android.task;

import android.os.AsyncTask;

import com.liferay.mobile.android.http.HttpUtil;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;
import com.liferay.mobile.android.task.callback.UploadProgressAsyncTaskCallback;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class UploadAsyncTask extends AsyncTask<JSONObject, Integer, Object> {

	public UploadAsyncTask(Session session, AsyncTaskCallback callback) {
		_callback = callback;
		_session = session;
	}

	public JSONArray doInBackground(JSONObject... commands) {
		Object result;

		try {
			UploadAsyncTask task = null;

			if (_callback instanceof UploadProgressAsyncTaskCallback) {
				task = this;
			}

			result = HttpUtil.upload(_session, commands[0], task);

			JSONArray array = new JSONArray();
			array.put(result);

			return _callback.inBackground(array);
		}
		catch (Exception e) {
			_exception = e;
			cancel(false);
		}

		return null;
	}

	public void onCancelled() {
		_callback.onFailure(_exception);
	}

	public void onCancelled(JSONArray array) {
		_callback.onFailure(_exception);
	}

	public void onPostExecute(JSONArray array) {
		try {
			_callback.onPostExecute(array);
		}
		catch (Exception e) {
			_exception = e;
			onCancelled();
		}
	}

	public void setProgress(int progress) {
		publishProgress(progress);
	}

	protected void onProgressUpdate(Integer... progress) {
		((UploadProgressAsyncTaskCallback)_callback).updateProgress(
			progress[0]);
	}

	private AsyncTaskCallback _callback;
	private Exception _exception;
	private Session _session;

}