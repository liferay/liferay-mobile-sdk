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

import com.liferay.mobile.sdk.exception.AuthenticationException;
import com.liferay.mobile.sdk.exception.RedirectException;
import com.liferay.mobile.sdk.exception.ServerException;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class ResponseValidator {

	public String validateBody(String json) throws ServerException {
		if (!isJSONObject(json)) {
			return json;
		}

		try {
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
		catch (JSONException jsone) {
			throw new ServerException(jsone);
		}

		return json;
	}

	public void validateStatusCode(Response response) throws ServerException {
		int status = response.statusCode();

		if ((status == Status.MOVED_PERMANENTLY) ||
			(status == Status.MOVED_TEMPORARILY) ||
			(status == Status.SEE_OTHER) ||
			(status == Status.TEMPORARY_REDIRECT)) {

			String url = response.headers().get(Headers.LOCATION);

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
		if (com.liferay.mobile.sdk.util.Validator.isNotNull(json) &&
			json.startsWith("{")) {

			return true;
		}

		return false;
	}

}