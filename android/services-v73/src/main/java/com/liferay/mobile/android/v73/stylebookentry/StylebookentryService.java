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

package com.liferay.mobile.android.v73.stylebookentry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class StylebookentryService extends BaseService {

	public StylebookentryService(Session session) {
		super(session);
	}

	public JSONObject addStyleBookEntry(long groupId, String name, String styleBookEntryKey, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("styleBookEntryKey", checkNull(styleBookEntryKey));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/stylebook.stylebookentry/add-style-book-entry", _params);
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

	public JSONObject addStyleBookEntry(long groupId, String frontendTokensValues, String name, String styleBookEntryKey, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("frontendTokensValues", checkNull(frontendTokensValues));
			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("styleBookEntryKey", checkNull(styleBookEntryKey));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/stylebook.stylebookentry/add-style-book-entry", _params);
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

	public JSONObject copyStyleBookEntry(long groupId, long styleBookEntryId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("styleBookEntryId", styleBookEntryId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/stylebook.stylebookentry/copy-style-book-entry", _params);
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

	public JSONObject deleteStyleBookEntry(JSONObjectWrapper styleBookEntry) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			mangleWrapper(_params, "styleBookEntry", "com.liferay.style.book.model.StyleBookEntry", styleBookEntry);

			_command.put("/stylebook.stylebookentry/delete-style-book-entry", _params);
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

	public JSONObject deleteStyleBookEntry(long styleBookEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("styleBookEntryId", styleBookEntryId);

			_command.put("/stylebook.stylebookentry/delete-style-book-entry", _params);
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

	public JSONObject discardDraftStyleBookEntry(long styleBookEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("styleBookEntryId", styleBookEntryId);

			_command.put("/stylebook.stylebookentry/discard-draft-style-book-entry", _params);
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

	public JSONObject publishDraft(long styleBookEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("styleBookEntryId", styleBookEntryId);

			_command.put("/stylebook.stylebookentry/publish-draft", _params);
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

	public JSONObject updateDefaultStyleBookEntry(long styleBookEntryId, boolean defaultStyleBookEntry) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("defaultStyleBookEntry", defaultStyleBookEntry);
			_params.put("styleBookEntryId", styleBookEntryId);

			_command.put("/stylebook.stylebookentry/update-default-style-book-entry", _params);
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

	public JSONObject updateFrontendTokensValues(long styleBookEntryId, String frontendTokensValues) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("frontendTokensValues", checkNull(frontendTokensValues));
			_params.put("styleBookEntryId", styleBookEntryId);

			_command.put("/stylebook.stylebookentry/update-frontend-tokens-values", _params);
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

	public JSONObject updateName(long styleBookEntryId, String name) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("name", checkNull(name));
			_params.put("styleBookEntryId", styleBookEntryId);

			_command.put("/stylebook.stylebookentry/update-name", _params);
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

	public JSONObject updatePreviewFileEntryId(long styleBookEntryId, long previewFileEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("previewFileEntryId", previewFileEntryId);
			_params.put("styleBookEntryId", styleBookEntryId);

			_command.put("/stylebook.stylebookentry/update-preview-file-entry-id", _params);
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

	public JSONObject updateStyleBookEntry(long styleBookEntryId, String frontendTokensValues, String name) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("frontendTokensValues", checkNull(frontendTokensValues));
			_params.put("name", checkNull(name));
			_params.put("styleBookEntryId", styleBookEntryId);

			_command.put("/stylebook.stylebookentry/update-style-book-entry", _params);
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