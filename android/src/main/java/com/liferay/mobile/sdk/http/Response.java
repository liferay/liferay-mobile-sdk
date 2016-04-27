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

import java.io.InputStream;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Bruno Farache
 */
public class Response {

	public Response() {
		this(null);
	}

	public Response(com.squareup.okhttp.Response response) {
		this.response = response;
	}

	public String body() throws Exception {
		return response.body().string();
	}

	public InputStream bodyAsStream() throws Exception {
		return response.body().byteStream();
	}

	public Map<String, String> headers() {
		Map<String, List<String>> headers = response.headers().toMultimap();
		Map<String, String> map = new HashMap<>();

		for (Entry<String, List<String>> header : headers.entrySet()) {
			map.put(header.getKey(), header.getValue().get(0));
		}

		return Collections.unmodifiableMap(map);
	}

	public int statusCode() {
		return response.code();
	}

	protected com.squareup.okhttp.Response response;

}