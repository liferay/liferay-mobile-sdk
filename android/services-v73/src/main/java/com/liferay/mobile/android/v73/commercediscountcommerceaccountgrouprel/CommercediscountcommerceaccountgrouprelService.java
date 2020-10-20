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

package com.liferay.mobile.android.v73.commercediscountcommerceaccountgrouprel;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommercediscountcommerceaccountgrouprelService extends BaseService {

	public CommercediscountcommerceaccountgrouprelService(Session session) {
		super(session);
	}

	public JSONObject addCommerceDiscountCommerceAccountGroupRel(long commerceDiscountId, long commerceAccountGroupId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountGroupId", commerceAccountGroupId);
			_params.put("commerceDiscountId", commerceDiscountId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercediscountcommerceaccountgrouprel/add-commerce-discount-commerce-account-group-rel", _params);
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

	public void deleteCommerceDiscountCommerceAccountGroupRel(long commerceDiscountCommerceAccountGroupRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceDiscountCommerceAccountGroupRelId", commerceDiscountCommerceAccountGroupRelId);

			_command.put("/commerce.commercediscountcommerceaccountgrouprel/delete-commerce-discount-commerce-account-group-rel", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void deleteCommerceDiscountCommerceAccountGroupRelsByCommerceDiscountId(long commerceDiscountId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceDiscountId", commerceDiscountId);

			_command.put("/commerce.commercediscountcommerceaccountgrouprel/delete-commerce-discount-commerce-account-group-rels-by-commerce-discount-id", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchCommerceDiscountCommerceAccountGroupRel(long commerceDiscountId, long commerceAccountGroupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountGroupId", commerceAccountGroupId);
			_params.put("commerceDiscountId", commerceDiscountId);

			_command.put("/commerce.commercediscountcommerceaccountgrouprel/fetch-commerce-discount-commerce-account-group-rel", _params);
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

	public JSONObject getCommerceDiscountCommerceAccountGroupRel(long commerceDiscountCommerceAccountGroupRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceDiscountCommerceAccountGroupRelId", commerceDiscountCommerceAccountGroupRelId);

			_command.put("/commerce.commercediscountcommerceaccountgrouprel/get-commerce-discount-commerce-account-group-rel", _params);
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

	public JSONArray getCommerceDiscountCommerceAccountGroupRels(long commerceDiscountId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceDiscountId", commerceDiscountId);
			_params.put("end", end);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.discount.model.CommerceDiscountCommerceAccountGroupRel>", orderByComparator);

			_command.put("/commerce.commercediscountcommerceaccountgrouprel/get-commerce-discount-commerce-account-group-rels", _params);
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

	public JSONArray getCommerceDiscountCommerceAccountGroupRels(long commerceDiscountId, String name, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceDiscountId", commerceDiscountId);
			_params.put("end", end);
			_params.put("name", checkNull(name));
			_params.put("start", start);

			_command.put("/commerce.commercediscountcommerceaccountgrouprel/get-commerce-discount-commerce-account-group-rels", _params);
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

	public Integer getCommerceDiscountCommerceAccountGroupRelsCount(long commerceDiscountId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceDiscountId", commerceDiscountId);

			_command.put("/commerce.commercediscountcommerceaccountgrouprel/get-commerce-discount-commerce-account-group-rels-count", _params);
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

	public Integer getCommerceDiscountCommerceAccountGroupRelsCount(long commerceDiscountId, String name) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceDiscountId", commerceDiscountId);
			_params.put("name", checkNull(name));

			_command.put("/commerce.commercediscountcommerceaccountgrouprel/get-commerce-discount-commerce-account-group-rels-count", _params);
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