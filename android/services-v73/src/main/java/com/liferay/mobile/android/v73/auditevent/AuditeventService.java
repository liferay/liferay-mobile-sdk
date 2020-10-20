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

package com.liferay.mobile.android.v73.auditevent;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class AuditeventService extends BaseService {

	public AuditeventService(Session session) {
		super(session);
	}

	public JSONArray getAuditEvents(long companyId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("start", start);

			_command.put("/audit.auditevent/get-audit-events", _params);
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

	public JSONArray getAuditEvents(long companyId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.portal.security.audit.storage.model.AuditEvent>", orderByComparator);

			_command.put("/audit.auditevent/get-audit-events", _params);
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

	public JSONArray getAuditEvents(long companyId, long userId, String userName, long createDateGT, long createDateLT, String eventType, String className, String classPK, String clientHost, String clientIP, String serverName, int serverPort, String sessionID, boolean andSearch, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("andSearch", andSearch);
			_params.put("className", checkNull(className));
			_params.put("classPK", checkNull(classPK));
			_params.put("clientHost", checkNull(clientHost));
			_params.put("clientIP", checkNull(clientIP));
			_params.put("companyId", companyId);
			_params.put("createDateGT", createDateGT);
			_params.put("createDateLT", createDateLT);
			_params.put("end", end);
			_params.put("eventType", checkNull(eventType));
			_params.put("serverName", checkNull(serverName));
			_params.put("serverPort", serverPort);
			_params.put("sessionID", checkNull(sessionID));
			_params.put("start", start);
			_params.put("userId", userId);
			_params.put("userName", checkNull(userName));

			_command.put("/audit.auditevent/get-audit-events", _params);
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

	public JSONArray getAuditEvents(long companyId, long userId, String userName, long createDateGT, long createDateLT, String eventType, String className, String classPK, String clientHost, String clientIP, String serverName, int serverPort, String sessionID, boolean andSearch, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("andSearch", andSearch);
			_params.put("className", checkNull(className));
			_params.put("classPK", checkNull(classPK));
			_params.put("clientHost", checkNull(clientHost));
			_params.put("clientIP", checkNull(clientIP));
			_params.put("companyId", companyId);
			_params.put("createDateGT", createDateGT);
			_params.put("createDateLT", createDateLT);
			_params.put("end", end);
			_params.put("eventType", checkNull(eventType));
			_params.put("serverName", checkNull(serverName));
			_params.put("serverPort", serverPort);
			_params.put("sessionID", checkNull(sessionID));
			_params.put("start", start);
			_params.put("userId", userId);
			_params.put("userName", checkNull(userName));
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.portal.security.audit.storage.model.AuditEvent>", orderByComparator);

			_command.put("/audit.auditevent/get-audit-events", _params);
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

	public Integer getAuditEventsCount(long companyId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);

			_command.put("/audit.auditevent/get-audit-events-count", _params);
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

	public Integer getAuditEventsCount(long companyId, long userId, String userName, long createDateGT, long createDateLT, String eventType, String className, String classPK, String clientHost, String clientIP, String serverName, int serverPort, String sessionID, boolean andSearch) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("andSearch", andSearch);
			_params.put("className", checkNull(className));
			_params.put("classPK", checkNull(classPK));
			_params.put("clientHost", checkNull(clientHost));
			_params.put("clientIP", checkNull(clientIP));
			_params.put("companyId", companyId);
			_params.put("createDateGT", createDateGT);
			_params.put("createDateLT", createDateLT);
			_params.put("eventType", checkNull(eventType));
			_params.put("serverName", checkNull(serverName));
			_params.put("serverPort", serverPort);
			_params.put("sessionID", checkNull(sessionID));
			_params.put("userId", userId);
			_params.put("userName", checkNull(userName));

			_command.put("/audit.auditevent/get-audit-events-count", _params);
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

}