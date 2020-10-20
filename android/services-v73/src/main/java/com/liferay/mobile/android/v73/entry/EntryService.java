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

package com.liferay.mobile.android.v73.entry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class EntryService extends BaseService {

	public EntryService(Session session) {
		super(session);
	}

	public JSONObject addEntry(long groupId, long definitionId, String format, boolean schedulerRequest, long startDate, long endDate, boolean repeating, String recurrence, String emailNotifications, String emailDelivery, String portletId, String pageURL, String reportName, String reportParameters, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("definitionId", definitionId);
			_params.put("emailDelivery", checkNull(emailDelivery));
			_params.put("emailNotifications", checkNull(emailNotifications));
			_params.put("endDate", endDate);
			_params.put("format", checkNull(format));
			_params.put("groupId", groupId);
			_params.put("pageURL", checkNull(pageURL));
			_params.put("portletId", checkNull(portletId));
			_params.put("recurrence", checkNull(recurrence));
			_params.put("repeating", repeating);
			_params.put("reportName", checkNull(reportName));
			_params.put("reportParameters", checkNull(reportParameters));
			_params.put("schedulerRequest", schedulerRequest);
			_params.put("startDate", startDate);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/reports.entry/add-entry", _params);
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

	public void deleteAttachment(long companyId, long entryId, String fileName) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("entryId", entryId);
			_params.put("fileName", checkNull(fileName));

			_command.put("/reports.entry/delete-attachment", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject deleteEntry(long entryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("entryId", entryId);

			_command.put("/reports.entry/delete-entry", _params);
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

	public JSONArray getEntries(long groupId, String definitionName, String userName, long createDateGT, long createDateLT, boolean andSearch, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("andSearch", andSearch);
			_params.put("createDateGT", createDateGT);
			_params.put("createDateLT", createDateLT);
			_params.put("definitionName", checkNull(definitionName));
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("userName", checkNull(userName));
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.portal.reports.engine.console.model.Entry>", orderByComparator);

			_command.put("/reports.entry/get-entries", _params);
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

	public Integer getEntriesCount(long groupId, String definitionName, String userName, long createDateGT, long createDateLT, boolean andSearch) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("andSearch", andSearch);
			_params.put("createDateGT", createDateGT);
			_params.put("createDateLT", createDateLT);
			_params.put("definitionName", checkNull(definitionName));
			_params.put("groupId", groupId);
			_params.put("userName", checkNull(userName));

			_command.put("/reports.entry/get-entries-count", _params);
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

	public void sendEmails(long entryId, String fileName, JSONArray emailAddresses, boolean notification) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("emailAddresses", checkNull(emailAddresses));
			_params.put("entryId", entryId);
			_params.put("fileName", checkNull(fileName));
			_params.put("notification", notification);

			_command.put("/reports.entry/send-emails", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void unscheduleEntry(long entryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("entryId", entryId);

			_command.put("/reports.entry/unschedule-entry", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

}