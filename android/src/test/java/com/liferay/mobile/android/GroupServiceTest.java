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

import com.liferay.mobile.android.v7.group.GroupService;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Bruno Farache
 */
public class GroupServiceTest extends BaseTest {

	public static void assertUserSites(JSONArray sites) throws Exception {
		assertNotNull(sites);
		assertTrue(sites.length() > 0);

		JSONObject jsonObj = sites.getJSONObject(0);
		assertEquals("/test", jsonObj.getString("friendlyURL"));

		jsonObj = sites.getJSONObject(1);
		assertEquals("/global", jsonObj.getString("friendlyURL"));

		jsonObj = sites.getJSONObject(2);
		assertEquals("/guest", jsonObj.getString("friendlyURL"));
	}

	public GroupServiceTest() throws IOException {
		super();
	}

	@Test
	public void getUserSites() throws Exception {
		GroupService service = new GroupService(session);

		JSONArray sites = service.getUserSitesGroups();
		assertUserSites(sites);
	}

}