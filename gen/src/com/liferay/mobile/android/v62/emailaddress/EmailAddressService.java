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

package com.liferay.mobile.android.v62.emailaddress;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class EmailAddressService extends BaseService {
	public EmailAddressService(Session session) {
		super(session);
	}

	public JSONObject addEmailAddress(String className, long classPK,
		String address, int typeId, boolean primary, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", className);
			_params.put("classPK", classPK);
			_params.put("address", address);
			_params.put("typeId", typeId);
			_params.put("primary", primary);
			_params.put("serviceContext", serviceContext);

			_command.put("/emailaddress/add-email-address", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void deleteEmailAddress(long emailAddressId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("emailAddressId", emailAddressId);

			_command.put("/emailaddress/delete-email-address", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject getEmailAddress(long emailAddressId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("emailAddressId", emailAddressId);

			_command.put("/emailaddress/get-email-address", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONArray getEmailAddresses(String className, long classPK)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", className);
			_params.put("classPK", classPK);

			_command.put("/emailaddress/get-email-addresses", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONObject updateEmailAddress(long emailAddressId, String address,
		int typeId, boolean primary) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("emailAddressId", emailAddressId);
			_params.put("address", address);
			_params.put("typeId", typeId);
			_params.put("primary", primary);

			_command.put("/emailaddress/update-email-address", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}
}