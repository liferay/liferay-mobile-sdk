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

import com.liferay.mobile.sdk.service.Config;
import com.liferay.mobile.sdk.v2.Call;
import com.liferay.mobile.sdk.v2.ServiceBuilder;
import com.liferay.mobile.sdk.v62.group.GroupService;

import java.io.IOException;

import java.net.SocketTimeoutException;

import org.json.JSONArray;

import org.junit.Test;

/**
 * @author Bruno Farache
 */
public class ConnectionTimeoutTest {

	public ConnectionTimeoutTest() throws IOException {
		super();
	}

	@Test(expected = SocketTimeoutException.class)
	public void connectionTimeoutException() throws Exception {
		Config config = Config.server("http://www.liferay.com").timeout(5);
		GroupService service = ServiceBuilder.build(GroupService.class);
		Call<JSONArray> call = service.getUserSites();
		call.execute(config);
	}

}