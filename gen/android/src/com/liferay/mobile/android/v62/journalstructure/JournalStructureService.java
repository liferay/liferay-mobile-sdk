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

package com.liferay.mobile.android.v62.journalstructure;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class JournalStructureService extends BaseService {
	public JournalStructureService(Session session) {
		super(session);
	}

	public JSONObject addStructure(long groupId, String structureId,
		boolean autoStructureId, String parentStructureId, JSONObject nameMap,
		JSONObject descriptionMap, String xsd, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("structureId", structureId);
			_params.put("autoStructureId", autoStructureId);
			_params.put("parentStructureId", parentStructureId);
			_params.put("nameMap", nameMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("xsd", xsd);
			_params.put("serviceContext", serviceContext);

			_command.put("/journalstructure/add-structure", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject copyStructure(long groupId, String oldStructureId,
		String newStructureId, boolean autoStructureId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("oldStructureId", oldStructureId);
			_params.put("newStructureId", newStructureId);
			_params.put("autoStructureId", autoStructureId);

			_command.put("/journalstructure/copy-structure", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void deleteStructure(long groupId, String structureId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("structureId", structureId);

			_command.put("/journalstructure/delete-structure", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject getStructure(long groupId, String structureId,
		boolean includeGlobalStructures) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("structureId", structureId);
			_params.put("includeGlobalStructures", includeGlobalStructures);

			_command.put("/journalstructure/get-structure", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONArray getStructures(JSONArray groupIds)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupIds", groupIds);

			_command.put("/journalstructure/get-structures", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray search(long companyId, JSONArray groupIds,
		String structureId, String name, String description,
		boolean andOperator, int start, int end, JSONObject obc)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupIds", groupIds);
			_params.put("structureId", structureId);
			_params.put("name", name);
			_params.put("description", description);
			_params.put("andOperator", andOperator);
			_params.put("start", start);
			_params.put("end", end);
			_params.put("obc", obc);

			_command.put("/journalstructure/search", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer searchCount(long companyId, JSONArray groupIds,
		String structureId, String name, String description, boolean andOperator)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupIds", groupIds);
			_params.put("structureId", structureId);
			_params.put("name", name);
			_params.put("description", description);
			_params.put("andOperator", andOperator);

			_command.put("/journalstructure/search-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONObject updateStructure(long groupId, String structureId,
		String parentStructureId, JSONObject nameMap,
		JSONObject descriptionMap, String xsd, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("structureId", structureId);
			_params.put("parentStructureId", parentStructureId);
			_params.put("nameMap", nameMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("xsd", xsd);
			_params.put("serviceContext", serviceContext);

			_command.put("/journalstructure/update-structure", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}
}