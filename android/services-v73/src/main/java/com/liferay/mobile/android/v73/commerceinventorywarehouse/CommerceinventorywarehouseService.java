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

package com.liferay.mobile.android.v73.commerceinventorywarehouse;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommerceinventorywarehouseService extends BaseService {

	public CommerceinventorywarehouseService(Session session) {
		super(session);
	}

	public JSONObject addCommerceInventoryWarehouse(String name, String description, boolean active, String street1, String street2, String street3, String city, String zip, String commerceRegionCode, String commerceCountryCode, double latitude, double longitude, String externalReferenceCode, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("city", checkNull(city));
			_params.put("commerceCountryCode", checkNull(commerceCountryCode));
			_params.put("commerceRegionCode", checkNull(commerceRegionCode));
			_params.put("description", checkNull(description));
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));
			_params.put("latitude", latitude);
			_params.put("longitude", longitude);
			_params.put("name", checkNull(name));
			_params.put("street1", checkNull(street1));
			_params.put("street2", checkNull(street2));
			_params.put("street3", checkNull(street3));
			_params.put("zip", checkNull(zip));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceinventorywarehouse/add-commerce-inventory-warehouse", _params);
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

	public JSONObject deleteCommerceInventoryWarehouse(long commerceInventoryWarehouseId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceInventoryWarehouseId", commerceInventoryWarehouseId);

			_command.put("/commerce.commerceinventorywarehouse/delete-commerce-inventory-warehouse", _params);
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

	public JSONObject fetchByExternalReferenceCode(long companyId, String externalReferenceCode) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));

			_command.put("/commerce.commerceinventorywarehouse/fetch-by-external-reference-code", _params);
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

	public JSONObject geolocateCommerceInventoryWarehouse(long commerceInventoryWarehouseId, double latitude, double longitude) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_params.put("latitude", latitude);
			_params.put("longitude", longitude);

			_command.put("/commerce.commerceinventorywarehouse/geolocate-commerce-inventory-warehouse", _params);
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

	public JSONObject getCommerceInventoryWarehouse(long commerceInventoryWarehouseId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceInventoryWarehouseId", commerceInventoryWarehouseId);

			_command.put("/commerce.commerceinventorywarehouse/get-commerce-inventory-warehouse", _params);
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

	public JSONArray getCommerceInventoryWarehouses(long companyId, boolean active, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.inventory.model.CommerceInventoryWarehouse>", orderByComparator);

			_command.put("/commerce.commerceinventorywarehouse/get-commerce-inventory-warehouses", _params);
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

	public JSONArray getCommerceInventoryWarehouses(long companyId, boolean active, String commerceCountryCode, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("commerceCountryCode", checkNull(commerceCountryCode));
			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.inventory.model.CommerceInventoryWarehouse>", orderByComparator);

			_command.put("/commerce.commerceinventorywarehouse/get-commerce-inventory-warehouses", _params);
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

	public JSONArray getCommerceInventoryWarehouses(long companyId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.inventory.model.CommerceInventoryWarehouse>", orderByComparator);

			_command.put("/commerce.commerceinventorywarehouse/get-commerce-inventory-warehouses", _params);
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

	public JSONArray getCommerceInventoryWarehouses(long companyId, long groupId, boolean active) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("companyId", companyId);
			_params.put("groupId", groupId);

			_command.put("/commerce.commerceinventorywarehouse/get-commerce-inventory-warehouses", _params);
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

	public Integer getCommerceInventoryWarehousesCount(long companyId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);

			_command.put("/commerce.commerceinventorywarehouse/get-commerce-inventory-warehouses-count", _params);
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

	public Integer getCommerceInventoryWarehousesCount(long companyId, boolean active, String commerceCountryCode) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("commerceCountryCode", checkNull(commerceCountryCode));
			_params.put("companyId", companyId);

			_command.put("/commerce.commerceinventorywarehouse/get-commerce-inventory-warehouses-count", _params);
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

	public JSONArray searchCommerceInventoryWarehouses(long companyId, boolean active, String commerceCountryCode, String keywords, int start, int end, JSONObjectWrapper sort) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("commerceCountryCode", checkNull(commerceCountryCode));
			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);
			mangleWrapper(_params, "sort", "com.liferay.portal.kernel.search.Sort", sort);

			_command.put("/commerce.commerceinventorywarehouse/search-commerce-inventory-warehouses", _params);
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

	public Integer searchCommerceInventoryWarehousesCount(long companyId, boolean active, String commerceCountryCode, String keywords) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("commerceCountryCode", checkNull(commerceCountryCode));
			_params.put("companyId", companyId);
			_params.put("keywords", checkNull(keywords));

			_command.put("/commerce.commerceinventorywarehouse/search-commerce-inventory-warehouses-count", _params);
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

	public JSONObject setActive(long commerceInventoryWarehouseId, boolean active) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("commerceInventoryWarehouseId", commerceInventoryWarehouseId);

			_command.put("/commerce.commerceinventorywarehouse/set-active", _params);
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

	public JSONObject updateCommerceInventoryWarehouse(long commerceInventoryWarehouseId, String name, String description, boolean active, String street1, String street2, String street3, String city, String zip, String commerceRegionCode, String commerceCountryCode, double latitude, double longitude, long mvccVersion, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("city", checkNull(city));
			_params.put("commerceCountryCode", checkNull(commerceCountryCode));
			_params.put("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_params.put("commerceRegionCode", checkNull(commerceRegionCode));
			_params.put("description", checkNull(description));
			_params.put("latitude", latitude);
			_params.put("longitude", longitude);
			_params.put("mvccVersion", mvccVersion);
			_params.put("name", checkNull(name));
			_params.put("street1", checkNull(street1));
			_params.put("street2", checkNull(street2));
			_params.put("street3", checkNull(street3));
			_params.put("zip", checkNull(zip));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceinventorywarehouse/update-commerce-inventory-warehouse", _params);
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