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
import com.liferay.mobile.android.auth.basic.BasicAuthentication;
import com.liferay.mobile.android.auth.basic.DigestAuthentication;
import com.liferay.mobile.android.callback.file.FileProgressCallback;
import com.liferay.mobile.android.http.HttpUtil;
import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.http.Status;
import com.liferay.mobile.android.util.PortalVersion;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.json.JSONObject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Bruno Farache
 */
public class FileDownloadTest extends BaseTest {

	public FileDownloadTest() throws IOException {
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

		Response response = HttpUtil.download(session, url, callback);
		assertNotNull(response);
		assertEquals(Status.OK, response.getStatusCode());
		assertEquals(5, baos.size());
	}

	@Test
	public void getDownloadURL() throws Exception {
		String expectedURL = "http://localhost:8080/webdav/guest" +
			"/document_library" +
			"/folder%20with%20spaces" +
			"/file%20%C3%A1%C3%A9%C3%AD%C3%B2%C3%BA%C3%B1.txt";

		String downloadURL = DownloadUtil.getWebDAVFileURL(
			session, PortalVersion.V_6_2, "/guest", "/folder with spaces",
			"file áéíòúñ.txt");

		assertEquals(expectedURL, downloadURL);

		downloadURL = DownloadUtil.getWebDAVFileURL(
			session, PortalVersion.V_6_2, "guest", "folder with spaces",
			"/file áéíòúñ.txt");

		assertEquals(expectedURL, downloadURL);

		expectedURL = "http://localhost:8080/webdav/guest" +
			"/document_library" +
			"/file%20%C3%A1%C3%A9%C3%AD%C3%B2%C3%BA%C3%B1.txt";

		downloadURL = DownloadUtil.getWebDAVFileURL(
			session, PortalVersion.V_6_2, "guest", "", "file áéíòúñ.txt");

		assertEquals(expectedURL, downloadURL);
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