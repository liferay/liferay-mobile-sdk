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

package com.liferay.mobile.android.v73.fragmentcomposition;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class FragmentcompositionService extends BaseService {

	public FragmentcompositionService(Session session) {
		super(session);
	}

	public JSONObject addFragmentComposition(long groupId, long fragmentCollectionId, String fragmentCompositionKey, String name, String description, String data, long previewFileEntryId, int status, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("data", checkNull(data));
			_params.put("description", checkNull(description));
			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("fragmentCompositionKey", checkNull(fragmentCompositionKey));
			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("previewFileEntryId", previewFileEntryId);
			_params.put("status", status);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/fragment.fragmentcomposition/add-fragment-composition", _params);
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

	public JSONObject deleteFragmentComposition(long fragmentCompositionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentCompositionId", fragmentCompositionId);

			_command.put("/fragment.fragmentcomposition/delete-fragment-composition", _params);
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

	public JSONObject fetchFragmentComposition(long fragmentCompositionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentCompositionId", fragmentCompositionId);

			_command.put("/fragment.fragmentcomposition/fetch-fragment-composition", _params);
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

	public JSONObject fetchFragmentComposition(long groupId, String fragmentCompositionKey) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentCompositionKey", checkNull(fragmentCompositionKey));
			_params.put("groupId", groupId);

			_command.put("/fragment.fragmentcomposition/fetch-fragment-composition", _params);
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

	public JSONArray getFragmentCompositions(long fragmentCollectionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentCollectionId", fragmentCollectionId);

			_command.put("/fragment.fragmentcomposition/get-fragment-compositions", _params);
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

	public JSONArray getFragmentCompositions(long fragmentCollectionId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("start", start);

			_command.put("/fragment.fragmentcomposition/get-fragment-compositions", _params);
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

	public JSONArray getFragmentCompositions(long groupId, long fragmentCollectionId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("groupId", groupId);
			_params.put("status", status);

			_command.put("/fragment.fragmentcomposition/get-fragment-compositions", _params);
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

	public JSONArray getFragmentCompositions(long groupId, long fragmentCollectionId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("groupId", groupId);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.fragment.model.FragmentComposition>", orderByComparator);

			_command.put("/fragment.fragmentcomposition/get-fragment-compositions", _params);
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

	public JSONArray getFragmentCompositions(long groupId, long fragmentCollectionId, String name, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.fragment.model.FragmentComposition>", orderByComparator);

			_command.put("/fragment.fragmentcomposition/get-fragment-compositions", _params);
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

	public Integer getFragmentCompositionsCount(long fragmentCollectionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentCollectionId", fragmentCollectionId);

			_command.put("/fragment.fragmentcomposition/get-fragment-compositions-count", _params);
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

	public JSONObject moveFragmentComposition(long fragmentCompositionId, long fragmentCollectionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("fragmentCompositionId", fragmentCompositionId);

			_command.put("/fragment.fragmentcomposition/move-fragment-composition", _params);
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

	public JSONObject updateFragmentComposition(long fragmentCompositionId, long previewFileEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentCompositionId", fragmentCompositionId);
			_params.put("previewFileEntryId", previewFileEntryId);

			_command.put("/fragment.fragmentcomposition/update-fragment-composition", _params);
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

	public JSONObject updateFragmentComposition(long fragmentCompositionId, long fragmentCollectionId, String name, String description, String data, long previewFileEntryId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("data", checkNull(data));
			_params.put("description", checkNull(description));
			_params.put("fragmentCollectionId", fragmentCollectionId);
			_params.put("fragmentCompositionId", fragmentCompositionId);
			_params.put("name", checkNull(name));
			_params.put("previewFileEntryId", previewFileEntryId);
			_params.put("status", status);

			_command.put("/fragment.fragmentcomposition/update-fragment-composition", _params);
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

	public JSONObject updateFragmentComposition(long fragmentCompositionId, String name) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fragmentCompositionId", fragmentCompositionId);
			_params.put("name", checkNull(name));

			_command.put("/fragment.fragmentcomposition/update-fragment-composition", _params);
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

	public JSONObject updateFragmentComposition(long fragmentCompositionId, String name, String description, String data, long previewFileEntryId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("data", checkNull(data));
			_params.put("description", checkNull(description));
			_params.put("fragmentCompositionId", fragmentCompositionId);
			_params.put("name", checkNull(name));
			_params.put("previewFileEntryId", previewFileEntryId);
			_params.put("status", status);

			_command.put("/fragment.fragmentcomposition/update-fragment-composition", _params);
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