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

package com.liferay.mobile.android.v62.shoppingitem;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class ShoppingItemService extends BaseService {
	public ShoppingItemService(Session session) {
		super(session);
	}

	public ShoppingItemService(Session session, AsyncTaskCallback callback) {
		super(session, callback);
	}

	public ShoppingItemService(Session session, boolean batch) {
		super(session, batch);
	}

	public void addBookItems(long groupId, long categoryId, JSONArray isbns)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("categoryId", categoryId);
			_params.put("isbns", isbns);

			_command.put("/shoppingitem/add-book-items", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		post(_command);
	}

	public JSONObject addItem(long groupId, long categoryId, String sku,
		String name, String description, String properties,
		String fieldsQuantities, boolean requiresShipping, int stockQuantity,
		boolean featured, JSONObject sale, boolean smallImage,
		String smallImageURL, JSONObject smallFile, boolean mediumImage,
		String mediumImageURL, JSONObject mediumFile, boolean largeImage,
		String largeImageURL, JSONObject largeFile, JSONArray itemFields,
		JSONArray itemPrices, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("categoryId", categoryId);
			_params.put("sku", sku);
			_params.put("name", name);
			_params.put("description", description);
			_params.put("properties", properties);
			_params.put("fieldsQuantities", fieldsQuantities);
			_params.put("requiresShipping", requiresShipping);
			_params.put("stockQuantity", stockQuantity);
			_params.put("featured", featured);
			_params.put("sale", sale);
			_params.put("smallImage", smallImage);
			_params.put("smallImageURL", smallImageURL);
			_params.put("smallFile", smallFile);
			_params.put("mediumImage", mediumImage);
			_params.put("mediumImageURL", mediumImageURL);
			_params.put("mediumFile", mediumFile);
			_params.put("largeImage", largeImage);
			_params.put("largeImageURL", largeImageURL);
			_params.put("largeFile", largeFile);
			_params.put("itemFields", itemFields);
			_params.put("itemPrices", itemPrices);
			_params.put("serviceContext", serviceContext);

			_command.put("/shoppingitem/add-item", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public void deleteItem(long itemId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("itemId", itemId);

			_command.put("/shoppingitem/delete-item", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		post(_command);
	}

	public Integer getCategoriesItemsCount(long groupId, JSONArray categoryIds)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("categoryIds", categoryIds);

			_command.put("/shoppingitem/get-categories-items-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)post(_command);
	}

	public JSONObject getItem(long itemId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("itemId", itemId);

			_command.put("/shoppingitem/get-item", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONArray getItems(long groupId, long categoryId, int start,
		int end, JSONObject obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("categoryId", categoryId);
			_params.put("start", start);
			_params.put("end", end);
			_params.put("obc", obc);

			_command.put("/shoppingitem/get-items", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public Integer getItemsCount(long groupId, long categoryId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("categoryId", categoryId);

			_command.put("/shoppingitem/get-items-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)post(_command);
	}

	public JSONArray getItemsPrevAndNext(long itemId, JSONObject obc)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("itemId", itemId);
			_params.put("obc", obc);

			_command.put("/shoppingitem/get-items-prev-and-next", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public JSONObject updateItem(long itemId, long groupId, long categoryId,
		String sku, String name, String description, String properties,
		String fieldsQuantities, boolean requiresShipping, int stockQuantity,
		boolean featured, JSONObject sale, boolean smallImage,
		String smallImageURL, JSONObject smallFile, boolean mediumImage,
		String mediumImageURL, JSONObject mediumFile, boolean largeImage,
		String largeImageURL, JSONObject largeFile, JSONArray itemFields,
		JSONArray itemPrices, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("itemId", itemId);
			_params.put("groupId", groupId);
			_params.put("categoryId", categoryId);
			_params.put("sku", sku);
			_params.put("name", name);
			_params.put("description", description);
			_params.put("properties", properties);
			_params.put("fieldsQuantities", fieldsQuantities);
			_params.put("requiresShipping", requiresShipping);
			_params.put("stockQuantity", stockQuantity);
			_params.put("featured", featured);
			_params.put("sale", sale);
			_params.put("smallImage", smallImage);
			_params.put("smallImageURL", smallImageURL);
			_params.put("smallFile", smallFile);
			_params.put("mediumImage", mediumImage);
			_params.put("mediumImageURL", mediumImageURL);
			_params.put("mediumFile", mediumFile);
			_params.put("largeImage", largeImage);
			_params.put("largeImageURL", largeImageURL);
			_params.put("largeFile", largeFile);
			_params.put("itemFields", itemFields);
			_params.put("itemPrices", itemPrices);
			_params.put("serviceContext", serviceContext);

			_command.put("/shoppingitem/update-item", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}
}