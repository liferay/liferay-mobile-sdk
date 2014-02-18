/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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

package com.liferay.mobile.android.v62.mdrrulegroupinstance;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class MDRRuleGroupInstanceService extends BaseService {

	public MDRRuleGroupInstanceService(Session session) {
		super(session);
	}

	public JSONObject addRuleGroupInstance(long groupId, String className, long classPK, long ruleGroupId, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("className", className);
			_params.put("classPK", classPK);
			_params.put("ruleGroupId", ruleGroupId);
			_params.put("serviceContext", serviceContext);

			_command.put("/mdrrulegroupinstance/add-rule-group-instance", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject addRuleGroupInstance(long groupId, String className, long classPK, long ruleGroupId, int priority, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("className", className);
			_params.put("classPK", classPK);
			_params.put("ruleGroupId", ruleGroupId);
			_params.put("priority", priority);
			_params.put("serviceContext", serviceContext);

			_command.put("/mdrrulegroupinstance/add-rule-group-instance", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void deleteRuleGroupInstance(long ruleGroupInstanceId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ruleGroupInstanceId", ruleGroupInstanceId);

			_command.put("/mdrrulegroupinstance/delete-rule-group-instance", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONArray getRuleGroupInstances(String className, long classPK, int start, int end, JSONObject orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", className);
			_params.put("classPK", classPK);
			_params.put("start", start);
			_params.put("end", end);
			_params.put("orderByComparator", orderByComparator);

			_command.put("/mdrrulegroupinstance/get-rule-group-instances", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer getRuleGroupInstancesCount(String className, long classPK) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", className);
			_params.put("classPK", classPK);

			_command.put("/mdrrulegroupinstance/get-rule-group-instances-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONObject updateRuleGroupInstance(long ruleGroupInstanceId, int priority) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("ruleGroupInstanceId", ruleGroupInstanceId);
			_params.put("priority", priority);

			_command.put("/mdrrulegroupinstance/update-rule-group-instance", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

}