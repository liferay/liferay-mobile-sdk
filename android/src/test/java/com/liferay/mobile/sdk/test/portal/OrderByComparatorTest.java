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

import org.json.JSONArray;
import org.json.JSONObject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Bruno Farache
 */
public class OrderByComparatorTest extends BaseTest {

	public OrderByComparatorTest() throws IOException {
		super();
	}

	@Test
	public void getEntriesDescending() throws Exception {
		BookmarksEntryService service = new BookmarksEntryService(session);
		long groupId = props.getGroupId();

		String className =
			"com.liferay.portlet.bookmarks.util.comparator.EntryNameComparator";

		JSONObjectWrapper orderByComparatorDesc = new JSONObjectWrapper(
			className, new JSONObject());

		JSONArray entries = service.getEntries(
			groupId, ServiceContextTest.PARENT_FOLDER_ID, -1, -1,
			orderByComparatorDesc);

		assertEquals(2, entries.length());

		JSONObject first = entries.getJSONObject(0);
		JSONObject second = entries.getJSONObject(1);

		assertEquals("Z", first.getString("name"));
		assertEquals("A", second.getString("name"));
	}

	@Before
	public void setUp() throws Exception {
		_serviceContextTest = new ServiceContextTest();
		_entryA = _serviceContextTest.addEntry("A", null);
		_entryZ = _serviceContextTest.addEntry("Z", null);
	}

	@After
	public void tearDown() throws Exception {
		_serviceContextTest.deleteEntry(_entryA);
		_serviceContextTest.deleteEntry(_entryZ);
	}

	private JSONObject _entryA;
	private JSONObject _entryZ;
	private ServiceContextTest _serviceContextTest;

}