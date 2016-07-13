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
import com.liferay.mobile.android.callback.Callback;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bruno Farache
 */
public class Request {

	public Request(
		Authentication authentication, Method method,
		Map<String, String> headers, String url, Object body,
		int connectionTimeout, Callback callback) {

		this(
			authentication, method, headers, url, body, connectionTimeout,
			callback, null);
	}

	public Request(
		Authentication authentication, Method method,
		Map<String, String> headers, String url, Object body,
		int connectionTimeout, Callback callback, Object tag) {

		_authentication = authentication;
		_method = method;

		if (headers != null) {
			_headers = new HashMap<String, String>(headers);
		}

		_url = url;
		_body = body;
		_connectionTimeout = connectionTimeout;
		_callback = callback;

		if (tag == null) {
			tag = this;
		}

		_tag = tag;
	}

	public Request(
		Method method, Map<String, String> headers, String url, Object body,
		int connectionTimeout) {

		this(null, method, headers, url, body, connectionTimeout, null);
	}

	public Authentication getAuthentication() {
		return _authentication;
	}

	public Object getBody() {
		return _body;
	}

	public Callback getCallback() {
		return _callback;
	}

	public int getConnectionTimeout() {
		return _connectionTimeout;
	}

	public Map<String, String> getHeaders() {
		return _headers;
	}

	public Method getMethod() {
		return _method;
	}

	public Object getTag() {
		return _tag;
	}

	public String getURL() {
		return _url;
	}

	public void setAuthentication(Authentication _authentication) {
		this._authentication = _authentication;
	}

	public void setBody(Object body) {
		_body = body;
	}

	public void setCallback(Callback callback) {
		this._callback = callback;
	}

	public void setConnectionTimeout(int connectionTimeout) {
		_connectionTimeout = connectionTimeout;
	}

	public void setHeaders(Map<String, String> headers) {
		_headers = headers;
	}

	public void setMethod(Method method) {
		_method = method;
	}

	public void setURL(String url) {
		_url = url;
	}

	private Authentication _authentication;
	private Object _body;
	private Callback _callback;
	private int _connectionTimeout;
	private Map<String, String> _headers = new HashMap<String, String>();
	private Method _method;
	private Object _tag;
	private String _url;

}