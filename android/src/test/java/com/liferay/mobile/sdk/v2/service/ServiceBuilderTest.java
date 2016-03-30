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

package com.liferay.mobile.sdk.v2.service;

import com.liferay.mobile.sdk.BaseTest;
import com.liferay.mobile.sdk.v2.*;

import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Bruno Farache
 */
public class ServiceBuilderTest extends BaseTest {

	public ServiceBuilderTest() throws IOException {
		super();
	}

	@Test
	public void fullyAnnotated() throws Exception {
		com.liferay.mobile.sdk.v2.UserService service =
			ServiceBuilder.build(
				com.liferay.mobile.sdk.v2.UserService.class);

		Call<Integer> call = service.getCompanyUsersCount(props.getCompanyId());
		assertGetCompanyUsersCount(call);
	}

	@Test
	public void missingPathAnnotation() throws Exception {
		UserService service = ServiceBuilder.build(UserService.class);
		Call<Integer> call = service.getCompanyUsersCount(props.getCompanyId());
		assertGetCompanyUsersCount(call);
	}

	protected void assertGetCompanyUsersCount(Call<Integer> call)
		throws JSONException {

		JSONObject jsonObject = (JSONObject)call.body();
		JSONObject params = jsonObject.getJSONObject(
			"/user/get-company-users-count");

		assertNotNull(params);

		long companyId = params.getLong("companyId");
		assertEquals(props.getCompanyId(), companyId);
	}

}