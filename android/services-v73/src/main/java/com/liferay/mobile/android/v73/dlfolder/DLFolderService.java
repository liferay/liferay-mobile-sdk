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

package com.liferay.mobile.android.v73.dlfolder;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.service.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class DLFolderService extends BaseService {

	public DLFolderService(Session session) {
		super(session);
	}

	public JSONObject addFolder(long groupId, long repositoryId, boolean mountPoint, long parentFolderId, String name, String description, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("description", checkNull(description));
			_params.put("groupId", groupId);
			_params.put("mountPoint", mountPoint);
			_params.put("name", checkNull(name));
			_params.put("parentFolderId", parentFolderId);
			_params.put("repositoryId", repositoryId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/dlfolder/add-folder", _params);
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

	public void deleteFolder(long folderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);

			_command.put("/dlfolder/delete-folder", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void deleteFolder(long folderId, boolean includeTrashedEntries) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("includeTrashedEntries", includeTrashedEntries);

			_command.put("/dlfolder/delete-folder", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void deleteFolder(long groupId, long parentFolderId, String name) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("parentFolderId", parentFolderId);

			_command.put("/dlfolder/delete-folder", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONArray getFileEntriesAndFileShortcuts(long groupId, long folderId, int status, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("folderId", folderId);
			_params.put("groupId", groupId);
			_params.put("start", start);
			_params.put("status", status);

			_command.put("/dlfolder/get-file-entries-and-file-shortcuts", _params);
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

	public Integer getFileEntriesAndFileShortcutsCount(long groupId, long folderId, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("groupId", groupId);
			_params.put("status", status);

			_command.put("/dlfolder/get-file-entries-and-file-shortcuts-count", _params);
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

	public Integer getFileEntriesAndFileShortcutsCount(long groupId, long folderId, int status, JSONArray mimeTypes) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("groupId", groupId);
			_params.put("mimeTypes", checkNull(mimeTypes));
			_params.put("status", status);

			_command.put("/dlfolder/get-file-entries-and-file-shortcuts-count", _params);
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

	public Integer getFileEntriesAndFileShortcutsCount(long groupId, long folderId, JSONArray mimeTypes, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("groupId", groupId);
			_params.put("mimeTypes", checkNull(mimeTypes));
			_params.put("status", status);

			_command.put("/dlfolder/get-file-entries-and-file-shortcuts-count", _params);
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

	public JSONObject getFolder(long folderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);

			_command.put("/dlfolder/get-folder", _params);
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

	public JSONObject getFolder(long groupId, long parentFolderId, String name) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("name", checkNull(name));
			_params.put("parentFolderId", parentFolderId);

			_command.put("/dlfolder/get-folder", _params);
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

	public JSONArray getFolderIds(long groupId, long folderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("groupId", groupId);

			_command.put("/dlfolder/get-folder-ids", _params);
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

	public JSONArray getFolders(long groupId, long parentFolderId, boolean includeMountfolders, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("includeMountfolders", includeMountfolders);
			_params.put("parentFolderId", parentFolderId);
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.document.library.kernel.model.DLFolder>", orderByComparator);

			_command.put("/dlfolder/get-folders", _params);
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

	public JSONArray getFolders(long groupId, long parentFolderId, int status, boolean includeMountfolders, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("includeMountfolders", includeMountfolders);
			_params.put("parentFolderId", parentFolderId);
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.document.library.kernel.model.DLFolder>", orderByComparator);

			_command.put("/dlfolder/get-folders", _params);
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

	public JSONArray getFolders(long groupId, long parentFolderId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("parentFolderId", parentFolderId);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.document.library.kernel.model.DLFolder>", orderByComparator);

			_command.put("/dlfolder/get-folders", _params);
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

	public JSONArray getFoldersAndFileEntriesAndFileShortcuts(long groupId, long folderId, boolean includeMountFolders, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("folderId", folderId);
			_params.put("groupId", groupId);
			_params.put("includeMountFolders", includeMountFolders);
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator", orderByComparator);

			_command.put("/dlfolder/get-folders-and-file-entries-and-file-shortcuts", _params);
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

	public JSONArray getFoldersAndFileEntriesAndFileShortcuts(long groupId, long folderId, int status, boolean includeMountFolders, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("folderId", folderId);
			_params.put("groupId", groupId);
			_params.put("includeMountFolders", includeMountFolders);
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator", orderByComparator);

			_command.put("/dlfolder/get-folders-and-file-entries-and-file-shortcuts", _params);
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

	public JSONArray getFoldersAndFileEntriesAndFileShortcuts(long groupId, long folderId, int status, JSONArray mimeTypes, boolean includeMountFolders, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("folderId", folderId);
			_params.put("groupId", groupId);
			_params.put("includeMountFolders", includeMountFolders);
			_params.put("mimeTypes", checkNull(mimeTypes));
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator", orderByComparator);

			_command.put("/dlfolder/get-folders-and-file-entries-and-file-shortcuts", _params);
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

	public JSONArray getFoldersAndFileEntriesAndFileShortcuts(long groupId, long folderId, JSONArray mimeTypes, boolean includeMountFolders, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("folderId", folderId);
			_params.put("groupId", groupId);
			_params.put("includeMountFolders", includeMountFolders);
			_params.put("mimeTypes", checkNull(mimeTypes));
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator", orderByComparator);

			_command.put("/dlfolder/get-folders-and-file-entries-and-file-shortcuts", _params);
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

	public JSONArray getFoldersAndFileEntriesAndFileShortcuts(long groupId, long folderId, JSONArray mimeTypes, boolean includeMountFolders, JSONObjectWrapper queryDefinition) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("groupId", groupId);
			_params.put("includeMountFolders", includeMountFolders);
			_params.put("mimeTypes", checkNull(mimeTypes));
			mangleWrapper(_params, "queryDefinition", "com.liferay.portal.kernel.dao.orm.QueryDefinition", queryDefinition);

			_command.put("/dlfolder/get-folders-and-file-entries-and-file-shortcuts", _params);
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

	public JSONArray getFoldersAndFileEntriesAndFileShortcuts(long groupId, long folderId, JSONArray mimeTypes, long fileEntryTypeId, boolean includeMountFolders, int status, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("fileEntryTypeId", fileEntryTypeId);
			_params.put("folderId", folderId);
			_params.put("groupId", groupId);
			_params.put("includeMountFolders", includeMountFolders);
			_params.put("mimeTypes", checkNull(mimeTypes));
			_params.put("start", start);
			_params.put("status", status);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator", orderByComparator);

			_command.put("/dlfolder/get-folders-and-file-entries-and-file-shortcuts", _params);
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

	public Integer getFoldersAndFileEntriesAndFileShortcutsCount(long groupId, long folderId, int status, boolean includeMountFolders) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("groupId", groupId);
			_params.put("includeMountFolders", includeMountFolders);
			_params.put("status", status);

			_command.put("/dlfolder/get-folders-and-file-entries-and-file-shortcuts-count", _params);
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

	public Integer getFoldersAndFileEntriesAndFileShortcutsCount(long groupId, long folderId, int status, JSONArray mimeTypes, boolean includeMountFolders) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("groupId", groupId);
			_params.put("includeMountFolders", includeMountFolders);
			_params.put("mimeTypes", checkNull(mimeTypes));
			_params.put("status", status);

			_command.put("/dlfolder/get-folders-and-file-entries-and-file-shortcuts-count", _params);
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

	public Integer getFoldersAndFileEntriesAndFileShortcutsCount(long groupId, long folderId, JSONArray mimeTypes, boolean includeMountFolders, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("groupId", groupId);
			_params.put("includeMountFolders", includeMountFolders);
			_params.put("mimeTypes", checkNull(mimeTypes));
			_params.put("status", status);

			_command.put("/dlfolder/get-folders-and-file-entries-and-file-shortcuts-count", _params);
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

	public Integer getFoldersAndFileEntriesAndFileShortcutsCount(long groupId, long folderId, JSONArray mimeTypes, boolean includeMountFolders, JSONObjectWrapper queryDefinition) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("groupId", groupId);
			_params.put("includeMountFolders", includeMountFolders);
			_params.put("mimeTypes", checkNull(mimeTypes));
			mangleWrapper(_params, "queryDefinition", "com.liferay.portal.kernel.dao.orm.QueryDefinition", queryDefinition);

			_command.put("/dlfolder/get-folders-and-file-entries-and-file-shortcuts-count", _params);
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

	public Integer getFoldersAndFileEntriesAndFileShortcutsCount(long groupId, long folderId, JSONArray mimeTypes, long fileEntryTypeId, boolean includeMountFolders, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("fileEntryTypeId", fileEntryTypeId);
			_params.put("folderId", folderId);
			_params.put("groupId", groupId);
			_params.put("includeMountFolders", includeMountFolders);
			_params.put("mimeTypes", checkNull(mimeTypes));
			_params.put("status", status);

			_command.put("/dlfolder/get-folders-and-file-entries-and-file-shortcuts-count", _params);
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

	public Integer getFoldersCount(long groupId, long parentFolderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentFolderId", parentFolderId);

			_command.put("/dlfolder/get-folders-count", _params);
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

	public Integer getFoldersCount(long groupId, long parentFolderId, boolean includeMountfolders, int status) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("includeMountfolders", includeMountfolders);
			_params.put("parentFolderId", parentFolderId);
			_params.put("status", status);

			_command.put("/dlfolder/get-folders-count", _params);
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

	public Integer getFoldersCount(long groupId, long parentFolderId, int status, boolean includeMountfolders) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("includeMountfolders", includeMountfolders);
			_params.put("parentFolderId", parentFolderId);
			_params.put("status", status);

			_command.put("/dlfolder/get-folders-count", _params);
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

	public JSONArray getMountFolders(long groupId, long parentFolderId, int start, int end, JSONObjectWrapper orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("end", end);
			_params.put("groupId", groupId);
			_params.put("parentFolderId", parentFolderId);
			_params.put("start", start);
			mangleWrapper(_params, "orderByComparator", "com.liferay.portal.kernel.util.OrderByComparator<com.liferay.document.library.kernel.model.DLFolder>", orderByComparator);

			_command.put("/dlfolder/get-mount-folders", _params);
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

	public Integer getMountFoldersCount(long groupId, long parentFolderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("parentFolderId", parentFolderId);

			_command.put("/dlfolder/get-mount-folders-count", _params);
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

	public void getSubfolderIds(JSONArray folderIds, long groupId, long folderId, boolean recurse) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("folderIds", checkNull(folderIds));
			_params.put("groupId", groupId);
			_params.put("recurse", recurse);

			_command.put("/dlfolder/get-subfolder-ids", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONArray getSubfolderIds(long groupId, long folderId, boolean recurse) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("groupId", groupId);
			_params.put("recurse", recurse);

			_command.put("/dlfolder/get-subfolder-ids", _params);
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

	public Boolean hasFolderLock(long folderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);

			_command.put("/dlfolder/has-folder-lock", _params);
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

	public Boolean hasInheritableLock(long folderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);

			_command.put("/dlfolder/has-inheritable-lock", _params);
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

	public Boolean isFolderLocked(long folderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);

			_command.put("/dlfolder/is-folder-locked", _params);
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

	public JSONObject lockFolder(long folderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);

			_command.put("/dlfolder/lock-folder", _params);
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

	public JSONObject lockFolder(long folderId, String owner, boolean inheritable, long expirationTime) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("expirationTime", expirationTime);
			_params.put("folderId", folderId);
			_params.put("inheritable", inheritable);
			_params.put("owner", checkNull(owner));

			_command.put("/dlfolder/lock-folder", _params);
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

	public JSONObject moveFolder(long folderId, long parentFolderId, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("parentFolderId", parentFolderId);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/dlfolder/move-folder", _params);
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

	public JSONObject refreshFolderLock(String lockUuid, long companyId, long expirationTime) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("companyId", companyId);
			_params.put("expirationTime", expirationTime);
			_params.put("lockUuid", checkNull(lockUuid));

			_command.put("/dlfolder/refresh-folder-lock", _params);
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

	public void unlockFolder(long groupId, long parentFolderId, String name, String lockUuid) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("lockUuid", checkNull(lockUuid));
			_params.put("name", checkNull(name));
			_params.put("parentFolderId", parentFolderId);

			_command.put("/dlfolder/unlock-folder", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public void unlockFolder(long folderId, String lockUuid) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("lockUuid", checkNull(lockUuid));

			_command.put("/dlfolder/unlock-folder", _params);
		}
		catch (JSONException jsone) {
			throw new Exception(jsone);
		}

		session.invoke(_command);
	}

	public JSONObject updateFolder(long folderId, long parentFolderId, String name, String description, long defaultFileEntryTypeId, JSONArray fileEntryTypeIds, int restrictionType, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("defaultFileEntryTypeId", defaultFileEntryTypeId);
			_params.put("description", checkNull(description));
			_params.put("fileEntryTypeIds", checkNull(fileEntryTypeIds));
			_params.put("folderId", folderId);
			_params.put("name", checkNull(name));
			_params.put("parentFolderId", parentFolderId);
			_params.put("restrictionType", restrictionType);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/dlfolder/update-folder", _params);
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

	public JSONObject updateFolder(long folderId, String name, String description, long defaultFileEntryTypeId, JSONArray fileEntryTypeIds, int restrictionType, JSONObjectWrapper serviceContext) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("defaultFileEntryTypeId", defaultFileEntryTypeId);
			_params.put("description", checkNull(description));
			_params.put("fileEntryTypeIds", checkNull(fileEntryTypeIds));
			_params.put("folderId", folderId);
			_params.put("name", checkNull(name));
			_params.put("restrictionType", restrictionType);
			mangleWrapper(_params, "serviceContext", "com.liferay.portal.kernel.service.ServiceContext", serviceContext);

			_command.put("/dlfolder/update-folder", _params);
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

	public Boolean verifyInheritableLock(long folderId, String lockUuid) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("folderId", folderId);
			_params.put("lockUuid", checkNull(lockUuid));

			_command.put("/dlfolder/verify-inheritable-lock", _params);
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

}