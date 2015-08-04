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
import com.liferay.mobile.android.http.client.HttpClient;
import com.liferay.mobile.android.http.client.OkHttpClientImpl;
import com.liferay.mobile.android.http.file.FileProgressCallback;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.util.Validator;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 * @author Silvio Santos
 */
public class HttpUtil {

	public static final String JSONWS_PATH_61 = "api/secure/jsonws";

	public static final String JSONWS_PATH_62 = "api/jsonws";

	public static void cancel(Object tag) {
		client.cancel(tag);
	}

	public static void checkPortalException(String json)
		throws ServerException {

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

	public static void checkStatusCode(Response response)
		throws ServerException {

		int status = response.getStatusCode();

		if ((status == Status.MOVED_PERMANENTLY) ||
			(status == Status.MOVED_TEMPORARILY) ||
			(status == Status.SEE_OTHER) ||
			(status == Status.TEMPORARY_REDIRECT)) {

			String url = response.getHeaders().get(Headers.LOCATION);

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

	public static Response download(
			Session session, String url, FileProgressCallback callback)
		throws Exception {

		Request request = new Request(
			session.getAuthentication(), Method.GET, session.getHeaders(), url,
			null, session.getConnectionTimeout());

		return client.download(request, callback);
	}

	public static String getURL(Session session, String path) {
		StringBuilder sb = new StringBuilder();

		String server = session.getServer();

		sb.append(server);

		if (!server.endsWith("/")) {
			sb.append("/");
		}

		sb.append(_JSONWS_PATH);
		sb.append(path);

		return sb.toString();
	}

	public static JSONArray post(Session session, JSONArray commands)
		throws Exception {

		String url = getURL(session, "/invoke");

		Request request = new Request(
			session.getAuthentication(), Method.POST, session.getHeaders(), url,
			commands.toString(), session.getConnectionTimeout());

		Response response = client.send(request);
		String body = response.getBody();

		checkStatusCode(response);
		checkPortalException(body);

		return new JSONArray(body);
	}

	public static JSONArray post(Session session, JSONObject command)
		throws Exception {

		JSONArray commands = new JSONArray();
		commands.put(command);

		return post(session, commands);
	}

	public static Response send(Request request) throws Exception {
		return client.send(request);
	}

	@SuppressWarnings("unused")
	public static void setJSONWSPath(String jsonwsPath) {
		_JSONWS_PATH = jsonwsPath;
	}

	public static JSONArray upload(Session session, JSONObject command)
		throws Exception {

		String path = (String)command.keys().next();

		Request request = new Request(
			session.getAuthentication(), Method.POST, session.getHeaders(),
			getURL(session, path), command.getJSONObject(path),
			session.getConnectionTimeout());

		Response response = client.upload(request);
		String body = response.getBody();

		checkStatusCode(response);
		checkPortalException(body);

		return new JSONArray("[" + body + "]");
	}

	protected static boolean isJSONObject(String json) {
		if (Validator.isNotNull(json) && json.startsWith("{")) {
			return true;
		}

		return false;
	}

	protected static HttpClient client = new OkHttpClientImpl();

	private static String _JSONWS_PATH = JSONWS_PATH_62;

}