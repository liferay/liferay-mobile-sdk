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

package com.liferay.mobile.android.v73.cpdefinitionoptionvaluerel;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CpdefinitionoptionvaluerelService extends BaseService {

	public CpdefinitionoptionvaluerelService(Session session) {
		super(session);
	}

	public JSONObject addCpDefinitionOptionValueRel(long cpDefinitionOptionRelId, JSONObject nameMap, double priority, String key, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionOptionRelId", cpDefinitionOptionRelId);
			_params.put("key", checkNull(key));
			_params.put("nameMap", checkNull(nameMap));
			_params.put("priority", priority);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinitionoptionvaluerel/add-cp-definition-option-value-rel", _params);
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

	public JSONObject deleteCpDefinitionOptionValueRel(long cpDefinitionOptionValueRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionOptionValueRelId", cpDefinitionOptionValueRelId);

			_command.put("/commerce.cpdefinitionoptionvaluerel/delete-cp-definition-option-value-rel", _params);
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

	public JSONObject fetchCpDefinitionOptionValueRel(long cpDefinitionOptionValueRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionOptionValueRelId", cpDefinitionOptionValueRelId);

			_command.put("/commerce.cpdefinitionoptionvaluerel/fetch-cp-definition-option-value-rel", _params);
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

	public JSONObject fetchCpDefinitionOptionValueRel(long cpDefinitionOptionRelId, String key) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionOptionRelId", cpDefinitionOptionRelId);
			_params.put("key", checkNull(key));

			_command.put("/commerce.cpdefinitionoptionvaluerel/fetch-cp-definition-option-value-rel", _params);
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

	public JSONObject getCpDefinitionOptionValueRel(long cpDefinitionOptionValueRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionOptionValueRelId", cpDefinitionOptionValueRelId);

			_command.put("/commerce.cpdefinitionoptionvaluerel/get-cp-definition-option-value-rel", _params);
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

	public JSONArray getCpDefinitionOptionValueRels(long cpDefinitionOptionRelId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionOptionRelId", cpDefinitionOptionRelId);
			_params.put("end", end);
			_params.put("start", start);

			_command.put("/commerce.cpdefinitionoptionvaluerel/get-cp-definition-option-value-rels", _params);
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

	public JSONArray getCpDefinitionOptionValueRels(long cpDefinitionOptionRelId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionOptionRelId", cpDefinitionOptionRelId);
			_params.put("end", end);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.product.model.CPDefinitionOptionValueRel>", orderByComparator);

			_command.put("/commerce.cpdefinitionoptionvaluerel/get-cp-definition-option-value-rels", _params);
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

	public JSONArray getCpDefinitionOptionValueRels(long groupId, String key, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("key", checkNull(key));
			_params.put("start", start);

			_command.put("/commerce.cpdefinitionoptionvaluerel/get-cp-definition-option-value-rels", _params);
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

	public Integer getCpDefinitionOptionValueRelsCount(long cpDefinitionOptionRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionOptionRelId", cpDefinitionOptionRelId);

			_command.put("/commerce.cpdefinitionoptionvaluerel/get-cp-definition-option-value-rels-count", _params);
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

	public JSONObject resetCpInstanceCpDefinitionOptionValueRel(long cpDefinitionOptionValueRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionOptionValueRelId", cpDefinitionOptionValueRelId);

			_command.put("/commerce.cpdefinitionoptionvaluerel/reset-cp-instance-cp-definition-option-value-rel", _params);
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

	public JSONObject searchCpDefinitionOptionValueRels(long companyId, long groupId, long cpDefinitionOptionRelId, String keywords, int start, int end, JSONObjectWrapper sort) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("cpDefinitionOptionRelId", cpDefinitionOptionRelId);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);
			mangleWrapper(_params, "sort", "com.liferay.portal.kernel.search.Sort", sort);

			_command.put("/commerce.cpdefinitionoptionvaluerel/search-cp-definition-option-value-rels", _params);
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

	public JSONObject updateCpDefinitionOptionValueRel(long cpDefinitionOptionValueRelId, JSONObject nameMap, double priority, String key, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionOptionValueRelId", cpDefinitionOptionValueRelId);
			_params.put("key", checkNull(key));
			_params.put("nameMap", checkNull(nameMap));
			_params.put("priority", priority);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinitionoptionvaluerel/update-cp-definition-option-value-rel", _params);
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

	public JSONObject updateCpDefinitionOptionValueRel(long cpDefinitionOptionValueRelId, JSONObject nameMap, double priority, String key, long cpInstanceId, int quantity, boolean preselected, JSONObject price, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionOptionValueRelId", cpDefinitionOptionValueRelId);
			_params.put("cpInstanceId", cpInstanceId);
			_params.put("key", checkNull(key));
			_params.put("nameMap", checkNull(nameMap));
			_params.put("preselected", preselected);
			_params.put("price", checkNull(price));
			_params.put("priority", priority);
			_params.put("quantity", quantity);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinitionoptionvaluerel/update-cp-definition-option-value-rel", _params);
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

	public JSONObject updateCpDefinitionOptionValueRel(long cpDefinitionOptionValueRelId, JSONObject nameMap, double priority, String key, long cpInstanceId, int quantity, JSONObject price, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionOptionValueRelId", cpDefinitionOptionValueRelId);
			_params.put("cpInstanceId", cpInstanceId);
			_params.put("key", checkNull(key));
			_params.put("nameMap", checkNull(nameMap));
			_params.put("price", checkNull(price));
			_params.put("priority", priority);
			_params.put("quantity", quantity);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinitionoptionvaluerel/update-cp-definition-option-value-rel", _params);
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

	public JSONObject updateCpDefinitionOptionValueRelPreselected(long cpDefinitionOptionValueRelId, boolean preselected) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionOptionValueRelId", cpDefinitionOptionValueRelId);
			_params.put("preselected", preselected);

			_command.put("/commerce.cpdefinitionoptionvaluerel/update-cp-definition-option-value-rel-preselected", _params);
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