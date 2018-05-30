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

package com.liferay.mobile.android.auth;

import com.liferay.mobile.android.auth.basic.CookieAuthentication;
import com.liferay.mobile.android.exception.AuthenticationException;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.service.SessionImpl;
import com.liferay.mobile.android.util.Validator;

import com.squareup.okhttp.Authenticator;
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

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import okio.Buffer;

/**
 * @author Javier Gamarra
 * @author Victor Galán
 */
public class CookieSignIn {

	public static void registerAuthenticatorForServer(
			String server, Authenticator authenticator) {

		authenticators.put(server, authenticator);
	}

	public static Session signIn(Session session)
		throws Exception {

		CookieSignIn cookieSignIn = new CookieSignIn(session);
		Call call = cookieSignIn.signIn();

		Response response = call.execute();

		return parseResponse(
			response, session.getServer(), cookieSignIn.cookieManager,
			getCookieAuthentication(session.getAuthentication()));
	}

	public static void signIn(Session session, CookieCallback callback) {
		signIn(session, callback, null);
	}

	public static void signIn(
			Session session, CookieCallback callback,
			Authenticator authenticator) {

		try {
			CookieSignIn cookieSignIn = new CookieSignIn(
					session);

			Call call = cookieSignIn.signIn();

			Callback requestCallback = getCallback(
				session.getServer(), callback, cookieSignIn.cookieManager,
				getCookieAuthentication(session.getAuthentication()));

			call.enqueue(requestCallback);
		}
		catch (Exception e) {
			callback.onFailure(e);
		}
	}

	public interface CookieCallback {

		void onSuccess(Session session);

		void onFailure(Exception e);

	}

	protected static Callback getCallback(
			final String server, final CookieCallback callback,
			final CookieManager cookieManager,
			final CookieAuthentication authentication) {

		return new Callback() {

			@Override
			public void onFailure(Request request, IOException ioe) {
				callback.onFailure(ioe);
			}

			@Override
			public void onResponse(Response response) {
				try {
					Session session = parseResponse(
						response, server, cookieManager, authentication);

					callback.onSuccess(session);
				}
				catch (Exception e) {
					callback.onFailure(e);
				}
			}
		};
	}

	protected static CookieAuthentication getCookieAuthentication(
			Authentication authentication) {

		return (CookieAuthentication)authentication;
	}

	protected static String getHttpCookies(CookieStore cookieStore) {
		StringBuilder cookies = new StringBuilder();

		for (HttpCookie cookie : cookieStore.getCookies()) {
			cookies.append(cookie);
			cookies.append(";");
		}

		return cookies.toString();
	}

	protected static String parseAuthToken(String body)
		throws AuthenticationException, IOException {

		Pattern tokenPattern = Pattern.compile(
				".*Liferay.authToken\\s*=\\s*[\"'](.{8})[\"'].*");

		Matcher matcher = tokenPattern.matcher(body);

		if (!matcher.find()) {
			throw new AuthenticationException("Cookie invalid or empty");
		}

		return matcher.group(1);
	}

	protected static Session parseResponse(
			Response response, String server, CookieManager cookieManager,
			CookieAuthentication authentication)
		throws Exception {

		if (response.code() == 500) {
			throw new AuthenticationException("Cookie invalid or empty");
		}

		String body = response.body().string();
		String authToken = parseAuthToken(body);
		String cookieHeader = getHttpCookies(cookieManager.getCookieStore());

		if (Validator.isNotNull(cookieHeader)) {
			authentication.setAuthToken(authToken);
			authentication.setCookieHeader(cookieHeader);
			authentication.setLastCookieRefresh(System.currentTimeMillis());

			return new SessionImpl(server, authentication);
		}
		else {
			throw new AuthenticationException("Cookie invalid or empty");
		}
	}

	protected CookieSignIn(Session session) {
		this.session = session;
	}

	protected String getBody(String username, String password)
		throws IOException {

		RequestBody formBody = new FormEncodingBuilder()
			.add("login", username)
			.add("password",password)
			.build();

		Buffer buffer = new Buffer();
		formBody.writeTo(buffer);

		return buffer.readUtf8();
	}

	protected Builder getBuilder(
			Session session, String username, String password)
		throws IOException {

		Builder builder = new Builder();

		MediaType contentType = MediaType.parse(
			"application/x-www-form-urlencoded");

		builder.post(
			RequestBody.create(contentType, getBody(username, password)));

		builder.addHeader("Cookie", "COOKIE_SUPPORT=true;");
		builder.url(getLoginURL(session.getServer()));

		return builder;
	}

	protected String getLoginURL(String server) {
		if (server.contains("/api/jsonws/invoke")) {
			server = server.substring(0, server.indexOf("/api/jsonws/invoke"));
		}

		if (!server.endsWith("/")) {
			server = server + "/";
		}

		return server + "c/portal/login";
	}

	protected Call signIn() throws Exception {
		if (!(session.getAuthentication() instanceof CookieAuthentication)) {
			throw new Exception(
				"Can't sign in if authentication implementation is not " +
					"CookieAuthentication");
		}

		CookieAuthentication cookieAuthentication = getCookieAuthentication(
			session.getAuthentication());

		username = cookieAuthentication.getUsername();
		password = cookieAuthentication.getPassword();

		cookieManager = new CookieManager();
		cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);

		OkHttpClient client = new OkHttpClient();

		Authenticator authenticator = authenticators.get(session.getServer());

		if (authenticator != null) {
			client.setAuthenticator(authenticator);
		}

		client.setCookieHandler(cookieManager);
		client.setFollowRedirects(true);

		Builder builder = getBuilder(session, username, password);

		return client.newCall(builder.build());
	}


	protected CookieManager cookieManager;
	protected String password;
	protected Session session;
	protected String username;

	protected static final Map<String, Authenticator> authenticators =
			new HashMap<String, Authenticator>();
}