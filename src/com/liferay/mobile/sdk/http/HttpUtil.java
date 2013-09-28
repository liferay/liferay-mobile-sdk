/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.mobile.sdk.http;

import java.io.IOException;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

/**
 * @author Bruno Farache
 */
public class HttpUtil {

	public static PortalVersion getPortalVersion(String url) {
		PortalVersion version = null;

		try {
			version = _versions.get(url);

			if (version != null) {
				return version;
			}

			HttpClient client = new DefaultHttpClient();

			HttpGet get = new HttpGet(url);

			HttpResponse response = client.execute(get);

			Header portalHeader = response.getFirstHeader("Liferay-Portal");

			if (portalHeader == null) {
				version = PortalVersion.UNKNOWN;

				return version;
			}

			String portalField = portalHeader.getValue();

			int indexOfBuild = portalField.indexOf("Build");

			if (indexOfBuild == -1) {
				version = PortalVersion.UNKNOWN;
			}
			else {
				String buildNumber = portalField.substring(
					indexOfBuild + 6, indexOfBuild + 10);

				buildNumber = buildNumber.replaceAll("0*$", "");

				version = PortalVersion.getValue(Integer.valueOf(buildNumber));
			}
		}
		catch (Exception e) {
			version = PortalVersion.UNKNOWN;
		}
		finally {
			_versions.put(url, version);
		}

		return version;
	}

	public static String getResponseString(HttpResponse response)
		throws IOException {

		HttpEntity entity = response.getEntity();

		if (entity == null) {
			return null;
		}

		return EntityUtils.toString(entity);
	}

	private static final Map<String, PortalVersion> _versions =
		new HashMap<String, PortalVersion>();

}