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

package com.liferay.mobile.android.util.download;

import com.liferay.mobile.android.BaseTest;
import com.liferay.mobile.android.DLAppServiceTest;
import com.liferay.mobile.android.auth.basic.BasicAuthentication;
import com.liferay.mobile.android.auth.basic.DigestAuthentication;
import com.liferay.mobile.android.http.HttpUtil;
import com.liferay.mobile.android.util.PortalVersion;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import java.net.URI;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import org.json.JSONObject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Bruno Farache
 */
public class DownloadFileTest extends BaseTest {

	public DownloadFileTest() throws IOException {
		super();
	}

	@Test
	public void download() throws Exception {
		BasicAuthentication basic =
			(BasicAuthentication)session.getAuthentication();

		DigestAuthentication digest = new DigestAuthentication(
			basic.getUsername(), basic.getPassword());

		session.setAuthentication(digest);

		String URL = session.getServer() + "/webdav/guest/document_library/" +
			_file.getString(DLAppServiceTest.TITLE);

		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		HttpGet request = new HttpGet(URL);
		HttpClientBuilder clientBuilder = HttpUtil.getClientBuilder(session);

		DownloadUtil.download(clientBuilder.build(), request, baos, null);
		assertEquals(5, baos.size());
	}

	@Test
	public void getDownloadURL() throws Exception {
		DownloadUtil.encoder = new DownloadUtil.URLEncoder() {

			@Override
			public String encode(String path) throws Exception {
				URI URI = new URI("http", "localhost", path, null);

				path = URI.toASCIIString();
				path = path.replaceAll("http://localhost", "");

				return path;
			}

		};

		String URL = DownloadUtil.getDownloadURL(
			session, PortalVersion.V_6_2, "/guest", "/folder with spaces",
			"file áéíòúñ.txt");

		assertEquals(
			"http://localhost:8080/webdav/guest/document_library" +
				"/folder%20with%20spaces" +
				"/file%20%C3%A1%C3%A9%C3%AD%C3%B2%C3%BA%C3%B1.txt", URL);
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