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

package com.liferay.mobile.android.http;

import android.util.Log;

import com.liferay.mobile.android.exception.ServerException;
import com.liferay.mobile.android.service.Session;

import java.io.IOException;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class HttpUtil {

	public static final String IF_MODIFIED_SINCE = "If-Modified-Since";

	public static final String LAST_MODIFIED = "Last-Modified";

	public static HttpClient getClient(Session session) {
		DefaultHttpClient client = new DefaultHttpClient();

		HttpConnectionParams.setConnectionTimeout(
			client.getParams(), session.getConnectionTimeout());

		return client;
	}

	public static int getPortalVersion(Session session) {
		return getPortalVersion(session.getServer());
	}

	public static int getPortalVersion(String url) {
		Integer version = null;

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

				version = Integer.valueOf(buildNumber);
			}
		}
		catch (Exception e) {
			Log.e(_CLASS_NAME, "Couldn't get portal version", e);

			version = PortalVersion.UNKNOWN;
		}
		finally {
			_versions.put(url, version);
		}

		return version;
	}

	public static HttpPost getPost(Session session) {
		HttpPost post = new HttpPost(getURL(session));

		UsernamePasswordCredentials credentials =
			new UsernamePasswordCredentials(
				session.getUsername(), session.getPassword());

		Header authorization = BasicScheme.authenticate(
			credentials, "UTF-8", false);

		post.addHeader(authorization);

		return post;
	}

	public static String getResponseString(HttpResponse response)
		throws IOException {

		HttpEntity entity = response.getEntity();

		if (entity == null) {
			return null;
		}

		return EntityUtils.toString(entity);
	}

	public static String getURL(Session session) {
		StringBuilder sb = new StringBuilder();

		String server = session.getServer();

		sb.append(server);

		if (!server.endsWith("/")) {
			sb.append("/");
		}

		sb.append("api/jsonws/invoke");

		return sb.toString();
	}

	public static JSONArray post(Session session, JSONArray commands)
		throws Exception {

		HttpClient client = getClient(session);
		HttpPost post = getPost(session);

		post.setEntity(new StringEntity(commands.toString()));

		HttpResponse response = client.execute(post);

		String json = HttpUtil.getResponseString(response);

		return handleResponse(response, json);
	}

	public static JSONArray post(Session session, JSONObject command)
		throws Exception {

		JSONArray commands = new JSONArray();

		commands.put(command);

		return post(session, commands);
	}

	protected static JSONArray handleResponse(
			HttpResponse response, String json)
		throws ServerException {

		int status = response.getStatusLine().getStatusCode();

		if (status == HttpStatus.SC_UNAUTHORIZED) {
			throw new ServerException("Authentication failed.");
		}

		if (status != HttpStatus.SC_OK) {
			throw new ServerException(
				"Request failed. Response code: " + status);
		}

		try {
			if (json != null) {
				if (json.startsWith("{")) {
					JSONObject jsonObj = new JSONObject(json);

					if (jsonObj.has("exception")) {
						String message = jsonObj.getString("exception");

						throw new ServerException(message);
					}
					else {
						throw new ServerException(
							"Unexpected return type: " + json.toString());
					}
				}
				else if (json.startsWith("[")) {
					return new JSONArray(json);
				}
			}
		}
		catch (JSONException je) {
			throw new ServerException(je);
		}

		return null;
	}

	private static final String _CLASS_NAME = HttpUtil.class.getSimpleName();

	private static final Map<String, Integer> _versions =
		new HashMap<String, Integer>();

}