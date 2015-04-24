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

package com.liferay.mobile.android.util;

import java.io.IOException;
import java.io.InputStream;

import java.util.Properties;

/**
 * @author Bruno Farache
 */
public class PropertiesUtil {

	public static final String COMPANY_ID = "companyId";

	public static final String GROUP_ID = "groupId";

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

	public long getCompanyId() {
		return Long.valueOf(getProperty(COMPANY_ID));
	}

	public long getGroupId() {
		return Long.valueOf(getProperty(GROUP_ID));
	}

	public String getLogin() {
		return getProperty(LOGIN);
	}

	public String getPassword() {
		return getProperty(PASSWORD);
	}

	public String getProperty(String key) {
		return _properties.getProperty(key);
	}

	public String getUrl() {
		return getProperty(URL);
	}

	private Properties _properties;

}