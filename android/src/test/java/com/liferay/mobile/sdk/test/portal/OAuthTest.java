/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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

import com.liferay.mobile.android.auth.Authentication;
import com.liferay.mobile.android.auth.OAuth;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.service.SessionImpl;
import com.liferay.mobile.android.v62.group.GroupService;
import com.liferay.mobile.sdk.test.BaseTest;
import com.liferay.mobile.sdk.test.util.PropertiesUtil;

import java.io.IOException;

import org.json.JSONArray;

import org.junit.Test;

/**
 * @author Bruno Farache
 */
public class OAuthTest extends BaseTest {

	public OAuthTest() throws IOException {
		super();
	}

	@Test
	public void getUserSites() throws Exception {
		String consumerKey = props.getProperty(
			PropertiesUtil.OAUTH_CONSUMER_KEY);

		String consumerSecret = props.getProperty(
			PropertiesUtil.OAUTH_CONSUMER_SECRET);

		String accessToken = props.getProperty(
			PropertiesUtil.OAUTH_ACCESS_TOKEN);

		String tokenSecret = props.getProperty(
			PropertiesUtil.OAUTH_TOKEN_SECRET);

		Authentication auth = new OAuth(
			consumerKey, consumerSecret, accessToken, tokenSecret);

		Session session = new SessionImpl(this.session.getServer(), auth);
		GroupService service = new GroupService(session);

		JSONArray sites = service.getUserSites();
		GroupServiceTest.assertUserSites(sites);
	}

}