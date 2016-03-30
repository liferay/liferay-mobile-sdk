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

package com.liferay.mobile.sdk;

import com.liferay.mobile.sdk.http.Response;
import com.liferay.mobile.sdk.service.Config;

/**
 * @author Bruno Farache
 */
public class Batch {

	public static void async(Callback<Response> callback, Call... calls)
		throws Exception {

		async(Config.global(), callback, calls);
	}

	public static void async(
			Config config, Callback<Response> callback, Call... calls)
		throws Exception {

		Call<Response> call = new Call<>(Call.bodies(calls), Response.class);
		call.async(config, callback);
	}

	public static Response execute(Call... calls) throws Exception {
		return execute(Config.global(), calls);
	}

	public static Response execute(Config config, Call... calls)
		throws Exception {

		Call<Response> call = new Call<>(Call.bodies(calls), Response.class);
		return call.execute(config);
	}

}