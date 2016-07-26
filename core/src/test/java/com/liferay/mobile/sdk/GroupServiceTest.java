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
import com.liferay.mobile.sdk.service.CustomGroupService;
import com.liferay.mobile.sdk.service.Site;
import com.liferay.mobile.sdk.v7.group.GroupService;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

import org.json.JSONArray;
import org.json.JSONObject;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Bruno Farache
 */
public class GroupServiceTest extends BaseTest {

	public GroupServiceTest() throws IOException {
		super();
	}

	@Test
	public void disableStaging() throws Exception {
		GroupService service = ServiceBuilder.build(GroupService.class);
		long groupId = props.getGroupId();
		Call<Response> call = service.disableStaging(groupId);
		Response response = call.execute();
		assertEquals(200, response.statusCode());
	}

	@Test
	public void disableStagingAsync() throws Exception {
		final CountDownLatch lock = new CountDownLatch(1);

		GroupService service = ServiceBuilder.build(GroupService.class);
		long groupId = props.getGroupId();

		Call<Response> call = service.disableStaging(groupId);
		TestCallback<Response> callback = new TestCallback<>(lock);
		call.async(callback);

		await(lock);
		assertEquals(200, callback.result.statusCode());
	}

	@Test
	public void getGroup() throws Exception {
		GroupService service = ServiceBuilder.build(GroupService.class);
		long groupId = props.getGroupId();
		Call<JSONObject> call = service.getGroup(groupId);
		JSONObject group = call.execute();
		assertEquals(groupId, group.getLong("groupId"));
	}

	@Test
	public void getGroupAsMap() throws Exception {
		CustomGroupService service = new CustomGroupService();
		long groupId = props.getGroupId();
		Call<Map<String, Object>> call = service.getGroupAsMap(groupId);
		Map<String, Object> group = call.execute();
		assertEquals(String.valueOf(groupId), group.get("groupId"));
	}

	@Test
	public void getGroupAsMapAsync() throws Exception {
		final CountDownLatch lock = new CountDownLatch(1);

		CustomGroupService service = new CustomGroupService();
		long groupId = props.getGroupId();

		Call<Map<String, Object>> call = service.getGroupAsMap(groupId);
		TestCallback<Map<String, Object>> callback = new TestCallback<>(lock);
		call.async(callback);

		await(lock);
		assertEquals(String.valueOf(groupId), callback.result.get("groupId"));
	}

	@Test
	public void getGroupAsSite() throws Exception {
		CustomGroupService service = new CustomGroupService();
		long groupId = props.getGroupId();
		Call<Site> call = service.getGroupAsSite(groupId);
		Site group = call.execute();
		assertEquals(groupId, group.groupId);
	}

	@Test
	public void getGroupAsSiteAsync() throws Exception {
		final CountDownLatch lock = new CountDownLatch(1);

		CustomGroupService service = new CustomGroupService();
		final long groupId = props.getGroupId();

		Call<Site> call = service.getGroupAsSite(groupId);
		TestCallback<Site> callback = new TestCallback<>(lock);
		call.async(callback);

		await(lock);
		assertEquals(groupId, callback.result.groupId);
	}

	@Test
	public void getGroupAsync() throws Exception {
		final CountDownLatch lock = new CountDownLatch(1);

		GroupService service = ServiceBuilder.build(GroupService.class);
		final long groupId = props.getGroupId();

		Call<JSONObject> call = service.getGroup(groupId);
		TestCallback<JSONObject> callback = new TestCallback<>(lock);
		call.async(callback);

		await(lock);
		assertEquals(groupId, callback.result.optLong("groupId"));
	}

	@Test
	public void getUserSites() throws Exception {
		GroupService service = ServiceBuilder.build(GroupService.class);
		Call<JSONArray> call = service.getUserSitesGroups();
		assertUserSites(call.execute());
	}

	@Test
	public void getUserSitesAsListOfMap() throws Exception {
		CustomGroupService service = new CustomGroupService();
		Call<List<Map<String, Object>>> call =
			service.getUserSitesAsListOfMap();

		assertUserSitesAsMap(call.execute());
	}

	@Test
	public void getUserSitesAsListOfMapAsync() throws InterruptedException {
		final CountDownLatch lock = new CountDownLatch(1);

		CustomGroupService service = new CustomGroupService();
		Call<List<Map<String, Object>>> call =
			service.getUserSitesAsListOfMap();

		TestCallback<List<Map<String, Object>>> callback = new TestCallback<>(
			lock);

		call.async(callback);

		await(lock);
		assertUserSitesAsMap(callback.result);
	}

	@Test
	public void getUserSitesAsListOfSites() throws Exception {
		CustomGroupService service = new CustomGroupService();
		Call<List<Site>> call = service.getUserSitesAsListOfSites();
		assertUserSites(call.execute());
	}

	@Test
	public void getUserSitesAsListOfSitesAsync() throws InterruptedException {
		final CountDownLatch lock = new CountDownLatch(1);

		CustomGroupService service = new CustomGroupService();
		Call<List<Site>> call = service.getUserSitesAsListOfSites();
		TestCallback<List<Site>> callback = new TestCallback<>(lock);
		call.async(callback);

		await(lock);
		assertUserSites(callback.result);
	}

	@Test
	public void getUserSitesAsync() throws InterruptedException {
		final CountDownLatch lock = new CountDownLatch(1);

		CustomGroupService service = new CustomGroupService();
		Call<JSONArray> call = service.getUserSitesGroups();
		TestCallback<JSONArray> callback = new TestCallback<>(lock);
		call.async(callback);

		await(lock);
		assertUserSites(callback.result);
	}

	protected static void assertUserSites(JSONArray jsonArray) {
		assertNotNull(jsonArray);
		List<Site> sites = new ArrayList<>();

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonObj = jsonArray.optJSONObject(i);
			sites.add(new Site(jsonObj.optString("friendlyURL")));
		}

		assertUserSites(sites);
	}

	protected static void assertUserSites(List<Site> sites) {
		assertNotNull(sites);
		assertTrue(sites.size() == 3);

		Site site = sites.get(0);
		assertNotNull(site);
		assertEquals("/test", site.friendlyURL);

		site = sites.get(1);
		assertNotNull(site);
		assertEquals("/global", site.friendlyURL);

		site = sites.get(2);
		assertNotNull(site);
		assertEquals("/guest", site.friendlyURL);
	}

	protected static void assertUserSitesAsMap(List<Map<String, Object>> list) {
		assertNotNull(list);
		List<Site> sites = new ArrayList<>();

		for (Map<String, Object> map : list) {
			sites.add(new Site((String)map.get("friendlyURL")));
		}

		assertUserSites(sites);
	}

}