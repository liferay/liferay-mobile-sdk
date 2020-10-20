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

package com.liferay.mobile.android.v73.commerceapplicationmodel;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommerceapplicationmodelService extends BaseService {

	public CommerceapplicationmodelService(Session session) {
		super(session);
	}

	public JSONObject addCommerceApplicationModel(long userId, long commerceApplicationBrandId, String name, String year) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceApplicationBrandId", commerceApplicationBrandId);
			_params.put("name", checkNull(name));
			_params.put("userId", userId);
			_params.put("year", checkNull(year));

			_command.put("/commerce.commerceapplicationmodel/add-commerce-application-model", _params);
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

	public void deleteCommerceApplicationModel(long commerceApplicationModelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceApplicationModelId", commerceApplicationModelId);

			_command.put("/commerce.commerceapplicationmodel/delete-commerce-application-model", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject getCommerceApplicationModel(long commerceApplicationModelId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceApplicationModelId", commerceApplicationModelId);

			_command.put("/commerce.commerceapplicationmodel/get-commerce-application-model", _params);
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

	public JSONArray getCommerceApplicationModels(long commerceApplicationBrandId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceApplicationBrandId", commerceApplicationBrandId);
			_params.put("end", end);
			_params.put("start", start);

			_command.put("/commerce.commerceapplicationmodel/get-commerce-application-models", _params);
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

	public JSONArray getCommerceApplicationModelsByCompanyId(long companyId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("start", start);

			_command.put("/commerce.commerceapplicationmodel/get-commerce-application-models-by-company-id", _params);
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

	public Integer getCommerceApplicationModelsCount(long commerceApplicationBrandId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceApplicationBrandId", commerceApplicationBrandId);

			_command.put("/commerce.commerceapplicationmodel/get-commerce-application-models-count", _params);
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

	public Integer getCommerceApplicationModelsCountByCompanyId(long companyId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);

			_command.put("/commerce.commerceapplicationmodel/get-commerce-application-models-count-by-company-id", _params);
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

	public JSONObject updateCommerceApplicationModel(long commerceApplicationModelId, String name, String year) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceApplicationModelId", commerceApplicationModelId);
			_params.put("name", checkNull(name));
			_params.put("year", checkNull(year));

			_command.put("/commerce.commerceapplicationmodel/update-commerce-application-model", _params);
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