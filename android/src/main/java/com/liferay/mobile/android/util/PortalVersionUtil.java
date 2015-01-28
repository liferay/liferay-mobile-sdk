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

import com.liferay.mobile.android.http.HttpUtil;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.v62.portal.PortalService;

import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * @author Bruno Farache
 */
public class PortalVersionUtil {

	public static int getPortalVersion(Session session) throws Exception {
		int version = getBuilderNumberHeader(session.getServer());

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

		PortalService service = new PortalService(session);

		int version = PortalVersion.UNKNOWN;

		try {
			version = service.getBuildNumber();
		}
		finally {
			HttpUtil.setJSONWSPath(HttpUtil.JSONWS_PATH_62);
		}

		return version;
	}

	protected static int getBuilderNumberHeader(String url) throws IOException {
		HttpClient client = new DefaultHttpClient();
		HttpHead head = new HttpHead(url);
		HttpResponse response = client.execute(head);

		Header portalHeader = response.getFirstHeader("Liferay-Portal");

		if (portalHeader == null) {
			return PortalVersion.UNKNOWN;
		}

		String portalField = portalHeader.getValue();

		int indexOfBuild = portalField.indexOf("Build");

		if (indexOfBuild == -1) {
			return PortalVersion.UNKNOWN;
		}
		else {
			String buildNumber = portalField.substring(
				indexOfBuild + 6, indexOfBuild + 10);

			return Integer.valueOf(buildNumber);
		}
	}

}