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

package com.liferay.mobile.android.v72.fragmententry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class FragmententryService extends BaseService {

	public FragmententryService(Session session) {
		super(session);
	}

	public JSONObject addFragmentEntry(long groupId, long fragmentCollectionId, String name, int type, int status, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("status", status);
			_params.put("type", type);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/fragment.fragmententry/add-fragment-entry", _params);
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

	public JSONObject addFragmentEntry(long groupId, long fragmentCollectionId, String name, int status, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("status", status);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/fragment.fragmententry/add-fragment-entry", _params);
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

	public JSONObject addFragmentEntry(long groupId, long fragmentCollectionId, String fragmentEntryKey, String name, int type, int status, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("fragmentEntryKey", checkNull(fragmentEntryKey));
			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("status", status);
			_params.put("type", type);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/fragment.fragmententry/add-fragment-entry", _params);
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

	public JSONObject addFragmentEntry(long groupId, long fragmentCollectionId, String fragmentEntryKey, String name, int status, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("fragmentEntryKey", checkNull(fragmentEntryKey));
			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("status", status);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/fragment.fragmententry/add-fragment-entry", _params);
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

	public JSONObject addFragmentEntry(long groupId, long fragmentCollectionId, String name, String css, String html, String js, int type, int status, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("css", checkNull(css));
			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("groupId", groupId);
			_params.put("html", checkNull(html));
			_params.put("js", checkNull(js));
			_params.put("name", checkNull(name));
			_params.put("status", status);
			_params.put("type", type);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/fragment.fragmententry/add-fragment-entry", _params);
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

	public JSONObject addFragmentEntry(long groupId, long fragmentCollectionId, String name, String css, String html, String js, int status, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("css", checkNull(css));
			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("groupId", groupId);
			_params.put("html", checkNull(html));
			_params.put("js", checkNull(js));
			_params.put("name", checkNull(name));
			_params.put("status", status);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/fragment.fragmententry/add-fragment-entry", _params);
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

	public JSONObject addFragmentEntry(long groupId, long fragmentCollectionId, String fragmentEntryKey, String name, String css, String html, String js, int type, int status, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("css", checkNull(css));
			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("fragmentEntryKey", checkNull(fragmentEntryKey));
			_params.put("groupId", groupId);
			_params.put("html", checkNull(html));
			_params.put("js", checkNull(js));
			_params.put("name", checkNull(name));
			_params.put("status", status);
			_params.put("type", type);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/fragment.fragmententry/add-fragment-entry", _params);
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

	public JSONObject addFragmentEntry(long groupId, long fragmentCollectionId, String fragmentEntryKey, String name, String css, String html, String js, int status, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("css", checkNull(css));
			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("fragmentEntryKey", checkNull(fragmentEntryKey));
			_params.put("groupId", groupId);
			_params.put("html", checkNull(html));
			_params.put("js", checkNull(js));
			_params.put("name", checkNull(name));
			_params.put("status", status);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/fragment.fragmententry/add-fragment-entry", _params);
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

	public JSONObject copyFragmentEntry(long groupId, long fragmentEntryId, long fragmentCollectionId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("fragmentEntryId", fragmentEntryId);
			_params.put("groupId", groupId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/fragment.fragmententry/copy-fragment-entry", _params);
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

	public void deleteFragmentEntries(JSONArray fragmentEntriesIds) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentEntriesIds", checkNull(fragmentEntriesIds));

			_command.put("/fragment.fragmententry/delete-fragment-entries", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject deleteFragmentEntry(long fragmentEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentEntryId", fragmentEntryId);

			_command.put("/fragment.fragmententry/delete-fragment-entry", _params);
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

	public JSONObject fetchFragmentEntry(long fragmentEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentEntryId", fragmentEntryId);

			_command.put("/fragment.fragmententry/fetch-fragment-entry", _params);
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

	public Integer getFragmentCollectionsCount(long groupId, long fragmentCollectionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("groupId", groupId);

			_command.put("/fragment.fragmententry/get-fragment-collections-count", _params);
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

	public Integer getFragmentCollectionsCount(long groupId, long fragmentCollectionId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("groupId", groupId);
			_params.put("status", status);

			_command.put("/fragment.fragmententry/get-fragment-collections-count", _params);
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

	public Integer getFragmentCollectionsCount(long groupId, long fragmentCollectionId, String name) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));

			_command.put("/fragment.fragmententry/get-fragment-collections-count", _params);
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

	public Integer getFragmentCollectionsCount(long groupId, long fragmentCollectionId, String name, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("status", status);

			_command.put("/fragment.fragmententry/get-fragment-collections-count", _params);
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

	public Integer getFragmentCollectionsCountByType(long groupId, long fragmentCollectionId, int type) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("groupId", groupId);
			_params.put("type", type);

			_command.put("/fragment.fragmententry/get-fragment-collections-count-by-type", _params);
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

	public JSONArray getFragmentEntries(long fragmentCollectionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentCollectionId", fragmentCollectionId);

			_command.put("/fragment.fragmententry/get-fragment-entries", _params);
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

	public JSONArray getFragmentEntries(long groupId, long fragmentCollectionId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("groupId", groupId);
			_params.put("status", status);

			_command.put("/fragment.fragmententry/get-fragment-entries", _params);
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

	public JSONArray getFragmentEntries(long groupId, long fragmentCollectionId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("groupId", groupId);
			_params.put("start", start);

			_command.put("/fragment.fragmententry/get-fragment-entries", _params);
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

	public JSONArray getFragmentEntries(long groupId, long fragmentCollectionId, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.fragment.model.FragmentEntry>", orderByComparator);

			_command.put("/fragment.fragmententry/get-fragment-entries", _params);
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

	public JSONArray getFragmentEntries(long groupId, long fragmentCollectionId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("groupId", groupId);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.fragment.model.FragmentEntry>", orderByComparator);

			_command.put("/fragment.fragmententry/get-fragment-entries", _params);
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

	public JSONArray getFragmentEntries(long groupId, long fragmentCollectionId, String name, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.fragment.model.FragmentEntry>", orderByComparator);

			_command.put("/fragment.fragmententry/get-fragment-entries", _params);
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

	public JSONArray getFragmentEntries(long groupId, long fragmentCollectionId, String name, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.fragment.model.FragmentEntry>", orderByComparator);

			_command.put("/fragment.fragmententry/get-fragment-entries", _params);
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

	public JSONArray getFragmentEntriesByType(long groupId, long fragmentCollectionId, int type, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("groupId", groupId);
			_params.put("status", status);
			_params.put("type", type);

			_command.put("/fragment.fragmententry/get-fragment-entries-by-type", _params);
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

	public JSONArray getFragmentEntriesByType(long groupId, long fragmentCollectionId, int type, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("type", type);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.fragment.model.FragmentEntry>", orderByComparator);

			_command.put("/fragment.fragmententry/get-fragment-entries-by-type", _params);
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

	public JSONArray getTempFileNames(long groupId, String folderName) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderName", checkNull(folderName));
			_params.put("groupId", groupId);

			_command.put("/fragment.fragmententry/get-temp-file-names", _params);
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

	public JSONObject moveFragmentEntry(long fragmentEntryId, long fragmentCollectionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("fragmentEntryId", fragmentEntryId);

			_command.put("/fragment.fragmententry/move-fragment-entry", _params);
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

	public JSONObject updateFragmentEntry(long fragmentEntryId, long previewFileEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentEntryId", fragmentEntryId);
			_params.put("previewFileEntryId", previewFileEntryId);

			_command.put("/fragment.fragmententry/update-fragment-entry", _params);
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

	public JSONObject updateFragmentEntry(long fragmentEntryId, String name) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentEntryId", fragmentEntryId);
			_params.put("name", checkNull(name));

			_command.put("/fragment.fragmententry/update-fragment-entry", _params);
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

	public JSONObject updateFragmentEntry(long fragmentEntryId, String name, String css, String html, String js, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("css", checkNull(css));
			_params.put("fragmentEntryId", fragmentEntryId);
			_params.put("html", checkNull(html));
			_params.put("js", checkNull(js));
			_params.put("name", checkNull(name));
			_params.put("status", status);

			_command.put("/fragment.fragmententry/update-fragment-entry", _params);
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

	public JSONObject updateFragmentEntry(long fragmentEntryId, String name, String css, String html, String js, long previewFileEntryId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("css", checkNull(css));
			_params.put("fragmentEntryId", fragmentEntryId);
			_params.put("html", checkNull(html));
			_params.put("js", checkNull(js));
			_params.put("name", checkNull(name));
			_params.put("previewFileEntryId", previewFileEntryId);
			_params.put("status", status);

			_command.put("/fragment.fragmententry/update-fragment-entry", _params);
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