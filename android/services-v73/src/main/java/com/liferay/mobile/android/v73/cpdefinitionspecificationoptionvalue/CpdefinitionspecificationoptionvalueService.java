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

package com.liferay.mobile.android.v73.cpdefinitionspecificationoptionvalue;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CpdefinitionspecificationoptionvalueService extends BaseService {

	public CpdefinitionspecificationoptionvalueService(Session session) {
		super(session);
	}

	public JSONObject addCpDefinitionSpecificationOptionValue(long cpDefinitionId, long cpSpecificationOptionId, long cpOptionCategoryId, JSONObject valueMap, double priority, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("cpOptionCategoryId", cpOptionCategoryId);
			_params.put("cpSpecificationOptionId", cpSpecificationOptionId);
			_params.put("priority", priority);
			_params.put("valueMap", checkNull(valueMap));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinitionspecificationoptionvalue/add-cp-definition-specification-option-value", _params);
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

	public void deleteCpDefinitionSpecificationOptionValue(long cpDefinitionSpecificationOptionValueId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionSpecificationOptionValueId", cpDefinitionSpecificationOptionValueId);

			_command.put("/commerce.cpdefinitionspecificationoptionvalue/delete-cp-definition-specification-option-value", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchCpDefinitionSpecificationOptionValue(long cpDefinitionSpecificationOptionValueId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionSpecificationOptionValueId", cpDefinitionSpecificationOptionValueId);

			_command.put("/commerce.cpdefinitionspecificationoptionvalue/fetch-cp-definition-specification-option-value", _params);
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

	public JSONObject getCpDefinitionSpecificationOptionValue(long cpDefinitionSpecificationOptionValueId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionSpecificationOptionValueId", cpDefinitionSpecificationOptionValueId);

			_command.put("/commerce.cpdefinitionspecificationoptionvalue/get-cp-definition-specification-option-value", _params);
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

	public JSONArray getCpDefinitionSpecificationOptionValues(long cpDefinitionId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("end", end);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.product.model.CPDefinitionSpecificationOptionValue>", orderByComparator);

			_command.put("/commerce.cpdefinitionspecificationoptionvalue/get-cp-definition-specification-option-values", _params);
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

	public JSONArray getCpDefinitionSpecificationOptionValues(long cpDefinitionId, long cpOptionCategoryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("cpOptionCategoryId", cpOptionCategoryId);

			_command.put("/commerce.cpdefinitionspecificationoptionvalue/get-cp-definition-specification-option-values", _params);
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

	public Integer getCpDefinitionSpecificationOptionValuesCount(long cpDefinitionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);

			_command.put("/commerce.cpdefinitionspecificationoptionvalue/get-cp-definition-specification-option-values-count", _params);
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

	public JSONObject updateCpDefinitionSpecificationOptionValue(long cpDefinitionSpecificationOptionValueId, long cpOptionCategoryId, JSONObject valueMap, double priority, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionSpecificationOptionValueId", cpDefinitionSpecificationOptionValueId);
			_params.put("cpOptionCategoryId", cpOptionCategoryId);
			_params.put("priority", priority);
			_params.put("valueMap", checkNull(valueMap));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinitionspecificationoptionvalue/update-cp-definition-specification-option-value", _params);
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