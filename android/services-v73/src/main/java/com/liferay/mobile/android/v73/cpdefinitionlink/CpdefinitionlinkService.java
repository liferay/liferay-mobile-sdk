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

package com.liferay.mobile.android.v73.cpdefinitionlink;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CpdefinitionlinkService extends BaseService {

	public CpdefinitionlinkService(Session session) {
		super(session);
	}

	public JSONObject addCpDefinitionLink(long cpDefinitionId, long cProductId, double priority, String type, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("cProductId", cProductId);
			_params.put("priority", priority);
			_params.put("type", checkNull(type));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinitionlink/add-cp-definition-link", _params);
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

	public void deleteCpDefinitionLink(long cpDefinitionLinkId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionLinkId", cpDefinitionLinkId);

			_command.put("/commerce.cpdefinitionlink/delete-cp-definition-link", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchCpDefinitionLink(long cpDefinitionLinkId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionLinkId", cpDefinitionLinkId);

			_command.put("/commerce.cpdefinitionlink/fetch-cp-definition-link", _params);
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

	public JSONObject getCpDefinitionLink(long cpDefinitionLinkId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionLinkId", cpDefinitionLinkId);

			_command.put("/commerce.cpdefinitionlink/get-cp-definition-link", _params);
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

	public JSONArray getCpDefinitionLinks(long cpDefinitionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);

			_command.put("/commerce.cpdefinitionlink/get-cp-definition-links", _params);
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

	public JSONArray getCpDefinitionLinks(long cpDefinitionId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("end", end);
			_params.put("start", start);

			_command.put("/commerce.cpdefinitionlink/get-cp-definition-links", _params);
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

	public JSONArray getCpDefinitionLinks(long cpDefinitionId, String type) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("type", checkNull(type));

			_command.put("/commerce.cpdefinitionlink/get-cp-definition-links", _params);
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

	public JSONArray getCpDefinitionLinks(long cpDefinitionId, String type, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("end", end);
			_params.put("start", start);
			_params.put("type", checkNull(type));
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.product.model.CPDefinitionLink>", orderByComparator);

			_command.put("/commerce.cpdefinitionlink/get-cp-definition-links", _params);
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

	public Integer getCpDefinitionLinksCount(long cpDefinitionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);

			_command.put("/commerce.cpdefinitionlink/get-cp-definition-links-count", _params);
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

	public Integer getCpDefinitionLinksCount(long cpDefinitionId, String type) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("type", checkNull(type));

			_command.put("/commerce.cpdefinitionlink/get-cp-definition-links-count", _params);
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

	public JSONObject updateCpDefinitionLink(long cpDefinitionLinkId, double priority, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionLinkId", cpDefinitionLinkId);
			_params.put("priority", priority);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinitionlink/update-cp-definition-link", _params);
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

	public void updateCpDefinitionLinks(long cpDefinitionId, JSONArray cpDefinitionIds2, String type, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("cpDefinitionIds2", checkNull(cpDefinitionIds2));
			_params.put("type", checkNull(type));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinitionlink/update-cp-definition-links", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

}