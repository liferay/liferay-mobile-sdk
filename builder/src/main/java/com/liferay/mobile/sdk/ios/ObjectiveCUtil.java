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

package com.liferay.mobile.sdk.ios;

import com.liferay.mobile.sdk.util.LanguageUtil;

/**
 * @author Bruno Farache
 */
public class ObjectiveCUtil extends LanguageUtil {

	public static final String BOOL = "BOOL";

	public static final String LONG_LONG = "long long";

	public static final String LR_JSON_OBJECT_WRAPPER = "LRJSONObjectWrapper *";

	public static final String LR_UPLOAD_DATA = "LRUploadData *";

	public static final String NS_ARRAY = "NSArray *";

	public static final String NS_DATA = "NSData *";

	public static final String NS_DICTIONARY = "NSDictionary *";

	public static final String NS_NUMBER = "NSNumber *";

	public static final String NS_STRING = "NSString *";

	public String getParamValue(String name, String type) {
		type = getType(type);

		if (type.equals(BOOL) || type.equals(DOUBLE) || type.equals(INT) ||
			type.equals(LONG_LONG)) {

			name = "@("  + name + ")";
		}
		else if (type.equals(NS_DATA)) {
			name = "[self toString:" + name + "]";
		}
		else {
			name = "[self checkNull: " + name + "]";
		}

		return name;
	}

	public String getReturnType(String type) {
		type = getType(type);

		if (type.equals(DOUBLE) || type.equals(INT) || type.equals(LONG_LONG)) {
			type = NS_NUMBER;
		}

		if (type.equals(LR_JSON_OBJECT_WRAPPER) ||
			type.equals(LR_UPLOAD_DATA)) {

			return NS_DICTIONARY;
		}

		if (type.equals(NS_DATA)) {
			return NS_ARRAY;
		}

		return type;
	}

	public String getType(String type) {
		type = super.getType(type);

		if (type.equals(DOUBLE) || type.equals(INT) || type.equals(VOID)) {
			return type;
		}

		if (type.equals(BYTE_ARRAY)) {
			return NS_DATA;
		}

		if (isArray(type)) {
			return NS_ARRAY;
		}

		if (type.equals(BOOLEAN)) {
			return BOOL;
		}

		if (type.equals(LONG)) {
			return LONG_LONG;
		}

		if (type.equals(STRING)) {
			return NS_STRING;
		}

		if (type.equals(FILE)) {
			return LR_UPLOAD_DATA;
		}

		if (type.startsWith(OBJECT_PREFIX)) {
			return LR_JSON_OBJECT_WRAPPER;
		}

		return NS_DICTIONARY;
	}

}