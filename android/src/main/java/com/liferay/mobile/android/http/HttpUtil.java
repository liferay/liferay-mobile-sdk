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

import com.liferay.mobile.android.callback.BaseCallback;
import com.liferay.mobile.android.callback.Callback;
import com.liferay.mobile.android.callback.file.DownloadCallback;
import com.liferay.mobile.android.callback.file.FileProgressCallback;
import com.liferay.mobile.android.callback.file.UploadCallback;
import com.liferay.mobile.android.http.client.HttpClient;
import com.liferay.mobile.android.http.client.OkHttpClientImpl;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONObject;

import static com.liferay.mobile.android.http.file.FileProgressUtil.transfer;

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

	public static Response download(
			Session session, String url, FileProgressCallback callback)
		throws Exception {

		Callback sessionCallback = session.getCallback();

		if (sessionCallback != null) {
			sessionCallback = new DownloadCallback(sessionCallback, callback);
		}

		Request request = new Request(
			session.getAuthentication(), Method.GET, session.getHeaders(), url,
			null, session.getConnectionTimeout(), sessionCallback);

		if (sessionCallback != null) {
			((DownloadCallback)sessionCallback).setTag(request.getTag());
		}

		Response response = send(request);

		if (response == null) {
			return null;
		}
		else {
			transfer(
				response.getBodyAsStream(), callback, request.getTag(), null);

			return response;
		}
	}

	public static String encodeURLPath(String path) {
		return client.encodeURL(path);
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
			commands.toString(), session.getConnectionTimeout(),
			session.getCallback());

		Response response = client.send(request);

		if (response == null) {
			return null;
		}
		else {
			return new JSONArray(response.getBody());
		}
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

		Callback sessionCallback = session.getCallback();

		if (sessionCallback != null) {
			sessionCallback = new UploadCallback((BaseCallback)sessionCallback);
		}

		Request request = new Request(
			session.getAuthentication(), Method.POST, session.getHeaders(),
			getURL(session, path), command.getJSONObject(path),
			session.getConnectionTimeout(), sessionCallback);

		Response response = client.upload(request);

		if (response == null) {
			return null;
		}
		else {
			return new JSONArray(UploadCallback.wrap(response.getBody()));
		}
	}

	protected static HttpClient client = new OkHttpClientImpl();

	private static String _JSONWS_PATH = JSONWS_PATH_62;

}