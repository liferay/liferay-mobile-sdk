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

package com.liferay.mobile.android.v62.bookmarksentry;

import com.liferay.mobile.android.service.BaseService;
import com.liferay.mobile.android.service.Session;
import com.liferay.mobile.android.task.callback.AsyncTaskCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Bruno Farache
 */
public class BookmarksEntryService extends BaseService {
	public BookmarksEntryService(Session session) {
		super(session);
	}

	public JSONObject addEntry(long groupId, long folderId, String name,
		String url, String description, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("folderId", folderId);
			_params.put("name", name);
			_params.put("url", url);
			_params.put("description", description);
			_params.put("serviceContext", serviceContext);

			_command.put("/bookmarksentry/add-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void deleteEntry(long entryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("entryId", entryId);

			_command.put("/bookmarksentry/delete-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONArray getEntries(long groupId, long folderId, int start,
		int end, JSONObject orderByComparator) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("folderId", folderId);
			_params.put("start", start);
			_params.put("end", end);
			_params.put("orderByComparator", orderByComparator);

			_command.put("/bookmarksentry/get-entries", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer getEntriesCount(long groupId, long folderId, int status)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("folderId", folderId);
			_params.put("status", status);

			_command.put("/bookmarksentry/get-entries-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONObject getEntry(long entryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("entryId", entryId);

			_command.put("/bookmarksentry/get-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public Integer getFoldersEntriesCount(long groupId, JSONArray folderIds)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("folderIds", folderIds);

			_command.put("/bookmarksentry/get-folders-entries-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONArray getGroupEntries(long groupId, long userId,
		long rootFolderId, int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("userId", userId);
			_params.put("rootFolderId", rootFolderId);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/bookmarksentry/get-group-entries", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONArray)session.invoke(_command);
	}

	public Integer getGroupEntriesCount(long groupId, long userId,
		long rootFolderId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("userId", userId);
			_params.put("rootFolderId", rootFolderId);

			_command.put("/bookmarksentry/get-group-entries-count", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (Integer)session.invoke(_command);
	}

	public JSONObject moveEntry(long entryId, long parentFolderId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("entryId", entryId);
			_params.put("parentFolderId", parentFolderId);

			_command.put("/bookmarksentry/move-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject moveEntryFromTrash(long entryId, long parentFolderId)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("entryId", entryId);
			_params.put("parentFolderId", parentFolderId);

			_command.put("/bookmarksentry/move-entry-from-trash", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject moveEntryToTrash(long entryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("entryId", entryId);

			_command.put("/bookmarksentry/move-entry-to-trash", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public JSONObject openEntry(long entryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("entryId", entryId);

			_command.put("/bookmarksentry/open-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void restoreEntryFromTrash(long entryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("entryId", entryId);

			_command.put("/bookmarksentry/restore-entry-from-trash", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject search(long groupId, long creatorUserId, int status,
		int start, int end) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("groupId", groupId);
			_params.put("creatorUserId", creatorUserId);
			_params.put("status", status);
			_params.put("start", start);
			_params.put("end", end);

			_command.put("/bookmarksentry/search", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}

	public void subscribeEntry(long entryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("entryId", entryId);

			_command.put("/bookmarksentry/subscribe-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public void unsubscribeEntry(long entryId) throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("entryId", entryId);

			_command.put("/bookmarksentry/unsubscribe-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		session.invoke(_command);
	}

	public JSONObject updateEntry(long entryId, long groupId, long folderId,
		String name, String url, String description, JSONObject serviceContext)
		throws Exception {
		JSONObject _command = new JSONObject();

		try {
			JSONObject _params = new JSONObject();

			_params.put("entryId", entryId);
			_params.put("groupId", groupId);
			_params.put("folderId", folderId);
			_params.put("name", name);
			_params.put("url", url);
			_params.put("description", description);
			_params.put("serviceContext", serviceContext);

			_command.put("/bookmarksentry/update-entry", _params);
		}
		catch (JSONException _je) {
			throw new Exception(_je);
		}

		return (JSONObject)session.invoke(_command);
	}
}