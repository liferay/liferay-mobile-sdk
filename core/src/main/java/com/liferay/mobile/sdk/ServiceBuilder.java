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

package com.liferay.mobile.sdk;

import com.liferay.mobile.sdk.adapter.ReturnTypeAdapter;

import java.lang.reflect.Proxy;
import java.lang.reflect.Type;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bruno Farache
 */
public class ServiceBuilder {

	public static <T> T build(Class<T> clazz) {
		Object proxy = Proxy.newProxyInstance(
			clazz.getClassLoader(), new Class<?>[] { clazz },
			new ServiceInvocationHandler(clazz));

		return (T)proxy;
	}

	public synchronized static void registerReturnTypeAdapter(
		ReturnTypeAdapter adapter) {

		returnTypeAdapters.put(adapter.type(), adapter);
	}

	public synchronized static Map<Type, ReturnTypeAdapter>
		returnTypeAdapters() {

		return new HashMap<>(returnTypeAdapters);
	}

	protected static final Map<Type, ReturnTypeAdapter> returnTypeAdapters =
		new HashMap<>();

}