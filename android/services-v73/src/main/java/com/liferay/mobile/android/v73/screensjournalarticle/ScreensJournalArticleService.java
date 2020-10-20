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

package com.liferay.mobile.android.v73.screensjournalarticle;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class ScreensJournalArticleService extends BaseService {

	public ScreensJournalArticleService(Session session) {
		super(session);
	}

	public String getJournalArticleContent(long classPK, long ddmTemplateId, String locale) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classPK", classPK);
			_params.put("ddmTemplateId", ddmTemplateId);
			_params.put("locale", checkNull(locale));

			_command.put("/screens.screensjournalarticle/get-journal-article-content", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getString(0);
	}

	public String getJournalArticleContent(long classPK, String locale) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classPK", classPK);
			_params.put("locale", checkNull(locale));

			_command.put("/screens.screensjournalarticle/get-journal-article-content", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getString(0);
	}

	public String getJournalArticleContent(long groupId, String articleId, long ddmTemplateId, String locale) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("articleId", checkNull(articleId));
			_params.put("ddmTemplateId", ddmTemplateId);
			_params.put("groupId", groupId);
			_params.put("locale", checkNull(locale));

			_command.put("/screens.screensjournalarticle/get-journal-article-content", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getString(0);
	}

}