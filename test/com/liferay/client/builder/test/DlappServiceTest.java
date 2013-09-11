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

package com.liferay.client.builder.test;

import com.liferay.client.exception.ServerException;
import com.liferay.client.v62.dlapp.DlappService;

import java.io.IOException;

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
	}

	@Test
	public void getFoldersCount() throws Exception {
		DlappService service = new DlappService(context);

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

	private long _getRepositoryId() {
		return Long.valueOf(props.getProperty("repositoryId"));
	}

	private static final String _FOLDER_NAME = "test";

	private static final int _PARENT_FOLDER_ID = 0;

}