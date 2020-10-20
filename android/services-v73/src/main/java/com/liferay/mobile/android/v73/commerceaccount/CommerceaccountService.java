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

package com.liferay.mobile.android.v73.commerceaccount;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommerceaccountService extends BaseService {

	public CommerceaccountService(Session session) {
		super(session);
	}

	public JSONObject addBusinessCommerceAccount(String name, long parentCommerceAccountId, String email, String taxId, boolean active, String externalReferenceCode, JSONArray userIds, JSONArray emailAddresses, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("email", checkNull(email));
			_params.put("emailAddresses", checkNull(emailAddresses));
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));
			_params.put("name", checkNull(name));
			_params.put("parentCommerceAccountId", parentCommerceAccountId);
			_params.put("taxId", checkNull(taxId));
			_params.put("userIds", checkNull(userIds));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceaccount/add-business-commerce-account", _params);
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

	public JSONObject addCommerceAccount(String name, long parentCommerceAccountId, String email, String taxId, int type, boolean active, String externalReferenceCode, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("email", checkNull(email));
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));
			_params.put("name", checkNull(name));
			_params.put("parentCommerceAccountId", parentCommerceAccountId);
			_params.put("taxId", checkNull(taxId));
			_params.put("type", type);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceaccount/add-commerce-account", _params);
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

	public void deleteCommerceAccount(long commerceAccountId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);

			_command.put("/commerce.commerceaccount/delete-commerce-account", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchByExternalReferenceCode(long companyId, String externalReferenceCode) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));

			_command.put("/commerce.commerceaccount/fetch-by-external-reference-code", _params);
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

	public JSONObject fetchCommerceAccount(long commerceAccountId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);

			_command.put("/commerce.commerceaccount/fetch-commerce-account", _params);
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

	public JSONObject getCommerceAccount(long commerceAccountId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);

			_command.put("/commerce.commerceaccount/get-commerce-account", _params);
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

	public JSONObject getPersonalCommerceAccount(long userId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);

			_command.put("/commerce.commerceaccount/get-personal-commerce-account", _params);
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

	public JSONArray getUserCommerceAccounts(long userId, long parentCommerceAccountId, int commerceSiteType, String keywords, boolean active, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("commerceSiteType", commerceSiteType);
			_params.put("end", end);
			_params.put("keywords", checkNull(keywords));
			_params.put("parentCommerceAccountId", parentCommerceAccountId);
			_params.put("start", start);
			_params.put("userId", userId);

			_command.put("/commerce.commerceaccount/get-user-commerce-accounts", _params);
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

	public JSONArray getUserCommerceAccounts(long userId, long parentCommerceAccountId, int commerceSiteType, String keywords, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceSiteType", commerceSiteType);
			_params.put("end", end);
			_params.put("keywords", checkNull(keywords));
			_params.put("parentCommerceAccountId", parentCommerceAccountId);
			_params.put("start", start);
			_params.put("userId", userId);

			_command.put("/commerce.commerceaccount/get-user-commerce-accounts", _params);
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

	public Integer getUserCommerceAccountsCount(long userId, long parentCommerceAccountId, int commerceSiteType, String keywords) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceSiteType", commerceSiteType);
			_params.put("keywords", checkNull(keywords));
			_params.put("parentCommerceAccountId", parentCommerceAccountId);
			_params.put("userId", userId);

			_command.put("/commerce.commerceaccount/get-user-commerce-accounts-count", _params);
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

	public Integer getUserCommerceAccountsCount(long userId, long parentCommerceAccountId, int commerceSiteType, String keywords, boolean active) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("commerceSiteType", commerceSiteType);
			_params.put("keywords", checkNull(keywords));
			_params.put("parentCommerceAccountId", parentCommerceAccountId);
			_params.put("userId", userId);

			_command.put("/commerce.commerceaccount/get-user-commerce-accounts-count", _params);
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

	public JSONObject setActive(long commerceAccountId, boolean active) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("commerceAccountId", commerceAccountId);

			_command.put("/commerce.commerceaccount/set-active", _params);
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

	public JSONObject updateCommerceAccount(long commerceAccountId, String name, boolean logo, byte[] logoBytes, String email, String taxId, boolean active, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("commerceAccountId", commerceAccountId);
			_params.put("email", checkNull(email));
			_params.put("logo", logo);
			_params.put("logoBytes", toString(logoBytes));
			_params.put("name", checkNull(name));
			_params.put("taxId", checkNull(taxId));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceaccount/update-commerce-account", _params);
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

	public JSONObject updateCommerceAccount(long commerceAccountId, String name, boolean logo, byte[] logoBytes, String email, String taxId, boolean active, long defaultBillingAddressId, long defaultShippingAddressId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("commerceAccountId", commerceAccountId);
			_params.put("defaultBillingAddressId", defaultBillingAddressId);
			_params.put("defaultShippingAddressId", defaultShippingAddressId);
			_params.put("email", checkNull(email));
			_params.put("logo", logo);
			_params.put("logoBytes", toString(logoBytes));
			_params.put("name", checkNull(name));
			_params.put("taxId", checkNull(taxId));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceaccount/update-commerce-account", _params);
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

	public JSONObject updateCommerceAccount(long commerceAccountId, String name, boolean logo, byte[] logoBytes, String email, String taxId, boolean active, long defaultBillingAddressId, long defaultShippingAddressId, String externalReferenceCode, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("commerceAccountId", commerceAccountId);
			_params.put("defaultBillingAddressId", defaultBillingAddressId);
			_params.put("defaultShippingAddressId", defaultShippingAddressId);
			_params.put("email", checkNull(email));
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));
			_params.put("logo", logo);
			_params.put("logoBytes", toString(logoBytes));
			_params.put("name", checkNull(name));
			_params.put("taxId", checkNull(taxId));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceaccount/update-commerce-account", _params);
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

	public JSONObject updateDefaultBillingAddress(long commerceAccountId, long commerceAddressId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);
			_params.put("commerceAddressId", commerceAddressId);

			_command.put("/commerce.commerceaccount/update-default-billing-address", _params);
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

	public JSONObject updateDefaultShippingAddress(long commerceAccountId, long commerceAddressId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);
			_params.put("commerceAddressId", commerceAddressId);

			_command.put("/commerce.commerceaccount/update-default-shipping-address", _params);
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

	public JSONObject upsertCommerceAccount(String name, long parentCommerceAccountId, boolean logo, byte[] logoBytes, String email, String taxId, int type, boolean active, String externalReferenceCode, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("email", checkNull(email));
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));
			_params.put("logo", logo);
			_params.put("logoBytes", toString(logoBytes));
			_params.put("name", checkNull(name));
			_params.put("parentCommerceAccountId", parentCommerceAccountId);
			_params.put("taxId", checkNull(taxId));
			_params.put("type", type);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commerceaccount/upsert-commerce-account", _params);
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