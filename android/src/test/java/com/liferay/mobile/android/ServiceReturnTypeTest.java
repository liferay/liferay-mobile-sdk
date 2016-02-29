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

import com.liferay.mobile.android.v7.portal.PortalService;
import com.liferay.mobile.android.v7.user.UserService;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Bruno Farache
 */
public class ServiceReturnTypeTest extends BaseTest {

	public ServiceReturnTypeTest() throws IOException {
		super();
	}

	@Test
	public void getAutoDeployDirectory() throws Exception {
		PortalService service = new PortalService(session);

		String directory = service.getAutoDeployDirectory();
		assertNotNull(directory);
	}

	@Test
	public void getCompanyUsersCount() throws Exception {
		UserService service = new UserService(session);

		int count = service.getCompanyUsersCount(props.getCompanyId());
		assertTrue(count > 0);
	}

	@Test
	public void getUserIdByEmailAddress() throws Exception {
		UserService service = new UserService(session);

		long userId = service.getUserIdByEmailAddress(
			props.getCompanyId(), props.getLogin());

		assertTrue(userId > 0);

		boolean hasGroupUser = service.hasGroupUser(props.getGroupId(), userId);
		assertTrue(hasGroupUser);
	}

}