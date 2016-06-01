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

package com.liferay.mobile.sdk.auth;

import com.liferay.mobile.sdk.http.Headers;
import com.liferay.mobile.sdk.http.Request;

import com.squareup.okhttp.Credentials;

/**
 * @author Bruno Farache
 */
public class BasicAuthentication implements Authentication {

	public BasicAuthentication(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public Request authenticate(Request request) {
		return request.newBuilder()
			.header(
				Headers.AUTHORIZATION, Credentials.basic(username, password))
			.build();
	}

	public String password() {
		return password;
	}

	public String username() {
		return username;
	}

	protected String password;
	protected String username;

}