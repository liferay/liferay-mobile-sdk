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

package com.liferay.mobile.sdk.http;

import com.liferay.mobile.sdk.Config;
import com.liferay.mobile.sdk.auth.Authentication;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bruno Farache
 */
public class Request {

	public Authentication auth() {
		return auth;
	}

	public Object body() {
		return body;
	}

	public Map<String, String> headers() {
		return new HashMap<>(headers);
	}

	public Method method() {
		return method;
	}

	public Builder newBuilder() {
		return new Builder(this);
	}

	public Object tag() {
		return tag;
	}

	public int timeout() {
		return timeout;
	}

	public String url() {
		return url;
	}

	public static class Builder {

		public Builder(String url) {
			this.method = Method.POST;
			this.timeout = Config.Builder.DEFAULT_TIMEOUT;
			this.url = url;
			this.headers = new HashMap<>();
		}

		public Builder auth(Authentication auth) {
			this.auth = auth;
			return this;
		}

		public Builder body(Object body) {
			this.body = body;
			return this;
		}

		public Request build() {
			return new Request(this);
		}

		public Builder config(Config config) {
			auth(config.auth());
			headers(config.headers());
			timeout(config.timeout());

			return this;
		}

		public Builder header(String key, String value) {
			headers.put(key, value);
			return this;
		}

		public Builder headers(Map<String, String> headers) {
			this.headers = headers;
			return this;
		}

		public Builder method(Method method) {
			this.method = method;
			return this;
		}

		public Builder tag(Object tag) {
			this.tag = tag;
			return this;
		}

		public Builder timeout(int timeout) {
			this.timeout = timeout;
			return this;
		}

		protected Builder(Request request) {
			this.auth = request.auth;
			this.body = request.body;
			this.headers = request.headers;
			this.method = request.method;
			this.tag = request.tag;
			this.timeout = request.timeout;
			this.url = request.url;
		}

		protected Authentication auth;
		protected Object body;
		protected Map<String, String> headers;
		protected Method method;
		protected Object tag;
		protected int timeout;
		protected String url;

	}

	protected Request(Builder builder) {
		this.auth = builder.auth;
		this.body = builder.body;
		this.headers = new HashMap<>(builder.headers);
		this.method = builder.method;
		this.tag = (builder.tag != null) ? builder.tag : this;
		this.timeout = builder.timeout;
		this.url = builder.url;
	}

	protected final Authentication auth;
	protected final Object body;
	protected final Map<String, String> headers;
	protected final Method method;
	protected final Object tag;
	protected final int timeout;
	protected final String url;

}