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

package com.liferay.mobile.sdk;

import com.liferay.mobile.sdk.util.PortraitUtil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Bruno Farache
 */
public class PortraitTest extends BaseTest {

	public PortraitTest() throws IOException {
		super();
	}

	@Test
	public void downloadPortrait() throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		String portraitURL = getPortraitURL();
		PortraitUtil.downloadPortrait(
			Config.global(), portraitURL, baos, null, null);

		assertEquals(7933, baos.size());
	}

	protected String getPortraitURL() throws Exception {
		long portraitId = 34921;

		String expectedURL = "http://localhost:8080/image/user_male_portrait?" +
			"img_id=" + portraitId;

		String uuid = null;

		String portraitURL = PortraitUtil.getPortraitURL(
			Config.global(), true, portraitId, uuid);

		assertEquals(expectedURL, portraitURL);

		expectedURL = expectedURL +
			"&img_id_token=fz33PSWiwof%2Bf%2BpfAzTd%2FyQG4QA%3D";

		uuid = "1a9fb888-bd6d-75d2-6448-49748b0cc7f0";

		portraitURL = PortraitUtil.getPortraitURL(
			Config.global(), true, portraitId, uuid);

		assertEquals(expectedURL, portraitURL);

		return portraitURL;
	}

}