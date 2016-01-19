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

import com.liferay.mobile.android.exception.AuthenticationException;
import com.liferay.mobile.android.exception.RedirectException;
import com.liferay.mobile.android.exception.ServerException;
import com.liferay.mobile.android.util.Validator;

import java.io.InputStream;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class Response {

	public Response() {
		this(null);
	}

	public Response(com.squareup.okhttp.Response response) {
		_response = response;
	}

	public String getBody() throws Exception {
		String body = _response.body().string();

		checkStatusCode();
		checkPortalException(body);

		return body;
	}

	public InputStream getBodyAsStream() throws Exception {
		checkStatusCode();

		return _response.body().byteStream();
	}

	public Map<String, String> getHeaders() {
		Map<String, List<String>> headers = _response.headers().toMultimap();

		Map<String, String> map = new HashMap<String, String>();

		for (Map.Entry<String, List<String>> header : headers.entrySet()) {
			map.put(header.getKey(), header.getValue().get(0));
		}

		return Collections.unmodifiableMap(map);
	}

	public int getStatusCode() {
		return _response.code();
	}

	protected void checkPortalException(String json) throws ServerException {
		try {
			if (isJSONObject(json)) {
				JSONObject jsonObj = new JSONObject(json);

				if (jsonObj.has("exception")) {
					String message = jsonObj.getString("exception");
					String detail = jsonObj.optString("message", null);

					JSONObject error = jsonObj.optJSONObject("error");

					if (error != null) {
						message = error.getString("type");
						detail = error.getString("message");
					}

					if ((message != null) &&
						message.equals("java.lang.SecurityException")) {

						throw new AuthenticationException(message, detail);
					}

					throw new ServerException(message, detail);
				}
			}
		}
		catch (JSONException je) {
			throw new ServerException(je);
		}
	}

	protected void checkStatusCode() throws ServerException {
		int status = getStatusCode();

		if ((status == Status.MOVED_PERMANENTLY) ||
			(status == Status.MOVED_TEMPORARILY) ||
			(status == Status.SEE_OTHER) ||
			(status == Status.TEMPORARY_REDIRECT)) {

			String url = getHeaders().get(Headers.LOCATION);

			if (url.endsWith("/")) {
				url = url.substring(0, url.length() - 1);
			}

			throw new RedirectException(url);
		}

		if (status == Status.UNAUTHORIZED) {
			throw new AuthenticationException(
				"Authentication failed.", "HTTP Status Code 401");
		}

		if (status != Status.OK) {
			throw new ServerException(
				"Request failed. Response code: " + status);
		}
	}

	protected boolean isJSONObject(String json) {
		if (Validator.isNotNull(json) && json.startsWith("{")) {
			return true;
		}

		return false;
	}

	private com.squareup.okhttp.Response _response;

}