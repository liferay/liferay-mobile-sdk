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

import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.ServiceBuilder;
import com.liferay.mobile.android.v62.bookmarksentry.BookmarksEntryService;

import java.io.IOException;

import java.util.Random;

import org.json.JSONException;
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

		JSONObject entry = addBookmarkEntry("test", jsonObject);

		assertEquals(uuid, entry.getString("uuid"));

		deleteBookmarkEntry(entry);
	}

	public JSONObject addBookmarkEntry(String name, JSONObject serviceContext)
		throws Exception {

		BookmarksEntryService service = ServiceBuilder.build(
			BookmarksEntryService.class);

		long groupId = props.getGroupId();

		Call<JSONObject> call = service.addEntry(
			groupId, PARENT_FOLDER_ID, name, "http://www.liferay.com", "",
			serviceContext);

		return call.execute(session);
	}

	public void deleteBookmarkEntry(JSONObject entry) throws Exception {
		BookmarksEntryService service = ServiceBuilder.build(
			BookmarksEntryService.class);

		service.deleteEntry(entry.getLong("entryId")).execute(session);
	}

	@Test
	public void jsonObjectSerialization() throws JSONException {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("addGroupPermissions", true);
		jsonObject.put("addGuestPermissions", true);
		jsonObject.put("title", "bookmark title");

		BookmarksEntryService service = ServiceBuilder.build(
			BookmarksEntryService.class);

		Call<JSONObject> call = service.addEntry(0, 0, "", "", "", jsonObject);

		JSONObject body = (JSONObject)call.body();

		assertEquals(
			"{\"/bookmarksentry/add-entry\":{" +
				"\"+serviceContext\":" +
					"\"com.liferay.portal.service.ServiceContext\"," +
				"\"groupId\":0," +
				"\"serviceContext.addGroupPermissions\":true," +
				"\"serviceContext.title\":\"bookmark title\"," +
				"\"description\":\"\"," +
				"\"name\":\"\"," +
				"\"serviceContext.addGuestPermissions\":true," +
				"\"url\":\"\"," +
				"\"folderId\":0}}",
			body.toString());
	}

}