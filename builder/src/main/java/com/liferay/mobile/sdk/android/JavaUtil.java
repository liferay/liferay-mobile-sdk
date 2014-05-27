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

package com.liferay.mobile.sdk.android;

import com.liferay.mobile.sdk.util.LanguageUtil;

import org.apache.commons.lang.WordUtils;

/**
 * @author Bruno Farache
 */
public class JavaUtil extends LanguageUtil {

	public String getReturnType(String type) {
		type = getType(type);

		if (type.equals("void")) {
			return type;
		}

		if (type.equals("int")) {
			return "Integer";
		}

		if (type.equals("JSONObjectWrapper") ||
			type.equals(
				"org.apache.http.entity.mime.content.InputStreamBody")) {

			return "JSONObject";
		}

		return WordUtils.capitalize(type);
	}

	public String getType(String type) {
		if (isArray(type)) {
			return "JSONArray";
		}

		if (type.equals("boolean") || type.equals("double") ||
			type.equals("int") || type.equals("long") || type.equals("void")) {

			return type;
		}

		if (type.equals("string")) {
			return "String";
		}

		if (type.equals("object<java.io.File>")) {
			return "org.apache.http.entity.mime.content.InputStreamBody";
		}

		if (type.startsWith("object<")) {
			return "JSONObjectWrapper";
		}

		return "JSONObject";
	}

}