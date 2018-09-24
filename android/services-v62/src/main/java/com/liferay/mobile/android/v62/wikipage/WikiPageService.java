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

package com.liferay.mobile.android.v62.wikipage;

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
public class WikiPageService extends BaseService {

	public WikiPageService(Session session) {
		super(session);
	}

	public JSONObject addPage(long nodeId, String title, String content, String summary, boolean minorEdit, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));
			_params.put("content", checkNull(content));
			_params.put("summary", checkNull(summary));
			_params.put("minorEdit", minorEdit);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/wikipage/add-page", _params);
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

	public JSONObject addPage(long nodeId, String title, String content, String summary, boolean minorEdit, String format, String parentTitle, String redirectTitle, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));
			_params.put("content", checkNull(content));
			_params.put("summary", checkNull(summary));
			_params.put("minorEdit", minorEdit);
			_params.put("format", checkNull(format));
			_params.put("parentTitle", checkNull(parentTitle));
			_params.put("redirectTitle", checkNull(redirectTitle));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/wikipage/add-page", _params);
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

	public void addPageAttachment(long nodeId, String title, String fileName, UploadData file, String mimeType) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));
			_params.put("fileName", checkNull(fileName));
			_params.put("file", checkNull(file));
			_params.put("mimeType", checkNull(mimeType));

			_command.put("/wikipage/add-page-attachment", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.upload(_command);
	}

	public void addPageAttachments(long nodeId, String title, JSONArray inputStreamOVPs) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));
			_params.put("inputStreamOVPs", checkNull(inputStreamOVPs));

			_command.put("/wikipage/add-page-attachments", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void changeParent(long nodeId, String title, String newParentTitle, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));
			_params.put("newParentTitle", checkNull(newParentTitle));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/wikipage/change-parent", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void copyPageAttachments(long templateNodeId, String templateTitle, long nodeId, String title) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("templateNodeId", templateNodeId);
			_params.put("templateTitle", checkNull(templateTitle));
			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));

			_command.put("/wikipage/copy-page-attachments", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void deletePage(long nodeId, String title) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));

			_command.put("/wikipage/delete-page", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void deletePage(long nodeId, String title, double version) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));
			_params.put("version", version);

			_command.put("/wikipage/delete-page", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void deletePageAttachment(long nodeId, String title, String fileName) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));
			_params.put("fileName", checkNull(fileName));

			_command.put("/wikipage/delete-page-attachment", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void deletePageAttachments(long nodeId, String title) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));

			_command.put("/wikipage/delete-page-attachments", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void deleteTempPageAttachment(long nodeId, String fileName, String tempFolderName) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("fileName", checkNull(fileName));
			_params.put("tempFolderName", checkNull(tempFolderName));

			_command.put("/wikipage/delete-temp-page-attachment", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void deleteTrashPageAttachments(long nodeId, String title) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));

			_command.put("/wikipage/delete-trash-page-attachments", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void discardDraft(long nodeId, String title, double version) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));
			_params.put("version", version);

			_command.put("/wikipage/discard-draft", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONArray getChildren(long groupId, long nodeId, boolean head, String parentTitle) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("nodeId", nodeId);
			_params.put("head", head);
			_params.put("parentTitle", checkNull(parentTitle));

			_command.put("/wikipage/get-children", _params);
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

	public JSONObject getDraftPage(long nodeId, String title) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));

			_command.put("/wikipage/get-draft-page", _params);
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

	public JSONArray getNodePages(long nodeId, int max) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("max", max);

			_command.put("/wikipage/get-node-pages", _params);
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

	public String getNodePagesRss(long nodeId, int max, String type, double version, String displayStyle, String feedURL, String entryURL) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("max", max);
			_params.put("type", checkNull(type));
			_params.put("version", version);
			_params.put("displayStyle", checkNull(displayStyle));
			_params.put("feedURL", checkNull(feedURL));
			_params.put("entryURL", checkNull(entryURL));

			_command.put("/wikipage/get-node-pages-rss", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getString(0);
	}

	public String getNodePagesRss(long nodeId, int max, String type, double version, String displayStyle, String feedURL, String entryURL, String attachmentURLPrefix) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("max", max);
			_params.put("type", checkNull(type));
			_params.put("version", version);
			_params.put("displayStyle", checkNull(displayStyle));
			_params.put("feedURL", checkNull(feedURL));
			_params.put("entryURL", checkNull(entryURL));
			_params.put("attachmentURLPrefix", checkNull(attachmentURLPrefix));

			_command.put("/wikipage/get-node-pages-rss", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getString(0);
	}

	public JSONArray getOrphans(long groupId, long nodeId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("nodeId", nodeId);

			_command.put("/wikipage/get-orphans", _params);
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

	public JSONObject getPage(long groupId, long nodeId, String title) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));

			_command.put("/wikipage/get-page", _params);
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

	public JSONObject getPage(long nodeId, String title) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));

			_command.put("/wikipage/get-page", _params);
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

	public JSONObject getPage(long nodeId, String title, boolean head) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));
			_params.put("head", head);

			_command.put("/wikipage/get-page", _params);
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

	public JSONObject getPage(long nodeId, String title, double version) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));
			_params.put("version", version);

			_command.put("/wikipage/get-page", _params);
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

	public JSONArray getPages(long groupId, long nodeId, boolean head, int status, int start, int end, JSONObjectWrapper obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("nodeId", nodeId);
			_params.put("head", head);
			_params.put("status", status);
			_params.put("start", start);
			_params.put("end", end);
			mangleWrapper(_params, "obc", "com.liferay.portal.kernel.util.OrderByComparator", obc);

			_command.put("/wikipage/get-pages", _params);
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

	public JSONArray getPages(long groupId, long userId, long nodeId, int status, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("userId", userId);
			_params.put("nodeId", nodeId);
			_params.put("status", status);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/wikipage/get-pages", _params);
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

	public Integer getPagesCount(long groupId, long nodeId, boolean head) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("nodeId", nodeId);
			_params.put("head", head);

			_command.put("/wikipage/get-pages-count", _params);
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

	public Integer getPagesCount(long groupId, long userId, long nodeId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("userId", userId);
			_params.put("nodeId", nodeId);
			_params.put("status", status);

			_command.put("/wikipage/get-pages-count", _params);
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

	public String getPagesRss(long companyId, long nodeId, String title, int max, String type, double version, String displayStyle, String feedURL, String entryURL, String locale) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));
			_params.put("max", max);
			_params.put("type", checkNull(type));
			_params.put("version", version);
			_params.put("displayStyle", checkNull(displayStyle));
			_params.put("feedURL", checkNull(feedURL));
			_params.put("entryURL", checkNull(entryURL));
			_params.put("locale", checkNull(locale));

			_command.put("/wikipage/get-pages-rss", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getString(0);
	}

	public String getPagesRss(long companyId, long nodeId, String title, int max, String type, double version, String displayStyle, String feedURL, String entryURL, String attachmentURLPrefix, String locale) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));
			_params.put("max", max);
			_params.put("type", checkNull(type));
			_params.put("version", version);
			_params.put("displayStyle", checkNull(displayStyle));
			_params.put("feedURL", checkNull(feedURL));
			_params.put("entryURL", checkNull(entryURL));
			_params.put("attachmentURLPrefix", checkNull(attachmentURLPrefix));
			_params.put("locale", checkNull(locale));

			_command.put("/wikipage/get-pages-rss", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		JSONArray _result = session.invoke(_command);

		if (_result == null) {
			return null;
		}

		return _result.getString(0);
	}

	public JSONArray getRecentChanges(long groupId, long nodeId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("nodeId", nodeId);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/wikipage/get-recent-changes", _params);
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

	public Integer getRecentChangesCount(long groupId, long nodeId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("nodeId", nodeId);

			_command.put("/wikipage/get-recent-changes-count", _params);
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

	public JSONArray getTempPageAttachmentNames(long nodeId, String tempFolderName) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("tempFolderName", checkNull(tempFolderName));

			_command.put("/wikipage/get-temp-page-attachment-names", _params);
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

	public void movePage(long nodeId, String title, String newTitle, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));
			_params.put("newTitle", checkNull(newTitle));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/wikipage/move-page", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject movePageAttachmentToTrash(long nodeId, String title, String fileName) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));
			_params.put("fileName", checkNull(fileName));

			_command.put("/wikipage/move-page-attachment-to-trash", _params);
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

	public JSONObject movePageToTrash(long nodeId, String title) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));

			_command.put("/wikipage/move-page-to-trash", _params);
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

	public JSONObject movePageToTrash(long nodeId, String title, double version) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));
			_params.put("version", version);

			_command.put("/wikipage/move-page-to-trash", _params);
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

	public void restorePageAttachmentFromTrash(long nodeId, String title, String fileName) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));
			_params.put("fileName", checkNull(fileName));

			_command.put("/wikipage/restore-page-attachment-from-trash", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void restorePageFromTrash(long resourcePrimKey) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("resourcePrimKey", resourcePrimKey);

			_command.put("/wikipage/restore-page-from-trash", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject revertPage(long nodeId, String title, double version, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));
			_params.put("version", version);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/wikipage/revert-page", _params);
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

	public void subscribePage(long nodeId, String title) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));

			_command.put("/wikipage/subscribe-page", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void unsubscribePage(long nodeId, String title) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));

			_command.put("/wikipage/unsubscribe-page", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject updatePage(long nodeId, String title, double version, String content, String summary, boolean minorEdit, String format, String parentTitle, String redirectTitle, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", checkNull(title));
			_params.put("version", version);
			_params.put("content", checkNull(content));
			_params.put("summary", checkNull(summary));
			_params.put("minorEdit", minorEdit);
			_params.put("format", checkNull(format));
			_params.put("parentTitle", checkNull(parentTitle));
			_params.put("redirectTitle", checkNull(redirectTitle));
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/wikipage/update-page", _params);
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