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

package com.liferay.mobile.android.v73.ctcollection;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CtcollectionService extends BaseService {

	public CtcollectionService(Session session) {
		super(session);
	}

	public JSONObject addCtCollection(long companyId, long userId, String name, String description) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("description", checkNull(description));
			_params.put("name", checkNull(name));
			_params.put("userId", userId);

			_command.put("/ct.ctcollection/add-ct-collection", _params);
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

	public void deleteCtAutoResolutionInfo(long ctAutoResolutionInfoId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ctAutoResolutionInfoId", ctAutoResolutionInfoId);

			_command.put("/ct.ctcollection/delete-ct-auto-resolution-info", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject deleteCtCollection(JSONObjectWrapper ctCollection) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			mangleWrapper(_params, "ctCollection", "com.liferay.change.tracking.model.CTCollection", ctCollection);

			_command.put("/ct.ctcollection/delete-ct-collection", _params);
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

	public void discardCtEntries(long ctCollectionId, long modelClassNameId, long modelClassPK) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ctCollectionId", ctCollectionId);
			_params.put("modelClassNameId", modelClassNameId);
			_params.put("modelClassPK", modelClassPK);

			_command.put("/ct.ctcollection/discard-ct-entries", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void discardCtEntry(long ctCollectionId, long modelClassNameId, long modelClassPK) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ctCollectionId", ctCollectionId);
			_params.put("modelClassNameId", modelClassNameId);
			_params.put("modelClassPK", modelClassPK);

			_command.put("/ct.ctcollection/discard-ct-entry", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONArray getCtCollections(long companyId, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.change.tracking.model.CTCollection>", orderByComparator);

			_command.put("/ct.ctcollection/get-ct-collections", _params);
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

	public JSONArray getCtCollections(long companyId, int status, String keywords, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.change.tracking.model.CTCollection>", orderByComparator);

			_command.put("/ct.ctcollection/get-ct-collections", _params);
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

	public Integer getCtCollectionsCount(long companyId, int status, String keywords) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("keywords", checkNull(keywords));
			_params.put("status", status);

			_command.put("/ct.ctcollection/get-ct-collections-count", _params);
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

	public void publishCtCollection(long userId, long ctCollectionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ctCollectionId", ctCollectionId);
			_params.put("userId", userId);

			_command.put("/ct.ctcollection/publish-ct-collection", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject undoCtCollection(long ctCollectionId, long userId, String name, String description) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ctCollectionId", ctCollectionId);
			_params.put("description", checkNull(description));
			_params.put("name", checkNull(name));
			_params.put("userId", userId);

			_command.put("/ct.ctcollection/undo-ct-collection", _params);
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

	public JSONObject updateCtCollection(long userId, long ctCollectionId, String name, String description) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ctCollectionId", ctCollectionId);
			_params.put("description", checkNull(description));
			_params.put("name", checkNull(name));
			_params.put("userId", userId);

			_command.put("/ct.ctcollection/update-ct-collection", _params);
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