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

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bruno Farache
 */
public class Request {

	public Request(
		Method method, Map<String, String> headers, String url, String body,
		int connectionTimeout) {

		_method = method;

		if (headers != null) {
			_headers = new HashMap<String, String>(headers);
		}

		_url = url;
		_body = body;
		_connectionTimeout = connectionTimeout;
	}

	public String getBody() {
		return _body;
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

	public String getURL() {
		return _url;
	}

	public void setBody(String body) {
		_body = body;
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

	private String _body;
	private int _connectionTimeout;
	private Map<String, String> _headers = new HashMap<String, String>();
	private Method _method;
	private String _url;

}