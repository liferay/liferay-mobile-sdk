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

import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Params;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.service.Site;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Bruno Farache
 */
public class DefaultParamsTest extends BaseTest {

	public DefaultParamsTest() throws IOException {
		super();
	}

	@Test
	public void getGroup() throws Exception {
		GroupService service = ServiceBuilder.build(GroupService.class);
		Site site = service.getGroup().execute();
		assertEquals(props.getGroupId(), site.groupId);
	}

	@Test
	public void getGroupWithCompanyId() throws Exception {
		GroupService service = ServiceBuilder.build(GroupService.class);
		Site site = service.getGroupWithName("Guest").execute();
		assertEquals(props.getGroupId(), site.groupId);
	}

	@Test
	public void getGroupWithCompanyIdAndName() throws Exception {
		GroupService service = ServiceBuilder.build(GroupService.class);
		Site site = service.getGroupWithCompanyIdAndName().execute();
		assertEquals(props.getGroupId(), site.groupId);
	}

	@Path("/group")
	public interface GroupService {

		@Path("/get-group")
		@Param(name = "groupId", value = "10184")
		Call<Site> getGroup();

		@Path("/get-group")
		@Params( {
			@Param(name = "companyId", value = "10157"),
			@Param(name = "name", value = "Guest")
		})
		Call<Site> getGroupWithCompanyIdAndName();

		@Path("/get-group")
		@Params( {
			@Param(name = "companyId", value = "10157")
		})
		Call<Site> getGroupWithName(@Param(name = "name") String name);

	}

}