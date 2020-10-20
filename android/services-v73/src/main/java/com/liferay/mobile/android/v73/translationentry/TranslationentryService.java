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

package com.liferay.mobile.android.v73.translationentry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class TranslationentryService extends BaseService {

	public TranslationentryService(Session session) {
		super(session);
	}

	public JSONObject addOrUpdateTranslationEntry(long groupId, JSONObjectWrapper infoItemReference, String content, String contentType, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			mangleWrapper(_params, "infoItemReference", "com.liferay.info.item.InfoItemReference", infoItemReference);
			_params.put("content", checkNull(content));
			_params.put("contentType", checkNull(contentType));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/translation.translationentry/add-or-update-translation-entry", _params);
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

	public JSONObject addOrUpdateTranslationEntry(long groupId, String languageId, JSONObjectWrapper infoItemReference, JSONObjectWrapper infoItemFieldValues, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("languageId", checkNull(languageId));
			mangleWrapper(_params, "infoItemReference", "com.liferay.info.item.InfoItemReference", infoItemReference);
			mangleWrapper(_params, "infoItemFieldValues", "com.liferay.info.item.InfoItemFieldValues", infoItemFieldValues);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/translation.translationentry/add-or-update-translation-entry", _params);
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