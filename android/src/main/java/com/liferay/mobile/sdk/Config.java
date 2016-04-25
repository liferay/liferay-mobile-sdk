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

package com.liferay.mobile.sdk;

import com.liferay.mobile.sdk.auth.Authentication;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bruno Farache
 */
public class Config {

	public static final int DEFAULT_TIMEOUT = 15000;

	public static final String PATH_61 = "api/secure/jsonws";

	public static final String PATH_62 = "api/jsonws";

	public static Config server(String server) {
		Config config = new Config(server);
		config.timeout(DEFAULT_TIMEOUT);
		config.path(PATH_62);

		return config;
	}

	public Authentication auth() {
		return auth;
	}

	public Config auth(Authentication auth) {
		this.auth = auth;
		return this;
	}

	public Config clone() {
		return new Config(this);
	}

	public synchronized static Config global() {
		return global;
	}

	public synchronized static void global(Config global) {
		Config.global = global;
	}

	public Config header(String key, String value) {
		headers.put(key, value);
		return this;
	}

	public Map<String, String> headers() {
		return new HashMap<>(headers);
	}

	public Config headers(Map<String, String> headers) {
		this.headers = headers;
		return this;
	}

	public String path() {
		return path;
	}

	public Config path(String path) {
		this.path = path;
		return this;
	}

	public String server() {
		return server;
	}

	public int timeout() {
		return timeout;
	}

	public Config timeout(int timeout) {
		this.timeout = timeout;
		return this;
	}

	public String url() {
		StringBuilder sb = new StringBuilder();
		sb.append(server);

		if (!server.endsWith("/")) {
			sb.append("/");
		}

		sb.append(path);

		return sb.toString();
	}

	protected Config(Config config) {
		this.auth = config.auth();
		this.headers = config.headers();
		this.path = config.path();
		this.server = config.server();
		this.timeout = config.timeout();
	}

	protected Config(String server) {
		this.server = server;
	}

	protected static Config global;

	protected Authentication auth;
	protected Map<String, String> headers = new HashMap<>();
	protected String path;
	protected String server;
	protected int timeout;

}