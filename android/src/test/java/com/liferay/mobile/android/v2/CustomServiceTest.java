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

package com.liferay.mobile.android.v2;

import com.liferay.mobile.android.BaseTest;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

/**
 * @author Bruno Farache
 */
public class CustomServiceTest extends BaseTest {

	public CustomServiceTest() throws IOException {
		super();
	}

	@Test
	public void getCompanyUsersCount() throws Exception {
		CustomService service = ServiceBuilder.create(CustomService.class);
		Call<Integer> call = service.getCompanyUsersCount(props.getCompanyId());
		int count = call.execute(session);
		assertTrue(count > 0);
	}

}