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

package com.liferay.mobile.android.http.client;

import com.liferay.mobile.android.http.Request;
import com.liferay.mobile.android.http.Response;

/**
 * @author Bruno Farache
 */
public interface HttpClient {

	void cancel(Object tag);

	String encodeURL(String path);

	Response send(Request request) throws Exception;

	Response upload(Request request) throws Exception;

}