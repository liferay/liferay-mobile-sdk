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

package com.liferay.mobile.sdk.service.rx;

import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.service.Site;

import java.util.List;

import rx.Observable;

/**
 * @author Bruno Farache
 */
@Path("/group")
public interface GroupService {

	@Path("/get-user-sites-groups")
	Observable<List<Site>> getUserSitesGroups();

	@Path("/nonexistent")
	Observable<List<Site>> nonexistent();

}