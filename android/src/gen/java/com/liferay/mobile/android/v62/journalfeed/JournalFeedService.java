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

package com.liferay.mobile.android.v62.journalfeed;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class JournalFeedService extends BaseService {

	public JournalFeedService(Session session) {
		super(session);
	}

	public JSONObject addFeed(long groupId, String feedId, boolean autoFeedId, String name, String description, String type, String structureId, String templateId, String rendererTemplateId, int delta, String orderByCol, String orderByType, String targetLayoutFriendlyUrl, String targetPortletId, String contentField, String feedType, double feedVersion, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("feedId", feedId);
			_params.put("autoFeedId", autoFeedId);
			_params.put("name", name);
			_params.put("description", description);
			_params.put("type", type);
			_params.put("structureId", structureId);
			_params.put("templateId", templateId);
			_params.put("rendererTemplateId", rendererTemplateId);
			_params.put("delta", delta);
			_params.put("orderByCol", orderByCol);
			_params.put("orderByType", orderByType);
			_params.put("targetLayoutFriendlyUrl", targetLayoutFriendlyUrl);
			_params.put("targetPortletId", targetPortletId);
			_params.put("contentField", contentField);
			_params.put("feedType", feedType);
			_params.put("feedVersion", feedVersion);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/journalfeed/add-feed", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return session.invoke(_command).getJSONObject(0);
	}

	public void deleteFeed(long feedId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("feedId", feedId);

			_command.put("/journalfeed/delete-feed", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void deleteFeed(long groupId, String feedId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("feedId", feedId);

			_command.put("/journalfeed/delete-feed", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject getFeed(long feedId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("feedId", feedId);

			_command.put("/journalfeed/get-feed", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return session.invoke(_command).getJSONObject(0);
	}

	public JSONObject getFeed(long groupId, String feedId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("feedId", feedId);

			_command.put("/journalfeed/get-feed", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return session.invoke(_command).getJSONObject(0);
	}

	public JSONObject updateFeed(long groupId, String feedId, String name, String description, String type, String structureId, String templateId, String rendererTemplateId, int delta, String orderByCol, String orderByType, String targetLayoutFriendlyUrl, String targetPortletId, String contentField, String feedType, double feedVersion, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("feedId", feedId);
			_params.put("name", name);
			_params.put("description", description);
			_params.put("type", type);
			_params.put("structureId", structureId);
			_params.put("templateId", templateId);
			_params.put("rendererTemplateId", rendererTemplateId);
			_params.put("delta", delta);
			_params.put("orderByCol", orderByCol);
			_params.put("orderByType", orderByType);
			_params.put("targetLayoutFriendlyUrl", targetLayoutFriendlyUrl);
			_params.put("targetPortletId", targetPortletId);
			_params.put("contentField", contentField);
			_params.put("feedType", feedType);
			_params.put("feedVersion", feedVersion);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/journalfeed/update-feed", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return session.invoke(_command).getJSONObject(0);
	}

}