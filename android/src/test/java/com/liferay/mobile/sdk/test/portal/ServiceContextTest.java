/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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

package com.liferay.mobile.sdk.test.portal;

import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v62.bookmarksentry.BookmarksEntryService;
import com.liferay.mobile.sdk.test.BaseTest;

import java.io.IOException;

import java.util.Random;

import org.json.JSONObject;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Bruno Farache
 */
public class ServiceContextTest extends BaseTest {

	public ServiceContextTest() throws IOException {
		super();
	}

	@Test
	public void testServiceContext() throws Exception {
		BookmarksEntryService service = new BookmarksEntryService(session);
		long groupId = props.getGroupId();

		Random random = new Random();
		String uuid = String.valueOf(Math.abs(random.nextInt()));

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("uuid", uuid);

		JSONObjectWrapper serviceContext = new JSONObjectWrapper(jsonObject);

		JSONObject entry = service.addEntry(
			groupId, 0, "test", "http://www.liferay.com", "", serviceContext);

		assertEquals(uuid, entry.getString("uuid"));
		service.deleteEntry(entry.getLong("entryId"));
	}

}