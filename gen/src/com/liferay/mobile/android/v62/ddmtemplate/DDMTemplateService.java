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

package com.liferay.mobile.android.v62.ddmtemplate;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class DDMTemplateService extends BaseService {
	public DDMTemplateService(Session session) {
		super(session);
	}

	public JSONObject addTemplate(long groupId, long classNameId, long classPK,
		String templateKey, JSONObject nameMap, JSONObject descriptionMap,
		String type, String mode, String language, String script,
		boolean cacheable, boolean smallImage, String smallImageURL,
		JSONObject smallImageFile, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("templateKey", templateKey);
			_params.put("nameMap", nameMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("type", type);
			_params.put("mode", mode);
			_params.put("language", language);
			_params.put("script", script);
			_params.put("cacheable", cacheable);
			_params.put("smallImage", smallImage);
			_params.put("smallImageURL", smallImageURL);
			_params.put("smallImageFile", smallImageFile);
			_params.put("serviceContext", serviceContext);

			_command.put("/ddmtemplate/add-template", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject copyTemplate(long templateId, JSONObject nameMap,
		JSONObject descriptionMap, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("templateId", templateId);
			_params.put("nameMap", nameMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("serviceContext", serviceContext);

			_command.put("/ddmtemplate/copy-template", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONArray copyTemplates(long classNameId, long classPK,
		long newClassPK, String type, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("newClassPK", newClassPK);
			_params.put("type", type);
			_params.put("serviceContext", serviceContext);

			_command.put("/ddmtemplate/copy-templates", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public void deleteTemplate(long templateId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("templateId", templateId);

			_command.put("/ddmtemplate/delete-template", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject fetchTemplate(long groupId, long classNameId,
		String templateKey) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("classNameId", classNameId);
			_params.put("templateKey", templateKey);

			_command.put("/ddmtemplate/fetch-template", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject getTemplate(long groupId, long classNameId,
		String templateKey, boolean includeGlobalTemplates)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("classNameId", classNameId);
			_params.put("templateKey", templateKey);
			_params.put("includeGlobalTemplates", includeGlobalTemplates);

			_command.put("/ddmtemplate/get-template", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONArray getTemplates(long groupId, long classNameId, long classPK,
		String type, String mode) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("type", type);
			_params.put("mode", mode);

			_command.put("/ddmtemplate/get-templates", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getTemplatesByClassPk(long groupId, long classPK)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("classPK", classPK);

			_command.put("/ddmtemplate/get-templates-by-class-pk", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getTemplatesByStructureClassNameId(long groupId,
		long structureClassNameId, int start, int end,
		JSONObject orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("structureClassNameId", structureClassNameId);
			_params.put("start", start);
			_params.put("end", end);
			_params.put("orderByComparator", orderByComparator);

			_command.put("/ddmtemplate/get-templates-by-structure-class-name-id",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer getTemplatesByStructureClassNameIdCount(long groupId,
		long structureClassNameId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("structureClassNameId", structureClassNameId);

			_command.put("/ddmtemplate/get-templates-by-structure-class-name-id-count",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONArray search(long companyId, JSONArray groupIds,
		JSONArray classNameIds, JSONArray classPKs, String name,
		String description, String type, String mode, String language,
		boolean andOperator, int start, int end, JSONObject orderByComparator)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupIds", groupIds);
			_params.put("classNameIds", classNameIds);
			_params.put("classPKs", classPKs);
			_params.put("name", name);
			_params.put("description", description);
			_params.put("type", type);
			_params.put("mode", mode);
			_params.put("language", language);
			_params.put("andOperator", andOperator);
			_params.put("start", start);
			_params.put("end", end);
			_params.put("orderByComparator", orderByComparator);

			_command.put("/ddmtemplate/search", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer searchCount(long companyId, JSONArray groupIds,
		JSONArray classNameIds, JSONArray classPKs, String keywords,
		String type, String mode) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupIds", groupIds);
			_params.put("classNameIds", classNameIds);
			_params.put("classPKs", classPKs);
			_params.put("keywords", keywords);
			_params.put("type", type);
			_params.put("mode", mode);

			_command.put("/ddmtemplate/search-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONObject updateTemplate(long templateId, long classPK,
		JSONObject nameMap, JSONObject descriptionMap, String type,
		String mode, String language, String script, boolean cacheable,
		boolean smallImage, String smallImageURL, JSONObject smallImageFile,
		JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("templateId", templateId);
			_params.put("classPK", classPK);
			_params.put("nameMap", nameMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("type", type);
			_params.put("mode", mode);
			_params.put("language", language);
			_params.put("script", script);
			_params.put("cacheable", cacheable);
			_params.put("smallImage", smallImage);
			_params.put("smallImageURL", smallImageURL);
			_params.put("smallImageFile", smallImageFile);
			_params.put("serviceContext", serviceContext);

			_command.put("/ddmtemplate/update-template", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}
}