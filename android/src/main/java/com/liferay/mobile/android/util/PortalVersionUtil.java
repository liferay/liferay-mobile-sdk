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

package com.liferay.mobile.android.util;

import com.liferay.mobile.android.http.Headers;
import com.liferay.mobile.android.http.HttpUtil;
import com.liferay.mobile.android.http.Method;
import com.liferay.mobile.android.http.Request;
import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.HttpClient;
import com.liferay.mobile.android.v2.OkHttpClientImpl;
import com.liferay.mobile.android.v2.ServiceBuilder;
import com.liferay.mobile.android.v62.portal.PortalService;

/**
 * @author Bruno Farache
 */
public class PortalVersionUtil {

	public static int getPortalVersion(Session session) throws Exception {
		int version = getBuilderNumberHeader(session);

		if (version == PortalVersion.UNKNOWN) {
			try {
				version = getBuilderNumber(session, HttpUtil.JSONWS_PATH_62);
			}
			catch (Exception e) {
				version = getBuilderNumber(session, HttpUtil.JSONWS_PATH_61);
			}
		}

		return version;
	}

	protected static int getBuilderNumber(Session session, String jsonWSPath)
		throws Exception {

		HttpUtil.setJSONWSPath(jsonWSPath);

		PortalService service = ServiceBuilder.build(PortalService.class);

		int version = PortalVersion.UNKNOWN;

		try {
			version = service.getBuildNumber().execute(session);
		}
		finally {
			HttpUtil.setJSONWSPath(HttpUtil.JSONWS_PATH_62);
		}

		return version;
	}

	protected static int getBuilderNumberHeader(Session session)
		throws Exception {

		Request request = Request.url(session.getServer())
			.method(Method.HEAD)
			.headers(session.getHeaders())
			.timeout(session.getConnectionTimeout());

		HttpClient client = Call.client();
		Response response = client.sync(request);
		String header = response.getHeaders().get(Headers.LIFERAY_PORTAL);

		if (header == null) {
			return PortalVersion.UNKNOWN;
		}

		int indexOfBuild = header.indexOf("Build");

		if (indexOfBuild == -1) {
			return PortalVersion.UNKNOWN;
		}
		else {
			String buildNumber = header.substring(
				indexOfBuild + 6, indexOfBuild + 10);

			return Integer.valueOf(buildNumber);
		}
	}

}