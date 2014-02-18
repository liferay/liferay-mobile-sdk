/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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

package com.liferay.mobile.android.v62.shoppingorder;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class ShoppingOrderService extends BaseService {
	public ShoppingOrderService(Session session) {
		super(session);
	}

	public void completeOrder(long groupId, String number, String ppTxnId,
		String ppPaymentStatus, double ppPaymentGross, String ppReceiverEmail,
		String ppPayerEmail, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("number", number);
			_params.put("ppTxnId", ppTxnId);
			_params.put("ppPaymentStatus", ppPaymentStatus);
			_params.put("ppPaymentGross", ppPaymentGross);
			_params.put("ppReceiverEmail", ppReceiverEmail);
			_params.put("ppPayerEmail", ppPayerEmail);
			_params.put("serviceContext", serviceContext);

			_command.put("/shoppingorder/complete-order", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void deleteOrder(long groupId, long orderId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("orderId", orderId);

			_command.put("/shoppingorder/delete-order", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject getOrder(long groupId, long orderId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("orderId", orderId);

			_command.put("/shoppingorder/get-order", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void sendEmail(long groupId, long orderId, String emailType,
		JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("orderId", orderId);
			_params.put("emailType", emailType);
			_params.put("serviceContext", serviceContext);

			_command.put("/shoppingorder/send-email", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject updateOrder(long groupId, long orderId,
		String billingFirstName, String billingLastName,
		String billingEmailAddress, String billingCompany,
		String billingStreet, String billingCity, String billingState,
		String billingZip, String billingCountry, String billingPhone,
		boolean shipToBilling, String shippingFirstName,
		String shippingLastName, String shippingEmailAddress,
		String shippingCompany, String shippingStreet, String shippingCity,
		String shippingState, String shippingZip, String shippingCountry,
		String shippingPhone, String ccName, String ccType, String ccNumber,
		int ccExpMonth, int ccExpYear, String ccVerNumber, String comments)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("orderId", orderId);
			_params.put("billingFirstName", billingFirstName);
			_params.put("billingLastName", billingLastName);
			_params.put("billingEmailAddress", billingEmailAddress);
			_params.put("billingCompany", billingCompany);
			_params.put("billingStreet", billingStreet);
			_params.put("billingCity", billingCity);
			_params.put("billingState", billingState);
			_params.put("billingZip", billingZip);
			_params.put("billingCountry", billingCountry);
			_params.put("billingPhone", billingPhone);
			_params.put("shipToBilling", shipToBilling);
			_params.put("shippingFirstName", shippingFirstName);
			_params.put("shippingLastName", shippingLastName);
			_params.put("shippingEmailAddress", shippingEmailAddress);
			_params.put("shippingCompany", shippingCompany);
			_params.put("shippingStreet", shippingStreet);
			_params.put("shippingCity", shippingCity);
			_params.put("shippingState", shippingState);
			_params.put("shippingZip", shippingZip);
			_params.put("shippingCountry", shippingCountry);
			_params.put("shippingPhone", shippingPhone);
			_params.put("ccName", ccName);
			_params.put("ccType", ccType);
			_params.put("ccNumber", ccNumber);
			_params.put("ccExpMonth", ccExpMonth);
			_params.put("ccExpYear", ccExpYear);
			_params.put("ccVerNumber", ccVerNumber);
			_params.put("comments", comments);

			_command.put("/shoppingorder/update-order", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updateOrder(long groupId, long orderId, String ppTxnId,
		String ppPaymentStatus, double ppPaymentGross, String ppReceiverEmail,
		String ppPayerEmail) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("orderId", orderId);
			_params.put("ppTxnId", ppTxnId);
			_params.put("ppPaymentStatus", ppPaymentStatus);
			_params.put("ppPaymentGross", ppPaymentGross);
			_params.put("ppReceiverEmail", ppReceiverEmail);
			_params.put("ppPayerEmail", ppPayerEmail);

			_command.put("/shoppingorder/update-order", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}
}