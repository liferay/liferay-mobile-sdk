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

package com.liferay.mobile.sdk;

import com.liferay.mobile.sdk.callback.OnFailure;
import com.liferay.mobile.sdk.callback.OnSuccess;
import com.liferay.mobile.sdk.http.ContentType;
import com.liferay.mobile.sdk.http.Headers;
import com.liferay.mobile.sdk.http.HttpClient;
import com.liferay.mobile.sdk.http.OkHttpClientImpl;
import com.liferay.mobile.sdk.http.Request;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.http.ResponseValidator;
import com.liferay.mobile.sdk.json.JSONParser;

import java.lang.reflect.Type;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class Call<T> {

	public static void cancel(Object call) {
		client.cancel(call);
	}

	public synchronized static HttpClient client() {
		return client;
	}

	public synchronized static void client(HttpClient client) {
		Call.client = client;
	}

	public Call(Object body, Type type) {
		this(body, type, ContentType.JSON);
	}

	public Call(Object body, Type type, ContentType contentType) {
		this.body = body;
		this.type = type;
		this.contentType = contentType;
	}

	public void async(Callback<T> callback) {
		async(Config.global(), callback);
	}

	public void async(Config config, Callback<T> callback) {
		callback.init(config, type);
		Request request = request(config);
		client.async(request, callback);
	}

	public void async(
		Config config, final OnSuccess<T> onSuccess,
		final OnFailure onFailure) {

		if ((onSuccess == null) || (onFailure == null)) {
			throw new IllegalArgumentException(
				"onSuccess and onFailure cannot be null");
		}

		async(config, new Callback<T>() {

			@Override
			public void onFailure(Exception exception) {
				onFailure.onFailure(exception);
			}

			@Override
			public void onSuccess(T result) {
				onSuccess.onSuccess(result);
			}

		});
	}

	public void async(OnSuccess<T> onSuccess, OnFailure onFailure) {
		async(Config.global(), onSuccess, onFailure);
	}

	public Object body() {
		return body;
	}

	public T execute() throws Exception {
		return execute(Config.global());
	}

	public T execute(Config config) throws Exception {
		Request request = request(config);
		Response response = client.sync(request);
		ResponseValidator validator = config.responseValidator();

		validator.validateStatusCode(response);

		if (type == Response.class) {
			return (T)response;
		}

		String json = validator.validateBody(response.bodyAsString());
		return JSONParser.fromJSON(json, type);
	}

	protected static JSONArray bodies(Call[] calls) {
		JSONArray commands = new JSONArray();

		for (Call call : calls) {
			commands.put(call.body());
		}

		return commands;
	}

	protected Request request(Config config) {
		String path = "/invoke";

		if (contentType == ContentType.JSON) {
			body = body.toString();
		}
		else if (contentType == ContentType.MULTIPART) {
			JSONObject jsonObject = (JSONObject)body;

			path = (String)jsonObject.keys().next();
			body = jsonObject.optJSONObject(path);
		}

		return new Request.Builder(config.url() + path)
			.config(config)
			.header(Headers.CONTENT_TYPE, contentType.value)
			.body(body)
			.tag(this)
			.build();
	}

	protected static HttpClient client = new OkHttpClientImpl();

	protected Object body;
	protected ContentType contentType;
	protected Type type;

}