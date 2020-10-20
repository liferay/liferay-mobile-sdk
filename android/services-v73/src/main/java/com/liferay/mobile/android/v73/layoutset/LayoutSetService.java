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

package com.liferay.mobile.android.v73.layoutset;

import com.liferay.mobile.android.http.file.UploadData;
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
			_params.put("layoutSetPrototypeLinkEnabled", layoutSetPrototypeLinkEnabled);
			_params.put("layoutSetPrototypeUuid", checkNull(layoutSetPrototypeUuid));
			_params.put("privateLayout", privateLayout);

			_command.put("/layoutset/update-layout-set-prototype-link-enabled", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void updateLogo(long groupId, boolean privateLayout, boolean hasLogo, byte[] bytes) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("bytes", toString(bytes));
			_params.put("groupId", groupId);
			_params.put("hasLogo", hasLogo);
			_params.put("privateLayout", privateLayout);

			_command.put("/layoutset/update-logo", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void updateLogo(long groupId, boolean privateLayout, boolean hasLogo, UploadData file) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("file", checkNull(file));
			_params.put("groupId", groupId);
			_params.put("hasLogo", hasLogo);
			_params.put("privateLayout", privateLayout);

			_command.put("/layoutset/update-logo", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.upload(_command);
	}

	public JSONObject updateLookAndFeel(long groupId, boolean privateLayout, String themeId, String colorSchemeId, String css) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("colorSchemeId", checkNull(colorSchemeId));
			_params.put("css", checkNull(css));
			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("themeId", checkNull(themeId));

			_command.put("/layoutset/update-look-and-feel", _params);
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

	public JSONObject updateSettings(long groupId, boolean privateLayout, String settings) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("settings", checkNull(settings));

			_command.put("/layoutset/update-settings", _params);
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

	public JSONObject updateVirtualHost(long groupId, boolean privateLayout, String virtualHostname) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("virtualHostname", checkNull(virtualHostname));

			_command.put("/layoutset/update-virtual-host", _params);
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

	public JSONObject updateVirtualHosts(long groupId, boolean privateLayout, JSONObject virtualHostnames) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("virtualHostnames", checkNull(virtualHostnames));

			_command.put("/layoutset/update-virtual-hosts", _params);
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