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

package com.liferay.mobile.android.v2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONArray;
import org.json.JSONObject;

import java.lang.reflect.Type;

/**
 * @author Bruno Farache
 */
public class JsonParser {

	static {
		GsonBuilder builder = new GsonBuilder();

		builder.registerTypeAdapter(
			JSONArray.class, new JSONArrayDeserializer());

		builder.registerTypeAdapter(
			JSONObject.class, new JSONObjectDeserializer());

		gson = builder.create();

	}

	public static <T> T fromJson(String json, Type type) throws Exception {
		return gson.fromJson(json, type);
	}

	protected static Gson gson;

}