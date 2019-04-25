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

package com.liferay.mobile.android.v72.layoutpagetemplateentry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class LayoutpagetemplateentryService extends BaseService {

	public LayoutpagetemplateentryService(Session session) {
		super(session);
	}

	public JSONObject addLayoutPageTemplateEntry(long groupId, long layoutPageTemplateCollectionId, String name, int type, int status, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_params.put("name", checkNull(name));
			_params.put("status", status);
			_params.put("type", type);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/layout.layoutpagetemplateentry/add-layout-page-template-entry", _params);
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

	public JSONObject addLayoutPageTemplateEntry(long groupId, long layoutPageTemplateCollectionId, String name, int type, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_params.put("name", checkNull(name));
			_params.put("type", type);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/layout.layoutpagetemplateentry/add-layout-page-template-entry", _params);
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

	public JSONObject addLayoutPageTemplateEntry(long groupId, long layoutPageTemplateCollectionId, String name, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_params.put("name", checkNull(name));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/layout.layoutpagetemplateentry/add-layout-page-template-entry", _params);
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

	public void deleteLayoutPageTemplateEntries(JSONArray layoutPageTemplateEntryIds) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("layoutPageTemplateEntryIds", checkNull(layoutPageTemplateEntryIds));

			_command.put("/layout.layoutpagetemplateentry/delete-layout-page-template-entries", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject deleteLayoutPageTemplateEntry(long layoutPageTemplateEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("layoutPageTemplateEntryId", layoutPageTemplateEntryId);

			_command.put("/layout.layoutpagetemplateentry/delete-layout-page-template-entry", _params);
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

	public JSONObject fetchDefaultLayoutPageTemplateEntry(long groupId, long classNameId, long classTypeId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classTypeId", classTypeId);
			_params.put("groupId", groupId);

			_command.put("/layout.layoutpagetemplateentry/fetch-default-layout-page-template-entry", _params);
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

	public JSONObject fetchLayoutPageTemplateEntry(long layoutPageTemplateEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("layoutPageTemplateEntryId", layoutPageTemplateEntryId);

			_command.put("/layout.layoutpagetemplateentry/fetch-layout-page-template-entry", _params);
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

	public JSONObject fetchLayoutPageTemplateEntry(long groupId, String name) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));

			_command.put("/layout.layoutpagetemplateentry/fetch-layout-page-template-entry", _params);
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

	public JSONObject fetchLayoutPageTemplateEntryByUuidAndGroupId(String uuid, long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("uuid", checkNull(uuid));

			_command.put("/layout.layoutpagetemplateentry/fetch-layout-page-template-entry-by-uuid-and-group-id", _params);
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

	public Integer getLayoutPageTemplateCollectionsCount(long groupId, long layoutPageTemplateCollectionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-collections-count", _params);
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

	public Integer getLayoutPageTemplateCollectionsCount(long groupId, long layoutPageTemplateCollectionId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_params.put("status", status);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-collections-count", _params);
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

	public Integer getLayoutPageTemplateCollectionsCount(long groupId, long layoutPageTemplateCollectionId, String name) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_params.put("name", checkNull(name));

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-collections-count", _params);
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

	public Integer getLayoutPageTemplateCollectionsCount(long groupId, long layoutPageTemplateCollectionId, String name, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_params.put("name", checkNull(name));
			_params.put("status", status);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-collections-count", _params);
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

	public JSONArray getLayoutPageTemplateEntries(long groupId, int type, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("status", status);
			_params.put("type", type);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>", orderByComparator);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries", _params);
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

	public JSONArray getLayoutPageTemplateEntries(long groupId, int type, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("type", type);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>", orderByComparator);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries", _params);
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

	public JSONArray getLayoutPageTemplateEntries(long groupId, long classNameId, int type, boolean defaultTemplate) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("defaultTemplate", defaultTemplate);
			_params.put("groupId", groupId);
			_params.put("type", type);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries", _params);
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

	public JSONArray getLayoutPageTemplateEntries(long groupId, long layoutPageTemplateCollectionId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_params.put("start", start);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries", _params);
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

	public JSONArray getLayoutPageTemplateEntries(long groupId, long layoutPageTemplateCollectionId, int status, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_params.put("start", start);
			_params.put("status", status);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries", _params);
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

	public JSONArray getLayoutPageTemplateEntries(long groupId, long layoutPageTemplateCollectionId, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>", orderByComparator);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries", _params);
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

	public JSONArray getLayoutPageTemplateEntries(long groupId, long layoutPageTemplateCollectionId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>", orderByComparator);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries", _params);
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

	public JSONArray getLayoutPageTemplateEntries(long groupId, long classNameId, long classTypeId, int type) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classTypeId", classTypeId);
			_params.put("groupId", groupId);
			_params.put("type", type);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries", _params);
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

	public JSONArray getLayoutPageTemplateEntries(long groupId, long classNameId, long classTypeId, int type, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classTypeId", classTypeId);
			_params.put("groupId", groupId);
			_params.put("status", status);
			_params.put("type", type);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries", _params);
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

	public JSONArray getLayoutPageTemplateEntries(long groupId, long classNameId, long classTypeId, int type, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classTypeId", classTypeId);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("status", status);
			_params.put("type", type);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>", orderByComparator);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries", _params);
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

	public JSONArray getLayoutPageTemplateEntries(long groupId, long classNameId, long classTypeId, int type, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classTypeId", classTypeId);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("type", type);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>", orderByComparator);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries", _params);
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

	public JSONArray getLayoutPageTemplateEntries(long groupId, long classNameId, long classTypeId, String name, int type, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classTypeId", classTypeId);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("start", start);
			_params.put("status", status);
			_params.put("type", type);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>", orderByComparator);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries", _params);
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

	public JSONArray getLayoutPageTemplateEntries(long groupId, long classNameId, long classTypeId, String name, int type, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classTypeId", classTypeId);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("start", start);
			_params.put("type", type);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>", orderByComparator);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries", _params);
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

	public JSONArray getLayoutPageTemplateEntries(long groupId, long layoutPageTemplateCollectionId, String name, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_params.put("name", checkNull(name));
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>", orderByComparator);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries", _params);
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

	public JSONArray getLayoutPageTemplateEntries(long groupId, long layoutPageTemplateCollectionId, String name, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_params.put("name", checkNull(name));
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>", orderByComparator);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries", _params);
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

	public JSONArray getLayoutPageTemplateEntries(long groupId, String name, int type, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("start", start);
			_params.put("status", status);
			_params.put("type", type);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>", orderByComparator);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries", _params);
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

	public JSONArray getLayoutPageTemplateEntries(long groupId, String name, int type, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("start", start);
			_params.put("type", type);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>", orderByComparator);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries", _params);
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

	public JSONArray getLayoutPageTemplateEntriesByType(long groupId, long layoutPageTemplateCollectionId, int type, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_params.put("start", start);
			_params.put("type", type);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.layout.page.template.model.LayoutPageTemplateEntry>", orderByComparator);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries-by-type", _params);
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

	public Integer getLayoutPageTemplateEntriesCount(long groupId, int type) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("type", type);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries-count", _params);
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

	public Integer getLayoutPageTemplateEntriesCount(long groupId, int type, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("status", status);
			_params.put("type", type);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries-count", _params);
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

	public Integer getLayoutPageTemplateEntriesCount(long groupId, long layoutPageTemplateFolderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("layoutPageTemplateFolderId", layoutPageTemplateFolderId);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries-count", _params);
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

	public Integer getLayoutPageTemplateEntriesCount(long groupId, long layoutPageTemplateFolderId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("layoutPageTemplateFolderId", layoutPageTemplateFolderId);
			_params.put("status", status);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries-count", _params);
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

	public Integer getLayoutPageTemplateEntriesCount(long groupId, long classNameId, long classTypeId, int type) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classTypeId", classTypeId);
			_params.put("groupId", groupId);
			_params.put("type", type);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries-count", _params);
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

	public Integer getLayoutPageTemplateEntriesCount(long groupId, long classNameId, long classTypeId, int type, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classTypeId", classTypeId);
			_params.put("groupId", groupId);
			_params.put("status", status);
			_params.put("type", type);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries-count", _params);
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

	public Integer getLayoutPageTemplateEntriesCount(long groupId, long classNameId, long classTypeId, String name, int type) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classTypeId", classTypeId);
			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("type", type);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries-count", _params);
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

	public Integer getLayoutPageTemplateEntriesCount(long groupId, long classNameId, long classTypeId, String name, int type, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classTypeId", classTypeId);
			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("status", status);
			_params.put("type", type);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries-count", _params);
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

	public Integer getLayoutPageTemplateEntriesCount(long groupId, long layoutPageTemplateFolderId, String name) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("layoutPageTemplateFolderId", layoutPageTemplateFolderId);
			_params.put("name", checkNull(name));

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries-count", _params);
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

	public Integer getLayoutPageTemplateEntriesCount(long groupId, long layoutPageTemplateFolderId, String name, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("layoutPageTemplateFolderId", layoutPageTemplateFolderId);
			_params.put("name", checkNull(name));
			_params.put("status", status);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries-count", _params);
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

	public Integer getLayoutPageTemplateEntriesCount(long groupId, String name, int type) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("type", type);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries-count", _params);
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

	public Integer getLayoutPageTemplateEntriesCount(long groupId, String name, int type, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("status", status);
			_params.put("type", type);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries-count", _params);
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

	public Integer getLayoutPageTemplateEntriesCountByType(long groupId, long layoutPageTemplateCollectionId, int type) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("layoutPageTemplateCollectionId", layoutPageTemplateCollectionId);
			_params.put("type", type);

			_command.put("/layout.layoutpagetemplateentry/get-layout-page-template-entries-count-by-type", _params);
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

	public JSONObject updateLayoutPageTemplateEntry(long layoutPageTemplateEntryId, boolean defaultTemplate) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("defaultTemplate", defaultTemplate);
			_params.put("layoutPageTemplateEntryId", layoutPageTemplateEntryId);

			_command.put("/layout.layoutpagetemplateentry/update-layout-page-template-entry", _params);
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

	public JSONObject updateLayoutPageTemplateEntry(long layoutPageTemplateEntryId, JSONArray fragmentEntryIds, String editableValues, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("editableValues", checkNull(editableValues));
			_params.put("fragmentEntryIds", checkNull(fragmentEntryIds));
			_params.put("layoutPageTemplateEntryId", layoutPageTemplateEntryId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/layout.layoutpagetemplateentry/update-layout-page-template-entry", _params);
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

	public JSONObject updateLayoutPageTemplateEntry(long layoutPageTemplateEntryId, long previewFileEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("layoutPageTemplateEntryId", layoutPageTemplateEntryId);
			_params.put("previewFileEntryId", previewFileEntryId);

			_command.put("/layout.layoutpagetemplateentry/update-layout-page-template-entry", _params);
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

	public JSONObject updateLayoutPageTemplateEntry(long layoutPageTemplateEntryId, long classNameId, long classTypeId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classTypeId", classTypeId);
			_params.put("layoutPageTemplateEntryId", layoutPageTemplateEntryId);

			_command.put("/layout.layoutpagetemplateentry/update-layout-page-template-entry", _params);
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

	public JSONObject updateLayoutPageTemplateEntry(long layoutPageTemplateEntryId, String name) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("layoutPageTemplateEntryId", layoutPageTemplateEntryId);
			_params.put("name", checkNull(name));

			_command.put("/layout.layoutpagetemplateentry/update-layout-page-template-entry", _params);
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

	public JSONObject updateLayoutPageTemplateEntry(long layoutPageTemplateEntryId, String name, JSONArray fragmentEntryIds, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentEntryIds", checkNull(fragmentEntryIds));
			_params.put("layoutPageTemplateEntryId", layoutPageTemplateEntryId);
			_params.put("name", checkNull(name));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/layout.layoutpagetemplateentry/update-layout-page-template-entry", _params);
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

	public JSONObject updateStatus(long layoutPageTemplateEntryId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("layoutPageTemplateEntryId", layoutPageTemplateEntryId);
			_params.put("status", status);

			_command.put("/layout.layoutpagetemplateentry/update-status", _params);
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