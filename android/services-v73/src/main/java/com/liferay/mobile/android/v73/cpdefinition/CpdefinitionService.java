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

package com.liferay.mobile.android.v73.cpdefinition;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CpdefinitionService extends BaseService {

	public CpdefinitionService(Session session) {
		super(session);
	}

	public JSONObject addCpDefinition(long groupId, long userId, JSONObject nameMap, JSONObject shortDescriptionMap, JSONObject descriptionMap, JSONObject urlTitleMap, JSONObject metaTitleMap, JSONObject metaDescriptionMap, JSONObject metaKeywordsMap, String productTypeName, boolean ignoreSKUCombinations, boolean shippable, boolean freeShipping, boolean shipSeparately, double shippingExtraPrice, double width, double height, double depth, double weight, long cpTaxCategoryId, boolean taxExempt, boolean telcoOrElectronics, String ddmStructureKey, boolean published, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, String defaultSku, boolean subscriptionEnabled, int subscriptionLength, String subscriptionType, JSONObject subscriptionTypeSettingsUnicodeProperties, long maxSubscriptionCycles, boolean deliverySubscriptionEnabled, int deliverySubscriptionLength, String deliverySubscriptionType, JSONObject deliverySubscriptionTypeSettingsUnicodeProperties, long deliveryMaxSubscriptionCycles, String externalReferenceCode, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpTaxCategoryId", cpTaxCategoryId);
			_params.put("ddmStructureKey", checkNull(ddmStructureKey));
			_params.put("defaultSku", checkNull(defaultSku));
			_params.put("deliveryMaxSubscriptionCycles", deliveryMaxSubscriptionCycles);
			_params.put("deliverySubscriptionEnabled", deliverySubscriptionEnabled);
			_params.put("deliverySubscriptionLength", deliverySubscriptionLength);
			_params.put("deliverySubscriptionType", checkNull(deliverySubscriptionType));
			_params.put("deliverySubscriptionTypeSettingsUnicodeProperties", checkNull(deliverySubscriptionTypeSettingsUnicodeProperties));
			_params.put("depth", depth);
			_params.put("descriptionMap", checkNull(descriptionMap));
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
			_params.put("freeShipping", freeShipping);
			_params.put("groupId", groupId);
			_params.put("height", height);
			_params.put("ignoreSKUCombinations", ignoreSKUCombinations);
			_params.put("maxSubscriptionCycles", maxSubscriptionCycles);
			_params.put("metaDescriptionMap", checkNull(metaDescriptionMap));
			_params.put("metaKeywordsMap", checkNull(metaKeywordsMap));
			_params.put("metaTitleMap", checkNull(metaTitleMap));
			_params.put("nameMap", checkNull(nameMap));
			_params.put("neverExpire", neverExpire);
			_params.put("productTypeName", checkNull(productTypeName));
			_params.put("published", published);
			_params.put("shippable", shippable);
			_params.put("shippingExtraPrice", shippingExtraPrice);
			_params.put("shipSeparately", shipSeparately);
			_params.put("shortDescriptionMap", checkNull(shortDescriptionMap));
			_params.put("subscriptionEnabled", subscriptionEnabled);
			_params.put("subscriptionLength", subscriptionLength);
			_params.put("subscriptionType", checkNull(subscriptionType));
			_params.put("subscriptionTypeSettingsUnicodeProperties", checkNull(subscriptionTypeSettingsUnicodeProperties));
			_params.put("taxExempt", taxExempt);
			_params.put("telcoOrElectronics", telcoOrElectronics);
			_params.put("urlTitleMap", checkNull(urlTitleMap));
			_params.put("userId", userId);
			_params.put("weight", weight);
			_params.put("width", width);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinition/add-cp-definition", _params);
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

	public JSONObject addCpDefinition(long groupId, long userId, JSONObject nameMap, JSONObject shortDescriptionMap, JSONObject descriptionMap, JSONObject urlTitleMap, JSONObject metaTitleMap, JSONObject metaDescriptionMap, JSONObject metaKeywordsMap, String productTypeName, boolean ignoreSKUCombinations, boolean shippable, boolean freeShipping, boolean shipSeparately, double shippingExtraPrice, double width, double height, double depth, double weight, long cpTaxCategoryId, boolean taxExempt, boolean telcoOrElectronics, String ddmStructureKey, boolean published, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, String defaultSku, boolean subscriptionEnabled, int subscriptionLength, String subscriptionType, JSONObject subscriptionTypeSettingsUnicodeProperties, long maxSubscriptionCycles, String externalReferenceCode, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpTaxCategoryId", cpTaxCategoryId);
			_params.put("ddmStructureKey", checkNull(ddmStructureKey));
			_params.put("defaultSku", checkNull(defaultSku));
			_params.put("depth", depth);
			_params.put("descriptionMap", checkNull(descriptionMap));
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
			_params.put("freeShipping", freeShipping);
			_params.put("groupId", groupId);
			_params.put("height", height);
			_params.put("ignoreSKUCombinations", ignoreSKUCombinations);
			_params.put("maxSubscriptionCycles", maxSubscriptionCycles);
			_params.put("metaDescriptionMap", checkNull(metaDescriptionMap));
			_params.put("metaKeywordsMap", checkNull(metaKeywordsMap));
			_params.put("metaTitleMap", checkNull(metaTitleMap));
			_params.put("nameMap", checkNull(nameMap));
			_params.put("neverExpire", neverExpire);
			_params.put("productTypeName", checkNull(productTypeName));
			_params.put("published", published);
			_params.put("shippable", shippable);
			_params.put("shippingExtraPrice", shippingExtraPrice);
			_params.put("shipSeparately", shipSeparately);
			_params.put("shortDescriptionMap", checkNull(shortDescriptionMap));
			_params.put("subscriptionEnabled", subscriptionEnabled);
			_params.put("subscriptionLength", subscriptionLength);
			_params.put("subscriptionType", checkNull(subscriptionType));
			_params.put("subscriptionTypeSettingsUnicodeProperties", checkNull(subscriptionTypeSettingsUnicodeProperties));
			_params.put("taxExempt", taxExempt);
			_params.put("telcoOrElectronics", telcoOrElectronics);
			_params.put("urlTitleMap", checkNull(urlTitleMap));
			_params.put("userId", userId);
			_params.put("weight", weight);
			_params.put("width", width);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinition/add-cp-definition", _params);
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

	public JSONObject copyCpDefinition(long cpDefinitionId, long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("groupId", groupId);

			_command.put("/commerce.cpdefinition/copy-cp-definition", _params);
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

	public void deleteAssetCategoryCpDefinition(long cpDefinitionId, long categoryId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);
			_params.put("cpDefinitionId", cpDefinitionId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinition/delete-asset-category-cp-definition", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void deleteCpDefinition(long cpDefinitionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);

			_command.put("/commerce.cpdefinition/delete-cp-definition", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchCpDefinition(long cpDefinitionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);

			_command.put("/commerce.cpdefinition/fetch-cp-definition", _params);
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

	public JSONObject fetchCpDefinitionByCProductExternalReferenceCode(long companyId, String externalReferenceCode) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));

			_command.put("/commerce.cpdefinition/fetch-cp-definition-by-c-product-external-reference-code", _params);
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

	public JSONObject fetchCpDefinitionByCProductId(long cProductId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cProductId", cProductId);

			_command.put("/commerce.cpdefinition/fetch-cp-definition-by-c-product-id", _params);
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

	public JSONObject getCpDefinition(long cpDefinitionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);

			_command.put("/commerce.cpdefinition/get-cp-definition", _params);
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

	public JSONArray getCpDefinitions(long groupId, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.product.model.CPDefinition>", orderByComparator);

			_command.put("/commerce.cpdefinition/get-cp-definitions", _params);
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

	public Integer getCpDefinitionsCount(long groupId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("status", status);

			_command.put("/commerce.cpdefinition/get-cp-definitions-count", _params);
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

	public String getLayoutUuid(long cpDefinitionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);

			_command.put("/commerce.cpdefinition/get-layout-uuid", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getString(0);
	}

	public String getUrlTitleMapAsXml(long cpDefinitionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);

			_command.put("/commerce.cpdefinition/get-url-title-map-as-xml", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getString(0);
	}

	public JSONObject searchCpDefinitions(long companyId, String keywords, int status, int start, int end, JSONObjectWrapper sort) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "sort", "com.liferay.portal.kernel.search.Sort", sort);

			_command.put("/commerce.cpdefinition/search-cp-definitions", _params);
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

	public JSONObject searchCpDefinitions(long companyId, String keywords, String filterFields, String filterValues, int start, int end, JSONObjectWrapper sort) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("filterFields", checkNull(filterFields));
			_params.put("filterValues", checkNull(filterValues));
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);
			mangleWrapper(_params, "sort", "com.liferay.portal.kernel.search.Sort", sort);

			_command.put("/commerce.cpdefinition/search-cp-definitions", _params);
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

	public JSONObject updateCpDefinition(long cpDefinitionId, JSONObject nameMap, JSONObject shortDescriptionMap, JSONObject descriptionMap, JSONObject urlTitleMap, JSONObject metaTitleMap, JSONObject metaDescriptionMap, JSONObject metaKeywordsMap, boolean ignoreSKUCombinations, String ddmStructureKey, boolean published, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("ddmStructureKey", checkNull(ddmStructureKey));
			_params.put("descriptionMap", checkNull(descriptionMap));
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
			_params.put("ignoreSKUCombinations", ignoreSKUCombinations);
			_params.put("metaDescriptionMap", checkNull(metaDescriptionMap));
			_params.put("metaKeywordsMap", checkNull(metaKeywordsMap));
			_params.put("metaTitleMap", checkNull(metaTitleMap));
			_params.put("nameMap", checkNull(nameMap));
			_params.put("neverExpire", neverExpire);
			_params.put("published", published);
			_params.put("shortDescriptionMap", checkNull(shortDescriptionMap));
			_params.put("urlTitleMap", checkNull(urlTitleMap));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinition/update-cp-definition", _params);
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

	public JSONObject updateCpDefinitionAccountGroupFilter(long cpDefinitionId, boolean enable) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("enable", enable);

			_command.put("/commerce.cpdefinition/update-cp-definition-account-group-filter", _params);
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

	public JSONObject updateCpDefinitionCategorization(long cpDefinitionId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinition/update-cp-definition-categorization", _params);
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

	public JSONObject updateCpDefinitionChannelFilter(long cpDefinitionId, boolean enable) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("enable", enable);

			_command.put("/commerce.cpdefinition/update-cp-definition-channel-filter", _params);
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

	public void updateCpDisplayLayout(long cpDefinitionId, String layoutUuid, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("layoutUuid", checkNull(layoutUuid));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinition/update-cp-display-layout", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject updateShippingInfo(long cpDefinitionId, boolean shippable, boolean freeShipping, boolean shipSeparately, double shippingExtraPrice, double width, double height, double depth, double weight, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("depth", depth);
			_params.put("freeShipping", freeShipping);
			_params.put("height", height);
			_params.put("shippable", shippable);
			_params.put("shippingExtraPrice", shippingExtraPrice);
			_params.put("shipSeparately", shipSeparately);
			_params.put("weight", weight);
			_params.put("width", width);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinition/update-shipping-info", _params);
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

	public JSONObject updateStatus(long userId, long cpDefinitionId, int status, JSONObjectWrapper serviceContext, JSONObject workflowContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("status", status);
			_params.put("userId", userId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);
			_params.put("workflowContext", checkNull(workflowContext));

			_command.put("/commerce.cpdefinition/update-status", _params);
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

	public JSONObject updateSubscriptionInfo(long cpDefinitionId, boolean subscriptionEnabled, int subscriptionLength, String subscriptionType, JSONObject subscriptionTypeSettingsUnicodeProperties, long maxSubscriptionCycles, boolean deliverySubscriptionEnabled, int deliverySubscriptionLength, String deliverySubscriptionType, JSONObject deliverySubscriptionTypeSettingsUnicodeProperties, long deliveryMaxSubscriptionCycles) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("deliveryMaxSubscriptionCycles", deliveryMaxSubscriptionCycles);
			_params.put("deliverySubscriptionEnabled", deliverySubscriptionEnabled);
			_params.put("deliverySubscriptionLength", deliverySubscriptionLength);
			_params.put("deliverySubscriptionType", checkNull(deliverySubscriptionType));
			_params.put("deliverySubscriptionTypeSettingsUnicodeProperties", checkNull(deliverySubscriptionTypeSettingsUnicodeProperties));
			_params.put("maxSubscriptionCycles", maxSubscriptionCycles);
			_params.put("subscriptionEnabled", subscriptionEnabled);
			_params.put("subscriptionLength", subscriptionLength);
			_params.put("subscriptionType", checkNull(subscriptionType));
			_params.put("subscriptionTypeSettingsUnicodeProperties", checkNull(subscriptionTypeSettingsUnicodeProperties));

			_command.put("/commerce.cpdefinition/update-subscription-info", _params);
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

	public JSONObject updateSubscriptionInfo(long cpDefinitionId, boolean subscriptionEnabled, int subscriptionLength, String subscriptionType, JSONObject subscriptionTypeSettingsUnicodeProperties, long maxSubscriptionCycles, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("maxSubscriptionCycles", maxSubscriptionCycles);
			_params.put("subscriptionEnabled", subscriptionEnabled);
			_params.put("subscriptionLength", subscriptionLength);
			_params.put("subscriptionType", checkNull(subscriptionType));
			_params.put("subscriptionTypeSettingsUnicodeProperties", checkNull(subscriptionTypeSettingsUnicodeProperties));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinition/update-subscription-info", _params);
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

	public JSONObject updateTaxCategoryInfo(long cpDefinitionId, long cpTaxCategoryId, boolean taxExempt, boolean telcoOrElectronics) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDefinitionId", cpDefinitionId);
			_params.put("cpTaxCategoryId", cpTaxCategoryId);
			_params.put("taxExempt", taxExempt);
			_params.put("telcoOrElectronics", telcoOrElectronics);

			_command.put("/commerce.cpdefinition/update-tax-category-info", _params);
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

	public JSONObject upsertCpDefinition(long groupId, long userId, JSONObject nameMap, JSONObject shortDescriptionMap, JSONObject descriptionMap, JSONObject urlTitleMap, JSONObject metaTitleMap, JSONObject metaDescriptionMap, JSONObject metaKeywordsMap, String productTypeName, boolean ignoreSKUCombinations, boolean shippable, boolean freeShipping, boolean shipSeparately, double shippingExtraPrice, double width, double height, double depth, double weight, long cpTaxCategoryId, boolean taxExempt, boolean telcoOrElectronics, String ddmStructureKey, boolean published, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, String defaultSku, boolean subscriptionEnabled, int subscriptionLength, String subscriptionType, JSONObject subscriptionTypeSettingsUnicodeProperties, long maxSubscriptionCycles, boolean deliverySubscriptionEnabled, int deliverySubscriptionLength, String deliverySubscriptionType, JSONObject deliverySubscriptionTypeSettingsUnicodeProperties, long deliveryMaxSubscriptionCycles, String externalReferenceCode, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpTaxCategoryId", cpTaxCategoryId);
			_params.put("ddmStructureKey", checkNull(ddmStructureKey));
			_params.put("defaultSku", checkNull(defaultSku));
			_params.put("deliveryMaxSubscriptionCycles", deliveryMaxSubscriptionCycles);
			_params.put("deliverySubscriptionEnabled", deliverySubscriptionEnabled);
			_params.put("deliverySubscriptionLength", deliverySubscriptionLength);
			_params.put("deliverySubscriptionType", checkNull(deliverySubscriptionType));
			_params.put("deliverySubscriptionTypeSettingsUnicodeProperties", checkNull(deliverySubscriptionTypeSettingsUnicodeProperties));
			_params.put("depth", depth);
			_params.put("descriptionMap", checkNull(descriptionMap));
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
			_params.put("freeShipping", freeShipping);
			_params.put("groupId", groupId);
			_params.put("height", height);
			_params.put("ignoreSKUCombinations", ignoreSKUCombinations);
			_params.put("maxSubscriptionCycles", maxSubscriptionCycles);
			_params.put("metaDescriptionMap", checkNull(metaDescriptionMap));
			_params.put("metaKeywordsMap", checkNull(metaKeywordsMap));
			_params.put("metaTitleMap", checkNull(metaTitleMap));
			_params.put("nameMap", checkNull(nameMap));
			_params.put("neverExpire", neverExpire);
			_params.put("productTypeName", checkNull(productTypeName));
			_params.put("published", published);
			_params.put("shippable", shippable);
			_params.put("shippingExtraPrice", shippingExtraPrice);
			_params.put("shipSeparately", shipSeparately);
			_params.put("shortDescriptionMap", checkNull(shortDescriptionMap));
			_params.put("subscriptionEnabled", subscriptionEnabled);
			_params.put("subscriptionLength", subscriptionLength);
			_params.put("subscriptionType", checkNull(subscriptionType));
			_params.put("subscriptionTypeSettingsUnicodeProperties", checkNull(subscriptionTypeSettingsUnicodeProperties));
			_params.put("taxExempt", taxExempt);
			_params.put("telcoOrElectronics", telcoOrElectronics);
			_params.put("urlTitleMap", checkNull(urlTitleMap));
			_params.put("userId", userId);
			_params.put("weight", weight);
			_params.put("width", width);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinition/upsert-cp-definition", _params);
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

	public JSONObject upsertCpDefinition(long groupId, long userId, JSONObject nameMap, JSONObject shortDescriptionMap, JSONObject descriptionMap, JSONObject urlTitleMap, JSONObject metaTitleMap, JSONObject metaDescriptionMap, JSONObject metaKeywordsMap, String productTypeName, boolean ignoreSKUCombinations, boolean shippable, boolean freeShipping, boolean shipSeparately, double shippingExtraPrice, double width, double height, double depth, double weight, long cpTaxCategoryId, boolean taxExempt, boolean telcoOrElectronics, String ddmStructureKey, boolean published, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, String defaultSku, boolean subscriptionEnabled, int subscriptionLength, String subscriptionType, JSONObject subscriptionTypeSettingsUnicodeProperties, long maxSubscriptionCycles, String externalReferenceCode, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpTaxCategoryId", cpTaxCategoryId);
			_params.put("ddmStructureKey", checkNull(ddmStructureKey));
			_params.put("defaultSku", checkNull(defaultSku));
			_params.put("depth", depth);
			_params.put("descriptionMap", checkNull(descriptionMap));
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
			_params.put("freeShipping", freeShipping);
			_params.put("groupId", groupId);
			_params.put("height", height);
			_params.put("ignoreSKUCombinations", ignoreSKUCombinations);
			_params.put("maxSubscriptionCycles", maxSubscriptionCycles);
			_params.put("metaDescriptionMap", checkNull(metaDescriptionMap));
			_params.put("metaKeywordsMap", checkNull(metaKeywordsMap));
			_params.put("metaTitleMap", checkNull(metaTitleMap));
			_params.put("nameMap", checkNull(nameMap));
			_params.put("neverExpire", neverExpire);
			_params.put("productTypeName", checkNull(productTypeName));
			_params.put("published", published);
			_params.put("shippable", shippable);
			_params.put("shippingExtraPrice", shippingExtraPrice);
			_params.put("shipSeparately", shipSeparately);
			_params.put("shortDescriptionMap", checkNull(shortDescriptionMap));
			_params.put("subscriptionEnabled", subscriptionEnabled);
			_params.put("subscriptionLength", subscriptionLength);
			_params.put("subscriptionType", checkNull(subscriptionType));
			_params.put("subscriptionTypeSettingsUnicodeProperties", checkNull(subscriptionTypeSettingsUnicodeProperties));
			_params.put("taxExempt", taxExempt);
			_params.put("telcoOrElectronics", telcoOrElectronics);
			_params.put("urlTitleMap", checkNull(urlTitleMap));
			_params.put("userId", userId);
			_params.put("weight", weight);
			_params.put("width", width);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinition/upsert-cp-definition", _params);
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