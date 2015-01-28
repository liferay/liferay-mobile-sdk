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

package com.liferay.mobile.android.service;

import com.liferay.mobile.android.util.CharPool;
import com.liferay.mobile.android.util.Validator;

import java.util.Iterator;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class JSONObjectWrapper {

	public JSONObjectWrapper(JSONObject jsonObject) {
		this(null, jsonObject);
	}

	public JSONObjectWrapper(String className, JSONObject jsonObject) {
		_className = className;
		_jsonObject = jsonObject;
	}

	public String getClassName() {
		return _className;
	}

	public JSONObject getJSONObject() {
		return _jsonObject;
	}

	public void mangle(JSONObject params, String name, String className)
		throws JSONException {

		addClassName(params, name, className);
		addJSONObject(params, name);
	}

	public void setClassName(String className) {
		_className = className;
	}

	public void setJSONObject(JSONObject jsonObject) {
		_jsonObject = jsonObject;
	}

	protected void addClassName(
			JSONObject params, String name, String className)
		throws JSONException {

		StringBuilder sb = new StringBuilder();

		sb.append(CharPool.PLUS);
		sb.append(name);

		if (Validator.isNull(_className)) {
			_className = className;
		}

		params.put(sb.toString(), _className);
	}

	protected void addJSONObject(JSONObject params, String name)
		throws JSONException {

		Iterator<String> it = _jsonObject.keys();

		while (it.hasNext()) {
			String key = it.next();
			Object value = _jsonObject.get(key);

			StringBuilder sb = new StringBuilder();

			sb.append(name);
			sb.append(CharPool.PERIOD);
			sb.append(key);

			params.put(sb.toString(), value);
		}
	}

	private String _className;
	private JSONObject _jsonObject;

}