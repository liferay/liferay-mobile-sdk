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

package com.liferay.mobile.sdk.test.portal;

import com.liferay.mobile.android.util.download.DownloadUtil;
import com.liferay.mobile.sdk.test.BaseTest;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

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
		String URL =
			"http://localhost:8080/webdav/guest/document_library" +
				"/folder%20with%20spaces" +
				"/file%20%C3%A1%C3%A9%C3%AD%C3%B2%C3%BA%C3%B1.txt";

		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		DownloadUtil.download(session, URL, baos, null);
		assertEquals(1160096, baos.size());
	}

	@Test
	public void getDownloadURL() throws Exception {
		String URL = DownloadUtil.getDownloadURL(
			session, "/guest", "/folder with spaces", "file áéíòúñ.txt");

		assertEquals(
			"http://localhost:8080/webdav/guest/document_library" +
				"/folder%20with%20spaces" +
				"/file%20%C3%A1%C3%A9%C3%AD%C3%B2%C3%BA%C3%B1.txt", URL);
	}

}