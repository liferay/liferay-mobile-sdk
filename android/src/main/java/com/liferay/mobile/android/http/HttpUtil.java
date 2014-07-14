/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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

import com.liferay.mobile.android.exception.ServerException;
import com.liferay.mobile.android.http.entity.CountingHttpEntity;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.task.UploadAsyncTask;
import com.liferay.mobile.android.util.Validator;

import java.io.IOException;

import java.nio.charset.Charset;

import java.util.Iterator;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.entity.mime.content.InputStreamBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class HttpUtil {

	public static final String IF_MODIFIED_SINCE = "If-Modified-Since";

	public static final String LAST_MODIFIED = "Last-Modified";

	public static HttpClient getClient(Session session) {
		DefaultHttpClient client = new DefaultHttpClient();

		HttpConnectionParams.setConnectionTimeout(
			client.getParams(), session.getConnectionTimeout());

		return client;
	}

	public static HttpPost getPost(Session session, String URL) {
		HttpPost post = new HttpPost(URL);

		Header authorization = session.getAuthHeader();

		if (authorization != null) {
			post.addHeader(authorization);
		}

		return post;
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

		sb.append("api/jsonws");
		sb.append(path);

		return sb.toString();
	}

	public static JSONArray post(Session session, JSONArray commands)
		throws Exception {

		HttpClient client = getClient(session);
		HttpPost post = getPost(session, getURL(session, "/invoke"));

		post.setEntity(new StringEntity(commands.toString(), HTTP.UTF_8));

		HttpResponse response = client.execute(post);
		String json = HttpUtil.getResponseString(response);

		handleServerException(response, json);

		return new JSONArray(json);
	}

	public static JSONArray post(Session session, JSONObject command)
		throws Exception {

		JSONArray commands = new JSONArray();
		commands.put(command);

		return post(session, commands);
	}

	public static Object upload(
			Session session, JSONObject command, UploadAsyncTask task)
		throws Exception {

		String path = (String)command.keys().next();
		JSONObject parameters = command.getJSONObject(path);

		HttpClient client = getClient(session);
		HttpPost post = getPost(session, getURL(session, path));

		HttpEntity entity = getMultipartEntity(parameters);

		if (task != null) {
			entity = new CountingHttpEntity(entity, task);
		}

		post.setEntity(entity);

		HttpResponse response = client.execute(post);
		String json = HttpUtil.getResponseString(response);

		handleServerException(response, json);

		if (isJSONObject(json)) {
			return new JSONObject(json);
		}
		else {
			return new JSONArray(json);
		}
	}

	protected static MultipartEntity getMultipartEntity(JSONObject parameters)
		throws Exception {

		MultipartEntity entity = new MultipartEntity(
			HttpMultipartMode.BROWSER_COMPATIBLE);

		Charset charset = Charset.forName(HTTP.UTF_8);

		Iterator<String> it = parameters.keys();

		while (it.hasNext()) {
			String key = it.next();
			Object value = parameters.get(key);

			ContentBody contentBody;

			if (value instanceof InputStreamBody) {
				contentBody = (InputStreamBody)value;
			}
			else {
				contentBody = new StringBody(value.toString(), charset);
			}

			entity.addPart(key, contentBody);
		}

		return entity;
	}

	protected static void handleServerException(
			HttpResponse response, String json)
		throws ServerException {

		int status = response.getStatusLine().getStatusCode();

		if (status == HttpStatus.SC_UNAUTHORIZED) {
			throw new ServerException("Authentication failed.");
		}

		if (status != HttpStatus.SC_OK) {
			throw new ServerException(
				"Request failed. Response code: " + status);
		}

		try {
			if (isJSONObject(json)) {
				JSONObject jsonObj = new JSONObject(json);

				if (jsonObj.has("exception")) {
					String message = jsonObj.getString("exception");

					throw new ServerException(message);
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

}