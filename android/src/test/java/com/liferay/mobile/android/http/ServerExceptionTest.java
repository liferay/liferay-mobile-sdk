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

package com.liferay.mobile.android.http;

import com.liferay.mobile.android.BaseTest;
import com.liferay.mobile.android.exception.AuthenticationException;
import com.liferay.mobile.android.exception.ServerException;

import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Bruno Farache
 */
public class ServerExceptionTest extends BaseTest {

	public ServerExceptionTest() throws IOException {
		super();
	}

	@Test
	public void authenticationException() throws Exception {
		final JSONObject json = new JSONObject();

		String exception = "java.lang.SecurityException";

		json.put("exception", "java.lang.SecurityException");
		json.put("message", "Authenticated access required");

		try {
			Response response = new Response();
			response.checkPortalException(json.toString());
			fail("Should have thrown AuthenticationException");
		}
		catch (AuthenticationException ae) {
			assertEquals(exception, ae.getMessage());
		}
	}

	@Test
	public void syncWeb() throws JSONException {
		JSONObject json = new JSONObject();

		String exception = "com.liferay.portal.kernel.exception." +
			"PortalException";

		String message = "\"folderName\", " +
			"\"error\": {" +
				"\"message\":\"folderName\"," +
				"\"type\":\"com.liferay.portlet.documentlibrary." +
					"DuplicateFolderNameException\"" +
			"}, " +
			"\"throwable\":\"com.liferay.portlet.documentlibrary." +
				"DuplicateFolderNameException: a\"";

		json.put("exception", exception);
		json.put("message", message);

		try {
			Response response = new Response();
			response.checkPortalException(json.toString());
			fail("Should have detected portal exception.");
		}
		catch (ServerException se) {
			assertEquals(exception, se.getMessage());
			assertTrue(se.getDetail().contains("DuplicateFolderNameException"));
		}
	}

	@Test
	public void version6_1() throws JSONException {
		JSONObject json = new JSONObject();

		String exception = "com.liferay.portlet.documentlibrary." +
			"DuplicateFolderNameException: folderName";

		json.put("exception", exception);

		try {
			Response response = new Response();
			response.checkPortalException(json.toString());
			fail("Should have detected portal exception.");
		}
		catch (ServerException se) {
			assertEquals(exception, se.getMessage());
			assertNull(se.getDetail());
		}
	}

	@Test
	public void version6_2() throws JSONException {
		JSONObject json = new JSONObject();

		String exception = "com.liferay.portlet.documentlibrary." +
			"DuplicateFolderNameException";

		String folderName = "folderName";

		json.put("exception", exception);
		json.put("message", folderName);

		try {
			Response response = new Response();
			response.checkPortalException(json.toString());
			fail("Should have detected portal exception.");
		}
		catch (ServerException se) {
			assertEquals(exception, se.getMessage());
			assertEquals(folderName, se.getDetail());
		}
	}

	@Test
	public void version7_0() throws JSONException {
		JSONObject json = new JSONObject();

		String exception = "com.liferay.portlet.documentlibrary." +
			"DuplicateFolderNameException";

		String folderName = "folderName";

		json.put("exception", folderName);
		json.put(
			"throwable",
			"com.liferay.portlet.documentlibrary." +
				"DuplicateFolderNameException: a");

		JSONObject error = new JSONObject();

		error.put("message", folderName);
		error.put("type", exception);

		json.put("error", error);

		try {
			Response response = new Response();
			response.checkPortalException(json.toString());
			fail("Should have detected portal exception.");
		}
		catch (ServerException se) {
			assertEquals(exception, se.getMessage());
			assertEquals(folderName, se.getDetail());
		}
	}

}