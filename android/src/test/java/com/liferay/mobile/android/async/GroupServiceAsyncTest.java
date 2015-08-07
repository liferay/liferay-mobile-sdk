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

package com.liferay.mobile.android.async;

import com.liferay.mobile.android.BaseTest;
import com.liferay.mobile.android.GroupServiceTest;
import com.liferay.mobile.android.callback.typed.JSONArrayCallback;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.service.SessionImpl;
import com.liferay.mobile.android.v62.group.GroupService;

import java.io.IOException;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.json.JSONArray;

import org.junit.Test;

import static junit.framework.Assert.fail;

/**
 * @author Bruno Farache
 */
public class GroupServiceAsyncTest extends BaseTest {

	public GroupServiceAsyncTest() throws IOException {
		super();
	}

	@Test
	public void getUserSites() throws Exception {
		Session session = new SessionImpl(this.session);

		final JSONArray[] sites = { null };
		final CountDownLatch lock = new CountDownLatch(1);

		session.setCallback(new JSONArrayCallback() {

			@Override
			public void onSuccess(JSONArray result) {
				try {
					sites[0] = result;
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

		GroupService service = new GroupService(session);
		service.getUserSites();

		lock.await(500, TimeUnit.MILLISECONDS);
		GroupServiceTest.assertUserSites(sites[0]);
	}

}