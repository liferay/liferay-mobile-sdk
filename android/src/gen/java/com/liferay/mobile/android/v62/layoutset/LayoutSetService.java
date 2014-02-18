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

package com.liferay.mobile.android.v62.layoutset;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class LayoutSetService extends BaseService {

	public LayoutSetService(Session session) {
		super(session);
	}

	public void updateLayoutSetPrototypeLinkEnabled(long groupId, boolean privateLayout, boolean layoutSetPrototypeLinkEnabled, String layoutSetPrototypeUuid) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("layoutSetPrototypeLinkEnabled", layoutSetPrototypeLinkEnabled);
			_params.put("layoutSetPrototypeUuid", layoutSetPrototypeUuid);

			_command.put("/layoutset/update-layout-set-prototype-link-enabled", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void updateLogo(long groupId, boolean privateLayout, boolean logo, JSONArray bytes) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("logo", logo);
			_params.put("bytes", bytes);

			_command.put("/layoutset/update-logo", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void updateLogo(long groupId, boolean privateLayout, boolean logo, JSONObject file) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("logo", logo);
			_params.put("file", file);

			_command.put("/layoutset/update-logo", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject updateLookAndFeel(long groupId, boolean privateLayout, String themeId, String colorSchemeId, String css, boolean wapTheme) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("themeId", themeId);
			_params.put("colorSchemeId", colorSchemeId);
			_params.put("css", css);
			_params.put("wapTheme", wapTheme);

			_command.put("/layoutset/update-look-and-feel", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updateSettings(long groupId, boolean privateLayout, String settings) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("settings", settings);

			_command.put("/layoutset/update-settings", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updateVirtualHost(long groupId, boolean privateLayout, String virtualHost) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("virtualHost", virtualHost);

			_command.put("/layoutset/update-virtual-host", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

}