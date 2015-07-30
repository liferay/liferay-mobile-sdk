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
import com.liferay.mobile.android.auth.basic.DigestAuthentication;
import com.liferay.mobile.android.exception.AuthenticationException;
import com.liferay.mobile.android.exception.RedirectException;
import com.liferay.mobile.android.exception.ServerException;
import com.liferay.mobile.android.http.client.HttpClient;
import com.liferay.mobile.android.http.client.OkHttpClientImpl;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.util.Validator;

import java.io.IOException;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultRedirectStrategy;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

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

	public static void checkStatusCode(Response response)
		throws ServerException {

		int status = response.getStatusCode();

		if ((status == Status.MOVED_PERMANENTLY) ||
			(status == Status.MOVED_TEMPORARILY) ||
			(status == Status.SEE_OTHER) ||
			(status == Status.TEMPORARY_REDIRECT)) {

			String URL = response.getHeaders().get(Headers.LOCATION);

			if (URL.endsWith("/")) {
				URL = URL.substring(0, URL.length() - 1);
			}

			throw new RedirectException(URL);
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

	public static org.apache.http.client.HttpClient getClient(Session session) {
		return getClientBuilder(session).build();
	}

	public static HttpClientBuilder getClientBuilder(Session session) {
		HttpClientBuilder clientBuilder = HttpClientBuilder.create();

		RequestConfig.Builder requestBuilder = RequestConfig.custom();
		int timeout = session.getConnectionTimeout();
		requestBuilder = requestBuilder.setConnectTimeout(timeout);
		requestBuilder = requestBuilder.setConnectionRequestTimeout(timeout);

		clientBuilder.setDefaultRequestConfig(requestBuilder.build());
		clientBuilder.setRedirectStrategy(new DefaultRedirectStrategy() {

			@Override
			protected boolean isRedirectable(String method) {
				return false;
			}

		});

		Authentication auth = session.getAuthentication();

		if ((auth != null) && (auth instanceof DigestAuthentication)) {
			DigestAuthentication digest = (DigestAuthentication)auth;
			digest.authenticate(clientBuilder);
		}

		return clientBuilder;
	}

	public static HttpGet getHttpGet(Session session, String URL)
		throws Exception {

		HttpGet httpGet = new HttpGet(URL);

		setHeaders(session, httpGet);
		authenticate(session, httpGet);

		return httpGet;
	}

	public static HttpPost getHttpPost(Session session, String URL)
		throws Exception {

		HttpPost httpPost = new HttpPost(URL);

		setHeaders(session, httpPost);
		authenticate(session, httpPost);

		return httpPost;
	}

	public static String getResponseString(HttpResponse response)
		throws IOException {

		HttpEntity entity = response.getEntity();

		if (entity == null) {
			return null;
		}

		return EntityUtils.toString(entity);
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
			Method.POST, session.getHeaders(), url, commands.toString(),
			session.getConnectionTimeout());

		Authentication auth = session.getAuthentication();

		if (auth != null) {
			auth.authenticate(request);
		}

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

	public static Response upload(Request request) throws Exception {
		return client.upload(request);
	}

	public static JSONArray upload(Session session, JSONObject command)
		throws Exception {

		String path = (String)command.keys().next();

		Request request = new Request(
			Method.POST, session.getHeaders(), getURL(session, path),
			command.getJSONObject(path), session.getConnectionTimeout());

		Authentication auth = session.getAuthentication();

		if (auth != null) {
			auth.authenticate(request);
		}

		Response response = client.upload(request);
		String body = response.getBody();

		checkStatusCode(response);
		checkPortalException(body);

		return new JSONArray("[" + body + "]");
	}

	protected static void authenticate(Session session, HttpRequest request)
		throws Exception {

		Authentication auth = session.getAuthentication();

		if (auth != null) {

			// TODO

			//auth.authenticate(request);
		}
	}

	protected static void checkPortalException(String json)
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

	protected static boolean isJSONObject(String json) {
		if (Validator.isNotNull(json) && json.startsWith("{")) {
			return true;
		}

		return false;
	}

	protected static void setHeaders(Session session, HttpRequest request) {
		Map<String, String> headers = new HashMap<String, String>();

		if (headers != null) {
			Header[] httpHeaders = new Header[headers.size()];
			int i = 0;

			for (Map.Entry<String, String> header : headers.entrySet()) {
				httpHeaders[i] = new BasicHeader(
					header.getKey(), header.getValue());

				i = i + 1;
			}

			request.setHeaders(httpHeaders);
		}
	}

	protected static HttpClient client = new OkHttpClientImpl();

	private static String _JSONWS_PATH = JSONWS_PATH_62;

}