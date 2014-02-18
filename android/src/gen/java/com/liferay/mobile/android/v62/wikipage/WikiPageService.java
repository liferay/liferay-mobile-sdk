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

package com.liferay.mobile.android.v62.wikipage;

import com.liferay.mobile.android.service.BaseService;
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

	public JSONObject addPage(long nodeId, String title, String content,
		String summary, boolean minorEdit, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", title);
			_params.put("content", content);
			_params.put("summary", summary);
			_params.put("minorEdit", minorEdit);
			_params.put("serviceContext", serviceContext);

			_command.put("/wikipage/add-page", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject addPage(long nodeId, String title, String content,
		String summary, boolean minorEdit, String format, String parentTitle,
		String redirectTitle, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", title);
			_params.put("content", content);
			_params.put("summary", summary);
			_params.put("minorEdit", minorEdit);
			_params.put("format", format);
			_params.put("parentTitle", parentTitle);
			_params.put("redirectTitle", redirectTitle);
			_params.put("serviceContext", serviceContext);

			_command.put("/wikipage/add-page", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void addPageAttachment(long nodeId, String title, String fileName,
		JSONObject file, String mimeType) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", title);
			_params.put("fileName", fileName);
			_params.put("file", file);
			_params.put("mimeType", mimeType);

			_command.put("/wikipage/add-page-attachment", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void addPageAttachments(long nodeId, String title,
		JSONArray inputStreamOVPs) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", title);
			_params.put("inputStreamOVPs", inputStreamOVPs);

			_command.put("/wikipage/add-page-attachments", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void changeParent(long nodeId, String title, String newParentTitle,
		JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", title);
			_params.put("newParentTitle", newParentTitle);
			_params.put("serviceContext", serviceContext);

			_command.put("/wikipage/change-parent", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void copyPageAttachments(long templateNodeId, String templateTitle,
		long nodeId, String title) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("templateNodeId", templateNodeId);
			_params.put("templateTitle", templateTitle);
			_params.put("nodeId", nodeId);
			_params.put("title", title);

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
			_params.put("title", title);

			_command.put("/wikipage/delete-page", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void deletePage(long nodeId, String title, double version)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", title);
			_params.put("version", version);

			_command.put("/wikipage/delete-page", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void deletePageAttachment(long nodeId, String title, String fileName)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", title);
			_params.put("fileName", fileName);

			_command.put("/wikipage/delete-page-attachment", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void deletePageAttachments(long nodeId, String title)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", title);

			_command.put("/wikipage/delete-page-attachments", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void deleteTempPageAttachment(long nodeId, String fileName,
		String tempFolderName) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("fileName", fileName);
			_params.put("tempFolderName", tempFolderName);

			_command.put("/wikipage/delete-temp-page-attachment", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void deleteTrashPageAttachments(long nodeId, String title)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", title);

			_command.put("/wikipage/delete-trash-page-attachments", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void discardDraft(long nodeId, String title, double version)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", title);
			_params.put("version", version);

			_command.put("/wikipage/discard-draft", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONArray getChildren(long groupId, long nodeId, boolean head,
		String parentTitle) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("nodeId", nodeId);
			_params.put("head", head);
			_params.put("parentTitle", parentTitle);

			_command.put("/wikipage/get-children", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONObject getDraftPage(long nodeId, String title)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", title);

			_command.put("/wikipage/get-draft-page", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONArray getNodePages(long nodeId, int max)
		throws Exception {
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

		return (JSONArray)session.invoke(_command);
	}

	public String getNodePagesRss(long nodeId, int max, String type,
		double version, String displayStyle, String feedURL, String entryURL)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("max", max);
			_params.put("type", type);
			_params.put("version", version);
			_params.put("displayStyle", displayStyle);
			_params.put("feedURL", feedURL);
			_params.put("entryURL", entryURL);

			_command.put("/wikipage/get-node-pages-rss", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (String)session.invoke(_command);
	}

	public String getNodePagesRss(long nodeId, int max, String type,
		double version, String displayStyle, String feedURL, String entryURL,
		String attachmentURLPrefix) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("max", max);
			_params.put("type", type);
			_params.put("version", version);
			_params.put("displayStyle", displayStyle);
			_params.put("feedURL", feedURL);
			_params.put("entryURL", entryURL);
			_params.put("attachmentURLPrefix", attachmentURLPrefix);

			_command.put("/wikipage/get-node-pages-rss", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (String)session.invoke(_command);
	}

	public JSONArray getOrphans(long groupId, long nodeId)
		throws Exception {
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

		return (JSONArray)session.invoke(_command);
	}

	public JSONObject getPage(long nodeId, String title)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", title);

			_command.put("/wikipage/get-page", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject getPage(long groupId, long nodeId, String title)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("nodeId", nodeId);
			_params.put("title", title);

			_command.put("/wikipage/get-page", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject getPage(long nodeId, String title, JSONObject head)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", title);
			_params.put("head", head);

			_command.put("/wikipage/get-page", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject getPage(long nodeId, String title, double version)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", title);
			_params.put("version", version);

			_command.put("/wikipage/get-page", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONArray getPages(long groupId, long userId, long nodeId,
		int status, int start, int end) throws Exception {
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

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getPages(long groupId, long nodeId, boolean head,
		int status, int start, int end, JSONObject obc)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("nodeId", nodeId);
			_params.put("head", head);
			_params.put("status", status);
			_params.put("start", start);
			_params.put("end", end);
			_params.put("obc", obc);

			_command.put("/wikipage/get-pages", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer getPagesCount(long groupId, long nodeId, boolean head)
		throws Exception {
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

		return (Integer)session.invoke(_command);
	}

	public Integer getPagesCount(long groupId, long userId, long nodeId,
		int status) throws Exception {
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

		return (Integer)session.invoke(_command);
	}

	public String getPagesRss(long companyId, long nodeId, String title,
		int max, String type, double version, String displayStyle,
		String feedURL, String entryURL, String locale)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("nodeId", nodeId);
			_params.put("title", title);
			_params.put("max", max);
			_params.put("type", type);
			_params.put("version", version);
			_params.put("displayStyle", displayStyle);
			_params.put("feedURL", feedURL);
			_params.put("entryURL", entryURL);
			_params.put("locale", locale);

			_command.put("/wikipage/get-pages-rss", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (String)session.invoke(_command);
	}

	public String getPagesRss(long companyId, long nodeId, String title,
		int max, String type, double version, String displayStyle,
		String feedURL, String entryURL, String attachmentURLPrefix,
		String locale) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("nodeId", nodeId);
			_params.put("title", title);
			_params.put("max", max);
			_params.put("type", type);
			_params.put("version", version);
			_params.put("displayStyle", displayStyle);
			_params.put("feedURL", feedURL);
			_params.put("entryURL", entryURL);
			_params.put("attachmentURLPrefix", attachmentURLPrefix);
			_params.put("locale", locale);

			_command.put("/wikipage/get-pages-rss", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (String)session.invoke(_command);
	}

	public JSONArray getRecentChanges(long groupId, long nodeId, int start,
		int end) throws Exception {
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

		return (JSONArray)session.invoke(_command);
	}

	public Integer getRecentChangesCount(long groupId, long nodeId)
		throws Exception {
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

		return (Integer)session.invoke(_command);
	}

	public JSONArray getTempPageAttachmentNames(long nodeId,
		String tempFolderName) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("tempFolderName", tempFolderName);

			_command.put("/wikipage/get-temp-page-attachment-names", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public void movePage(long nodeId, String title, String newTitle,
		JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", title);
			_params.put("newTitle", newTitle);
			_params.put("serviceContext", serviceContext);

			_command.put("/wikipage/move-page", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject movePageAttachmentToTrash(long nodeId, String title,
		String fileName) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", title);
			_params.put("fileName", fileName);

			_command.put("/wikipage/move-page-attachment-to-trash", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject movePageToTrash(long nodeId, String title)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", title);

			_command.put("/wikipage/move-page-to-trash", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject movePageToTrash(long nodeId, String title, double version)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", title);
			_params.put("version", version);

			_command.put("/wikipage/move-page-to-trash", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void restorePageAttachmentFromTrash(long nodeId, String title,
		String fileName) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", title);
			_params.put("fileName", fileName);

			_command.put("/wikipage/restore-page-attachment-from-trash", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void restorePageFromTrash(long resourcePrimKey)
		throws Exception {
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

	public JSONObject revertPage(long nodeId, String title, double version,
		JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", title);
			_params.put("version", version);
			_params.put("serviceContext", serviceContext);

			_command.put("/wikipage/revert-page", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void subscribePage(long nodeId, String title)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", title);

			_command.put("/wikipage/subscribe-page", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void unsubscribePage(long nodeId, String title)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", title);

			_command.put("/wikipage/unsubscribe-page", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject updatePage(long nodeId, String title, double version,
		String content, String summary, boolean minorEdit, String format,
		String parentTitle, String redirectTitle, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("nodeId", nodeId);
			_params.put("title", title);
			_params.put("version", version);
			_params.put("content", content);
			_params.put("summary", summary);
			_params.put("minorEdit", minorEdit);
			_params.put("format", format);
			_params.put("parentTitle", parentTitle);
			_params.put("redirectTitle", redirectTitle);
			_params.put("serviceContext", serviceContext);

			_command.put("/wikipage/update-page", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}
}