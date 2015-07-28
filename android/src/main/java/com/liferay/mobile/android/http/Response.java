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

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author Bruno Farache
 */
public class Response {

	public Response(
		int status, Map<String, List<String>> headers, String body) {

		_status = status;
		_headers = headers;
		_body = body;
	}

	public String getBody() {
		return _body;
	}

	public Map<String, List<String>> getHeaders() {
		return Collections.unmodifiableMap(_headers);
	}

	public int getStatus() {
		return _status;
	}

	private String _body;
	private Map<String, List<String>> _headers;
	private int _status;

}