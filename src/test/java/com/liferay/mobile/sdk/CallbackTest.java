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

import com.liferay.mobile.sdk.callback.OnFailure;
import com.liferay.mobile.sdk.callback.OnSuccess;
import com.liferay.mobile.sdk.v7.group.GroupService;

import org.json.JSONObject;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;

/**
 * @author Bruno Farache
 */
public class CallbackTest extends BaseTest {

	public CallbackTest() throws IOException {
		super();
	}

	@Test
	public void getGroupAsync() throws Exception {
		final CountDownLatch lock = new CountDownLatch(1);

		GroupService service = ServiceBuilder.build(GroupService.class);
		final long groupId = props.getGroupId();
		final long[] result = {0};

		Call<JSONObject> call = service.getGroup(groupId);

		call.async(
			new OnSuccess<JSONObject>() {

				@Override
				public void onSuccess(JSONObject site) {
					result[0] = site.optLong("groupId");
					lock.countDown();
				}

			},
			new OnFailure() {

				@Override
				public void onFailure(Exception exception) {
					fail(exception.getMessage());
					lock.countDown();
				}

			}
		);

		await(lock);
		assertEquals(groupId, result[0]);
	}

	@Test
	public void getGroupAsyncFailure() throws Exception {
		final CountDownLatch lock = new CountDownLatch(1);

		GroupService service = ServiceBuilder.build(GroupService.class);
		final Exception[] exceptions = {null};

		Call<JSONObject> call = service.getGroup(111111);

		call.async(
			new OnSuccess<JSONObject>() {

				@Override
				public void onSuccess(JSONObject site) {
					fail("Should not call onSuccess");
					lock.countDown();
				}

			},
			new OnFailure() {

				@Override
				public void onFailure(Exception exception) {
					exceptions[0] = exception;
					lock.countDown();
				}

			}
		);

		await(lock);
		assertNotNull(exceptions[0]);
	}

	@Test(expected = IllegalArgumentException.class)
	public void missingOnSuccess() throws Exception {
		GroupService service = ServiceBuilder.build(GroupService.class);
		Call<JSONObject> call = service.getGroup(props.getGroupId());

		call.async(null, new OnFailure() {

			@Override
			public void onFailure(Exception exception) {
			}

		});
	}

	@Test(expected = IllegalArgumentException.class)
	public void missingOnFailure() throws Exception {
		GroupService service = ServiceBuilder.build(GroupService.class);
		Call<JSONObject> call = service.getGroup(props.getGroupId());

		call.async(
			new OnSuccess<JSONObject>() {

				@Override
				public void onSuccess(JSONObject result) {
				}

			},
			null
		);
	}

}