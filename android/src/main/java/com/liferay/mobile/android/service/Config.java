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

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bruno Farache
 */
public class Config {

	public static final int DEFAULT_CONNECTION_TIMEOUT = 15000;

	public Config(Config config) {
		this(
			config.getServer(), config.getAuthentication(),
			config.getConnectionTimeout());
	}

	public Config(String server) {
		this(server, null);
	}

	public Config(String server, Authentication authentication) {
		this(server, authentication, DEFAULT_CONNECTION_TIMEOUT);
	}

	public Config(
		String server, Authentication authentication, int connectionTimeout) {

		this.server = server;
		this.authentication = authentication;
		this.connectionTimeout = connectionTimeout;
	}

	public Authentication getAuthentication() {
		return authentication;
	}

	public int getConnectionTimeout() {
		return connectionTimeout;
	}

	public Map<String, String> getHeaders() {
		return headers;
	}

	public String getServer() {
		return server;
	}

	public void setAuthentication(Authentication authentication) {
		this.authentication = authentication;
	}

	public void setConnectionTimeout(int connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
	}

	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}

	public void setServer(String server) {
		this.server = server;
	}

	protected Authentication authentication;
	protected int connectionTimeout;
	protected Map<String, String> headers = new HashMap<>();
	protected String server;

}