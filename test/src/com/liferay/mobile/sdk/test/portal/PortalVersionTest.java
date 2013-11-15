/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

import com.liferay.mobile.android.http.HttpUtil;
import com.liferay.mobile.android.http.PortalVersion;
import com.liferay.mobile.sdk.test.BaseTest;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Bruno Farache
 */
public class PortalVersionTest extends BaseTest {

	public PortalVersionTest() throws IOException {
		super();
	}

	@Test
	public void getPortalVersion() throws Exception {
		int version = HttpUtil.getPortalVersion(session);

		assertEquals(PortalVersion.V_6_2, version);
	}

}