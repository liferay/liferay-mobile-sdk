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

package com.liferay.mobile.android.v72.assetcategory;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

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

	public JSONObject addCategory(long groupId, long parentCategoryId, JSONObject titleMap, JSONObject descriptionMap, long vocabularyId, JSONArray categoryProperties, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryProperties", checkNull(categoryProperties));
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("groupId", groupId);
			_params.put("parentCategoryId", parentCategoryId);
			_params.put("titleMap", checkNull(titleMap));
			_params.put("vocabularyId", vocabularyId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/assetcategory/add-category", _params);
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

	public JSONObject addCategory(long groupId, String title, long vocabularyId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("title", checkNull(title));
			_params.put("vocabularyId", vocabularyId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/assetcategory/add-category", _params);
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

	public void deleteCategories(JSONArray categoryIds) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryIds", checkNull(categoryIds));

			_command.put("/assetcategory/delete-categories", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONArray deleteCategories(JSONArray categoryIds, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryIds", checkNull(categoryIds));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/assetcategory/delete-categories", _params);
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

	public void deleteCategory(long categoryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);

			_command.put("/assetcategory/delete-category", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchCategory(long categoryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);

			_command.put("/assetcategory/fetch-category", _params);
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

	public JSONArray getCategories(long classNameId, long classPK, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("end", end);
			_params.put("start", start);

			_command.put("/assetcategory/get-categories", _params);
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

	public JSONArray getCategories(String className, long classPK) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", checkNull(className));
			_params.put("classPK", classPK);

			_command.put("/assetcategory/get-categories", _params);
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

	public Integer getCategoriesCount(long classNameId, long classPK) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);

			_command.put("/assetcategory/get-categories-count", _params);
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

	public JSONObject getCategory(long categoryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);

			_command.put("/assetcategory/get-category", _params);
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

	public String getCategoryPath(long categoryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);

			_command.put("/assetcategory/get-category-path", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getString(0);
	}

	public JSONArray getChildCategories(long parentCategoryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("parentCategoryId", parentCategoryId);

			_command.put("/assetcategory/get-child-categories", _params);
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

	public JSONArray getChildCategories(long parentCategoryId, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("parentCategoryId", parentCategoryId);
			_params.put("start", start);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.asset.kernel.model.AssetCategory>", obc);

			_command.put("/assetcategory/get-child-categories", _params);
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

	public Integer getChildCategoriesCount(long parentCategoryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("parentCategoryId", parentCategoryId);

			_command.put("/assetcategory/get-child-categories-count", _params);
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

	public JSONArray getVocabularyCategories(long vocabularyId, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("start", start);
			_params.put("vocabularyId", vocabularyId);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.asset.kernel.model.AssetCategory>", obc);

			_command.put("/assetcategory/get-vocabulary-categories", _params);
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

	public JSONArray getVocabularyCategories(long parentCategoryId, long vocabularyId, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("parentCategoryId", parentCategoryId);
			_params.put("start", start);
			_params.put("vocabularyId", vocabularyId);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.asset.kernel.model.AssetCategory>", obc);

			_command.put("/assetcategory/get-vocabulary-categories", _params);
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

	public JSONArray getVocabularyCategories(long groupId, long parentCategoryId, long vocabularyId, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("parentCategoryId", parentCategoryId);
			_params.put("start", start);
			_params.put("vocabularyId", vocabularyId);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.asset.kernel.model.AssetCategory>", obc);

			_command.put("/assetcategory/get-vocabulary-categories", _params);
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

	public JSONArray getVocabularyCategories(long groupId, String name, long vocabularyId, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("start", start);
			_params.put("vocabularyId", vocabularyId);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.asset.kernel.model.AssetCategory>", obc);

			_command.put("/assetcategory/get-vocabulary-categories", _params);
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

	public Integer getVocabularyCategoriesCount(long groupId, long vocabularyId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("vocabularyId", vocabularyId);

			_command.put("/assetcategory/get-vocabulary-categories-count", _params);
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

	public Integer getVocabularyCategoriesCount(long groupId, long parentCategory, long vocabularyId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentCategory", parentCategory);
			_params.put("vocabularyId", vocabularyId);

			_command.put("/assetcategory/get-vocabulary-categories-count", _params);
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

	public Integer getVocabularyCategoriesCount(long groupId, String name, long vocabularyId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("vocabularyId", vocabularyId);

			_command.put("/assetcategory/get-vocabulary-categories-count", _params);
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

	public JSONObject getVocabularyCategoriesDisplay(long vocabularyId, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("start", start);
			_params.put("vocabularyId", vocabularyId);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.asset.kernel.model.AssetCategory>", obc);

			_command.put("/assetcategory/get-vocabulary-categories-display", _params);
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

	public JSONObject getVocabularyCategoriesDisplay(long groupId, String name, long vocabularyId, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("start", start);
			_params.put("vocabularyId", vocabularyId);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.asset.kernel.model.AssetCategory>", obc);

			_command.put("/assetcategory/get-vocabulary-categories-display", _params);
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

	public JSONArray getVocabularyRootCategories(long groupId, long vocabularyId, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("vocabularyId", vocabularyId);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.asset.kernel.model.AssetCategory>", obc);

			_command.put("/assetcategory/get-vocabulary-root-categories", _params);
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

	public Integer getVocabularyRootCategoriesCount(long groupId, long vocabularyId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("vocabularyId", vocabularyId);

			_command.put("/assetcategory/get-vocabulary-root-categories-count", _params);
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

	public JSONObject moveCategory(long categoryId, long parentCategoryId, long vocabularyId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);
			_params.put("parentCategoryId", parentCategoryId);
			_params.put("vocabularyId", vocabularyId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/assetcategory/move-category", _params);
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

	public JSONArray search(JSONArray groupIds, String name, JSONArray vocabularyIds, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupIds", checkNull(groupIds));
			_params.put("name", checkNull(name));
			_params.put("start", start);
			_params.put("vocabularyIds", checkNull(vocabularyIds));

			_command.put("/assetcategory/search", _params);
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

	public JSONArray search(long groupId, String name, JSONArray categoryProperties, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryProperties", checkNull(categoryProperties));
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("start", start);

			_command.put("/assetcategory/search", _params);
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

	public JSONArray search(long groupId, String keywords, long vocabularyId, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);
			_params.put("vocabularyId", vocabularyId);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.asset.kernel.model.AssetCategory>", obc);

			_command.put("/assetcategory/search", _params);
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

	public JSONObject searchCategoriesDisplay(JSONArray groupIds, String title, JSONArray vocabularyIds, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupIds", checkNull(groupIds));
			_params.put("start", start);
			_params.put("title", checkNull(title));
			_params.put("vocabularyIds", checkNull(vocabularyIds));

			_command.put("/assetcategory/search-categories-display", _params);
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

	public JSONObject searchCategoriesDisplay(JSONArray groupIds, String title, JSONArray parentCategoryIds, JSONArray vocabularyIds, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupIds", checkNull(groupIds));
			_params.put("parentCategoryIds", checkNull(parentCategoryIds));
			_params.put("start", start);
			_params.put("title", checkNull(title));
			_params.put("vocabularyIds", checkNull(vocabularyIds));

			_command.put("/assetcategory/search-categories-display", _params);
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

	public JSONObject searchCategoriesDisplay(JSONArray groupIds, String title, JSONArray vocabularyIds, JSONArray parentCategoryIds, int start, int end, JSONObjectWrapper sort) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupIds", checkNull(groupIds));
			_params.put("parentCategoryIds", checkNull(parentCategoryIds));
			_params.put("start", start);
			_params.put("title", checkNull(title));
			_params.put("vocabularyIds", checkNull(vocabularyIds));
			mangleWrapper(_params, "sort", "com.liferay.portal.kernel.search.Sort", sort);

			_command.put("/assetcategory/search-categories-display", _params);
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

	public JSONObject searchCategoriesDisplay(long groupId, String title, long vocabularyId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("title", checkNull(title));
			_params.put("vocabularyId", vocabularyId);

			_command.put("/assetcategory/search-categories-display", _params);
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

	public JSONObject searchCategoriesDisplay(long groupId, String title, long parentCategoryId, long vocabularyId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("parentCategoryId", parentCategoryId);
			_params.put("start", start);
			_params.put("title", checkNull(title));
			_params.put("vocabularyId", vocabularyId);

			_command.put("/assetcategory/search-categories-display", _params);
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

	public JSONObject searchCategoriesDisplay(long groupId, String title, long vocabularyId, long parentCategoryId, int start, int end, JSONObjectWrapper sort) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("parentCategoryId", parentCategoryId);
			_params.put("start", start);
			_params.put("title", checkNull(title));
			_params.put("vocabularyId", vocabularyId);
			mangleWrapper(_params, "sort", "com.liferay.portal.kernel.search.Sort", sort);

			_command.put("/assetcategory/search-categories-display", _params);
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

	public JSONObject updateCategory(long categoryId, long parentCategoryId, JSONObject titleMap, JSONObject descriptionMap, long vocabularyId, JSONArray categoryProperties, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);
			_params.put("categoryProperties", checkNull(categoryProperties));
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("parentCategoryId", parentCategoryId);
			_params.put("titleMap", checkNull(titleMap));
			_params.put("vocabularyId", vocabularyId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/assetcategory/update-category", _params);
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