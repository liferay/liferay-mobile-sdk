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

package com.liferay.mobile.android.v72.segmentsexperience;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class SegmentsexperienceService extends BaseService {

	public SegmentsexperienceService(Session session) {
		super(session);
	}

	public JSONObject addSegmentsExperience(long segmentsEntryId, long classNameId, long classPK, JSONObject nameMap, boolean active, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("nameMap", checkNull(nameMap));
			_params.put("segmentsEntryId", segmentsEntryId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/segments.segmentsexperience/add-segments-experience", _params);
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

	public JSONObject deleteSegmentsExperience(long segmentsExperienceId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("segmentsExperienceId", segmentsExperienceId);

			_command.put("/segments.segmentsexperience/delete-segments-experience", _params);
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

	public JSONObject getSegmentsExperience(long segmentsExperienceId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("segmentsExperienceId", segmentsExperienceId);

			_command.put("/segments.segmentsexperience/get-segments-experience", _params);
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

	public JSONArray getSegmentsExperiences(long groupId, long classNameId, long classPK, boolean active) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("groupId", groupId);

			_command.put("/segments.segmentsexperience/get-segments-experiences", _params);
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

	public JSONArray getSegmentsExperiences(long groupId, long classNameId, long classPK, boolean active, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.segments.model.SegmentsExperience>", orderByComparator);

			_command.put("/segments.segmentsexperience/get-segments-experiences", _params);
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

	public Integer getSegmentsExperiencesCount(long groupId, long classNameId, long classPK, boolean active) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("groupId", groupId);

			_command.put("/segments.segmentsexperience/get-segments-experiences-count", _params);
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

	public JSONObject updateSegmentsExperience(long segmentsExperienceId, long segmentsEntryId, JSONObject nameMap, boolean active) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("active", active);
			_params.put("nameMap", checkNull(nameMap));
			_params.put("segmentsEntryId", segmentsEntryId);
			_params.put("segmentsExperienceId", segmentsExperienceId);

			_command.put("/segments.segmentsexperience/update-segments-experience", _params);
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

	public void updateSegmentsExperiencePriority(long segmentsExperienceId, int newPriority) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("newPriority", newPriority);
			_params.put("segmentsExperienceId", segmentsExperienceId);

			_command.put("/segments.segmentsexperience/update-segments-experience-priority", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

}