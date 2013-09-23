/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.mobile.android.v62.assetcategoryproperty;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.ServiceContext;
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class AssetCategoryPropertyService extends BaseService {
	public AssetCategoryPropertyService(ServiceContext context) {
		super(context);
	}

	public AssetCategoryPropertyService(ServiceContext context,
		AsyncTaskCallback callback) {
		super(context, callback);
	}

	public AssetCategoryPropertyService(ServiceContext context, boolean batch) {
		super(context, batch);
	}

	public JSONObject addCategoryProperty(long entryId, String key, String value)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("entryId", entryId);
			_params.put("key", key);
			_params.put("value", value);

			_command.put("/assetcategoryproperty/add-category-property", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public void deleteCategoryProperty(long categoryPropertyId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryPropertyId", categoryPropertyId);

			_command.put("/assetcategoryproperty/delete-category-property",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		post(_command);
	}

	public JSONArray getCategoryProperties(long entryId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("entryId", entryId);

			_command.put("/assetcategoryproperty/get-category-properties",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public JSONArray getCategoryPropertyValues(long companyId, String key)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("key", key);

			_command.put("/assetcategoryproperty/get-category-property-values",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public JSONObject updateCategoryProperty(long categoryPropertyId,
		String key, String value) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryPropertyId", categoryPropertyId);
			_params.put("key", key);
			_params.put("value", value);

			_command.put("/assetcategoryproperty/update-category-property",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}
}