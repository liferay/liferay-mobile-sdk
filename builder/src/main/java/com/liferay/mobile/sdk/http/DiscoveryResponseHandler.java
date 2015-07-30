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

package com.liferay.mobile.sdk.http;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

import org.json.JSONException;

/**
 * @author Bruno Farache
 */
public class DiscoveryResponseHandler implements ResponseHandler<Discovery> {

	public Discovery handleResponse(HttpResponse response) throws IOException {
		Discovery discovery;
		String json = EntityUtils.toString(response.getEntity());

		try {
			discovery = new Discovery(json);
		}
		catch (JSONException je) {
			throw new IOException(je);
		}

		return discovery;
	}

}