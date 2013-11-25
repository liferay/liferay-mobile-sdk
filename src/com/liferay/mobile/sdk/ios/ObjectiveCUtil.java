/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

	public String getParamValue(String name, String type) {
		type = getType(type);

		if (type.equals("BOOL") || type.equals("double") ||
			type.equals("int") || type.equals("long")) {

			name = "@("  + name + ")";
		}

		return name;
	}

	public String getReturnType(String type) {
		type = getType(type);

		if (type.equals("double") || type.equals("int") ||
			type.equals("long")) {

			type =  "NSNumber *";
		}

		return type;
	}

	public String getType(String type) {
		if (type.endsWith("[]") || type.equals("object<list>") ||
			type.startsWith("list")) {

			return "NSArray *";
		}

		if (type.equals("void")) {
			return "void";
		}

		if (type.equals("boolean")) {
			return "BOOL";
		}

		if (type.equals("double") || type.equals("int") ||
			type.equals("long")) {

			return type;
		}

		if (type.equals("string")) {
			return "NSString *";
		}

		return "NSDictionary *";
	}

}