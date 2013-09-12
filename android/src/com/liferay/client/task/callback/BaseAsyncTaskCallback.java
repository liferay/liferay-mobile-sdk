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

package com.liferay.client.task.callback;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;

/**
 * @author Bruno Farache
 */
public abstract class BaseAsyncTaskCallback<T> implements AsyncTaskCallback {

	public BaseAsyncTaskCallback(Transformer<T> transformer) {
		this.transformer = transformer;
	}

	public JSONArray inBackground(JSONArray array) {
		return array;
	}

	public abstract void onFailure(Exception exception);

	public void onPostExecute(JSONArray array) {
		try {
			T result = transformer.transform(array.get(0));

			onSuccess(result);
		}
		catch (JSONException je) {
			Log.e(
				_CLASS_NAME, "Couldn't transform object " + array.toString(),
				je);
		}
	}

	public abstract void onSuccess(T result);

	protected Transformer<T> transformer;

	private static final String _CLASS_NAME =
		BaseAsyncTaskCallback.class.getSimpleName();

}