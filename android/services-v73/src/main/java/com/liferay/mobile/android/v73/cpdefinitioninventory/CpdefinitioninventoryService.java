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

package com.liferay.mobile.android.v73.cpdefinitioninventory;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CpdefinitioninventoryService extends BaseService {

	public CpdefinitioninventoryService(Session session) {
		super(session);
	}

	public JSONObject addCpDefinitionInventory(long userId, long cpDefinitionId, String cpDefinitionInventoryEngine, String lowStockActivity, boolean displayAvailability, boolean displayStockQuantity, int minStockQuantity, boolean backOrders, int minOrderQuantity, int maxOrderQuantity, String allowedOrderQuantities, int multipleOrderQuantity) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("allowedOrderQuantities", checkNull(allowedOrderQuantities));
			_params.put("backOrders", backOrders);
			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("cpDefinitionInventoryEngine", checkNull(cpDefinitionInventoryEngine));
			_params.put("displayAvailability", displayAvailability);
			_params.put("displayStockQuantity", displayStockQuantity);
			_params.put("lowStockActivity", checkNull(lowStockActivity));
			_params.put("maxOrderQuantity", maxOrderQuantity);
			_params.put("minOrderQuantity", minOrderQuantity);
			_params.put("minStockQuantity", minStockQuantity);
			_params.put("multipleOrderQuantity", multipleOrderQuantity);
			_params.put("userId", userId);

			_command.put("/commerce.cpdefinitioninventory/add-cp-definition-inventory", _params);
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

	public void deleteCpDefinitionInventory(long cpDefinitionInventoryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionInventoryId", cpDefinitionInventoryId);

			_command.put("/commerce.cpdefinitioninventory/delete-cp-definition-inventory", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchCpDefinitionInventoryByCpDefinitionId(long cpDefinitionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);

			_command.put("/commerce.cpdefinitioninventory/fetch-cp-definition-inventory-by-cp-definition-id", _params);
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

	public JSONObject updateCpDefinitionInventory(long groupId, long cpDefinitionInventoryId, String cpDefinitionInventoryEngine, String lowStockActivity, boolean displayAvailability, boolean displayStockQuantity, int minStockQuantity, boolean backOrders, int minOrderQuantity, int maxOrderQuantity, String allowedOrderQuantities, int multipleOrderQuantity) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("allowedOrderQuantities", checkNull(allowedOrderQuantities));
			_params.put("backOrders", backOrders);
			_params.put("cpDefinitionInventoryEngine", checkNull(cpDefinitionInventoryEngine));
			_params.put("cpDefinitionInventoryId", cpDefinitionInventoryId);
			_params.put("displayAvailability", displayAvailability);
			_params.put("displayStockQuantity", displayStockQuantity);
			_params.put("groupId", groupId);
			_params.put("lowStockActivity", checkNull(lowStockActivity));
			_params.put("maxOrderQuantity", maxOrderQuantity);
			_params.put("minOrderQuantity", minOrderQuantity);
			_params.put("minStockQuantity", minStockQuantity);
			_params.put("multipleOrderQuantity", multipleOrderQuantity);

			_command.put("/commerce.cpdefinitioninventory/update-cp-definition-inventory", _params);
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

	public JSONObject updateCpDefinitionInventory(long cpDefinitionInventoryId, String cpDefinitionInventoryEngine, String lowStockActivity, boolean displayAvailability, boolean displayStockQuantity, int minStockQuantity, boolean backOrders, int minOrderQuantity, int maxOrderQuantity, String allowedOrderQuantities, int multipleOrderQuantity) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("allowedOrderQuantities", checkNull(allowedOrderQuantities));
			_params.put("backOrders", backOrders);
			_params.put("cpDefinitionInventoryEngine", checkNull(cpDefinitionInventoryEngine));
			_params.put("cpDefinitionInventoryId", cpDefinitionInventoryId);
			_params.put("displayAvailability", displayAvailability);
			_params.put("displayStockQuantity", displayStockQuantity);
			_params.put("lowStockActivity", checkNull(lowStockActivity));
			_params.put("maxOrderQuantity", maxOrderQuantity);
			_params.put("minOrderQuantity", minOrderQuantity);
			_params.put("minStockQuantity", minStockQuantity);
			_params.put("multipleOrderQuantity", multipleOrderQuantity);

			_command.put("/commerce.cpdefinitioninventory/update-cp-definition-inventory", _params);
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