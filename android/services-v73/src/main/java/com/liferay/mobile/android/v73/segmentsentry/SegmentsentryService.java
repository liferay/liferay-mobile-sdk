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

package com.liferay.mobile.android.v73.segmentsentry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class SegmentsentryService extends BaseService {

	public SegmentsentryService(Session session) {
		super(session);
	}

	public JSONObject addSegmentsEntry(String segmentsEntryKey, JSONObject nameMap, JSONObject descriptionMap, boolean active, String criteria, String type, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("criteria", checkNull(criteria));
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("nameMap", checkNull(nameMap));
			_params.put("segmentsEntryKey", checkNull(segmentsEntryKey));
			_params.put("type", checkNull(type));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/segments.segmentsentry/add-segments-entry", _params);
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

	public JSONObject addSegmentsEntry(String segmentsEntryKey, JSONObject nameMap, JSONObject descriptionMap, boolean active, String criteria, String source, String type, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("criteria", checkNull(criteria));
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("nameMap", checkNull(nameMap));
			_params.put("segmentsEntryKey", checkNull(segmentsEntryKey));
			_params.put("source", checkNull(source));
			_params.put("type", checkNull(type));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/segments.segmentsentry/add-segments-entry", _params);
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

	public void addSegmentsEntryClassPKs(long segmentsEntryId, JSONArray classPKs, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classPKs", checkNull(classPKs));
			_params.put("segmentsEntryId", segmentsEntryId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/segments.segmentsentry/add-segments-entry-class-p-ks", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject deleteSegmentsEntry(long segmentsEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("segmentsEntryId", segmentsEntryId);

			_command.put("/segments.segmentsentry/delete-segments-entry", _params);
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

	public void deleteSegmentsEntryClassPKs(long segmentsEntryId, JSONArray classPKs) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classPKs", checkNull(classPKs));
			_params.put("segmentsEntryId", segmentsEntryId);

			_command.put("/segments.segmentsentry/delete-segments-entry-class-p-ks", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONArray getSegmentsEntries(long groupId, boolean includeAncestorSegmentsEntries) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("includeAncestorSegmentsEntries", includeAncestorSegmentsEntries);

			_command.put("/segments.segmentsentry/get-segments-entries", _params);
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

	public JSONArray getSegmentsEntries(long groupId, boolean includeAncestorSegmentsEntries, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("includeAncestorSegmentsEntries", includeAncestorSegmentsEntries);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.segments.model.SegmentsEntry>", orderByComparator);

			_command.put("/segments.segmentsentry/get-segments-entries", _params);
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

	public Integer getSegmentsEntriesCount(long groupId, boolean includeAncestorSegmentsEntries) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("includeAncestorSegmentsEntries", includeAncestorSegmentsEntries);

			_command.put("/segments.segmentsentry/get-segments-entries-count", _params);
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

	public JSONObject getSegmentsEntry(long segmentsEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("segmentsEntryId", segmentsEntryId);

			_command.put("/segments.segmentsentry/get-segments-entry", _params);
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

	public JSONObject searchSegmentsEntries(long companyId, long groupId, String keywords, boolean includeAncestorSegmentsEntries, int start, int end, JSONObjectWrapper sort) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("includeAncestorSegmentsEntries", includeAncestorSegmentsEntries);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);
			mangleWrapper(_params, "sort", "com.liferay.portal.kernel.search.Sort", sort);

			_command.put("/segments.segmentsentry/search-segments-entries", _params);
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

	public JSONObject updateSegmentsEntry(long segmentsEntryId, String segmentsEntryKey, JSONObject nameMap, JSONObject descriptionMap, boolean active, String criteria, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("criteria", checkNull(criteria));
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("nameMap", checkNull(nameMap));
			_params.put("segmentsEntryId", segmentsEntryId);
			_params.put("segmentsEntryKey", checkNull(segmentsEntryKey));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/segments.segmentsentry/update-segments-entry", _params);
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