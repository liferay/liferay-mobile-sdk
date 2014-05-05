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

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class BaseService {

	public BaseService(Session session) {
		this.session = session;
	}

	public Session getSession() {
		return session;
	}

	public void mangleWrapper(
			JSONObject params, String name, String className,
			JSONObjectWrapper wrapper)
		throws JSONException {

		if (wrapper == null) {
			return;
		}

		wrapper.mangle(params, name, className);
	}

	public void setSession(Session session) {
		this.session = session;
	}

	protected Session session;

}