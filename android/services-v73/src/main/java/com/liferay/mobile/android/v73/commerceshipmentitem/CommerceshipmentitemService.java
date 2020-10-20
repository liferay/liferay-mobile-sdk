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

package com.liferay.mobile.android.v73.commerceshipmentitem;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommerceshipmentitemService extends BaseService {

	public CommerceshipmentitemService(Session session) {
		super(session);
	}

	public JSONObject addCommerceShipmentItem(long commerceShipmentId, long commerceOrderItemId, long commerceInventoryWarehouseId, int quantity, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_params.put("commerceOrderItemId", commerceOrderItemId);
			_params.put("commerceShipmentId", commerceShipmentId);
			_params.put("quantity", quantity);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceshipmentitem/add-commerce-shipment-item", _params);
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

	public void deleteCommerceShipmentItem(long commerceShipmentItemId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceShipmentItemId", commerceShipmentItemId);

			_command.put("/commerce.commerceshipmentitem/delete-commerce-shipment-item", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void deleteCommerceShipmentItem(long commerceShipmentItemId, boolean restoreStockQuantity) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceShipmentItemId", commerceShipmentItemId);
			_params.put("restoreStockQuantity", restoreStockQuantity);

			_command.put("/commerce.commerceshipmentitem/delete-commerce-shipment-item", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchCommerceShipmentItem(long commerceShipmentId, long commerceOrderItemId, long commerceInventoryWarehouseId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_params.put("commerceOrderItemId", commerceOrderItemId);
			_params.put("commerceShipmentId", commerceShipmentId);

			_command.put("/commerce.commerceshipmentitem/fetch-commerce-shipment-item", _params);
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

	public JSONObject getCommerceShipmentItem(long commerceShipmentItemId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceShipmentItemId", commerceShipmentItemId);

			_command.put("/commerce.commerceshipmentitem/get-commerce-shipment-item", _params);
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

	public JSONArray getCommerceShipmentItems(long commerceOrderItemId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderItemId", commerceOrderItemId);

			_command.put("/commerce.commerceshipmentitem/get-commerce-shipment-items", _params);
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

	public JSONArray getCommerceShipmentItems(long commerceShipmentId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceShipmentId", commerceShipmentId);
			_params.put("end", end);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceShipmentItem>", orderByComparator);

			_command.put("/commerce.commerceshipmentitem/get-commerce-shipment-items", _params);
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

	public JSONArray getCommerceShipmentItemsByCommerceOrderItemId(long commerceOrderItemId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderItemId", commerceOrderItemId);

			_command.put("/commerce.commerceshipmentitem/get-commerce-shipment-items-by-commerce-order-item-id", _params);
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

	public Integer getCommerceShipmentItemsCount(long commerceShipmentId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceShipmentId", commerceShipmentId);

			_command.put("/commerce.commerceshipmentitem/get-commerce-shipment-items-count", _params);
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

	public Integer getCommerceShipmentItemsCountByCommerceOrderItemId(long commerceOrderItemId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderItemId", commerceOrderItemId);

			_command.put("/commerce.commerceshipmentitem/get-commerce-shipment-items-count-by-commerce-order-item-id", _params);
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

	public Integer getCommerceShipmentOrderItemsQuantity(long commerceShipmentId, long commerceOrderItemId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderItemId", commerceOrderItemId);
			_params.put("commerceShipmentId", commerceShipmentId);

			_command.put("/commerce.commerceshipmentitem/get-commerce-shipment-order-items-quantity", _params);
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

	public JSONObject updateCommerceShipmentItem(long commerceShipmentItemId, int quantity) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceShipmentItemId", commerceShipmentItemId);
			_params.put("quantity", quantity);

			_command.put("/commerce.commerceshipmentitem/update-commerce-shipment-item", _params);
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

	public JSONObject updateCommerceShipmentItem(long commerceShipmentItemId, long commerceInventoryWarehouseId, int quantity) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_params.put("commerceShipmentItemId", commerceShipmentItemId);
			_params.put("quantity", quantity);

			_command.put("/commerce.commerceshipmentitem/update-commerce-shipment-item", _params);
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