/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.mobile.android.v62.pollsquestion;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.ServiceContext;
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class PollsQuestionService extends BaseService {
	public PollsQuestionService(ServiceContext context) {
		super(context);
	}

	public PollsQuestionService(ServiceContext context,
		AsyncTaskCallback callback) {
		super(context, callback);
	}

	public PollsQuestionService(ServiceContext context, boolean batch) {
		super(context, batch);
	}

	public JSONObject addQuestion(JSONObject titleMap,
		JSONObject descriptionMap, int expirationDateMonth,
		int expirationDateDay, int expirationDateYear, int expirationDateHour,
		int expirationDateMinute, boolean neverExpire, JSONArray choices,
		JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("titleMap", titleMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("expirationDateMonth", expirationDateMonth);
			_params.put("expirationDateDay", expirationDateDay);
			_params.put("expirationDateYear", expirationDateYear);
			_params.put("expirationDateHour", expirationDateHour);
			_params.put("expirationDateMinute", expirationDateMinute);
			_params.put("neverExpire", neverExpire);
			_params.put("choices", choices);
			_params.put("serviceContext", serviceContext);

			_command.put("/pollsquestion/add-question", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public void deleteQuestion(long questionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("questionId", questionId);

			_command.put("/pollsquestion/delete-question", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		post(_command);
	}

	public JSONObject getQuestion(long questionId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("questionId", questionId);

			_command.put("/pollsquestion/get-question", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONObject updateQuestion(long questionId, JSONObject titleMap,
		JSONObject descriptionMap, int expirationDateMonth,
		int expirationDateDay, int expirationDateYear, int expirationDateHour,
		int expirationDateMinute, boolean neverExpire, JSONArray choices,
		JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("questionId", questionId);
			_params.put("titleMap", titleMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("expirationDateMonth", expirationDateMonth);
			_params.put("expirationDateDay", expirationDateDay);
			_params.put("expirationDateYear", expirationDateYear);
			_params.put("expirationDateHour", expirationDateHour);
			_params.put("expirationDateMinute", expirationDateMinute);
			_params.put("neverExpire", neverExpire);
			_params.put("choices", choices);
			_params.put("serviceContext", serviceContext);

			_command.put("/pollsquestion/update-question", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}
}