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

package com.liferay.mobile.android.v73.announcementsentry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class AnnouncementsEntryService extends BaseService {

	public AnnouncementsEntryService(Session session) {
		super(session);
	}

	public JSONObject addEntry(long classNameId, long classPK, String title, String content, String url, String type, long displayDate, long expirationDate, int priority, boolean alert) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("alert", alert);
			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("content", checkNull(content));
			_params.put("displayDate", displayDate);
			_params.put("expirationDate", expirationDate);
			_params.put("priority", priority);
			_params.put("title", checkNull(title));
			_params.put("type", checkNull(type));
			_params.put("url", checkNull(url));

			_command.put("/announcementsentry/add-entry", _params);
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

			_command.put("/announcementsentry/delete-entry", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject getEntry(long entryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("entryId", entryId);

			_command.put("/announcementsentry/get-entry", _params);
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

	public JSONObject updateEntry(long entryId, String title, String content, String url, String type, long displayDate, long expirationDate, int priority) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("content", checkNull(content));
			_params.put("displayDate", displayDate);
			_params.put("entryId", entryId);
			_params.put("expirationDate", expirationDate);
			_params.put("priority", priority);
			_params.put("title", checkNull(title));
			_params.put("type", checkNull(type));
			_params.put("url", checkNull(url));

			_command.put("/announcementsentry/update-entry", _params);
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