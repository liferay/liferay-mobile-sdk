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
public class DlappServiceTest extends BaseTest {

	public DlappServiceTest() throws IOException {
		super();
	}

	@Test
	public void addFolder() throws Exception {
		DlappService service = new DlappService(context);

		long repositoryId = Long.valueOf(props.getProperty("repositoryId"));
		long parentFolderId = 0;
		String name = "test";
		String description = "";
		JSONObject serviceContext = null;

		JSONObject jsonObj = service.addFolder(
			repositoryId, parentFolderId, name, description, serviceContext);

		assertEquals(name, jsonObj.get("name"));
	}

	@Test
	public void deleteFolder() throws Exception {
		DlappService service = new DlappService(context);

		long repositoryId = Long.valueOf(props.getProperty("repositoryId"));
		long parentFolderId = 0;
		String name = "test";

		service.deleteFolder(repositoryId, parentFolderId, name);

		try {
			service.getFolder(repositoryId, parentFolderId, name);

			fail();
		}
		catch (ServerException se) {
			String message = se.getMessage();

			assertTrue(message.startsWith("No DLFolder exists with the key"));
		}
	}

}