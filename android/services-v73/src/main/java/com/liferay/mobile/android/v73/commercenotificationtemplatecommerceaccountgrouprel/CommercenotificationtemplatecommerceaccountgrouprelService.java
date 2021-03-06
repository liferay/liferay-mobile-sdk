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

package com.liferay.mobile.android.v73.commercenotificationtemplatecommerceaccountgrouprel;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommercenotificationtemplatecommerceaccountgrouprelService extends BaseService {

	public CommercenotificationtemplatecommerceaccountgrouprelService(Session session) {
		super(session);
	}

	public JSONObject addCommerceNotificationTemplateCommerceAccountGroupRel(long commerceNotificationTemplateId, long commerceAccountGroupId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountGroupId", commerceAccountGroupId);
			_params.put("commerceNotificationTemplateId", commerceNotificationTemplateId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercenotificationtemplatecommerceaccountgrouprel/add-commerce-notification-template-commerce-account-group-rel", _params);
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

	public void deleteCommerceNotificationTemplateCommerceAccountGroupRel(long commerceNotificationTemplateCommerceAccountGroupRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceNotificationTemplateCommerceAccountGroupRelId", commerceNotificationTemplateCommerceAccountGroupRelId);

			_command.put("/commerce.commercenotificationtemplatecommerceaccountgrouprel/delete-commerce-notification-template-commerce-account-group-rel", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchCommerceNotificationTemplateCommerceAccountGroupRel(long commerceNotificationTemplateId, long commerceAccountGroupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountGroupId", commerceAccountGroupId);
			_params.put("commerceNotificationTemplateId", commerceNotificationTemplateId);

			_command.put("/commerce.commercenotificationtemplatecommerceaccountgrouprel/fetch-commerce-notification-template-commerce-account-group-rel", _params);
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

	public JSONArray getCommerceNotificationTemplateCommerceAccountGroupRels(long commerceNotificationTemplateId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceNotificationTemplateId", commerceNotificationTemplateId);
			_params.put("end", end);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.notification.model.CommerceNotificationTemplateCommerceAccountGroupRel>", orderByComparator);

			_command.put("/commerce.commercenotificationtemplatecommerceaccountgrouprel/get-commerce-notification-template-commerce-account-group-rels", _params);
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

}