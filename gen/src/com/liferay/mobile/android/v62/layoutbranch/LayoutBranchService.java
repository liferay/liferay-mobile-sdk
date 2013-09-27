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

package com.liferay.mobile.android.v62.layoutbranch;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class LayoutBranchService extends BaseService {
	public LayoutBranchService(Session session) {
		super(session);
	}

	public LayoutBranchService(Session session, AsyncTaskCallback callback) {
		super(session, callback);
	}

	public LayoutBranchService(Session session, boolean batch) {
		super(session, batch);
	}

	public JSONObject addLayoutBranch(long layoutRevisionId, String name,
		String description, boolean master, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("layoutRevisionId", layoutRevisionId);
			_params.put("name", name);
			_params.put("description", description);
			_params.put("master", master);
			_params.put("serviceContext", serviceContext);

			_command.put("/layoutbranch/add-layout-branch", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public void deleteLayoutBranch(long layoutBranchId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("layoutBranchId", layoutBranchId);

			_command.put("/layoutbranch/delete-layout-branch", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		post(_command);
	}

	public JSONObject updateLayoutBranch(long layoutBranchId, String name,
		String description, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("layoutBranchId", layoutBranchId);
			_params.put("name", name);
			_params.put("description", description);
			_params.put("serviceContext", serviceContext);

			_command.put("/layoutbranch/update-layout-branch", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}
}