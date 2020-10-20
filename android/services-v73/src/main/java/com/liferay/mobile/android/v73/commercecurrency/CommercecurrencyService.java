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

package com.liferay.mobile.android.v73.commercecurrency;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommercecurrencyService extends BaseService {

	public CommercecurrencyService(Session session) {
		super(session);
	}

	public JSONObject addCommerceCurrency(long userId, String code, JSONObject nameMap, String symbol, JSONObject rate, JSONObject formatPatternMap, int maxFractionDigits, int minFractionDigits, String roundingMode, boolean primary, double priority, boolean active) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("code", checkNull(code));
			_params.put("formatPatternMap", checkNull(formatPatternMap));
			_params.put("maxFractionDigits", maxFractionDigits);
			_params.put("minFractionDigits", minFractionDigits);
			_params.put("nameMap", checkNull(nameMap));
			_params.put("primary", primary);
			_params.put("priority", priority);
			_params.put("rate", checkNull(rate));
			_params.put("roundingMode", checkNull(roundingMode));
			_params.put("symbol", checkNull(symbol));
			_params.put("userId", userId);

			_command.put("/commerce.commercecurrency/add-commerce-currency", _params);
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

	public void deleteCommerceCurrency(long commerceCurrencyId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceCurrencyId", commerceCurrencyId);

			_command.put("/commerce.commercecurrency/delete-commerce-currency", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchPrimaryCommerceCurrency(long companyId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);

			_command.put("/commerce.commercecurrency/fetch-primary-commerce-currency", _params);
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

	public JSONArray getCommerceCurrencies(long companyId, boolean active, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.currency.model.CommerceCurrency>", orderByComparator);

			_command.put("/commerce.commercecurrency/get-commerce-currencies", _params);
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

	public JSONArray getCommerceCurrencies(long companyId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.currency.model.CommerceCurrency>", orderByComparator);

			_command.put("/commerce.commercecurrency/get-commerce-currencies", _params);
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

	public Integer getCommerceCurrenciesCount(long companyId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);

			_command.put("/commerce.commercecurrency/get-commerce-currencies-count", _params);
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

	public Integer getCommerceCurrenciesCount(long companyId, boolean active) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("companyId", companyId);

			_command.put("/commerce.commercecurrency/get-commerce-currencies-count", _params);
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

	public JSONObject getCommerceCurrency(long commerceCurrencyId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceCurrencyId", commerceCurrencyId);

			_command.put("/commerce.commercecurrency/get-commerce-currency", _params);
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

	public JSONObject getCommerceCurrency(long companyId, String code) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("code", checkNull(code));
			_params.put("companyId", companyId);

			_command.put("/commerce.commercecurrency/get-commerce-currency", _params);
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

	public JSONObject setActive(long commerceCurrencyId, boolean active) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("commerceCurrencyId", commerceCurrencyId);

			_command.put("/commerce.commercecurrency/set-active", _params);
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

	public JSONObject setPrimary(long commerceCurrencyId, boolean primary) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceCurrencyId", commerceCurrencyId);
			_params.put("primary", primary);

			_command.put("/commerce.commercecurrency/set-primary", _params);
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

	public JSONObject updateCommerceCurrency(long commerceCurrencyId, String code, JSONObject nameMap, String symbol, JSONObject rate, JSONObject formatPatternMap, int maxFractionDigits, int minFractionDigits, String roundingMode, boolean primary, double priority, boolean active, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("code", checkNull(code));
			_params.put("commerceCurrencyId", commerceCurrencyId);
			_params.put("formatPatternMap", checkNull(formatPatternMap));
			_params.put("maxFractionDigits", maxFractionDigits);
			_params.put("minFractionDigits", minFractionDigits);
			_params.put("nameMap", checkNull(nameMap));
			_params.put("primary", primary);
			_params.put("priority", priority);
			_params.put("rate", checkNull(rate));
			_params.put("roundingMode", checkNull(roundingMode));
			_params.put("symbol", checkNull(symbol));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercecurrency/update-commerce-currency", _params);
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

	public void updateExchangeRate(long commerceCurrencyId, String exchangeRateProviderKey) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceCurrencyId", commerceCurrencyId);
			_params.put("exchangeRateProviderKey", checkNull(exchangeRateProviderKey));

			_command.put("/commerce.commercecurrency/update-exchange-rate", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void updateExchangeRates() throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_command.put("/commerce.commercecurrency/update-exchange-rates", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

}