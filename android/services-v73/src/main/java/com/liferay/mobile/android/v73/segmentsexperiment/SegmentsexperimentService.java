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

package com.liferay.mobile.android.v73.segmentsexperiment;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class SegmentsexperimentService extends BaseService {

	public SegmentsexperimentService(Session session) {
		super(session);
	}

	public JSONObject addSegmentsExperiment(long segmentsExperienceId, long classNameId, long classPK, String name, String description, String goal, String goalTarget, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("description", checkNull(description));
			_params.put("goal", checkNull(goal));
			_params.put("goalTarget", checkNull(goalTarget));
			_params.put("name", checkNull(name));
			_params.put("segmentsExperienceId", segmentsExperienceId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/segments.segmentsexperiment/add-segments-experiment", _params);
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

	public JSONObject deleteSegmentsExperiment(long segmentsExperimentId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("segmentsExperimentId", segmentsExperimentId);

			_command.put("/segments.segmentsexperiment/delete-segments-experiment", _params);
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

	public JSONObject deleteSegmentsExperiment(String segmentsExperimentKey) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("segmentsExperimentKey", checkNull(segmentsExperimentKey));

			_command.put("/segments.segmentsexperiment/delete-segments-experiment", _params);
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

	public JSONObject fetchSegmentsExperiment(long segmentsExperienceId, long classNameId, long classPK, JSONArray statuses) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("segmentsExperienceId", segmentsExperienceId);
			_params.put("statuses", checkNull(statuses));

			_command.put("/segments.segmentsexperiment/fetch-segments-experiment", _params);
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

	public JSONObject fetchSegmentsExperiment(long groupId, String segmentsExperimentKey) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("segmentsExperimentKey", checkNull(segmentsExperimentKey));

			_command.put("/segments.segmentsexperiment/fetch-segments-experiment", _params);
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

	public JSONArray getSegmentsExperienceSegmentsExperiments(JSONArray segmentsExperienceIds, long classNameId, long classPK, JSONArray statuses, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("end", end);
			_params.put("segmentsExperienceIds", checkNull(segmentsExperienceIds));
			_params.put("start", start);
			_params.put("statuses", checkNull(statuses));

			_command.put("/segments.segmentsexperiment/get-segments-experience-segments-experiments", _params);
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

	public JSONObject getSegmentsExperiment(long segmentsExperimentId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("segmentsExperimentId", segmentsExperimentId);

			_command.put("/segments.segmentsexperiment/get-segments-experiment", _params);
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

	public JSONObject getSegmentsExperiment(String segmentsExperimentKey) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("segmentsExperimentKey", checkNull(segmentsExperimentKey));

			_command.put("/segments.segmentsexperiment/get-segments-experiment", _params);
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

	public JSONArray getSegmentsExperiments(long groupId, long classNameId, long classPK) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("groupId", groupId);

			_command.put("/segments.segmentsexperiment/get-segments-experiments", _params);
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

	public JSONArray getSegmentsExperiments(long segmentsExperienceId, long classNameId, long classPK, JSONArray statuses, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("segmentsExperienceId", segmentsExperienceId);
			_params.put("statuses", checkNull(statuses));
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.segments.model.SegmentsExperiment>", orderByComparator);

			_command.put("/segments.segmentsexperiment/get-segments-experiments", _params);
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

	public JSONObject runSegmentsExperiment(long segmentsExperimentId, double confidenceLevel, JSONObject segmentsExperienceIdSplitMap) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("confidenceLevel", confidenceLevel);
			_params.put("segmentsExperienceIdSplitMap", checkNull(segmentsExperienceIdSplitMap));
			_params.put("segmentsExperimentId", segmentsExperimentId);

			_command.put("/segments.segmentsexperiment/run-segments-experiment", _params);
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

	public JSONObject runSegmentsExperiment(String segmentsExperimentKey, double confidenceLevel, JSONObject segmentsExperienceKeySplitMap) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("confidenceLevel", confidenceLevel);
			_params.put("segmentsExperienceKeySplitMap", checkNull(segmentsExperienceKeySplitMap));
			_params.put("segmentsExperimentKey", checkNull(segmentsExperimentKey));

			_command.put("/segments.segmentsexperiment/run-segments-experiment", _params);
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

	public JSONObject updateSegmentsExperiment(long segmentsExperimentId, String name, String description, String goal, String goalTarget) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("description", checkNull(description));
			_params.put("goal", checkNull(goal));
			_params.put("goalTarget", checkNull(goalTarget));
			_params.put("name", checkNull(name));
			_params.put("segmentsExperimentId", segmentsExperimentId);

			_command.put("/segments.segmentsexperiment/update-segments-experiment", _params);
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

	public JSONObject updateSegmentsExperimentStatus(long segmentsExperimentId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("segmentsExperimentId", segmentsExperimentId);
			_params.put("status", status);

			_command.put("/segments.segmentsexperiment/update-segments-experiment-status", _params);
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

	public JSONObject updateSegmentsExperimentStatus(long segmentsExperimentId, long winnerSegmentsExperienceId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("segmentsExperimentId", segmentsExperimentId);
			_params.put("status", status);
			_params.put("winnerSegmentsExperienceId", winnerSegmentsExperienceId);

			_command.put("/segments.segmentsexperiment/update-segments-experiment-status", _params);
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

	public JSONObject updateSegmentsExperimentStatus(String segmentsExperimentKey, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("segmentsExperimentKey", checkNull(segmentsExperimentKey));
			_params.put("status", status);

			_command.put("/segments.segmentsexperiment/update-segments-experiment-status", _params);
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

	public JSONObject updateSegmentsExperimentStatus(String segmentsExperimentKey, String winnerSegmentsExperienceKey, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("segmentsExperimentKey", checkNull(segmentsExperimentKey));
			_params.put("status", status);
			_params.put("winnerSegmentsExperienceKey", checkNull(winnerSegmentsExperienceKey));

			_command.put("/segments.segmentsexperiment/update-segments-experiment-status", _params);
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