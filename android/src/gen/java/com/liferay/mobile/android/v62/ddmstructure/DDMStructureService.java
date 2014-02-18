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

package com.liferay.mobile.android.v62.ddmstructure;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class DDMStructureService extends BaseService {
	public DDMStructureService(Session session) {
		super(session);
	}

	public JSONObject addStructure(long groupId, long parentStructureId,
		long classNameId, String structureKey, JSONObject nameMap,
		JSONObject descriptionMap, String xsd, String storageType, int type,
		JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentStructureId", parentStructureId);
			_params.put("classNameId", classNameId);
			_params.put("structureKey", structureKey);
			_params.put("nameMap", nameMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("xsd", xsd);
			_params.put("storageType", storageType);
			_params.put("type", type);
			_params.put("serviceContext", serviceContext);

			_command.put("/ddmstructure/add-structure", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject addStructure(long userId, long groupId,
		String parentStructureKey, long classNameId, String structureKey,
		JSONObject nameMap, JSONObject descriptionMap, String xsd,
		String storageType, int type, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);
			_params.put("groupId", groupId);
			_params.put("parentStructureKey", parentStructureKey);
			_params.put("classNameId", classNameId);
			_params.put("structureKey", structureKey);
			_params.put("nameMap", nameMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("xsd", xsd);
			_params.put("storageType", storageType);
			_params.put("type", type);
			_params.put("serviceContext", serviceContext);

			_command.put("/ddmstructure/add-structure", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject addStructure(long userId, long groupId, long classNameId,
		JSONObject nameMap, JSONObject descriptionMap, String xsd,
		JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("userId", userId);
			_params.put("groupId", groupId);
			_params.put("classNameId", classNameId);
			_params.put("nameMap", nameMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("xsd", xsd);
			_params.put("serviceContext", serviceContext);

			_command.put("/ddmstructure/add-structure", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject copyStructure(long structureId, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("structureId", structureId);
			_params.put("serviceContext", serviceContext);

			_command.put("/ddmstructure/copy-structure", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject copyStructure(long structureId, JSONObject nameMap,
		JSONObject descriptionMap, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("structureId", structureId);
			_params.put("nameMap", nameMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("serviceContext", serviceContext);

			_command.put("/ddmstructure/copy-structure", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void deleteStructure(long structureId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("structureId", structureId);

			_command.put("/ddmstructure/delete-structure", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject fetchStructure(long groupId, long classNameId,
		String structureKey) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("classNameId", classNameId);
			_params.put("structureKey", structureKey);

			_command.put("/ddmstructure/fetch-structure", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject getStructure(long structureId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("structureId", structureId);

			_command.put("/ddmstructure/get-structure", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject getStructure(long groupId, long classNameId,
		String structureKey) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("classNameId", classNameId);
			_params.put("structureKey", structureKey);

			_command.put("/ddmstructure/get-structure", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject getStructure(long groupId, long classNameId,
		String structureKey, boolean includeGlobalStructures)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("classNameId", classNameId);
			_params.put("structureKey", structureKey);
			_params.put("includeGlobalStructures", includeGlobalStructures);

			_command.put("/ddmstructure/get-structure", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONArray getStructures(long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);

			_command.put("/ddmstructure/get-structures", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getStructures(JSONArray groupIds)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupIds", groupIds);

			_command.put("/ddmstructure/get-structures", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray search(long companyId, JSONArray groupIds,
		JSONArray classNameIds, String name, String description,
		String storageType, int type, boolean andOperator, int start, int end,
		JSONObject orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupIds", groupIds);
			_params.put("classNameIds", classNameIds);
			_params.put("name", name);
			_params.put("description", description);
			_params.put("storageType", storageType);
			_params.put("type", type);
			_params.put("andOperator", andOperator);
			_params.put("start", start);
			_params.put("end", end);
			_params.put("orderByComparator", orderByComparator);

			_command.put("/ddmstructure/search", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray search(long companyId, JSONArray groupIds,
		JSONArray classNameIds, String keywords, int start, int end,
		JSONObject orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupIds", groupIds);
			_params.put("classNameIds", classNameIds);
			_params.put("keywords", keywords);
			_params.put("start", start);
			_params.put("end", end);
			_params.put("orderByComparator", orderByComparator);

			_command.put("/ddmstructure/search", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer searchCount(long companyId, JSONArray groupIds,
		JSONArray classNameIds, String keywords) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupIds", groupIds);
			_params.put("classNameIds", classNameIds);
			_params.put("keywords", keywords);

			_command.put("/ddmstructure/search-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public Integer searchCount(long companyId, JSONArray groupIds,
		JSONArray classNameIds, String name, String description,
		String storageType, int type, boolean andOperator)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupIds", groupIds);
			_params.put("classNameIds", classNameIds);
			_params.put("name", name);
			_params.put("description", description);
			_params.put("storageType", storageType);
			_params.put("type", type);
			_params.put("andOperator", andOperator);

			_command.put("/ddmstructure/search-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONObject updateStructure(long structureId, long parentStructureId,
		JSONObject nameMap, JSONObject descriptionMap, String xsd,
		JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("structureId", structureId);
			_params.put("parentStructureId", parentStructureId);
			_params.put("nameMap", nameMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("xsd", xsd);
			_params.put("serviceContext", serviceContext);

			_command.put("/ddmstructure/update-structure", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updateStructure(long groupId, long parentStructureId,
		long classNameId, String structureKey, JSONObject nameMap,
		JSONObject descriptionMap, String xsd, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentStructureId", parentStructureId);
			_params.put("classNameId", classNameId);
			_params.put("structureKey", structureKey);
			_params.put("nameMap", nameMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("xsd", xsd);
			_params.put("serviceContext", serviceContext);

			_command.put("/ddmstructure/update-structure", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}
}