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

package com.liferay.mobile.android.task.callback.typed;

import com.liferay.mobile.android.task.callback.BaseAsyncTaskCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public abstract class JSONObjectAsyncTaskCallback
		extends BaseAsyncTaskCallback<JSONObject> {

	public void onPostExecute(JSONArray jsonArray) throws JSONException {
		JSONObject result = jsonArray.getJSONObject(0);

		onSuccess(result);
	}

}