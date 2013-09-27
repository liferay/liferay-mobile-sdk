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

package com.liferay.mobile.android.v62.mbcategory;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;

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

	public MBCategoryService(Session session, AsyncTaskCallback callback) {
		super(session, callback);
	}

	public MBCategoryService(Session session, boolean batch) {
		super(session, batch);
	}

	public JSONObject addCategory(long userId, long parentCategoryId,
		String name, String description, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);
			_params.put("parentCategoryId", parentCategoryId);
			_params.put("name", name);
			_params.put("description", description);
			_params.put("serviceContext", serviceContext);

			_command.put("/mbcategory/add-category", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public void deleteCategory(long groupId, long categoryId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("categoryId", categoryId);

			_command.put("/mbcategory/delete-category", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		post(_command);
	}

	public JSONArray getCategories(long groupId, JSONArray parentCategoryIds,
		int status, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentCategoryIds", parentCategoryIds);
			_params.put("status", status);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/mbcategory/get-categories", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public Integer getCategoriesCount(long groupId,
		JSONArray parentCategoryIds, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentCategoryIds", parentCategoryIds);
			_params.put("status", status);

			_command.put("/mbcategory/get-categories-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)post(_command);
	}

	public JSONObject getCategory(long categoryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);

			_command.put("/mbcategory/get-category", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONArray getCategoryIds(long groupId, long categoryId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("categoryId", categoryId);

			_command.put("/mbcategory/get-category-ids", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public JSONArray getSubcategoryIds(JSONArray categoryIds, long groupId,
		long categoryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryIds", categoryIds);
			_params.put("groupId", groupId);
			_params.put("categoryId", categoryId);

			_command.put("/mbcategory/get-subcategory-ids", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public JSONArray getSubscribedCategories(long groupId, long userId,
		int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("userId", userId);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/mbcategory/get-subscribed-categories", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public Integer getSubscribedCategoriesCount(long groupId, long userId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("userId", userId);

			_command.put("/mbcategory/get-subscribed-categories-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)post(_command);
	}

	public JSONObject moveCategory(long categoryId, long parentCategoryId,
		boolean mergeWithParentCategory) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);
			_params.put("parentCategoryId", parentCategoryId);
			_params.put("mergeWithParentCategory", mergeWithParentCategory);

			_command.put("/mbcategory/move-category", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONObject moveCategoryFromTrash(long categoryId, long newCategoryId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);
			_params.put("newCategoryId", newCategoryId);

			_command.put("/mbcategory/move-category-from-trash", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONObject moveCategoryToTrash(long categoryId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);

			_command.put("/mbcategory/move-category-to-trash", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public void restoreCategoryFromTrash(long categoryId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);

			_command.put("/mbcategory/restore-category-from-trash", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		post(_command);
	}

	public void subscribeCategory(long groupId, long categoryId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("categoryId", categoryId);

			_command.put("/mbcategory/subscribe-category", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		post(_command);
	}

	public void unsubscribeCategory(long groupId, long categoryId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("categoryId", categoryId);

			_command.put("/mbcategory/unsubscribe-category", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		post(_command);
	}

	public JSONObject updateCategory(long categoryId, long parentCategoryId,
		String name, String description, String displayStyle,
		String emailAddress, String inProtocol, String inServerName,
		int inServerPort, boolean inUseSSL, String inUserName,
		String inPassword, int inReadInterval, String outEmailAddress,
		boolean outCustom, String outServerName, int outServerPort,
		boolean outUseSSL, String outUserName, String outPassword,
		boolean mailingListActive, boolean allowAnonymousEmail,
		boolean mergeWithParentCategory, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("categoryId", categoryId);
			_params.put("parentCategoryId", parentCategoryId);
			_params.put("name", name);
			_params.put("description", description);
			_params.put("displayStyle", displayStyle);
			_params.put("emailAddress", emailAddress);
			_params.put("inProtocol", inProtocol);
			_params.put("inServerName", inServerName);
			_params.put("inServerPort", inServerPort);
			_params.put("inUseSSL", inUseSSL);
			_params.put("inUserName", inUserName);
			_params.put("inPassword", inPassword);
			_params.put("inReadInterval", inReadInterval);
			_params.put("outEmailAddress", outEmailAddress);
			_params.put("outCustom", outCustom);
			_params.put("outServerName", outServerName);
			_params.put("outServerPort", outServerPort);
			_params.put("outUseSSL", outUseSSL);
			_params.put("outUserName", outUserName);
			_params.put("outPassword", outPassword);
			_params.put("mailingListActive", mailingListActive);
			_params.put("allowAnonymousEmail", allowAnonymousEmail);
			_params.put("mergeWithParentCategory", mergeWithParentCategory);
			_params.put("serviceContext", serviceContext);

			_command.put("/mbcategory/update-category", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}
}