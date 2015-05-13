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

package com.liferay.mobile.sdk.android;

import com.liferay.mobile.sdk.util.LanguageUtil;

import org.apache.commons.lang.WordUtils;

/**
 * @author Bruno Farache
 */
public class JavaUtil extends LanguageUtil {

	public static final String INPUT_STREAM_BODY =
		"com.liferay.mobile.android.service.InputStreamBodyWrapper";

	public static final String INTEGER = "Integer";

	public static final String JSON_ARRAY = "JSONArray";

	public static final String JSON_OBJECT = "JSONObject";

	public static final String JSON_OBJECT_WRAPPER = "JSONObjectWrapper";

	public String getReturnType(String type) {
		type = getType(type);

		if (type.equals(VOID)) {
			return type;
		}

		if (type.equals(INT)) {
			return INTEGER;
		}

		if (type.equals(JSON_OBJECT_WRAPPER) ||
			type.equals(INPUT_STREAM_BODY)) {

			return JSON_OBJECT;
		}

		if (type.equals(BYTE_ARRAY)) {
			return JSON_ARRAY;
		}

		return WordUtils.capitalize(type);
	}

	public String getType(String type) {
		type = super.getType(type);

		if (type.equals(BOOLEAN) || type.equals(BYTE_ARRAY) ||
			type.equals(DOUBLE) || type.equals(INT) || type.equals(LONG) ||
			type.equals(VOID)) {

			return type;
		}

		if (isArray(type)) {
			return JSON_ARRAY;
		}

		if (type.equals(STRING)) {
			return "String";
		}

		if (type.equals(FILE)) {
			return INPUT_STREAM_BODY;
		}

		if (type.startsWith(OBJECT_PREFIX)) {
			return JSON_OBJECT_WRAPPER;
		}

		return JSON_OBJECT;
	}

	public boolean isPrimitive(String type) {
		if (type.equals(BOOLEAN) || type.equals(DOUBLE) || type.equals(INT) ||
			type.equals(LONG)) {

			return true;
		}

		return false;
	}

}