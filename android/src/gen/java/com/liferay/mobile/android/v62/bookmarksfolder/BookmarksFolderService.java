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

package com.liferay.mobile.android.v62.bookmarksfolder;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class BookmarksFolderService extends BaseService {

	public BookmarksFolderService(Session session) {
		super(session);
	}

	public JSONObject addFolder(long parentFolderId, String name, String description, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("parentFolderId", parentFolderId);
			_params.put("name", name);
			_params.put("description", description);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/bookmarksfolder/add-folder", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void deleteFolder(long folderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);

			_command.put("/bookmarksfolder/delete-folder", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void deleteFolder(long folderId, boolean includeTrashedEntries) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("includeTrashedEntries", includeTrashedEntries);

			_command.put("/bookmarksfolder/delete-folder", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject getFolder(long folderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);

			_command.put("/bookmarksfolder/get-folder", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONArray getFolderIds(long groupId, long folderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("folderId", folderId);

			_command.put("/bookmarksfolder/get-folder-ids", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getFolders(long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);

			_command.put("/bookmarksfolder/get-folders", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getFolders(long groupId, long parentFolderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentFolderId", parentFolderId);

			_command.put("/bookmarksfolder/get-folders", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getFolders(long groupId, long parentFolderId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentFolderId", parentFolderId);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/bookmarksfolder/get-folders", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getFolders(long groupId, long parentFolderId, int status, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentFolderId", parentFolderId);
			_params.put("status", status);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/bookmarksfolder/get-folders", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getFoldersAndEntries(long groupId, long folderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("folderId", folderId);

			_command.put("/bookmarksfolder/get-folders-and-entries", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getFoldersAndEntries(long groupId, long folderId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("folderId", folderId);
			_params.put("status", status);

			_command.put("/bookmarksfolder/get-folders-and-entries", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONArray getFoldersAndEntries(long groupId, long folderId, int status, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("folderId", folderId);
			_params.put("status", status);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/bookmarksfolder/get-folders-and-entries", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer getFoldersAndEntriesCount(long groupId, long folderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("folderId", folderId);

			_command.put("/bookmarksfolder/get-folders-and-entries-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public Integer getFoldersAndEntriesCount(long groupId, long folderId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("folderId", folderId);
			_params.put("status", status);

			_command.put("/bookmarksfolder/get-folders-and-entries-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public Integer getFoldersCount(long groupId, long parentFolderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentFolderId", parentFolderId);

			_command.put("/bookmarksfolder/get-folders-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public Integer getFoldersCount(long groupId, long parentFolderId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentFolderId", parentFolderId);
			_params.put("status", status);

			_command.put("/bookmarksfolder/get-folders-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public void getSubfolderIds(JSONArray folderIds, long groupId, long folderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderIds", folderIds);
			_params.put("groupId", groupId);
			_params.put("folderId", folderId);

			_command.put("/bookmarksfolder/get-subfolder-ids", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONArray getSubfolderIds(long groupId, long folderId, boolean recurse) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("folderId", folderId);
			_params.put("recurse", recurse);

			_command.put("/bookmarksfolder/get-subfolder-ids", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public JSONObject moveFolder(long folderId, long parentFolderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("parentFolderId", parentFolderId);

			_command.put("/bookmarksfolder/move-folder", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject moveFolderFromTrash(long folderId, long parentFolderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("parentFolderId", parentFolderId);

			_command.put("/bookmarksfolder/move-folder-from-trash", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject moveFolderToTrash(long folderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);

			_command.put("/bookmarksfolder/move-folder-to-trash", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void restoreFolderFromTrash(long folderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);

			_command.put("/bookmarksfolder/restore-folder-from-trash", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void subscribeFolder(long groupId, long folderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("folderId", folderId);

			_command.put("/bookmarksfolder/subscribe-folder", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void unsubscribeFolder(long groupId, long folderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("folderId", folderId);

			_command.put("/bookmarksfolder/unsubscribe-folder", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject updateFolder(long folderId, long parentFolderId, String name, String description, boolean mergeWithParentFolder, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("parentFolderId", parentFolderId);
			_params.put("name", name);
			_params.put("description", description);
			_params.put("mergeWithParentFolder", mergeWithParentFolder);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			_command.put("/bookmarksfolder/update-folder", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

}