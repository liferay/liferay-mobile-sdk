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
import com.liferay.mobile.android.v62.portal.PortalService;
import com.liferay.mobile.android.v62.user.UserService;

import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * @author Bruno Farache
 */
public class ServiceReturnTypeTest extends BaseTest {

	public ServiceReturnTypeTest() throws IOException {
		super();
	}

	@Test
	public void getAutoDeployDirectory() throws Exception {
		PortalService service = new PortalService(session);
		String directory = service.getAutoDeployDirectory();
		assertNotNull(directory);
	}

	@Test
	public void getCompanyUsersCountAsync() throws Exception {
		UserService service = new UserService(session);

		Call<Integer> call = service.getCompanyUsersCount(
			props.getCompanyId());

		final CountDownLatch lock = new CountDownLatch(1);

		call.async(session, new Callback<Integer>() {

			@Override
			public void onSuccess(Integer count) {
				assertTrue(count > 0);
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
	public void getUserIdByEmailAddress() throws Exception {
		UserService service = new UserService(session);
		long userId = service.getUserIdByEmailAddress(
			props.getCompanyId(), props.getLogin());

		assertTrue(userId > 0);

		boolean hasGroupUser = service.hasGroupUser(props.getGroupId(), userId);
		assertTrue(hasGroupUser);
	}

}