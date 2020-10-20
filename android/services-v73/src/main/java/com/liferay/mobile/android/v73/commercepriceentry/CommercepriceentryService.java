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

package com.liferay.mobile.android.v73.commercepriceentry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommercepriceentryService extends BaseService {

	public CommercepriceentryService(Session session) {
		super(session);
	}

	public JSONObject addCommercePriceEntry(long cpInstanceId, long commercePriceListId, JSONObject price, JSONObject promoPrice, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceListId", commercePriceListId);
			_params.put("cpInstanceId", cpInstanceId);
			_params.put("price", checkNull(price));
			_params.put("promoPrice", checkNull(promoPrice));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepriceentry/add-commerce-price-entry", _params);
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

	public JSONObject addCommercePriceEntry(long cpInstanceId, long commercePriceListId, String externalReferenceCode, JSONObject price, JSONObject promoPrice, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceListId", commercePriceListId);
			_params.put("cpInstanceId", cpInstanceId);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));
			_params.put("price", checkNull(price));
			_params.put("promoPrice", checkNull(promoPrice));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepriceentry/add-commerce-price-entry", _params);
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

	public JSONObject addCommercePriceEntry(long cProductId, String cpInstanceUuid, long commercePriceListId, String externalReferenceCode, JSONObject price, boolean discountDiscovery, JSONObject discountLevel1, JSONObject discountLevel2, JSONObject discountLevel3, JSONObject discountLevel4, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceListId", commercePriceListId);
			_params.put("cpInstanceUuid", checkNull(cpInstanceUuid));
			_params.put("cProductId", cProductId);
			_params.put("discountDiscovery", discountDiscovery);
			_params.put("discountLevel1", checkNull(discountLevel1));
			_params.put("discountLevel2", checkNull(discountLevel2));
			_params.put("discountLevel3", checkNull(discountLevel3));
			_params.put("discountLevel4", checkNull(discountLevel4));
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
			_params.put("neverExpire", neverExpire);
			_params.put("price", checkNull(price));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepriceentry/add-commerce-price-entry", _params);
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

	public void deleteCommercePriceEntry(long commercePriceEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceEntryId", commercePriceEntryId);

			_command.put("/commerce.commercepriceentry/delete-commerce-price-entry", _params);
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

			_command.put("/commerce.commercepriceentry/fetch-by-external-reference-code", _params);
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

	public JSONObject fetchCommercePriceEntry(long commercePriceEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceEntryId", commercePriceEntryId);

			_command.put("/commerce.commercepriceentry/fetch-commerce-price-entry", _params);
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

	public JSONArray getCommercePriceEntries(long commercePriceListId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceListId", commercePriceListId);
			_params.put("end", end);
			_params.put("start", start);

			_command.put("/commerce.commercepriceentry/get-commerce-price-entries", _params);
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

	public JSONArray getCommercePriceEntries(long commercePriceListId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceListId", commercePriceListId);
			_params.put("end", end);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.price.list.model.CommercePriceEntry>", orderByComparator);

			_command.put("/commerce.commercepriceentry/get-commerce-price-entries", _params);
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

	public JSONArray getCommercePriceEntriesByCompanyId(long companyId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("start", start);

			_command.put("/commerce.commercepriceentry/get-commerce-price-entries-by-company-id", _params);
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

	public Integer getCommercePriceEntriesCount(long commercePriceListId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceListId", commercePriceListId);

			_command.put("/commerce.commercepriceentry/get-commerce-price-entries-count", _params);
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

	public Integer getCommercePriceEntriesCountByCompanyId(long companyId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);

			_command.put("/commerce.commercepriceentry/get-commerce-price-entries-count-by-company-id", _params);
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

	public JSONObject getCommercePriceEntry(long commercePriceEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceEntryId", commercePriceEntryId);

			_command.put("/commerce.commercepriceentry/get-commerce-price-entry", _params);
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

	public JSONObject getInstanceBaseCommercePriceEntry(String cpInstanceUuid, String priceListType) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpInstanceUuid", checkNull(cpInstanceUuid));
			_params.put("priceListType", checkNull(priceListType));

			_command.put("/commerce.commercepriceentry/get-instance-base-commerce-price-entry", _params);
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

	public JSONArray getInstanceCommercePriceEntries(long cpInstanceId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpInstanceId", cpInstanceId);
			_params.put("end", end);
			_params.put("start", start);

			_command.put("/commerce.commercepriceentry/get-instance-commerce-price-entries", _params);
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

	public JSONArray getInstanceCommercePriceEntries(long cpInstanceId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpInstanceId", cpInstanceId);
			_params.put("end", end);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.price.list.model.CommercePriceEntry>", orderByComparator);

			_command.put("/commerce.commercepriceentry/get-instance-commerce-price-entries", _params);
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

	public Integer getInstanceCommercePriceEntriesCount(long cpInstanceId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpInstanceId", cpInstanceId);

			_command.put("/commerce.commercepriceentry/get-instance-commerce-price-entries-count", _params);
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

	public JSONObject searchCommercePriceEntries(long companyId, long commercePriceListId, String keywords, int start, int end, JSONObjectWrapper sort) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceListId", commercePriceListId);
			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);
			mangleWrapper(_params, "sort", "com.liferay.portal.kernel.search.Sort", sort);

			_command.put("/commerce.commercepriceentry/search-commerce-price-entries", _params);
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

	public Integer searchCommercePriceEntriesCount(long companyId, long commercePriceListId, String keywords) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceListId", commercePriceListId);
			_params.put("companyId", companyId);
			_params.put("keywords", checkNull(keywords));

			_command.put("/commerce.commercepriceentry/search-commerce-price-entries-count", _params);
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

	public JSONObject updateCommercePriceEntry(long commercePriceEntryId, JSONObject price, boolean discountDiscovery, JSONObject discountLevel1, JSONObject discountLevel2, JSONObject discountLevel3, JSONObject discountLevel4, boolean bulkPricing, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("bulkPricing", bulkPricing);
			_params.put("commercePriceEntryId", commercePriceEntryId);
			_params.put("discountDiscovery", discountDiscovery);
			_params.put("discountLevel1", checkNull(discountLevel1));
			_params.put("discountLevel2", checkNull(discountLevel2));
			_params.put("discountLevel3", checkNull(discountLevel3));
			_params.put("discountLevel4", checkNull(discountLevel4));
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
			_params.put("neverExpire", neverExpire);
			_params.put("price", checkNull(price));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepriceentry/update-commerce-price-entry", _params);
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

	public JSONObject updateCommercePriceEntry(long commercePriceEntryId, JSONObject price, boolean discountDiscovery, JSONObject discountLevel1, JSONObject discountLevel2, JSONObject discountLevel3, JSONObject discountLevel4, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceEntryId", commercePriceEntryId);
			_params.put("discountDiscovery", discountDiscovery);
			_params.put("discountLevel1", checkNull(discountLevel1));
			_params.put("discountLevel2", checkNull(discountLevel2));
			_params.put("discountLevel3", checkNull(discountLevel3));
			_params.put("discountLevel4", checkNull(discountLevel4));
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
			_params.put("neverExpire", neverExpire);
			_params.put("price", checkNull(price));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepriceentry/update-commerce-price-entry", _params);
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

	public JSONObject updateCommercePriceEntry(long commercePriceEntryId, JSONObject price, JSONObject promoPrice, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceEntryId", commercePriceEntryId);
			_params.put("price", checkNull(price));
			_params.put("promoPrice", checkNull(promoPrice));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepriceentry/update-commerce-price-entry", _params);
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

	public JSONObject updateExternalReferenceCode(JSONObjectWrapper commercePriceEntry, String externalReferenceCode) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			mangleWrapper(_params, "commercePriceEntry", "com.liferay.commerce.price.list.model.CommercePriceEntry", commercePriceEntry);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));

			_command.put("/commerce.commercepriceentry/update-external-reference-code", _params);
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

	public JSONObject upsertCommercePriceEntry(long commercePriceEntryId, long cpInstanceId, long commercePriceListId, String externalReferenceCode, JSONObject price, JSONObject promoPrice, String skuExternalReferenceCode, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceEntryId", commercePriceEntryId);
			_params.put("commercePriceListId", commercePriceListId);
			_params.put("cpInstanceId", cpInstanceId);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));
			_params.put("price", checkNull(price));
			_params.put("promoPrice", checkNull(promoPrice));
			_params.put("skuExternalReferenceCode", checkNull(skuExternalReferenceCode));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepriceentry/upsert-commerce-price-entry", _params);
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

	public JSONObject upsertCommercePriceEntry(long commercePriceEntryId, long cProductId, String cpInstanceUuid, long commercePriceListId, String externalReferenceCode, JSONObject price, boolean discountDiscovery, JSONObject discountLevel1, JSONObject discountLevel2, JSONObject discountLevel3, JSONObject discountLevel4, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, String skuExternalReferenceCode, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceEntryId", commercePriceEntryId);
			_params.put("commercePriceListId", commercePriceListId);
			_params.put("cpInstanceUuid", checkNull(cpInstanceUuid));
			_params.put("cProductId", cProductId);
			_params.put("discountDiscovery", discountDiscovery);
			_params.put("discountLevel1", checkNull(discountLevel1));
			_params.put("discountLevel2", checkNull(discountLevel2));
			_params.put("discountLevel3", checkNull(discountLevel3));
			_params.put("discountLevel4", checkNull(discountLevel4));
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
			_params.put("neverExpire", neverExpire);
			_params.put("price", checkNull(price));
			_params.put("skuExternalReferenceCode", checkNull(skuExternalReferenceCode));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepriceentry/upsert-commerce-price-entry", _params);
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

	public JSONObject upsertCommercePriceEntry(long commercePriceEntryId, long cProductId, String cpInstanceUuid, long commercePriceListId, String externalReferenceCode, JSONObject price, JSONObject promoPrice, String skuExternalReferenceCode, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceEntryId", commercePriceEntryId);
			_params.put("commercePriceListId", commercePriceListId);
			_params.put("cpInstanceUuid", checkNull(cpInstanceUuid));
			_params.put("cProductId", cProductId);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));
			_params.put("price", checkNull(price));
			_params.put("promoPrice", checkNull(promoPrice));
			_params.put("skuExternalReferenceCode", checkNull(skuExternalReferenceCode));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepriceentry/upsert-commerce-price-entry", _params);
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