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

package com.liferay.mobile.android.http;

import com.liferay.mobile.android.auth.Authentication;
import com.liferay.mobile.android.service.Config;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bruno Farache
 */
public class Request {

	public static Request url(String url) {
		Request request = new Request(url);
		request.tag(request);
		request.timeout(Config.DEFAULT_TIMEOUT);
		request.method(Method.POST);

		return request;
	}

	public Authentication auth() {
		return auth;
	}

	public Request auth(Authentication auth) {
		this.auth = auth;
		return this;
	}

	public Object body() {
		return body;
	}

	public Request body(Object body) {
		this.body = body;
		return this;
	}

	public Request config(Config config) {
		auth(config.auth());
		headers(config.headers());
		timeout(config.timeout());

		return this;
	}

	public Request header(String key, String value) {
		headers.put(key, value);
		return this;
	}

	public Map<String, String> headers() {
		return headers;
	}

	public Request headers(Map<String, String> headers) {
		this.headers = new HashMap<>(headers);
		return this;
	}

	public Method method() {
		return method;
	}

	public Request method(Method method) {
		this.method = method;
		return this;
	}

	public Object tag() {
		return tag;
	}

	public Request tag(Object tag) {
		this.tag = tag;
		return this;
	}

	public int timeout() {
		return timeout;
	}

	public Request timeout(int timeout) {
		this.timeout = timeout;
		return this;
	}

	public String url() {
		return url;
	}

	protected Request(String url) {
		this.url = url;
	}

	protected Authentication auth;
	protected Object body;
	protected Map<String, String> headers = new HashMap<>();
	protected Method method;
	protected Object tag;
	protected int timeout;
	protected String url;

}