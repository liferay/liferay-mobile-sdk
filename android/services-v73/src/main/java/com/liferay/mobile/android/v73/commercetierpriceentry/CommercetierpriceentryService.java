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

package com.liferay.mobile.android.v73.commercetierpriceentry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommercetierpriceentryService extends BaseService {

	public CommercetierpriceentryService(Session session) {
		super(session);
	}

	public JSONObject addCommerceTierPriceEntry(long commercePriceEntryId, JSONObject price, JSONObject promoPrice, int minQuantity, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceEntryId", commercePriceEntryId);
			_params.put("minQuantity", minQuantity);
			_params.put("price", checkNull(price));
			_params.put("promoPrice", checkNull(promoPrice));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercetierpriceentry/add-commerce-tier-price-entry", _params);
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

	public JSONObject addCommerceTierPriceEntry(long commercePriceEntryId, String externalReferenceCode, JSONObject price, int minQuantity, boolean bulkPricing, boolean discountDiscovery, JSONObject discountLevel1, JSONObject discountLevel2, JSONObject discountLevel3, JSONObject discountLevel4, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
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
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));
			_params.put("minQuantity", minQuantity);
			_params.put("neverExpire", neverExpire);
			_params.put("price", checkNull(price));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercetierpriceentry/add-commerce-tier-price-entry", _params);
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

	public JSONObject addCommerceTierPriceEntry(long commercePriceEntryId, String externalReferenceCode, JSONObject price, JSONObject promoPrice, int minQuantity, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceEntryId", commercePriceEntryId);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));
			_params.put("minQuantity", minQuantity);
			_params.put("price", checkNull(price));
			_params.put("promoPrice", checkNull(promoPrice));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercetierpriceentry/add-commerce-tier-price-entry", _params);
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

	public void deleteCommerceTierPriceEntry(long commerceTierPriceEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceTierPriceEntryId", commerceTierPriceEntryId);

			_command.put("/commerce.commercetierpriceentry/delete-commerce-tier-price-entry", _params);
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

			_command.put("/commerce.commercetierpriceentry/fetch-by-external-reference-code", _params);
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

	public JSONArray fetchCommerceTierPriceEntries(long companyId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("start", start);

			_command.put("/commerce.commercetierpriceentry/fetch-commerce-tier-price-entries", _params);
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

	public JSONObject fetchCommerceTierPriceEntry(long commerceTierPriceEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceTierPriceEntryId", commerceTierPriceEntryId);

			_command.put("/commerce.commercetierpriceentry/fetch-commerce-tier-price-entry", _params);
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

	public JSONArray getCommerceTierPriceEntries(long commercePriceEntryId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceEntryId", commercePriceEntryId);
			_params.put("end", end);
			_params.put("start", start);

			_command.put("/commerce.commercetierpriceentry/get-commerce-tier-price-entries", _params);
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

	public JSONArray getCommerceTierPriceEntries(long commercePriceEntryId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceEntryId", commercePriceEntryId);
			_params.put("end", end);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.price.list.model.CommerceTierPriceEntry>", orderByComparator);

			_command.put("/commerce.commercetierpriceentry/get-commerce-tier-price-entries", _params);
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

	public Integer getCommerceTierPriceEntriesCount(long commercePriceEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceEntryId", commercePriceEntryId);

			_command.put("/commerce.commercetierpriceentry/get-commerce-tier-price-entries-count", _params);
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

	public Integer getCommerceTierPriceEntriesCountByCompanyId(long companyId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);

			_command.put("/commerce.commercetierpriceentry/get-commerce-tier-price-entries-count-by-company-id", _params);
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

	public JSONObject getCommerceTierPriceEntry(long commerceTierPriceEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceTierPriceEntryId", commerceTierPriceEntryId);

			_command.put("/commerce.commercetierpriceentry/get-commerce-tier-price-entry", _params);
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

	public JSONObject searchCommerceTierPriceEntries(long companyId, long commercePriceEntryId, String keywords, int start, int end, JSONObjectWrapper sort) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceEntryId", commercePriceEntryId);
			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);
			mangleWrapper(_params, "sort", "com.liferay.portal.kernel.search.Sort", sort);

			_command.put("/commerce.commercetierpriceentry/search-commerce-tier-price-entries", _params);
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

	public Integer searchCommerceTierPriceEntriesCount(long companyId, long commercePriceEntryId, String keywords) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceEntryId", commercePriceEntryId);
			_params.put("companyId", companyId);
			_params.put("keywords", checkNull(keywords));

			_command.put("/commerce.commercetierpriceentry/search-commerce-tier-price-entries-count", _params);
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

	public JSONObject updateCommerceTierPriceEntry(long commerceTierPriceEntryId, JSONObject price, int minQuantity, boolean bulkPricing, boolean discountDiscovery, JSONObject discountLevel1, JSONObject discountLevel2, JSONObject discountLevel3, JSONObject discountLevel4, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("bulkPricing", bulkPricing);
			_params.put("commerceTierPriceEntryId", commerceTierPriceEntryId);
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
			_params.put("minQuantity", minQuantity);
			_params.put("neverExpire", neverExpire);
			_params.put("price", checkNull(price));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercetierpriceentry/update-commerce-tier-price-entry", _params);
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

	public JSONObject updateCommerceTierPriceEntry(long commerceTierPriceEntryId, JSONObject price, JSONObject promoPrice, int minQuantity, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceTierPriceEntryId", commerceTierPriceEntryId);
			_params.put("minQuantity", minQuantity);
			_params.put("price", checkNull(price));
			_params.put("promoPrice", checkNull(promoPrice));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercetierpriceentry/update-commerce-tier-price-entry", _params);
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

	public JSONObject updateExternalReferenceCode(JSONObjectWrapper commerceTierPriceEntry, String externalReferenceCode) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			mangleWrapper(_params, "commerceTierPriceEntry", "com.liferay.commerce.price.list.model.CommerceTierPriceEntry", commerceTierPriceEntry);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));

			_command.put("/commerce.commercetierpriceentry/update-external-reference-code", _params);
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

	public JSONObject upsertCommerceTierPriceEntry(long commerceTierPriceEntryId, long commercePriceEntryId, String externalReferenceCode, JSONObject price, int minQuantity, boolean bulkPricing, boolean discountDiscovery, JSONObject discountLevel1, JSONObject discountLevel2, JSONObject discountLevel3, JSONObject discountLevel4, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, String priceEntryExternalReferenceCode, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("bulkPricing", bulkPricing);
			_params.put("commercePriceEntryId", commercePriceEntryId);
			_params.put("commerceTierPriceEntryId", commerceTierPriceEntryId);
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
			_params.put("minQuantity", minQuantity);
			_params.put("neverExpire", neverExpire);
			_params.put("price", checkNull(price));
			_params.put("priceEntryExternalReferenceCode", checkNull(priceEntryExternalReferenceCode));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercetierpriceentry/upsert-commerce-tier-price-entry", _params);
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

	public JSONObject upsertCommerceTierPriceEntry(long commerceTierPriceEntryId, long commercePriceEntryId, String externalReferenceCode, JSONObject price, JSONObject promoPrice, int minQuantity, String priceEntryExternalReferenceCode, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceEntryId", commercePriceEntryId);
			_params.put("commerceTierPriceEntryId", commerceTierPriceEntryId);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));
			_params.put("minQuantity", minQuantity);
			_params.put("price", checkNull(price));
			_params.put("priceEntryExternalReferenceCode", checkNull(priceEntryExternalReferenceCode));
			_params.put("promoPrice", checkNull(promoPrice));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercetierpriceentry/upsert-commerce-tier-price-entry", _params);
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