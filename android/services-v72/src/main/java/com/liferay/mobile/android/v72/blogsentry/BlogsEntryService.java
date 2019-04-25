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

package com.liferay.mobile.android.v72.blogsentry;

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

	public JSONObject addAttachmentsFolder(long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);

			_command.put("/blogs.blogsentry/add-attachments-folder", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject addEntry(String title, String subtitle, String description, String content, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, boolean allowPingbacks, boolean allowTrackbacks, JSONArray trackbacks, String coverImageCaption, JSONObjectWrapper coverImageImageSelector, JSONObjectWrapper smallImageImageSelector, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("allowPingbacks", allowPingbacks);
			_params.put("allowTrackbacks", allowTrackbacks);
			_params.put("content", checkNull(content));
			_params.put("coverImageCaption", checkNull(coverImageCaption));
			_params.put("description", checkNull(description));
			_params.put("displayDateDay", displayDateDay);
			_params.put("displayDateHour", displayDateHour);
			_params.put("displayDateMinute", displayDateMinute);
			_params.put("displayDateMonth", displayDateMonth);
			_params.put("displayDateYear", displayDateYear);
			_params.put("subtitle", checkNull(subtitle));
			_params.put("title", checkNull(title));
			_params.put("trackbacks", checkNull(trackbacks));
			mangleWrapper(_params, "coverImageImageSelector", "com.liferay.portal.kernel.servlet.taglib.ui.ImageSelector", coverImageImageSelector);
			mangleWrapper(_params, "smallImageImageSelector", "com.liferay.portal.kernel.servlet.taglib.ui.ImageSelector", smallImageImageSelector);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/blogs.blogsentry/add-entry", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject addEntry(String title, String subtitle, String urlTitle, String description, String content, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, boolean allowPingbacks, boolean allowTrackbacks, JSONArray trackbacks, String coverImageCaption, JSONObjectWrapper coverImageImageSelector, JSONObjectWrapper smallImageImageSelector, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("allowPingbacks", allowPingbacks);
			_params.put("allowTrackbacks", allowTrackbacks);
			_params.put("content", checkNull(content));
			_params.put("coverImageCaption", checkNull(coverImageCaption));
			_params.put("description", checkNull(description));
			_params.put("displayDateDay", displayDateDay);
			_params.put("displayDateHour", displayDateHour);
			_params.put("displayDateMinute", displayDateMinute);
			_params.put("displayDateMonth", displayDateMonth);
			_params.put("displayDateYear", displayDateYear);
			_params.put("subtitle", checkNull(subtitle));
			_params.put("title", checkNull(title));
			_params.put("trackbacks", checkNull(trackbacks));
			_params.put("urlTitle", checkNull(urlTitle));
			mangleWrapper(_params, "coverImageImageSelector", "com.liferay.portal.kernel.servlet.taglib.ui.ImageSelector", coverImageImageSelector);
			mangleWrapper(_params, "smallImageImageSelector", "com.liferay.portal.kernel.servlet.taglib.ui.ImageSelector", smallImageImageSelector);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/blogs.blogsentry/add-entry", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public void deleteEntry(long entryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("entryId", entryId);

			_command.put("/blogs.blogsentry/delete-entry", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONArray getCompanyEntries(long companyId, long displayDate, int status, int max) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("displayDate", displayDate);
			_params.put("max", max);
			_params.put("status", status);

			_command.put("/blogs.blogsentry/get-company-entries", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
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
			_params.put("displayStyle", checkNull(displayStyle));
			_params.put("entryURL", checkNull(entryURL));
			_params.put("feedURL", checkNull(feedURL));
			_params.put("max", max);
			_params.put("status", status);
			_params.put("type", checkNull(type));
			_params.put("version", version);
			mangleWrapper(_params, "themeDisplay", "com.liferay.portal.kernel.theme.ThemeDisplay", themeDisplay);

			_command.put("/blogs.blogsentry/get-company-entries-rss", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getString(0);
	}

	public JSONArray getEntriesPrevAndNext(long entryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("entryId", entryId);

			_command.put("/blogs.blogsentry/get-entries-prev-and-next", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONObject getEntry(long entryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("entryId", entryId);

			_command.put("/blogs.blogsentry/get-entry", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
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

			_command.put("/blogs.blogsentry/get-entry", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
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
			_params.put("max", max);
			_params.put("status", status);

			_command.put("/blogs.blogsentry/get-group-entries", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
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

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("status", status);

			_command.put("/blogs.blogsentry/get-group-entries", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getGroupEntries(long groupId, int status, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.blogs.model.BlogsEntry>", obc);

			_command.put("/blogs.blogsentry/get-group-entries", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
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

			_params.put("displayDate", displayDate);
			_params.put("groupId", groupId);
			_params.put("max", max);
			_params.put("status", status);

			_command.put("/blogs.blogsentry/get-group-entries", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
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

			_params.put("displayDate", displayDate);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("status", status);

			_command.put("/blogs.blogsentry/get-group-entries", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
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

			_command.put("/blogs.blogsentry/get-group-entries-count", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
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

			_params.put("displayDate", displayDate);
			_params.put("groupId", groupId);
			_params.put("status", status);

			_command.put("/blogs.blogsentry/get-group-entries-count", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
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

			_params.put("displayDate", displayDate);
			_params.put("displayStyle", checkNull(displayStyle));
			_params.put("entryURL", checkNull(entryURL));
			_params.put("feedURL", checkNull(feedURL));
			_params.put("groupId", groupId);
			_params.put("max", max);
			_params.put("status", status);
			_params.put("type", checkNull(type));
			_params.put("version", version);
			mangleWrapper(_params, "themeDisplay", "com.liferay.portal.kernel.theme.ThemeDisplay", themeDisplay);

			_command.put("/blogs.blogsentry/get-group-entries-rss", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
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
			_params.put("displayDate", displayDate);
			_params.put("groupId", groupId);
			_params.put("max", max);
			_params.put("status", status);

			_command.put("/blogs.blogsentry/get-groups-entries", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getGroupUserEntries(long groupId, long userId, int status, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("status", status);
			_params.put("userId", userId);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.blogs.model.BlogsEntry>", obc);

			_command.put("/blogs.blogsentry/get-group-user-entries", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getGroupUserEntries(long groupId, long userId, JSONArray statuses, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("statuses", checkNull(statuses));
			_params.put("userId", userId);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.blogs.model.BlogsEntry>", obc);

			_command.put("/blogs.blogsentry/get-group-user-entries", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public Integer getGroupUserEntriesCount(long groupId, long userId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("status", status);
			_params.put("userId", userId);

			_command.put("/blogs.blogsentry/get-group-user-entries-count", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public Integer getGroupUserEntriesCount(long groupId, long userId, JSONArray statuses) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("statuses", checkNull(statuses));
			_params.put("userId", userId);

			_command.put("/blogs.blogsentry/get-group-user-entries-count", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public JSONArray getOrganizationEntries(long organizationId, long displayDate, int status, int max) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("displayDate", displayDate);
			_params.put("max", max);
			_params.put("organizationId", organizationId);
			_params.put("status", status);

			_command.put("/blogs.blogsentry/get-organization-entries", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
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

			_params.put("displayDate", displayDate);
			_params.put("displayStyle", checkNull(displayStyle));
			_params.put("entryURL", checkNull(entryURL));
			_params.put("feedURL", checkNull(feedURL));
			_params.put("max", max);
			_params.put("organizationId", organizationId);
			_params.put("status", status);
			_params.put("type", checkNull(type));
			_params.put("version", version);
			mangleWrapper(_params, "themeDisplay", "com.liferay.portal.kernel.theme.ThemeDisplay", themeDisplay);

			_command.put("/blogs.blogsentry/get-organization-entries-rss", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
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

			_command.put("/blogs.blogsentry/move-entry-to-trash", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
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

			_command.put("/blogs.blogsentry/restore-entry-from-trash", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void subscribe(long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);

			_command.put("/blogs.blogsentry/subscribe", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void unsubscribe(long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);

			_command.put("/blogs.blogsentry/unsubscribe", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject updateEntry(long entryId, String title, String subtitle, String description, String content, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, boolean allowPingbacks, boolean allowTrackbacks, JSONArray trackbacks, String coverImageCaption, JSONObjectWrapper coverImageImageSelector, JSONObjectWrapper smallImageImageSelector, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("allowPingbacks", allowPingbacks);
			_params.put("allowTrackbacks", allowTrackbacks);
			_params.put("content", checkNull(content));
			_params.put("coverImageCaption", checkNull(coverImageCaption));
			_params.put("description", checkNull(description));
			_params.put("displayDateDay", displayDateDay);
			_params.put("displayDateHour", displayDateHour);
			_params.put("displayDateMinute", displayDateMinute);
			_params.put("displayDateMonth", displayDateMonth);
			_params.put("displayDateYear", displayDateYear);
			_params.put("entryId", entryId);
			_params.put("subtitle", checkNull(subtitle));
			_params.put("title", checkNull(title));
			_params.put("trackbacks", checkNull(trackbacks));
			mangleWrapper(_params, "coverImageImageSelector", "com.liferay.portal.kernel.servlet.taglib.ui.ImageSelector", coverImageImageSelector);
			mangleWrapper(_params, "smallImageImageSelector", "com.liferay.portal.kernel.servlet.taglib.ui.ImageSelector", smallImageImageSelector);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/blogs.blogsentry/update-entry", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject updateEntry(long entryId, String title, String subtitle, String urlTitle, String description, String content, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, boolean allowPingbacks, boolean allowTrackbacks, JSONArray trackbacks, String coverImageCaption, JSONObjectWrapper coverImageImageSelector, JSONObjectWrapper smallImageImageSelector, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("allowPingbacks", allowPingbacks);
			_params.put("allowTrackbacks", allowTrackbacks);
			_params.put("content", checkNull(content));
			_params.put("coverImageCaption", checkNull(coverImageCaption));
			_params.put("description", checkNull(description));
			_params.put("displayDateDay", displayDateDay);
			_params.put("displayDateHour", displayDateHour);
			_params.put("displayDateMinute", displayDateMinute);
			_params.put("displayDateMonth", displayDateMonth);
			_params.put("displayDateYear", displayDateYear);
			_params.put("entryId", entryId);
			_params.put("subtitle", checkNull(subtitle));
			_params.put("title", checkNull(title));
			_params.put("trackbacks", checkNull(trackbacks));
			_params.put("urlTitle", checkNull(urlTitle));
			mangleWrapper(_params, "coverImageImageSelector", "com.liferay.portal.kernel.servlet.taglib.ui.ImageSelector", coverImageImageSelector);
			mangleWrapper(_params, "smallImageImageSelector", "com.liferay.portal.kernel.servlet.taglib.ui.ImageSelector", smallImageImageSelector);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/blogs.blogsentry/update-entry", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

}