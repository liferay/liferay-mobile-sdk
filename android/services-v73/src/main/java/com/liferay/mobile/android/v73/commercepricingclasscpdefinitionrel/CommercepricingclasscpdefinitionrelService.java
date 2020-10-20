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

package com.liferay.mobile.android.v73.commercepricingclasscpdefinitionrel;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommercepricingclasscpdefinitionrelService extends BaseService {

	public CommercepricingclasscpdefinitionrelService(Session session) {
		super(session);
	}

	public JSONObject addCommercePricingClassCpDefinitionRel(long commercePricingClassId, long cpDefinitionId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePricingClassId", commercePricingClassId);
			_params.put("cpDefinitionId", cpDefinitionId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepricingclasscpdefinitionrel/add-commerce-pricing-class-cp-definition-rel", _params);
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

	public JSONObject deleteCommercePricingClassCpDefinitionRel(JSONObjectWrapper commercePricingClassCPDefinitionRel) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			mangleWrapper(_params, "commercePricingClassCPDefinitionRel", "com.liferay.commerce.pricing.model.CommercePricingClassCPDefinitionRel", commercePricingClassCPDefinitionRel);

			_command.put("/commerce.commercepricingclasscpdefinitionrel/delete-commerce-pricing-class-cp-definition-rel", _params);
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

	public JSONObject deleteCommercePricingClassCpDefinitionRel(long commercePricingClassCPDefinitionRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePricingClassCPDefinitionRelId", commercePricingClassCPDefinitionRelId);

			_command.put("/commerce.commercepricingclasscpdefinitionrel/delete-commerce-pricing-class-cp-definition-rel", _params);
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

	public JSONObject fetchCommercePricingClassCpDefinitionRel(long commercePricingClassId, long cpDefinitionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePricingClassId", commercePricingClassId);
			_params.put("cpDefinitionId", cpDefinitionId);

			_command.put("/commerce.commercepricingclasscpdefinitionrel/fetch-commerce-pricing-class-cp-definition-rel", _params);
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

	public JSONObject getCommercePricingClassCpDefinitionRel(long commercePricingClassCPDefinitionRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePricingClassCPDefinitionRelId", commercePricingClassCPDefinitionRelId);

			_command.put("/commerce.commercepricingclasscpdefinitionrel/get-commerce-pricing-class-cp-definition-rel", _params);
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

	public JSONArray getCommercePricingClassCpDefinitionRelByClassId(long commercePricingClassId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePricingClassId", commercePricingClassId);

			_command.put("/commerce.commercepricingclasscpdefinitionrel/get-commerce-pricing-class-cp-definition-rel-by-class-id", _params);
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

	public JSONArray getCommercePricingClassCpDefinitionRels(long commercePricingClassId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePricingClassId", commercePricingClassId);
			_params.put("end", end);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.pricing.model.CommercePricingClassCPDefinitionRel>", orderByComparator);

			_command.put("/commerce.commercepricingclasscpdefinitionrel/get-commerce-pricing-class-cp-definition-rels", _params);
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

	public Integer getCommercePricingClassCpDefinitionRelsCount(long commercePricingClassId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePricingClassId", commercePricingClassId);

			_command.put("/commerce.commercepricingclasscpdefinitionrel/get-commerce-pricing-class-cp-definition-rels-count", _params);
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

	public Integer getCommercePricingClassCpDefinitionRelsCount(long commercePricingClassId, String name, String languageId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePricingClassId", commercePricingClassId);
			_params.put("languageId", checkNull(languageId));
			_params.put("name", checkNull(name));

			_command.put("/commerce.commercepricingclasscpdefinitionrel/get-commerce-pricing-class-cp-definition-rels-count", _params);
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

	public JSONArray getCpDefinitionIds(long commercePricingClassId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePricingClassId", commercePricingClassId);

			_command.put("/commerce.commercepricingclasscpdefinitionrel/get-cp-definition-ids", _params);
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

	public JSONArray searchByCommercePricingClassId(long commercePricingClassId, String name, String languageId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePricingClassId", commercePricingClassId);
			_params.put("end", end);
			_params.put("languageId", checkNull(languageId));
			_params.put("name", checkNull(name));
			_params.put("start", start);

			_command.put("/commerce.commercepricingclasscpdefinitionrel/search-by-commerce-pricing-class-id", _params);
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