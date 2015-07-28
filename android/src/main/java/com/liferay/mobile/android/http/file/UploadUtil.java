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

package com.liferay.mobile.android.http.file;

import com.liferay.mobile.android.service.Session;

import java.util.Iterator;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.entity.mime.content.StringBody;

import org.json.JSONArray;
import org.json.JSONObject;

import static com.liferay.mobile.android.http.HttpUtil.*;

/**
 * @author Bruno Farache
 */
public class UploadUtil {

	public static JSONArray upload(Session session, JSONObject command)
		throws Exception {

		String path = (String)command.keys().next();
		JSONObject parameters = command.getJSONObject(path);

		HttpClient client = getClient(session);
		HttpPost request = getHttpPost(session, getURL(session, path));

		HttpEntity entity = getMultipartEntity(request, parameters);

		request.setEntity(entity);

		HttpResponse response = client.execute(request);
		String json = getResponseString(response);

		// TODO

		//checkErrors(request, response, json);

		return new JSONArray("[" + json + "]");
	}

	protected static HttpEntity getMultipartEntity(
			HttpPost request, JSONObject parameters)
		throws Exception {

		MultipartEntityBuilder builder = MultipartEntityBuilder.create();
		builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);

		ContentType contentType = ContentType.create(
			"text/plain", Consts.UTF_8);

		Iterator<String> it = parameters.keys();

		while (it.hasNext()) {
			String key = it.next();
			Object value = parameters.get(key);

			ContentBody contentBody;

			if (value instanceof UploadData) {
				UploadData wrapper = (UploadData)value;
				wrapper.setRequest(request);

				contentBody = wrapper;
			}
			else {
				contentBody = new StringBody(value.toString(), contentType);
			}

			builder.addPart(key, contentBody);
		}

		return builder.build();
	}

}