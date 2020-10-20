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

package com.liferay.mobile.android.v73.commercepaymentmethodgrouprel;

import com.liferay.mobile.android.http.file.UploadData;
import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommercepaymentmethodgrouprelService extends BaseService {

	public CommercepaymentmethodgrouprelService(Session session) {
		super(session);
	}

	public JSONObject addCommerceAddressRestriction(long classPK, long commerceCountryId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classPK", classPK);
			_params.put("commerceCountryId", commerceCountryId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepaymentmethodgrouprel/add-commerce-address-restriction", _params);
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

	public JSONObject addCommerceAddressRestriction(long userId, long groupId, long classPK, long commerceCountryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classPK", classPK);
			_params.put("commerceCountryId", commerceCountryId);
			_params.put("groupId", groupId);
			_params.put("userId", userId);

			_command.put("/commerce.commercepaymentmethodgrouprel/add-commerce-address-restriction", _params);
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

	public JSONObject addCommercePaymentMethodGroupRel(long userId, long groupId, JSONObject nameMap, JSONObject descriptionMap, UploadData imageFile, String engineKey, double priority, boolean active) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("engineKey", checkNull(engineKey));
			_params.put("groupId", groupId);
			_params.put("imageFile", checkNull(imageFile));
			_params.put("nameMap", checkNull(nameMap));
			_params.put("priority", priority);
			_params.put("userId", userId);

			_command.put("/commerce.commercepaymentmethodgrouprel/add-commerce-payment-method-group-rel", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.upload(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public void deleteCommerceAddressRestriction(long commerceAddressRestrictionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAddressRestrictionId", commerceAddressRestrictionId);

			_command.put("/commerce.commercepaymentmethodgrouprel/delete-commerce-address-restriction", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void deleteCommerceAddressRestrictions(long commercePaymentMethodGroupRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePaymentMethodGroupRelId", commercePaymentMethodGroupRelId);

			_command.put("/commerce.commercepaymentmethodgrouprel/delete-commerce-address-restrictions", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void deleteCommercePaymentMethodGroupRel(long commercePaymentMethodGroupRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePaymentMethodGroupRelId", commercePaymentMethodGroupRelId);

			_command.put("/commerce.commercepaymentmethodgrouprel/delete-commerce-payment-method-group-rel", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchCommercePaymentMethodGroupRel(long groupId, String engineKey) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("engineKey", checkNull(engineKey));
			_params.put("groupId", groupId);

			_command.put("/commerce.commercepaymentmethodgrouprel/fetch-commerce-payment-method-group-rel", _params);
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

	public JSONArray getCommerceAddressRestrictions(long classPK, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classPK", classPK);
			_params.put("end", end);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceAddressRestriction>", orderByComparator);

			_command.put("/commerce.commercepaymentmethodgrouprel/get-commerce-address-restrictions", _params);
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

	public Integer getCommerceAddressRestrictionsCount(long classPK) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classPK", classPK);

			_command.put("/commerce.commercepaymentmethodgrouprel/get-commerce-address-restrictions-count", _params);
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

	public JSONObject getCommercePaymentMethodGroupRel(long commercePaymentMethodGroupRelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePaymentMethodGroupRelId", commercePaymentMethodGroupRelId);

			_command.put("/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rel", _params);
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

	public JSONObject getCommercePaymentMethodGroupRel(long groupId, String engineKey) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("engineKey", checkNull(engineKey));
			_params.put("groupId", groupId);

			_command.put("/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rel", _params);
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

	public JSONArray getCommercePaymentMethodGroupRels(long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);

			_command.put("/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rels", _params);
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

	public JSONArray getCommercePaymentMethodGroupRels(long groupId, boolean active) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("groupId", groupId);

			_command.put("/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rels", _params);
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

	public JSONArray getCommercePaymentMethodGroupRels(long groupId, boolean active, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);

			_command.put("/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rels", _params);
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

	public JSONArray getCommercePaymentMethodGroupRels(long groupId, boolean active, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.payment.model.CommercePaymentMethodGroupRel>", orderByComparator);

			_command.put("/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rels", _params);
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

	public JSONArray getCommercePaymentMethodGroupRels(long groupId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.payment.model.CommercePaymentMethodGroupRel>", orderByComparator);

			_command.put("/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rels", _params);
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

	public JSONArray getCommercePaymentMethodGroupRels(long groupId, long commerceCountryId, boolean active) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("commerceCountryId", commerceCountryId);
			_params.put("groupId", groupId);

			_command.put("/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rels", _params);
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

	public Integer getCommercePaymentMethodGroupRelsCount(long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);

			_command.put("/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rels-count", _params);
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

	public Integer getCommercePaymentMethodGroupRelsCount(long groupId, boolean active) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("groupId", groupId);

			_command.put("/commerce.commercepaymentmethodgrouprel/get-commerce-payment-method-group-rels-count", _params);
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

	public JSONObject setActive(long commercePaymentMethodGroupRelId, boolean active) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("commercePaymentMethodGroupRelId", commercePaymentMethodGroupRelId);

			_command.put("/commerce.commercepaymentmethodgrouprel/set-active", _params);
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

	public JSONObject updateCommercePaymentMethodGroupRel(long commercePaymentMethodGroupRelId, JSONObject nameMap, JSONObject descriptionMap, UploadData imageFile, double priority, boolean active) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("commercePaymentMethodGroupRelId", commercePaymentMethodGroupRelId);
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("imageFile", checkNull(imageFile));
			_params.put("nameMap", checkNull(nameMap));
			_params.put("priority", priority);

			_command.put("/commerce.commercepaymentmethodgrouprel/update-commerce-payment-method-group-rel", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.upload(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

}