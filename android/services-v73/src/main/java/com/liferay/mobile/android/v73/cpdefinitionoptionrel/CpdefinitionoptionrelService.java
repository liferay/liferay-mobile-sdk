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

package com.liferay.mobile.android.v73.cpdefinitionoptionrel;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CpdefinitionoptionrelService extends BaseService {

	public CpdefinitionoptionrelService(Session session) {
		super(session);
	}

	public JSONObject addCpDefinitionOptionRel(long cpDefinitionId, long cpOptionId, JSONObject nameMap, JSONObject descriptionMap, String ddmFormFieldTypeName, double priority, boolean facetable, boolean required, boolean skuContributor, boolean importOptionValue, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("cpOptionId", cpOptionId);
			_params.put("ddmFormFieldTypeName", checkNull(ddmFormFieldTypeName));
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("facetable", facetable);
			_params.put("importOptionValue", importOptionValue);
			_params.put("nameMap", checkNull(nameMap));
			_params.put("priority", priority);
			_params.put("required", required);
			_params.put("skuContributor", skuContributor);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinitionoptionrel/add-cp-definition-option-rel", _params);
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

	public JSONObject addCpDefinitionOptionRel(long cpDefinitionId, long cpOptionId, JSONObject nameMap, JSONObject descriptionMap, String ddmFormFieldTypeName, double priority, boolean facetable, boolean required, boolean skuContributor, boolean importOptionValue, String priceType, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("cpOptionId", cpOptionId);
			_params.put("ddmFormFieldTypeName", checkNull(ddmFormFieldTypeName));
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("facetable", facetable);
			_params.put("importOptionValue", importOptionValue);
			_params.put("nameMap", checkNull(nameMap));
			_params.put("priceType", checkNull(priceType));
			_params.put("priority", priority);
			_params.put("required", required);
			_params.put("skuContributor", skuContributor);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinitionoptionrel/add-cp-definition-option-rel", _params);
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

	public JSONObject addCpDefinitionOptionRel(long cpDefinitionId, long cpOptionId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("cpOptionId", cpOptionId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinitionoptionrel/add-cp-definition-option-rel", _params);
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

	public void deleteCpDefinitionOptionRel(long cpDefinitionOptionRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionOptionRelId", cpDefinitionOptionRelId);

			_command.put("/commerce.cpdefinitionoptionrel/delete-cp-definition-option-rel", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchCpDefinitionOptionRel(long cpDefinitionOptionRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionOptionRelId", cpDefinitionOptionRelId);

			_command.put("/commerce.cpdefinitionoptionrel/fetch-cp-definition-option-rel", _params);
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

	public JSONObject fetchCpDefinitionOptionRel(long cpDefinitionId, long cpOptionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("cpOptionId", cpOptionId);

			_command.put("/commerce.cpdefinitionoptionrel/fetch-cp-definition-option-rel", _params);
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

	public JSONObject getCpDefinitionOptionRel(long cpDefinitionOptionRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionOptionRelId", cpDefinitionOptionRelId);

			_command.put("/commerce.cpdefinitionoptionrel/get-cp-definition-option-rel", _params);
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

	public JSONObject getCpDefinitionOptionRelCpDefinitionOptionValueRelIds(long cpDefinitionId, String json) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("json", checkNull(json));

			_command.put("/commerce.cpdefinitionoptionrel/get-cp-definition-option-rel-cp-definition-option-value-rel-ids", _params);
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

	public JSONObject getCpDefinitionOptionRelKeysCpDefinitionOptionValueRelKeys(long cpInstanceId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpInstanceId", cpInstanceId);

			_command.put("/commerce.cpdefinitionoptionrel/get-cp-definition-option-rel-keys-cp-definition-option-value-rel-keys", _params);
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

	public JSONArray getCpDefinitionOptionRels(long cpDefinitionId, boolean skuContributor) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("skuContributor", skuContributor);

			_command.put("/commerce.cpdefinitionoptionrel/get-cp-definition-option-rels", _params);
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

	public JSONArray getCpDefinitionOptionRels(long cpDefinitionId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("end", end);
			_params.put("start", start);

			_command.put("/commerce.cpdefinitionoptionrel/get-cp-definition-option-rels", _params);
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

	public JSONArray getCpDefinitionOptionRels(long cpDefinitionId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("end", end);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.product.model.CPDefinitionOptionRel>", orderByComparator);

			_command.put("/commerce.cpdefinitionoptionrel/get-cp-definition-option-rels", _params);
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

	public Integer getCpDefinitionOptionRelsCount(long cpDefinitionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);

			_command.put("/commerce.cpdefinitionoptionrel/get-cp-definition-option-rels-count", _params);
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

	public Integer getCpDefinitionOptionRelsCount(long cpDefinitionId, boolean skuContributor) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("skuContributor", skuContributor);

			_command.put("/commerce.cpdefinitionoptionrel/get-cp-definition-option-rels-count", _params);
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

	public JSONObject searchCpDefinitionOptionRels(long companyId, long groupId, long cpDefinitionId, String keywords, int start, int end, JSONObjectWrapper sort) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);
			mangleWrapper(_params, "sort", "com.liferay.portal.kernel.search.Sort", sort);

			_command.put("/commerce.cpdefinitionoptionrel/search-cp-definition-option-rels", _params);
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

	public JSONObject updateCpDefinitionOptionRel(long cpDefinitionOptionRelId, long cpOptionId, JSONObject nameMap, JSONObject descriptionMap, String ddmFormFieldTypeName, double priority, boolean facetable, boolean required, boolean skuContributor, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionOptionRelId", cpDefinitionOptionRelId);
			_params.put("cpOptionId", cpOptionId);
			_params.put("ddmFormFieldTypeName", checkNull(ddmFormFieldTypeName));
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("facetable", facetable);
			_params.put("nameMap", checkNull(nameMap));
			_params.put("priority", priority);
			_params.put("required", required);
			_params.put("skuContributor", skuContributor);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinitionoptionrel/update-cp-definition-option-rel", _params);
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

	public JSONObject updateCpDefinitionOptionRel(long cpDefinitionOptionRelId, long cpOptionId, JSONObject nameMap, JSONObject descriptionMap, String ddmFormFieldTypeName, double priority, boolean facetable, boolean required, boolean skuContributor, String priceType, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionOptionRelId", cpDefinitionOptionRelId);
			_params.put("cpOptionId", cpOptionId);
			_params.put("ddmFormFieldTypeName", checkNull(ddmFormFieldTypeName));
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("facetable", facetable);
			_params.put("nameMap", checkNull(nameMap));
			_params.put("priceType", checkNull(priceType));
			_params.put("priority", priority);
			_params.put("required", required);
			_params.put("skuContributor", skuContributor);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinitionoptionrel/update-cp-definition-option-rel", _params);
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