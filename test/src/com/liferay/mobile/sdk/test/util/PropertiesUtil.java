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

package com.liferay.mobile.sdk.test.util;

import java.io.IOException;
import java.io.InputStream;

import java.util.Properties;

/**
 * @author Bruno Farache
 */
public class PropertiesUtil {

	public static final String LOGIN = "login";

	public static final String PASSWORD = "password";

	public static final String URL = "url";

	public PropertiesUtil() throws IOException {
		_properties = new Properties();

		InputStream is = getClass().getResourceAsStream("/test.properties");

		_properties.load(is);

		is = getClass().getResourceAsStream("/test.local.properties");

		if (is != null) {
			Properties localProperties = new Properties();

			localProperties.load(is);

			_properties.putAll(localProperties);
		}
	}

	public String getLogin() {
		if (_login == null) {
			_login = getProperty(LOGIN);
		}

		return _login;
	}

	public String getPassword() {
		if (_password == null) {
			_password = getProperty(PASSWORD);
		}

		return _password;
	}

	public String getProperty(String key) {
		return _properties.getProperty(key);
	}

	public String getUrl() {
		if (_url == null) {
			_url = getProperty(URL);
		}

		return _url;
	}

	private String _login;
	private String _password;
	private Properties _properties;
	private String _url;

}