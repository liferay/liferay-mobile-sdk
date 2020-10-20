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

package com.liferay.mobile.android.v73.cpdefinitionvirtualsetting;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class CpdefinitionvirtualsettingService extends BaseService {

	public CpdefinitionvirtualsettingService(Session session) {
		super(session);
	}

	public JSONObject addCpDefinitionVirtualSetting(String className, long classPK, long fileEntryId, String url, int activationStatus, long duration, int maxUsages, boolean useSample, long sampleFileEntryId, String sampleUrl, boolean termsOfUseRequired, JSONObject termsOfUseContentMap, long termsOfUseJournalArticleResourcePrimKey, boolean override, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("activationStatus", activationStatus);
			_params.put("className", checkNull(className));
			_params.put("classPK", classPK);
			_params.put("duration", duration);
			_params.put("fileEntryId", fileEntryId);
			_params.put("maxUsages", maxUsages);
			_params.put("override", override);
			_params.put("sampleFileEntryId", sampleFileEntryId);
			_params.put("sampleUrl", checkNull(sampleUrl));
			_params.put("termsOfUseContentMap", checkNull(termsOfUseContentMap));
			_params.put("termsOfUseJournalArticleResourcePrimKey", termsOfUseJournalArticleResourcePrimKey);
			_params.put("termsOfUseRequired", termsOfUseRequired);
			_params.put("url", checkNull(url));
			_params.put("useSample", useSample);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinitionvirtualsetting/add-cp-definition-virtual-setting", _params);
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

	public JSONObject addCpDefinitionVirtualSetting(String className, long classPK, long fileEntryId, String url, int activationStatus, long duration, int maxUsages, boolean useSample, long sampleFileEntryId, String sampleUrl, boolean termsOfUseRequired, JSONObject termsOfUseContentMap, long termsOfUseJournalArticleResourcePrimKey, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("activationStatus", activationStatus);
			_params.put("className", checkNull(className));
			_params.put("classPK", classPK);
			_params.put("duration", duration);
			_params.put("fileEntryId", fileEntryId);
			_params.put("maxUsages", maxUsages);
			_params.put("sampleFileEntryId", sampleFileEntryId);
			_params.put("sampleUrl", checkNull(sampleUrl));
			_params.put("termsOfUseContentMap", checkNull(termsOfUseContentMap));
			_params.put("termsOfUseJournalArticleResourcePrimKey", termsOfUseJournalArticleResourcePrimKey);
			_params.put("termsOfUseRequired", termsOfUseRequired);
			_params.put("url", checkNull(url));
			_params.put("useSample", useSample);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinitionvirtualsetting/add-cp-definition-virtual-setting", _params);
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

	public JSONObject fetchCpDefinitionVirtualSetting(String className, long classPK) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("className", checkNull(className));
			_params.put("classPK", classPK);

			_command.put("/commerce.cpdefinitionvirtualsetting/fetch-cp-definition-virtual-setting", _params);
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

	public JSONObject updateCpDefinitionVirtualSetting(long cpDefinitionVirtualSettingId, long fileEntryId, String url, int activationStatus, long duration, int maxUsages, boolean useSample, long sampleFileEntryId, String sampleUrl, boolean termsOfUseRequired, JSONObject termsOfUseContentMap, long termsOfUseJournalArticleResourcePrimKey, boolean override, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("activationStatus", activationStatus);
			_params.put("cpDefinitionVirtualSettingId", cpDefinitionVirtualSettingId);
			_params.put("duration", duration);
			_params.put("fileEntryId", fileEntryId);
			_params.put("maxUsages", maxUsages);
			_params.put("override", override);
			_params.put("sampleFileEntryId", sampleFileEntryId);
			_params.put("sampleUrl", checkNull(sampleUrl));
			_params.put("termsOfUseContentMap", checkNull(termsOfUseContentMap));
			_params.put("termsOfUseJournalArticleResourcePrimKey", termsOfUseJournalArticleResourcePrimKey);
			_params.put("termsOfUseRequired", termsOfUseRequired);
			_params.put("url", checkNull(url));
			_params.put("useSample", useSample);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinitionvirtualsetting/update-cp-definition-virtual-setting", _params);
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

	public JSONObject updateCpDefinitionVirtualSetting(long cpDefinitionVirtualSettingId, long fileEntryId, String url, int activationStatus, long duration, int maxUsages, boolean useSample, long sampleFileEntryId, String sampleUrl, boolean termsOfUseRequired, JSONObject termsOfUseContentMap, long termsOfUseJournalArticleResourcePrimKey, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("activationStatus", activationStatus);
			_params.put("cpDefinitionVirtualSettingId", cpDefinitionVirtualSettingId);
			_params.put("duration", duration);
			_params.put("fileEntryId", fileEntryId);
			_params.put("maxUsages", maxUsages);
			_params.put("sampleFileEntryId", sampleFileEntryId);
			_params.put("sampleUrl", checkNull(sampleUrl));
			_params.put("termsOfUseContentMap", checkNull(termsOfUseContentMap));
			_params.put("termsOfUseJournalArticleResourcePrimKey", termsOfUseJournalArticleResourcePrimKey);
			_params.put("termsOfUseRequired", termsOfUseRequired);
			_params.put("url", checkNull(url));
			_params.put("useSample", useSample);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/commerce.cpdefinitionvirtualsetting/update-cp-definition-virtual-setting", _params);
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