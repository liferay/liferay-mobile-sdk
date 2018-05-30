/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.mobile.android.auth.refresh;

import com.liferay.mobile.android.auth.Authentication;
import com.liferay.mobile.android.auth.CookieSignIn;
import com.liferay.mobile.android.auth.CookieSignIn.CookieCallback;
import com.liferay.mobile.android.auth.SessionCallback;
import com.liferay.mobile.android.auth.basic.CookieAuthentication;
import com.liferay.mobile.android.service.Session;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CookieAuthenticationRefreshHandler implements
        AuthenticationRefreshHandler {

    @Override
    public Session refreshAuthentication(final Session session,
        final SessionCallback callback) throws Exception {

        if (shouldCheckCookieExpiration(session.getAuthentication())) {
            CookieAuthentication authentication =
                    (CookieAuthentication) session.getAuthentication();

            lock.lock();

            if (shouldRefreshCookie(
                    authentication.getLastCookieRefresh(),
                    authentication.getCookieExpirationTime())) {

                if (callback == null) {
                    try {
                        return CookieSignIn.signIn(session);
                    } finally {
                        lock.unlock();
                    }
                } else {
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
                    });

                    return null;
                }
            } else {
                lock.unlock();
            }
        }

        if (callback != null) {
            callback.onSuccess(session);

            return null;
        } else {
            return session;
        }
    }

    private static boolean shouldCheckCookieExpiration(
            Authentication authentication) {

        if (authentication instanceof CookieAuthentication) {
            CookieAuthentication cookieAuthentication =
                    (CookieAuthentication) authentication;

            if (cookieAuthentication.shouldHandleExpiration()) {
                return true;
            }
        }

        return false;
    }

    private static boolean shouldRefreshCookie(
            long lastCookieRefresh, int cookieExpirationTime) {

        long now = System.currentTimeMillis();
        long deltaTime = TimeUnit.MILLISECONDS.toSeconds(
                now - lastCookieRefresh);

        return deltaTime + TOLERANCE > cookieExpirationTime;

    }

    protected static final Lock lock = new ReentrantLock();
    private static final int TOLERANCE = 60;
}