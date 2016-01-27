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

import com.liferay.mobile.android.http.Method;
import com.liferay.mobile.android.http.Request;
import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.service.Session;

import java.lang.reflect.Type;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class Call<T> {

	public static Response batch(Session session, Call... calls)
		throws Exception {

		Request request = request(session, commands(calls));
		return client.sync(request);
	}

	public static void batch(
			Session session, Callback<Response> callback, Call... calls)
		throws Exception {

		callback.type(Response.class);
		Request request = request(session, commands(calls));
		client.async(request, callback);
	}

	public Call(JSONObject command, Type type) {
		this.command = command;
		this.type = type;
	}

	public void async(Session session, Callback<T> callback) {
		callback.type(this.type);
		Request request = request(session, command.toString());
		client.async(request, callback);
	}

	public JSONObject command() {
		return command;
	}

	public T execute(Session session) throws Exception {
		Request request = request(session, command.toString());
		Response response = client.sync(request);
		return JsonParser.fromJson(response, type);
	}

	protected static String commands(Call[] calls) {
		JSONArray commands = new JSONArray();

		for (Call call : calls) {
			commands.put(call.command());
		}

		return commands.toString();
	}

	protected static Request request(Session session, String command) {
		String url = url(session, "/invoke");

		return new Request(
			session.getAuthentication(), Method.POST, session.getHeaders(), url,
			command.toString(), session.getConnectionTimeout(),
			session.getCallback());
	}

	protected static String url(Session session, String path) {
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

	protected static OkHttpClientImpl client = new OkHttpClientImpl();

	protected JSONObject command;
	protected Type type;

}