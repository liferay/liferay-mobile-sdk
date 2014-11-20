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

package com.liferay.mobile.android.v62.layout;

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

	public JSONObject addLayout(long groupId, boolean privateLayout, long parentLayoutId, String name, String title, String description, String type, boolean hidden, String friendlyURL, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("parentLayoutId", parentLayoutId);
			_params.put("name", name);
			_params.put("title", title);
			_params.put("description", description);
			_params.put("type", type);
			_params.put("hidden", hidden);
			_params.put("friendlyURL", friendlyURL);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/layout/add-layout", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject addLayout(long groupId, boolean privateLayout, long parentLayoutId, JSONObject localeNamesMap, JSONObject localeTitlesMap, JSONObject descriptionMap, JSONObject keywordsMap, JSONObject robotsMap, String type, boolean hidden, String friendlyURL, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("parentLayoutId", parentLayoutId);
			_params.put("localeNamesMap", localeNamesMap);
			_params.put("localeTitlesMap", localeTitlesMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("keywordsMap", keywordsMap);
			_params.put("robotsMap", robotsMap);
			_params.put("type", type);
			_params.put("hidden", hidden);
			_params.put("friendlyURL", friendlyURL);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/layout/add-layout", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject addLayout(long groupId, boolean privateLayout, long parentLayoutId, JSONObject localeNamesMap, JSONObject localeTitlesMap, JSONObject descriptionMap, JSONObject keywordsMap, JSONObject robotsMap, String type, String typeSettings, boolean hidden, JSONObject friendlyURLMap, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("parentLayoutId", parentLayoutId);
			_params.put("localeNamesMap", localeNamesMap);
			_params.put("localeTitlesMap", localeTitlesMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("keywordsMap", keywordsMap);
			_params.put("robotsMap", robotsMap);
			_params.put("type", type);
			_params.put("typeSettings", typeSettings);
			_params.put("hidden", hidden);
			_params.put("friendlyURLMap", friendlyURLMap);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/layout/add-layout", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void deleteLayout(long plid, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("plid", plid);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/layout/delete-layout", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void deleteLayout(long groupId, boolean privateLayout, long layoutId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("layoutId", layoutId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/layout/delete-layout", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void deleteTempFileEntry(long groupId, String fileName, String tempFolderName) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("fileName", fileName);
			_params.put("tempFolderName", tempFolderName);

			_command.put("/layout/delete-temp-file-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONArray exportLayouts(long groupId, boolean privateLayout, JSONObject parameterMap, long startDate, long endDate) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("parameterMap", parameterMap);
			_params.put("startDate", startDate);
			_params.put("endDate", endDate);

			_command.put("/layout/export-layouts", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray exportLayouts(long groupId, boolean privateLayout, JSONArray layoutIds, JSONObject parameterMap, long startDate, long endDate) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("layoutIds", layoutIds);
			_params.put("parameterMap", parameterMap);
			_params.put("startDate", startDate);
			_params.put("endDate", endDate);

			_command.put("/layout/export-layouts", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONObject exportLayoutsAsFile(long groupId, boolean privateLayout, JSONArray layoutIds, JSONObject parameterMap, long startDate, long endDate) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("layoutIds", layoutIds);
			_params.put("parameterMap", parameterMap);
			_params.put("startDate", startDate);
			_params.put("endDate", endDate);

			_command.put("/layout/export-layouts-as-file", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public Long exportLayoutsAsFileInBackground(String taskName, long groupId, boolean privateLayout, JSONArray layoutIds, JSONObject parameterMap, long startDate, long endDate, String fileName) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("taskName", taskName);
			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("layoutIds", layoutIds);
			_params.put("parameterMap", parameterMap);
			_params.put("startDate", startDate);
			_params.put("endDate", endDate);
			_params.put("fileName", fileName);

			_command.put("/layout/export-layouts-as-file-in-background", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Long)session.invoke(_command);
	}

	public JSONArray exportPortletInfo(long companyId, String portletId, JSONObject parameterMap, long startDate, long endDate) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("portletId", portletId);
			_params.put("parameterMap", parameterMap);
			_params.put("startDate", startDate);
			_params.put("endDate", endDate);

			_command.put("/layout/export-portlet-info", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray exportPortletInfo(long plid, long groupId, String portletId, JSONObject parameterMap, long startDate, long endDate) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("plid", plid);
			_params.put("groupId", groupId);
			_params.put("portletId", portletId);
			_params.put("parameterMap", parameterMap);
			_params.put("startDate", startDate);
			_params.put("endDate", endDate);

			_command.put("/layout/export-portlet-info", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONObject exportPortletInfoAsFile(String portletId, JSONObject parameterMap, long startDate, long endDate) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("portletId", portletId);
			_params.put("parameterMap", parameterMap);
			_params.put("startDate", startDate);
			_params.put("endDate", endDate);

			_command.put("/layout/export-portlet-info-as-file", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject exportPortletInfoAsFile(long plid, long groupId, String portletId, JSONObject parameterMap, long startDate, long endDate) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("plid", plid);
			_params.put("groupId", groupId);
			_params.put("portletId", portletId);
			_params.put("parameterMap", parameterMap);
			_params.put("startDate", startDate);
			_params.put("endDate", endDate);

			_command.put("/layout/export-portlet-info-as-file", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public Long exportPortletInfoAsFileInBackground(String taskName, String portletId, JSONObject parameterMap, long startDate, long endDate, String fileName) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("taskName", taskName);
			_params.put("portletId", portletId);
			_params.put("parameterMap", parameterMap);
			_params.put("startDate", startDate);
			_params.put("endDate", endDate);
			_params.put("fileName", fileName);

			_command.put("/layout/export-portlet-info-as-file-in-background", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Long)session.invoke(_command);
	}

	public Long exportPortletInfoAsFileInBackground(String taskName, long plid, long groupId, String portletId, JSONObject parameterMap, long startDate, long endDate, String fileName) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("taskName", taskName);
			_params.put("plid", plid);
			_params.put("groupId", groupId);
			_params.put("portletId", portletId);
			_params.put("parameterMap", parameterMap);
			_params.put("startDate", startDate);
			_params.put("endDate", endDate);
			_params.put("fileName", fileName);

			_command.put("/layout/export-portlet-info-as-file-in-background", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Long)session.invoke(_command);
	}

	public JSONArray getAncestorLayouts(long plid) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("plid", plid);

			_command.put("/layout/get-ancestor-layouts", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Long getDefaultPlid(long groupId, long scopeGroupId, String portletId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("scopeGroupId", scopeGroupId);
			_params.put("portletId", portletId);

			_command.put("/layout/get-default-plid", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Long)session.invoke(_command);
	}

	public Long getDefaultPlid(long groupId, long scopeGroupId, boolean privateLayout, String portletId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("scopeGroupId", scopeGroupId);
			_params.put("privateLayout", privateLayout);
			_params.put("portletId", portletId);

			_command.put("/layout/get-default-plid", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Long)session.invoke(_command);
	}

	public JSONObject getLayoutByUuidAndGroupId(String uuid, long groupId, boolean privateLayout) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("uuid", uuid);
			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);

			_command.put("/layout/get-layout-by-uuid-and-group-id", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public String getLayoutName(long groupId, boolean privateLayout, long layoutId, String languageId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("layoutId", layoutId);
			_params.put("languageId", languageId);

			_command.put("/layout/get-layout-name", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (String)session.invoke(_command);
	}

	public JSONArray getLayoutReferences(long companyId, String portletId, String preferencesKey, String preferencesValue) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("portletId", portletId);
			_params.put("preferencesKey", preferencesKey);
			_params.put("preferencesValue", preferencesValue);

			_command.put("/layout/get-layout-references", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getLayouts(long groupId, boolean privateLayout) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);

			_command.put("/layout/get-layouts", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getLayouts(long groupId, boolean privateLayout, long parentLayoutId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("parentLayoutId", parentLayoutId);

			_command.put("/layout/get-layouts", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getLayouts(long groupId, boolean privateLayout, long parentLayoutId, boolean incomplete, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("parentLayoutId", parentLayoutId);
			_params.put("incomplete", incomplete);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/layout/get-layouts", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer getLayoutsCount(long groupId, boolean privateLayout, long parentLayoutId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("parentLayoutId", parentLayoutId);

			_command.put("/layout/get-layouts-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONArray getTempFileEntryNames(long groupId, String tempFolderName) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("tempFolderName", tempFolderName);

			_command.put("/layout/get-temp-file-entry-names", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public void importLayouts(long groupId, boolean privateLayout, JSONObject parameterMap, byte[] bytes) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("parameterMap", parameterMap);
			_params.put("bytes", toString(bytes));

			_command.put("/layout/import-layouts", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void importLayouts(long groupId, boolean privateLayout, JSONObject parameterMap, org.apache.http.entity.mime.content.InputStreamBody file) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("parameterMap", parameterMap);
			_params.put("file", file);

			_command.put("/layout/import-layouts", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.upload(_command);
	}

	public Long importLayoutsInBackground(String taskName, long groupId, boolean privateLayout, JSONObject parameterMap, org.apache.http.entity.mime.content.InputStreamBody file) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("taskName", taskName);
			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("parameterMap", parameterMap);
			_params.put("file", file);

			_command.put("/layout/import-layouts-in-background", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Long)session.upload(_command);
	}

	public void importPortletInfo(String portletId, JSONObject parameterMap, org.apache.http.entity.mime.content.InputStreamBody file) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("portletId", portletId);
			_params.put("parameterMap", parameterMap);
			_params.put("file", file);

			_command.put("/layout/import-portlet-info", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.upload(_command);
	}

	public void importPortletInfo(long plid, long groupId, String portletId, JSONObject parameterMap, org.apache.http.entity.mime.content.InputStreamBody file) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("plid", plid);
			_params.put("groupId", groupId);
			_params.put("portletId", portletId);
			_params.put("parameterMap", parameterMap);
			_params.put("file", file);

			_command.put("/layout/import-portlet-info", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.upload(_command);
	}

	public void importPortletInfoInBackground(String taskName, String portletId, JSONObject parameterMap, org.apache.http.entity.mime.content.InputStreamBody file) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("taskName", taskName);
			_params.put("portletId", portletId);
			_params.put("parameterMap", parameterMap);
			_params.put("file", file);

			_command.put("/layout/import-portlet-info-in-background", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.upload(_command);
	}

	public Long importPortletInfoInBackground(String taskName, long plid, long groupId, String portletId, JSONObject parameterMap, org.apache.http.entity.mime.content.InputStreamBody file) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("taskName", taskName);
			_params.put("plid", plid);
			_params.put("groupId", groupId);
			_params.put("portletId", portletId);
			_params.put("parameterMap", parameterMap);
			_params.put("file", file);

			_command.put("/layout/import-portlet-info-in-background", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Long)session.upload(_command);
	}

	public void schedulePublishToLive(long sourceGroupId, long targetGroupId, boolean privateLayout, JSONObject layoutIdMap, JSONObject parameterMap, String scope, long startDate, long endDate, String groupName, String cronText, long schedulerStartDate, long schedulerEndDate, String description) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("sourceGroupId", sourceGroupId);
			_params.put("targetGroupId", targetGroupId);
			_params.put("privateLayout", privateLayout);
			_params.put("layoutIdMap", layoutIdMap);
			_params.put("parameterMap", parameterMap);
			_params.put("scope", scope);
			_params.put("startDate", startDate);
			_params.put("endDate", endDate);
			_params.put("groupName", groupName);
			_params.put("cronText", cronText);
			_params.put("schedulerStartDate", schedulerStartDate);
			_params.put("schedulerEndDate", schedulerEndDate);
			_params.put("description", description);

			_command.put("/layout/schedule-publish-to-live", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void schedulePublishToRemote(long sourceGroupId, boolean privateLayout, JSONObject layoutIdMap, JSONObject parameterMap, String remoteAddress, int remotePort, String remotePathContext, boolean secureConnection, long remoteGroupId, boolean remotePrivateLayout, long startDate, long endDate, String groupName, String cronText, long schedulerStartDate, long schedulerEndDate, String description) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("sourceGroupId", sourceGroupId);
			_params.put("privateLayout", privateLayout);
			_params.put("layoutIdMap", layoutIdMap);
			_params.put("parameterMap", parameterMap);
			_params.put("remoteAddress", remoteAddress);
			_params.put("remotePort", remotePort);
			_params.put("remotePathContext", remotePathContext);
			_params.put("secureConnection", secureConnection);
			_params.put("remoteGroupId", remoteGroupId);
			_params.put("remotePrivateLayout", remotePrivateLayout);
			_params.put("startDate", startDate);
			_params.put("endDate", endDate);
			_params.put("groupName", groupName);
			_params.put("cronText", cronText);
			_params.put("schedulerStartDate", schedulerStartDate);
			_params.put("schedulerEndDate", schedulerEndDate);
			_params.put("description", description);

			_command.put("/layout/schedule-publish-to-remote", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void setLayouts(long groupId, boolean privateLayout, long parentLayoutId, JSONArray layoutIds, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("parentLayoutId", parentLayoutId);
			_params.put("layoutIds", layoutIds);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/layout/set-layouts", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void unschedulePublishToLive(long groupId, String jobName, String groupName) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("jobName", jobName);
			_params.put("groupName", groupName);

			_command.put("/layout/unschedule-publish-to-live", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void unschedulePublishToRemote(long groupId, String jobName, String groupName) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("jobName", jobName);
			_params.put("groupName", groupName);

			_command.put("/layout/unschedule-publish-to-remote", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject updateLayout(long groupId, boolean privateLayout, long layoutId, long parentLayoutId, JSONObject localeNamesMap, JSONObject localeTitlesMap, JSONObject descriptionMap, JSONObject keywordsMap, JSONObject robotsMap, String type, boolean hidden, String friendlyURL, JSONObjectWrapper iconImage, byte[] iconBytes, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("layoutId", layoutId);
			_params.put("parentLayoutId", parentLayoutId);
			_params.put("localeNamesMap", localeNamesMap);
			_params.put("localeTitlesMap", localeTitlesMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("keywordsMap", keywordsMap);
			_params.put("robotsMap", robotsMap);
			_params.put("type", type);
			_params.put("hidden", hidden);
			_params.put("friendlyURL", friendlyURL);
			mangleWrapper(_params, "iconImage", "java.lang.Boolean", iconImage);
			_params.put("iconBytes", toString(iconBytes));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/layout/update-layout", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updateLayout(long groupId, boolean privateLayout, long layoutId, long parentLayoutId, JSONObject localeNamesMap, JSONObject localeTitlesMap, JSONObject descriptionMap, JSONObject keywordsMap, JSONObject robotsMap, String type, boolean hidden, JSONObject friendlyURLMap, JSONObjectWrapper iconImage, byte[] iconBytes, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("layoutId", layoutId);
			_params.put("parentLayoutId", parentLayoutId);
			_params.put("localeNamesMap", localeNamesMap);
			_params.put("localeTitlesMap", localeTitlesMap);
			_params.put("descriptionMap", descriptionMap);
			_params.put("keywordsMap", keywordsMap);
			_params.put("robotsMap", robotsMap);
			_params.put("type", type);
			_params.put("hidden", hidden);
			_params.put("friendlyURLMap", friendlyURLMap);
			mangleWrapper(_params, "iconImage", "java.lang.Boolean", iconImage);
			_params.put("iconBytes", toString(iconBytes));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/layout/update-layout", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updateLayout(long groupId, boolean privateLayout, long layoutId, String typeSettings) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("layoutId", layoutId);
			_params.put("typeSettings", typeSettings);

			_command.put("/layout/update-layout", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updateLookAndFeel(long groupId, boolean privateLayout, long layoutId, String themeId, String colorSchemeId, String css, boolean wapTheme) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("layoutId", layoutId);
			_params.put("themeId", themeId);
			_params.put("colorSchemeId", colorSchemeId);
			_params.put("css", css);
			_params.put("wapTheme", wapTheme);

			_command.put("/layout/update-look-and-feel", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updateName(long plid, String name, String languageId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("plid", plid);
			_params.put("name", name);
			_params.put("languageId", languageId);

			_command.put("/layout/update-name", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updateName(long groupId, boolean privateLayout, long layoutId, String name, String languageId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("layoutId", layoutId);
			_params.put("name", name);
			_params.put("languageId", languageId);

			_command.put("/layout/update-name", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updateParentLayoutId(long plid, long parentPlid) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("plid", plid);
			_params.put("parentPlid", parentPlid);

			_command.put("/layout/update-parent-layout-id", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updateParentLayoutId(long groupId, boolean privateLayout, long layoutId, long parentLayoutId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("layoutId", layoutId);
			_params.put("parentLayoutId", parentLayoutId);

			_command.put("/layout/update-parent-layout-id", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updateParentLayoutIdAndPriority(long plid, long parentPlid, int priority) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("plid", plid);
			_params.put("parentPlid", parentPlid);
			_params.put("priority", priority);

			_command.put("/layout/update-parent-layout-id-and-priority", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updatePriority(long plid, int priority) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("plid", plid);
			_params.put("priority", priority);

			_command.put("/layout/update-priority", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updatePriority(long groupId, boolean privateLayout, long layoutId, int priority) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("layoutId", layoutId);
			_params.put("priority", priority);

			_command.put("/layout/update-priority", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject updatePriority(long groupId, boolean privateLayout, long layoutId, long nextLayoutId, long previousLayoutId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("layoutId", layoutId);
			_params.put("nextLayoutId", nextLayoutId);
			_params.put("previousLayoutId", previousLayoutId);

			_command.put("/layout/update-priority", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject validateImportLayoutsFile(long groupId, boolean privateLayout, JSONObject parameterMap, org.apache.http.entity.mime.content.InputStreamBody file) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("privateLayout", privateLayout);
			_params.put("parameterMap", parameterMap);
			_params.put("file", file);

			_command.put("/layout/validate-import-layouts-file", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.upload(_command);
	}

	public JSONObject validateImportPortletInfo(long plid, long groupId, String portletId, JSONObject parameterMap, org.apache.http.entity.mime.content.InputStreamBody file) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("plid", plid);
			_params.put("groupId", groupId);
			_params.put("portletId", portletId);
			_params.put("parameterMap", parameterMap);
			_params.put("file", file);

			_command.put("/layout/validate-import-portlet-info", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.upload(_command);
	}

}