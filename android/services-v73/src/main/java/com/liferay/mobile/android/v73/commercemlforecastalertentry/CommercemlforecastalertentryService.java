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

package com.liferay.mobile.android.v73.commercemlforecastalertentry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommercemlforecastalertentryService extends BaseService {

	public CommercemlforecastalertentryService(Session session) {
		super(session);
	}

	public JSONArray getAboveThresholdCommerceMlForecastAlertEntries(long companyId, long userId, int status, double relativeChange, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("relativeChange", relativeChange);
			_params.put("start", start);
			_params.put("status", status);
			_params.put("userId", userId);

			_command.put("/commerce.commercemlforecastalertentry/get-above-threshold-commerce-ml-forecast-alert-entries", _params);
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

	public Integer getAboveThresholdCommerceMlForecastAlertEntriesCount(long companyId, long userId, int status, double relativeChange) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("relativeChange", relativeChange);
			_params.put("status", status);
			_params.put("userId", userId);

			_command.put("/commerce.commercemlforecastalertentry/get-above-threshold-commerce-ml-forecast-alert-entries-count", _params);
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

	public JSONArray getBelowThresholdCommerceMlForecastAlertEntries(long companyId, long userId, int status, double relativeChange, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("relativeChange", relativeChange);
			_params.put("start", start);
			_params.put("status", status);
			_params.put("userId", userId);

			_command.put("/commerce.commercemlforecastalertentry/get-below-threshold-commerce-ml-forecast-alert-entries", _params);
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

	public Integer getBelowThresholdCommerceMlForecastAlertEntriesCount(long companyId, long userId, int status, double relativeChange) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("relativeChange", relativeChange);
			_params.put("status", status);
			_params.put("userId", userId);

			_command.put("/commerce.commercemlforecastalertentry/get-below-threshold-commerce-ml-forecast-alert-entries-count", _params);
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

	public JSONArray getCommerceMlForecastAlertEntries(long companyId, long userId, int status, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("start", start);
			_params.put("status", status);
			_params.put("userId", userId);

			_command.put("/commerce.commercemlforecastalertentry/get-commerce-ml-forecast-alert-entries", _params);
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

	public Integer getCommerceMlForecastAlertEntriesCount(long companyId, long userId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("status", status);
			_params.put("userId", userId);

			_command.put("/commerce.commercemlforecastalertentry/get-commerce-ml-forecast-alert-entries-count", _params);
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

	public JSONObject updateStatus(long userId, long commerceMLForecastAlertEntryId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceMLForecastAlertEntryId", commerceMLForecastAlertEntryId);
			_params.put("status", status);
			_params.put("userId", userId);

			_command.put("/commerce.commercemlforecastalertentry/update-status", _params);
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