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

package com.liferay.mobile.android.v73.commercediscountrule;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommercediscountruleService extends BaseService {

	public CommercediscountruleService(Session session) {
		super(session);
	}

	public JSONObject addCommerceDiscountRule(long commerceDiscountId, String type, String typeSettings, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceDiscountId", commerceDiscountId);
			_params.put("type", checkNull(type));
			_params.put("typeSettings", checkNull(typeSettings));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercediscountrule/add-commerce-discount-rule", _params);
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

	public JSONObject addCommerceDiscountRule(long commerceDiscountId, String name, String type, String typeSettings, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceDiscountId", commerceDiscountId);
			_params.put("name", checkNull(name));
			_params.put("type", checkNull(type));
			_params.put("typeSettings", checkNull(typeSettings));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercediscountrule/add-commerce-discount-rule", _params);
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

	public void deleteCommerceDiscountRule(long commerceDiscountRuleId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceDiscountRuleId", commerceDiscountRuleId);

			_command.put("/commerce.commercediscountrule/delete-commerce-discount-rule", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchCommerceDiscountRule(long commerceDiscountRuleId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceDiscountRuleId", commerceDiscountRuleId);

			_command.put("/commerce.commercediscountrule/fetch-commerce-discount-rule", _params);
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

	public JSONObject getCommerceDiscountRule(long commerceDiscountRuleId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceDiscountRuleId", commerceDiscountRuleId);

			_command.put("/commerce.commercediscountrule/get-commerce-discount-rule", _params);
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

	public JSONArray getCommerceDiscountRules(long commerceDiscountId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceDiscountId", commerceDiscountId);
			_params.put("end", end);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.discount.model.CommerceDiscountRule>", orderByComparator);

			_command.put("/commerce.commercediscountrule/get-commerce-discount-rules", _params);
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

	public JSONArray getCommerceDiscountRules(long commerceDiscountId, String name, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceDiscountId", commerceDiscountId);
			_params.put("end", end);
			_params.put("name", checkNull(name));
			_params.put("start", start);

			_command.put("/commerce.commercediscountrule/get-commerce-discount-rules", _params);
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

	public Integer getCommerceDiscountRulesCount(long commerceDiscountId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceDiscountId", commerceDiscountId);

			_command.put("/commerce.commercediscountrule/get-commerce-discount-rules-count", _params);
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

	public Integer getCommerceDiscountRulesCount(long commerceDiscountId, String name) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceDiscountId", commerceDiscountId);
			_params.put("name", checkNull(name));

			_command.put("/commerce.commercediscountrule/get-commerce-discount-rules-count", _params);
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

	public JSONObject updateCommerceDiscountRule(long commerceDiscountRuleId, String type, String typeSettings) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceDiscountRuleId", commerceDiscountRuleId);
			_params.put("type", checkNull(type));
			_params.put("typeSettings", checkNull(typeSettings));

			_command.put("/commerce.commercediscountrule/update-commerce-discount-rule", _params);
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

	public JSONObject updateCommerceDiscountRule(long commerceDiscountRuleId, String name, String type, String typeSettings) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceDiscountRuleId", commerceDiscountRuleId);
			_params.put("name", checkNull(name));
			_params.put("type", checkNull(type));
			_params.put("typeSettings", checkNull(typeSettings));

			_command.put("/commerce.commercediscountrule/update-commerce-discount-rule", _params);
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