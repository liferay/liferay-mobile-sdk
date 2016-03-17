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

package com.liferay.mobile.android.http;

/**
 * @author Bruno Farache
 * @author Silvio Santos
 */
public class HttpUtil {

	public static final String JSONWS_PATH_61 = "api/secure/jsonws";

	public static final String JSONWS_PATH_62 = "api/jsonws";

	@SuppressWarnings("unused")
	public static void setJSONWSPath(String jsonwsPath) {
		_JSONWS_PATH = jsonwsPath;
	}

	private static String _JSONWS_PATH = JSONWS_PATH_62;

}