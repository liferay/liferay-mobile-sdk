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

package com.liferay.mobile.android.v73.accountentry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class AccountentryService extends BaseService {

	public AccountentryService(Session session) {
		super(session);
	}

	public JSONObject addAccountEntry(long userId, long parentAccountEntryId, String name, String description, JSONArray domains, byte[] logoBytes, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("description", checkNull(description));
			_params.put("domains", checkNull(domains));
			_params.put("logoBytes", toString(logoBytes));
			_params.put("name", checkNull(name));
			_params.put("parentAccountEntryId", parentAccountEntryId);
			_params.put("status", status);
			_params.put("userId", userId);

			_command.put("/account.accountentry/add-account-entry", _params);
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

	public JSONObject addAccountEntry(long userId, long parentAccountEntryId, String name, String description, JSONArray domains, byte[] logoBytes, int status, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("description", checkNull(description));
			_params.put("domains", checkNull(domains));
			_params.put("logoBytes", toString(logoBytes));
			_params.put("name", checkNull(name));
			_params.put("parentAccountEntryId", parentAccountEntryId);
			_params.put("status", status);
			_params.put("userId", userId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/account.accountentry/add-account-entry", _params);
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

	public JSONObject addAccountEntry(long userId, long parentAccountEntryId, String name, String description, JSONArray domains, byte[] logoBytes, String taxIdNumber, String type, int status, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("description", checkNull(description));
			_params.put("domains", checkNull(domains));
			_params.put("logoBytes", toString(logoBytes));
			_params.put("name", checkNull(name));
			_params.put("parentAccountEntryId", parentAccountEntryId);
			_params.put("status", status);
			_params.put("taxIdNumber", checkNull(taxIdNumber));
			_params.put("type", checkNull(type));
			_params.put("userId", userId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/account.accountentry/add-account-entry", _params);
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

	public JSONArray getAccountEntries(long companyId, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.account.model.AccountEntry>", orderByComparator);

			_command.put("/account.accountentry/get-account-entries", _params);
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

	public JSONObject search(String keywords, JSONObject params, int cur, int delta, String orderByField, boolean reverse) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cur", cur);
			_params.put("delta", delta);
			_params.put("keywords", checkNull(keywords));
			_params.put("orderByField", checkNull(orderByField));
			_params.put("params", checkNull(params));
			_params.put("reverse", reverse);

			_command.put("/account.accountentry/search", _params);
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