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

import com.liferay.mobile.android.util.PortraitUtil;

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

		PortraitUtil.downloadPortrait(session, portraitURL, baos);

		assertEquals(7742, baos.size());
	}

	protected String getPortraitURL() throws Exception {
		long portraitId = 10974;

		String expectedURL = "http://localhost:8080/image/user_male_portrait?" +
			"img_id=" + portraitId;

		String uuid = null;

		String portraitURL = PortraitUtil.getPortraitURL(
			session, true, portraitId, uuid);

		assertEquals(expectedURL, portraitURL);

		expectedURL = expectedURL +
			"&img_id_token=U6W2%2BvmVgE%2FyBnzvklnWO%2BqHPck%3D";

		uuid = "c0c65ba5-c2ba-4bf5-9e42-7330adb1b5b8";

		portraitURL = PortraitUtil.getPortraitURL(
			session, true, portraitId, uuid);

		assertEquals(expectedURL, portraitURL);

		return portraitURL;
	}

}