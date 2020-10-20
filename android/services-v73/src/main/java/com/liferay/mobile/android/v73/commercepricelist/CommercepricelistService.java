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

package com.liferay.mobile.android.v73.commercepricelist;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommercepricelistService extends BaseService {

	public CommercepricelistService(Session session) {
		super(session);
	}

	public JSONObject addCommercePriceList(long groupId, long userId, long commerceCurrencyId, boolean netPrice, long parentCommercePriceListId, String name, double priority, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceCurrencyId", commerceCurrencyId);
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
			_params.put("name", checkNull(name));
			_params.put("netPrice", netPrice);
			_params.put("neverExpire", neverExpire);
			_params.put("parentCommercePriceListId", parentCommercePriceListId);
			_params.put("priority", priority);
			_params.put("userId", userId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepricelist/add-commerce-price-list", _params);
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

	public JSONObject addCommercePriceList(long groupId, long userId, long commerceCurrencyId, boolean netPrice, long parentCommercePriceListId, String name, double priority, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, String externalReferenceCode, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceCurrencyId", commerceCurrencyId);
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
			_params.put("name", checkNull(name));
			_params.put("netPrice", netPrice);
			_params.put("neverExpire", neverExpire);
			_params.put("parentCommercePriceListId", parentCommercePriceListId);
			_params.put("priority", priority);
			_params.put("userId", userId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepricelist/add-commerce-price-list", _params);
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

	public JSONObject addCommercePriceList(long groupId, long userId, long commerceCurrencyId, boolean netPrice, String type, long parentCommercePriceListId, boolean catalogBasePriceList, String name, double priority, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, String externalReferenceCode, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("catalogBasePriceList", catalogBasePriceList);
			_params.put("commerceCurrencyId", commerceCurrencyId);
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
			_params.put("name", checkNull(name));
			_params.put("netPrice", netPrice);
			_params.put("neverExpire", neverExpire);
			_params.put("parentCommercePriceListId", parentCommercePriceListId);
			_params.put("priority", priority);
			_params.put("type", checkNull(type));
			_params.put("userId", userId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepricelist/add-commerce-price-list", _params);
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

	public JSONObject addCommercePriceList(long groupId, long userId, long commerceCurrencyId, long parentCommercePriceListId, String name, double priority, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceCurrencyId", commerceCurrencyId);
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
			_params.put("name", checkNull(name));
			_params.put("neverExpire", neverExpire);
			_params.put("parentCommercePriceListId", parentCommercePriceListId);
			_params.put("priority", priority);
			_params.put("userId", userId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepricelist/add-commerce-price-list", _params);
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

	public JSONObject addCommercePriceList(long groupId, long userId, long commerceCurrencyId, long parentCommercePriceListId, String name, double priority, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, String externalReferenceCode, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceCurrencyId", commerceCurrencyId);
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
			_params.put("name", checkNull(name));
			_params.put("neverExpire", neverExpire);
			_params.put("parentCommercePriceListId", parentCommercePriceListId);
			_params.put("priority", priority);
			_params.put("userId", userId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepricelist/add-commerce-price-list", _params);
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

	public JSONObject addCommercePriceList(long groupId, long userId, long commerceCurrencyId, String name, double priority, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceCurrencyId", commerceCurrencyId);
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
			_params.put("name", checkNull(name));
			_params.put("neverExpire", neverExpire);
			_params.put("priority", priority);
			_params.put("userId", userId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepricelist/add-commerce-price-list", _params);
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

	public JSONObject addCommercePriceList(long groupId, long userId, long commerceCurrencyId, String name, double priority, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, String externalReferenceCode, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceCurrencyId", commerceCurrencyId);
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
			_params.put("name", checkNull(name));
			_params.put("neverExpire", neverExpire);
			_params.put("priority", priority);
			_params.put("userId", userId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepricelist/add-commerce-price-list", _params);
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

	public void deleteCommercePriceList(long commercePriceListId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceListId", commercePriceListId);

			_command.put("/commerce.commercepricelist/delete-commerce-price-list", _params);
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

			_command.put("/commerce.commercepricelist/fetch-by-external-reference-code", _params);
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

	public JSONObject fetchCatalogBaseCommercePriceListByType(long groupId, String type) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("type", checkNull(type));

			_command.put("/commerce.commercepricelist/fetch-catalog-base-commerce-price-list-by-type", _params);
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

	public JSONObject fetchCommerceCatalogBasePriceListByType(long groupId, String type) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("type", checkNull(type));

			_command.put("/commerce.commercepricelist/fetch-commerce-catalog-base-price-list-by-type", _params);
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

	public JSONObject fetchCommercePriceList(long commercePriceListId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceListId", commercePriceListId);

			_command.put("/commerce.commercepricelist/fetch-commerce-price-list", _params);
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

	public JSONObject getCommercePriceList(long commercePriceListId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceListId", commercePriceListId);

			_command.put("/commerce.commercepricelist/get-commerce-price-list", _params);
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

	public JSONArray getCommercePriceLists(long companyId, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.price.list.model.CommercePriceList>", orderByComparator);

			_command.put("/commerce.commercepricelist/get-commerce-price-lists", _params);
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

	public Integer getCommercePriceListsCount(long companyId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("status", status);

			_command.put("/commerce.commercepricelist/get-commerce-price-lists-count", _params);
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

	public Integer getCommercePriceListsCount(long commercePricingClassId, String title) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePricingClassId", commercePricingClassId);
			_params.put("title", checkNull(title));

			_command.put("/commerce.commercepricelist/get-commerce-price-lists-count", _params);
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

	public JSONArray searchByCommercePricingClassId(long commercePricingClassId, String name, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePricingClassId", commercePricingClassId);
			_params.put("end", end);
			_params.put("name", checkNull(name));
			_params.put("start", start);

			_command.put("/commerce.commercepricelist/search-by-commerce-pricing-class-id", _params);
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

	public JSONObject searchCommercePriceLists(long companyId, String keywords, int status, int start, int end, JSONObjectWrapper sort) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "sort", "com.liferay.portal.kernel.search.Sort", sort);

			_command.put("/commerce.commercepricelist/search-commerce-price-lists", _params);
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

	public Integer searchCommercePriceListsCount(long companyId, String keywords, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("keywords", checkNull(keywords));
			_params.put("status", status);

			_command.put("/commerce.commercepricelist/search-commerce-price-lists-count", _params);
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

	public void setCatalogBasePriceList(long groupId, long commercePriceListId, String type) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePriceListId", commercePriceListId);
			_params.put("groupId", groupId);
			_params.put("type", checkNull(type));

			_command.put("/commerce.commercepricelist/set-catalog-base-price-list", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject updateCommercePriceList(long commercePriceListId, long commerceCurrencyId, boolean netPrice, long parentCommercePriceListId, String name, double priority, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceCurrencyId", commerceCurrencyId);
			_params.put("commercePriceListId", commercePriceListId);
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
			_params.put("name", checkNull(name));
			_params.put("netPrice", netPrice);
			_params.put("neverExpire", neverExpire);
			_params.put("parentCommercePriceListId", parentCommercePriceListId);
			_params.put("priority", priority);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepricelist/update-commerce-price-list", _params);
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

	public JSONObject updateCommercePriceList(long commercePriceListId, long commerceCurrencyId, boolean netPrice, String type, long parentCommercePriceListId, boolean catalogBasePriceList, String name, double priority, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("catalogBasePriceList", catalogBasePriceList);
			_params.put("commerceCurrencyId", commerceCurrencyId);
			_params.put("commercePriceListId", commercePriceListId);
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
			_params.put("name", checkNull(name));
			_params.put("netPrice", netPrice);
			_params.put("neverExpire", neverExpire);
			_params.put("parentCommercePriceListId", parentCommercePriceListId);
			_params.put("priority", priority);
			_params.put("type", checkNull(type));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepricelist/update-commerce-price-list", _params);
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

	public JSONObject updateCommercePriceList(long commercePriceListId, long commerceCurrencyId, long parentCommercePriceListId, String name, double priority, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceCurrencyId", commerceCurrencyId);
			_params.put("commercePriceListId", commercePriceListId);
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
			_params.put("name", checkNull(name));
			_params.put("neverExpire", neverExpire);
			_params.put("parentCommercePriceListId", parentCommercePriceListId);
			_params.put("priority", priority);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepricelist/update-commerce-price-list", _params);
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

	public JSONObject updateCommercePriceList(long commercePriceListId, long commerceCurrencyId, String name, double priority, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceCurrencyId", commerceCurrencyId);
			_params.put("commercePriceListId", commercePriceListId);
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
			_params.put("name", checkNull(name));
			_params.put("neverExpire", neverExpire);
			_params.put("priority", priority);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepricelist/update-commerce-price-list", _params);
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

	public JSONObject updateExternalReferenceCode(JSONObjectWrapper commercePriceList, long companyId, String externalReferenceCode) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			mangleWrapper(_params, "commercePriceList", "com.liferay.commerce.price.list.model.CommercePriceList", commercePriceList);
			_params.put("companyId", companyId);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));

			_command.put("/commerce.commercepricelist/update-external-reference-code", _params);
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

	public JSONObject upsertCommercePriceList(long groupId, long userId, long commercePriceListId, long commerceCurrencyId, boolean netPrice, String type, long parentCommercePriceListId, boolean catalogBasePriceList, String name, double priority, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, String externalReferenceCode, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("catalogBasePriceList", catalogBasePriceList);
			_params.put("commerceCurrencyId", commerceCurrencyId);
			_params.put("commercePriceListId", commercePriceListId);
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
			_params.put("name", checkNull(name));
			_params.put("netPrice", netPrice);
			_params.put("neverExpire", neverExpire);
			_params.put("parentCommercePriceListId", parentCommercePriceListId);
			_params.put("priority", priority);
			_params.put("type", checkNull(type));
			_params.put("userId", userId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepricelist/upsert-commerce-price-list", _params);
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

	public JSONObject upsertCommercePriceList(long groupId, long userId, long commercePriceListId, long commerceCurrencyId, long parentCommercePriceListId, String name, double priority, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, String externalReferenceCode, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceCurrencyId", commerceCurrencyId);
			_params.put("commercePriceListId", commercePriceListId);
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
			_params.put("name", checkNull(name));
			_params.put("neverExpire", neverExpire);
			_params.put("parentCommercePriceListId", parentCommercePriceListId);
			_params.put("priority", priority);
			_params.put("userId", userId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepricelist/upsert-commerce-price-list", _params);
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

	public JSONObject upsertCommercePriceList(long groupId, long userId, long commercePriceListId, long commerceCurrencyId, String name, double priority, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, String externalReferenceCode, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceCurrencyId", commerceCurrencyId);
			_params.put("commercePriceListId", commercePriceListId);
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
			_params.put("name", checkNull(name));
			_params.put("neverExpire", neverExpire);
			_params.put("priority", priority);
			_params.put("userId", userId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercepricelist/upsert-commerce-price-list", _params);
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