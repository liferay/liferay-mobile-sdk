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

package com.liferay.mobile.sdk.service;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.Path;

/**
 * @author Bruno Farache
 */
@Path("/user")
public interface UserServiceFullyAnnotated {

	@Path("/get-company-users-count")
	Call<Integer> getCompanyUsersCount(@Param("companyId") long companyId);

	@Path("/get-user-id-by-email-address")
	Call<Long> getUserIdByEmailAddress(
		@Param("companyId") long companyId,
		@Param("emailAddress") String emailAddress);

	@Path("/has-group-user")
	Call<Boolean> hasGroupUser(
		@Param("groupId") long groupId, @Param("userId") long userId);

}