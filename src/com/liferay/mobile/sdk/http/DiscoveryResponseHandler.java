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

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;

import org.json.JSONException;

/**
 * @author Bruno Farache
 */
public class DiscoveryResponseHandler
		implements ResponseHandler<Discovery> {

	public Discovery handleResponse(HttpResponse response)
		throws ClientProtocolException, IOException {

		Discovery discovery = null;

		String responseString = HttpUtil.getResponseString(response);

		try {
			discovery = new Discovery(responseString);
		}
		catch (JSONException je) {
			throw new IOException(je);
		}

		return discovery;
	}

}