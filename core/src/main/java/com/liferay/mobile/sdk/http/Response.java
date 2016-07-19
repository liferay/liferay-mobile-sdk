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

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Bruno Farache
 */
public class Response {

	public InputStream bodyAsStream() throws Exception {
		return response.body().byteStream();
	}

	public String bodyAsString() throws Exception {
		if (bodyAsString == null) {
			bodyAsString = response.body().string();
		}

		return bodyAsString;
	}

	public Map<String, String> headers() {
		if (headers == null) {
			headers = new HashMap<>();
			Map<String, List<String>> map = response.headers().toMultimap();

			for (Entry<String, List<String>> header : map.entrySet()) {
				headers.put(header.getKey(), header.getValue().get(0));
			}
		}

		return new HashMap<>(headers);
	}

	public Builder newBuilder() {
		return new Builder(this);
	}

	public int statusCode() {
		return response.code();
	}

	public static class Builder {

		public Builder(com.squareup.okhttp.Response response) {
			this.response = response;
		}

		public Builder(Response response) {
			this.response = response.response;
		}

		public Response build() {
			return new Response(this);
		}

		protected com.squareup.okhttp.Response response;

	}

	protected Response(Builder builder) {
		this.response = builder.response;
	}

	protected String bodyAsString;
	protected Map<String, String> headers;
	protected final com.squareup.okhttp.Response response;

}