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

import com.squareup.okhttp.ResponseBody;

import java.io.IOException;
import java.io.InputStream;

import java.util.Collections;
import java.util.Map;

/**
 * @author Bruno Farache
 */
public class Response {

	public String getBody() throws IOException {
		return _body.string();
	}

	public InputStream getBodyAsStream() throws IOException {
		return _body.byteStream();
	}

	public Map<String, String> getHeaders() {
		return Collections.unmodifiableMap(_headers);
	}

	public int getStatusCode() {
		return _statusCode;
	}

	protected Response(
		int statusCode, Map<String, String> headers, ResponseBody body) {

		_statusCode = statusCode;
		_headers = headers;
		_body = body;
	}

	private ResponseBody _body;
	private Map<String, String> _headers;
	private int _statusCode;

}