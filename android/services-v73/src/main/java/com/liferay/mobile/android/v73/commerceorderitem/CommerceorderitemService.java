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

package com.liferay.mobile.android.v73.commerceorderitem;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommerceorderitemService extends BaseService {

	public CommerceorderitemService(Session session) {
		super(session);
	}

	public JSONObject addCommerceOrderItem(long commerceOrderId, long cpInstanceId, int quantity, int shippedQuantity, String json, JSONObjectWrapper commerceContext, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);
			_params.put("cpInstanceId", cpInstanceId);
			_params.put("json", checkNull(json));
			_params.put("quantity", quantity);
			_params.put("shippedQuantity", shippedQuantity);
			mangleWrapper(_params, "commerceContext", "com.liferay.commerce.context.CommerceContext", commerceContext);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceorderitem/add-commerce-order-item", _params);
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

	public Integer countSubscriptionCommerceOrderItems(long commerceOrderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);

			_command.put("/commerce.commerceorderitem/count-subscription-commerce-order-items", _params);
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

	public void deleteCommerceOrderItem(long commerceOrderItemId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderItemId", commerceOrderItemId);

			_command.put("/commerce.commerceorderitem/delete-commerce-order-item", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void deleteCommerceOrderItem(long commerceOrderItemId, JSONObjectWrapper commerceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderItemId", commerceOrderItemId);
			mangleWrapper(_params, "commerceContext", "com.liferay.commerce.context.CommerceContext", commerceContext);

			_command.put("/commerce.commerceorderitem/delete-commerce-order-item", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void deleteCommerceOrderItems(long commerceOrderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);

			_command.put("/commerce.commerceorderitem/delete-commerce-order-items", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchByExternalReferenceCode(long companyId, String externalReferenceCode) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));

			_command.put("/commerce.commerceorderitem/fetch-by-external-reference-code", _params);
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

	public JSONObject fetchCommerceOrderItem(long commerceOrderItemId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderItemId", commerceOrderItemId);

			_command.put("/commerce.commerceorderitem/fetch-commerce-order-item", _params);
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

	public JSONArray getAvailableForShipmentCommerceOrderItems(long commerceOrderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);

			_command.put("/commerce.commerceorderitem/get-available-for-shipment-commerce-order-items", _params);
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

	public JSONArray getChildCommerceOrderItems(long parentCommerceOrderItemId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("parentCommerceOrderItemId", parentCommerceOrderItemId);

			_command.put("/commerce.commerceorderitem/get-child-commerce-order-items", _params);
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

	public Integer getCommerceInventoryWarehouseItemQuantity(long commerceOrderItemId, long commerceInventoryWarehouseId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_params.put("commerceOrderItemId", commerceOrderItemId);

			_command.put("/commerce.commerceorderitem/get-commerce-inventory-warehouse-item-quantity", _params);
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

	public JSONObject getCommerceOrderItem(long commerceOrderItemId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderItemId", commerceOrderItemId);

			_command.put("/commerce.commerceorderitem/get-commerce-order-item", _params);
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

	public JSONArray getCommerceOrderItems(long commerceOrderId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);
			_params.put("end", end);
			_params.put("start", start);

			_command.put("/commerce.commerceorderitem/get-commerce-order-items", _params);
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

	public JSONArray getCommerceOrderItems(long groupId, long commerceAccountId, JSONArray orderStatuses, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("orderStatuses", checkNull(orderStatuses));
			_params.put("start", start);

			_command.put("/commerce.commerceorderitem/get-commerce-order-items", _params);
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

	public Integer getCommerceOrderItemsCount(long commerceOrderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);

			_command.put("/commerce.commerceorderitem/get-commerce-order-items-count", _params);
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

	public Integer getCommerceOrderItemsCount(long commerceOrderId, long cpInstanceId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);
			_params.put("cpInstanceId", cpInstanceId);

			_command.put("/commerce.commerceorderitem/get-commerce-order-items-count", _params);
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

	public Integer getCommerceOrderItemsCount(long groupId, long commerceAccountId, JSONArray orderStatuses) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);
			_params.put("groupId", groupId);
			_params.put("orderStatuses", checkNull(orderStatuses));

			_command.put("/commerce.commerceorderitem/get-commerce-order-items-count", _params);
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

	public Integer getCommerceOrderItemsQuantity(long commerceOrderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);

			_command.put("/commerce.commerceorderitem/get-commerce-order-items-quantity", _params);
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

	public JSONObject search(long commerceOrderId, long parentCommerceOrderItemId, String keywords, int start, int end, JSONObjectWrapper sort) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);
			_params.put("end", end);
			_params.put("keywords", checkNull(keywords));
			_params.put("parentCommerceOrderItemId", parentCommerceOrderItemId);
			_params.put("start", start);
			mangleWrapper(_params, "sort", "com.liferay.portal.kernel.search.Sort", sort);

			_command.put("/commerce.commerceorderitem/search", _params);
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

	public JSONObject search(long commerceOrderId, String keywords, int start, int end, JSONObjectWrapper sort) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);
			_params.put("end", end);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);
			mangleWrapper(_params, "sort", "com.liferay.portal.kernel.search.Sort", sort);

			_command.put("/commerce.commerceorderitem/search", _params);
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

	public JSONObject search(long commerceOrderId, String sku, String name, boolean andOperator, int start, int end, JSONObjectWrapper sort) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("andOperator", andOperator);
			_params.put("commerceOrderId", commerceOrderId);
			_params.put("end", end);
			_params.put("name", checkNull(name));
			_params.put("sku", checkNull(sku));
			_params.put("start", start);
			mangleWrapper(_params, "sort", "com.liferay.portal.kernel.search.Sort", sort);

			_command.put("/commerce.commerceorderitem/search", _params);
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

	public JSONObject updateCommerceOrderItem(long commerceOrderItemId, int quantity, JSONObjectWrapper commerceContext, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderItemId", commerceOrderItemId);
			_params.put("quantity", quantity);
			mangleWrapper(_params, "commerceContext", "com.liferay.commerce.context.CommerceContext", commerceContext);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceorderitem/update-commerce-order-item", _params);
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

	public JSONObject updateCommerceOrderItem(long commerceOrderItemId, int quantity, String json, JSONObjectWrapper commerceContext, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderItemId", commerceOrderItemId);
			_params.put("json", checkNull(json));
			_params.put("quantity", quantity);
			mangleWrapper(_params, "commerceContext", "com.liferay.commerce.context.CommerceContext", commerceContext);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceorderitem/update-commerce-order-item", _params);
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

	public JSONObject updateCommerceOrderItemDeliveryDate(long commerceOrderItemId, long requestedDeliveryDate) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderItemId", commerceOrderItemId);
			_params.put("requestedDeliveryDate", requestedDeliveryDate);

			_command.put("/commerce.commerceorderitem/update-commerce-order-item-delivery-date", _params);
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

	public JSONObject updateCommerceOrderItemInfo(long commerceOrderItemId, String deliveryGroup, long shippingAddressId, String printedNote) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderItemId", commerceOrderItemId);
			_params.put("deliveryGroup", checkNull(deliveryGroup));
			_params.put("printedNote", checkNull(printedNote));
			_params.put("shippingAddressId", shippingAddressId);

			_command.put("/commerce.commerceorderitem/update-commerce-order-item-info", _params);
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

	public JSONObject updateCommerceOrderItemInfo(long commerceOrderItemId, String deliveryGroup, long shippingAddressId, String printedNote, int requestedDeliveryDateMonth, int requestedDeliveryDateDay, int requestedDeliveryDateYear) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderItemId", commerceOrderItemId);
			_params.put("deliveryGroup", checkNull(deliveryGroup));
			_params.put("printedNote", checkNull(printedNote));
			_params.put("requestedDeliveryDateDay", requestedDeliveryDateDay);
			_params.put("requestedDeliveryDateMonth", requestedDeliveryDateMonth);
			_params.put("requestedDeliveryDateYear", requestedDeliveryDateYear);
			_params.put("shippingAddressId", shippingAddressId);

			_command.put("/commerce.commerceorderitem/update-commerce-order-item-info", _params);
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

	public JSONObject updateCommerceOrderItemInfo(long commerceOrderItemId, String deliveryGroup, long shippingAddressId, String printedNote, int requestedDeliveryDateMonth, int requestedDeliveryDateDay, int requestedDeliveryDateYear, int requestedDeliveryDateHour, int requestedDeliveryDateMinute, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderItemId", commerceOrderItemId);
			_params.put("deliveryGroup", checkNull(deliveryGroup));
			_params.put("printedNote", checkNull(printedNote));
			_params.put("requestedDeliveryDateDay", requestedDeliveryDateDay);
			_params.put("requestedDeliveryDateHour", requestedDeliveryDateHour);
			_params.put("requestedDeliveryDateMinute", requestedDeliveryDateMinute);
			_params.put("requestedDeliveryDateMonth", requestedDeliveryDateMonth);
			_params.put("requestedDeliveryDateYear", requestedDeliveryDateYear);
			_params.put("shippingAddressId", shippingAddressId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceorderitem/update-commerce-order-item-info", _params);
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

	public JSONObject updateCommerceOrderItemPrices(long commerceOrderItemId, JSONObject unitPrice, JSONObject promoPrice, JSONObject discountAmount, JSONObject finalPrice, JSONObject discountPercentageLevel1, JSONObject discountPercentageLevel2, JSONObject discountPercentageLevel3, JSONObject discountPercentageLevel4) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderItemId", commerceOrderItemId);
			_params.put("discountAmount", checkNull(discountAmount));
			_params.put("discountPercentageLevel1", checkNull(discountPercentageLevel1));
			_params.put("discountPercentageLevel2", checkNull(discountPercentageLevel2));
			_params.put("discountPercentageLevel3", checkNull(discountPercentageLevel3));
			_params.put("discountPercentageLevel4", checkNull(discountPercentageLevel4));
			_params.put("finalPrice", checkNull(finalPrice));
			_params.put("promoPrice", checkNull(promoPrice));
			_params.put("unitPrice", checkNull(unitPrice));

			_command.put("/commerce.commerceorderitem/update-commerce-order-item-prices", _params);
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

	public JSONObject updateCommerceOrderItemPrices(long commerceOrderItemId, JSONObject unitPrice, JSONObject promoPrice, JSONObject discountAmount, JSONObject finalPrice, JSONObject discountPercentageLevel1, JSONObject discountPercentageLevel2, JSONObject discountPercentageLevel3, JSONObject discountPercentageLevel4, JSONObject unitPriceWithTaxAmount, JSONObject promoPriceWithTaxAmount, JSONObject discountAmountWithTaxAmount, JSONObject finalPriceWithTaxAmount, JSONObject discountPercentageLevel1WithTaxAmount, JSONObject discountPercentageLevel2WithTaxAmount, JSONObject discountPercentageLevel3WithTaxAmount, JSONObject discountPercentageLevel4WithTaxAmount) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderItemId", commerceOrderItemId);
			_params.put("discountAmount", checkNull(discountAmount));
			_params.put("discountAmountWithTaxAmount", checkNull(discountAmountWithTaxAmount));
			_params.put("discountPercentageLevel1", checkNull(discountPercentageLevel1));
			_params.put("discountPercentageLevel1WithTaxAmount", checkNull(discountPercentageLevel1WithTaxAmount));
			_params.put("discountPercentageLevel2", checkNull(discountPercentageLevel2));
			_params.put("discountPercentageLevel2WithTaxAmount", checkNull(discountPercentageLevel2WithTaxAmount));
			_params.put("discountPercentageLevel3", checkNull(discountPercentageLevel3));
			_params.put("discountPercentageLevel3WithTaxAmount", checkNull(discountPercentageLevel3WithTaxAmount));
			_params.put("discountPercentageLevel4", checkNull(discountPercentageLevel4));
			_params.put("discountPercentageLevel4WithTaxAmount", checkNull(discountPercentageLevel4WithTaxAmount));
			_params.put("finalPrice", checkNull(finalPrice));
			_params.put("finalPriceWithTaxAmount", checkNull(finalPriceWithTaxAmount));
			_params.put("promoPrice", checkNull(promoPrice));
			_params.put("promoPriceWithTaxAmount", checkNull(promoPriceWithTaxAmount));
			_params.put("unitPrice", checkNull(unitPrice));
			_params.put("unitPriceWithTaxAmount", checkNull(unitPriceWithTaxAmount));

			_command.put("/commerce.commerceorderitem/update-commerce-order-item-prices", _params);
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

	public JSONObject updateCommerceOrderItemUnitPrice(long commerceOrderItemId, JSONObject unitPrice) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderItemId", commerceOrderItemId);
			_params.put("unitPrice", checkNull(unitPrice));

			_command.put("/commerce.commerceorderitem/update-commerce-order-item-unit-price", _params);
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

	public JSONObject updateCommerceOrderItemUnitPrice(long commerceOrderItemId, JSONObject unitPrice, int quantity) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderItemId", commerceOrderItemId);
			_params.put("quantity", quantity);
			_params.put("unitPrice", checkNull(unitPrice));

			_command.put("/commerce.commerceorderitem/update-commerce-order-item-unit-price", _params);
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

	public JSONObject updateCustomFields(long commerceOrderItemId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderItemId", commerceOrderItemId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceorderitem/update-custom-fields", _params);
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

	public JSONObject upsertCommerceOrderItem(long commerceOrderId, long cpInstanceId, int quantity, int shippedQuantity, String json, JSONObjectWrapper commerceContext, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);
			_params.put("cpInstanceId", cpInstanceId);
			_params.put("json", checkNull(json));
			_params.put("quantity", quantity);
			_params.put("shippedQuantity", shippedQuantity);
			mangleWrapper(_params, "commerceContext", "com.liferay.commerce.context.CommerceContext", commerceContext);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceorderitem/upsert-commerce-order-item", _params);
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