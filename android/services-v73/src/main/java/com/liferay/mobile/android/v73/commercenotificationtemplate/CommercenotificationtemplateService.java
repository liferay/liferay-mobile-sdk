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

package com.liferay.mobile.android.v73.commercenotificationtemplate;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommercenotificationtemplateService extends BaseService {

	public CommercenotificationtemplateService(Session session) {
		super(session);
	}

	public JSONObject addCommerceNotificationTemplate(long userId, long groupId, String name, String description, String from, JSONObject fromNameMap, String to, String cc, String bcc, String type, boolean enabled, JSONObject subjectMap, JSONObject bodyMap, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("bcc", checkNull(bcc));
			_params.put("bodyMap", checkNull(bodyMap));
			_params.put("cc", checkNull(cc));
			_params.put("description", checkNull(description));
			_params.put("enabled", enabled);
			_params.put("from", checkNull(from));
			_params.put("fromNameMap", checkNull(fromNameMap));
			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("subjectMap", checkNull(subjectMap));
			_params.put("to", checkNull(to));
			_params.put("type", checkNull(type));
			_params.put("userId", userId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercenotificationtemplate/add-commerce-notification-template", _params);
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

	public JSONObject addCommerceNotificationTemplate(String name, String description, String from, JSONObject fromNameMap, String to, String cc, String bcc, String type, boolean enabled, JSONObject subjectMap, JSONObject bodyMap, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("bcc", checkNull(bcc));
			_params.put("bodyMap", checkNull(bodyMap));
			_params.put("cc", checkNull(cc));
			_params.put("description", checkNull(description));
			_params.put("enabled", enabled);
			_params.put("from", checkNull(from));
			_params.put("fromNameMap", checkNull(fromNameMap));
			_params.put("name", checkNull(name));
			_params.put("subjectMap", checkNull(subjectMap));
			_params.put("to", checkNull(to));
			_params.put("type", checkNull(type));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercenotificationtemplate/add-commerce-notification-template", _params);
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

	public void deleteCommerceNotificationTemplate(long commerceNotificationTemplateId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceNotificationTemplateId", commerceNotificationTemplateId);

			_command.put("/commerce.commercenotificationtemplate/delete-commerce-notification-template", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject getCommerceNotificationTemplate(long commerceNotificationTemplateId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceNotificationTemplateId", commerceNotificationTemplateId);

			_command.put("/commerce.commercenotificationtemplate/get-commerce-notification-template", _params);
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

	public JSONArray getCommerceNotificationTemplates(long groupId, boolean enabled, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("enabled", enabled);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.notification.model.CommerceNotificationTemplate>", orderByComparator);

			_command.put("/commerce.commercenotificationtemplate/get-commerce-notification-templates", _params);
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

	public JSONArray getCommerceNotificationTemplates(long groupId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.notification.model.CommerceNotificationTemplate>", orderByComparator);

			_command.put("/commerce.commercenotificationtemplate/get-commerce-notification-templates", _params);
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

	public Integer getCommerceNotificationTemplatesCount(long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);

			_command.put("/commerce.commercenotificationtemplate/get-commerce-notification-templates-count", _params);
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

	public Integer getCommerceNotificationTemplatesCount(long groupId, boolean enabled) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("enabled", enabled);
			_params.put("groupId", groupId);

			_command.put("/commerce.commercenotificationtemplate/get-commerce-notification-templates-count", _params);
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

	public JSONObject updateCommerceNotificationTemplate(long commerceNotificationTemplateId, String name, String description, String from, JSONObject fromNameMap, String to, String cc, String bcc, String type, boolean enabled, JSONObject subjectMap, JSONObject bodyMap, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("bcc", checkNull(bcc));
			_params.put("bodyMap", checkNull(bodyMap));
			_params.put("cc", checkNull(cc));
			_params.put("commerceNotificationTemplateId", commerceNotificationTemplateId);
			_params.put("description", checkNull(description));
			_params.put("enabled", enabled);
			_params.put("from", checkNull(from));
			_params.put("fromNameMap", checkNull(fromNameMap));
			_params.put("name", checkNull(name));
			_params.put("subjectMap", checkNull(subjectMap));
			_params.put("to", checkNull(to));
			_params.put("type", checkNull(type));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercenotificationtemplate/update-commerce-notification-template", _params);
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