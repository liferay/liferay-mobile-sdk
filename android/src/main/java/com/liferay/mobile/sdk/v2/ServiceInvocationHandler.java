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

package com.liferay.mobile.sdk.v2;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.http.Headers.ContentType;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import java.util.Iterator;

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

		JSONObject body = new JSONObject();
		body.put(getPath(method), getParams(method, args));

		Path annotation = method.getAnnotation(Path.class);
		ContentType contentType = ContentType.JSON;

		if (annotation != null) {
			contentType = annotation.contentType();
		}

		return new Call(body, getType(method), contentType);
	}

	protected String getMethodPath(Method method) {
		Path annotation = method.getAnnotation(Path.class);

		if (annotation != null) {
			return annotation.value();
		}
		else {
			String methodName = method.getName();
			String regex = "([a-z])([A-Z]+)";
			String replacement = "$1-$2";
			methodName = methodName.replaceAll(regex, replacement);

			return "/" + methodName.toLowerCase();
		}
	}

	protected JSONObject getParams(Method method, Object[] args)
		throws JSONException {

		JSONObject params = new JSONObject();
		Annotation[][] annotations = method.getParameterAnnotations();

		for (int i = 0; i < annotations.length; i++) {
			for (Annotation paramAnnotation : annotations[i]) {
				Object value = args[i];

				if (paramAnnotation instanceof Param) {
					String name = ((Param)paramAnnotation).value();
					params.put(name, (value == null) ? JSONObject.NULL : value);
				}
				else if (paramAnnotation instanceof JsonObject) {
					JSONObject param = (JSONObject)value;
					JsonObject jsonAnnotation = (JsonObject)paramAnnotation;
					String className = jsonAnnotation.className();

					if (param != null) {
						mangle(
							jsonAnnotation.name(), jsonAnnotation.className(),
							param, params);
					}
					else if (!className.equals(_SERVICE_CONTEXT)) {
						params.put(jsonAnnotation.name(), JSONObject.NULL);
					}
				}
			}
		}

		return params;
	}

	protected String getPath(Method method) {
		return getRootPath() + getMethodPath(method);
	}

	protected String getRootPath() {
		Path annotation = service.getAnnotation(Path.class);

		if (annotation != null) {
			return annotation.value();
		}
		else {
			String className = service.getSimpleName();

			if (className.endsWith("Service")) {
				className = className.substring(0, className.length() - 7);

				return "/" + className.toLowerCase();
			}

			return "";
		}
	}

	protected Type getType(Method method) {
		ParameterizedType returnType =
			(ParameterizedType)method.getGenericReturnType();

		return returnType.getActualTypeArguments()[0];
	}

	protected void mangle(
			String name, String className, JSONObject param, JSONObject params)
		throws JSONException {

		params.put("+" + name, className);

		Iterator<String> it = param.keys();

		while (it.hasNext()) {
			String key = it.next();
			Object value = param.get(key);
			params.put(name + "." + key, value);
		}
	}

	protected Class<?> service;

	private static final String _SERVICE_CONTEXT =
		"com.liferay.portal.service.ServiceContext";

}