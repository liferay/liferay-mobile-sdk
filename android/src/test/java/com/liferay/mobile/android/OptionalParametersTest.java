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

import com.liferay.mobile.android.v7.dlapp.DLAppService;

import java.io.IOException;

import org.json.JSONObject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Bruno Farache
 */
public class OptionalParametersTest extends BaseTest {

	public OptionalParametersTest() throws IOException {
		super();
	}

	@Test
	public void nullFileEntryDescription() throws Exception {
		DLAppService service = new DLAppService(session);

		long fileEntryId = _file.getLong(DLAppServiceTest.FILE_ENTRY_ID);
		String description = null;
		byte[] bytes = null;

		JSONObject updatedFile = service.updateFileEntry(
			fileEntryId, "", "", "", description, "", false, bytes, null);

		assertEquals(
			fileEntryId, updatedFile.getLong(DLAppServiceTest.FILE_ENTRY_ID));

		assertEquals(5, updatedFile.getInt("size"));
	}

	@Before
	public void setUp() throws Exception {
		DLAppServiceTest service = new DLAppServiceTest();
		_file = service.addFileEntry();
	}

	@After
	public void tearDown() throws Exception {
		DLAppServiceTest service = new DLAppServiceTest();
		service.deleteFileEntry(_file.getLong(DLAppServiceTest.FILE_ENTRY_ID));
	}

	private JSONObject _file;

}