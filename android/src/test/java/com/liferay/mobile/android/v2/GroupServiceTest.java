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

package com.liferay.mobile.android.v2;

import com.liferay.mobile.android.BaseTest;

import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

/**
 * @author Bruno Farache
 */
public class GroupServiceTest extends BaseTest {

	public GroupServiceTest() throws IOException {
		super();
	}

	@Test
	public void async() throws Exception {
		GroupService service = new GroupService(session);
		Call<List<Site>> call = service.getUserSites();

		final CountDownLatch lock = new CountDownLatch(1);

		call.async(new Callback<List<Site>>() {

			@Override
			public void onSuccess(List<Site> sites) {
				assertUserSites(sites);
				lock.countDown();
			}

			@Override
			public void onFailure(Exception exception) {
				fail(exception.getMessage());
				lock.countDown();
			}

		});

		lock.await(500, TimeUnit.MILLISECONDS);
	}

	@Test
	public void execute() throws Exception {
		GroupService service = new GroupService(session);
		Call<List<Site>> call = service.getUserSites();
		assertUserSites(call.execute());
	}

	protected void assertUserSites(List<Site> sites) {
		assertNotNull(sites);
		assertTrue(sites.size() > 0);

		Site site = sites.get(0);
		assertEquals("/test", site.friendlyURL);

		site = sites.get(1);
		assertEquals("/guest", site.friendlyURL);
	}

}