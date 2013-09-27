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

package com.liferay.mobile.android.v62.layoutsetbranch;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class LayoutSetBranchService extends BaseService {
	public LayoutSetBranchService(Session session) {
		super(session);
	}

	public JSONObject addLayoutSetBranch(long groupId, boolean privateLayout,
		String name, String description, boolean master,
		long copyLayoutSetBranchId, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("name", name);
			_params.put("description", description);
			_params.put("master", master);
			_params.put("copyLayoutSetBranchId", copyLayoutSetBranchId);
			_params.put("serviceContext", serviceContext);

			_command.put("/layoutsetbranch/add-layout-set-branch", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void deleteLayoutSetBranch(long layoutSetBranchId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("layoutSetBranchId", layoutSetBranchId);

			_command.put("/layoutsetbranch/delete-layout-set-branch", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONArray getLayoutSetBranches(long groupId, boolean privateLayout)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);

			_command.put("/layoutsetbranch/get-layout-set-branches", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONObject mergeLayoutSetBranch(long layoutSetBranchId,
		long mergeLayoutSetBranchId, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("layoutSetBranchId", layoutSetBranchId);
			_params.put("mergeLayoutSetBranchId", mergeLayoutSetBranchId);
			_params.put("serviceContext", serviceContext);

			_command.put("/layoutsetbranch/merge-layout-set-branch", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updateLayoutSetBranch(long groupId,
		long layoutSetBranchId, String name, String description,
		JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("layoutSetBranchId", layoutSetBranchId);
			_params.put("name", name);
			_params.put("description", description);
			_params.put("serviceContext", serviceContext);

			_command.put("/layoutsetbranch/update-layout-set-branch", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}
}