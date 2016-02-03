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

package com.liferay.mobile.android.v2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class ServiceInvocationHandler implements InvocationHandler {

	public ServiceInvocationHandler(Class<?> service) {
		this.service = service;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
		throws Throwable {

		JSONObject command = new JSONObject();
		command.put(getPath(method), getParams(method, args));

		return new Call(command, getType(method));
	}

	protected JSONObject getParams(Method method, Object[] args)
		throws JSONException {

		JSONObject params = new JSONObject();
		Annotation[][] annotations = method.getParameterAnnotations();

		for (int i = 0; i < annotations.length; i++) {
			for (Annotation paramAnnotation : annotations[i]) {
				if (!(paramAnnotation instanceof Param)) {
					continue;
				}

				String name = ((Param)paramAnnotation).value();
				params.put(name, args[i]);
			}
		}

		return params;
	}

	protected String getPath(Method method) {
		StringBuilder sb = new StringBuilder();
		Path servicePath = service.getAnnotation(Path.class);

		if (servicePath != null) {
			sb.append(servicePath.value());
		}

		Path methodPath = method.getAnnotation(Path.class);
		sb.append(methodPath.value());

		return sb.toString();
	}

	protected Type getType(Method method) {
		ParameterizedType returnType =
			(ParameterizedType)method.getGenericReturnType();

		return returnType.getActualTypeArguments()[0];
	}

	protected Class<?> service;

}