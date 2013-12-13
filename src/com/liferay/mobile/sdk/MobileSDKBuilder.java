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

package com.liferay.mobile.sdk;

import com.liferay.mobile.sdk.android.AndroidBuilder;
import com.liferay.mobile.sdk.http.Discovery;
import com.liferay.mobile.sdk.http.DiscoveryResponseHandler;
import com.liferay.mobile.sdk.http.HttpUtil;
import com.liferay.mobile.sdk.ios.iOSBuilder;
import com.liferay.mobile.sdk.util.Validator;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * @author Bruno Farache
 */
public class MobileSDKBuilder {

	public static final String ANDROID = "android";

	public static final String IOS = "ios";

	public static final String UNKOWN_PORTAL_VERSION = "0";

	public static void build(
			String platform, String url, String context, String packageName,
			String destination)
		throws Exception {

		build(platform, url, context, packageName, null);
	}

	public static void build(
			String platform, String url, String context, String packageName,
			String filter, String destination)
		throws Exception {

		StringBuilder sb = new StringBuilder();

		sb.append(url);

		if (Validator.isNotNull(context)) {
			sb.append("/");
			sb.append(context);
		}

		sb.append("/api/jsonws?discover");

		if (Validator.isNull(filter)) {
			sb.append("=/*");
		}
		else {
			sb.append("=/");
			sb.append(filter);
			sb.append("/*");
		}

		HttpClient client = new DefaultHttpClient();
		HttpGet get = new HttpGet(sb.toString());
		DiscoveryResponseHandler handler = new DiscoveryResponseHandler();
		Discovery discovery = client.execute(get, handler);

		Builder builder = null;

		if (platform.equals(ANDROID)) {
			builder = new AndroidBuilder();
		}
		else if (platform.equals(IOS)) {
			builder = new iOSBuilder();
		}

		int version = HttpUtil.getPortalVersion(url);

		if (Validator.isNull(filter)) {
			builder.buildAll(discovery, packageName, version, destination);
		}
		else {
			builder.build(discovery, packageName, version, filter, destination);
		}
	}

	public static void main(String[] args) {
		Map<String, String> arguments = parseArguments(args);

		String platform = arguments.get("platform");
		String url = arguments.get("url");
		String context = arguments.get("context");
		String packageName = arguments.get("package");
		String filter = arguments.get("filter");
		String destination = arguments.get("destination");

		try {
			build(platform, url, context, packageName, filter, destination);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected static Map<String, String> parseArguments(String[] args) {
		Map<String, String> arguments = new HashMap<String, String>();

		for (String arg : args) {
			int pos = arg.indexOf('=');

			if (pos <= 0) {
				throw new IllegalArgumentException("Bad argument " + arg);
			}

			String key = arg.substring(0, pos).trim();
			String value = arg.substring(pos + 1).trim();

			arguments.put(key, value);
		}

		return arguments;
	}

}