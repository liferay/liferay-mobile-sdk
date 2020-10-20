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

package com.liferay.mobile.android.v73.commercetaxfixedrate;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommercetaxfixedrateService extends BaseService {

	public CommercetaxfixedrateService(Session session) {
		super(session);
	}

	public JSONObject addCommerceTaxFixedRate(long commerceTaxMethodId, long cpTaxCategoryId, double rate, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceTaxMethodId", commerceTaxMethodId);
			_params.put("cpTaxCategoryId", cpTaxCategoryId);
			_params.put("rate", rate);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercetaxfixedrate/add-commerce-tax-fixed-rate", _params);
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

	public JSONObject addCommerceTaxFixedRate(long userId, long groupId, long commerceTaxMethodId, long cpTaxCategoryId, double rate) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceTaxMethodId", commerceTaxMethodId);
			_params.put("cpTaxCategoryId", cpTaxCategoryId);
			_params.put("groupId", groupId);
			_params.put("rate", rate);
			_params.put("userId", userId);

			_command.put("/commerce.commercetaxfixedrate/add-commerce-tax-fixed-rate", _params);
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

	public void deleteCommerceTaxFixedRate(long commerceTaxFixedRateId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceTaxFixedRateId", commerceTaxFixedRateId);

			_command.put("/commerce.commercetaxfixedrate/delete-commerce-tax-fixed-rate", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchCommerceTaxFixedRate(long commerceTaxFixedRateId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceTaxFixedRateId", commerceTaxFixedRateId);

			_command.put("/commerce.commercetaxfixedrate/fetch-commerce-tax-fixed-rate", _params);
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

	public JSONObject fetchCommerceTaxFixedRate(long cpTaxCategoryId, long commerceTaxMethodId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceTaxMethodId", commerceTaxMethodId);
			_params.put("cpTaxCategoryId", cpTaxCategoryId);

			_command.put("/commerce.commercetaxfixedrate/fetch-commerce-tax-fixed-rate", _params);
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

	public JSONArray getCommerceTaxFixedRates(long groupId, long commerceTaxMethodId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceTaxMethodId", commerceTaxMethodId);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.tax.engine.fixed.model.CommerceTaxFixedRate>", orderByComparator);

			_command.put("/commerce.commercetaxfixedrate/get-commerce-tax-fixed-rates", _params);
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

	public Integer getCommerceTaxFixedRatesCount(long groupId, long commerceTaxMethodId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceTaxMethodId", commerceTaxMethodId);
			_params.put("groupId", groupId);

			_command.put("/commerce.commercetaxfixedrate/get-commerce-tax-fixed-rates-count", _params);
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

	public JSONObject updateCommerceTaxFixedRate(long commerceTaxFixedRateId, double rate) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceTaxFixedRateId", commerceTaxFixedRateId);
			_params.put("rate", rate);

			_command.put("/commerce.commercetaxfixedrate/update-commerce-tax-fixed-rate", _params);
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