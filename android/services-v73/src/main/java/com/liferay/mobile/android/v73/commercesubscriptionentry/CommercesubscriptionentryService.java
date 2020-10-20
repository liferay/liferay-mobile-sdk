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

package com.liferay.mobile.android.v73.commercesubscriptionentry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommercesubscriptionentryService extends BaseService {

	public CommercesubscriptionentryService(Session session) {
		super(session);
	}

	public void deleteCommerceSubscriptionEntry(long commerceSubscriptionEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceSubscriptionEntryId", commerceSubscriptionEntryId);

			_command.put("/commerce.commercesubscriptionentry/delete-commerce-subscription-entry", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchCommerceSubscriptionEntry(long commerceSubscriptionEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceSubscriptionEntryId", commerceSubscriptionEntryId);

			_command.put("/commerce.commercesubscriptionentry/fetch-commerce-subscription-entry", _params);
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

	public JSONArray getCommerceSubscriptionEntries(long companyId, long userId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("start", start);
			_params.put("userId", userId);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceSubscriptionEntry>", orderByComparator);

			_command.put("/commerce.commercesubscriptionentry/get-commerce-subscription-entries", _params);
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

	public JSONArray getCommerceSubscriptionEntries(long companyId, long groupId, long userId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("userId", userId);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceSubscriptionEntry>", orderByComparator);

			_command.put("/commerce.commercesubscriptionentry/get-commerce-subscription-entries", _params);
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

	public Integer getCommerceSubscriptionEntriesCount(long companyId, long userId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("userId", userId);

			_command.put("/commerce.commercesubscriptionentry/get-commerce-subscription-entries-count", _params);
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

	public Integer getCommerceSubscriptionEntriesCount(long companyId, long groupId, long userId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupId", groupId);
			_params.put("userId", userId);

			_command.put("/commerce.commercesubscriptionentry/get-commerce-subscription-entries-count", _params);
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

	public JSONObject searchCommerceSubscriptionEntries(long companyId, JSONArray groupIds, long maxSubscriptionCycles, int subscriptionStatus, String keywords, int start, int end, JSONObjectWrapper sort) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("groupIds", checkNull(groupIds));
			_params.put("keywords", checkNull(keywords));
			_params.put("maxSubscriptionCycles", maxSubscriptionCycles);
			_params.put("start", start);
			_params.put("subscriptionStatus", subscriptionStatus);
			mangleWrapper(_params, "sort", "com.liferay.portal.kernel.search.Sort", sort);

			_command.put("/commerce.commercesubscriptionentry/search-commerce-subscription-entries", _params);
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

	public JSONObject searchCommerceSubscriptionEntries(long companyId, long maxSubscriptionCycles, int subscriptionStatus, String keywords, int start, int end, JSONObjectWrapper sort) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("keywords", checkNull(keywords));
			_params.put("maxSubscriptionCycles", maxSubscriptionCycles);
			_params.put("start", start);
			_params.put("subscriptionStatus", subscriptionStatus);
			mangleWrapper(_params, "sort", "com.liferay.portal.kernel.search.Sort", sort);

			_command.put("/commerce.commercesubscriptionentry/search-commerce-subscription-entries", _params);
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

	public JSONObject updateCommerceSubscriptionEntry(long commerceSubscriptionEntryId, int subscriptionLength, String subscriptionType, JSONObject subscriptionTypeSettingsUnicodeProperties, long maxSubscriptionCycles, int subscriptionStatus, int nextIterationDateMonth, int nextIterationDateDay, int nextIterationDateYear, int nextIterationDateHour, int nextIterationDateMinute, int deliverySubscriptionLength, String deliverySubscriptionType, JSONObject deliverySubscriptionTypeSettingsUnicodeProperties, long deliveryMaxSubscriptionCycles, int deliverySubscriptionStatus, int deliveryNextIterationDateMonth, int deliveryNextIterationDateDay, int deliveryNextIterationDateYear, int deliveryNextIterationDateHour, int deliveryNextIterationDateMinute) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceSubscriptionEntryId", commerceSubscriptionEntryId);
			_params.put("deliveryMaxSubscriptionCycles", deliveryMaxSubscriptionCycles);
			_params.put("deliveryNextIterationDateDay", deliveryNextIterationDateDay);
			_params.put("deliveryNextIterationDateHour", deliveryNextIterationDateHour);
			_params.put("deliveryNextIterationDateMinute", deliveryNextIterationDateMinute);
			_params.put("deliveryNextIterationDateMonth", deliveryNextIterationDateMonth);
			_params.put("deliveryNextIterationDateYear", deliveryNextIterationDateYear);
			_params.put("deliverySubscriptionLength", deliverySubscriptionLength);
			_params.put("deliverySubscriptionStatus", deliverySubscriptionStatus);
			_params.put("deliverySubscriptionType", checkNull(deliverySubscriptionType));
			_params.put("deliverySubscriptionTypeSettingsUnicodeProperties", checkNull(deliverySubscriptionTypeSettingsUnicodeProperties));
			_params.put("maxSubscriptionCycles", maxSubscriptionCycles);
			_params.put("nextIterationDateDay", nextIterationDateDay);
			_params.put("nextIterationDateHour", nextIterationDateHour);
			_params.put("nextIterationDateMinute", nextIterationDateMinute);
			_params.put("nextIterationDateMonth", nextIterationDateMonth);
			_params.put("nextIterationDateYear", nextIterationDateYear);
			_params.put("subscriptionLength", subscriptionLength);
			_params.put("subscriptionStatus", subscriptionStatus);
			_params.put("subscriptionType", checkNull(subscriptionType));
			_params.put("subscriptionTypeSettingsUnicodeProperties", checkNull(subscriptionTypeSettingsUnicodeProperties));

			_command.put("/commerce.commercesubscriptionentry/update-commerce-subscription-entry", _params);
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

	public JSONObject updateSubscriptionStatus(long commerceSubscriptionEntryId, int subscriptionStatus) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceSubscriptionEntryId", commerceSubscriptionEntryId);
			_params.put("subscriptionStatus", subscriptionStatus);

			_command.put("/commerce.commercesubscriptionentry/update-subscription-status", _params);
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