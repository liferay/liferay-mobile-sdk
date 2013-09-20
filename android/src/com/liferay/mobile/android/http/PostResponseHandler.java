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

package com.liferay.mobile.android.http;

import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

import org.json.JSONArray;

/**
 * @author Bruno Farache
 */
public class PostResponseHandler implements ResponseHandler<JSONArray> {

	public JSONArray handleResponse(HttpResponse response) {
		JSONArray jsonArray = null;

		try {
			String stringResponse = HttpUtil.getResponseString(response);

			jsonArray = new JSONArray(stringResponse);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return jsonArray;
	}

}