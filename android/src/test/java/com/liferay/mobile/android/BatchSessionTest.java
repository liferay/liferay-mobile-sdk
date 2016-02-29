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

import com.liferay.mobile.android.service.BatchSessionImpl;
import com.liferay.mobile.android.v7.group.GroupService;

import java.io.IOException;

import org.json.JSONArray;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Bruno Farache
 */
public class BatchSessionTest extends BaseTest {

	public BatchSessionTest() throws IOException {
		super();
	}

	@Test
	public void getUserSites() throws Exception {
		BatchSessionImpl session = new BatchSessionImpl(this.session);

		GroupService service = new GroupService(session);

		service.getUserSitesGroups();
		service.getUserSitesGroups();

		JSONArray result = session.invoke();

		GroupServiceTest.assertUserSites(result.getJSONArray(0));
		GroupServiceTest.assertUserSites(result.getJSONArray(1));

		result = session.invoke();

		assertNull(result);
	}

}