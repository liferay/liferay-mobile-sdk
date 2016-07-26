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

package com.liferay.mobile.sdk.auth;

import com.liferay.mobile.sdk.Config;
import com.liferay.mobile.sdk.exception.AuthenticationException;
import com.liferay.mobile.sdk.util.Validator;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Request.Builder;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;

import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.HttpCookie;

import okio.Buffer;

/**
 * @author Javier Gamarra
 */
public class CookieSignIn {

	public static void signIn(Config config, CookieCallback callback) {
		try {
			Authentication auth = config.auth();

			if (!(auth instanceof BasicAuthentication)) {
				throw new Exception(
					"Can't sign in if authentication implementation is not " +
						"BasicAuthentication");
			}

			OkHttpClient client = new OkHttpClient();

			CookieManager cookieManager = new CookieManager();
			cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);

			client.setCookieHandler(cookieManager);
			client.setFollowRedirects(true);

			Builder builder = new Builder();

			MediaType contentType = MediaType.parse(
				"application/x-www-form-urlencoded");

			builder.post(
				RequestBody.create(
					contentType, getBody((BasicAuthentication)auth)));

			builder.addHeader("Cookie", "COOKIE_SUPPORT=true;");
			builder.url(getLoginURL(config.server()));

			Call call = client.newCall(builder.build());
			call.enqueue(getCallback(callback, cookieManager));
		}
		catch (Exception e) {
			callback.onFailure(e);
		}
	}

	public interface CookieCallback {

		void onSuccess(CookieAuthentication auth);

		void onFailure(Exception e);

	}

	protected static String getBody(BasicAuthentication auth)
		throws IOException {

		RequestBody formBody = new FormEncodingBuilder()
			.add("login", auth.username())
			.add("password", auth.password())
			.build();

		Buffer buffer = new Buffer();
		formBody.writeTo(buffer);

		return buffer.readUtf8();
	}

	protected static Callback getCallback(
		final CookieCallback callback, final CookieManager cookieManager) {

		return new Callback() {

			@Override
			public void onFailure(Request request, IOException ioe) {
				callback.onFailure(ioe);
			}

			@Override
			public void onResponse(Response response) throws IOException {
				String body = response.body().string();

				Integer position = body.indexOf(AUTH_TOKEN) +
					AUTH_TOKEN.length();

				String authToken = body.substring(
					position, position + TOKEN_LENGTH);

				String cookieHeader = getHttpCookies(
					cookieManager.getCookieStore());

				if (Validator.isNotNull(cookieHeader)) {
					CookieAuthentication auth = new CookieAuthentication(
						authToken, cookieHeader);

					callback.onSuccess(auth);
				}
				else {
					callback.onFailure(
						new AuthenticationException("Cookie invalid or empty"));
				}
			}

		};
	}

	protected static String getHttpCookies(CookieStore cookieStore) {
		StringBuilder cookies = new StringBuilder();

		for (HttpCookie cookie : cookieStore.getCookies()) {
			cookies.append(cookie);
			cookies.append(";");
		}

		return cookies.toString();
	}

	protected static String getLoginURL(String server) {
		if (!server.endsWith("/")) {
			server = server + "/";
		}

		return server + "c/portal/login";
	}

	protected static final String AUTH_TOKEN = "Liferay.authToken=\"";

	protected static final int TOKEN_LENGTH = 8;

}