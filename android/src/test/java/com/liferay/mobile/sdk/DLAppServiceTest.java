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

import com.liferay.mobile.sdk.exception.ServerException;
import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.json.JSONParser;
import com.liferay.mobile.sdk.v62.dlapp.DLAppService;

import java.io.IOException;

import java.nio.charset.StandardCharsets;

import org.json.JSONArray;
import org.json.JSONObject;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Bruno Farache
 */
public class DLAppServiceTest extends BaseTest {

	public static final String FILE_ENTRY_ID = "fileEntryId";

	public static final String MIME_TYPE = "text/plain";

	public static final int PARENT_FOLDER_ID = 0;

	public static final String SOURCE_FILE_NAME = "test.properties";

	public static final String TITLE = "title";

	public DLAppServiceTest() throws IOException {
		super();
	}

	public JSONObject addFileEntry() throws Exception {
		DLAppService service = ServiceBuilder.build(DLAppService.class);
		long repositoryId = props.getGroupId();
		byte[] bytes = "Hello".getBytes(StandardCharsets.UTF_8);

		Call<JSONObject> call = service.addFileEntry(
			repositoryId, PARENT_FOLDER_ID, SOURCE_FILE_NAME, MIME_TYPE,
			SOURCE_FILE_NAME, "", "", bytes, null);

		return call.execute();
	}

	@Test
	public void addFileEntryBytes() throws Exception {
		JSONObject jsonObj = addFileEntry();
		assertEquals(SOURCE_FILE_NAME, jsonObj.get(TITLE));
		deleteFileEntry(jsonObj.getLong(FILE_ENTRY_ID));
	}

	@Test
	public void addFolder() throws Exception {
		DLAppService service = ServiceBuilder.build(DLAppService.class);
		long repositoryId = props.getGroupId();

		Call<JSONObject> call = service.addFolder(
			repositoryId, PARENT_FOLDER_ID, _FOLDER_NAME, "", null);

		JSONObject folder = call.execute();
		assertEquals(_FOLDER_NAME, folder.get(_NAME));

		Call<Integer> call2 = service.getFoldersCount(
			repositoryId, PARENT_FOLDER_ID, 0, false);

		int count = call2.execute();
		assertEquals(1, count);
		deleteFolder();
	}

	@Test
	public void addFoldersBatch() throws Exception {
		DLAppService service = ServiceBuilder.build(DLAppService.class);
		long repositoryId = props.getGroupId();

		Call<JSONObject> call1 = service.addFolder(
			repositoryId, PARENT_FOLDER_ID, _FOLDER_NAME, "", null);

		Call<JSONObject> call2 = service.addFolder(
			repositoryId, PARENT_FOLDER_ID, _FOLDER_NAME_2, "", null);

		Response response = Batch.execute(call1, call2);
		JSONArray sites = JSONParser.fromJSON(response, JSONArray.class);

		assertEquals(_FOLDER_NAME, sites.getJSONObject(0).get(_NAME));
		assertEquals(_FOLDER_NAME_2, sites.getJSONObject(1).get(_NAME));

		deleteFoldersBatch();
	}

	public void deleteFileEntry(long fileEntryId) throws Exception {
		DLAppService service = ServiceBuilder.build(DLAppService.class);
		service.deleteFileEntry(fileEntryId).execute();
	}

	protected void deleteFolder() throws Exception {
		DLAppService service = ServiceBuilder.build(DLAppService.class);
		long repositoryId = props.getGroupId();

		Call<Response> call = service.deleteFolder(
			repositoryId, PARENT_FOLDER_ID, _FOLDER_NAME);

		call.execute();

		try {
			Call<JSONObject> call2 = service.getFolder(
				repositoryId, PARENT_FOLDER_ID, _FOLDER_NAME);

			call2.execute();
			fail();
		}
		catch (ServerException se) {
			String message = se.getMessage();
			assertTrue(message.startsWith("No DLFolder exists with the key"));
		}
	}

	protected void deleteFoldersBatch() throws Exception {
		DLAppService service = ServiceBuilder.build(DLAppService.class);
		long repositoryId = props.getGroupId();

		Call<Response> call1 = service.deleteFolder(
			repositoryId, PARENT_FOLDER_ID, _FOLDER_NAME);

		Call<Response> call2 = service.deleteFolder(
			repositoryId, PARENT_FOLDER_ID, _FOLDER_NAME_2);

		Response response = Batch.execute(call1, call2);
		JSONArray sites = JSONParser.fromJSON(response, JSONArray.class);
		assertEquals(2, sites.length());
	}

	private static final String _FOLDER_NAME = "test";

	private static final String _FOLDER_NAME_2 = "test2";

	private static final String _NAME = "name";

}