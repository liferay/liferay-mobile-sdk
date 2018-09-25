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

import com.liferay.mobile.android.v7.portlet.PortletService;

import java.io.IOException;

import org.json.JSONArray;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Gregory Amerson
 */
public class PortletServiceTest extends BaseTest {

	public PortletServiceTest() throws IOException {
		super();
	}

	@Test
	public void getWarPortlets() throws Exception {
		PortletService service = new PortletService(session);

		JSONArray array = service.getWarPortlets();

		assertNotNull(array);
		assertTrue(array.length() > 0);
	}

}