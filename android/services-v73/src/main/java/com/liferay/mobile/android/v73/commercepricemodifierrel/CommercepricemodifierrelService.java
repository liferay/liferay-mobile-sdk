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

package com.liferay.mobile.android.v73.commercepricemodifierrel;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommercepricemodifierrelService extends BaseService {

	public CommercepricemodifierrelService(Session session) {
		super(session);
	}

	public JSONObject addCommercePriceModifierRel(long commercePriceModifierId, String className, long classPK, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", checkNull(className));
			_params.put("classPK", classPK);
			_params.put("commercePriceModifierId", commercePriceModifierId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepricemodifierrel/add-commerce-price-modifier-rel", _params);
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

	public void deleteCommercePriceModifierRel(long commercePriceModifierRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceModifierRelId", commercePriceModifierRelId);

			_command.put("/commerce.commercepricemodifierrel/delete-commerce-price-modifier-rel", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchCommercePriceModifierRel(long commercePriceModifierId, String className, long classPK) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", checkNull(className));
			_params.put("classPK", classPK);
			_params.put("commercePriceModifierId", commercePriceModifierId);

			_command.put("/commerce.commercepricemodifierrel/fetch-commerce-price-modifier-rel", _params);
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

	public JSONArray getCategoriesCommercePriceModifierRels(long commercePriceModifierId, String name, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceModifierId", commercePriceModifierId);
			_params.put("end", end);
			_params.put("name", checkNull(name));
			_params.put("start", start);

			_command.put("/commerce.commercepricemodifierrel/get-categories-commerce-price-modifier-rels", _params);
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

	public Integer getCategoriesCommercePriceModifierRelsCount(long commercePriceModifierId, String name) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceModifierId", commercePriceModifierId);
			_params.put("name", checkNull(name));

			_command.put("/commerce.commercepricemodifierrel/get-categories-commerce-price-modifier-rels-count", _params);
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

	public JSONArray getClassPKs(long commercePriceModifierRelId, String className) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", checkNull(className));
			_params.put("commercePriceModifierRelId", commercePriceModifierRelId);

			_command.put("/commerce.commercepricemodifierrel/get-class-p-ks", _params);
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

	public JSONObject getCommercePriceModifierRel(long commercePriceModifierRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceModifierRelId", commercePriceModifierRelId);

			_command.put("/commerce.commercepricemodifierrel/get-commerce-price-modifier-rel", _params);
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

	public JSONArray getCommercePriceModifierRels(long commercePriceModifierRelId, String className) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", checkNull(className));
			_params.put("commercePriceModifierRelId", commercePriceModifierRelId);

			_command.put("/commerce.commercepricemodifierrel/get-commerce-price-modifier-rels", _params);
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

	public JSONArray getCommercePriceModifierRels(long commercePriceModifierRelId, String className, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", checkNull(className));
			_params.put("commercePriceModifierRelId", commercePriceModifierRelId);
			_params.put("end", end);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.pricing.model.CommercePriceModifierRel>", orderByComparator);

			_command.put("/commerce.commercepricemodifierrel/get-commerce-price-modifier-rels", _params);
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

	public Integer getCommercePriceModifierRelsCount(long commercePriceModifierRelId, String className) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", checkNull(className));
			_params.put("commercePriceModifierRelId", commercePriceModifierRelId);

			_command.put("/commerce.commercepricemodifierrel/get-commerce-price-modifier-rels-count", _params);
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

	public JSONArray getCommercePriceModifiersRels(String className, long classPK) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", checkNull(className));
			_params.put("classPK", classPK);

			_command.put("/commerce.commercepricemodifierrel/get-commerce-price-modifiers-rels", _params);
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

	public JSONArray getCommercePricingClassesCommercePriceModifierRels(long commercePriceModifierId, String title, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceModifierId", commercePriceModifierId);
			_params.put("end", end);
			_params.put("start", start);
			_params.put("title", checkNull(title));

			_command.put("/commerce.commercepricemodifierrel/get-commerce-pricing-classes-commerce-price-modifier-rels", _params);
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

	public Integer getCommercePricingClassesCommercePriceModifierRelsCount(long commercePriceModifierId, String title) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceModifierId", commercePriceModifierId);
			_params.put("title", checkNull(title));

			_command.put("/commerce.commercepricemodifierrel/get-commerce-pricing-classes-commerce-price-modifier-rels-count", _params);
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

	public JSONArray getCpDefinitionsCommercePriceModifierRels(long commercePriceModifierId, String name, String languageId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceModifierId", commercePriceModifierId);
			_params.put("end", end);
			_params.put("languageId", checkNull(languageId));
			_params.put("name", checkNull(name));
			_params.put("start", start);

			_command.put("/commerce.commercepricemodifierrel/get-cp-definitions-commerce-price-modifier-rels", _params);
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

	public Integer getCpDefinitionsCommercePriceModifierRelsCount(long commercePriceModifierId, String name, String languageId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceModifierId", commercePriceModifierId);
			_params.put("languageId", checkNull(languageId));
			_params.put("name", checkNull(name));

			_command.put("/commerce.commercepricemodifierrel/get-cp-definitions-commerce-price-modifier-rels-count", _params);
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

}