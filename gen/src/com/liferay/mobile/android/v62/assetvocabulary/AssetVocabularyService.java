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

package com.liferay.mobile.android.v62.assetvocabulary;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class AssetVocabularyService extends BaseService {
	public AssetVocabularyService(Session session) {
		super(session);
	}

	public JSONObject addVocabulary(String title, JSONObject titleMap,
		JSONObject descriptionMap, String settings, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("title", title);
			_params.put("titleMap", titleMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("settings", settings);
			_params.put("serviceContext", serviceContext);

			_command.put("/assetvocabulary/add-vocabulary", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONArray deleteVocabularies(JSONArray vocabularyIds,
		JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("vocabularyIds", vocabularyIds);
			_params.put("serviceContext", serviceContext);

			_command.put("/assetvocabulary/delete-vocabularies", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public void deleteVocabulary(long vocabularyId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("vocabularyId", vocabularyId);

			_command.put("/assetvocabulary/delete-vocabulary", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONArray getCompanyVocabularies(long companyId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);

			_command.put("/assetvocabulary/get-company-vocabularies", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getGroupVocabularies(long groupId, String name, int start,
		int end, JSONObject obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("name", name);
			_params.put("start", start);
			_params.put("end", end);
			_params.put("obc", obc);

			_command.put("/assetvocabulary/get-group-vocabularies", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer getGroupVocabulariesCount(long groupId, String name)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("name", name);

			_command.put("/assetvocabulary/get-group-vocabularies-count",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONObject getGroupVocabulariesDisplay(long groupId, String name,
		int start, int end, boolean addDefaultVocabulary, JSONObject obc)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("name", name);
			_params.put("start", start);
			_params.put("end", end);
			_params.put("addDefaultVocabulary", addDefaultVocabulary);
			_params.put("obc", obc);

			_command.put("/assetvocabulary/get-group-vocabularies-display",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONArray getGroupsVocabularies(JSONArray groupIds, String className)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupIds", groupIds);
			_params.put("className", className);

			_command.put("/assetvocabulary/get-groups-vocabularies", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONObject getJsonGroupVocabularies(long groupId, String name,
		int start, int end, JSONObject obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("name", name);
			_params.put("start", start);
			_params.put("end", end);
			_params.put("obc", obc);

			_command.put("/assetvocabulary/get-json-group-vocabularies", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONArray getVocabularies(JSONArray vocabularyIds)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("vocabularyIds", vocabularyIds);

			_command.put("/assetvocabulary/get-vocabularies", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONObject getVocabulary(long vocabularyId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("vocabularyId", vocabularyId);

			_command.put("/assetvocabulary/get-vocabulary", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updateVocabulary(long vocabularyId, String title,
		JSONObject titleMap, JSONObject descriptionMap, String settings,
		JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("vocabularyId", vocabularyId);
			_params.put("title", title);
			_params.put("titleMap", titleMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("settings", settings);
			_params.put("serviceContext", serviceContext);

			_command.put("/assetvocabulary/update-vocabulary", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}
}