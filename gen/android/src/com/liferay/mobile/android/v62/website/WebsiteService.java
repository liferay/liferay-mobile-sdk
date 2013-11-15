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

package com.liferay.mobile.android.v62.website;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class WebsiteService extends BaseService {
	public WebsiteService(Session session) {
		super(session);
	}

	public JSONObject addWebsite(String className, long classPK, String url,
		int typeId, boolean primary) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", className);
			_params.put("classPK", classPK);
			_params.put("url", url);
			_params.put("typeId", typeId);
			_params.put("primary", primary);

			_command.put("/website/add-website", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject addWebsite(String className, long classPK, String url,
		int typeId, boolean primary, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", className);
			_params.put("classPK", classPK);
			_params.put("url", url);
			_params.put("typeId", typeId);
			_params.put("primary", primary);
			_params.put("serviceContext", serviceContext);

			_command.put("/website/add-website", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void deleteWebsite(long websiteId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("websiteId", websiteId);

			_command.put("/website/delete-website", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject getWebsite(long websiteId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("websiteId", websiteId);

			_command.put("/website/get-website", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONArray getWebsites(String className, long classPK)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", className);
			_params.put("classPK", classPK);

			_command.put("/website/get-websites", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONObject updateWebsite(long websiteId, String url, int typeId,
		boolean primary) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("websiteId", websiteId);
			_params.put("url", url);
			_params.put("typeId", typeId);
			_params.put("primary", primary);

			_command.put("/website/update-website", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}
}