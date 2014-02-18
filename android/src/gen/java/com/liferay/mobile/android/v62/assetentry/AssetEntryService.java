/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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

package com.liferay.mobile.android.v62.assetentry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class AssetEntryService extends BaseService {
	public AssetEntryService(Session session) {
		super(session);
	}

	public JSONArray getCompanyEntries(long companyId, int start, int end)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/assetentry/get-company-entries", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer getCompanyEntriesCount(long companyId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);

			_command.put("/assetentry/get-company-entries-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONArray getEntries(JSONObject entryQuery)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("entryQuery", entryQuery);

			_command.put("/assetentry/get-entries", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer getEntriesCount(JSONObject entryQuery)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("entryQuery", entryQuery);

			_command.put("/assetentry/get-entries-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONObject getEntry(long entryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("entryId", entryId);

			_command.put("/assetentry/get-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject incrementViewCounter(String className, long classPK)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", className);
			_params.put("classPK", classPK);

			_command.put("/assetentry/increment-view-counter", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updateEntry(long groupId, String className, long classPK,
		String classUuid, long classTypeId, JSONArray categoryIds,
		JSONArray tagNames, boolean visible, long startDate, long endDate,
		long expirationDate, String mimeType, String title, String description,
		String summary, String url, String layoutUuid, int height, int width,
		JSONObject priority, boolean sync) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("className", className);
			_params.put("classPK", classPK);
			_params.put("classUuid", classUuid);
			_params.put("classTypeId", classTypeId);
			_params.put("categoryIds", categoryIds);
			_params.put("tagNames", tagNames);
			_params.put("visible", visible);
			_params.put("startDate", startDate);
			_params.put("endDate", endDate);
			_params.put("expirationDate", expirationDate);
			_params.put("mimeType", mimeType);
			_params.put("title", title);
			_params.put("description", description);
			_params.put("summary", summary);
			_params.put("url", url);
			_params.put("layoutUuid", layoutUuid);
			_params.put("height", height);
			_params.put("width", width);
			_params.put("priority", priority);
			_params.put("sync", sync);

			_command.put("/assetentry/update-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updateEntry(long groupId, String className, long classPK,
		String classUuid, long classTypeId, JSONArray categoryIds,
		JSONArray tagNames, boolean visible, long startDate, long endDate,
		long publishDate, long expirationDate, String mimeType, String title,
		String description, String summary, String url, String layoutUuid,
		int height, int width, JSONObject priority, boolean sync)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("className", className);
			_params.put("classPK", classPK);
			_params.put("classUuid", classUuid);
			_params.put("classTypeId", classTypeId);
			_params.put("categoryIds", categoryIds);
			_params.put("tagNames", tagNames);
			_params.put("visible", visible);
			_params.put("startDate", startDate);
			_params.put("endDate", endDate);
			_params.put("publishDate", publishDate);
			_params.put("expirationDate", expirationDate);
			_params.put("mimeType", mimeType);
			_params.put("title", title);
			_params.put("description", description);
			_params.put("summary", summary);
			_params.put("url", url);
			_params.put("layoutUuid", layoutUuid);
			_params.put("height", height);
			_params.put("width", width);
			_params.put("priority", priority);
			_params.put("sync", sync);

			_command.put("/assetentry/update-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updateEntry(long groupId, long createDate,
		long modifiedDate, String className, long classPK, String classUuid,
		long classTypeId, JSONArray categoryIds, JSONArray tagNames,
		boolean visible, long startDate, long endDate, long expirationDate,
		String mimeType, String title, String description, String summary,
		String url, String layoutUuid, int height, int width,
		JSONObject priority, boolean sync) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("createDate", createDate);
			_params.put("modifiedDate", modifiedDate);
			_params.put("className", className);
			_params.put("classPK", classPK);
			_params.put("classUuid", classUuid);
			_params.put("classTypeId", classTypeId);
			_params.put("categoryIds", categoryIds);
			_params.put("tagNames", tagNames);
			_params.put("visible", visible);
			_params.put("startDate", startDate);
			_params.put("endDate", endDate);
			_params.put("expirationDate", expirationDate);
			_params.put("mimeType", mimeType);
			_params.put("title", title);
			_params.put("description", description);
			_params.put("summary", summary);
			_params.put("url", url);
			_params.put("layoutUuid", layoutUuid);
			_params.put("height", height);
			_params.put("width", width);
			_params.put("priority", priority);
			_params.put("sync", sync);

			_command.put("/assetentry/update-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}
}