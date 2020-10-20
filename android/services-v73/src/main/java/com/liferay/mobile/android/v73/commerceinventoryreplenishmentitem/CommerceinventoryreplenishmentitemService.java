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

package com.liferay.mobile.android.v73.commerceinventoryreplenishmentitem;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommerceinventoryreplenishmentitemService extends BaseService {

	public CommerceinventoryreplenishmentitemService(Session session) {
		super(session);
	}

	public JSONObject addCommerceInventoryReplenishmentItem(long userId, long commerceInventoryWarehouseId, String sku, long availabilityDate, int quantity) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("availabilityDate", availabilityDate);
			_params.put("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_params.put("quantity", quantity);
			_params.put("sku", checkNull(sku));
			_params.put("userId", userId);

			_command.put("/commerce.commerceinventoryreplenishmentitem/add-commerce-inventory-replenishment-item", _params);
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

	public void deleteCommerceInventoryReplenishmentItem(long commerceInventoryReplenishmentItemId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceInventoryReplenishmentItemId", commerceInventoryReplenishmentItemId);

			_command.put("/commerce.commerceinventoryreplenishmentitem/delete-commerce-inventory-replenishment-item", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject getCommerceInventoryReplenishmentItem(long commerceInventoryReplenishmentItemId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceInventoryReplenishmentItemId", commerceInventoryReplenishmentItemId);

			_command.put("/commerce.commerceinventoryreplenishmentitem/get-commerce-inventory-replenishment-item", _params);
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

	public JSONArray getCommerceInventoryReplenishmentItemsByCompanyIdAndSku(long companyId, String sku, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("sku", checkNull(sku));
			_params.put("start", start);

			_command.put("/commerce.commerceinventoryreplenishmentitem/get-commerce-inventory-replenishment-items-by-company-id-and-sku", _params);
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

	public Long getCommerceInventoryReplenishmentItemsCount(long commerceInventoryWarehouseId, String sku) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_params.put("sku", checkNull(sku));

			_command.put("/commerce.commerceinventoryreplenishmentitem/get-commerce-inventory-replenishment-items-count", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getLong(0);
	}

	public Integer getCommerceInventoryReplenishmentItemsCountByCompanyIdAndSku(long companyId, String sku) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("sku", checkNull(sku));

			_command.put("/commerce.commerceinventoryreplenishmentitem/get-commerce-inventory-replenishment-items-count-by-company-id-and-sku", _params);
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

	public JSONObject updateCommerceInventoryReplenishmentItem(long commerceInventoryReplenishmentItemId, long availabilityDate, int quantity, long mvccVersion) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("availabilityDate", availabilityDate);
			_params.put("commerceInventoryReplenishmentItemId", commerceInventoryReplenishmentItemId);
			_params.put("mvccVersion", mvccVersion);
			_params.put("quantity", quantity);

			_command.put("/commerce.commerceinventoryreplenishmentitem/update-commerce-inventory-replenishment-item", _params);
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