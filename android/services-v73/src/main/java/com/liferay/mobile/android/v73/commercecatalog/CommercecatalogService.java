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

package com.liferay.mobile.android.v73.commercecatalog;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommercecatalogService extends BaseService {

	public CommercecatalogService(Session session) {
		super(session);
	}

	public JSONObject addCommerceCatalog(String name, String commerceCurrencyCode, String catalogDefaultLanguageId, String externalReferenceCode, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("catalogDefaultLanguageId", checkNull(catalogDefaultLanguageId));
			_params.put("commerceCurrencyCode", checkNull(commerceCurrencyCode));
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));
			_params.put("name", checkNull(name));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercecatalog/add-commerce-catalog", _params);
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

	public JSONObject deleteCommerceCatalog(long commerceCatalogId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceCatalogId", commerceCatalogId);

			_command.put("/commerce.commercecatalog/delete-commerce-catalog", _params);
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

	public JSONObject fetchByExternalReferenceCode(long companyId, String externalReferenceCode) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));

			_command.put("/commerce.commercecatalog/fetch-by-external-reference-code", _params);
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

	public JSONObject fetchCommerceCatalog(long commerceCatalogId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceCatalogId", commerceCatalogId);

			_command.put("/commerce.commercecatalog/fetch-commerce-catalog", _params);
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

	public JSONObject fetchCommerceCatalogByGroupId(long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);

			_command.put("/commerce.commercecatalog/fetch-commerce-catalog-by-group-id", _params);
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

	public JSONObject getCommerceCatalog(long commerceCatalogId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceCatalogId", commerceCatalogId);

			_command.put("/commerce.commercecatalog/get-commerce-catalog", _params);
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

	public JSONArray getCommerceCatalogs(long companyId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("start", start);

			_command.put("/commerce.commercecatalog/get-commerce-catalogs", _params);
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

	public JSONArray searchCommerceCatalogs(long companyId, String keywords, int start, int end, JSONObjectWrapper sort) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);
			mangleWrapper(_params, "sort", "com.liferay.portal.kernel.search.Sort", sort);

			_command.put("/commerce.commercecatalog/search-commerce-catalogs", _params);
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

	public Integer searchCommerceCatalogsCount(long companyId, String keywords) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("keywords", checkNull(keywords));

			_command.put("/commerce.commercecatalog/search-commerce-catalogs-count", _params);
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

	public JSONObject updateCommerceCatalog(long commerceCatalogId, String name, String commerceCurrencyCode, String catalogDefaultLanguageId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("catalogDefaultLanguageId", checkNull(catalogDefaultLanguageId));
			_params.put("commerceCatalogId", commerceCatalogId);
			_params.put("commerceCurrencyCode", checkNull(commerceCurrencyCode));
			_params.put("name", checkNull(name));

			_command.put("/commerce.commercecatalog/update-commerce-catalog", _params);
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

	public JSONObject updateCommerceCatalogExternalReferenceCode(long commerceCatalogId, String externalReferenceCode) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceCatalogId", commerceCatalogId);
			_params.put("externalReferenceCode", checkNull(externalReferenceCode));

			_command.put("/commerce.commercecatalog/update-commerce-catalog-external-reference-code", _params);
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