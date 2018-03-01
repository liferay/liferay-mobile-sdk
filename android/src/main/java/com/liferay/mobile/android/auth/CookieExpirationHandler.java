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

import com.liferay.mobile.android.auth.CookieSignIn.CookieCallback;
import com.liferay.mobile.android.auth.basic.CookieAuthentication;
import com.liferay.mobile.android.http.Request;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.service.SessionImpl;

import com.squareup.okhttp.Authenticator;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class CookieExpirationHandler {
	public static void registerAuthenticatorForServer(
			String server, Authenticator authenticator) {

		authenticators.put(server, authenticator);
	}

	public static Session reloadSessionIfNeeded(
			final Request request, final CookieCallback callback)
				throws Exception {

		final Session session = new SessionImpl(
				request.getURL(), request.getAuthentication());

		if (shouldCheckCookieExpiration(request.getAuthentication())) {
			CookieAuthentication authentication =
					(CookieAuthentication)request.getAuthentication();

			lock.lock();

			if (shouldRefreshCookie(
					authentication.getLastCookieRefresh(),
					authentication.getCookieExpirationTime())) {

				Authenticator authenticator = authenticators.get(
						session.getServer());

				if (callback == null) {
					try {
						Session cookieSession = CookieSignIn.signIn(
								session, authenticator);

						request.setAuthentication(
								cookieSession.getAuthentication());

						return cookieSession;
					}
					finally {
						lock.unlock();
					}
				}
				else {
					CookieSignIn.signIn(session, new CookieCallback() {

						@Override
						public void onSuccess(Session cookieSession) {
							session.setAuthentication(
									cookieSession.getAuthentication());

							lock.unlock();

							callback.onSuccess(session);
						}

						@Override
						public void onFailure(Exception e) {
							lock.unlock();

							callback.onFailure(e);
						}
					}, authenticator);

					return null;
				}
			}
			else {
				lock.unlock();
			}
		}

		if (callback != null) {
			callback.onSuccess(session);

			return null;
		}
		else {
			return session;
		}
	}

	protected static boolean shouldCheckCookieExpiration(
			Authentication authentication) {

		if (authentication instanceof CookieAuthentication) {
			CookieAuthentication cookieAuthentication =
					(CookieAuthentication)authentication;

			if (cookieAuthentication.shouldHandleExpiration()) {
				return true;
			}
		}

		return false;
	}

	protected static boolean shouldRefreshCookie(
			long lastCookieRefresh, int cookieExpirationTime) {

		long now = System.currentTimeMillis();
		long deltaTime = TimeUnit.MILLISECONDS.toSeconds(
				now - lastCookieRefresh);

		if (deltaTime > cookieExpirationTime) {
			return true;
		}

		return false;
	}

	protected static final Map<String, Authenticator> authenticators =
			new HashMap<String, Authenticator>();
	protected static final Lock lock = new ReentrantLock();

}