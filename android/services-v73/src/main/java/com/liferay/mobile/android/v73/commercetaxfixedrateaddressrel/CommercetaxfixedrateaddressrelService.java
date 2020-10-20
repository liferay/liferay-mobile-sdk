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

package com.liferay.mobile.android.v73.commercetaxfixedrateaddressrel;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommercetaxfixedrateaddressrelService extends BaseService {

	public CommercetaxfixedrateaddressrelService(Session session) {
		super(session);
	}

	public JSONObject addCommerceTaxFixedRateAddressRel(long userId, long groupId, long commerceTaxMethodId, long cpTaxCategoryId, long commerceCountryId, long commerceRegionId, String zip, double rate) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceCountryId", commerceCountryId);
			_params.put("commerceRegionId", commerceRegionId);
			_params.put("commerceTaxMethodId", commerceTaxMethodId);
			_params.put("cpTaxCategoryId", cpTaxCategoryId);
			_params.put("groupId", groupId);
			_params.put("rate", rate);
			_params.put("userId", userId);
			_params.put("zip", checkNull(zip));

			_command.put("/commerce.commercetaxfixedrateaddressrel/add-commerce-tax-fixed-rate-address-rel", _params);
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

	public JSONObject addCommerceTaxFixedRateAddressRel(long commerceTaxMethodId, long cpTaxCategoryId, long commerceCountryId, long commerceRegionId, String zip, double rate, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceCountryId", commerceCountryId);
			_params.put("commerceRegionId", commerceRegionId);
			_params.put("commerceTaxMethodId", commerceTaxMethodId);
			_params.put("cpTaxCategoryId", cpTaxCategoryId);
			_params.put("rate", rate);
			_params.put("zip", checkNull(zip));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercetaxfixedrateaddressrel/add-commerce-tax-fixed-rate-address-rel", _params);
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

	public void deleteCommerceTaxFixedRateAddressRel(long commerceTaxFixedRateAddressRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceTaxFixedRateAddressRelId", commerceTaxFixedRateAddressRelId);

			_command.put("/commerce.commercetaxfixedrateaddressrel/delete-commerce-tax-fixed-rate-address-rel", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchCommerceTaxFixedRateAddressRel(long commerceTaxFixedRateAddressRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceTaxFixedRateAddressRelId", commerceTaxFixedRateAddressRelId);

			_command.put("/commerce.commercetaxfixedrateaddressrel/fetch-commerce-tax-fixed-rate-address-rel", _params);
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

	public JSONArray getCommerceTaxMethodFixedRateAddressRels(long groupId, long commerceTaxMethodId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceTaxMethodId", commerceTaxMethodId);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.tax.engine.fixed.model.CommerceTaxFixedRateAddressRel>", orderByComparator);

			_command.put("/commerce.commercetaxfixedrateaddressrel/get-commerce-tax-method-fixed-rate-address-rels", _params);
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

	public Integer getCommerceTaxMethodFixedRateAddressRelsCount(long groupId, long commerceTaxMethodId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceTaxMethodId", commerceTaxMethodId);
			_params.put("groupId", groupId);

			_command.put("/commerce.commercetaxfixedrateaddressrel/get-commerce-tax-method-fixed-rate-address-rels-count", _params);
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

	public JSONObject updateCommerceTaxFixedRateAddressRel(long commerceTaxFixedRateAddressRelId, long commerceCountryId, long commerceRegionId, String zip, double rate) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceCountryId", commerceCountryId);
			_params.put("commerceRegionId", commerceRegionId);
			_params.put("commerceTaxFixedRateAddressRelId", commerceTaxFixedRateAddressRelId);
			_params.put("rate", rate);
			_params.put("zip", checkNull(zip));

			_command.put("/commerce.commercetaxfixedrateaddressrel/update-commerce-tax-fixed-rate-address-rel", _params);
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