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

package com.liferay.mobile.android;

import com.liferay.mobile.android.auth.Authentication;
import com.liferay.mobile.android.auth.basic.BasicAuthentication;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.service.SessionImpl;
import com.liferay.mobile.android.util.PropertiesUtil;

import java.io.IOException;

/**
 * @author Bruno Farache
 */
public abstract class BaseTest {

	public BaseTest() throws IOException {
		props = new PropertiesUtil();

		Authentication authentication = new BasicAuthentication(
			props.getLogin(), props.getPassword());

		session = new SessionImpl(props.getUrl(), authentication);
	}

	protected PropertiesUtil props;
	protected Session session;

}