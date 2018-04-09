/**
 * Copyright (c) 2014 Andrea Di Giorgi. All rights reserved.
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

package com.liferay.mobile.windows;

import com.liferay.mobile.sdk.util.CharPool;
import com.liferay.mobile.sdk.util.LanguageUtil;
import com.liferay.mobile.sdk.util.Validator;

/**
 * @author Andrea Di Giorgi (adigiorgi@outlook.com)
 */
public class CSharpUtil extends LanguageUtil {

	public static final String BOOL = "bool";

	public static final String DYNAMIC = "dynamic";

	public static final String IDICTIONARY = "IDictionary<string, object>";

	public static final String IDICTIONARY_STRING =
		"IDictionary<string, string>";

	public static final String IENUMERABLE = "IEnumerable";

	public static final String JSON_OBJECT_WRAPPER = "JsonObjectWrapper";

	public static final String MAP_STRING = "map<string,string>";

	public static final String OBJECT = "object";

	public static final String STREAM = "Stream";

	public String getIEnumerableCastType(String type) {
		if (!isArray(type)) {
			return _BLANK;
		}

		String ienumerableCastType;

		if (type.endsWith("[]")) {
			ienumerableCastType = type.substring(0, type.length() - 2);
		}
		else if (type.startsWith("list<")) {
			ienumerableCastType = type.substring(5, type.length() - 1);
		}
		else {
			return _BLANK;
		}

		if (!ienumerableCastType.equals(BOOLEAN) &&
			!ienumerableCastType.equals(DOUBLE) &&
			!ienumerableCastType.equals(INT) &&
			!ienumerableCastType.equals(LONG) &&
			!ienumerableCastType.equals(STRING)) {

			return _BLANK;
		}

		return getType(ienumerableCastType);
	}

	@Override
	public String getMethodName(String path) {
		String last = getMethodURL(path);

		String[] methodName = last.split("-");

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < methodName.length; i++) {
			String word = capitalize(methodName[i]);

			sb.append(word);
		}

		sb.append("Async");

		return sb.toString();
	}

	public String getParameterName(String parameterName) {
		if (parameterName.equals("params")) {
			return CharPool.UNDERLINE + parameterName;
		}

		return parameterName;
	}

	public String getReturnType(String type) {
		type = getType(type);

		if (type.equals(INT)) {
			return LONG;
		}

		if (type.equals(JSON_OBJECT_WRAPPER)) {
			return DYNAMIC;
		}

		if (type.equals(getIEnumerableType(OBJECT))) {
			return getIEnumerableType(DYNAMIC);
		}

		return type;
	}

	public String getType(String type) {
		if (type.equals(BYTE_ARRAY) || type.equals(DOUBLE) ||
			type.equals(INT) || type.equals(LONG) || type.equals(STRING) ||
			type.equals(VOID)) {

			return type;
		}

		if (isArray(type)) {
			String ienumerableCastType = getIEnumerableCastType(type);

			if (Validator.isNull(ienumerableCastType)) {
				ienumerableCastType = OBJECT;
			}

			return getIEnumerableType(ienumerableCastType);
		}

		if (type.equals(BOOLEAN)) {
			return BOOL;
		}

		if (type.equals(FILE)) {
			return STREAM;
		}

		if (type.equals(MAP_STRING)) {
			return IDICTIONARY_STRING;
		}

		if (type.startsWith(OBJECT_PREFIX)) {
			return JSON_OBJECT_WRAPPER;
		}

		return IDICTIONARY;
	}

	protected String getIEnumerableType(String type) {
		StringBuilder sb = new StringBuilder();

		sb.append(IENUMERABLE);
		sb.append(CharPool.LESS_THAN);
		sb.append(type);
		sb.append(CharPool.GREATER_THAN);

		return sb.toString();
	}

	private static final String _BLANK = "";

}