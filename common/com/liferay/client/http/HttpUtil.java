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

package com.liferay.client.http;

import com.liferay.client.service.ServiceContext;

import java.io.IOException;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class HttpUtil {

	public static final int CONNECTION_TIMEOUT = 15000;

	public static HttpClient getClient(ServiceContext context) {
		DefaultHttpClient client = new DefaultHttpClient();

		HttpConnectionParams.setConnectionTimeout(
			client.getParams(), context.getConnectionTimeout());

		return client;
	}

	public static HttpPost getPost(ServiceContext context) {
		HttpPost post = new HttpPost(getUrl(context));

		StringBuilder sb = new StringBuilder(context.getUsername());
		sb.append(":");
		sb.append(context.getPassword());

		String basic = Base64.encodeBase64String(sb.toString().getBytes());

		post.setHeader("Authorization", "Basic " + basic);

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

	public static String getUrl(ServiceContext context) {
		StringBuilder sb = new StringBuilder();

		sb.append(context.getServer());
		sb.append("/api/jsonws/invoke");

		return sb.toString();
	}

	public static String handleResponse(HttpResponse httpResponse)
		throws IOException {

		HttpEntity entity = httpResponse.getEntity();

		if (entity == null) {
			return null;
		}

		return EntityUtils.toString(entity);
	}

	public static JSONArray post(ServiceContext context, JSONObject command)
		throws Exception {

		HttpClient client = getClient(context);
		HttpPost post = getPost(context);

		post.setEntity(new StringEntity(command.toString()));

		return client.execute(post, new PostResponseHandler());
	}

}