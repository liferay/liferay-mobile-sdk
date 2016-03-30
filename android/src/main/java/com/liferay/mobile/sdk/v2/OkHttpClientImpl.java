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

package com.liferay.mobile.sdk.v2;

import com.liferay.mobile.sdk.auth.Authentication;
import com.liferay.mobile.sdk.http.Headers;
import com.liferay.mobile.sdk.http.Headers.ContentType;
import com.liferay.mobile.sdk.http.Method;
import com.liferay.mobile.sdk.http.Request;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.http.file.InputStreamBody;
import com.liferay.mobile.sdk.http.file.UploadData;

import com.squareup.okhttp.Authenticator;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.MultipartBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request.Builder;
import com.squareup.okhttp.RequestBody;

import java.io.IOException;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class OkHttpClientImpl implements HttpClient {

	public OkHttpClientImpl() {
		client = new OkHttpClient();
	}

	@Override
	public void async(Request request, final Callback callback) {
		Call call = null;

		try {
			call = build(request);
		}
		catch (Exception e) {
			callback.doFailure(e);
		}

		if (call == null) {
			return;
		}

		call.enqueue(new com.squareup.okhttp.Callback() {

			@Override
			public void onFailure(
				com.squareup.okhttp.Request request, IOException ioe) {

				callback.doFailure(ioe);
			}

			@Override
			public void onResponse(com.squareup.okhttp.Response response)
				throws IOException {

				callback.inBackground(new Response(response));
			}

		});
	}

	@Override
	public void cancel(Object tag) {
		client.cancel(tag);
	}

	@Override
	public Response sync(Request request) throws Exception {
		Call call = build(request);
		return new Response(call.execute());
	}

	protected void addHeaders(Builder builder, Request request) {
		Map<String, String> headers = request.headers();

		if (headers != null) {
			for (Map.Entry<String, String> header : headers.entrySet()) {
				builder.addHeader(header.getKey(), header.getValue());
			}
		}
	}

	protected void authenticate(OkHttpClient client, Request request)
		throws Exception {

		Authentication authentication = request.auth();

		if (authentication != null) {
			if (authentication instanceof Authenticator) {
				client.setAuthenticator((Authenticator)authentication);
			}
			else {
				authentication.authenticate(request);
			}
		}
	}

	protected Call build(Request request) throws Exception {
		Builder builder = new Builder();
		Method method = request.method();

		if (method == Method.POST) {
			Object body = request.body();

			if (body != null) {
				Map<String, String> headers = request.headers();
				String contentType = headers.get(Headers.CONTENT_TYPE);

				if (contentType.equals(ContentType.JSON.value)) {
					MediaType type = MediaType.parse(contentType);
					builder.post(RequestBody.create(type, (String)body));
				}
				else if (contentType.equals(ContentType.MULTIPART.value)) {
					builder.post(
						getUploadBody((JSONObject)body, request.tag()));
				}
			}
		}
		else if (method == Method.HEAD) {
			builder.head();
		}

		builder = builder.url(request.url());
		builder.tag(request.tag());

		OkHttpClient client = getClient(request.timeout());

		authenticate(client, request);
		addHeaders(builder, request);

		return client.newCall(builder.build());
	}

	protected OkHttpClient getClient(int connectionTimeout) {
		OkHttpClient clone = client.clone();

		clone.setConnectTimeout(connectionTimeout, TimeUnit.MILLISECONDS);
		clone.setReadTimeout(connectionTimeout, TimeUnit.MILLISECONDS);
		clone.setWriteTimeout(connectionTimeout, TimeUnit.MILLISECONDS);

		clone.setFollowRedirects(false);

		return clone;
	}

	protected RequestBody getUploadBody(JSONObject body, Object tag) {
		MultipartBuilder multipartBuilder = new MultipartBuilder()
			.type(MultipartBuilder.FORM);

		Iterator<String> it = body.keys();

		while (it.hasNext()) {
			String key = it.next();
			Object value = body.opt(key);

			if (value instanceof UploadData) {
				UploadData data = (UploadData)value;
				RequestBody requestBody = new InputStreamBody(data, tag);
				multipartBuilder.addFormDataPart(
					key, data.getFileName(), requestBody);
			}
			else {
				multipartBuilder.addFormDataPart(key, value.toString());
			}
		}

		return multipartBuilder.build();
	}

	protected OkHttpClient client;

}