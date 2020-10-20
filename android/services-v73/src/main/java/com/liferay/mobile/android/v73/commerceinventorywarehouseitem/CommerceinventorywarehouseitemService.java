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

package com.liferay.mobile.android.v73.commerceinventorywarehouseitem;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommerceinventorywarehouseitemService extends BaseService {

	public CommerceinventorywarehouseitemService(Session session) {
		super(session);
	}

	public JSONObject addCommerceInventoryWarehouseItem(long userId, long commerceInventoryWarehouseId, String sku, int quantity) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_params.put("quantity", quantity);
			_params.put("sku", checkNull(sku));
			_params.put("userId", userId);

			_command.put("/commerce.commerceinventorywarehouseitem/add-commerce-inventory-warehouse-item", _params);
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

	public JSONObject addCommerceInventoryWarehouseItem(long userId, long commerceInventoryWarehouseId, String externalReferenceCode, String sku, int quantity) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));
			_params.put("quantity", quantity);
			_params.put("sku", checkNull(sku));
			_params.put("userId", userId);

			_command.put("/commerce.commerceinventorywarehouseitem/add-commerce-inventory-warehouse-item", _params);
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

	public void deleteCommerceInventoryWarehouseItem(long commerceInventoryWarehouseItemId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceInventoryWarehouseItemId", commerceInventoryWarehouseItemId);

			_command.put("/commerce.commerceinventorywarehouseitem/delete-commerce-inventory-warehouse-item", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void deleteCommerceInventoryWarehouseItems(long companyId, String sku) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("sku", checkNull(sku));

			_command.put("/commerce.commerceinventorywarehouseitem/delete-commerce-inventory-warehouse-items", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchCommerceInventoryWarehouseItem(long commerceInventoryWarehouseId, String sku) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_params.put("sku", checkNull(sku));

			_command.put("/commerce.commerceinventorywarehouseitem/fetch-commerce-inventory-warehouse-item", _params);
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

	public JSONObject fetchCommerceInventoryWarehouseItemByReferenceCode(long companyId, String externalReferenceCode) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));

			_command.put("/commerce.commerceinventorywarehouseitem/fetch-commerce-inventory-warehouse-item-by-reference-code", _params);
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

	public JSONObject getCommerceInventoryWarehouseItem(long commerceInventoryWarehouseItemId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceInventoryWarehouseItemId", commerceInventoryWarehouseItemId);

			_command.put("/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-item", _params);
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

	public JSONObject getCommerceInventoryWarehouseItemByReferenceCode(long companyId, String externalReferenceCode) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));

			_command.put("/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-item-by-reference-code", _params);
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

	public JSONArray getCommerceInventoryWarehouseItems(long commerceInventoryWarehouseId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_params.put("end", end);
			_params.put("start", start);

			_command.put("/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items", _params);
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

	public JSONArray getCommerceInventoryWarehouseItems(long companyId, String sku, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("sku", checkNull(sku));
			_params.put("start", start);

			_command.put("/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items", _params);
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

	public JSONArray getCommerceInventoryWarehouseItemsByCompanyId(long companyId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("start", start);

			_command.put("/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items-by-company-id", _params);
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

	public JSONArray getCommerceInventoryWarehouseItemsByCompanyIdAndSku(long companyId, String sku, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("sku", checkNull(sku));
			_params.put("start", start);

			_command.put("/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items-by-company-id-and-sku", _params);
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

	public Integer getCommerceInventoryWarehouseItemsCount(long commerceInventoryWarehouseId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceInventoryWarehouseId", commerceInventoryWarehouseId);

			_command.put("/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items-count", _params);
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

	public Integer getCommerceInventoryWarehouseItemsCount(long companyId, String sku) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("sku", checkNull(sku));

			_command.put("/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items-count", _params);
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

	public Integer getCommerceInventoryWarehouseItemsCountByCompanyId(long companyId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);

			_command.put("/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items-count-by-company-id", _params);
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

	public Integer getCommerceInventoryWarehouseItemsCountByModifiedDate(long companyId, long startDate, long endDate) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("endDate", endDate);
			_params.put("startDate", startDate);

			_command.put("/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items-count-by-modified-date", _params);
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

	public JSONArray getCommerceInventoryWarehouseItemsCountByModifiedDate(long companyId, long startDate, long endDate, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("endDate", endDate);
			_params.put("start", start);
			_params.put("startDate", startDate);

			_command.put("/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items-count-by-modified-date", _params);
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

	public JSONObject increaseCommerceInventoryWarehouseItemQuantity(long commerceInventoryWarehouseItemId, int quantity) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceInventoryWarehouseItemId", commerceInventoryWarehouseItemId);
			_params.put("quantity", quantity);

			_command.put("/commerce.commerceinventorywarehouseitem/increase-commerce-inventory-warehouse-item-quantity", _params);
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

	public void moveQuantitiesBetweenWarehouses(long fromCommerceInventoryWarehouseId, long toCommerceInventoryWarehouseId, String sku, int quantity) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fromCommerceInventoryWarehouseId", fromCommerceInventoryWarehouseId);
			_params.put("quantity", quantity);
			_params.put("sku", checkNull(sku));
			_params.put("toCommerceInventoryWarehouseId", toCommerceInventoryWarehouseId);

			_command.put("/commerce.commerceinventorywarehouseitem/move-quantities-between-warehouses", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject updateCommerceInventoryWarehouseItem(long commerceInventoryWarehouseItemId, int quantity, int reservedQuantity, long mvccVersion) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceInventoryWarehouseItemId", commerceInventoryWarehouseItemId);
			_params.put("mvccVersion", mvccVersion);
			_params.put("quantity", quantity);
			_params.put("reservedQuantity", reservedQuantity);

			_command.put("/commerce.commerceinventorywarehouseitem/update-commerce-inventory-warehouse-item", _params);
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

	public JSONObject updateCommerceInventoryWarehouseItem(long commerceInventoryWarehouseItemId, int quantity, long mvccVersion) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceInventoryWarehouseItemId", commerceInventoryWarehouseItemId);
			_params.put("mvccVersion", mvccVersion);
			_params.put("quantity", quantity);

			_command.put("/commerce.commerceinventorywarehouseitem/update-commerce-inventory-warehouse-item", _params);
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

	public JSONObject upsertCommerceInventoryWarehouseItem(long companyId, long userId, long commerceInventoryWarehouseId, String externalReferenceCode, String sku, int quantity) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_params.put("companyId", companyId);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));
			_params.put("quantity", quantity);
			_params.put("sku", checkNull(sku));
			_params.put("userId", userId);

			_command.put("/commerce.commerceinventorywarehouseitem/upsert-commerce-inventory-warehouse-item", _params);
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

	public JSONObject upsertCommerceInventoryWarehouseItem(long userId, long commerceInventoryWarehouseId, String sku, int quantity) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_params.put("quantity", quantity);
			_params.put("sku", checkNull(sku));
			_params.put("userId", userId);

			_command.put("/commerce.commerceinventorywarehouseitem/upsert-commerce-inventory-warehouse-item", _params);
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