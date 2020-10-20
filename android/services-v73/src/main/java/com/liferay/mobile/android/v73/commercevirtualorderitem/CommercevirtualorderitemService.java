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

package com.liferay.mobile.android.v73.commercevirtualorderitem;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommercevirtualorderitemService extends BaseService {

	public CommercevirtualorderitemService(Session session) {
		super(session);
	}

	public JSONObject getFile(long commerceVirtualOrderItemId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceVirtualOrderItemId", commerceVirtualOrderItemId);

			_command.put("/commerce.commercevirtualorderitem/get-file", _params);
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

	public JSONObject updateCommerceVirtualOrderItem(long commerceVirtualOrderItemId, long fileEntryId, String url, int activationStatus, long duration, int usages, int maxUsages, boolean active) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("activationStatus", activationStatus);
			_params.put("active", active);
			_params.put("commerceVirtualOrderItemId", commerceVirtualOrderItemId);
			_params.put("duration", duration);
			_params.put("fileEntryId", fileEntryId);
			_params.put("maxUsages", maxUsages);
			_params.put("url", checkNull(url));
			_params.put("usages", usages);

			_command.put("/commerce.commercevirtualorderitem/update-commerce-virtual-order-item", _params);
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