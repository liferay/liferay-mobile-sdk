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

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

import org.json.JSONArray;
import org.json.JSONException;

/**
 * @author Bruno Farache
 */
public class JSONArrayDeserializer implements JsonDeserializer<JSONArray> {

	@Override
	public JSONArray deserialize(
			JsonElement json, Type type, JsonDeserializationContext context)
		throws JsonParseException {

		try {
			String value = json.toString();
			return new JSONArray(value);
		}
		catch (JSONException je) {
			throw new JsonParseException(je);
		}
	}

}