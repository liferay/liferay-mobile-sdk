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

import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.json.JSONParser;
import com.liferay.mobile.sdk.service.CustomGroupService;

import java.io.IOException;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Bruno Farache
 */
public class BatchTest extends BaseTest {

	public BatchTest() throws IOException {
		super();
	}

	@Test
	public void getUserSites() throws Exception {
		CustomGroupService service = new CustomGroupService();
		Response response = Batch.execute(
			service.getUserSites(), service.getUserSites());

		List sites = JSONParser.fromJSON(response, List.class);
		assertEquals(2, sites.size());

		GroupServiceTest.assertUserSitesAsMap(
			(List<Map<String, Object>>)sites.get(0));

		GroupServiceTest.assertUserSitesAsMap(
			(List<Map<String, Object>>)sites.get(1));
	}

	@Test
	public void getUserSitesAsync() throws Exception {
		CustomGroupService service = new CustomGroupService();
		final CountDownLatch lock = new CountDownLatch(1);

		Batch.async(new Callback<Response>() {

			@Override
			public void onSuccess(Response response) {
				try {
					List sites = JSONParser.fromJSON(response, List.class);
					assertEquals(2, sites.size());

					GroupServiceTest.assertUserSitesAsMap(
						(List<Map<String, Object>>)sites.get(0));

					GroupServiceTest.assertUserSitesAsMap(
						(List<Map<String, Object>>)sites.get(1));
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

		}, service.getUserSites(), service.getUserSites());

		lock.await(500, TimeUnit.MILLISECONDS);
	}

}