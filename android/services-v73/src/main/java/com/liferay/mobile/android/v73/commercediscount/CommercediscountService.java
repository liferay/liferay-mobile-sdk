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

package com.liferay.mobile.android.v73.commercediscount;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommercediscountService extends BaseService {

	public CommercediscountService(Session session) {
		super(session);
	}

	public JSONObject addCommerceDiscount(long userId, String title, String target, boolean useCouponCode, String couponCode, boolean usePercentage, JSONObject maximumDiscountAmount, JSONObject level1, JSONObject level2, JSONObject level3, JSONObject level4, String limitationType, int limitationTimes, boolean active, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("couponCode", checkNull(couponCode));
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
			_params.put("level1", checkNull(level1));
			_params.put("level2", checkNull(level2));
			_params.put("level3", checkNull(level3));
			_params.put("level4", checkNull(level4));
			_params.put("limitationTimes", limitationTimes);
			_params.put("limitationType", checkNull(limitationType));
			_params.put("maximumDiscountAmount", checkNull(maximumDiscountAmount));
			_params.put("neverExpire", neverExpire);
			_params.put("target", checkNull(target));
			_params.put("title", checkNull(title));
			_params.put("useCouponCode", useCouponCode);
			_params.put("usePercentage", usePercentage);
			_params.put("userId", userId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercediscount/add-commerce-discount", _params);
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

	public JSONObject addCommerceDiscount(long userId, String title, String target, boolean useCouponCode, String couponCode, boolean usePercentage, JSONObject maximumDiscountAmount, String level, JSONObject level1, JSONObject level2, JSONObject level3, JSONObject level4, String limitationType, int limitationTimes, boolean rulesConjunction, boolean active, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("couponCode", checkNull(couponCode));
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
			_params.put("level", checkNull(level));
			_params.put("level1", checkNull(level1));
			_params.put("level2", checkNull(level2));
			_params.put("level3", checkNull(level3));
			_params.put("level4", checkNull(level4));
			_params.put("limitationTimes", limitationTimes);
			_params.put("limitationType", checkNull(limitationType));
			_params.put("maximumDiscountAmount", checkNull(maximumDiscountAmount));
			_params.put("neverExpire", neverExpire);
			_params.put("rulesConjunction", rulesConjunction);
			_params.put("target", checkNull(target));
			_params.put("title", checkNull(title));
			_params.put("useCouponCode", useCouponCode);
			_params.put("usePercentage", usePercentage);
			_params.put("userId", userId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercediscount/add-commerce-discount", _params);
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

	public JSONObject addCommerceDiscount(long userId, String title, String target, boolean useCouponCode, String couponCode, boolean usePercentage, JSONObject maximumDiscountAmount, String level, JSONObject level1, JSONObject level2, JSONObject level3, JSONObject level4, String limitationType, int limitationTimes, int limitationTimesPerAccount, boolean rulesConjunction, boolean active, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, String externalReferenceCode, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("couponCode", checkNull(couponCode));
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
			_params.put("level", checkNull(level));
			_params.put("level1", checkNull(level1));
			_params.put("level2", checkNull(level2));
			_params.put("level3", checkNull(level3));
			_params.put("level4", checkNull(level4));
			_params.put("limitationTimes", limitationTimes);
			_params.put("limitationTimesPerAccount", limitationTimesPerAccount);
			_params.put("limitationType", checkNull(limitationType));
			_params.put("maximumDiscountAmount", checkNull(maximumDiscountAmount));
			_params.put("neverExpire", neverExpire);
			_params.put("rulesConjunction", rulesConjunction);
			_params.put("target", checkNull(target));
			_params.put("title", checkNull(title));
			_params.put("useCouponCode", useCouponCode);
			_params.put("usePercentage", usePercentage);
			_params.put("userId", userId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercediscount/add-commerce-discount", _params);
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

	public void deleteCommerceDiscount(long commerceDiscountId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceDiscountId", commerceDiscountId);

			_command.put("/commerce.commercediscount/delete-commerce-discount", _params);
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

			_command.put("/commerce.commercediscount/fetch-by-external-reference-code", _params);
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

	public JSONObject fetchCommerceDiscount(long commerceDiscountId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceDiscountId", commerceDiscountId);

			_command.put("/commerce.commercediscount/fetch-commerce-discount", _params);
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

	public JSONObject getCommerceDiscount(long commerceDiscountId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceDiscountId", commerceDiscountId);

			_command.put("/commerce.commercediscount/get-commerce-discount", _params);
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

	public JSONArray getCommerceDiscounts(long companyId, String couponCode) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("couponCode", checkNull(couponCode));

			_command.put("/commerce.commercediscount/get-commerce-discounts", _params);
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

	public Integer getCommerceDiscountsCount(long companyId, String couponCode) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("couponCode", checkNull(couponCode));

			_command.put("/commerce.commercediscount/get-commerce-discounts-count", _params);
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

	public Integer getCommerceDiscountsCountByPricingClassId(long commercePricingClassId, String title) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePricingClassId", commercePricingClassId);
			_params.put("title", checkNull(title));

			_command.put("/commerce.commercediscount/get-commerce-discounts-count-by-pricing-class-id", _params);
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

	public JSONArray searchByCommercePricingClassId(long commercePricingClassId, String title, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commercePricingClassId", commercePricingClassId);
			_params.put("end", end);
			_params.put("start", start);
			_params.put("title", checkNull(title));

			_command.put("/commerce.commercediscount/search-by-commerce-pricing-class-id", _params);
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

	public JSONObject searchCommerceDiscounts(long companyId, String keywords, int status, int start, int end, JSONObjectWrapper sort) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "sort", "com.liferay.portal.kernel.search.Sort", sort);

			_command.put("/commerce.commercediscount/search-commerce-discounts", _params);
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

	public JSONObject updateCommerceDiscount(long commerceDiscountId, String title, String target, boolean useCouponCode, String couponCode, boolean usePercentage, JSONObject maximumDiscountAmount, JSONObject level1, JSONObject level2, JSONObject level3, JSONObject level4, String limitationType, int limitationTimes, boolean active, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("commerceDiscountId", commerceDiscountId);
			_params.put("couponCode", checkNull(couponCode));
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
			_params.put("level1", checkNull(level1));
			_params.put("level2", checkNull(level2));
			_params.put("level3", checkNull(level3));
			_params.put("level4", checkNull(level4));
			_params.put("limitationTimes", limitationTimes);
			_params.put("limitationType", checkNull(limitationType));
			_params.put("maximumDiscountAmount", checkNull(maximumDiscountAmount));
			_params.put("neverExpire", neverExpire);
			_params.put("target", checkNull(target));
			_params.put("title", checkNull(title));
			_params.put("useCouponCode", useCouponCode);
			_params.put("usePercentage", usePercentage);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercediscount/update-commerce-discount", _params);
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

	public JSONObject updateCommerceDiscount(long commerceDiscountId, String title, String target, boolean useCouponCode, String couponCode, boolean usePercentage, JSONObject maximumDiscountAmount, String level, JSONObject level1, JSONObject level2, JSONObject level3, JSONObject level4, String limitationType, int limitationTimes, boolean rulesConjunction, boolean active, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("commerceDiscountId", commerceDiscountId);
			_params.put("couponCode", checkNull(couponCode));
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
			_params.put("level", checkNull(level));
			_params.put("level1", checkNull(level1));
			_params.put("level2", checkNull(level2));
			_params.put("level3", checkNull(level3));
			_params.put("level4", checkNull(level4));
			_params.put("limitationTimes", limitationTimes);
			_params.put("limitationType", checkNull(limitationType));
			_params.put("maximumDiscountAmount", checkNull(maximumDiscountAmount));
			_params.put("neverExpire", neverExpire);
			_params.put("rulesConjunction", rulesConjunction);
			_params.put("target", checkNull(target));
			_params.put("title", checkNull(title));
			_params.put("useCouponCode", useCouponCode);
			_params.put("usePercentage", usePercentage);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercediscount/update-commerce-discount", _params);
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

	public JSONObject updateCommerceDiscount(long commerceDiscountId, String title, String target, boolean useCouponCode, String couponCode, boolean usePercentage, JSONObject maximumDiscountAmount, String level, JSONObject level1, JSONObject level2, JSONObject level3, JSONObject level4, String limitationType, int limitationTimes, int limitationTimesPerAccount, boolean rulesConjunction, boolean active, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("commerceDiscountId", commerceDiscountId);
			_params.put("couponCode", checkNull(couponCode));
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
			_params.put("level", checkNull(level));
			_params.put("level1", checkNull(level1));
			_params.put("level2", checkNull(level2));
			_params.put("level3", checkNull(level3));
			_params.put("level4", checkNull(level4));
			_params.put("limitationTimes", limitationTimes);
			_params.put("limitationTimesPerAccount", limitationTimesPerAccount);
			_params.put("limitationType", checkNull(limitationType));
			_params.put("maximumDiscountAmount", checkNull(maximumDiscountAmount));
			_params.put("neverExpire", neverExpire);
			_params.put("rulesConjunction", rulesConjunction);
			_params.put("target", checkNull(target));
			_params.put("title", checkNull(title));
			_params.put("useCouponCode", useCouponCode);
			_params.put("usePercentage", usePercentage);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercediscount/update-commerce-discount", _params);
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

	public JSONObject updateCommerceDiscountExternalReferenceCode(long commerceDiscountId, String externalReferenceCode) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceDiscountId", commerceDiscountId);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));

			_command.put("/commerce.commercediscount/update-commerce-discount-external-reference-code", _params);
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

	public JSONObject upsertCommerceDiscount(long userId, long commerceDiscountId, String title, String target, boolean useCouponCode, String couponCode, boolean usePercentage, JSONObject maximumDiscountAmount, JSONObject level1, JSONObject level2, JSONObject level3, JSONObject level4, String limitationType, int limitationTimes, boolean active, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, String externalReferenceCode, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("commerceDiscountId", commerceDiscountId);
			_params.put("couponCode", checkNull(couponCode));
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
			_params.put("level1", checkNull(level1));
			_params.put("level2", checkNull(level2));
			_params.put("level3", checkNull(level3));
			_params.put("level4", checkNull(level4));
			_params.put("limitationTimes", limitationTimes);
			_params.put("limitationType", checkNull(limitationType));
			_params.put("maximumDiscountAmount", checkNull(maximumDiscountAmount));
			_params.put("neverExpire", neverExpire);
			_params.put("target", checkNull(target));
			_params.put("title", checkNull(title));
			_params.put("useCouponCode", useCouponCode);
			_params.put("usePercentage", usePercentage);
			_params.put("userId", userId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercediscount/upsert-commerce-discount", _params);
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

	public JSONObject upsertCommerceDiscount(long userId, long commerceDiscountId, String title, String target, boolean useCouponCode, String couponCode, boolean usePercentage, JSONObject maximumDiscountAmount, String level, JSONObject level1, JSONObject level2, JSONObject level3, JSONObject level4, String limitationType, int limitationTimes, boolean rulesConjunction, boolean active, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, String externalReferenceCode, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("commerceDiscountId", commerceDiscountId);
			_params.put("couponCode", checkNull(couponCode));
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
			_params.put("level", checkNull(level));
			_params.put("level1", checkNull(level1));
			_params.put("level2", checkNull(level2));
			_params.put("level3", checkNull(level3));
			_params.put("level4", checkNull(level4));
			_params.put("limitationTimes", limitationTimes);
			_params.put("limitationType", checkNull(limitationType));
			_params.put("maximumDiscountAmount", checkNull(maximumDiscountAmount));
			_params.put("neverExpire", neverExpire);
			_params.put("rulesConjunction", rulesConjunction);
			_params.put("target", checkNull(target));
			_params.put("title", checkNull(title));
			_params.put("useCouponCode", useCouponCode);
			_params.put("usePercentage", usePercentage);
			_params.put("userId", userId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercediscount/upsert-commerce-discount", _params);
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

	public JSONObject upsertCommerceDiscount(long userId, long commerceDiscountId, String title, String target, boolean useCouponCode, String couponCode, boolean usePercentage, JSONObject maximumDiscountAmount, String level, JSONObject level1, JSONObject level2, JSONObject level3, JSONObject level4, String limitationType, int limitationTimes, int limitationTimesPerAccount, boolean rulesConjunction, boolean active, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, String externalReferenceCode, boolean neverExpire, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("commerceDiscountId", commerceDiscountId);
			_params.put("couponCode", checkNull(couponCode));
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
			_params.put("level", checkNull(level));
			_params.put("level1", checkNull(level1));
			_params.put("level2", checkNull(level2));
			_params.put("level3", checkNull(level3));
			_params.put("level4", checkNull(level4));
			_params.put("limitationTimes", limitationTimes);
			_params.put("limitationTimesPerAccount", limitationTimesPerAccount);
			_params.put("limitationType", checkNull(limitationType));
			_params.put("maximumDiscountAmount", checkNull(maximumDiscountAmount));
			_params.put("neverExpire", neverExpire);
			_params.put("rulesConjunction", rulesConjunction);
			_params.put("target", checkNull(target));
			_params.put("title", checkNull(title));
			_params.put("useCouponCode", useCouponCode);
			_params.put("usePercentage", usePercentage);
			_params.put("userId", userId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercediscount/upsert-commerce-discount", _params);
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