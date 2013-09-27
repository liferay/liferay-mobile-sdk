/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;

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

	public ShoppingOrderService(Session session, AsyncTaskCallback callback) {
		super(session, callback);
	}

	public ShoppingOrderService(Session session, boolean batch) {
		super(session, batch);
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

		post(_command);
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

		post(_command);
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

		return (JSONObject)post(_command);
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

		post(_command);
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

		return (JSONObject)post(_command);
	}
}