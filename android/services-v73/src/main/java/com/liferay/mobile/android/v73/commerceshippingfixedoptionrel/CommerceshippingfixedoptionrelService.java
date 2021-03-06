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

package com.liferay.mobile.android.v73.commerceshippingfixedoptionrel;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommerceshippingfixedoptionrelService extends BaseService {

	public CommerceshippingfixedoptionrelService(Session session) {
		super(session);
	}

	public JSONObject addCommerceShippingFixedOptionRel(long userId, long groupId, long commerceShippingMethodId, long commerceShippingFixedOptionId, long commerceInventoryWarehouseId, long commerceCountryId, long commerceRegionId, String zip, double weightFrom, double weightTo, JSONObject fixedPrice, JSONObject rateUnitWeightPrice, double ratePercentage) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceCountryId", commerceCountryId);
			_params.put("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_params.put("commerceRegionId", commerceRegionId);
			_params.put("commerceShippingFixedOptionId", commerceShippingFixedOptionId);
			_params.put("commerceShippingMethodId", commerceShippingMethodId);
			_params.put("fixedPrice", checkNull(fixedPrice));
			_params.put("groupId", groupId);
			_params.put("ratePercentage", ratePercentage);
			_params.put("rateUnitWeightPrice", checkNull(rateUnitWeightPrice));
			_params.put("userId", userId);
			_params.put("weightFrom", weightFrom);
			_params.put("weightTo", weightTo);
			_params.put("zip", checkNull(zip));

			_command.put("/commerce.commerceshippingfixedoptionrel/add-commerce-shipping-fixed-option-rel", _params);
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

	public JSONObject addCommerceShippingFixedOptionRel(long commerceShippingMethodId, long commerceShippingFixedOptionId, long commerceInventoryWarehouseId, long commerceCountryId, long commerceRegionId, String zip, double weightFrom, double weightTo, JSONObject fixedPrice, JSONObject rateUnitWeightPrice, double ratePercentage, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceCountryId", commerceCountryId);
			_params.put("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_params.put("commerceRegionId", commerceRegionId);
			_params.put("commerceShippingFixedOptionId", commerceShippingFixedOptionId);
			_params.put("commerceShippingMethodId", commerceShippingMethodId);
			_params.put("fixedPrice", checkNull(fixedPrice));
			_params.put("ratePercentage", ratePercentage);
			_params.put("rateUnitWeightPrice", checkNull(rateUnitWeightPrice));
			_params.put("weightFrom", weightFrom);
			_params.put("weightTo", weightTo);
			_params.put("zip", checkNull(zip));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceshippingfixedoptionrel/add-commerce-shipping-fixed-option-rel", _params);
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

	public void deleteCommerceShippingFixedOptionRel(long commerceShippingFixedOptionRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceShippingFixedOptionRelId", commerceShippingFixedOptionRelId);

			_command.put("/commerce.commerceshippingfixedoptionrel/delete-commerce-shipping-fixed-option-rel", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchCommerceShippingFixedOptionRel(long commerceShippingFixedOptionRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceShippingFixedOptionRelId", commerceShippingFixedOptionRelId);

			_command.put("/commerce.commerceshippingfixedoptionrel/fetch-commerce-shipping-fixed-option-rel", _params);
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

	public JSONArray getCommerceShippingMethodFixedOptionRels(long commerceShippingMethodId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceShippingMethodId", commerceShippingMethodId);
			_params.put("end", end);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.shipping.engine.fixed.model.CommerceShippingFixedOptionRel>", orderByComparator);

			_command.put("/commerce.commerceshippingfixedoptionrel/get-commerce-shipping-method-fixed-option-rels", _params);
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

	public Integer getCommerceShippingMethodFixedOptionRelsCount(long commerceShippingMethodId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceShippingMethodId", commerceShippingMethodId);

			_command.put("/commerce.commerceshippingfixedoptionrel/get-commerce-shipping-method-fixed-option-rels-count", _params);
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

	public JSONObject updateCommerceShippingFixedOptionRel(long commerceShippingFixedOptionRelId, long commerceInventoryWarehouseId, long commerceCountryId, long commerceRegionId, String zip, double weightFrom, double weightTo, JSONObject fixedPrice, JSONObject rateUnitWeightPrice, double ratePercentage) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceCountryId", commerceCountryId);
			_params.put("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_params.put("commerceRegionId", commerceRegionId);
			_params.put("commerceShippingFixedOptionRelId", commerceShippingFixedOptionRelId);
			_params.put("fixedPrice", checkNull(fixedPrice));
			_params.put("ratePercentage", ratePercentage);
			_params.put("rateUnitWeightPrice", checkNull(rateUnitWeightPrice));
			_params.put("weightFrom", weightFrom);
			_params.put("weightTo", weightTo);
			_params.put("zip", checkNull(zip));

			_command.put("/commerce.commerceshippingfixedoptionrel/update-commerce-shipping-fixed-option-rel", _params);
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