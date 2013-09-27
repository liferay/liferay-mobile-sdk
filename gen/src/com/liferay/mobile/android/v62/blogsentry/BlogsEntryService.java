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

package com.liferay.mobile.android.v62.blogsentry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class BlogsEntryService extends BaseService {
	public BlogsEntryService(Session session) {
		super(session);
	}

	public BlogsEntryService(Session session, AsyncTaskCallback callback) {
		super(session, callback);
	}

	public BlogsEntryService(Session session, boolean batch) {
		super(session, batch);
	}

	public void deleteEntry(long entryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("entryId", entryId);

			_command.put("/blogsentry/delete-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		post(_command);
	}

	public JSONArray getCompanyEntries(long companyId, long displayDate,
		int status, int max) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("displayDate", displayDate);
			_params.put("status", status);
			_params.put("max", max);

			_command.put("/blogsentry/get-company-entries", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public String getCompanyEntriesRss(long companyId, long displayDate,
		int status, int max, String type, double version, String displayStyle,
		String feedURL, String entryURL, JSONObject themeDisplay)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("displayDate", displayDate);
			_params.put("status", status);
			_params.put("max", max);
			_params.put("type", type);
			_params.put("version", version);
			_params.put("displayStyle", displayStyle);
			_params.put("feedURL", feedURL);
			_params.put("entryURL", entryURL);
			_params.put("themeDisplay", themeDisplay);

			_command.put("/blogsentry/get-company-entries-rss", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (String)post(_command);
	}

	public JSONObject getEntry(long groupId, String urlTitle)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("urlTitle", urlTitle);

			_command.put("/blogsentry/get-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONArray getGroupEntries(long groupId, long displayDate,
		int status, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("displayDate", displayDate);
			_params.put("status", status);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/blogsentry/get-group-entries", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public Integer getGroupEntriesCount(long groupId, long displayDate,
		int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("displayDate", displayDate);
			_params.put("status", status);

			_command.put("/blogsentry/get-group-entries-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)post(_command);
	}

	public String getGroupEntriesRss(long groupId, long displayDate,
		int status, int max, String type, double version, String displayStyle,
		String feedURL, String entryURL, JSONObject themeDisplay)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("displayDate", displayDate);
			_params.put("status", status);
			_params.put("max", max);
			_params.put("type", type);
			_params.put("version", version);
			_params.put("displayStyle", displayStyle);
			_params.put("feedURL", feedURL);
			_params.put("entryURL", entryURL);
			_params.put("themeDisplay", themeDisplay);

			_command.put("/blogsentry/get-group-entries-rss", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (String)post(_command);
	}

	public JSONArray getGroupsEntries(long companyId, long groupId,
		long displayDate, int status, int max) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupId", groupId);
			_params.put("displayDate", displayDate);
			_params.put("status", status);
			_params.put("max", max);

			_command.put("/blogsentry/get-groups-entries", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public JSONArray getOrganizationEntries(long organizationId,
		long displayDate, int status, int max) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("organizationId", organizationId);
			_params.put("displayDate", displayDate);
			_params.put("status", status);
			_params.put("max", max);

			_command.put("/blogsentry/get-organization-entries", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public String getOrganizationEntriesRss(long organizationId,
		long displayDate, int status, int max, String type, double version,
		String displayStyle, String feedURL, String entryURL,
		JSONObject themeDisplay) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("organizationId", organizationId);
			_params.put("displayDate", displayDate);
			_params.put("status", status);
			_params.put("max", max);
			_params.put("type", type);
			_params.put("version", version);
			_params.put("displayStyle", displayStyle);
			_params.put("feedURL", feedURL);
			_params.put("entryURL", entryURL);
			_params.put("themeDisplay", themeDisplay);

			_command.put("/blogsentry/get-organization-entries-rss", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (String)post(_command);
	}

	public JSONObject moveEntryToTrash(long entryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("entryId", entryId);

			_command.put("/blogsentry/move-entry-to-trash", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public void restoreEntryFromTrash(long entryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("entryId", entryId);

			_command.put("/blogsentry/restore-entry-from-trash", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		post(_command);
	}

	public void subscribe(long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);

			_command.put("/blogsentry/subscribe", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		post(_command);
	}

	public void unsubscribe(long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);

			_command.put("/blogsentry/unsubscribe", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		post(_command);
	}
}