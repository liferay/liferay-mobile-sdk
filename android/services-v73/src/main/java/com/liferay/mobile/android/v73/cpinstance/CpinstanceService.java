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

package com.liferay.mobile.android.v73.cpinstance;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CpinstanceService extends BaseService {

	public CpinstanceService(Session session) {
		super(session);
	}

	public JSONObject addCpInstance(long cpDefinitionId, long groupId, String sku, String gtin, String manufacturerPartNumber, boolean purchasable, JSONObject cpDefinitionOptionRelIdCPDefinitionOptionValueRelIds, boolean published, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("cpDefinitionOptionRelIdCPDefinitionOptionValueRelIds", checkNull(cpDefinitionOptionRelIdCPDefinitionOptionValueRelIds));
			_params.put("displayDateDay", displayDateDay);
			_params.put("displayDateHour", displayDateHour);
			_params.put("displayDateMinute", displayDateMinute);
			_params.put("displayDateMonth", displayDateMonth);
			_params.put("displayDateYear", displayDateYear);
			_params.put("expirationDateDay", expirationDateDay);
			_params.put("expirationDateHour", expirationDateHour);
			_params.put("expirationDateMinute", expirationDateMinute);
			_params.put("expirationDateMonth", expirationDateMonth);
			_params.put("expirationDateYear", expirationDateYear);
			_params.put("groupId", groupId);
			_params.put("gtin", checkNull(gtin));
			_params.put("manufacturerPartNumber", checkNull(manufacturerPartNumber));
			_params.put("neverExpire", neverExpire);
			_params.put("published", published);
			_params.put("purchasable", purchasable);
			_params.put("sku", checkNull(sku));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpinstance/add-cp-instance", _params);
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

	public JSONObject addCpInstance(long cpDefinitionId, long groupId, String sku, String gtin, String manufacturerPartNumber, boolean purchasable, JSONObject cpDefinitionOptionRelIdCPDefinitionOptionValueRelIds, boolean published, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, String unspsc, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("cpDefinitionOptionRelIdCPDefinitionOptionValueRelIds", checkNull(cpDefinitionOptionRelIdCPDefinitionOptionValueRelIds));
			_params.put("displayDateDay", displayDateDay);
			_params.put("displayDateHour", displayDateHour);
			_params.put("displayDateMinute", displayDateMinute);
			_params.put("displayDateMonth", displayDateMonth);
			_params.put("displayDateYear", displayDateYear);
			_params.put("expirationDateDay", expirationDateDay);
			_params.put("expirationDateHour", expirationDateHour);
			_params.put("expirationDateMinute", expirationDateMinute);
			_params.put("expirationDateMonth", expirationDateMonth);
			_params.put("expirationDateYear", expirationDateYear);
			_params.put("groupId", groupId);
			_params.put("gtin", checkNull(gtin));
			_params.put("manufacturerPartNumber", checkNull(manufacturerPartNumber));
			_params.put("neverExpire", neverExpire);
			_params.put("published", published);
			_params.put("purchasable", purchasable);
			_params.put("sku", checkNull(sku));
			_params.put("unspsc", checkNull(unspsc));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpinstance/add-cp-instance", _params);
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

	public JSONObject addCpInstance(long cpDefinitionId, long groupId, String sku, String gtin, String manufacturerPartNumber, boolean purchasable, String json, boolean published, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("displayDateDay", displayDateDay);
			_params.put("displayDateHour", displayDateHour);
			_params.put("displayDateMinute", displayDateMinute);
			_params.put("displayDateMonth", displayDateMonth);
			_params.put("displayDateYear", displayDateYear);
			_params.put("expirationDateDay", expirationDateDay);
			_params.put("expirationDateHour", expirationDateHour);
			_params.put("expirationDateMinute", expirationDateMinute);
			_params.put("expirationDateMonth", expirationDateMonth);
			_params.put("expirationDateYear", expirationDateYear);
			_params.put("groupId", groupId);
			_params.put("gtin", checkNull(gtin));
			_params.put("json", checkNull(json));
			_params.put("manufacturerPartNumber", checkNull(manufacturerPartNumber));
			_params.put("neverExpire", neverExpire);
			_params.put("published", published);
			_params.put("purchasable", purchasable);
			_params.put("sku", checkNull(sku));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpinstance/add-cp-instance", _params);
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

	public JSONObject addCpInstance(long cpDefinitionId, long groupId, String sku, String gtin, String manufacturerPartNumber, boolean purchasable, String json, boolean published, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, String unspsc, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("displayDateDay", displayDateDay);
			_params.put("displayDateHour", displayDateHour);
			_params.put("displayDateMinute", displayDateMinute);
			_params.put("displayDateMonth", displayDateMonth);
			_params.put("displayDateYear", displayDateYear);
			_params.put("expirationDateDay", expirationDateDay);
			_params.put("expirationDateHour", expirationDateHour);
			_params.put("expirationDateMinute", expirationDateMinute);
			_params.put("expirationDateMonth", expirationDateMonth);
			_params.put("expirationDateYear", expirationDateYear);
			_params.put("groupId", groupId);
			_params.put("gtin", checkNull(gtin));
			_params.put("json", checkNull(json));
			_params.put("manufacturerPartNumber", checkNull(manufacturerPartNumber));
			_params.put("neverExpire", neverExpire);
			_params.put("published", published);
			_params.put("purchasable", purchasable);
			_params.put("sku", checkNull(sku));
			_params.put("unspsc", checkNull(unspsc));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpinstance/add-cp-instance", _params);
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

	public void buildCpInstances(long cpDefinitionId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpinstance/build-cp-instances", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void deleteCpInstance(long cpInstanceId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpInstanceId", cpInstanceId);

			_command.put("/commerce.cpinstance/delete-cp-instance", _params);
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

			_command.put("/commerce.cpinstance/fetch-by-external-reference-code", _params);
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

	public JSONObject fetchCpInstance(long cpInstanceId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpInstanceId", cpInstanceId);

			_command.put("/commerce.cpinstance/fetch-cp-instance", _params);
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

	public JSONObject fetchCProductInstance(long cProductId, String cpInstanceUuid) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpInstanceUuid", checkNull(cpInstanceUuid));
			_params.put("cProductId", cProductId);

			_command.put("/commerce.cpinstance/fetch-c-product-instance", _params);
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

	public JSONArray getCpDefinitionInstances(long cpDefinitionId, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("end", end);
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.product.model.CPInstance>", orderByComparator);

			_command.put("/commerce.cpinstance/get-cp-definition-instances", _params);
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

	public Integer getCpDefinitionInstancesCount(long cpDefinitionId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("status", status);

			_command.put("/commerce.cpinstance/get-cp-definition-instances-count", _params);
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

	public JSONObject getCpInstance(long cpInstanceId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpInstanceId", cpInstanceId);

			_command.put("/commerce.cpinstance/get-cp-instance", _params);
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

	public JSONArray getCpInstances(long groupId, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.product.model.CPInstance>", orderByComparator);

			_command.put("/commerce.cpinstance/get-cp-instances", _params);
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

	public Integer getCpInstancesCount(long groupId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("status", status);

			_command.put("/commerce.cpinstance/get-cp-instances-count", _params);
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

	public JSONObject searchCpDefinitionInstances(long companyId, long cpDefinitionId, String keywords, int status, int start, int end, JSONObjectWrapper sort) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("end", end);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "sort", "com.liferay.portal.kernel.search.Sort", sort);

			_command.put("/commerce.cpinstance/search-cp-definition-instances", _params);
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

	public JSONObject searchCpDefinitionInstances(long companyId, long cpDefinitionId, String keywords, int status, JSONObjectWrapper sort) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("keywords", checkNull(keywords));
			_params.put("status", status);
			mangleWrapper(_params, "sort", "com.liferay.portal.kernel.search.Sort", sort);

			_command.put("/commerce.cpinstance/search-cp-definition-instances", _params);
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

	public JSONObject searchCpInstances(long companyId, long groupId, String keywords, int status, int start, int end, JSONObjectWrapper sort) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "sort", "com.liferay.portal.kernel.search.Sort", sort);

			_command.put("/commerce.cpinstance/search-cp-instances", _params);
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

	public JSONObject searchCpInstances(long companyId, String keywords, int status, int start, int end, JSONObjectWrapper sort) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "sort", "com.liferay.portal.kernel.search.Sort", sort);

			_command.put("/commerce.cpinstance/search-cp-instances", _params);
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

	public JSONObject updateCpInstance(long cpInstanceId, String sku, String gtin, String manufacturerPartNumber, boolean purchasable, boolean published, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpInstanceId", cpInstanceId);
			_params.put("displayDateDay", displayDateDay);
			_params.put("displayDateHour", displayDateHour);
			_params.put("displayDateMinute", displayDateMinute);
			_params.put("displayDateMonth", displayDateMonth);
			_params.put("displayDateYear", displayDateYear);
			_params.put("expirationDateDay", expirationDateDay);
			_params.put("expirationDateHour", expirationDateHour);
			_params.put("expirationDateMinute", expirationDateMinute);
			_params.put("expirationDateMonth", expirationDateMonth);
			_params.put("expirationDateYear", expirationDateYear);
			_params.put("gtin", checkNull(gtin));
			_params.put("manufacturerPartNumber", checkNull(manufacturerPartNumber));
			_params.put("neverExpire", neverExpire);
			_params.put("published", published);
			_params.put("purchasable", purchasable);
			_params.put("sku", checkNull(sku));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpinstance/update-cp-instance", _params);
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

	public JSONObject updateCpInstance(long cpInstanceId, String sku, String gtin, String manufacturerPartNumber, boolean purchasable, boolean published, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, String unspsc, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpInstanceId", cpInstanceId);
			_params.put("displayDateDay", displayDateDay);
			_params.put("displayDateHour", displayDateHour);
			_params.put("displayDateMinute", displayDateMinute);
			_params.put("displayDateMonth", displayDateMonth);
			_params.put("displayDateYear", displayDateYear);
			_params.put("expirationDateDay", expirationDateDay);
			_params.put("expirationDateHour", expirationDateHour);
			_params.put("expirationDateMinute", expirationDateMinute);
			_params.put("expirationDateMonth", expirationDateMonth);
			_params.put("expirationDateYear", expirationDateYear);
			_params.put("gtin", checkNull(gtin));
			_params.put("manufacturerPartNumber", checkNull(manufacturerPartNumber));
			_params.put("neverExpire", neverExpire);
			_params.put("published", published);
			_params.put("purchasable", purchasable);
			_params.put("sku", checkNull(sku));
			_params.put("unspsc", checkNull(unspsc));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpinstance/update-cp-instance", _params);
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

	public JSONObject updatePricingInfo(long cpInstanceId, JSONObject price, JSONObject promoPrice, JSONObject cost, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cost", checkNull(cost));
			_params.put("cpInstanceId", cpInstanceId);
			_params.put("price", checkNull(price));
			_params.put("promoPrice", checkNull(promoPrice));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpinstance/update-pricing-info", _params);
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

	public JSONObject updateShippingInfo(long cpInstanceId, double width, double height, double depth, double weight, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpInstanceId", cpInstanceId);
			_params.put("depth", depth);
			_params.put("height", height);
			_params.put("weight", weight);
			_params.put("width", width);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpinstance/update-shipping-info", _params);
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

	public JSONObject updateSubscriptionInfo(long cpInstanceId, boolean overrideSubscriptionInfo, boolean subscriptionEnabled, int subscriptionLength, String subscriptionType, JSONObject subscriptionTypeSettingsUnicodeProperties, long maxSubscriptionCycles, boolean deliverySubscriptionEnabled, int deliverySubscriptionLength, String deliverySubscriptionType, JSONObject deliverySubscriptionTypeSettingsUnicodeProperties, long deliveryMaxSubscriptionCycles) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpInstanceId", cpInstanceId);
			_params.put("deliveryMaxSubscriptionCycles", deliveryMaxSubscriptionCycles);
			_params.put("deliverySubscriptionEnabled", deliverySubscriptionEnabled);
			_params.put("deliverySubscriptionLength", deliverySubscriptionLength);
			_params.put("deliverySubscriptionType", checkNull(deliverySubscriptionType));
			_params.put("deliverySubscriptionTypeSettingsUnicodeProperties", checkNull(deliverySubscriptionTypeSettingsUnicodeProperties));
			_params.put("maxSubscriptionCycles", maxSubscriptionCycles);
			_params.put("overrideSubscriptionInfo", overrideSubscriptionInfo);
			_params.put("subscriptionEnabled", subscriptionEnabled);
			_params.put("subscriptionLength", subscriptionLength);
			_params.put("subscriptionType", checkNull(subscriptionType));
			_params.put("subscriptionTypeSettingsUnicodeProperties", checkNull(subscriptionTypeSettingsUnicodeProperties));

			_command.put("/commerce.cpinstance/update-subscription-info", _params);
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

	public JSONObject updateSubscriptionInfo(long cpInstanceId, boolean overrideSubscriptionInfo, boolean subscriptionEnabled, int subscriptionLength, String subscriptionType, JSONObject subscriptionTypeSettingsUnicodeProperties, long maxSubscriptionCycles, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpInstanceId", cpInstanceId);
			_params.put("maxSubscriptionCycles", maxSubscriptionCycles);
			_params.put("overrideSubscriptionInfo", overrideSubscriptionInfo);
			_params.put("subscriptionEnabled", subscriptionEnabled);
			_params.put("subscriptionLength", subscriptionLength);
			_params.put("subscriptionType", checkNull(subscriptionType));
			_params.put("subscriptionTypeSettingsUnicodeProperties", checkNull(subscriptionTypeSettingsUnicodeProperties));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpinstance/update-subscription-info", _params);
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

	public JSONObject upsertCpInstance(long cpDefinitionId, long groupId, String sku, String gtin, String manufacturerPartNumber, boolean purchasable, String json, double width, double height, double depth, double weight, JSONObject price, JSONObject promoPrice, JSONObject cost, boolean published, String externalReferenceCode, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cost", checkNull(cost));
			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("depth", depth);
			_params.put("displayDateDay", displayDateDay);
			_params.put("displayDateHour", displayDateHour);
			_params.put("displayDateMinute", displayDateMinute);
			_params.put("displayDateMonth", displayDateMonth);
			_params.put("displayDateYear", displayDateYear);
			_params.put("expirationDateDay", expirationDateDay);
			_params.put("expirationDateHour", expirationDateHour);
			_params.put("expirationDateMinute", expirationDateMinute);
			_params.put("expirationDateMonth", expirationDateMonth);
			_params.put("expirationDateYear", expirationDateYear);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));
			_params.put("groupId", groupId);
			_params.put("gtin", checkNull(gtin));
			_params.put("height", height);
			_params.put("json", checkNull(json));
			_params.put("manufacturerPartNumber", checkNull(manufacturerPartNumber));
			_params.put("neverExpire", neverExpire);
			_params.put("price", checkNull(price));
			_params.put("promoPrice", checkNull(promoPrice));
			_params.put("published", published);
			_params.put("purchasable", purchasable);
			_params.put("sku", checkNull(sku));
			_params.put("weight", weight);
			_params.put("width", width);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpinstance/upsert-cp-instance", _params);
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

	public JSONObject upsertCpInstance(long cpDefinitionId, long groupId, String sku, String gtin, String manufacturerPartNumber, boolean purchasable, String json, double width, double height, double depth, double weight, JSONObject price, JSONObject promoPrice, JSONObject cost, boolean published, String externalReferenceCode, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, String unspsc, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cost", checkNull(cost));
			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("depth", depth);
			_params.put("displayDateDay", displayDateDay);
			_params.put("displayDateHour", displayDateHour);
			_params.put("displayDateMinute", displayDateMinute);
			_params.put("displayDateMonth", displayDateMonth);
			_params.put("displayDateYear", displayDateYear);
			_params.put("expirationDateDay", expirationDateDay);
			_params.put("expirationDateHour", expirationDateHour);
			_params.put("expirationDateMinute", expirationDateMinute);
			_params.put("expirationDateMonth", expirationDateMonth);
			_params.put("expirationDateYear", expirationDateYear);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));
			_params.put("groupId", groupId);
			_params.put("gtin", checkNull(gtin));
			_params.put("height", height);
			_params.put("json", checkNull(json));
			_params.put("manufacturerPartNumber", checkNull(manufacturerPartNumber));
			_params.put("neverExpire", neverExpire);
			_params.put("price", checkNull(price));
			_params.put("promoPrice", checkNull(promoPrice));
			_params.put("published", published);
			_params.put("purchasable", purchasable);
			_params.put("sku", checkNull(sku));
			_params.put("unspsc", checkNull(unspsc));
			_params.put("weight", weight);
			_params.put("width", width);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpinstance/upsert-cp-instance", _params);
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