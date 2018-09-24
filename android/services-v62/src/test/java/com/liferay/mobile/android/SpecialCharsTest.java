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

import java.io.IOException;

import org.json.JSONObject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Bruno Farache
 */
public class SpecialCharsTest extends BaseTest {

	public SpecialCharsTest() throws IOException {
		super();
	}

	@Test
	public void addBookmarkEntry() throws Exception {
		String name = "entry áéíòúñ";
		JSONObject entry = _serviceContextTest.addBookmarkEntry(name, null);

		assertEquals(name, entry.getString("name"));

		_serviceContextTest.deleteBookmarkEntry(entry);
	}

	@Before
	public void setUp() throws Exception {
		_serviceContextTest = new ServiceContextTest();
	}

	private ServiceContextTest _serviceContextTest;

}