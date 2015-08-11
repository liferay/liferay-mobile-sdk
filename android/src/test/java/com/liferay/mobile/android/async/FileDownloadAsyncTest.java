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
import com.liferay.mobile.android.auth.basic.BasicAuthentication;
import com.liferay.mobile.android.auth.basic.DigestAuthentication;
import com.liferay.mobile.android.callback.Callback;
import com.liferay.mobile.android.callback.file.FileProgressCallback;
import com.liferay.mobile.android.http.HttpUtil;
import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.http.Status;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Bruno Farache
 */
public class FileDownloadAsyncTest extends BaseTest {

	public FileDownloadAsyncTest() throws IOException {
		super();
	}

	@Test
	public void download() throws Exception {
		BasicAuthentication basic =
			(BasicAuthentication)session.getAuthentication();

		DigestAuthentication digest = new DigestAuthentication(
			basic.getUsername(), basic.getPassword());

		session.setAuthentication(digest);

		String url = session.getServer() + "/webdav/guest/document_library/" +
			_file.getString(DLAppServiceTest.TITLE);

		final ByteArrayOutputStream baos = new ByteArrayOutputStream();
		final CountDownLatch lock = new CountDownLatch(1);

		FileProgressCallback fileProgressCallback = new FileProgressCallback() {

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

		session.setCallback(new Callback() {

			@Override
			public void inBackground(Response response) {
				assertEquals(Status.OK, response.getStatusCode());
				lock.countDown();
			}

			@Override
			public void doFailure(Exception exception) {
				fail(exception.getMessage());
				lock.countDown();
			}

		});

		HttpUtil.download(session, url, fileProgressCallback);
		lock.await(500, TimeUnit.MILLISECONDS);
		assertEquals(5, baos.size());
	}

	@Before
	public void setUp() throws Exception {
		DLAppServiceTest test = new DLAppServiceTest();
		_file = test.addFileEntry();
	}

	@After
	public void tearDown() throws Exception {
		DLAppServiceTest test = new DLAppServiceTest();
		test.deleteFileEntry(_file.getLong(DLAppServiceTest.FILE_ENTRY_ID));
	}

	private JSONObject _file;

}