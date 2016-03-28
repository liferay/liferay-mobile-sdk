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

	public static final int DEFAULT_TIMEOUT = 15000;

	public static Config url(String url) {
		Config config = new Config(url);
		config.timeout(DEFAULT_TIMEOUT);

		return config;
	}

	public Authentication auth() {
		return auth;
	}

	public Config auth(Authentication auth) {
		this.auth = auth;
		return this;
	}

	public Config header(String key, String value) {
		this.headers.put(key, value);
		return this;
	}

	public Map<String, String> headers() {
		return headers;
	}

	public Config headers(Map<String, String> headers) {
		this.headers = headers;
		return this;
	}

	public int timeout() {
		return timeout;
	}

	public Config timeout(int timeout) {
		this.timeout = timeout;
		return this;
	}

	public String url() {
		return url;
	}

	protected Config(String url) {
		this.url = url;
	}

	protected Authentication auth;
	protected Map<String, String> headers = new HashMap<>();
	protected int timeout;
	protected String url;

}