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

package com.liferay.mobile.android.v62.journaltemplate;

import com.liferay.mobile.android.http.file.UploadData;
import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class JournalTemplateService extends BaseService {

	public JournalTemplateService(Session session) {
		super(session);
	}

	public JSONObject addTemplate(long groupId, String templateId, boolean autoTemplateId, String structureId, JSONObject nameMap, JSONObject descriptionMap, String xsl, boolean formatXsl, String langType, boolean cacheable, boolean smallImage, String smallImageURL, UploadData smallFile, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("templateId", checkNull(templateId));
			_params.put("autoTemplateId", autoTemplateId);
			_params.put("structureId", checkNull(structureId));
			_params.put("nameMap", checkNull(nameMap));
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("xsl", checkNull(xsl));
			_params.put("formatXsl", formatXsl);
			_params.put("langType", checkNull(langType));
			_params.put("cacheable", cacheable);
			_params.put("smallImage", smallImage);
			_params.put("smallImageURL", checkNull(smallImageURL));
			_params.put("smallFile", checkNull(smallFile));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/journaltemplate/add-template", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.upload(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject addTemplate(long groupId, String templateId, boolean autoTemplateId, String structureId, JSONObject nameMap, JSONObject descriptionMap, String xsl, boolean formatXsl, String langType, boolean cacheable, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("templateId", checkNull(templateId));
			_params.put("autoTemplateId", autoTemplateId);
			_params.put("structureId", checkNull(structureId));
			_params.put("nameMap", checkNull(nameMap));
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("xsl", checkNull(xsl));
			_params.put("formatXsl", formatXsl);
			_params.put("langType", checkNull(langType));
			_params.put("cacheable", cacheable);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/journaltemplate/add-template", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject copyTemplate(long groupId, String oldTemplateId, String newTemplateId, boolean autoTemplateId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("oldTemplateId", checkNull(oldTemplateId));
			_params.put("newTemplateId", checkNull(newTemplateId));
			_params.put("autoTemplateId", autoTemplateId);

			_command.put("/journaltemplate/copy-template", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public void deleteTemplate(long groupId, String templateId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("templateId", checkNull(templateId));

			_command.put("/journaltemplate/delete-template", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONArray getStructureTemplates(long groupId, String structureId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("structureId", checkNull(structureId));

			_command.put("/journaltemplate/get-structure-templates", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONObject getTemplate(long groupId, String templateId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("templateId", checkNull(templateId));

			_command.put("/journaltemplate/get-template", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject getTemplate(long groupId, String templateId, boolean includeGlobalTemplates) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("templateId", checkNull(templateId));
			_params.put("includeGlobalTemplates", includeGlobalTemplates);

			_command.put("/journaltemplate/get-template", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONArray search(long companyId, JSONArray groupIds, String keywords, String structureId, String structureIdComparator, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupIds", checkNull(groupIds));
			_params.put("keywords", checkNull(keywords));
			_params.put("structureId", checkNull(structureId));
			_params.put("structureIdComparator", checkNull(structureIdComparator));
			_params.put("start", start);
			_params.put("end", end);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator", obc);

			_command.put("/journaltemplate/search", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray search(long companyId, JSONArray groupIds, String templateId, String structureId, String structureIdComparator, String name, String description, boolean andOperator, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupIds", checkNull(groupIds));
			_params.put("templateId", checkNull(templateId));
			_params.put("structureId", checkNull(structureId));
			_params.put("structureIdComparator", checkNull(structureIdComparator));
			_params.put("name", checkNull(name));
			_params.put("description", checkNull(description));
			_params.put("andOperator", andOperator);
			_params.put("start", start);
			_params.put("end", end);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator", obc);

			_command.put("/journaltemplate/search", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public Integer searchCount(long companyId, JSONArray groupIds, String keywords, String structureId, String structureIdComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupIds", checkNull(groupIds));
			_params.put("keywords", checkNull(keywords));
			_params.put("structureId", checkNull(structureId));
			_params.put("structureIdComparator", checkNull(structureIdComparator));

			_command.put("/journaltemplate/search-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public Integer searchCount(long companyId, JSONArray groupIds, String templateId, String structureId, String structureIdComparator, String name, String description, boolean andOperator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("groupIds", checkNull(groupIds));
			_params.put("templateId", checkNull(templateId));
			_params.put("structureId", checkNull(structureId));
			_params.put("structureIdComparator", checkNull(structureIdComparator));
			_params.put("name", checkNull(name));
			_params.put("description", checkNull(description));
			_params.put("andOperator", andOperator);

			_command.put("/journaltemplate/search-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public JSONObject updateTemplate(long groupId, String templateId, String structureId, JSONObject nameMap, JSONObject descriptionMap, String xsl, boolean formatXsl, String langType, boolean cacheable, boolean smallImage, String smallImageURL, UploadData smallFile, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("templateId", checkNull(templateId));
			_params.put("structureId", checkNull(structureId));
			_params.put("nameMap", checkNull(nameMap));
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("xsl", checkNull(xsl));
			_params.put("formatXsl", formatXsl);
			_params.put("langType", checkNull(langType));
			_params.put("cacheable", cacheable);
			_params.put("smallImage", smallImage);
			_params.put("smallImageURL", checkNull(smallImageURL));
			_params.put("smallFile", checkNull(smallFile));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/journaltemplate/update-template", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.upload(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

	public JSONObject updateTemplate(long groupId, String templateId, String structureId, JSONObject nameMap, JSONObject descriptionMap, String xsl, boolean formatXsl, String langType, boolean cacheable, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("templateId", checkNull(templateId));
			_params.put("structureId", checkNull(structureId));
			_params.put("nameMap", checkNull(nameMap));
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("xsl", checkNull(xsl));
			_params.put("formatXsl", formatXsl);
			_params.put("langType", checkNull(langType));
			_params.put("cacheable", cacheable);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/journaltemplate/update-template", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONObject(0);
	}

}