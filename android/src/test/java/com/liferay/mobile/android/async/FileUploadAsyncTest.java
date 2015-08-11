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

package com.liferay.mobile.android.async;

import com.liferay.mobile.android.BaseTest;
import com.liferay.mobile.android.DLAppServiceTest;
import com.liferay.mobile.android.callback.file.FileProgressCallback;
import com.liferay.mobile.android.callback.typed.JSONObjectCallback;
import com.liferay.mobile.android.http.file.FileUploadTest;
import com.liferay.mobile.android.http.file.UploadData;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.service.SessionImpl;
import com.liferay.mobile.android.v62.dlapp.DLAppService;

import java.io.IOException;
import java.io.InputStream;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Bruno Farache
 */
public class FileUploadAsyncTest extends BaseTest {

	public FileUploadAsyncTest() throws IOException {
		super();
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
		Session session = new SessionImpl(this.session);
		DLAppService service = new DLAppService(session);

		long repositoryId = props.getGroupId();
		long folderId = DLAppServiceTest.PARENT_FOLDER_ID;

		InputStream is = getClass().getResourceAsStream(
			"/" + FileUploadTest.FILE_NAME);

		final int[] size = { 0 };

		FileProgressCallback callback = new FileProgressCallback() {

			@Override
			public void onProgress(int totalBytes) {
				size[0] = totalBytes;
			}

		};

		UploadData data = new UploadData(
			is, FileUploadTest.MIME_TYPE, FileUploadTest.FILE_NAME, callback);

		final CountDownLatch lock = new CountDownLatch(1);

		session.setCallback(new JSONObjectCallback() {

			@Override
			public void onSuccess(JSONObject file) {
				_file = file;
				lock.countDown();
			}

			@Override
			public void onFailure(Exception exception) {
				fail(exception.getMessage());
				lock.countDown();
			}

		});

		service.addFileEntry(
			repositoryId, folderId, FileUploadTest.FILE_NAME,
			FileUploadTest.MIME_TYPE, FileUploadTest.FILE_NAME, "", "", data,
			null);

		lock.await(500, TimeUnit.MILLISECONDS);

		assertEquals(
			FileUploadTest.FILE_NAME, _file.get(DLAppServiceTest.TITLE));

		assertEquals(372434, size[0]);
	}

	private JSONObject _file;

}