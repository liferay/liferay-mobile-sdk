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

package com.liferay.mobile.android.service;

import com.liferay.mobile.android.auth.Authentication;
import com.liferay.mobile.android.callback.Callback;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bruno Farache
 */
public class SessionImpl implements Session {

	public static final int DEFAULT_CONNECTION_TIMEOUT = 15000;

	public SessionImpl(Session session) {
		this(
			session.getServer(), session.getAuthentication(),
			session.getConnectionTimeout(), session.getCallback());
	}

	public SessionImpl(String server) {
		this(server, null, null);
	}

	public SessionImpl(String server, Authentication authentication) {
		this(server, authentication, null);
	}

	public SessionImpl(
		String server, Authentication authentication, Callback callback) {

		this(server, authentication, DEFAULT_CONNECTION_TIMEOUT, callback);
	}

	public SessionImpl(
		String server, Authentication authentication, int connectionTimeout,
		Callback callback) {

		this.server = server;
		this.authentication = authentication;
		this.connectionTimeout = connectionTimeout;
		this.callback = callback;
	}

	public SessionImpl(String server, Callback callback) {
		this(server, null, callback);
	}

	@Override
	public Authentication getAuthentication() {
		return authentication;
	}

	@Override
	public Callback getCallback() {
		return callback;
	}

	@Override
	public int getConnectionTimeout() {
		return connectionTimeout;
	}

	@Override
	public Map<String, String> getHeaders() {
		return headers;
	}

	@Override
	public String getServer() {
		return server;
	}

	@Override
	public void setAuthentication(Authentication authentication) {
		this.authentication = authentication;
	}

	@Override
	public void setCallback(Callback callback) {
		this.callback = callback;
	}

	@Override
	public void setConnectionTimeout(int connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
	}

	@Override
	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}

	@Override
	public void setServer(String server) {
		this.server = server;
	}

	protected Authentication authentication;
	protected Callback callback;
	protected int connectionTimeout;
	protected Map<String, String> headers = new HashMap<>();
	protected String server;

}