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

import com.liferay.mobile.android.util.Validator;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class BaseService {

	public BaseService(Session session) {
		this.session = session;
	}

	public Object checkNull(Object object) {
		if (object == null) {
			return JSONObject.NULL;
		}

		return object;
	}

	public Session getSession() {
		return session;
	}

	public void mangleWrapper(
			JSONObject params, String name, String className,
			JSONObjectWrapper wrapper)
		throws JSONException {

		if (wrapper == null) {
			if (!className.equals(_SERVICE_CONTEXT_62) &&
				!className.equals(_SERVICE_CONTEXT_70)) {

				params.put(name, JSONObject.NULL);
			}

			return;
		}

		wrapper.mangle(params, name, className);
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public Object toString(byte[] bytes) {
		if (Validator.isNull(bytes)) {
			return JSONObject.NULL;
		}

		StringBuilder sb = new StringBuilder("[");

		for (int i = 0; i < bytes.length; i++) {
			if (i > 0) {
				sb.append(",");
			}

			sb.append((int)bytes[i]);
		}

		sb.append("]");

		return sb.toString();
	}

	protected Session session;

	private static final String _SERVICE_CONTEXT_62 =
		"com.liferay.portal.service.ServiceContext";

	private static final String _SERVICE_CONTEXT_70 =
		"com.liferay.portal.kernel.service.ServiceContext";

}