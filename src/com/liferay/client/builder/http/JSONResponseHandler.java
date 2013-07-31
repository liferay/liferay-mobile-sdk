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

package com.liferay.client.builder.http;

import flexjson.JSONDeserializer;

import java.io.IOException;

import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class JSONResponseHandler
		implements ResponseHandler<Map<String, Object>> {

	public Map<String, Object> handleResponse(HttpResponse response)
		throws ClientProtocolException, IOException {

		JSONDeserializer<Map<String, Object>> deserializer =
			new JSONDeserializer<Map<String, Object>>();

		String responseString = getResponseString(response);

		return deserializer.deserialize(responseString);
	}

	protected String getResponseString(HttpResponse response)
		throws IOException {

		HttpEntity entity = response.getEntity();

		if (entity == null) {
			return null;
		}

		return EntityUtils.toString(entity);
	}

	protected void handleServerException(HttpResponse response, String json)
		throws Exception {

		StatusLine status = response.getStatusLine();

		if (status.getStatusCode() == HttpStatus.SC_UNAUTHORIZED) {
			throw new Exception("Authentication failed.");
		}

		if ((json != null) && json.startsWith("{")) {
			JSONObject jsonObj = new JSONObject(json);

			if (jsonObj.has("exception")) {
				String message = jsonObj.getString("exception");

				throw new Exception(message);
			}
		}
	}

}