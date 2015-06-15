/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

import java.util.ArrayList;

import org.json.JSONArray;

/**
 * @author Bruno Farache
 */
public abstract class GenericBatchAsyncTaskCallback<T>
		extends GenericAsyncTaskCallback<T> {

	public ArrayList<T> inBackground(ArrayList<T> results) throws Exception {
		return results;
	}

	@Override
	public JSONArray inBackground(JSONArray jsonArray) throws Exception {
		results = new ArrayList<T>();

		for (int i = 0; i < jsonArray.length(); i++) {
			results.add(transform(jsonArray.get(i)));
		}

		results = inBackground(results);

		return null;
	}

	@Override
	public void onPostExecute(JSONArray jsonArray) throws Exception {
		onSuccess(results);
	}

	public abstract void onSuccess(ArrayList<T> results);

	@Override
	public void onSuccess(T result) {
	}

	protected ArrayList<T> results;

}