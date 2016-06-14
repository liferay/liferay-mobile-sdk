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

import com.liferay.mobile.android.auth.basic.BasicAuthentication;
import com.liferay.mobile.android.auth.basic.CookieAuthentication;
import com.liferay.mobile.android.callback.BaseCallback;
import com.liferay.mobile.android.callback.Callback;
import com.liferay.mobile.android.callback.typed.JSONArrayCallback;
import com.liferay.mobile.android.callback.typed.JSONObjectCallback;
import com.liferay.mobile.android.exception.AuthenticationException;
import com.liferay.mobile.android.http.Method;
import com.liferay.mobile.android.http.Request;
import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.http.client.OkHttpClientImpl;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.service.SessionImpl;
import com.liferay.mobile.android.v7.group.GroupService;
import com.liferay.mobile.android.v7.user.UserService;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.RequestBody;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.util.HashMap;
import java.util.Map;

import okio.Buffer;

/**
 * @author Bruno Farache
 */
public class SignIn {

	public static void signInWithCookie(Session session, final BaseCallback<Session> callback) {

		try {
			if (!(session.getAuthentication() instanceof BasicAuthentication)) {
				throw new Exception(
					"Can't sign in if authentication implementation is not BasicAuthentication");
			}

			BasicAuthentication authentication = (BasicAuthentication) session.getAuthentication();
			String body = getStringBody(authentication);

			OkHttpClientImpl okHttpClient = new OkHttpClientImpl();
			final CookieManager cookieManager = new CookieManager();
			cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
			okHttpClient.setCookieHandler(cookieManager);

			Map<String, String> headers = new HashMap<>(session.getHeaders());
			headers.put("Cookie", "COOKIE_SUPPORT=true;");
			session.setHeaders(headers);

			Request request = new Request(
				authentication, Method.POST, session.getHeaders(),
				getLoginUrl(session.getServer()), body, session.getConnectionTimeout(),
				getCookieCallback(session.getServer(), callback, cookieManager), null,
				"application/x-www-form-urlencoded", true);

			okHttpClient.send(request);
		}
		catch (Exception e) {
			callback.onFailure(e);
		}
	}

	private static Callback getCookieCallback(final String server,
	                                          final BaseCallback<Session> callback,
	                                          final CookieManager cookieManager) {
		return new Callback() {
			@Override
			public void inBackground(Response response) {
				try {
					String body = response.getBody();
					Integer position = body.indexOf(AUTH_TOKEN) + AUTH_TOKEN.length();
					String authToken = body.substring(position, position + TOKEN_LENGTH);

					String cookieHeader = getHttpCookies(cookieManager.getCookieStore());

					if (!cookieHeader.isEmpty()) {
						Authentication authentication =
							new CookieAuthentication(authToken, cookieHeader);
						Session session = new SessionImpl(server, authentication);
						callback.onSuccess(session);
					}
					else {
						callback.onFailure(new AuthenticationException("Cookie invalid or empty"));
					}
				}
				catch (Exception e) {
					callback.onFailure(e);
				}
			}

			@Override
			public void doFailure(Exception exception) {
				callback.onFailure(exception);
			}
		};
	}

	public static void signIn(
		final Session session, final JSONObjectCallback callback,
		final SignInMethod method) {

		GroupService groupService = new GroupService(session);

		session.setCallback(new JSONArrayCallback() {

			@Override
			public void onSuccess(JSONArray sites) {
				if (sites.length() == 0) {
					onFailure(new Exception("User doesn't belong to any site"));
				}

				try {
					JSONObject site = sites.getJSONObject(0);
					long companyId = site.getLong("companyId");

					Session userSession = new SessionImpl(session);
					userSession.setCallback(callback);

					UserService userService = new UserService(userSession);

					String username = getUsername(session);

					if (method == SignInMethod.EMAIL) {
						userService.getUserByEmailAddress(companyId, username);
					}
					else if (method == SignInMethod.USER_ID) {
						userService.getUserById(Long.parseLong(username));
					}
					else {
						userService.getUserByScreenName(companyId, username);
					}
				}
				catch (Exception e) {
					onFailure(e);
				}
			}

			@Override
			public void onFailure(Exception exception) {
				callback.onFailure(exception);
			}

		});

		try {
			groupService.getUserSitesGroups();
		}
		catch (Exception e) {
			callback.onFailure(e);
		}
	}

	public static void signIn(Session session, JSONObjectCallback callback) {
		try {
			String username = getUsername(session);
			SignInMethod method = SignInMethod.fromUsername(username);

			signIn(session, callback, method);
		}
		catch (Exception e) {
			callback.onFailure(e);
		}
	}

	protected static String getUsername(Session session) throws Exception {
		Authentication auth = session.getAuthentication();

		if (auth == null) {
			throw new Exception("Session's authentication can't be null");
		}

		if (!(auth instanceof BasicAuthentication)) {
			throw new Exception(
				"Can't sign in if authentication implementation is not" +
					"BasicAuthentication");
		}

		return ((BasicAuthentication) auth).getUsername();
	}

	private static String getHttpCookies(CookieStore cookieStore) {
		String cookies = "";
		for (HttpCookie cookie : cookieStore.getCookies()) {
			cookies += cookie + ";";
		}
		return cookies;
	}

	private static String getLoginUrl(String server) {
		if (!server.endsWith("/")) {
			server += "/";
		}
		return server + "c/portal/login";
	}

	private static String getStringBody(BasicAuthentication basicAuthentication)
		throws IOException {

		RequestBody formBody = new FormEncodingBuilder()
			.add("login", basicAuthentication.getUsername())
			.add("password", basicAuthentication.getPassword())
			.build();

		Buffer buffer = new Buffer();
		formBody.writeTo(buffer);
		return buffer.readUtf8();
	}

	private static final int TOKEN_LENGTH = 8;
	private static final String AUTH_TOKEN = "Liferay.authToken=\"";
	
}