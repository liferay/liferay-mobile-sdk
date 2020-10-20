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

package com.liferay.mobile.android.v73.commercepricelistcommerceaccountgrouprel;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommercepricelistcommerceaccountgrouprelService extends BaseService {

	public CommercepricelistcommerceaccountgrouprelService(Session session) {
		super(session);
	}

	public JSONObject addCommercePriceListCommerceAccountGroupRel(long commercePriceListId, long commerceAccountGroupId, int order, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountGroupId", commerceAccountGroupId);
			_params.put("commercePriceListId", commercePriceListId);
			_params.put("order", order);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepricelistcommerceaccountgrouprel/add-commerce-price-list-commerce-account-group-rel", _params);
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

	public void deleteCommercePriceListAccountGroupRelsByCommercePriceListId(long commercePriceListId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceListId", commercePriceListId);

			_command.put("/commerce.commercepricelistcommerceaccountgrouprel/delete-commerce-price-list-account-group-rels-by-commerce-price-list-id", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void deleteCommercePriceListCommerceAccountGroupRel(long commercePriceListCommerceAccountGroupRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceListCommerceAccountGroupRelId", commercePriceListCommerceAccountGroupRelId);

			_command.put("/commerce.commercepricelistcommerceaccountgrouprel/delete-commerce-price-list-commerce-account-group-rel", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchCommercePriceListCommerceAccountGroupRel(long commercePriceListId, long commerceAccountGroupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountGroupId", commerceAccountGroupId);
			_params.put("commercePriceListId", commercePriceListId);

			_command.put("/commerce.commercepricelistcommerceaccountgrouprel/fetch-commerce-price-list-commerce-account-group-rel", _params);
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

	public JSONObject getCommercePriceListCommerceAccountGroupRel(long commercePriceListCommerceAccoungGroupRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceListCommerceAccoungGroupRelId", commercePriceListCommerceAccoungGroupRelId);

			_command.put("/commerce.commercepricelistcommerceaccountgrouprel/get-commerce-price-list-commerce-account-group-rel", _params);
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

	public JSONArray getCommercePriceListCommerceAccountGroupRels(long commercePriceListId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceListId", commercePriceListId);

			_command.put("/commerce.commercepricelistcommerceaccountgrouprel/get-commerce-price-list-commerce-account-group-rels", _params);
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

	public JSONArray getCommercePriceListCommerceAccountGroupRels(long commercePriceListId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceListId", commercePriceListId);
			_params.put("end", end);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.price.list.model.CommercePriceListCommerceAccountGroupRel>", orderByComparator);

			_command.put("/commerce.commercepricelistcommerceaccountgrouprel/get-commerce-price-list-commerce-account-group-rels", _params);
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

	public JSONArray getCommercePriceListCommerceAccountGroupRels(long commercePriceListId, String name, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceListId", commercePriceListId);
			_params.put("end", end);
			_params.put("name", checkNull(name));
			_params.put("start", start);

			_command.put("/commerce.commercepricelistcommerceaccountgrouprel/get-commerce-price-list-commerce-account-group-rels", _params);
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

	public Integer getCommercePriceListCommerceAccountGroupRelsCount(long commercePriceListId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceListId", commercePriceListId);

			_command.put("/commerce.commercepricelistcommerceaccountgrouprel/get-commerce-price-list-commerce-account-group-rels-count", _params);
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

	public Integer getCommercePriceListCommerceAccountGroupRelsCount(long commercePriceListId, String name) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceListId", commercePriceListId);
			_params.put("name", checkNull(name));

			_command.put("/commerce.commercepricelistcommerceaccountgrouprel/get-commerce-price-list-commerce-account-group-rels-count", _params);
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

	public JSONObject updateCommercePriceListCommerceAccountGroupRel(long commercePriceListCommerceAccountGroupRelId, int order, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceListCommerceAccountGroupRelId", commercePriceListCommerceAccountGroupRelId);
			_params.put("order", order);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepricelistcommerceaccountgrouprel/update-commerce-price-list-commerce-account-group-rel", _params);
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