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

package com.liferay.mobile.android;

import com.liferay.mobile.android.auth.CookieSignIn;
import com.liferay.mobile.android.auth.basic.CookieAuthentication;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.service.SessionImpl;
import com.liferay.mobile.android.v7.group.GroupService;

import java.io.IOException;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.json.JSONArray;

import org.junit.Test;

import static junit.framework.Assert.fail;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Bruno Farache
 */
public class CookieAuthenticationTest extends BaseTest {

	public CookieAuthenticationTest() throws IOException {
		super();

		CookieAuthentication cookieAuthentication = new CookieAuthentication
				("", "", props.getLogin(), props.getPassword());

		session.setAuthentication(cookieAuthentication);
	}

	@Test
	public void signIn_sync() throws Exception {
		Session session = new SessionImpl(this.session);
		JSONArray[] sites = { null };

		Session cookieSession = CookieSignIn.signIn(session);
		GroupService service = new GroupService(cookieSession);
		sites[0] = service.getUserSitesGroups();

		GroupServiceTest.assertUserSites(sites[0]);
	}

	@Test
	public void signIn_async() throws Exception {
		Session session = new SessionImpl(this.session);
		final JSONArray[] sites = { null };
		final CountDownLatch lock = new CountDownLatch(1);

		CookieSignIn.signIn(session, new CookieSignIn.CookieCallback() {

			@Override
			public void onSuccess(Session session) {
				try {
					GroupService service = new GroupService(session);
					sites[0] = service.getUserSitesGroups();
					lock.countDown();
				}
				catch (Exception e) {
					onFailure(e);
				}
			}

			@Override
			public void onFailure(Exception exception) {
				fail(exception.getMessage());
				lock.countDown();
			}

		});

		lock.await(2000, TimeUnit.MILLISECONDS);
		GroupServiceTest.assertUserSites(sites[0]);
	}
    @Test
    public void cookieAuthenticationShouldBeRefreshed() throws Exception {
        Session session = new SessionImpl(this.session);

        Session cookieSession = CookieSignIn.signIn(session);

        CookieAuthentication authentication = (CookieAuthentication)
                cookieSession.getAuthentication();

        String cookieHeader = authentication.getCookieHeader();
        String authToken = authentication.getAuthToken();

        authentication.setCookieExpirationTime(0);

        JSONArray userSites = new GroupService(cookieSession)
                .getUserSitesGroups();

        assertNotEquals(cookieHeader, authentication.getCookieHeader());
        assertNotEquals(authToken, authentication.getAuthToken());
        GroupServiceTest.assertUserSites(userSites);
    }

}