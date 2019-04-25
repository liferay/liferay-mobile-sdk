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

package com.liferay.mobile.android.v72.kbarticle;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class KbarticleService extends BaseService {

	public KbarticleService(Session session) {
		super(session);
	}

	public JSONObject addKbArticle(String portletId, long parentResourceClassNameId, long parentResourcePrimKey, String title, String urlTitle, String content, String description, String sourceURL, JSONArray sections, JSONArray selectedFileNames, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("content", checkNull(content));
			_params.put("description", checkNull(description));
			_params.put("parentResourceClassNameId", parentResourceClassNameId);
			_params.put("parentResourcePrimKey", parentResourcePrimKey);
			_params.put("portletId", checkNull(portletId));
			_params.put("sections", checkNull(sections));
			_params.put("selectedFileNames", checkNull(selectedFileNames));
			_params.put("sourceURL", checkNull(sourceURL));
			_params.put("title", checkNull(title));
			_params.put("urlTitle", checkNull(urlTitle));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/kb.kbarticle/add-kb-article", _params);
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

	public JSONObject deleteKbArticle(long resourcePrimKey) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("resourcePrimKey", resourcePrimKey);

			_command.put("/kb.kbarticle/delete-kb-article", _params);
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

	public void deleteKbArticles(long groupId, JSONArray resourcePrimKeys) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("resourcePrimKeys", checkNull(resourcePrimKeys));

			_command.put("/kb.kbarticle/delete-kb-articles", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void deleteTempAttachment(long groupId, long resourcePrimKey, String fileName, String tempFolderName) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fileName", checkNull(fileName));
			_params.put("groupId", groupId);
			_params.put("resourcePrimKey", resourcePrimKey);
			_params.put("tempFolderName", checkNull(tempFolderName));

			_command.put("/kb.kbarticle/delete-temp-attachment", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject fetchFirstChildKbArticle(long groupId, long parentResourcePrimKey) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentResourcePrimKey", parentResourcePrimKey);

			_command.put("/kb.kbarticle/fetch-first-child-kb-article", _params);
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

	public JSONObject fetchFirstChildKbArticle(long groupId, long parentResourcePrimKey, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentResourcePrimKey", parentResourcePrimKey);
			_params.put("status", status);

			_command.put("/kb.kbarticle/fetch-first-child-kb-article", _params);
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

	public JSONObject fetchKbArticleByUrlTitle(long groupId, long kbFolderId, String urlTitle) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("kbFolderId", kbFolderId);
			_params.put("urlTitle", checkNull(urlTitle));

			_command.put("/kb.kbarticle/fetch-kb-article-by-url-title", _params);
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

	public JSONObject fetchLatestKbArticle(long resourcePrimKey, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("resourcePrimKey", resourcePrimKey);
			_params.put("status", status);

			_command.put("/kb.kbarticle/fetch-latest-kb-article", _params);
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

	public JSONObject fetchLatestKbArticleByUrlTitle(long groupId, long kbFolderId, String urlTitle, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("kbFolderId", kbFolderId);
			_params.put("status", status);
			_params.put("urlTitle", checkNull(urlTitle));

			_command.put("/kb.kbarticle/fetch-latest-kb-article-by-url-title", _params);
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

	public JSONArray getAllDescendantKbArticles(long resourcePrimKey, int status, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("resourcePrimKey", resourcePrimKey);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBArticle>", orderByComparator);

			_command.put("/kb.kbarticle/get-all-descendant-kb-articles", _params);
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

	public JSONArray getAllDescendantKbArticles(long groupId, long resourcePrimKey, int status, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("resourcePrimKey", resourcePrimKey);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBArticle>", orderByComparator);

			_command.put("/kb.kbarticle/get-all-descendant-kb-articles", _params);
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

	public JSONArray getGroupKbArticles(long groupId, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBArticle>", orderByComparator);

			_command.put("/kb.kbarticle/get-group-kb-articles", _params);
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

	public Integer getGroupKbArticlesCount(long groupId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("status", status);

			_command.put("/kb.kbarticle/get-group-kb-articles-count", _params);
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

	public String getGroupKbArticlesRss(int status, int rssDelta, String rssDisplayStyle, String rssFormat, JSONObjectWrapper themeDisplay) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("rssDelta", rssDelta);
			_params.put("rssDisplayStyle", checkNull(rssDisplayStyle));
			_params.put("rssFormat", checkNull(rssFormat));
			_params.put("status", status);
			mangleWrapper(_params, "themeDisplay", "com.liferay.portal.kernel.theme.ThemeDisplay", themeDisplay);

			_command.put("/kb.kbarticle/get-group-kb-articles-rss", _params);
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

	public JSONObject getKbArticle(long resourcePrimKey, int version) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("resourcePrimKey", resourcePrimKey);
			_params.put("version", version);

			_command.put("/kb.kbarticle/get-kb-article", _params);
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

	public JSONArray getKbArticleAndAllDescendantKbArticles(long resourcePrimKey, int status, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("resourcePrimKey", resourcePrimKey);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBArticle>", orderByComparator);

			_command.put("/kb.kbarticle/get-kb-article-and-all-descendant-kb-articles", _params);
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

	public JSONArray getKbArticleAndAllDescendants(long groupId, long resourcePrimKey, int status, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("resourcePrimKey", resourcePrimKey);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBArticle>", orderByComparator);

			_command.put("/kb.kbarticle/get-kb-article-and-all-descendants", _params);
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

	public String getKbArticleRss(long resourcePrimKey, int status, int rssDelta, String rssDisplayStyle, String rssFormat, JSONObjectWrapper themeDisplay) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("resourcePrimKey", resourcePrimKey);
			_params.put("rssDelta", rssDelta);
			_params.put("rssDisplayStyle", checkNull(rssDisplayStyle));
			_params.put("rssFormat", checkNull(rssFormat));
			_params.put("status", status);
			mangleWrapper(_params, "themeDisplay", "com.liferay.portal.kernel.theme.ThemeDisplay", themeDisplay);

			_command.put("/kb.kbarticle/get-kb-article-rss", _params);
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

	public JSONArray getKbArticles(long groupId, JSONArray resourcePrimKeys, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("resourcePrimKeys", checkNull(resourcePrimKeys));
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBArticle>", orderByComparator);

			_command.put("/kb.kbarticle/get-kb-articles", _params);
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

	public JSONArray getKbArticles(long groupId, JSONArray resourcePrimKeys, int status, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("resourcePrimKeys", checkNull(resourcePrimKeys));
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBArticle>", orderByComparator);

			_command.put("/kb.kbarticle/get-kb-articles", _params);
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

	public JSONArray getKbArticles(long groupId, long parentResourcePrimKey, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("parentResourcePrimKey", parentResourcePrimKey);
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBArticle>", orderByComparator);

			_command.put("/kb.kbarticle/get-kb-articles", _params);
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

	public Integer getKbArticlesCount(long groupId, JSONArray resourcePrimKeys, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("resourcePrimKeys", checkNull(resourcePrimKeys));
			_params.put("status", status);

			_command.put("/kb.kbarticle/get-kb-articles-count", _params);
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

	public Integer getKbArticlesCount(long groupId, long parentResourcePrimKey, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentResourcePrimKey", parentResourcePrimKey);
			_params.put("status", status);

			_command.put("/kb.kbarticle/get-kb-articles-count", _params);
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

	public JSONObject getKbArticleSearchDisplay(long groupId, String title, String content, int status, long startDate, long endDate, boolean andOperator, JSONArray curStartValues, int cur, int delta, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("andOperator", andOperator);
			_params.put("content", checkNull(content));
			_params.put("cur", cur);
			_params.put("curStartValues", checkNull(curStartValues));
			_params.put("delta", delta);
			_params.put("endDate", endDate);
			_params.put("groupId", groupId);
			_params.put("startDate", startDate);
			_params.put("status", status);
			_params.put("title", checkNull(title));
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBArticle>", orderByComparator);

			_command.put("/kb.kbarticle/get-kb-article-search-display", _params);
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

	public JSONArray getKbArticleVersions(long groupId, long resourcePrimKey, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("resourcePrimKey", resourcePrimKey);
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBArticle>", orderByComparator);

			_command.put("/kb.kbarticle/get-kb-article-versions", _params);
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

	public Integer getKbArticleVersionsCount(long groupId, long resourcePrimKey, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("resourcePrimKey", resourcePrimKey);
			_params.put("status", status);

			_command.put("/kb.kbarticle/get-kb-article-versions-count", _params);
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

	public JSONObject getLatestKbArticle(long resourcePrimKey, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("resourcePrimKey", resourcePrimKey);
			_params.put("status", status);

			_command.put("/kb.kbarticle/get-latest-kb-article", _params);
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

	public JSONArray getPreviousAndNextKbArticles(long kbArticleId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("kbArticleId", kbArticleId);

			_command.put("/kb.kbarticle/get-previous-and-next-kb-articles", _params);
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

	public JSONArray getSectionsKbArticles(long groupId, JSONArray sections, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("sections", checkNull(sections));
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBArticle>", orderByComparator);

			_command.put("/kb.kbarticle/get-sections-kb-articles", _params);
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

	public Integer getSectionsKbArticlesCount(long groupId, JSONArray sections, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("sections", checkNull(sections));
			_params.put("status", status);

			_command.put("/kb.kbarticle/get-sections-kb-articles-count", _params);
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

	public JSONArray getSiblingKbArticles(long groupId, long parentResourcePrimKey, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("parentResourcePrimKey", parentResourcePrimKey);
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledge.base.model.KBArticle>", orderByComparator);

			_command.put("/kb.kbarticle/get-sibling-kb-articles", _params);
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

	public Integer getSiblingKbArticlesCount(long groupId, long parentResourcePrimKey, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentResourcePrimKey", parentResourcePrimKey);
			_params.put("status", status);

			_command.put("/kb.kbarticle/get-sibling-kb-articles-count", _params);
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

	public JSONArray getTempAttachmentNames(long groupId, String tempFolderName) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("tempFolderName", checkNull(tempFolderName));

			_command.put("/kb.kbarticle/get-temp-attachment-names", _params);
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

	public void moveKbArticle(long resourcePrimKey, long parentResourceClassNameId, long parentResourcePrimKey, double priority) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("parentResourceClassNameId", parentResourceClassNameId);
			_params.put("parentResourcePrimKey", parentResourcePrimKey);
			_params.put("priority", priority);
			_params.put("resourcePrimKey", resourcePrimKey);

			_command.put("/kb.kbarticle/move-kb-article", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject revertKbArticle(long resourcePrimKey, int version, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("resourcePrimKey", resourcePrimKey);
			_params.put("version", version);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/kb.kbarticle/revert-kb-article", _params);
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

	public void subscribeGroupKbArticles(long groupId, String portletId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("portletId", checkNull(portletId));

			_command.put("/kb.kbarticle/subscribe-group-kb-articles", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void subscribeKbArticle(long groupId, long resourcePrimKey) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("resourcePrimKey", resourcePrimKey);

			_command.put("/kb.kbarticle/subscribe-kb-article", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void unsubscribeGroupKbArticles(long groupId, String portletId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("portletId", checkNull(portletId));

			_command.put("/kb.kbarticle/unsubscribe-group-kb-articles", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void unsubscribeKbArticle(long resourcePrimKey) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("resourcePrimKey", resourcePrimKey);

			_command.put("/kb.kbarticle/unsubscribe-kb-article", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject updateKbArticle(long resourcePrimKey, String title, String content, String description, String sourceURL, JSONArray sections, JSONArray selectedFileNames, JSONArray removeFileEntryIds, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("content", checkNull(content));
			_params.put("description", checkNull(description));
			_params.put("removeFileEntryIds", checkNull(removeFileEntryIds));
			_params.put("resourcePrimKey", resourcePrimKey);
			_params.put("sections", checkNull(sections));
			_params.put("selectedFileNames", checkNull(selectedFileNames));
			_params.put("sourceURL", checkNull(sourceURL));
			_params.put("title", checkNull(title));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/kb.kbarticle/update-kb-article", _params);
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

	public void updateKbArticlesPriorities(long groupId, JSONObject resourcePrimKeyToPriorityMap) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("resourcePrimKeyToPriorityMap", checkNull(resourcePrimKeyToPriorityMap));

			_command.put("/kb.kbarticle/update-kb-articles-priorities", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

}