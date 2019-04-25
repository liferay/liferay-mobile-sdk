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

package com.liferay.mobile.android.v72.mbcategory;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class MBCategoryService extends BaseService {

	public MBCategoryService(Session session) {
		super(session);
	}

	public JSONObject addCategory(long userId, long parentCategoryId, String name, String description, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("description", checkNull(description));
			_params.put("name", checkNull(name));
			_params.put("parentCategoryId", parentCategoryId);
			_params.put("userId", userId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/mb.mbcategory/add-category", _params);
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

	public JSONObject addCategory(long parentCategoryId, String name, String description, String displayStyle, String emailAddress, String inProtocol, String inServerName, int inServerPort, boolean inUseSSL, String inUserName, String inPassword, int inReadInterval, String outEmailAddress, boolean outCustom, String outServerName, int outServerPort, boolean outUseSSL, String outUserName, String outPassword, boolean mailingListActive, boolean allowAnonymousEmail, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("allowAnonymousEmail", allowAnonymousEmail);
			_params.put("description", checkNull(description));
			_params.put("displayStyle", checkNull(displayStyle));
			_params.put("emailAddress", checkNull(emailAddress));
			_params.put("inPassword", checkNull(inPassword));
			_params.put("inProtocol", checkNull(inProtocol));
			_params.put("inReadInterval", inReadInterval);
			_params.put("inServerName", checkNull(inServerName));
			_params.put("inServerPort", inServerPort);
			_params.put("inUserName", checkNull(inUserName));
			_params.put("inUseSSL", inUseSSL);
			_params.put("mailingListActive", mailingListActive);
			_params.put("name", checkNull(name));
			_params.put("outCustom", outCustom);
			_params.put("outEmailAddress", checkNull(outEmailAddress));
			_params.put("outPassword", checkNull(outPassword));
			_params.put("outServerName", checkNull(outServerName));
			_params.put("outServerPort", outServerPort);
			_params.put("outUserName", checkNull(outUserName));
			_params.put("outUseSSL", outUseSSL);
			_params.put("parentCategoryId", parentCategoryId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/mb.mbcategory/add-category", _params);
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

	public void deleteCategory(long categoryId, boolean includeTrashedEntries) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);
			_params.put("includeTrashedEntries", includeTrashedEntries);

			_command.put("/mb.mbcategory/delete-category", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void deleteCategory(long groupId, long categoryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);
			_params.put("groupId", groupId);

			_command.put("/mb.mbcategory/delete-category", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONArray getCategories(long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);

			_command.put("/mb.mbcategory/get-categories", _params);
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

	public JSONArray getCategories(long groupId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("status", status);

			_command.put("/mb.mbcategory/get-categories", _params);
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

	public JSONArray getCategories(long groupId, JSONArray parentCategoryIds, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("parentCategoryIds", checkNull(parentCategoryIds));
			_params.put("start", start);

			_command.put("/mb.mbcategory/get-categories", _params);
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

	public JSONArray getCategories(long groupId, JSONArray parentCategoryIds, int status, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("parentCategoryIds", checkNull(parentCategoryIds));
			_params.put("start", start);
			_params.put("status", status);

			_command.put("/mb.mbcategory/get-categories", _params);
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

	public JSONArray getCategories(long groupId, JSONArray excludedCategoryIds, JSONArray parentCategoryIds, int status, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("excludedCategoryIds", checkNull(excludedCategoryIds));
			_params.put("groupId", groupId);
			_params.put("parentCategoryIds", checkNull(parentCategoryIds));
			_params.put("start", start);
			_params.put("status", status);

			_command.put("/mb.mbcategory/get-categories", _params);
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

	public JSONArray getCategories(long groupId, long parentCategoryId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("parentCategoryId", parentCategoryId);
			_params.put("start", start);

			_command.put("/mb.mbcategory/get-categories", _params);
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

	public JSONArray getCategories(long groupId, long parentCategoryId, int status, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("parentCategoryId", parentCategoryId);
			_params.put("start", start);
			_params.put("status", status);

			_command.put("/mb.mbcategory/get-categories", _params);
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

	public JSONArray getCategories(long groupId, long parentCategoryId, JSONObjectWrapper queryDefinition) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentCategoryId", parentCategoryId);
			mangleWrapper(_params, "queryDefinition", "com.liferay.portal.kernel.dao.orm.QueryDefinition<com.liferay.message.boards.model.MBCategory>", queryDefinition);

			_command.put("/mb.mbcategory/get-categories", _params);
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

	public JSONArray getCategories(long groupId, long excludedCategoryId, long parentCategoryId, int status, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("excludedCategoryId", excludedCategoryId);
			_params.put("groupId", groupId);
			_params.put("parentCategoryId", parentCategoryId);
			_params.put("start", start);
			_params.put("status", status);

			_command.put("/mb.mbcategory/get-categories", _params);
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

	public JSONArray getCategoriesAndThreads(long groupId, long categoryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);
			_params.put("groupId", groupId);

			_command.put("/mb.mbcategory/get-categories-and-threads", _params);
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

	public JSONArray getCategoriesAndThreads(long groupId, long categoryId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);
			_params.put("groupId", groupId);
			_params.put("status", status);

			_command.put("/mb.mbcategory/get-categories-and-threads", _params);
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

	public JSONArray getCategoriesAndThreads(long groupId, long categoryId, int status, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("status", status);

			_command.put("/mb.mbcategory/get-categories-and-threads", _params);
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

	public JSONArray getCategoriesAndThreads(long groupId, long categoryId, int status, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator", obc);

			_command.put("/mb.mbcategory/get-categories-and-threads", _params);
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

	public JSONArray getCategoriesAndThreads(long groupId, long categoryId, JSONObjectWrapper queryDefinition) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);
			_params.put("groupId", groupId);
			mangleWrapper(_params, "queryDefinition", "com.liferay.portal.kernel.dao.orm.QueryDefinition", queryDefinition);

			_command.put("/mb.mbcategory/get-categories-and-threads", _params);
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

	public Integer getCategoriesAndThreadsCount(long groupId, long categoryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);
			_params.put("groupId", groupId);

			_command.put("/mb.mbcategory/get-categories-and-threads-count", _params);
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

	public Integer getCategoriesAndThreadsCount(long groupId, long categoryId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);
			_params.put("groupId", groupId);
			_params.put("status", status);

			_command.put("/mb.mbcategory/get-categories-and-threads-count", _params);
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

	public Integer getCategoriesAndThreadsCount(long groupId, long categoryId, JSONObjectWrapper queryDefinition) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);
			_params.put("groupId", groupId);
			mangleWrapper(_params, "queryDefinition", "com.liferay.portal.kernel.dao.orm.QueryDefinition", queryDefinition);

			_command.put("/mb.mbcategory/get-categories-and-threads-count", _params);
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

	public Integer getCategoriesCount(long groupId, JSONArray parentCategoryIds) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentCategoryIds", checkNull(parentCategoryIds));

			_command.put("/mb.mbcategory/get-categories-count", _params);
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

	public Integer getCategoriesCount(long groupId, JSONArray parentCategoryIds, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentCategoryIds", checkNull(parentCategoryIds));
			_params.put("status", status);

			_command.put("/mb.mbcategory/get-categories-count", _params);
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

	public Integer getCategoriesCount(long groupId, JSONArray excludedCategoryIds, JSONArray parentCategoryIds, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("excludedCategoryIds", checkNull(excludedCategoryIds));
			_params.put("groupId", groupId);
			_params.put("parentCategoryIds", checkNull(parentCategoryIds));
			_params.put("status", status);

			_command.put("/mb.mbcategory/get-categories-count", _params);
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

	public Integer getCategoriesCount(long groupId, long parentCategoryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentCategoryId", parentCategoryId);

			_command.put("/mb.mbcategory/get-categories-count", _params);
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

	public Integer getCategoriesCount(long groupId, long parentCategoryId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentCategoryId", parentCategoryId);
			_params.put("status", status);

			_command.put("/mb.mbcategory/get-categories-count", _params);
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

	public Integer getCategoriesCount(long groupId, long parentCategoryId, JSONObjectWrapper queryDefinition) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentCategoryId", parentCategoryId);
			mangleWrapper(_params, "queryDefinition", "com.liferay.portal.kernel.dao.orm.QueryDefinition", queryDefinition);

			_command.put("/mb.mbcategory/get-categories-count", _params);
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

	public Integer getCategoriesCount(long groupId, long excludedCategoryId, long parentCategoryId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("excludedCategoryId", excludedCategoryId);
			_params.put("groupId", groupId);
			_params.put("parentCategoryId", parentCategoryId);
			_params.put("status", status);

			_command.put("/mb.mbcategory/get-categories-count", _params);
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

			_command.put("/mb.mbcategory/get-category", _params);
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

	public JSONArray getCategoryIds(long groupId, long categoryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);
			_params.put("groupId", groupId);

			_command.put("/mb.mbcategory/get-category-ids", _params);
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

	public JSONArray getSubcategoryIds(JSONArray categoryIds, long groupId, long categoryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);
			_params.put("categoryIds", checkNull(categoryIds));
			_params.put("groupId", groupId);

			_command.put("/mb.mbcategory/get-subcategory-ids", _params);
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

	public JSONArray getSubscribedCategories(long groupId, long userId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("userId", userId);

			_command.put("/mb.mbcategory/get-subscribed-categories", _params);
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

	public Integer getSubscribedCategoriesCount(long groupId, long userId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("userId", userId);

			_command.put("/mb.mbcategory/get-subscribed-categories-count", _params);
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

	public JSONObject moveCategory(long categoryId, long parentCategoryId, boolean mergeWithParentCategory) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);
			_params.put("mergeWithParentCategory", mergeWithParentCategory);
			_params.put("parentCategoryId", parentCategoryId);

			_command.put("/mb.mbcategory/move-category", _params);
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

	public JSONObject moveCategoryFromTrash(long categoryId, long newCategoryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);
			_params.put("newCategoryId", newCategoryId);

			_command.put("/mb.mbcategory/move-category-from-trash", _params);
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

	public JSONObject moveCategoryToTrash(long categoryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);

			_command.put("/mb.mbcategory/move-category-to-trash", _params);
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

	public void restoreCategoryFromTrash(long categoryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);

			_command.put("/mb.mbcategory/restore-category-from-trash", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void subscribeCategory(long groupId, long categoryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);
			_params.put("groupId", groupId);

			_command.put("/mb.mbcategory/subscribe-category", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void unsubscribeCategory(long groupId, long categoryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);
			_params.put("groupId", groupId);

			_command.put("/mb.mbcategory/unsubscribe-category", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject updateCategory(long categoryId, long parentCategoryId, String name, String description, String displayStyle, String emailAddress, String inProtocol, String inServerName, int inServerPort, boolean inUseSSL, String inUserName, String inPassword, int inReadInterval, String outEmailAddress, boolean outCustom, String outServerName, int outServerPort, boolean outUseSSL, String outUserName, String outPassword, boolean mailingListActive, boolean allowAnonymousEmail, boolean mergeWithParentCategory, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("allowAnonymousEmail", allowAnonymousEmail);
			_params.put("categoryId", categoryId);
			_params.put("description", checkNull(description));
			_params.put("displayStyle", checkNull(displayStyle));
			_params.put("emailAddress", checkNull(emailAddress));
			_params.put("inPassword", checkNull(inPassword));
			_params.put("inProtocol", checkNull(inProtocol));
			_params.put("inReadInterval", inReadInterval);
			_params.put("inServerName", checkNull(inServerName));
			_params.put("inServerPort", inServerPort);
			_params.put("inUserName", checkNull(inUserName));
			_params.put("inUseSSL", inUseSSL);
			_params.put("mailingListActive", mailingListActive);
			_params.put("mergeWithParentCategory", mergeWithParentCategory);
			_params.put("name", checkNull(name));
			_params.put("outCustom", outCustom);
			_params.put("outEmailAddress", checkNull(outEmailAddress));
			_params.put("outPassword", checkNull(outPassword));
			_params.put("outServerName", checkNull(outServerName));
			_params.put("outServerPort", outServerPort);
			_params.put("outUserName", checkNull(outUserName));
			_params.put("outUseSSL", outUseSSL);
			_params.put("parentCategoryId", parentCategoryId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/mb.mbcategory/update-category", _params);
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