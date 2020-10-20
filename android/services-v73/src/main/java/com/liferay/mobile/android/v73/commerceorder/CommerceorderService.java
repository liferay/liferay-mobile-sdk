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

package com.liferay.mobile.android.v73.commerceorder;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommerceorderService extends BaseService {

	public CommerceorderService(Session session) {
		super(session);
	}

	public JSONObject addCommerceOrder(long userId, long groupId, long commerceAccountId, long commerceCurrencyId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);
			_params.put("commerceCurrencyId", commerceCurrencyId);
			_params.put("groupId", groupId);
			_params.put("userId", userId);

			_command.put("/commerce.commerceorder/add-commerce-order", _params);
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

	public JSONObject addCommerceOrder(long groupId, long commerceAccountId, long commerceCurrencyId, long shippingAddressId, String purchaseOrderNumber) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);
			_params.put("commerceCurrencyId", commerceCurrencyId);
			_params.put("groupId", groupId);
			_params.put("purchaseOrderNumber", checkNull(purchaseOrderNumber));
			_params.put("shippingAddressId", shippingAddressId);

			_command.put("/commerce.commerceorder/add-commerce-order", _params);
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

	public JSONObject addCommerceOrder(long groupId, long commerceAccountId, long shippingAddressId, String purchaseOrderNumber) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);
			_params.put("groupId", groupId);
			_params.put("purchaseOrderNumber", checkNull(purchaseOrderNumber));
			_params.put("shippingAddressId", shippingAddressId);

			_command.put("/commerce.commerceorder/add-commerce-order", _params);
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

	public JSONObject applyCouponCode(long commerceOrderId, String couponCode, JSONObjectWrapper commerceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);
			_params.put("couponCode", checkNull(couponCode));
			mangleWrapper(_params, "commerceContext", "com.liferay.commerce.context.CommerceContext", commerceContext);

			_command.put("/commerce.commerceorder/apply-coupon-code", _params);
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

	public void deleteCommerceOrder(long commerceOrderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);

			_command.put("/commerce.commerceorder/delete-commerce-order", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject executeWorkflowTransition(long commerceOrderId, long workflowTaskId, String transitionName, String comment) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("comment", checkNull(comment));
			_params.put("commerceOrderId", commerceOrderId);
			_params.put("transitionName", checkNull(transitionName));
			_params.put("workflowTaskId", workflowTaskId);

			_command.put("/commerce.commerceorder/execute-workflow-transition", _params);
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

			_command.put("/commerce.commerceorder/fetch-by-external-reference-code", _params);
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

	public JSONObject fetchCommerceOrder(long commerceOrderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);

			_command.put("/commerce.commerceorder/fetch-commerce-order", _params);
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

	public JSONObject fetchCommerceOrder(long commerceAccountId, long groupId, int orderStatus) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);
			_params.put("groupId", groupId);
			_params.put("orderStatus", orderStatus);

			_command.put("/commerce.commerceorder/fetch-commerce-order", _params);
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

	public JSONObject fetchCommerceOrder(long commerceAccountId, long groupId, long userId, int orderStatus) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);
			_params.put("groupId", groupId);
			_params.put("orderStatus", orderStatus);
			_params.put("userId", userId);

			_command.put("/commerce.commerceorder/fetch-commerce-order", _params);
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

	public JSONObject fetchCommerceOrder(String uuid, long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("uuid", checkNull(uuid));

			_command.put("/commerce.commerceorder/fetch-commerce-order", _params);
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

	public JSONObject getCommerceOrder(long commerceOrderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);

			_command.put("/commerce.commerceorder/get-commerce-order", _params);
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

	public JSONObject getCommerceOrderByUuidAndGroupId(String uuid, long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("uuid", checkNull(uuid));

			_command.put("/commerce.commerceorder/get-commerce-order-by-uuid-and-group-id", _params);
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

	public JSONArray getCommerceOrders(long groupId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceOrder>", orderByComparator);

			_command.put("/commerce.commerceorder/get-commerce-orders", _params);
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

	public JSONArray getCommerceOrders(long groupId, JSONArray orderStatuses) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("orderStatuses", checkNull(orderStatuses));

			_command.put("/commerce.commerceorder/get-commerce-orders", _params);
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

	public JSONArray getCommerceOrders(long groupId, JSONArray orderStatuses, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("orderStatuses", checkNull(orderStatuses));
			_params.put("start", start);

			_command.put("/commerce.commerceorder/get-commerce-orders", _params);
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

	public JSONArray getCommerceOrders(long groupId, long commerceAccountId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceOrder>", orderByComparator);

			_command.put("/commerce.commerceorder/get-commerce-orders", _params);
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

	public Integer getCommerceOrdersCount(long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);

			_command.put("/commerce.commerceorder/get-commerce-orders-count", _params);
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

	public Integer getCommerceOrdersCount(long groupId, long commerceAccountId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);
			_params.put("groupId", groupId);

			_command.put("/commerce.commerceorder/get-commerce-orders-count", _params);
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

	public JSONArray getPendingCommerceOrders(long groupId, long commerceAccountId, String keywords, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);

			_command.put("/commerce.commerceorder/get-pending-commerce-orders", _params);
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

	public Long getPendingCommerceOrdersCount(long companyId, long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupId", groupId);

			_command.put("/commerce.commerceorder/get-pending-commerce-orders-count", _params);
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

	public Integer getPendingCommerceOrdersCount(long groupId, long commerceAccountId, String keywords) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);
			_params.put("groupId", groupId);
			_params.put("keywords", checkNull(keywords));

			_command.put("/commerce.commerceorder/get-pending-commerce-orders-count", _params);
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

	public JSONArray getPlacedCommerceOrders(long companyId, long groupId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);

			_command.put("/commerce.commerceorder/get-placed-commerce-orders", _params);
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

	public JSONArray getPlacedCommerceOrders(long groupId, long commerceAccountId, String keywords, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);

			_command.put("/commerce.commerceorder/get-placed-commerce-orders", _params);
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

	public Long getPlacedCommerceOrdersCount(long companyId, long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupId", groupId);

			_command.put("/commerce.commerceorder/get-placed-commerce-orders-count", _params);
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

	public Integer getPlacedCommerceOrdersCount(long groupId, long commerceAccountId, String keywords) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);
			_params.put("groupId", groupId);
			_params.put("keywords", checkNull(keywords));

			_command.put("/commerce.commerceorder/get-placed-commerce-orders-count", _params);
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

	public JSONArray getUserPendingCommerceOrders(long companyId, long groupId, String keywords, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);

			_command.put("/commerce.commerceorder/get-user-pending-commerce-orders", _params);
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

	public Long getUserPendingCommerceOrdersCount(long companyId, long groupId, String keywords) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupId", groupId);
			_params.put("keywords", checkNull(keywords));

			_command.put("/commerce.commerceorder/get-user-pending-commerce-orders-count", _params);
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

	public JSONArray getUserPlacedCommerceOrders(long companyId, long groupId, String keywords, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);

			_command.put("/commerce.commerceorder/get-user-placed-commerce-orders", _params);
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

	public Long getUserPlacedCommerceOrdersCount(long companyId, long groupId, String keywords) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupId", groupId);
			_params.put("keywords", checkNull(keywords));

			_command.put("/commerce.commerceorder/get-user-placed-commerce-orders-count", _params);
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

	public void mergeGuestCommerceOrder(long guestCommerceOrderId, long userCommerceOrderId, JSONObjectWrapper commerceContext, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("guestCommerceOrderId", guestCommerceOrderId);
			_params.put("userCommerceOrderId", userCommerceOrderId);
			mangleWrapper(_params, "commerceContext", "com.liferay.commerce.context.CommerceContext", commerceContext);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceorder/merge-guest-commerce-order", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject recalculatePrice(long commerceOrderId, JSONObjectWrapper commerceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);
			mangleWrapper(_params, "commerceContext", "com.liferay.commerce.context.CommerceContext", commerceContext);

			_command.put("/commerce.commerceorder/recalculate-price", _params);
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

	public JSONObject reorderCommerceOrder(long commerceOrderId, JSONObjectWrapper commerceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);
			mangleWrapper(_params, "commerceContext", "com.liferay.commerce.context.CommerceContext", commerceContext);

			_command.put("/commerce.commerceorder/reorder-commerce-order", _params);
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

	public JSONObject updateBillingAddress(long commerceOrderId, long billingAddressId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("billingAddressId", billingAddressId);
			_params.put("commerceOrderId", commerceOrderId);

			_command.put("/commerce.commerceorder/update-billing-address", _params);
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

	public JSONObject updateBillingAddress(long commerceOrderId, String name, String description, String street1, String street2, String street3, String city, String zip, long commerceRegionId, long commerceCountryId, String phoneNumber, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("city", checkNull(city));
			_params.put("commerceCountryId", commerceCountryId);
			_params.put("commerceOrderId", commerceOrderId);
			_params.put("commerceRegionId", commerceRegionId);
			_params.put("description", checkNull(description));
			_params.put("name", checkNull(name));
			_params.put("phoneNumber", checkNull(phoneNumber));
			_params.put("street1", checkNull(street1));
			_params.put("street2", checkNull(street2));
			_params.put("street3", checkNull(street3));
			_params.put("zip", checkNull(zip));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceorder/update-billing-address", _params);
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

	public JSONObject updateCommerceOrder(JSONObjectWrapper commerceOrder) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			mangleWrapper(_params, "commerceOrder", "com.liferay.commerce.model.CommerceOrder", commerceOrder);

			_command.put("/commerce.commerceorder/update-commerce-order", _params);
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

	public JSONObject updateCommerceOrder(long commerceOrderId, long billingAddressId, long shippingAddressId, String commercePaymentMethodKey, long commerceShippingMethodId, String shippingOptionName, String purchaseOrderNumber, JSONObject subtotal, JSONObject shippingAmount, JSONObject total, JSONObject subtotalWithTaxAmount, JSONObject shippingWithTaxAmount, JSONObject totalWithTaxAmount, String advanceStatus, String externalReferenceCode, JSONObjectWrapper commerceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("advanceStatus", checkNull(advanceStatus));
			_params.put("billingAddressId", billingAddressId);
			_params.put("commerceOrderId", commerceOrderId);
			_params.put("commercePaymentMethodKey", checkNull(commercePaymentMethodKey));
			_params.put("commerceShippingMethodId", commerceShippingMethodId);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));
			_params.put("purchaseOrderNumber", checkNull(purchaseOrderNumber));
			_params.put("shippingAddressId", shippingAddressId);
			_params.put("shippingAmount", checkNull(shippingAmount));
			_params.put("shippingOptionName", checkNull(shippingOptionName));
			_params.put("shippingWithTaxAmount", checkNull(shippingWithTaxAmount));
			_params.put("subtotal", checkNull(subtotal));
			_params.put("subtotalWithTaxAmount", checkNull(subtotalWithTaxAmount));
			_params.put("total", checkNull(total));
			_params.put("totalWithTaxAmount", checkNull(totalWithTaxAmount));
			mangleWrapper(_params, "commerceContext", "com.liferay.commerce.context.CommerceContext", commerceContext);

			_command.put("/commerce.commerceorder/update-commerce-order", _params);
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

	public JSONObject updateCommerceOrder(long commerceOrderId, long billingAddressId, long shippingAddressId, String commercePaymentMethodKey, long commerceShippingMethodId, String shippingOptionName, String purchaseOrderNumber, JSONObject subtotal, JSONObject shippingAmount, JSONObject total, String advanceStatus, JSONObjectWrapper commerceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("advanceStatus", checkNull(advanceStatus));
			_params.put("billingAddressId", billingAddressId);
			_params.put("commerceOrderId", commerceOrderId);
			_params.put("commercePaymentMethodKey", checkNull(commercePaymentMethodKey));
			_params.put("commerceShippingMethodId", commerceShippingMethodId);
			_params.put("purchaseOrderNumber", checkNull(purchaseOrderNumber));
			_params.put("shippingAddressId", shippingAddressId);
			_params.put("shippingAmount", checkNull(shippingAmount));
			_params.put("shippingOptionName", checkNull(shippingOptionName));
			_params.put("subtotal", checkNull(subtotal));
			_params.put("total", checkNull(total));
			mangleWrapper(_params, "commerceContext", "com.liferay.commerce.context.CommerceContext", commerceContext);

			_command.put("/commerce.commerceorder/update-commerce-order", _params);
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

	public JSONObject updateCommerceOrder(long commerceOrderId, long billingAddressId, long shippingAddressId, String commercePaymentMethodKey, long commerceShippingMethodId, String shippingOptionName, String purchaseOrderNumber, JSONObject subtotal, JSONObject shippingAmount, JSONObject total, String advanceStatus, String externalReferenceCode, JSONObjectWrapper commerceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("advanceStatus", checkNull(advanceStatus));
			_params.put("billingAddressId", billingAddressId);
			_params.put("commerceOrderId", commerceOrderId);
			_params.put("commercePaymentMethodKey", checkNull(commercePaymentMethodKey));
			_params.put("commerceShippingMethodId", commerceShippingMethodId);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));
			_params.put("purchaseOrderNumber", checkNull(purchaseOrderNumber));
			_params.put("shippingAddressId", shippingAddressId);
			_params.put("shippingAmount", checkNull(shippingAmount));
			_params.put("shippingOptionName", checkNull(shippingOptionName));
			_params.put("subtotal", checkNull(subtotal));
			_params.put("total", checkNull(total));
			mangleWrapper(_params, "commerceContext", "com.liferay.commerce.context.CommerceContext", commerceContext);

			_command.put("/commerce.commerceorder/update-commerce-order", _params);
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

	public JSONObject updateCommerceOrderExternalReferenceCode(long commerceOrderId, String externalReferenceCode) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));

			_command.put("/commerce.commerceorder/update-commerce-order-external-reference-code", _params);
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

	public JSONObject updateCommerceOrderPrices(long commerceOrderId, JSONObject subtotal, JSONObject subtotalDiscountAmount, JSONObject subtotalDiscountPercentageLevel1, JSONObject subtotalDiscountPercentageLevel2, JSONObject subtotalDiscountPercentageLevel3, JSONObject subtotalDiscountPercentageLevel4, JSONObject shippingAmount, JSONObject shippingDiscountAmount, JSONObject shippingDiscountPercentageLevel1, JSONObject shippingDiscountPercentageLevel2, JSONObject shippingDiscountPercentageLevel3, JSONObject shippingDiscountPercentageLevel4, JSONObject taxAmount, JSONObject total, JSONObject totalDiscountAmount, JSONObject totalDiscountPercentageLevel1, JSONObject totalDiscountPercentageLevel2, JSONObject totalDiscountPercentageLevel3, JSONObject totalDiscountPercentageLevel4) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);
			_params.put("shippingAmount", checkNull(shippingAmount));
			_params.put("shippingDiscountAmount", checkNull(shippingDiscountAmount));
			_params.put("shippingDiscountPercentageLevel1", checkNull(shippingDiscountPercentageLevel1));
			_params.put("shippingDiscountPercentageLevel2", checkNull(shippingDiscountPercentageLevel2));
			_params.put("shippingDiscountPercentageLevel3", checkNull(shippingDiscountPercentageLevel3));
			_params.put("shippingDiscountPercentageLevel4", checkNull(shippingDiscountPercentageLevel4));
			_params.put("subtotal", checkNull(subtotal));
			_params.put("subtotalDiscountAmount", checkNull(subtotalDiscountAmount));
			_params.put("subtotalDiscountPercentageLevel1", checkNull(subtotalDiscountPercentageLevel1));
			_params.put("subtotalDiscountPercentageLevel2", checkNull(subtotalDiscountPercentageLevel2));
			_params.put("subtotalDiscountPercentageLevel3", checkNull(subtotalDiscountPercentageLevel3));
			_params.put("subtotalDiscountPercentageLevel4", checkNull(subtotalDiscountPercentageLevel4));
			_params.put("taxAmount", checkNull(taxAmount));
			_params.put("total", checkNull(total));
			_params.put("totalDiscountAmount", checkNull(totalDiscountAmount));
			_params.put("totalDiscountPercentageLevel1", checkNull(totalDiscountPercentageLevel1));
			_params.put("totalDiscountPercentageLevel2", checkNull(totalDiscountPercentageLevel2));
			_params.put("totalDiscountPercentageLevel3", checkNull(totalDiscountPercentageLevel3));
			_params.put("totalDiscountPercentageLevel4", checkNull(totalDiscountPercentageLevel4));

			_command.put("/commerce.commerceorder/update-commerce-order-prices", _params);
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

	public JSONObject updateCommerceOrderPrices(long commerceOrderId, JSONObject subtotal, JSONObject subtotalDiscountAmount, JSONObject subtotalDiscountPercentageLevel1, JSONObject subtotalDiscountPercentageLevel2, JSONObject subtotalDiscountPercentageLevel3, JSONObject subtotalDiscountPercentageLevel4, JSONObject shippingAmount, JSONObject shippingDiscountAmount, JSONObject shippingDiscountPercentageLevel1, JSONObject shippingDiscountPercentageLevel2, JSONObject shippingDiscountPercentageLevel3, JSONObject shippingDiscountPercentageLevel4, JSONObject taxAmount, JSONObject total, JSONObject totalDiscountAmount, JSONObject totalDiscountPercentageLevel1, JSONObject totalDiscountPercentageLevel2, JSONObject totalDiscountPercentageLevel3, JSONObject totalDiscountPercentageLevel4, JSONObject subtotalWithTaxAmount, JSONObject subtotalDiscountWithTaxAmount, JSONObject subtotalDiscountPercentageLevel1WithTaxAmount, JSONObject subtotalDiscountPercentageLevel2WithTaxAmount, JSONObject subtotalDiscountPercentageLevel3WithTaxAmount, JSONObject subtotalDiscountPercentageLevel4WithTaxAmount, JSONObject shippingWithTaxAmount, JSONObject shippingDiscountWithTaxAmount, JSONObject shippingDiscountPercentageLevel1WithTaxAmount, JSONObject shippingDiscountPercentageLevel2WithTaxAmount, JSONObject shippingDiscountPercentageLevel3WithTaxAmount, JSONObject shippingDiscountPercentageLevel4WithTaxAmount, JSONObject totalWithTaxAmount, JSONObject totalDiscountWithTaxAmount, JSONObject totalDiscountPercentageLevel1WithTaxAmount, JSONObject totalDiscountPercentageLevel2WithTaxAmount, JSONObject totalDiscountPercentageLevel3WithTaxAmount, JSONObject totalDiscountPercentageLevel4WithTaxAmount) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);
			_params.put("shippingAmount", checkNull(shippingAmount));
			_params.put("shippingDiscountAmount", checkNull(shippingDiscountAmount));
			_params.put("shippingDiscountPercentageLevel1", checkNull(shippingDiscountPercentageLevel1));
			_params.put("shippingDiscountPercentageLevel1WithTaxAmount", checkNull(shippingDiscountPercentageLevel1WithTaxAmount));
			_params.put("shippingDiscountPercentageLevel2", checkNull(shippingDiscountPercentageLevel2));
			_params.put("shippingDiscountPercentageLevel2WithTaxAmount", checkNull(shippingDiscountPercentageLevel2WithTaxAmount));
			_params.put("shippingDiscountPercentageLevel3", checkNull(shippingDiscountPercentageLevel3));
			_params.put("shippingDiscountPercentageLevel3WithTaxAmount", checkNull(shippingDiscountPercentageLevel3WithTaxAmount));
			_params.put("shippingDiscountPercentageLevel4", checkNull(shippingDiscountPercentageLevel4));
			_params.put("shippingDiscountPercentageLevel4WithTaxAmount", checkNull(shippingDiscountPercentageLevel4WithTaxAmount));
			_params.put("shippingDiscountWithTaxAmount", checkNull(shippingDiscountWithTaxAmount));
			_params.put("shippingWithTaxAmount", checkNull(shippingWithTaxAmount));
			_params.put("subtotal", checkNull(subtotal));
			_params.put("subtotalDiscountAmount", checkNull(subtotalDiscountAmount));
			_params.put("subtotalDiscountPercentageLevel1", checkNull(subtotalDiscountPercentageLevel1));
			_params.put("subtotalDiscountPercentageLevel1WithTaxAmount", checkNull(subtotalDiscountPercentageLevel1WithTaxAmount));
			_params.put("subtotalDiscountPercentageLevel2", checkNull(subtotalDiscountPercentageLevel2));
			_params.put("subtotalDiscountPercentageLevel2WithTaxAmount", checkNull(subtotalDiscountPercentageLevel2WithTaxAmount));
			_params.put("subtotalDiscountPercentageLevel3", checkNull(subtotalDiscountPercentageLevel3));
			_params.put("subtotalDiscountPercentageLevel3WithTaxAmount", checkNull(subtotalDiscountPercentageLevel3WithTaxAmount));
			_params.put("subtotalDiscountPercentageLevel4", checkNull(subtotalDiscountPercentageLevel4));
			_params.put("subtotalDiscountPercentageLevel4WithTaxAmount", checkNull(subtotalDiscountPercentageLevel4WithTaxAmount));
			_params.put("subtotalDiscountWithTaxAmount", checkNull(subtotalDiscountWithTaxAmount));
			_params.put("subtotalWithTaxAmount", checkNull(subtotalWithTaxAmount));
			_params.put("taxAmount", checkNull(taxAmount));
			_params.put("total", checkNull(total));
			_params.put("totalDiscountAmount", checkNull(totalDiscountAmount));
			_params.put("totalDiscountPercentageLevel1", checkNull(totalDiscountPercentageLevel1));
			_params.put("totalDiscountPercentageLevel1WithTaxAmount", checkNull(totalDiscountPercentageLevel1WithTaxAmount));
			_params.put("totalDiscountPercentageLevel2", checkNull(totalDiscountPercentageLevel2));
			_params.put("totalDiscountPercentageLevel2WithTaxAmount", checkNull(totalDiscountPercentageLevel2WithTaxAmount));
			_params.put("totalDiscountPercentageLevel3", checkNull(totalDiscountPercentageLevel3));
			_params.put("totalDiscountPercentageLevel3WithTaxAmount", checkNull(totalDiscountPercentageLevel3WithTaxAmount));
			_params.put("totalDiscountPercentageLevel4", checkNull(totalDiscountPercentageLevel4));
			_params.put("totalDiscountPercentageLevel4WithTaxAmount", checkNull(totalDiscountPercentageLevel4WithTaxAmount));
			_params.put("totalDiscountWithTaxAmount", checkNull(totalDiscountWithTaxAmount));
			_params.put("totalWithTaxAmount", checkNull(totalWithTaxAmount));

			_command.put("/commerce.commerceorder/update-commerce-order-prices", _params);
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

	public JSONObject updateCommercePaymentMethodKey(long commerceOrderId, String commercePaymentMethodKey) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);
			_params.put("commercePaymentMethodKey", checkNull(commercePaymentMethodKey));

			_command.put("/commerce.commerceorder/update-commerce-payment-method-key", _params);
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

	public JSONObject updateCustomFields(long commerceOrderId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceorder/update-custom-fields", _params);
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

	public JSONObject updateInfo(long commerceOrderId, String printedNote, int requestedDeliveryDateMonth, int requestedDeliveryDateDay, int requestedDeliveryDateYear, int requestedDeliveryDateHour, int requestedDeliveryDateMinute, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);
			_params.put("printedNote", checkNull(printedNote));
			_params.put("requestedDeliveryDateDay", requestedDeliveryDateDay);
			_params.put("requestedDeliveryDateHour", requestedDeliveryDateHour);
			_params.put("requestedDeliveryDateMinute", requestedDeliveryDateMinute);
			_params.put("requestedDeliveryDateMonth", requestedDeliveryDateMonth);
			_params.put("requestedDeliveryDateYear", requestedDeliveryDateYear);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceorder/update-info", _params);
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

	public JSONObject updateOrderDate(long commerceOrderId, int orderDateMonth, int orderDateDay, int orderDateYear, int orderDateHour, int orderDateMinute, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);
			_params.put("orderDateDay", orderDateDay);
			_params.put("orderDateHour", orderDateHour);
			_params.put("orderDateMinute", orderDateMinute);
			_params.put("orderDateMonth", orderDateMonth);
			_params.put("orderDateYear", orderDateYear);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceorder/update-order-date", _params);
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

	public JSONObject updatePaymentStatus(long commerceOrderId, int paymentStatus) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);
			_params.put("paymentStatus", paymentStatus);

			_command.put("/commerce.commerceorder/update-payment-status", _params);
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

	public JSONObject updatePaymentStatusAndTransactionId(long commerceOrderId, int paymentStatus, String transactionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);
			_params.put("paymentStatus", paymentStatus);
			_params.put("transactionId", checkNull(transactionId));

			_command.put("/commerce.commerceorder/update-payment-status-and-transaction-id", _params);
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

	public JSONObject updatePrintedNote(long commerceOrderId, String printedNote) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);
			_params.put("printedNote", checkNull(printedNote));

			_command.put("/commerce.commerceorder/update-printed-note", _params);
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

	public JSONObject updatePurchaseOrderNumber(long commerceOrderId, String purchaseOrderNumber) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);
			_params.put("purchaseOrderNumber", checkNull(purchaseOrderNumber));

			_command.put("/commerce.commerceorder/update-purchase-order-number", _params);
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

	public JSONObject updateShippingAddress(long commerceOrderId, long shippingAddressId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);
			_params.put("shippingAddressId", shippingAddressId);

			_command.put("/commerce.commerceorder/update-shipping-address", _params);
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

	public JSONObject updateShippingAddress(long commerceOrderId, String name, String description, String street1, String street2, String street3, String city, String zip, long commerceRegionId, long commerceCountryId, String phoneNumber, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("city", checkNull(city));
			_params.put("commerceCountryId", commerceCountryId);
			_params.put("commerceOrderId", commerceOrderId);
			_params.put("commerceRegionId", commerceRegionId);
			_params.put("description", checkNull(description));
			_params.put("name", checkNull(name));
			_params.put("phoneNumber", checkNull(phoneNumber));
			_params.put("street1", checkNull(street1));
			_params.put("street2", checkNull(street2));
			_params.put("street3", checkNull(street3));
			_params.put("zip", checkNull(zip));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceorder/update-shipping-address", _params);
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

	public JSONObject updateTransactionId(long commerceOrderId, String transactionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);
			_params.put("transactionId", checkNull(transactionId));

			_command.put("/commerce.commerceorder/update-transaction-id", _params);
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

	public JSONObject updateUser(long commerceOrderId, long userId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceOrderId", commerceOrderId);
			_params.put("userId", userId);

			_command.put("/commerce.commerceorder/update-user", _params);
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

	public JSONObject upsertCommerceOrder(long userId, long groupId, long commerceAccountId, long commerceCurrencyId, long billingAddressId, long shippingAddressId, String commercePaymentMethodKey, long commerceShippingMethodId, String shippingOptionName, String purchaseOrderNumber, JSONObject subtotal, JSONObject shippingAmount, JSONObject total, int paymentStatus, int orderStatus, String advanceStatus, String externalReferenceCode, JSONObjectWrapper commerceContext, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("advanceStatus", checkNull(advanceStatus));
			_params.put("billingAddressId", billingAddressId);
			_params.put("commerceAccountId", commerceAccountId);
			_params.put("commerceCurrencyId", commerceCurrencyId);
			_params.put("commercePaymentMethodKey", checkNull(commercePaymentMethodKey));
			_params.put("commerceShippingMethodId", commerceShippingMethodId);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));
			_params.put("groupId", groupId);
			_params.put("orderStatus", orderStatus);
			_params.put("paymentStatus", paymentStatus);
			_params.put("purchaseOrderNumber", checkNull(purchaseOrderNumber));
			_params.put("shippingAddressId", shippingAddressId);
			_params.put("shippingAmount", checkNull(shippingAmount));
			_params.put("shippingOptionName", checkNull(shippingOptionName));
			_params.put("subtotal", checkNull(subtotal));
			_params.put("total", checkNull(total));
			_params.put("userId", userId);
			mangleWrapper(_params, "commerceContext", "com.liferay.commerce.context.CommerceContext", commerceContext);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceorder/upsert-commerce-order", _params);
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

	public JSONObject upsertCommerceOrder(long userId, long groupId, long commerceAccountId, long commerceCurrencyId, long billingAddressId, long shippingAddressId, String commercePaymentMethodKey, long commerceShippingMethodId, String shippingOptionName, String purchaseOrderNumber, JSONObject subtotal, JSONObject shippingAmount, JSONObject total, JSONObject subtotalWithTaxAmount, JSONObject shippingWithTaxAmount, JSONObject totalWithTaxAmount, int paymentStatus, int orderStatus, String advanceStatus, String externalReferenceCode, JSONObjectWrapper commerceContext, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("advanceStatus", checkNull(advanceStatus));
			_params.put("billingAddressId", billingAddressId);
			_params.put("commerceAccountId", commerceAccountId);
			_params.put("commerceCurrencyId", commerceCurrencyId);
			_params.put("commercePaymentMethodKey", checkNull(commercePaymentMethodKey));
			_params.put("commerceShippingMethodId", commerceShippingMethodId);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));
			_params.put("groupId", groupId);
			_params.put("orderStatus", orderStatus);
			_params.put("paymentStatus", paymentStatus);
			_params.put("purchaseOrderNumber", checkNull(purchaseOrderNumber));
			_params.put("shippingAddressId", shippingAddressId);
			_params.put("shippingAmount", checkNull(shippingAmount));
			_params.put("shippingOptionName", checkNull(shippingOptionName));
			_params.put("shippingWithTaxAmount", checkNull(shippingWithTaxAmount));
			_params.put("subtotal", checkNull(subtotal));
			_params.put("subtotalWithTaxAmount", checkNull(subtotalWithTaxAmount));
			_params.put("total", checkNull(total));
			_params.put("totalWithTaxAmount", checkNull(totalWithTaxAmount));
			_params.put("userId", userId);
			mangleWrapper(_params, "commerceContext", "com.liferay.commerce.context.CommerceContext", commerceContext);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceorder/upsert-commerce-order", _params);
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