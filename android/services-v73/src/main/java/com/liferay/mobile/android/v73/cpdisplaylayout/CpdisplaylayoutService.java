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

package com.liferay.mobile.android.v73.cpdisplaylayout;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CpdisplaylayoutService extends BaseService {

	public CpdisplaylayoutService(Session session) {
		super(session);
	}

	public JSONObject addCpDisplayLayout(long userId, long groupId, String clazz, long classPK, String layoutUuid) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classPK", classPK);
			_params.put("clazz", checkNull(clazz));
			_params.put("groupId", groupId);
			_params.put("layoutUuid", checkNull(layoutUuid));
			_params.put("userId", userId);

			_command.put("/commerce.cpdisplaylayout/add-cp-display-layout", _params);
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

	public JSONObject addCpDisplayLayout(String clazz, long classPK, String layoutUuid, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classPK", classPK);
			_params.put("clazz", checkNull(clazz));
			_params.put("layoutUuid", checkNull(layoutUuid));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdisplaylayout/add-cp-display-layout", _params);
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

	public void deleteCpDisplayLayout(long cpDisplayLayoutId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDisplayLayoutId", cpDisplayLayoutId);

			_command.put("/commerce.cpdisplaylayout/delete-cp-display-layout", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void deleteCpDisplayLayout(String clazz, long classPK) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classPK", classPK);
			_params.put("clazz", checkNull(clazz));

			_command.put("/commerce.cpdisplaylayout/delete-cp-display-layout", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchCpDisplayLayout(long cpDisplayLayoutId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDisplayLayoutId", cpDisplayLayoutId);

			_command.put("/commerce.cpdisplaylayout/fetch-cp-display-layout", _params);
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

	public JSONObject searchCpDisplayLayout(long companyId, long groupId, String className, String keywords, int start, int end, JSONObjectWrapper sort) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", checkNull(className));
			_params.put("companyId", companyId);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("keywords", checkNull(keywords));
			_params.put("start", start);
			mangleWrapper(_params, "sort", "com.liferay.portal.kernel.search.Sort", sort);

			_command.put("/commerce.cpdisplaylayout/search-cp-display-layout", _params);
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

	public JSONObject updateCpDisplayLayout(long cpDisplayLayoutId, String layoutUuid) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cpDisplayLayoutId", cpDisplayLayoutId);
			_params.put("layoutUuid", checkNull(layoutUuid));

			_command.put("/commerce.cpdisplaylayout/update-cp-display-layout", _params);
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