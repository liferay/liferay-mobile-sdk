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

package com.liferay.mobile.android.v73.commerceshipment;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommerceshipmentService extends BaseService {

	public CommerceshipmentService(Session session) {
		super(session);
	}

	public JSONObject addCommerceShipment(long commerceOrderId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceshipment/add-commerce-shipment", _params);
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

	public JSONObject addCommerceShipment(long groupId, long commerceAccountId, long commerceAddressId, long commerceShippingMethodId, String commerceShippingOptionName, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);
			_params.put("commerceAddressId", commerceAddressId);
			_params.put("commerceShippingMethodId", commerceShippingMethodId);
			_params.put("commerceShippingOptionName", checkNull(commerceShippingOptionName));
			_params.put("groupId", groupId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceshipment/add-commerce-shipment", _params);
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

	public void deleteCommerceShipment(long commerceShipmentId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceShipmentId", commerceShipmentId);

			_command.put("/commerce.commerceshipment/delete-commerce-shipment", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void deleteCommerceShipment(long commerceShipmentId, boolean restoreStockQuantity) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceShipmentId", commerceShipmentId);
			_params.put("restoreStockQuantity", restoreStockQuantity);

			_command.put("/commerce.commerceshipment/delete-commerce-shipment", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject getCommerceShipment(long commerceShipmentId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceShipmentId", commerceShipmentId);

			_command.put("/commerce.commerceshipment/get-commerce-shipment", _params);
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

	public JSONArray getCommerceShipments(long companyId, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceShipment>", orderByComparator);

			_command.put("/commerce.commerceshipment/get-commerce-shipments", _params);
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

	public JSONArray getCommerceShipments(long companyId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceShipment>", orderByComparator);

			_command.put("/commerce.commerceshipment/get-commerce-shipments", _params);
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

	public JSONArray getCommerceShipments(long companyId, JSONArray groupIds, JSONArray commerceAccountIds, String keywords, JSONArray shipmentStatuses, boolean excludeShipmentStatus, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountIds", checkNull(commerceAccountIds));
			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("excludeShipmentStatus", excludeShipmentStatus);
			_params.put("groupIds", checkNull(groupIds));
			_params.put("keywords", checkNull(keywords));
			_params.put("shipmentStatuses", checkNull(shipmentStatuses));
			_params.put("start", start);

			_command.put("/commerce.commerceshipment/get-commerce-shipments", _params);
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

	public JSONArray getCommerceShipments(long companyId, long commerceAddressId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAddressId", commerceAddressId);
			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceShipment>", orderByComparator);

			_command.put("/commerce.commerceshipment/get-commerce-shipments", _params);
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

	public JSONArray getCommerceShipmentsByOrderId(long commerceOrderId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);
			_params.put("end", end);
			_params.put("start", start);

			_command.put("/commerce.commerceshipment/get-commerce-shipments-by-order-id", _params);
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

	public Integer getCommerceShipmentsCount(long companyId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);

			_command.put("/commerce.commerceshipment/get-commerce-shipments-count", _params);
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

	public Integer getCommerceShipmentsCount(long companyId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("status", status);

			_command.put("/commerce.commerceshipment/get-commerce-shipments-count", _params);
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

	public Integer getCommerceShipmentsCount(long companyId, JSONArray groupIds, JSONArray commerceAccountIds, String keywords, JSONArray shipmentStatuses, boolean excludeShipmentStatus) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountIds", checkNull(commerceAccountIds));
			_params.put("companyId", companyId);
			_params.put("excludeShipmentStatus", excludeShipmentStatus);
			_params.put("groupIds", checkNull(groupIds));
			_params.put("keywords", checkNull(keywords));
			_params.put("shipmentStatuses", checkNull(shipmentStatuses));

			_command.put("/commerce.commerceshipment/get-commerce-shipments-count", _params);
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

	public Integer getCommerceShipmentsCount(long companyId, long commerceAddressId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAddressId", commerceAddressId);
			_params.put("companyId", companyId);

			_command.put("/commerce.commerceshipment/get-commerce-shipments-count", _params);
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

	public Integer getCommerceShipmentsCountByOrderId(long commerceOrderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);

			_command.put("/commerce.commerceshipment/get-commerce-shipments-count-by-order-id", _params);
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

	public JSONObject updateAddress(long commerceShipmentId, String name, String description, String street1, String street2, String street3, String city, String zip, long commerceRegionId, long commerceCountryId, String phoneNumber) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("city", checkNull(city));
			_params.put("commerceCountryId", commerceCountryId);
			_params.put("commerceRegionId", commerceRegionId);
			_params.put("commerceShipmentId", commerceShipmentId);
			_params.put("description", checkNull(description));
			_params.put("name", checkNull(name));
			_params.put("phoneNumber", checkNull(phoneNumber));
			_params.put("street1", checkNull(street1));
			_params.put("street2", checkNull(street2));
			_params.put("street3", checkNull(street3));
			_params.put("zip", checkNull(zip));

			_command.put("/commerce.commerceshipment/update-address", _params);
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

	public JSONObject updateCarrierDetails(long commerceShipmentId, String carrier, String trackingNumber) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("carrier", checkNull(carrier));
			_params.put("commerceShipmentId", commerceShipmentId);
			_params.put("trackingNumber", checkNull(trackingNumber));

			_command.put("/commerce.commerceshipment/update-carrier-details", _params);
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

	public JSONObject updateCommerceShipment(long commerceShipmentId, String carrier, String trackingNumber, int status, int shippingDateMonth, int shippingDateDay, int shippingDateYear, int shippingDateHour, int shippingDateMinute, int expectedDateMonth, int expectedDateDay, int expectedDateYear, int expectedDateHour, int expectedDateMinute) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("carrier", checkNull(carrier));
			_params.put("commerceShipmentId", commerceShipmentId);
			_params.put("expectedDateDay", expectedDateDay);
			_params.put("expectedDateHour", expectedDateHour);
			_params.put("expectedDateMinute", expectedDateMinute);
			_params.put("expectedDateMonth", expectedDateMonth);
			_params.put("expectedDateYear", expectedDateYear);
			_params.put("shippingDateDay", shippingDateDay);
			_params.put("shippingDateHour", shippingDateHour);
			_params.put("shippingDateMinute", shippingDateMinute);
			_params.put("shippingDateMonth", shippingDateMonth);
			_params.put("shippingDateYear", shippingDateYear);
			_params.put("status", status);
			_params.put("trackingNumber", checkNull(trackingNumber));

			_command.put("/commerce.commerceshipment/update-commerce-shipment", _params);
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

	public JSONObject updateCommerceShipment(long commerceShipmentId, String name, String description, String street1, String street2, String street3, String city, String zip, long commerceRegionId, long commerceCountryId, String phoneNumber, String carrier, String trackingNumber, int status, int shippingDateMonth, int shippingDateDay, int shippingDateYear, int shippingDateHour, int shippingDateMinute, int expectedDateMonth, int expectedDateDay, int expectedDateYear, int expectedDateHour, int expectedDateMinute) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("carrier", checkNull(carrier));
			_params.put("city", checkNull(city));
			_params.put("commerceCountryId", commerceCountryId);
			_params.put("commerceRegionId", commerceRegionId);
			_params.put("commerceShipmentId", commerceShipmentId);
			_params.put("description", checkNull(description));
			_params.put("expectedDateDay", expectedDateDay);
			_params.put("expectedDateHour", expectedDateHour);
			_params.put("expectedDateMinute", expectedDateMinute);
			_params.put("expectedDateMonth", expectedDateMonth);
			_params.put("expectedDateYear", expectedDateYear);
			_params.put("name", checkNull(name));
			_params.put("phoneNumber", checkNull(phoneNumber));
			_params.put("shippingDateDay", shippingDateDay);
			_params.put("shippingDateHour", shippingDateHour);
			_params.put("shippingDateMinute", shippingDateMinute);
			_params.put("shippingDateMonth", shippingDateMonth);
			_params.put("shippingDateYear", shippingDateYear);
			_params.put("status", status);
			_params.put("street1", checkNull(street1));
			_params.put("street2", checkNull(street2));
			_params.put("street3", checkNull(street3));
			_params.put("trackingNumber", checkNull(trackingNumber));
			_params.put("zip", checkNull(zip));

			_command.put("/commerce.commerceshipment/update-commerce-shipment", _params);
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

	public JSONObject updateExpectedDate(long commerceShipmentId, int expectedDateMonth, int expectedDateDay, int expectedDateYear, int expectedDateHour, int expectedDateMinute) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceShipmentId", commerceShipmentId);
			_params.put("expectedDateDay", expectedDateDay);
			_params.put("expectedDateHour", expectedDateHour);
			_params.put("expectedDateMinute", expectedDateMinute);
			_params.put("expectedDateMonth", expectedDateMonth);
			_params.put("expectedDateYear", expectedDateYear);

			_command.put("/commerce.commerceshipment/update-expected-date", _params);
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

	public JSONObject updateShippingDate(long commerceShipmentId, int shippingDateMonth, int shippingDateDay, int shippingDateYear, int shippingDateHour, int shippingDateMinute) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceShipmentId", commerceShipmentId);
			_params.put("shippingDateDay", shippingDateDay);
			_params.put("shippingDateHour", shippingDateHour);
			_params.put("shippingDateMinute", shippingDateMinute);
			_params.put("shippingDateMonth", shippingDateMonth);
			_params.put("shippingDateYear", shippingDateYear);

			_command.put("/commerce.commerceshipment/update-shipping-date", _params);
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

	public JSONObject updateStatus(long commerceShipmentId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceShipmentId", commerceShipmentId);
			_params.put("status", status);

			_command.put("/commerce.commerceshipment/update-status", _params);
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