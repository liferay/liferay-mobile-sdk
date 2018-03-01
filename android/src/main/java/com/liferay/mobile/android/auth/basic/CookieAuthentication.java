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

import com.liferay.mobile.android.http.Request;

import java.util.Map;

/**
 * @author Javier Gamarra
 */
public class CookieAuthentication extends BasicAuthentication {

	public CookieAuthentication(
		String authToken, String cookieHeader, String username,
		String password) {

		this(authToken, cookieHeader, username, password, true,
			COOKIE_EXPIRATION_TIME, System.currentTimeMillis());
	}

	public CookieAuthentication(
			String authToken, String cookieHeader, String username,
			String password, boolean shouldHandleExpiration,
			int cookieExpirationTime, long lastCookieRefresh) {

		super(username, password);

		this.authToken = authToken;
		this.cookieHeader = cookieHeader;
		this.shouldHandleExpiration = shouldHandleExpiration;
		this.cookieExpirationTime = cookieExpirationTime;
		this.lastCookieRefresh = lastCookieRefresh;
	}

	@Override
	public void authenticate(Request request) {
		Map<String, String> headers = request.getHeaders();
		headers.put("Cookie", "COOKIE_SUPPORT=true; " + cookieHeader);
		headers.put("X-CSRF-Token", authToken);
	}

	public String getAuthToken() {
		return authToken;
	}

	public int getCookieExpirationTime() {
		return cookieExpirationTime;
	}

	public String getCookieHeader() {
		return cookieHeader;
	}

	public long getLastCookieRefresh() {
		return lastCookieRefresh;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public void setCookieExpirationTime(int cookieExpirationTime) {
		this.cookieExpirationTime = cookieExpirationTime;
	}

	public void setCookieHeader(String cookieHeader) {
		this.cookieHeader = cookieHeader;
	}

	public void setLastCookieRefresh(long lastCookieRefresh) {
		this.lastCookieRefresh = lastCookieRefresh;
	}

	public void setShouldHandleExpiration(boolean shouldHandleExpiration) {
		this.shouldHandleExpiration = shouldHandleExpiration;
	}

	public boolean shouldHandleExpiration() {
		return shouldHandleExpiration;
	}

	public final static int COOKIE_EXPIRATION_TIME = 15 * 60;

	protected String authToken;
	protected int cookieExpirationTime;
	protected String cookieHeader;
	protected long lastCookieRefresh;
	protected boolean shouldHandleExpiration;

}