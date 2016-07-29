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

import com.liferay.mobile.sdk.Config.Builder;
import com.liferay.mobile.sdk.auth.CookieAuthentication;
import com.liferay.mobile.sdk.auth.CookieSignIn;
import com.liferay.mobile.sdk.auth.CookieSignIn.CookieCallback;
import com.liferay.mobile.sdk.v7.group.GroupService;

import java.io.IOException;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.json.JSONArray;

import org.junit.Test;

import static junit.framework.Assert.fail;

/**
 * @author Bruno Farache
 */
public class CookieAuthenticationTest extends BaseTest {

	public CookieAuthenticationTest() throws IOException {
		super();
	}

	@Test
	public void signIn() throws Exception {
		final JSONArray[] sites = { null };
		final CountDownLatch lock = new CountDownLatch(1);

		CookieSignIn.signIn(Config.global(), new CookieCallback() {

			@Override
			public void onSuccess(CookieAuthentication auth) {
				try {
					Builder builder = Config.global().newBuilder();
					builder.auth(auth);

					GroupService service = ServiceBuilder.build(
						GroupService.class);

					Call<JSONArray> call = service.getUserSitesGroups();
					sites[0] = call.execute(builder.build());
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

}