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

package com.liferay.mobile.android.v73.layoutseoentry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class LayoutseoentryService extends BaseService {

	public LayoutseoentryService(Session session) {
		super(session);
	}

	public JSONObject updateLayoutSeoEntry(long groupId, boolean privateLayout, long layoutId, boolean canonicalURLEnabled, JSONObject canonicalURLMap, boolean openGraphDescriptionEnabled, JSONObject openGraphDescriptionMap, JSONObject openGraphImageAltMap, long openGraphImageFileEntryId, boolean openGraphTitleEnabled, JSONObject openGraphTitleMap, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("canonicalURLEnabled", canonicalURLEnabled);
			_params.put("canonicalURLMap", checkNull(canonicalURLMap));
			_params.put("groupId", groupId);
			_params.put("layoutId", layoutId);
			_params.put("openGraphDescriptionEnabled", openGraphDescriptionEnabled);
			_params.put("openGraphDescriptionMap", checkNull(openGraphDescriptionMap));
			_params.put("openGraphImageAltMap", checkNull(openGraphImageAltMap));
			_params.put("openGraphImageFileEntryId", openGraphImageFileEntryId);
			_params.put("openGraphTitleEnabled", openGraphTitleEnabled);
			_params.put("openGraphTitleMap", checkNull(openGraphTitleMap));
			_params.put("privateLayout", privateLayout);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/layout.layoutseoentry/update-layout-seo-entry", _params);
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

	public JSONObject updateLayoutSeoEntry(long groupId, boolean privateLayout, long layoutId, boolean enabledCanonicalURLMap, JSONObject canonicalURLMap, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("canonicalURLMap", checkNull(canonicalURLMap));
			_params.put("enabledCanonicalURLMap", enabledCanonicalURLMap);
			_params.put("groupId", groupId);
			_params.put("layoutId", layoutId);
			_params.put("privateLayout", privateLayout);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/layout.layoutseoentry/update-layout-seo-entry", _params);
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