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

package com.liferay.mobile.android.v72.layout;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class LayoutService extends BaseService {

	public LayoutService(Session session) {
		super(session);
	}

	public JSONObject addLayout(long groupId, boolean privateLayout, long parentLayoutId, JSONObject localeNamesMap, JSONObject localeTitlesMap, JSONObject descriptionMap, JSONObject keywordsMap, JSONObject robotsMap, String type, String typeSettings, boolean hidden, JSONObject friendlyURLMap, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("friendlyURLMap", checkNull(friendlyURLMap));
			_params.put("groupId", groupId);
			_params.put("hidden", hidden);
			_params.put("keywordsMap", checkNull(keywordsMap));
			_params.put("localeNamesMap", checkNull(localeNamesMap));
			_params.put("localeTitlesMap", checkNull(localeTitlesMap));
			_params.put("parentLayoutId", parentLayoutId);
			_params.put("privateLayout", privateLayout);
			_params.put("robotsMap", checkNull(robotsMap));
			_params.put("type", checkNull(type));
			_params.put("typeSettings", checkNull(typeSettings));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/layout/add-layout", _params);
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

	public JSONObject addLayout(long groupId, boolean privateLayout, long parentLayoutId, long classNameId, long classPK, JSONObject localeNamesMap, JSONObject localeTitlesMap, JSONObject descriptionMap, JSONObject keywordsMap, JSONObject robotsMap, String type, String typeSettings, boolean hidden, boolean system, JSONObject friendlyURLMap, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("classNameId", classNameId);
			_params.put("classPK", classPK);
			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("friendlyURLMap", checkNull(friendlyURLMap));
			_params.put("groupId", groupId);
			_params.put("hidden", hidden);
			_params.put("keywordsMap", checkNull(keywordsMap));
			_params.put("localeNamesMap", checkNull(localeNamesMap));
			_params.put("localeTitlesMap", checkNull(localeTitlesMap));
			_params.put("parentLayoutId", parentLayoutId);
			_params.put("privateLayout", privateLayout);
			_params.put("robotsMap", checkNull(robotsMap));
			_params.put("system", system);
			_params.put("type", checkNull(type));
			_params.put("typeSettings", checkNull(typeSettings));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/layout/add-layout", _params);
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

	public JSONObject addLayout(long groupId, boolean privateLayout, long parentLayoutId, String name, String title, String description, String type, boolean hidden, String friendlyURL, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("description", checkNull(description));
			_params.put("friendlyURL", checkNull(friendlyURL));
			_params.put("groupId", groupId);
			_params.put("hidden", hidden);
			_params.put("name", checkNull(name));
			_params.put("parentLayoutId", parentLayoutId);
			_params.put("privateLayout", privateLayout);
			_params.put("title", checkNull(title));
			_params.put("type", checkNull(type));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/layout/add-layout", _params);
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

	public void deleteLayout(long groupId, boolean privateLayout, long layoutId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("layoutId", layoutId);
			_params.put("privateLayout", privateLayout);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/layout/delete-layout", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void deleteLayout(long plid, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("plid", plid);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/layout/delete-layout", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void deleteTempFileEntry(long groupId, String folderName, String fileName) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fileName", checkNull(fileName));
			_params.put("folderName", checkNull(folderName));
			_params.put("groupId", groupId);

			_command.put("/layout/delete-temp-file-entry", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONArray getAncestorLayouts(long plid) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("plid", plid);

			_command.put("/layout/get-ancestor-layouts", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public Long getControlPanelLayoutPlid() throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_command.put("/layout/get-control-panel-layout-plid", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getLong(0);
	}

	public Long getDefaultPlid(long groupId, boolean privateLayout) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);

			_command.put("/layout/get-default-plid", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getLong(0);
	}

	public Long getDefaultPlid(long groupId, long scopeGroupId, boolean privateLayout, String portletId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("portletId", checkNull(portletId));
			_params.put("privateLayout", privateLayout);
			_params.put("scopeGroupId", scopeGroupId);

			_command.put("/layout/get-default-plid", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getLong(0);
	}

	public Long getDefaultPlid(long groupId, long scopeGroupId, String portletId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("portletId", checkNull(portletId));
			_params.put("scopeGroupId", scopeGroupId);

			_command.put("/layout/get-default-plid", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getLong(0);
	}

	public JSONObject getLayoutByUuidAndGroupId(String uuid, long groupId, boolean privateLayout) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("uuid", checkNull(uuid));

			_command.put("/layout/get-layout-by-uuid-and-group-id", _params);
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

	public String getLayoutName(long groupId, boolean privateLayout, long layoutId, String languageId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("languageId", checkNull(languageId));
			_params.put("layoutId", layoutId);
			_params.put("privateLayout", privateLayout);

			_command.put("/layout/get-layout-name", _params);
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

	public Long getLayoutPlid(String uuid, long groupId, boolean privateLayout) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("uuid", checkNull(uuid));

			_command.put("/layout/get-layout-plid", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getLong(0);
	}

	public JSONArray getLayoutReferences(long companyId, String portletId, String preferencesKey, String preferencesValue) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("portletId", checkNull(portletId));
			_params.put("preferencesKey", checkNull(preferencesKey));
			_params.put("preferencesValue", checkNull(preferencesValue));

			_command.put("/layout/get-layout-references", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getLayouts(long groupId, boolean privateLayout) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);

			_command.put("/layout/get-layouts", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getLayouts(long groupId, boolean privateLayout, long parentLayoutId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentLayoutId", parentLayoutId);
			_params.put("privateLayout", privateLayout);

			_command.put("/layout/get-layouts", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getLayouts(long groupId, boolean privateLayout, long parentLayoutId, boolean incomplete, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("incomplete", incomplete);
			_params.put("parentLayoutId", parentLayoutId);
			_params.put("privateLayout", privateLayout);
			_params.put("start", start);

			_command.put("/layout/get-layouts", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getLayouts(long groupId, String type) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("type", checkNull(type));

			_command.put("/layout/get-layouts", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public JSONArray getLayouts(long groupId, String type, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("type", checkNull(type));

			_command.put("/layout/get-layouts", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public Integer getLayoutsCount(long groupId, boolean privateLayout) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);

			_command.put("/layout/get-layouts-count", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public Integer getLayoutsCount(long groupId, boolean privateLayout, long parentLayoutId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentLayoutId", parentLayoutId);
			_params.put("privateLayout", privateLayout);

			_command.put("/layout/get-layouts-count", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public Integer getLayoutsCount(long groupId, boolean privateLayout, long parentLayoutId, int priority) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentLayoutId", parentLayoutId);
			_params.put("priority", priority);
			_params.put("privateLayout", privateLayout);

			_command.put("/layout/get-layouts-count", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public Integer getLayoutsCount(long groupId, String type) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("type", checkNull(type));

			_command.put("/layout/get-layouts-count", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getInt(0);
	}

	public JSONArray getTempFileNames(long groupId, String folderName) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderName", checkNull(folderName));
			_params.put("groupId", groupId);

			_command.put("/layout/get-temp-file-names", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getJSONArray(0);
	}

	public Boolean hasLayout(String uuid, long groupId, boolean privateLayout) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("uuid", checkNull(uuid));

			_command.put("/layout/has-layout", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getBoolean(0);
	}

	public Boolean hasPortletId(long plid, String portletId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("plid", plid);
			_params.put("portletId", checkNull(portletId));

			_command.put("/layout/has-portlet-id", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getBoolean(0);
	}

	public void schedulePublishToLive(long sourceGroupId, long targetGroupId, boolean privateLayout, JSONArray layoutIds, JSONObject parameterMap, String groupName, String cronText, long schedulerStartDate, long schedulerEndDate, String description) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cronText", checkNull(cronText));
			_params.put("description", checkNull(description));
			_params.put("groupName", checkNull(groupName));
			_params.put("layoutIds", checkNull(layoutIds));
			_params.put("parameterMap", checkNull(parameterMap));
			_params.put("privateLayout", privateLayout);
			_params.put("schedulerEndDate", schedulerEndDate);
			_params.put("schedulerStartDate", schedulerStartDate);
			_params.put("sourceGroupId", sourceGroupId);
			_params.put("targetGroupId", targetGroupId);

			_command.put("/layout/schedule-publish-to-live", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void schedulePublishToRemote(long sourceGroupId, boolean privateLayout, JSONObject layoutIdMap, JSONObject parameterMap, String remoteAddress, int remotePort, String remotePathContext, boolean secureConnection, long remoteGroupId, boolean remotePrivateLayout, long startDate, long endDate, String groupName, String cronText, long schedulerStartDate, long schedulerEndDate, String description) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("cronText", checkNull(cronText));
			_params.put("description", checkNull(description));
			_params.put("endDate", endDate);
			_params.put("groupName", checkNull(groupName));
			_params.put("layoutIdMap", checkNull(layoutIdMap));
			_params.put("parameterMap", checkNull(parameterMap));
			_params.put("privateLayout", privateLayout);
			_params.put("remoteAddress", checkNull(remoteAddress));
			_params.put("remoteGroupId", remoteGroupId);
			_params.put("remotePathContext", checkNull(remotePathContext));
			_params.put("remotePort", remotePort);
			_params.put("remotePrivateLayout", remotePrivateLayout);
			_params.put("schedulerEndDate", schedulerEndDate);
			_params.put("schedulerStartDate", schedulerStartDate);
			_params.put("secureConnection", secureConnection);
			_params.put("sourceGroupId", sourceGroupId);
			_params.put("startDate", startDate);

			_command.put("/layout/schedule-publish-to-remote", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void setLayouts(long groupId, boolean privateLayout, long parentLayoutId, JSONArray layoutIds, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("layoutIds", checkNull(layoutIds));
			_params.put("parentLayoutId", parentLayoutId);
			_params.put("privateLayout", privateLayout);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/layout/set-layouts", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void unschedulePublishToLive(long groupId, String jobName, String groupName) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("groupName", checkNull(groupName));
			_params.put("jobName", checkNull(jobName));

			_command.put("/layout/unschedule-publish-to-live", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void unschedulePublishToRemote(long groupId, String jobName, String groupName) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("groupName", checkNull(groupName));
			_params.put("jobName", checkNull(jobName));

			_command.put("/layout/unschedule-publish-to-remote", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject updateIconImage(long plid, byte[] bytes) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("bytes", toString(bytes));
			_params.put("plid", plid);

			_command.put("/layout/update-icon-image", _params);
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

	public JSONObject updateLayout(long groupId, boolean privateLayout, long layoutId, long parentLayoutId, JSONObject localeNamesMap, JSONObject localeTitlesMap, JSONObject descriptionMap, JSONObject keywordsMap, JSONObject robotsMap, String type, boolean hidden, JSONObject friendlyURLMap, boolean iconImage, byte[] iconBytes, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("descriptionMap", checkNull(descriptionMap));
			_params.put("friendlyURLMap", checkNull(friendlyURLMap));
			_params.put("groupId", groupId);
			_params.put("hidden", hidden);
			_params.put("iconBytes", toString(iconBytes));
			_params.put("iconImage", iconImage);
			_params.put("keywordsMap", checkNull(keywordsMap));
			_params.put("layoutId", layoutId);
			_params.put("localeNamesMap", checkNull(localeNamesMap));
			_params.put("localeTitlesMap", checkNull(localeTitlesMap));
			_params.put("parentLayoutId", parentLayoutId);
			_params.put("privateLayout", privateLayout);
			_params.put("robotsMap", checkNull(robotsMap));
			_params.put("type", checkNull(type));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/layout/update-layout", _params);
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

	public JSONObject updateLayout(long groupId, boolean privateLayout, long layoutId, String typeSettings) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("layoutId", layoutId);
			_params.put("privateLayout", privateLayout);
			_params.put("typeSettings", checkNull(typeSettings));

			_command.put("/layout/update-layout", _params);
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

	public JSONObject updateLookAndFeel(long groupId, boolean privateLayout, long layoutId, String themeId, String colorSchemeId, String css) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("colorSchemeId", checkNull(colorSchemeId));
			_params.put("css", checkNull(css));
			_params.put("groupId", groupId);
			_params.put("layoutId", layoutId);
			_params.put("privateLayout", privateLayout);
			_params.put("themeId", checkNull(themeId));

			_command.put("/layout/update-look-and-feel", _params);
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

	public JSONObject updateName(long groupId, boolean privateLayout, long layoutId, String name, String languageId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("languageId", checkNull(languageId));
			_params.put("layoutId", layoutId);
			_params.put("name", checkNull(name));
			_params.put("privateLayout", privateLayout);

			_command.put("/layout/update-name", _params);
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

	public JSONObject updateName(long plid, String name, String languageId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("languageId", checkNull(languageId));
			_params.put("name", checkNull(name));
			_params.put("plid", plid);

			_command.put("/layout/update-name", _params);
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

	public JSONObject updateParentLayoutId(long groupId, boolean privateLayout, long layoutId, long parentLayoutId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("layoutId", layoutId);
			_params.put("parentLayoutId", parentLayoutId);
			_params.put("privateLayout", privateLayout);

			_command.put("/layout/update-parent-layout-id", _params);
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

	public JSONObject updateParentLayoutId(long plid, long parentPlid) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("parentPlid", parentPlid);
			_params.put("plid", plid);

			_command.put("/layout/update-parent-layout-id", _params);
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

	public JSONObject updateParentLayoutIdAndPriority(long plid, long parentPlid, int priority) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("parentPlid", parentPlid);
			_params.put("plid", plid);
			_params.put("priority", priority);

			_command.put("/layout/update-parent-layout-id-and-priority", _params);
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

	public JSONObject updatePriority(long groupId, boolean privateLayout, long layoutId, int priority) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("layoutId", layoutId);
			_params.put("priority", priority);
			_params.put("privateLayout", privateLayout);

			_command.put("/layout/update-priority", _params);
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

	public JSONObject updatePriority(long groupId, boolean privateLayout, long layoutId, long nextLayoutId, long previousLayoutId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("layoutId", layoutId);
			_params.put("nextLayoutId", nextLayoutId);
			_params.put("previousLayoutId", previousLayoutId);
			_params.put("privateLayout", privateLayout);

			_command.put("/layout/update-priority", _params);
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

	public JSONObject updatePriority(long plid, int priority) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("plid", plid);
			_params.put("priority", priority);

			_command.put("/layout/update-priority", _params);
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