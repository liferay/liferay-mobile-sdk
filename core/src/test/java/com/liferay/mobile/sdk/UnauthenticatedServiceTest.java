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
import com.liferay.mobile.sdk.exception.ServerException;
import com.liferay.mobile.sdk.v7.group.GroupService;

import java.io.IOException;

import org.json.JSONArray;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Jose M. Navarro
 */
public class UnauthenticatedServiceTest extends BaseTest {

	public UnauthenticatedServiceTest() throws IOException {
		super();
	}

	@Test
	public void getUserSites() throws Exception {
		try {
			GroupService service = ServiceBuilder.build(GroupService.class);
			Call<JSONArray> call = service.getUserSitesGroups();
			Config global = Config.global();
			call.execute(new Builder(global.server()).build());
			fail();
		}
		catch (ServerException se) {
			assertEquals("Authenticated access required", se.getMessage());
		}
	}

}