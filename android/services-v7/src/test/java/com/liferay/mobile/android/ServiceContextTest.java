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

import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v7.bookmarksentry.BookmarksEntryService;

import java.io.IOException;

import java.util.Random;

import org.json.JSONObject;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Bruno Farache
 */
public class ServiceContextTest extends BaseTest {

	public static final long PARENT_FOLDER_ID = 0;

	public ServiceContextTest() throws IOException {
		super();
	}

	@Test
	public void addBookmarkEntry() throws Exception {
		Random random = new Random();
		String uuid = String.valueOf(Math.abs(random.nextInt()));

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("uuid", uuid);
		jsonObject.put("addGroupPermissions", true);
		jsonObject.put("addGuestPermissions", true);
		JSONObjectWrapper serviceContext = new JSONObjectWrapper(jsonObject);

		JSONObject entry = addBookmarkEntry("test", serviceContext);

		assertEquals(uuid, entry.getString("uuid"));

		deleteBookmarkEntry(entry);
	}

	public JSONObject addBookmarkEntry(
			String name, JSONObjectWrapper serviceContext)
		throws Exception {

		BookmarksEntryService service = new BookmarksEntryService(session);
		long groupId = props.getGroupId();

		return service.addEntry(
			groupId, PARENT_FOLDER_ID, name, "http://www.liferay.com", "",
			serviceContext);
	}

	public void deleteBookmarkEntry(JSONObject entry) throws Exception {
		BookmarksEntryService service = new BookmarksEntryService(session);
		service.deleteEntry(entry.getLong("entryId"));
	}

}