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
import java.util.concurrent.TimeUnit;

/**
 * @author Javier Gamarra
 */
public class CookieAuthentication extends BasicAuthentication {

	public final static int COOKIE_EXPIRATION_TIME = 15 * 60;

	public CookieAuthentication(
		String authToken, String cookieHeader, String username,
		String password) {

		this(authToken, cookieHeader, username, password, true,
				COOKIE_EXPIRATION_TIME, System.currentTimeMillis());
	}

	public CookieAuthentication(
			String authToken, String cookieHeader, String username,
			String password, boolean shouldHandleExpiration, int cookieExpirationTime,
            long lastCookieRefresh) {

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

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public String getCookieHeader() {
		return cookieHeader;
	}

	public void setCookieHeader(String cookieHeader) {
		this.cookieHeader = cookieHeader;
	}

	public boolean shouldHandleExpiration() {
		return shouldHandleExpiration;
	}

	public void setShouldHandleExpiration(boolean shouldHandleExpiration) {
		this.shouldHandleExpiration = shouldHandleExpiration;
	}

	public int getCookieExpirationTime() {
		return cookieExpirationTime;
	}

	public void setCookieExpirationTime(int cookieExpirationTime) {
		this.cookieExpirationTime = cookieExpirationTime;
	}

	public long getLastCookieRefresh() {
		return lastCookieRefresh;
	}

	public void setLastCookieRefresh(long lastCookieRefresh) {
		this.lastCookieRefresh = lastCookieRefresh;
	}

	protected String authToken;
	protected String cookieHeader;
	protected boolean shouldHandleExpiration;
	protected int cookieExpirationTime;
	protected long lastCookieRefresh;

}