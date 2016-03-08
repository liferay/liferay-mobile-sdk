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

package com.liferay.mobile.android.v2;

import com.liferay.mobile.android.http.Headers;
import com.liferay.mobile.android.http.Headers.ContentType;
import com.liferay.mobile.android.http.Method;
import com.liferay.mobile.android.http.Request;
import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.service.Session;

import java.lang.reflect.Type;

import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class Call<T> {

	public static Response batch(Session session, Call... calls)
		throws Exception {

		JSONArray bodies = bodies(calls);
		Call<Response> call = new Call<>(bodies, Response.class);
		return call.execute(session);
	}

	public static void batch(
			Session session, Callback<Response> callback, Call... calls)
		throws Exception {

		JSONArray bodies = bodies(calls);
		Call<Response> call = new Call<>(bodies, Response.class);
		call.async(session, callback);
	}

	public Call(Object body, Type type) {
		this(body, type, ContentType.JSON);
	}

	public Call(Object body, Type type, ContentType contentType) {
		this.body = body;
		this.type = type;
		this.contentType = contentType;
	}

	public void async(Session session, Callback<T> callback) {
		callback.type(this.type);
		Request request = request(session);
		client.async(request, callback);
	}

	public Object body() {
		return body;
	}

	public T execute(Session session) throws Exception {
		Request request = request(session);
		Response response = client.sync(request);
		return JsonParser.fromJson(response, type);
	}

	protected static JSONArray bodies(Call[] calls) {
		JSONArray commands = new JSONArray();

		for (Call call : calls) {
			commands.put(call.body());
		}

		return commands;
	}

	protected Request request(Session session) {
		Map<String, String> headers = session.getHeaders();
		headers.put(Headers.CONTENT_TYPE, contentType.value);
		String path = "/invoke";

		if (contentType == ContentType.JSON) {
			body = body.toString();
		}
		else if (contentType == ContentType.MULTIPART) {
			JSONObject jsonObject = (JSONObject)body;
			path = (String)jsonObject.keys().next();
			body = jsonObject.optJSONObject(path);
		}

		String url = url(session.getServer(), path);

		return new Request(
			session.getAuthentication(), Method.POST, headers, url, body,
			session.getConnectionTimeout(), session.getCallback());
	}

	protected String url(String server, String path) {
		StringBuilder sb = new StringBuilder();
		sb.append(server);

		if (!server.endsWith("/")) {
			sb.append("/");
		}

		sb.append("api/jsonws");
		sb.append(path);

		return sb.toString();
	}

	protected static OkHttpClientImpl client = new OkHttpClientImpl();
	protected static ContentType contentType;

	protected Object body;
	protected Type type;

}