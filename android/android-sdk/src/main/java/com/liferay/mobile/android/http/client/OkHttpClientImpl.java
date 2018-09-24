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
import com.liferay.mobile.android.auth.SessionCallback;
import com.liferay.mobile.android.auth.refresh.AuthenticationRefreshHandlerFactory;
import com.liferay.mobile.android.auth.refresh.AuthenticationRefreshHandler;
import com.liferay.mobile.android.callback.Callback;
import com.liferay.mobile.android.http.Method;
import com.liferay.mobile.android.http.Request;
import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.http.file.InputStreamBody;
import com.liferay.mobile.android.http.file.UploadData;
import com.liferay.mobile.android.service.Session;

import com.liferay.mobile.android.service.SessionImpl;
import com.squareup.okhttp.Authenticator;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.MultipartBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request.Builder;
import com.squareup.okhttp.RequestBody;

import java.io.IOException;

import java.util.Iterator;
import java.util.List;
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

	public void setRefreshHandlerFactory(AuthenticationRefreshHandlerFactory
		refreshHandlerFactory) {

		this.refreshHandlerFactory = refreshHandlerFactory;
	}

	@Override
	public void cancel(Object tag) {
		client.cancel(tag);
	}

	@Override
	public String encodeURL(String url) {
		return HttpUrl.parse(url).toString();
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

	protected void addHeaders(Builder builder, Request request) {
		Map<String, String> headers = request.getHeaders();

		if (headers != null) {
			for (Map.Entry<String, String> header : headers.entrySet()) {
				builder.addHeader(header.getKey(), header.getValue());
			}
		}
	}

	protected void setProtocols(OkHttpClient client, Request request) {
		List<Protocol> protocols = request.getProtocols();

		if (protocols != null && !protocols.isEmpty()) {
			client.setProtocols(protocols);
		}
	}

	protected void authenticate(OkHttpClient client, Request request)
		throws Exception {

		Authentication authentication = request.getAuthentication();

		if (authentication != null) {
			if (authentication instanceof Authenticator) {
				client.setAuthenticator((Authenticator)authentication);
			}
			else {
				authentication.authenticate(request);
			}
		}
	}

	protected Response doSend(Builder builder, Request request)
		throws Exception {

		authenticate(client, request);
		setProtocols(client, request);
		addHeaders(builder, request);

		OkHttpClient client = getClient(
				request.getConnectionTimeout(), request.isFollowRedirects());
		
		Call call = client.newCall(builder.build());

		final Callback callback = request.getCallback();

		if (callback == null) {
			return new Response(call.execute());
		}
		else {
			sendAsync(call, callback);
			return null;
		}
	}

	protected OkHttpClient getClient(int connectionTimeout, boolean followRedirects) {
		OkHttpClient clone = client.clone();

		clone.setConnectTimeout(connectionTimeout, TimeUnit.MILLISECONDS);
		clone.setReadTimeout(connectionTimeout, TimeUnit.MILLISECONDS);
		clone.setWriteTimeout(connectionTimeout, TimeUnit.MILLISECONDS);

		clone.setFollowRedirects(followRedirects);

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

	protected Response send(Builder builder, final Request request)
		throws Exception {

		final Builder finalBuilder = builder.url(request.getURL());
		builder.tag(request.getTag());

		final Callback callback = request.getCallback();

		Session session = getSessionFromRequest(request);

		AuthenticationRefreshHandler refreshHandler = refreshHandlerFactory
				.refreshHandlerForAuthentication(request.getAuthentication());

		if (request.getCallback() == null) {
			Session refreshSession = refreshHandler
					.refreshAuthentication(session, null);

			request.setAuthentication(refreshSession.getAuthentication());

			return doSend(builder, request);
		}
		else {
			refreshHandler.refreshAuthentication(session,
					new SessionCallback() {

				@Override
				public void onSuccess(Session session) {
					try {
						request.setAuthentication(session.getAuthentication());
						doSend(finalBuilder, request);
					}
					catch (Exception e) {
						onFailure(e);
					}
				}

				@Override
				public void onFailure(Exception e) {
					callback.doFailure(e);
				}
			});

			return null;
		}
	}

	protected void sendAsync(Call call, final Callback callback) {
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

	protected String getServerURL(String url) {
		if (url.contains("/api/jsonws/invoke")) {
			url = url.substring(0, url.indexOf("/api/jsonws/invoke"));
		}

		return url;
	}

	protected Session getSessionFromRequest(Request request) {
		Authentication authentication = request.getAuthentication();
		Map<String, String> headers = request.getHeaders();
		String server = getServerURL(request.getURL());

		Session session = new SessionImpl(server, authentication);
		session.setHeaders(headers);

		return session;
	}

	protected AuthenticationRefreshHandlerFactory
			refreshHandlerFactory = new AuthenticationRefreshHandlerFactory();
	protected OkHttpClient client;
}