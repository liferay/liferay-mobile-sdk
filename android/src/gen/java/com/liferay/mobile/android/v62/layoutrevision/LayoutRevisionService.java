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

package com.liferay.mobile.android.v62.layoutrevision;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class LayoutRevisionService extends BaseService {
	public LayoutRevisionService(Session session) {
		super(session);
	}

	public JSONObject addLayoutRevision(long userId, long layoutSetBranchId,
		long layoutBranchId, long parentLayoutRevisionId, boolean head,
		long plid, long portletPreferencesPlid, boolean privateLayout,
		String name, String title, String description, String keywords,
		String robots, String typeSettings, boolean iconImage,
		long iconImageId, String themeId, String colorSchemeId,
		String wapThemeId, String wapColorSchemeId, String css,
		JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);
			_params.put("layoutSetBranchId", layoutSetBranchId);
			_params.put("layoutBranchId", layoutBranchId);
			_params.put("parentLayoutRevisionId", parentLayoutRevisionId);
			_params.put("head", head);
			_params.put("plid", plid);
			_params.put("portletPreferencesPlid", portletPreferencesPlid);
			_params.put("privateLayout", privateLayout);
			_params.put("name", name);
			_params.put("title", title);
			_params.put("description", description);
			_params.put("keywords", keywords);
			_params.put("robots", robots);
			_params.put("typeSettings", typeSettings);
			_params.put("iconImage", iconImage);
			_params.put("iconImageId", iconImageId);
			_params.put("themeId", themeId);
			_params.put("colorSchemeId", colorSchemeId);
			_params.put("wapThemeId", wapThemeId);
			_params.put("wapColorSchemeId", wapColorSchemeId);
			_params.put("css", css);
			_params.put("serviceContext", serviceContext);

			_command.put("/layoutrevision/add-layout-revision", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}
}