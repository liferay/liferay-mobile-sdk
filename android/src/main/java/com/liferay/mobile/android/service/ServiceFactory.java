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

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bruno Farache
 */
public class ServiceFactory {

	public static <T extends BaseService> T getService(
			Class<T> clazz, Session session)
		throws Exception {

		T instance = (T)_services.get(clazz.getName());

		if (instance == null) {
			instance = clazz.getDeclaredConstructor(Session.class).newInstance(
				session);

			_services.put(clazz.getName(), instance);
		}
		else {
			instance.setSession(session);
		}

		return instance;
	}

	private static Map<String, BaseService> _services =
		new HashMap<String, BaseService>();

}