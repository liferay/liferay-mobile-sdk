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

package com.liferay.mobile.android.v73.commerceshippingfixedoption;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommerceshippingfixedoptionService extends BaseService {

	public CommerceshippingfixedoptionService(Session session) {
		super(session);
	}

	public JSONObject addCommerceShippingFixedOption(long commerceShippingMethodId, JSONObject nameMap, JSONObject descriptionMap, JSONObject amount, double priority, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("amount", checkNull(amount));
			_params.put("commerceShippingMethodId", commerceShippingMethodId);
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("nameMap", checkNull(nameMap));
			_params.put("priority", priority);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceshippingfixedoption/add-commerce-shipping-fixed-option", _params);
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

	public JSONObject addCommerceShippingFixedOption(long userId, long groupId, long commerceShippingMethodId, JSONObject nameMap, JSONObject descriptionMap, JSONObject amount, double priority) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("amount", checkNull(amount));
			_params.put("commerceShippingMethodId", commerceShippingMethodId);
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("groupId", groupId);
			_params.put("nameMap", checkNull(nameMap));
			_params.put("priority", priority);
			_params.put("userId", userId);

			_command.put("/commerce.commerceshippingfixedoption/add-commerce-shipping-fixed-option", _params);
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

	public void deleteCommerceShippingFixedOption(long commerceShippingFixedOptionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceShippingFixedOptionId", commerceShippingFixedOptionId);

			_command.put("/commerce.commerceshippingfixedoption/delete-commerce-shipping-fixed-option", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchCommerceShippingFixedOption(long commerceShippingFixedOptionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceShippingFixedOptionId", commerceShippingFixedOptionId);

			_command.put("/commerce.commerceshippingfixedoption/fetch-commerce-shipping-fixed-option", _params);
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

	public JSONArray getCommerceShippingFixedOptions(long commerceShippingMethodId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceShippingMethodId", commerceShippingMethodId);
			_params.put("end", end);
			_params.put("start", start);

			_command.put("/commerce.commerceshippingfixedoption/get-commerce-shipping-fixed-options", _params);
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

	public JSONArray getCommerceShippingFixedOptions(long commerceShippingMethodId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceShippingMethodId", commerceShippingMethodId);
			_params.put("end", end);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.shipping.engine.fixed.model.CommerceShippingFixedOption>", orderByComparator);

			_command.put("/commerce.commerceshippingfixedoption/get-commerce-shipping-fixed-options", _params);
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

	public JSONArray getCommerceShippingFixedOptions(long companyId, long groupId, long commerceShippingMethodId, String keywords, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceShippingMethodId", commerceShippingMethodId);
			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);

			_command.put("/commerce.commerceshippingfixedoption/get-commerce-shipping-fixed-options", _params);
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

	public Integer getCommerceShippingFixedOptionsCount(long commerceShippingMethodId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceShippingMethodId", commerceShippingMethodId);

			_command.put("/commerce.commerceshippingfixedoption/get-commerce-shipping-fixed-options-count", _params);
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

	public JSONObject updateCommerceShippingFixedOption(long commerceShippingFixedOptionId, JSONObject nameMap, JSONObject descriptionMap, JSONObject amount, double priority) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("amount", checkNull(amount));
			_params.put("commerceShippingFixedOptionId", commerceShippingFixedOptionId);
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("nameMap", checkNull(nameMap));
			_params.put("priority", priority);

			_command.put("/commerce.commerceshippingfixedoption/update-commerce-shipping-fixed-option", _params);
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