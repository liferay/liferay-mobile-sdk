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

package com.liferay.mobile.android.service;

import com.liferay.mobile.android.util.CharPool;
import com.liferay.mobile.android.util.Validator;

import java.util.Iterator;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class BaseService {

	public BaseService(Session session) {
		this.session = session;
	}

	public void explode(
			JSONObject params, String type, String name,
			JSONObjectWrapper wrapper)
		throws JSONException {

		if (wrapper == null) {
			return;
		}

		addClassName(params, type, name, wrapper.getClassName());
		addJSONObject(params, name, wrapper.getJSONObject());
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	protected void addClassName(
			JSONObject params, String type, String name, String className)
		throws JSONException {

		StringBuilder sb = new StringBuilder();

		sb.append(CharPool.PLUS);
		sb.append(name);

		if (Validator.isNull(className)) {
			className = type;
		}

		params.put(sb.toString(), className);
	}

	protected void addJSONObject(
			JSONObject params, String name, JSONObject jsonObject)
		throws JSONException {

		Iterator<String> it = jsonObject.keys();

		while (it.hasNext()) {
			String key = it.next();
			Object value = jsonObject.get(key);

			StringBuilder sb = new StringBuilder();

			sb.append(name);
			sb.append(CharPool.PERIOD);
			sb.append(key);

			params.put(sb.toString(), value);
		}
	}

	protected Session session;

}