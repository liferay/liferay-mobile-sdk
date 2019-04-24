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

package com.liferay.mobile.android.v72.powwowparticipant;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class PowwowparticipantService extends BaseService {

	public PowwowparticipantService(Session session) {
		super(session);
	}

	public JSONObject deletePowwowParticipant(JSONObjectWrapper powwowParticipant) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			mangleWrapper(_params, "powwowParticipant", "com.liferay.powwow.model.PowwowParticipant", powwowParticipant);

			_command.put("/powwow-portlet.powwowparticipant/delete-powwow-participant", _params);
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

	public JSONArray getPowwowParticipants(long powwowMeetingId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("powwowMeetingId", powwowMeetingId);

			_command.put("/powwow-portlet.powwowparticipant/get-powwow-participants", _params);
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

	public Integer getPowwowParticipantsCount(long powwowMeetingId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("powwowMeetingId", powwowMeetingId);

			_command.put("/powwow-portlet.powwowparticipant/get-powwow-participants-count", _params);
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

	public JSONObject updatePowwowParticipant(long powwowParticipantId, long powwowMeetingId, String name, long participantUserId, String emailAddress, int type, int status, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("emailAddress", checkNull(emailAddress));
			_params.put("name", checkNull(name));
			_params.put("participantUserId", participantUserId);
			_params.put("powwowMeetingId", powwowMeetingId);
			_params.put("powwowParticipantId", powwowParticipantId);
			_params.put("status", status);
			_params.put("type", type);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/powwow-portlet.powwowparticipant/update-powwow-participant", _params);
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