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

package com.liferay.mobile.sdk.v2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Bruno Farache
 */
public class GsonTest {

	@Test
	public void arrayWithObject() throws Exception {
		String json = "[{\"key\":{\"child\":\"value\"}}]";
		Type type = new GenericListType<Map>(Map.class);
		List<Map<String, Map<String, Object>>> list = new Gson().fromJson(
			json, type);

		assertEquals(1, list.size());
		assertEquals("value", list.get(0).get("key").get("child"));
	}

	@Test
	public void arrayWithObjectAndPrimitive() throws Exception {
		String json = "[{\"key\":{\"child\":\"value\"}},2]";
		Type type = new GenericListType<Object>(Object.class);

		List<Object> list = new Gson().fromJson(json, type);

		assertEquals(2, list.size());
		assertEquals("value", ((Map)((Map)list.get(0)).get("key")).get("child"));
		assertEquals(2, ((Double)list.get(1)).intValue());
	}

	@Test
	public void genericListType() throws Exception {
		String json = "[{\"classNameId\":\"20005\",\"classPK\":\"20247\",\"companyId\":\"20202\",\"creatorUserId\":\"20247\",\"description\":\"\",\"descriptionCurrentValue\":\"\",\"friendlyURL\":\"\\/test\",\"groupId\":\"20249\",\"groupKey\":\"20247\",\"liveGroupId\":\"0\",\"membershipRestriction\":0,\"mvccVersion\":\"0\",\"name\":\"\",\"nameCurrentValue\":\"\",\"parentGroupId\":\"0\",\"remoteStagingGroupCount\":0,\"treePath\":\"\\/20249\\/\",\"type\":0,\"typeSettings\":\"\",\"uuid\":\"9cb53101-c40a-e531-4c1d-41dce639d11f\"},{\"classNameId\":\"20019\",\"classPK\":\"20202\",\"companyId\":\"20202\",\"creatorUserId\":\"20205\",\"description\":\"\",\"descriptionCurrentValue\":\"\",\"friendlyURL\":\"\\/global\",\"groupId\":\"20243\",\"groupKey\":\"20202\",\"liveGroupId\":\"0\",\"membershipRestriction\":0,\"mvccVersion\":\"0\",\"name\":\"<?xml version='1.0' encoding='UTF-8'?><root available-locales=\\\"en_US\\\" default-locale=\\\"en_US\\\"><Name language-id=\\\"en_US\\\">Global<\\/Name><\\/root>\",\"nameCurrentValue\":\"Global\",\"parentGroupId\":\"0\",\"remoteStagingGroupCount\":0,\"treePath\":\"\\/20243\\/\",\"type\":0,\"typeSettings\":\"\",\"uuid\":\"930b9fe3-f6aa-52a6-b543-677f649a29e3\"},{\"classNameId\":\"20001\",\"classPK\":\"20229\",\"companyId\":\"20202\",\"creatorUserId\":\"20205\",\"description\":\"\",\"descriptionCurrentValue\":\"\",\"friendlyURL\":\"\\/guest\",\"groupId\":\"20229\",\"groupKey\":\"Guest\",\"liveGroupId\":\"0\",\"membershipRestriction\":0,\"mvccVersion\":\"0\",\"name\":\"<?xml version='1.0' encoding='UTF-8'?><root available-locales=\\\"en_US\\\" default-locale=\\\"en_US\\\"><Name language-id=\\\"en_US\\\">Guest<\\/Name><\\/root>\",\"nameCurrentValue\":\"Guest\",\"parentGroupId\":\"0\",\"remoteStagingGroupCount\":0,\"treePath\":\"\\/20229\\/\",\"type\":1,\"typeSettings\":\"\",\"uuid\":\"27ea3725-f4f8-7478-030c-78f8470869e4\"}]";
		Type type = new GenericListType<Site>(Site.class);
		List<Site> sites = new Gson().fromJson(json, type);

		assertEquals(3, sites.size());
		Site site = sites.get(0);
		assertEquals("/test", site.friendlyURL);
		assertEquals(20249, site.groupId);
	}

	@Test
	public void jsonArray() throws Exception {
		String json = "[\"value1\",\"value2\"]";
		JsonArray jsonArray = new Gson().fromJson(json, JsonArray.class);
		assertEquals(2, jsonArray.size());
	}

	@Test
	public void jsonArrayDeserializer() throws Exception {
		String json = "[{\"key\":\"value\"}]";
		GsonBuilder builder = new GsonBuilder();

		builder.registerTypeAdapter(
			JSONArray.class, new JSONArrayDeserializer());

		Gson gson = builder.create();

		JSONArray jsonArray = gson.fromJson(json, JSONArray.class);

		assertEquals(1, jsonArray.length());
		JSONObject jsonObject = jsonArray.getJSONObject(0);
		assertEquals("value", jsonObject.getString("key"));
	}

	@Test
	public void jsonObject() throws Exception {
		String json = "{\"key\":\"value\"}";
		JsonObject jsonObject = new Gson().fromJson(json, JsonObject.class);
		assertEquals("value", jsonObject.get("key").getAsString());
	}

	@Test
	public void jsonObjectDeserializer() throws Exception {
		String json = "{\"key\":\"value\"}";
		GsonBuilder builder = new GsonBuilder();

		builder.registerTypeAdapter(
				JSONObject.class, new JSONObjectDeserializer());

		Gson gson = builder.create();

		JSONObject jsonObject = gson.fromJson(json, JSONObject.class);
		assertEquals("value", jsonObject.getString("key"));
	}

	@Test
	public void mapWithObject() throws Exception {
		String json = "{\"key\":{\"child\":\"value\"}}";

		Map<String, Map<String, Object>> map = new Gson().fromJson(
			json, new TypeToken<Map<String, Object>>(){}.getType());

		assertEquals("value", map.get("key").get("child"));
	}

	@Test
	public void mapWithPrimitives() throws Exception {
		String json = "{\"key\":\"value\",\"key2\":2,\"key3\":true}";
		Map<String, Object> map = new Gson().fromJson(
			json, new TypeToken<Map<String, Object>>(){}.getType());

		assertEquals("value", map.get("key"));
		assertEquals(2, ((Double)map.get("key2")).intValue());
		assertEquals(true, ((Boolean)map.get("key3")).booleanValue());
	}

}