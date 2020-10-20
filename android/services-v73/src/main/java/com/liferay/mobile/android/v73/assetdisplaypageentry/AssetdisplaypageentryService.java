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

package com.liferay.mobile.android.v73.assetdisplaypageentry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class AssetdisplaypageentryService extends BaseService {

	public AssetdisplaypageentryService(Session session) {
		super(session);
	}

	public JSONObject addAssetDisplayPageEntry(long userId, long groupId, long classNameId, long classPK, long layoutPageTemplateEntryId, int type, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("groupId", groupId);
			_params.put("layoutPageTemplateEntryId", layoutPageTemplateEntryId);
			_params.put("type", type);
			_params.put("userId", userId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/asset.assetdisplaypageentry/add-asset-display-page-entry", _params);
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

	public JSONObject addAssetDisplayPageEntry(long userId, long groupId, long classNameId, long classPK, long layoutPageTemplateEntryId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("groupId", groupId);
			_params.put("layoutPageTemplateEntryId", layoutPageTemplateEntryId);
			_params.put("userId", userId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/asset.assetdisplaypageentry/add-asset-display-page-entry", _params);
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

	public void deleteAssetDisplayPageEntry(long groupId, long classNameId, long classPK) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("groupId", groupId);

			_command.put("/asset.assetdisplaypageentry/delete-asset-display-page-entry", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchAssetDisplayPageEntry(long groupId, long classNameId, long classPK) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("groupId", groupId);

			_command.put("/asset.assetdisplaypageentry/fetch-asset-display-page-entry", _params);
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

	public JSONArray getAssetDisplayPageEntriesByLayoutPageTemplateEntryId(long layoutPageTemplateEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("layoutPageTemplateEntryId", layoutPageTemplateEntryId);

			_command.put("/asset.assetdisplaypageentry/get-asset-display-page-entries-by-layout-page-template-entry-id", _params);
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

	public JSONArray getAssetDisplayPageEntriesByLayoutPageTemplateEntryId(long layoutPageTemplateEntryId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("layoutPageTemplateEntryId", layoutPageTemplateEntryId);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.asset.display.page.model.AssetDisplayPageEntry>", orderByComparator);

			_command.put("/asset.assetdisplaypageentry/get-asset-display-page-entries-by-layout-page-template-entry-id", _params);
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

	public Integer getAssetDisplayPageEntriesCountByLayoutPageTemplateEntryId(long layoutPageTemplateEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("layoutPageTemplateEntryId", layoutPageTemplateEntryId);

			_command.put("/asset.assetdisplaypageentry/get-asset-display-page-entries-count-by-layout-page-template-entry-id", _params);
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

	public JSONObject updateAssetDisplayPageEntry(long assetDisplayPageEntryId, long layoutPageTemplateEntryId, int type) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("assetDisplayPageEntryId", assetDisplayPageEntryId);
			_params.put("layoutPageTemplateEntryId", layoutPageTemplateEntryId);
			_params.put("type", type);

			_command.put("/asset.assetdisplaypageentry/update-asset-display-page-entry", _params);
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