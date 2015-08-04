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

package com.liferay.mobile.android.http.client;

import com.liferay.mobile.android.auth.Authentication;
import com.liferay.mobile.android.http.HttpUtil;
import com.liferay.mobile.android.http.Method;
import com.liferay.mobile.android.http.Request;
import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.http.file.FileProgressCallback;
import com.liferay.mobile.android.http.file.InputStreamBody;
import com.liferay.mobile.android.http.file.UploadData;
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;

import com.squareup.okhttp.Authenticator;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.MultipartBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request.Builder;
import com.squareup.okhttp.RequestBody;

import java.io.IOException;
import java.io.InputStream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.json.JSONArray;
import org.json.JSONObject;

import static com.liferay.mobile.android.http.file.InputStreamBody.*;

/**
 * @author Bruno Farache
 */
public class OkHttpClientImpl implements HttpClient {

	public OkHttpClientImpl() {
		client = new OkHttpClient();
	}

	@Override
	public void cancel(Object tag) {
		client.cancel(tag);
	}

	@Override
	public Response download(Request request, FileProgressCallback callback)
		throws Exception {

		Response response = null;
		InputStream is = null;

		try {
			response = send(request);
			HttpUtil.checkStatusCode(response);
			is = response.getBodyAsStream();

			int count;
			byte bytes[] = new byte[2048];

			while (((count = is.read(bytes)) != -1) && !isCancelled(callback)) {
				callback.onBytes(Arrays.copyOfRange(bytes, 0, count));
				callback.increment(count);
			}

			if (isCancelled(callback)) {
				cancel(request.getTag());
			}
		}
		finally {
			if (is != null) {
				try {
					is.close();
				}
				catch (IOException ioe) {
				}
			}
		}

		return response;
	}

	@Override
	public Response send(Request request) throws Exception {
		Builder builder = new Builder();
		Method method = request.getMethod();

		if (method == Method.POST) {
			String body = (String)request.getBody();

			if (body != null) {
				MediaType type = MediaType.parse(
					"application/json; charset=utf-8");

				builder.post(RequestBody.create(type, body));
			}
		}
		else if (method == Method.HEAD) {
			builder.head();
		}

		return send(builder, request);
	}

	@Override
	public Response upload(Request request) throws Exception {
		Builder builder = new Builder();
		builder.post(getUploadBody(request));

		return send(builder, request);
	}

	protected OkHttpClient getClient(int connectionTimeout) {
		OkHttpClient clone = client.clone();

		clone.setConnectTimeout(connectionTimeout, TimeUnit.MILLISECONDS);
		clone.setReadTimeout(connectionTimeout, TimeUnit.MILLISECONDS);
		clone.setWriteTimeout(connectionTimeout, TimeUnit.MILLISECONDS);

		clone.setFollowRedirects(false);

		return clone;
	}

	protected RequestBody getUploadBody(Request request) {
		JSONObject body = (JSONObject)request.getBody();
		Object tag = request.getTag();

		MultipartBuilder builder = new MultipartBuilder()
			.type(MultipartBuilder.FORM);

		Iterator<String> it = body.keys();

		while (it.hasNext()) {
			String key = it.next();
			Object value = body.opt(key);

			if (value instanceof UploadData) {
				UploadData data = (UploadData)value;
				RequestBody requestBody = new InputStreamBody(data, tag);
				builder.addFormDataPart(key, data.getFileName(), requestBody);
			}
			else {
				builder.addFormDataPart(key, value.toString());
			}
		}

		return builder.build();
	}

	protected Response send(Builder builder, Request request) throws Exception {
		builder = builder.url(request.getURL());
		builder.tag(request.getTag());

		OkHttpClient client = getClient(request.getConnectionTimeout());

		Authentication authentication = request.getAuthentication();

		if (authentication != null) {
			if (authentication instanceof Authenticator) {
				client.setAuthenticator((Authenticator)authentication);
			}
			else {
				authentication.authenticate(request);
			}
		}

		Map<String, String> headers = request.getHeaders();

		if (headers != null) {
			for (Map.Entry<String, String> header : headers.entrySet()) {
				builder.addHeader(header.getKey(), header.getValue());
			}
		}

		Call call = client.newCall(builder.build());

		final AsyncTaskCallback callback = request.getCallback();

		if (callback != null) {
			call.enqueue(new Callback() {

				@Override
				public void onFailure(
					com.squareup.okhttp.Request request, IOException ioe) {

					callback.onFailure(ioe);
				}

				@Override
				public void onResponse(com.squareup.okhttp.Response r)
					throws IOException {

					Response response = new Response(
						r.code(), _toMap(r.headers().toMultimap()), r.body());

					String body = response.getBody();

					try {
						HttpUtil.checkStatusCode(response);
						HttpUtil.checkPortalException(body);

						JSONArray jsonArray = callback.inBackground(
							new JSONArray(body));

						callback.onPostExecute(jsonArray);
					}
					catch (Exception e) {
						callback.onFailure(e);
					}
				}

			});

			return null;
		}
		else {
			com.squareup.okhttp.Response response = call.execute();

			return new Response(
				response.code(), _toMap(response.headers().toMultimap()),
				response.body());
		}
	}

	protected OkHttpClient client;

	private Map<String, String> _toMap(Map<String, List<String>> headers) {
		Map<String, String> map = new HashMap<String, String>();

		for (Map.Entry<String, List<String>> header : headers.entrySet()) {
			map.put(header.getKey(), header.getValue().get(0));
		}

		return map;
	}

}