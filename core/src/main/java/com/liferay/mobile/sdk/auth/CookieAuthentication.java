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

import com.liferay.mobile.sdk.http.Request;
import com.liferay.mobile.sdk.http.Request.Builder;

/**
 * @author Javier Gamarra
 */
public class CookieAuthentication implements Authentication {

	public CookieAuthentication(String authToken, String cookieHeader) {
		this.authToken = authToken;
		this.cookieHeader = cookieHeader;
	}

	@Override
	public Request authenticate(Request request) throws Exception {
		Builder builder = request.newBuilder();

		builder.header("Cookie", "COOKIE_SUPPORT=true; " + cookieHeader);
		builder.header("X-CSRF-Token", authToken);

		return builder.build();
	}

	public String authToken() {
		return authToken;
	}

	public String cookieHeader() {
		return cookieHeader;
	}

	protected String authToken;
	protected String cookieHeader;

}