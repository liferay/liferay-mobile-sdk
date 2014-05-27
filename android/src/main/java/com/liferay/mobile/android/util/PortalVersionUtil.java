/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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

import android.util.Log;

import com.liferay.mobile.android.service.Session;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * @author Bruno Farache
 */
public class PortalVersionUtil {

	public static int getPortalVersion(Session session) {
		return getPortalVersion(session.getServer());
	}

	public static int getPortalVersion(String url) {
		Integer version;

		try {
			version = _versions.get(url);

			if (version != null) {
				return version;
			}

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

				version = Integer.valueOf(buildNumber);
				_versions.put(url, version);
			}
		}
		catch (Exception e) {
			Log.e(_CLASS_NAME, "Couldn't get portal version", e);

			return PortalVersion.UNKNOWN;
		}

		return version;
	}

	private static final String _CLASS_NAME = PortalVersionUtil.class.getName();

	private static final Map<String, Integer> _versions =
		new HashMap<String, Integer>();

}