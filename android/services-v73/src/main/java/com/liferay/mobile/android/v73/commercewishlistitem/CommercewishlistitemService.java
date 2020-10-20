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

package com.liferay.mobile.android.v73.commercewishlistitem;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CommercewishlistitemService extends BaseService {

	public CommercewishlistitemService(Session session) {
		super(session);
	}

	public JSONObject addCommerceWishListItem(long commerceAccountId, long commerceWishListId, long cProductId, String cpInstanceUuid, String json, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceAccountId", commerceAccountId);
			_params.put("commerceWishListId", commerceWishListId);
			_params.put("cpInstanceUuid", checkNull(cpInstanceUuid));
			_params.put("cProductId", cProductId);
			_params.put("json", checkNull(json));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.commercewishlistitem/add-commerce-wish-list-item", _params);
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

	public void deleteCommerceWishListItem(long commerceWishListItemId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceWishListItemId", commerceWishListItemId);

			_command.put("/commerce.commercewishlistitem/delete-commerce-wish-list-item", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject getCommerceWishListItem(long commerceWishListItemId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceWishListItemId", commerceWishListItemId);

			_command.put("/commerce.commercewishlistitem/get-commerce-wish-list-item", _params);
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

	public JSONObject getCommerceWishListItem(long commerceWishListId, String cpInstanceUuid, long cProductId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceWishListId", commerceWishListId);
			_params.put("cpInstanceUuid", checkNull(cpInstanceUuid));
			_params.put("cProductId", cProductId);

			_command.put("/commerce.commercewishlistitem/get-commerce-wish-list-item", _params);
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

	public Integer getCommerceWishListItemByContainsCpInstanceCount(long commerceWishListId, String cpInstanceUuid) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceWishListId", commerceWishListId);
			_params.put("cpInstanceUuid", checkNull(cpInstanceUuid));

			_command.put("/commerce.commercewishlistitem/get-commerce-wish-list-item-by-contains-cp-instance-count", _params);
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

	public Integer getCommerceWishListItemByContainsCProductCount(long commerceWishListId, long cProductId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceWishListId", commerceWishListId);
			_params.put("cProductId", cProductId);

			_command.put("/commerce.commercewishlistitem/get-commerce-wish-list-item-by-contains-c-product-count", _params);
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

	public JSONArray getCommerceWishListItems(long commerceWishListId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceWishListId", commerceWishListId);
			_params.put("end", end);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.wish.list.model.CommerceWishListItem>", orderByComparator);

			_command.put("/commerce.commercewishlistitem/get-commerce-wish-list-items", _params);
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

	public Integer getCommerceWishListItemsCount(long commerceWishListId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("commerceWishListId", commerceWishListId);

			_command.put("/commerce.commercewishlistitem/get-commerce-wish-list-items-count", _params);
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

}