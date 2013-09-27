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

package com.liferay.mobile.android.v62.dlfileentry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class DLFileEntryService extends BaseService {
	public DLFileEntryService(Session session) {
		super(session);
	}

	public JSONObject cancelCheckOut(long fileEntryId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fileEntryId", fileEntryId);

			_command.put("/dlfileentry/cancel-check-out", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void checkInFileEntry(long fileEntryId, boolean major,
		String changeLog, JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fileEntryId", fileEntryId);
			_params.put("major", major);
			_params.put("changeLog", changeLog);
			_params.put("serviceContext", serviceContext);

			_command.put("/dlfileentry/check-in-file-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
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

			_command.put("/dlfileentry/check-out-file-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject copyFileEntry(long groupId, long repositoryId,
		long fileEntryId, long destFolderId, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("repositoryId", repositoryId);
			_params.put("fileEntryId", fileEntryId);
			_params.put("destFolderId", destFolderId);
			_params.put("serviceContext", serviceContext);

			_command.put("/dlfileentry/copy-file-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void deleteFileEntry(long groupId, long folderId, String title)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("folderId", folderId);
			_params.put("title", title);

			_command.put("/dlfileentry/delete-file-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void deleteFileVersion(long fileEntryId, String version)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fileEntryId", fileEntryId);
			_params.put("version", version);

			_command.put("/dlfileentry/delete-file-version", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject fetchFileEntryByImageId(long imageId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("imageId", imageId);

			_command.put("/dlfileentry/fetch-file-entry-by-image-id", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONArray getFileEntries(long groupId, long folderId, int status,
		int start, int end, JSONObject obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("folderId", folderId);
			_params.put("status", status);
			_params.put("start", start);
			_params.put("end", end);
			_params.put("obc", obc);

			_command.put("/dlfileentry/get-file-entries", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer getFileEntriesCount(long groupId, long folderId, int status)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("folderId", folderId);
			_params.put("status", status);

			_command.put("/dlfileentry/get-file-entries-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONObject getFileEntry(long groupId, long folderId, String title)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("folderId", folderId);
			_params.put("title", title);

			_command.put("/dlfileentry/get-file-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject getFileEntryByUuidAndGroupId(String uuid, long groupId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("uuid", uuid);
			_params.put("groupId", groupId);

			_command.put("/dlfileentry/get-file-entry-by-uuid-and-group-id",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject getFileEntryLock(long fileEntryId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fileEntryId", fileEntryId);

			_command.put("/dlfileentry/get-file-entry-lock", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public Integer getFoldersFileEntriesCount(long groupId,
		JSONArray folderIds, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("folderIds", folderIds);
			_params.put("status", status);

			_command.put("/dlfileentry/get-folders-file-entries-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONArray getGroupFileEntries(long groupId, long userId,
		long rootFolderId, JSONArray mimeTypes, int status, int start, int end,
		JSONObject obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("userId", userId);
			_params.put("rootFolderId", rootFolderId);
			_params.put("mimeTypes", mimeTypes);
			_params.put("status", status);
			_params.put("start", start);
			_params.put("end", end);
			_params.put("obc", obc);

			_command.put("/dlfileentry/get-group-file-entries", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer getGroupFileEntriesCount(long groupId, long userId,
		long rootFolderId, JSONArray mimeTypes, int status)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("userId", userId);
			_params.put("rootFolderId", rootFolderId);
			_params.put("mimeTypes", mimeTypes);
			_params.put("status", status);

			_command.put("/dlfileentry/get-group-file-entries-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public Boolean hasFileEntryLock(long fileEntryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fileEntryId", fileEntryId);

			_command.put("/dlfileentry/has-file-entry-lock", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Boolean)session.invoke(_command);
	}

	public Boolean isFileEntryCheckedOut(long fileEntryId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fileEntryId", fileEntryId);

			_command.put("/dlfileentry/is-file-entry-checked-out", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Boolean)session.invoke(_command);
	}

	public JSONObject moveFileEntry(long fileEntryId, long newFolderId,
		JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fileEntryId", fileEntryId);
			_params.put("newFolderId", newFolderId);
			_params.put("serviceContext", serviceContext);

			_command.put("/dlfileentry/move-file-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject refreshFileEntryLock(String lockUuid, long companyId,
		long expirationTime) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("lockUuid", lockUuid);
			_params.put("companyId", companyId);
			_params.put("expirationTime", expirationTime);

			_command.put("/dlfileentry/refresh-file-entry-lock", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void revertFileEntry(long fileEntryId, String version,
		JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fileEntryId", fileEntryId);
			_params.put("version", version);
			_params.put("serviceContext", serviceContext);

			_command.put("/dlfileentry/revert-file-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject search(long groupId, long creatorUserId, long folderId,
		JSONArray mimeTypes, int status, int start, int end)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("creatorUserId", creatorUserId);
			_params.put("folderId", folderId);
			_params.put("mimeTypes", mimeTypes);
			_params.put("status", status);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/dlfileentry/search", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public Boolean verifyFileEntryCheckOut(long fileEntryId, String lockUuid)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fileEntryId", fileEntryId);
			_params.put("lockUuid", lockUuid);

			_command.put("/dlfileentry/verify-file-entry-check-out", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Boolean)session.invoke(_command);
	}

	public Boolean verifyFileEntryLock(long fileEntryId, String lockUuid)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fileEntryId", fileEntryId);
			_params.put("lockUuid", lockUuid);

			_command.put("/dlfileentry/verify-file-entry-lock", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Boolean)session.invoke(_command);
	}
}