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

package com.liferay.mobile.android.v62.blogsentry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

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

		session.invoke(_command);
	}

	public JSONArray getCompanyEntries(long companyId, long displayDate, int status, int max) throws Exception {
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

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public String getCompanyEntriesRss(long companyId, long displayDate, int status, int max, String type, double version, String displayStyle, String feedURL, String entryURL, JSONObjectWrapper themeDisplay) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("displayDate", displayDate);
			_params.put("status", status);
			_params.put("max", max);
			_params.put("type", checkNull(type));
			_params.put("version", version);
			_params.put("displayStyle", checkNull(displayStyle));
			_params.put("feedURL", checkNull(feedURL));
			_params.put("entryURL", checkNull(entryURL));
			mangleWrapper(_params, "themeDisplay", "com.liferay.portal.theme.ThemeDisplay", themeDisplay);

			_command.put("/blogsentry/get-company-entries-rss", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getString(0);
	}

	public JSONObject getEntry(long entryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("entryId", entryId);

			_command.put("/blogsentry/get-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject getEntry(long groupId, String urlTitle) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("urlTitle", checkNull(urlTitle));

			_command.put("/blogsentry/get-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONArray getGroupEntries(long groupId, int status, int max) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("status", status);
			_params.put("max", max);

			_command.put("/blogsentry/get-group-entries", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getGroupEntries(long groupId, int status, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("status", status);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/blogsentry/get-group-entries", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getGroupEntries(long groupId, long displayDate, int status, int max) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("displayDate", displayDate);
			_params.put("status", status);
			_params.put("max", max);

			_command.put("/blogsentry/get-group-entries", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getGroupEntries(long groupId, long displayDate, int status, int start, int end) throws Exception {
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

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public Integer getGroupEntriesCount(long groupId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("status", status);

			_command.put("/blogsentry/get-group-entries-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public Integer getGroupEntriesCount(long groupId, long displayDate, int status) throws Exception {
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

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public String getGroupEntriesRss(long groupId, long displayDate, int status, int max, String type, double version, String displayStyle, String feedURL, String entryURL, JSONObjectWrapper themeDisplay) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("displayDate", displayDate);
			_params.put("status", status);
			_params.put("max", max);
			_params.put("type", checkNull(type));
			_params.put("version", version);
			_params.put("displayStyle", checkNull(displayStyle));
			_params.put("feedURL", checkNull(feedURL));
			_params.put("entryURL", checkNull(entryURL));
			mangleWrapper(_params, "themeDisplay", "com.liferay.portal.theme.ThemeDisplay", themeDisplay);

			_command.put("/blogsentry/get-group-entries-rss", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getString(0);
	}

	public JSONArray getGroupsEntries(long companyId, long groupId, long displayDate, int status, int max) throws Exception {
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

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getOrganizationEntries(long organizationId, long displayDate, int status, int max) throws Exception {
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

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public String getOrganizationEntriesRss(long organizationId, long displayDate, int status, int max, String type, double version, String displayStyle, String feedURL, String entryURL, JSONObjectWrapper themeDisplay) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("organizationId", organizationId);
			_params.put("displayDate", displayDate);
			_params.put("status", status);
			_params.put("max", max);
			_params.put("type", checkNull(type));
			_params.put("version", version);
			_params.put("displayStyle", checkNull(displayStyle));
			_params.put("feedURL", checkNull(feedURL));
			_params.put("entryURL", checkNull(entryURL));
			mangleWrapper(_params, "themeDisplay", "com.liferay.portal.theme.ThemeDisplay", themeDisplay);

			_command.put("/blogsentry/get-organization-entries-rss", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getString(0);
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

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
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

		session.invoke(_command);
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

		session.invoke(_command);
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

		session.invoke(_command);
	}

}