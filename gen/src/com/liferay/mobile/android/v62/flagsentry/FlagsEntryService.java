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

package com.liferay.mobile.android.v62.flagsentry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.ServiceContext;
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class FlagsEntryService extends BaseService {
	public FlagsEntryService(ServiceContext context) {
		super(context);
	}

	public FlagsEntryService(ServiceContext context, AsyncTaskCallback callback) {
		super(context, callback);
	}

	public FlagsEntryService(ServiceContext context, boolean batch) {
		super(context, batch);
	}

	public void addEntry(String className, long classPK,
		String reporterEmailAddress, long reportedUserId, String contentTitle,
		String contentURL, String reason, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", className);
			_params.put("classPK", classPK);
			_params.put("reporterEmailAddress", reporterEmailAddress);
			_params.put("reportedUserId", reportedUserId);
			_params.put("contentTitle", contentTitle);
			_params.put("contentURL", contentURL);
			_params.put("reason", reason);
			_params.put("serviceContext", serviceContext);

			_command.put("/flagsentry/add-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		post(_command);
	}
}