/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.mobile.sdk.test;

import com.liferay.mobile.android.exception.ServerException;
import com.liferay.mobile.android.v62.dlapp.DlappService;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Bruno Farache
 */
public class DLAppServiceTest extends BaseTest {

	public DLAppServiceTest() throws IOException {
		super();
	}

	@Test
	public void addFolder() throws Exception {
		DlappService service = new DlappService(context);

		JSONObject jsonObj = service.addFolder(
			_getRepositoryId(), _PARENT_FOLDER_ID, _FOLDER_NAME, "", null);

		assertEquals(_FOLDER_NAME, jsonObj.get("name"));

		int count = service.getFoldersCount(
			_getRepositoryId(), _PARENT_FOLDER_ID, 0, false);

		assertEquals(1, count);
	}

	@Test
	public void deleteFolder() throws Exception {
		DlappService service = new DlappService(context);

		service.deleteFolder(
			_getRepositoryId(), _PARENT_FOLDER_ID, _FOLDER_NAME);

		try {
			service.getFolder(
				_getRepositoryId(), _PARENT_FOLDER_ID, _FOLDER_NAME);

			fail();
		}
		catch (ServerException se) {
			String message = se.getMessage();

			assertTrue(message.startsWith("No DLFolder exists with the key"));
		}
	}

	@Test
	public void addFoldersBatch() throws Exception {
		DlappService service = new DlappService(context, true);

		service.addFolder(
			_getRepositoryId(), _PARENT_FOLDER_ID, _FOLDER_NAME, "", null);

		service.addFolder(
			_getRepositoryId(), _PARENT_FOLDER_ID, _FOLDER_NAME_2, "", null);

		JSONArray jsonArray = service.invoke();

		assertEquals(_FOLDER_NAME, jsonArray.getJSONObject(0).get("name"));
		assertEquals(_FOLDER_NAME_2, jsonArray.getJSONObject(1).get("name"));
	}

	@Test
	public void deleteFoldersBatch() throws Exception {
		DlappService service = new DlappService(context, true);

		service.deleteFolder(
			_getRepositoryId(), _PARENT_FOLDER_ID, _FOLDER_NAME);

		service.deleteFolder(
			_getRepositoryId(), _PARENT_FOLDER_ID, _FOLDER_NAME_2);

		JSONArray jsonArray = service.invoke();

		assertEquals(2, jsonArray.length());
	}

	private long _getRepositoryId() {
		return Long.valueOf(props.getProperty("repositoryId"));
	}

	private static final String _FOLDER_NAME = "test";

	private static final String _FOLDER_NAME_2 = "test2";

	private static final int _PARENT_FOLDER_ID = 0;

}