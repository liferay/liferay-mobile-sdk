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
import com.liferay.mobile.sdk.http.ResponseValidator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bruno Farache
 */
public class Config {

	public synchronized static Config global() {
		return global;
	}

	public synchronized static void global(Config global) {
		Config.global = global;
	}

	public Authentication auth() {
		return auth;
	}

	public Map<String, String> headers() {
		return new HashMap<>(headers);
	}

	public Builder newBuilder() {
		return new Builder(this);
	}

	public String path() {
		return path;
	}

	public ResponseValidator responseValidator() {
		return responseValidator;
	}

	public String server() {
		return server;
	}

	public int timeout() {
		return timeout;
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

	public static class Builder {

		public static final int DEFAULT_TIMEOUT = 15000;

		public static final String PATH_61 = "api/secure/jsonws";

		public static final String PATH_62 = "api/jsonws";

		public Builder(String server) {
			this.headers = new HashMap<>();
			this.path = PATH_62;
			this.responseValidator = new ResponseValidator();
			this.server = server;
			this.timeout = DEFAULT_TIMEOUT;
		}

		public Builder auth(Authentication auth) {
			this.auth = auth;
			return this;
		}

		public Config build() {
			return new Config(this);
		}

		public Builder header(String key, String value) {
			headers.put(key, value);
			return this;
		}

		public Builder headers(Map<String, String> headers) {
			this.headers = headers;
			return this;
		}

		public Builder path(String path) {
			this.path = path;
			return this;
		}

		public Builder responseValidator(ResponseValidator responseValidator) {
			this.responseValidator = responseValidator;
			return this;
		}

		public Builder timeout(int timeout) {
			this.timeout = timeout;
			return this;
		}

		protected Builder(Config config) {
			this.auth = config.auth;
			this.headers = config.headers;
			this.path = config.path;
			this.responseValidator = config.responseValidator;
			this.server = config.server;
			this.timeout = config.timeout;
		}

		protected Authentication auth;
		protected Map<String, String> headers;
		protected String path;
		protected ResponseValidator responseValidator;
		protected String server;
		protected int timeout;

	}

	protected Config(Builder builder) {
		this.auth = builder.auth;
		this.headers = new HashMap<>(builder.headers);
		this.path = builder.path;
		this.responseValidator = builder.responseValidator;
		this.server = builder.server;
		this.timeout = builder.timeout;
	}

	protected static Config global;

	protected final Authentication auth;
	protected final Map<String, String> headers;
	protected final String path;
	protected final ResponseValidator responseValidator;
	protected final String server;
	protected final int timeout;

}