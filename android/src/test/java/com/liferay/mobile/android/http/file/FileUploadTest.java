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

package com.liferay.mobile.android.http.file;

import com.liferay.mobile.android.BaseTest;
import com.liferay.mobile.android.DLAppServiceTest;
import com.liferay.mobile.android.callback.file.FileProgressCallback;
import com.liferay.mobile.android.v62.dlapp.DLAppService;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.nio.charset.StandardCharsets;

import org.json.JSONObject;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Bruno Farache
 */
public class FileUploadTest extends BaseTest {

	public static final String FILE_NAME = "barto.jpg";

	public static final String MIME_TYPE = "image/jpg";

	public FileUploadTest() throws IOException {
		super();
	}

	@Test
	public void addFileEntry() throws Exception {
		DLAppService service = new DLAppService(session);

		long repositoryId = props.getGroupId();
		long folderId = DLAppServiceTest.PARENT_FOLDER_ID;
		String fileName = DLAppServiceTest.SOURCE_FILE_NAME;
		String mimeType = DLAppServiceTest.MIME_TYPE;

		InputStream is = new ByteArrayInputStream(
			"Hello".getBytes(StandardCharsets.UTF_8));

		final ByteArrayOutputStream baos = new ByteArrayOutputStream();

		FileProgressCallback callback = new FileProgressCallback() {

			@Override
			public void onBytes(byte[] bytes) {
				try {
					baos.write(bytes);
				}
				catch (IOException ioe) {
					fail(ioe.getMessage());
				}
			}

			@Override
			public void onProgress(int totalBytes) {
				if (totalBytes == 5) {
					try {
						baos.flush();
					}
					catch (IOException ioe) {
						fail(ioe.getMessage());
					}
				}
			}

		};

		UploadData data = new UploadData(is, mimeType, fileName, callback);

		_file = service.addFileEntry(
			repositoryId, folderId, fileName, mimeType, fileName, "", "", data,
			null);

		assertEquals(fileName, _file.get(DLAppServiceTest.TITLE));
		assertEquals(5, callback.getTotal());
		assertEquals(5, baos.size());
	}

	@Test
	public void cancel() throws Exception {
		DLAppService service = new DLAppService(session);

		long repositoryId = props.getGroupId();
		long folderId = DLAppServiceTest.PARENT_FOLDER_ID;

		InputStream is = getClass().getResourceAsStream("/" + FILE_NAME);

		final FileProgressCallback callback = new FileProgressCallback() {

			@Override
			public void onProgress(int totalBytes) {
				if (totalBytes > 2048) {
					setCancelled(true);
				}
			}

		};

		UploadData data = new UploadData(is, MIME_TYPE, FILE_NAME, callback);

		try {
			_file = service.addFileEntry(
				repositoryId, folderId, FILE_NAME, MIME_TYPE, FILE_NAME, "", "",
				data, null);

			fail("Should have thrown IOException");
		}
		catch (IOException ioe) {
			assertTrue(ioe.getMessage().contains("Canceled"));
		}

		assertEquals(2048 * 2, callback.getTotal());
	}

	@After
	public void tearDown() throws Exception {
		if (_file != null) {
			DLAppServiceTest test = new DLAppServiceTest();
			test.deleteFileEntry(_file.getLong(DLAppServiceTest.FILE_ENTRY_ID));
			_file = null;
		}
	}

	@Test
	public void uploadPhoto() throws Exception {
		DLAppService service = new DLAppService(session);

		long repositoryId = props.getGroupId();
		long folderId = DLAppServiceTest.PARENT_FOLDER_ID;

		InputStream is = getClass().getResourceAsStream("/" + FILE_NAME);

		FileProgressCallback callback = new FileProgressCallback() {

			@Override
			public void onProgress(int totalBytes) {
			}

		};

		UploadData data = new UploadData(is, MIME_TYPE, FILE_NAME, callback);

		_file = service.addFileEntry(
			repositoryId, folderId, FILE_NAME, MIME_TYPE, FILE_NAME, "", "",
			data, null);

		assertEquals(FILE_NAME, _file.get(DLAppServiceTest.TITLE));
		assertEquals(372434, callback.getTotal());
	}

	private JSONObject _file;

}