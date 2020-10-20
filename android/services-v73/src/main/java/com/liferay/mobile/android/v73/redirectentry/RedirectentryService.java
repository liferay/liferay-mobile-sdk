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

package com.liferay.mobile.android.v73.redirectentry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class RedirectentryService extends BaseService {

	public RedirectentryService(Session session) {
		super(session);
	}

	public JSONObject addRedirectEntry(long groupId, String destinationURL, long expirationDate, boolean permanent, String sourceURL, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("destinationURL", checkNull(destinationURL));
			_params.put("expirationDate", expirationDate);
			_params.put("groupId", groupId);
			_params.put("permanent", permanent);
			_params.put("sourceURL", checkNull(sourceURL));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/redirect.redirectentry/add-redirect-entry", _params);
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

	public JSONObject addRedirectEntry(long groupId, String destinationURL, long expirationDate, String groupBaseURL, boolean permanent, String sourceURL, boolean updateChainedRedirectEntries, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("destinationURL", checkNull(destinationURL));
			_params.put("expirationDate", expirationDate);
			_params.put("groupBaseURL", checkNull(groupBaseURL));
			_params.put("groupId", groupId);
			_params.put("permanent", permanent);
			_params.put("sourceURL", checkNull(sourceURL));
			_params.put("updateChainedRedirectEntries", updateChainedRedirectEntries);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/redirect.redirectentry/add-redirect-entry", _params);
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

	public JSONObject deleteRedirectEntry(long redirectEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("redirectEntryId", redirectEntryId);

			_command.put("/redirect.redirectentry/delete-redirect-entry", _params);
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

	public JSONObject fetchRedirectEntry(long redirectEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("redirectEntryId", redirectEntryId);

			_command.put("/redirect.redirectentry/fetch-redirect-entry", _params);
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

	public JSONArray getRedirectEntries(long groupId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.redirect.model.RedirectEntry>", orderByComparator);

			_command.put("/redirect.redirectentry/get-redirect-entries", _params);
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

	public Integer getRedirectEntriesCount(long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);

			_command.put("/redirect.redirectentry/get-redirect-entries-count", _params);
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

	public JSONObject updateRedirectEntry(long redirectEntryId, String destinationURL, long expirationDate, boolean permanent, String sourceURL) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("destinationURL", checkNull(destinationURL));
			_params.put("expirationDate", expirationDate);
			_params.put("permanent", permanent);
			_params.put("redirectEntryId", redirectEntryId);
			_params.put("sourceURL", checkNull(sourceURL));

			_command.put("/redirect.redirectentry/update-redirect-entry", _params);
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

	public JSONObject updateRedirectEntry(long redirectEntryId, String destinationURL, long expirationDate, String groupBaseURL, boolean permanent, String sourceURL, boolean updateChainedRedirectEntries) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("destinationURL", checkNull(destinationURL));
			_params.put("expirationDate", expirationDate);
			_params.put("groupBaseURL", checkNull(groupBaseURL));
			_params.put("permanent", permanent);
			_params.put("redirectEntryId", redirectEntryId);
			_params.put("sourceURL", checkNull(sourceURL));
			_params.put("updateChainedRedirectEntries", updateChainedRedirectEntries);

			_command.put("/redirect.redirectentry/update-redirect-entry", _params);
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