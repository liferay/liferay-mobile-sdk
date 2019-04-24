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

package com.liferay.mobile.android.v72.powwowmeeting;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class PowwowmeetingService extends BaseService {

	public PowwowmeetingService(Session session) {
		super(session);
	}

	public JSONObject addPowwowMeeting(long groupId, String portletId, long powwowServerId, String name, String description, String providerType, JSONObject providerTypeMetadataMap, String languageId, long calendarBookingId, int status, JSONArray powwowParticipants, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("calendarBookingId", calendarBookingId);
			_params.put("description", checkNull(description));
			_params.put("groupId", groupId);
			_params.put("languageId", checkNull(languageId));
			_params.put("name", checkNull(name));
			_params.put("portletId", checkNull(portletId));
			_params.put("powwowParticipants", checkNull(powwowParticipants));
			_params.put("powwowServerId", powwowServerId);
			_params.put("providerType", checkNull(providerType));
			_params.put("providerTypeMetadataMap", checkNull(providerTypeMetadataMap));
			_params.put("status", status);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/powwow-portlet.powwowmeeting/add-powwow-meeting", _params);
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

	public JSONObject deletePowwowMeeting(long powwowMeetingId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("powwowMeetingId", powwowMeetingId);

			_command.put("/powwow-portlet.powwowmeeting/delete-powwow-meeting", _params);
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

	public JSONObject getPowwowMeeting(long powwowMeetingId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("powwowMeetingId", powwowMeetingId);

			_command.put("/powwow-portlet.powwowmeeting/get-powwow-meeting", _params);
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

	public JSONArray getPowwowMeetings(long groupId, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator", obc);

			_command.put("/powwow-portlet.powwowmeeting/get-powwow-meetings", _params);
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

	public Integer getPowwowMeetingsCount(long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);

			_command.put("/powwow-portlet.powwowmeeting/get-powwow-meetings-count", _params);
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

	public JSONObject updatePowwowMeeting(long powwowMeetingId, long powwowServerId, String name, String description, String providerType, JSONObject providerTypeMetadataMap, String languageId, long calendarBookingId, int status, JSONArray powwowParticipants, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("calendarBookingId", calendarBookingId);
			_params.put("description", checkNull(description));
			_params.put("languageId", checkNull(languageId));
			_params.put("name", checkNull(name));
			_params.put("powwowMeetingId", powwowMeetingId);
			_params.put("powwowParticipants", checkNull(powwowParticipants));
			_params.put("powwowServerId", powwowServerId);
			_params.put("providerType", checkNull(providerType));
			_params.put("providerTypeMetadataMap", checkNull(providerTypeMetadataMap));
			_params.put("status", status);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/powwow-portlet.powwowmeeting/update-powwow-meeting", _params);
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