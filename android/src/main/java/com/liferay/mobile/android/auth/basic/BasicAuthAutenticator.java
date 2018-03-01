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

package com.liferay.mobile.android.auth.basic;

import com.liferay.mobile.android.http.Headers;

import com.squareup.okhttp.Authenticator;
import com.squareup.okhttp.Credentials;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

import java.net.Proxy;

/**
 * @author Victor Galan
 */
public class BasicAuthAutenticator extends BasicAuthentication
	implements Authenticator {

	public BasicAuthAutenticator(String username, String password) {
		super(username, password);
	}

	@Override
	public Request authenticate(Proxy proxy, Response response)
		throws IOException {

		String credential = Credentials.basic(username, password);
		return response.request().newBuilder().header(
			Headers.AUTHORIZATION, credential).build();
	}

	@Override
	public Request authenticateProxy(Proxy proxy, Response response)
		throws IOException {

		return null;
	}

}