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

package com.liferay.mobile.android.v73.commercepricelistdiscountrel;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommercepricelistdiscountrelService extends BaseService {

	public CommercepricelistdiscountrelService(Session session) {
		super(session);
	}

	public JSONObject addCommercePriceListDiscountRel(long commercePriceListId, long commerceDiscountId, int order, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceDiscountId", commerceDiscountId);
			_params.put("commercePriceListId", commercePriceListId);
			_params.put("order", order);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepricelistdiscountrel/add-commerce-price-list-discount-rel", _params);
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

	public void deleteCommercePriceListDiscountRel(long commercePriceListDiscountRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceListDiscountRelId", commercePriceListDiscountRelId);

			_command.put("/commerce.commercepricelistdiscountrel/delete-commerce-price-list-discount-rel", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchCommercePriceListDiscountRel(long commercePriceListId, long commerceDiscountId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceDiscountId", commerceDiscountId);
			_params.put("commercePriceListId", commercePriceListId);

			_command.put("/commerce.commercepricelistdiscountrel/fetch-commerce-price-list-discount-rel", _params);
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

	public JSONObject getCommercePriceListDiscountRel(long commercePriceListDiscountRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceListDiscountRelId", commercePriceListDiscountRelId);

			_command.put("/commerce.commercepricelistdiscountrel/get-commerce-price-list-discount-rel", _params);
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

	public JSONArray getCommercePriceListDiscountRels(long commercePriceListId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceListId", commercePriceListId);

			_command.put("/commerce.commercepricelistdiscountrel/get-commerce-price-list-discount-rels", _params);
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

	public JSONArray getCommercePriceListDiscountRels(long commercePriceListId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceListId", commercePriceListId);
			_params.put("end", end);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.price.list.model.CommercePriceListDiscountRel>", orderByComparator);

			_command.put("/commerce.commercepricelistdiscountrel/get-commerce-price-list-discount-rels", _params);
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

	public Integer getCommercePriceListDiscountRelsCount(long commercePriceListId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceListId", commercePriceListId);

			_command.put("/commerce.commercepricelistdiscountrel/get-commerce-price-list-discount-rels-count", _params);
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