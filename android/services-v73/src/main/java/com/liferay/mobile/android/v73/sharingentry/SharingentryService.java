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

package com.liferay.mobile.android.v73.sharingentry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class SharingentryService extends BaseService {

	public SharingentryService(Session session) {
		super(session);
	}

	public JSONObject addOrUpdateSharingEntry(long toUserId, long classNameId, long classPK, long groupId, boolean shareable, JSONArray sharingEntryActions, long expirationDate, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("expirationDate", expirationDate);
			_params.put("groupId", groupId);
			_params.put("shareable", shareable);
			_params.put("sharingEntryActions", checkNull(sharingEntryActions));
			_params.put("toUserId", toUserId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/sharing.sharingentry/add-or-update-sharing-entry", _params);
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

	public JSONObject addSharingEntry(long toUserId, long classNameId, long classPK, long groupId, boolean shareable, JSONArray sharingEntryActions, long expirationDate, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("expirationDate", expirationDate);
			_params.put("groupId", groupId);
			_params.put("shareable", shareable);
			_params.put("sharingEntryActions", checkNull(sharingEntryActions));
			_params.put("toUserId", toUserId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/sharing.sharingentry/add-sharing-entry", _params);
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

	public JSONObject deleteSharingEntry(long sharingEntryId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("sharingEntryId", sharingEntryId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/sharing.sharingentry/delete-sharing-entry", _params);
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

	public JSONObject updateSharingEntry(long sharingEntryId, JSONArray sharingEntryActions, boolean shareable, long expirationDate, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("expirationDate", expirationDate);
			_params.put("shareable", shareable);
			_params.put("sharingEntryActions", checkNull(sharingEntryActions));
			_params.put("sharingEntryId", sharingEntryId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/sharing.sharingentry/update-sharing-entry", _params);
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