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

package com.liferay.mobile.android.v62.dlfolder;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.ServiceContext;
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class DLFolderService extends BaseService {
	public DLFolderService(ServiceContext context) {
		super(context);
	}

	public DLFolderService(ServiceContext context, AsyncTaskCallback callback) {
		super(context, callback);
	}

	public DLFolderService(ServiceContext context, boolean batch) {
		super(context, batch);
	}

	public JSONObject addFolder(long groupId, long repositoryId,
		boolean mountPoint, long parentFolderId, String name,
		String description, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("repositoryId", repositoryId);
			_params.put("mountPoint", mountPoint);
			_params.put("parentFolderId", parentFolderId);
			_params.put("name", name);
			_params.put("description", description);
			_params.put("serviceContext", serviceContext);

			_command.put("/dlfolder/add-folder", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public void deleteFolder(long groupId, long parentFolderId, String name)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentFolderId", parentFolderId);
			_params.put("name", name);

			_command.put("/dlfolder/delete-folder", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		post(_command);
	}

	public JSONArray getFileEntriesAndFileShortcuts(long groupId,
		long folderId, int status, int start, int end)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("folderId", folderId);
			_params.put("status", status);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/dlfolder/get-file-entries-and-file-shortcuts",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public Integer getFileEntriesAndFileShortcutsCount(long groupId,
		long folderId, int status, JSONArray mimeTypes)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("folderId", folderId);
			_params.put("status", status);
			_params.put("mimeTypes", mimeTypes);

			_command.put("/dlfolder/get-file-entries-and-file-shortcuts-count",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)post(_command);
	}

	public JSONObject getFolder(long groupId, long parentFolderId, String name)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentFolderId", parentFolderId);
			_params.put("name", name);

			_command.put("/dlfolder/get-folder", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONArray getFolderIds(long groupId, long folderId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("folderId", folderId);

			_command.put("/dlfolder/get-folder-ids", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public JSONArray getFolders(long groupId, long parentFolderId, int status,
		boolean includeMountfolders, int start, int end, JSONObject obc)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentFolderId", parentFolderId);
			_params.put("status", status);
			_params.put("includeMountfolders", includeMountfolders);
			_params.put("start", start);
			_params.put("end", end);
			_params.put("obc", obc);

			_command.put("/dlfolder/get-folders", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public JSONArray getFoldersAndFileEntriesAndFileShortcuts(long groupId,
		long folderId, int status, JSONArray mimeTypes,
		boolean includeMountFolders, int start, int end, JSONObject obc)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("folderId", folderId);
			_params.put("status", status);
			_params.put("mimeTypes", mimeTypes);
			_params.put("includeMountFolders", includeMountFolders);
			_params.put("start", start);
			_params.put("end", end);
			_params.put("obc", obc);

			_command.put("/dlfolder/get-folders-and-file-entries-and-file-shortcuts",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public Integer getFoldersAndFileEntriesAndFileShortcutsCount(long groupId,
		long folderId, int status, JSONArray mimeTypes,
		boolean includeMountFolders) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("folderId", folderId);
			_params.put("status", status);
			_params.put("mimeTypes", mimeTypes);
			_params.put("includeMountFolders", includeMountFolders);

			_command.put("/dlfolder/get-folders-and-file-entries-and-file-shortcuts-count",
				_params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)post(_command);
	}

	public Integer getFoldersCount(long groupId, long parentFolderId,
		int status, boolean includeMountfolders) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentFolderId", parentFolderId);
			_params.put("status", status);
			_params.put("includeMountfolders", includeMountfolders);

			_command.put("/dlfolder/get-folders-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)post(_command);
	}

	public JSONArray getMountFolders(long groupId, long parentFolderId,
		int start, int end, JSONObject obc) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentFolderId", parentFolderId);
			_params.put("start", start);
			_params.put("end", end);
			_params.put("obc", obc);

			_command.put("/dlfolder/get-mount-folders", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public Integer getMountFoldersCount(long groupId, long parentFolderId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentFolderId", parentFolderId);

			_command.put("/dlfolder/get-mount-folders-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)post(_command);
	}

	public JSONArray getSubfolderIds(long groupId, long folderId,
		boolean recurse) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("folderId", folderId);
			_params.put("recurse", recurse);

			_command.put("/dlfolder/get-subfolder-ids", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)post(_command);
	}

	public Boolean hasFolderLock(long folderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);

			_command.put("/dlfolder/has-folder-lock", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Boolean)post(_command);
	}

	public Boolean hasInheritableLock(long folderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);

			_command.put("/dlfolder/has-inheritable-lock", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Boolean)post(_command);
	}

	public Boolean isFolderLocked(long folderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);

			_command.put("/dlfolder/is-folder-locked", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Boolean)post(_command);
	}

	public JSONObject lockFolder(long folderId, String owner,
		boolean inheritable, long expirationTime) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("owner", owner);
			_params.put("inheritable", inheritable);
			_params.put("expirationTime", expirationTime);

			_command.put("/dlfolder/lock-folder", _params);
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

			_command.put("/dlfolder/move-folder", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public JSONObject refreshFolderLock(String lockUuid, long companyId,
		long expirationTime) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("lockUuid", lockUuid);
			_params.put("companyId", companyId);
			_params.put("expirationTime", expirationTime);

			_command.put("/dlfolder/refresh-folder-lock", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public void unlockFolder(long groupId, long parentFolderId, String name,
		String lockUuid) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentFolderId", parentFolderId);
			_params.put("name", name);
			_params.put("lockUuid", lockUuid);

			_command.put("/dlfolder/unlock-folder", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		post(_command);
	}

	public JSONObject updateFolder(long folderId, String name,
		String description, long defaultFileEntryTypeId,
		JSONArray fileEntryTypeIds, boolean overrideFileEntryTypes,
		JSONObject serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("name", name);
			_params.put("description", description);
			_params.put("defaultFileEntryTypeId", defaultFileEntryTypeId);
			_params.put("fileEntryTypeIds", fileEntryTypeIds);
			_params.put("overrideFileEntryTypes", overrideFileEntryTypes);
			_params.put("serviceContext", serviceContext);

			_command.put("/dlfolder/update-folder", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)post(_command);
	}

	public Boolean verifyInheritableLock(long folderId, String lockUuid)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("lockUuid", lockUuid);

			_command.put("/dlfolder/verify-inheritable-lock", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Boolean)post(_command);
	}
}