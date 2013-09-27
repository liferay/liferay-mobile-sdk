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

package com.liferay.mobile.android.v62.syncdlobject;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class SyncDLObjectService extends BaseService {
	public SyncDLObjectService(Session session) {
		super(session);
	}

	public SyncDLObjectService(Session session, AsyncTaskCallback callback) {
		super(session, callback);
	}

	public SyncDLObjectService(Session session, boolean batch) {
		super(session, batch);
	}

	public JSONObject addFileEntry(long repositoryId, long folderId,
		String sourceFileName, String mimeType, String title,
		String description, String changeLog, JSONObject file, String checksum,
		JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("repositoryId", repositoryId);
			_params.put("folderId", folderId);
			_params.put("sourceFileName", sourceFileName);
			_params.put("mimeType", mimeType);
			_params.put("title", title);
			_params.put("description", description);
			_params.put("changeLog", changeLog);
			_params.put("file", file);
			_params.put("checksum", checksum);
			_params.put("serviceContext", serviceContext);

			_command.put("/sync-web/syncdlobject/add-file-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONObject addFolder(long repositoryId, long parentFolderId,
		String name, String description, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("repositoryId", repositoryId);
			_params.put("parentFolderId", parentFolderId);
			_params.put("name", name);
			_params.put("description", description);
			_params.put("serviceContext", serviceContext);

			_command.put("/sync-web/syncdlobject/add-folder", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONObject cancelCheckOut(long fileEntryId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fileEntryId", fileEntryId);

			_command.put("/sync-web/syncdlobject/cancel-check-out", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONObject checkInFileEntry(long fileEntryId, boolean majorVersion,
		String changeLog, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fileEntryId", fileEntryId);
			_params.put("majorVersion", majorVersion);
			_params.put("changeLog", changeLog);
			_params.put("serviceContext", serviceContext);

			_command.put("/sync-web/syncdlobject/check-in-file-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONObject checkOutFileEntry(long fileEntryId, String owner,
		long expirationTime, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fileEntryId", fileEntryId);
			_params.put("owner", owner);
			_params.put("expirationTime", expirationTime);
			_params.put("serviceContext", serviceContext);

			_command.put("/sync-web/syncdlobject/check-out-file-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONObject getAllSyncDlObjects(long repositoryId, long folderId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("repositoryId", repositoryId);
			_params.put("folderId", folderId);

			_command.put("/sync-web/syncdlobject/get-all-sync-dl-objects",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONObject getFileEntrySyncDlObject(long groupId, long folderId,
		String title) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("folderId", folderId);
			_params.put("title", title);

			_command.put("/sync-web/syncdlobject/get-file-entry-sync-dl-object",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONArray getFileEntrySyncDlObjects(long repositoryId, long folderId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("repositoryId", repositoryId);
			_params.put("folderId", folderId);

			_command.put("/sync-web/syncdlobject/get-file-entry-sync-dl-objects",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public JSONObject getFolderSyncDlObject(long folderId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);

			_command.put("/sync-web/syncdlobject/get-folder-sync-dl-object",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONArray getFolderSyncDlObjects(long repositoryId,
		long parentFolderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("repositoryId", repositoryId);
			_params.put("parentFolderId", parentFolderId);

			_command.put("/sync-web/syncdlobject/get-folder-sync-dl-objects",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public JSONObject getGroup(long groupId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);

			_command.put("/sync-web/syncdlobject/get-group", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public Long getLatestModifiedTime() throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_command.put("/sync-web/syncdlobject/get-latest-modified-time",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Long)post(_command);
	}

	public JSONObject getSyncContext(String uuid) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("uuid", uuid);

			_command.put("/sync-web/syncdlobject/get-sync-context", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONObject getSyncDlObjectUpdate(long companyId, long repositoryId,
		long lastAccessTime) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("repositoryId", repositoryId);
			_params.put("lastAccessTime", lastAccessTime);

			_command.put("/sync-web/syncdlobject/get-sync-dl-object-update",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONArray getUserSitesGroups() throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_command.put("/sync-web/syncdlobject/get-user-sites-groups", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public JSONObject moveFileEntry(long fileEntryId, long newFolderId,
		JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fileEntryId", fileEntryId);
			_params.put("newFolderId", newFolderId);
			_params.put("serviceContext", serviceContext);

			_command.put("/sync-web/syncdlobject/move-file-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONObject moveFileEntryToTrash(long fileEntryId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fileEntryId", fileEntryId);

			_command.put("/sync-web/syncdlobject/move-file-entry-to-trash",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONObject moveFolder(long folderId, long parentFolderId,
		JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("parentFolderId", parentFolderId);
			_params.put("serviceContext", serviceContext);

			_command.put("/sync-web/syncdlobject/move-folder", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONObject moveFolderToTrash(long folderId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);

			_command.put("/sync-web/syncdlobject/move-folder-to-trash", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONObject patchFileEntry(long fileEntryId, String sourceVersion,
		String sourceFileName, String mimeType, String title,
		String description, String changeLog, boolean majorVersion,
		JSONObject deltaFile, String checksum, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fileEntryId", fileEntryId);
			_params.put("sourceVersion", sourceVersion);
			_params.put("sourceFileName", sourceFileName);
			_params.put("mimeType", mimeType);
			_params.put("title", title);
			_params.put("description", description);
			_params.put("changeLog", changeLog);
			_params.put("majorVersion", majorVersion);
			_params.put("deltaFile", deltaFile);
			_params.put("checksum", checksum);
			_params.put("serviceContext", serviceContext);

			_command.put("/sync-web/syncdlobject/patch-file-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONObject restoreFileEntryFromTrash(long fileEntryId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fileEntryId", fileEntryId);

			_command.put("/sync-web/syncdlobject/restore-file-entry-from-trash",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONObject restoreFolderFromTrash(long folderId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);

			_command.put("/sync-web/syncdlobject/restore-folder-from-trash",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONObject updateFileEntry(long fileEntryId, String sourceFileName,
		String mimeType, String title, String description, String changeLog,
		boolean majorVersion, JSONObject file, String checksum,
		JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fileEntryId", fileEntryId);
			_params.put("sourceFileName", sourceFileName);
			_params.put("mimeType", mimeType);
			_params.put("title", title);
			_params.put("description", description);
			_params.put("changeLog", changeLog);
			_params.put("majorVersion", majorVersion);
			_params.put("file", file);
			_params.put("checksum", checksum);
			_params.put("serviceContext", serviceContext);

			_command.put("/sync-web/syncdlobject/update-file-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONObject updateFolder(long folderId, String name,
		String description, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("name", name);
			_params.put("description", description);
			_params.put("serviceContext", serviceContext);

			_command.put("/sync-web/syncdlobject/update-folder", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}
}