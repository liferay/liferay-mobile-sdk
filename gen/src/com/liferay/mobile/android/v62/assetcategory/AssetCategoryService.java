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

package com.liferay.mobile.android.v62.assetcategory;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class AssetCategoryService extends BaseService {
	public AssetCategoryService(Session session) {
		super(session);
	}

	public AssetCategoryService(Session session, AsyncTaskCallback callback) {
		super(session, callback);
	}

	public AssetCategoryService(Session session, boolean batch) {
		super(session, batch);
	}

	public JSONObject addCategory(long parentCategoryId, JSONObject titleMap,
		JSONObject descriptionMap, long vocabularyId,
		JSONArray categoryProperties, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("parentCategoryId", parentCategoryId);
			_params.put("titleMap", titleMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("vocabularyId", vocabularyId);
			_params.put("categoryProperties", categoryProperties);
			_params.put("serviceContext", serviceContext);

			_command.put("/assetcategory/add-category", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONArray deleteCategories(JSONArray categoryIds,
		JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryIds", categoryIds);
			_params.put("serviceContext", serviceContext);

			_command.put("/assetcategory/delete-categories", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public void deleteCategory(long categoryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);

			_command.put("/assetcategory/delete-category", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		post(_command);
	}

	public JSONArray getCategories(String className, long classPK)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", className);
			_params.put("classPK", classPK);

			_command.put("/assetcategory/get-categories", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public JSONObject getCategory(long categoryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);

			_command.put("/assetcategory/get-category", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONArray getChildCategories(long parentCategoryId, int start,
		int end, JSONObject obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("parentCategoryId", parentCategoryId);
			_params.put("start", start);
			_params.put("end", end);
			_params.put("obc", obc);

			_command.put("/assetcategory/get-child-categories", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public JSONObject getJsonSearch(long groupId, String name,
		JSONArray vocabularyIds, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("name", name);
			_params.put("vocabularyIds", vocabularyIds);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/assetcategory/get-json-search", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONObject getJsonVocabularyCategories(long groupId, String name,
		long vocabularyId, int start, int end, JSONObject obc)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("name", name);
			_params.put("vocabularyId", vocabularyId);
			_params.put("start", start);
			_params.put("end", end);
			_params.put("obc", obc);

			_command.put("/assetcategory/get-json-vocabulary-categories",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONArray getVocabularyCategories(long groupId, String name,
		long vocabularyId, int start, int end, JSONObject obc)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("name", name);
			_params.put("vocabularyId", vocabularyId);
			_params.put("start", start);
			_params.put("end", end);
			_params.put("obc", obc);

			_command.put("/assetcategory/get-vocabulary-categories", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public Integer getVocabularyCategoriesCount(long groupId, String name,
		long vocabularyId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("name", name);
			_params.put("vocabularyId", vocabularyId);

			_command.put("/assetcategory/get-vocabulary-categories-count",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)post(_command);
	}

	public JSONObject getVocabularyCategoriesDisplay(long groupId, String name,
		long vocabularyId, int start, int end, JSONObject obc)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("name", name);
			_params.put("vocabularyId", vocabularyId);
			_params.put("start", start);
			_params.put("end", end);
			_params.put("obc", obc);

			_command.put("/assetcategory/get-vocabulary-categories-display",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONArray getVocabularyRootCategories(long groupId,
		long vocabularyId, int start, int end, JSONObject obc)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("vocabularyId", vocabularyId);
			_params.put("start", start);
			_params.put("end", end);
			_params.put("obc", obc);

			_command.put("/assetcategory/get-vocabulary-root-categories",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public Integer getVocabularyRootCategoriesCount(long groupId,
		long vocabularyId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("vocabularyId", vocabularyId);

			_command.put("/assetcategory/get-vocabulary-root-categories-count",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)post(_command);
	}

	public JSONObject moveCategory(long categoryId, long parentCategoryId,
		long vocabularyId, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);
			_params.put("parentCategoryId", parentCategoryId);
			_params.put("vocabularyId", vocabularyId);
			_params.put("serviceContext", serviceContext);

			_command.put("/assetcategory/move-category", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONArray search(long groupId, String keywords, long vocabularyId,
		int start, int end, JSONObject obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("keywords", keywords);
			_params.put("vocabularyId", vocabularyId);
			_params.put("start", start);
			_params.put("end", end);
			_params.put("obc", obc);

			_command.put("/assetcategory/search", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public JSONObject updateCategory(long categoryId, long parentCategoryId,
		JSONObject titleMap, JSONObject descriptionMap, long vocabularyId,
		JSONArray categoryProperties, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);
			_params.put("parentCategoryId", parentCategoryId);
			_params.put("titleMap", titleMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("vocabularyId", vocabularyId);
			_params.put("categoryProperties", categoryProperties);
			_params.put("serviceContext", serviceContext);

			_command.put("/assetcategory/update-category", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}
}