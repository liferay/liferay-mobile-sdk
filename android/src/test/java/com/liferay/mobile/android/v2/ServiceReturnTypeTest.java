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

import java.io.IOException;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import static org.junit.Assert.*;

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
		Call<String> call = service.getAutoDeployDirectory();
		String directory = call.execute(session);
		assertNotNull(directory);
	}

	@Test
	public void getAutoDeployDirectoryAsync() throws InterruptedException {
		PortalService service = new PortalService(session);
		Call<String> call = service.getAutoDeployDirectory();
		final CountDownLatch lock = new CountDownLatch(1);

		call.async(session, new Callback<String>() {

			@Override
			public void onSuccess(String directory) {
				assertNotNull(directory);
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
	public void getCompanyUsersCount() throws Exception {
		UserService service = ServiceBuilder.build(UserService.class);
		long companyId = props.getCompanyId();
		Call<Integer> call = service.getCompanyUsersCount(companyId);
		int count = call.execute(session);
		assertTrue(count > 0);
	}

	@Test
	public void getCompanyUsersCountAsync() throws InterruptedException {
		UserService service = ServiceBuilder.build(UserService.class);
		Call<Integer> call = service.getCompanyUsersCount(props.getCompanyId());
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
		long companyId = props.getCompanyId();
		long groupId = props.getGroupId();
		String login = props.getLogin();

		UserService service = ServiceBuilder.build(UserService.class);
		Call<Long> call = service.getUserIdByEmailAddress(companyId, login);
		long userId = call.execute(session);
		assertTrue(userId > 0);

		Call<Boolean> call2 = service.hasGroupUser(groupId, userId);
		assertTrue(call2.execute(session));
	}

	@Test
	public void getUserIdByEmailAddressAsync() throws InterruptedException {
		long companyId = props.getCompanyId();
		final long groupId = props.getGroupId();
		String login = props.getLogin();
		final CountDownLatch lock = new CountDownLatch(1);
		final UserService service = ServiceBuilder.build(UserService.class);
		Call<Long> call = service.getUserIdByEmailAddress(companyId, login);

		call.async(session, new Callback<Long>() {

			@Override
			public void onSuccess(Long userId) {
				assertTrue(userId > 0);

				Call<Boolean> call = service.hasGroupUser(groupId, userId);
				call.async(session, new Callback<Boolean>() {

					@Override
					public void onSuccess(Boolean hasGroupUser) {
						assertTrue(hasGroupUser);
						lock.countDown();
					}

					@Override
					public void onFailure(Exception exception) {
						fail(exception.getMessage());
						lock.countDown();
					}

				});
			}

			@Override
			public void onFailure(Exception exception) {
				fail(exception.getMessage());
				lock.countDown();
			}

		});

		lock.await(500, TimeUnit.MILLISECONDS);
	}

}