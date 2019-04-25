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

package com.liferay.mobile.android.v72.assetlistentry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class AssetlistentryService extends BaseService {

	public AssetlistentryService(Session session) {
		super(session);
	}

	public void addAssetEntrySelection(long assetListEntryId, long assetEntryId, long segmentsEntryId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("assetEntryId", assetEntryId);
			_params.put("assetListEntryId", assetListEntryId);
			_params.put("segmentsEntryId", segmentsEntryId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/assetlist.assetlistentry/add-asset-entry-selection", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void addAssetEntrySelections(long assetListEntryId, JSONArray assetEntryIds, long segmentsEntryId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("assetEntryIds", checkNull(assetEntryIds));
			_params.put("assetListEntryId", assetListEntryId);
			_params.put("segmentsEntryId", segmentsEntryId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/assetlist.assetlistentry/add-asset-entry-selections", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject addAssetListEntry(long groupId, String title, int type, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("title", checkNull(title));
			_params.put("type", type);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/assetlist.assetlistentry/add-asset-list-entry", _params);
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

	public JSONObject addDynamicAssetListEntry(long userId, long groupId, String title, String typeSettings, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("title", checkNull(title));
			_params.put("typeSettings", checkNull(typeSettings));
			_params.put("userId", userId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/assetlist.assetlistentry/add-dynamic-asset-list-entry", _params);
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

	public JSONObject addManualAssetListEntry(long userId, long groupId, String title, JSONArray assetEntryIds, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("assetEntryIds", checkNull(assetEntryIds));
			_params.put("groupId", groupId);
			_params.put("title", checkNull(title));
			_params.put("userId", userId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/assetlist.assetlistentry/add-manual-asset-list-entry", _params);
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

	public void deleteAssetEntrySelection(long assetListEntryId, long segmentsEntryId, int position) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("assetListEntryId", assetListEntryId);
			_params.put("position", position);
			_params.put("segmentsEntryId", segmentsEntryId);

			_command.put("/assetlist.assetlistentry/delete-asset-entry-selection", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void deleteAssetListEntries(JSONArray assetListEntriesIds) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("assetListEntriesIds", checkNull(assetListEntriesIds));

			_command.put("/assetlist.assetlistentry/delete-asset-list-entries", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject deleteAssetListEntry(long assetListEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("assetListEntryId", assetListEntryId);

			_command.put("/assetlist.assetlistentry/delete-asset-list-entry", _params);
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

	public void deleteAssetListEntry(long assetListEntryId, long segmentsEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("assetListEntryId", assetListEntryId);
			_params.put("segmentsEntryId", segmentsEntryId);

			_command.put("/assetlist.assetlistentry/delete-asset-list-entry", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchAssetListEntry(long assetListEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("assetListEntryId", assetListEntryId);

			_command.put("/assetlist.assetlistentry/fetch-asset-list-entry", _params);
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

	public JSONArray getAssetListEntries(long groupId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.asset.list.model.AssetListEntry>", orderByComparator);

			_command.put("/assetlist.assetlistentry/get-asset-list-entries", _params);
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

	public JSONArray getAssetListEntries(long groupId, String title, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("title", checkNull(title));
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.asset.list.model.AssetListEntry>", orderByComparator);

			_command.put("/assetlist.assetlistentry/get-asset-list-entries", _params);
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

	public Integer getAssetListEntriesCount(long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);

			_command.put("/assetlist.assetlistentry/get-asset-list-entries-count", _params);
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

	public Integer getAssetListEntriesCount(long groupId, String title) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("title", checkNull(title));

			_command.put("/assetlist.assetlistentry/get-asset-list-entries-count", _params);
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

	public JSONObject getAssetListEntry(long assetListEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("assetListEntryId", assetListEntryId);

			_command.put("/assetlist.assetlistentry/get-asset-list-entry", _params);
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

	public JSONObject getAssetListEntry(long groupId, String assetListEntryKey) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("assetListEntryKey", checkNull(assetListEntryKey));
			_params.put("groupId", groupId);

			_command.put("/assetlist.assetlistentry/get-asset-list-entry", _params);
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

	public JSONObject getAssetListEntryByUuidAndGroupId(String uuid, long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("uuid", checkNull(uuid));

			_command.put("/assetlist.assetlistentry/get-asset-list-entry-by-uuid-and-group-id", _params);
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

	public void moveAssetEntrySelection(long assetListEntryId, long segmentsEntryId, int position, int newPosition) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("assetListEntryId", assetListEntryId);
			_params.put("newPosition", newPosition);
			_params.put("position", position);
			_params.put("segmentsEntryId", segmentsEntryId);

			_command.put("/assetlist.assetlistentry/move-asset-entry-selection", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void updateAssetListEntry(long assetListEntryId, long segmentsEntryId, String typeSettings, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("assetListEntryId", assetListEntryId);
			_params.put("segmentsEntryId", segmentsEntryId);
			_params.put("typeSettings", checkNull(typeSettings));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/assetlist.assetlistentry/update-asset-list-entry", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject updateAssetListEntry(long assetListEntryId, String title) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("assetListEntryId", assetListEntryId);
			_params.put("title", checkNull(title));

			_command.put("/assetlist.assetlistentry/update-asset-list-entry", _params);
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

	public void updateAssetListEntryTypeSettings(long assetListEntryId, long segmentsEntryId, String typeSettings) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("assetListEntryId", assetListEntryId);
			_params.put("segmentsEntryId", segmentsEntryId);
			_params.put("typeSettings", checkNull(typeSettings));

			_command.put("/assetlist.assetlistentry/update-asset-list-entry-type-settings", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

}