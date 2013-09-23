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
		try {
			HttpClient client = new DefaultHttpClient();

			HttpGet get = new HttpGet(url);

			HttpResponse response = client.execute(get);

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

				buildNumber = buildNumber.replaceAll("0*$", "");

				return PortalVersion.getValue(Integer.valueOf(buildNumber));
			}
		}
		catch (Exception e) {
			return PortalVersion.UNKNOWN;
		}
	}

	public static String getResponseString(HttpResponse response)
		throws IOException {

		HttpEntity entity = response.getEntity();

		if (entity == null) {
			return null;
		}

		return EntityUtils.toString(entity);
	}

}