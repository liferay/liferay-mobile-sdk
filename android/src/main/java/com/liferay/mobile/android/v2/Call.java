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

import com.google.gson.Gson;

import com.liferay.mobile.android.http.Method;
import com.liferay.mobile.android.http.Request;
import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.service.Session;

import java.util.List;

import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class Call {

	public Call(JSONObject command) {
		this.command = command;
	}

	public void async(Callback callback) {
	}

	public <T> List<T> list(Session session, Class<T> clazz) throws Exception {
		Response response = post(session, command);

		Gson gson = new Gson();
		String body = response.getBody();

		return gson.fromJson(body, new GenericOf<List, T>(List.class, clazz));
	}

	protected String getURL(Session session, String path) {
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

	protected Response post(Session session, JSONObject command)
		throws Exception {

		String url = getURL(session, "/invoke");

		Request request = new Request(
			session.getAuthentication(), Method.POST, session.getHeaders(), url,
			command.toString(), session.getConnectionTimeout(),
			session.getCallback());

		return client.send(request);
	}

	protected OkHttpClientImpl client = new OkHttpClientImpl();
	protected JSONObject command;

}