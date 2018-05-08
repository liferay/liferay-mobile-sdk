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

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading.Tasks;

namespace Liferay.SDK.Service.V62.DLFileEntry
{
	public class DLFileEntryService : ServiceBase
	{
		public DLFileEntryService(ISession session)
			: base(session)
		{
		}

		public async Task<IDictionary<string, object>> CancelCheckOutAsync(long fileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/cancel-check-out", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task CheckInFileEntryAsync(long fileEntryId, string lockUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("lockUuid", lockUuid);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/check-in-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task CheckInFileEntryAsync(long fileEntryId, string lockUuid, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("lockUuid", lockUuid);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/check-in-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task CheckInFileEntryAsync(long fileEntryId, bool major, string changeLog, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("major", major);
			_parameters.Add("changeLog", changeLog);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/check-in-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> CheckOutFileEntryAsync(long fileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/check-out-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> CheckOutFileEntryAsync(long fileEntryId, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/check-out-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> CheckOutFileEntryAsync(long fileEntryId, string owner, long expirationTime)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("owner", owner);
			_parameters.Add("expirationTime", expirationTime);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/check-out-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> CheckOutFileEntryAsync(long fileEntryId, string owner, long expirationTime, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("owner", owner);
			_parameters.Add("expirationTime", expirationTime);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/check-out-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> CopyFileEntryAsync(long groupId, long repositoryId, long fileEntryId, long destFolderId, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("destFolderId", destFolderId);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/copy-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task DeleteFileEntryAsync(long fileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/delete-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteFileEntryAsync(long groupId, long folderId, string title)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("title", title);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/delete-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteFileVersionAsync(long fileEntryId, string version)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("version", version);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/delete-file-version", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> FetchFileEntryByImageIdAsync(long imageId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("imageId", imageId);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/fetch-file-entry-by-image-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetFileEntriesAsync(long groupId, long folderId, int start, int end, IDictionary<string, object> obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("obc", obc);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetFileEntriesAsync(long groupId, long folderId, long fileEntryTypeId, int start, int end, IDictionary<string, object> obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("fileEntryTypeId", fileEntryTypeId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("obc", obc);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetFileEntriesAsync(long groupId, long folderId, IEnumerable<string> mimeTypes, int start, int end, IDictionary<string, object> obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("obc", obc);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetFileEntriesAsync(long groupId, long folderId, int status, int start, int end, IDictionary<string, object> obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("obc", obc);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<long> GetFileEntriesCountAsync(long groupId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFileEntriesCountAsync(long groupId, long folderId, long fileEntryTypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("fileEntryTypeId", fileEntryTypeId);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFileEntriesCountAsync(long groupId, long folderId, IEnumerable<string> mimeTypes)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("mimeTypes", mimeTypes);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFileEntriesCountAsync(long groupId, long folderId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IDictionary<string, object>> GetFileEntryAsync(long fileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetFileEntryAsync(long groupId, long folderId, string title)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("title", title);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetFileEntryByUuidAndGroupIdAsync(string uuid, long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("uuid", uuid);
			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-file-entry-by-uuid-and-group-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetFileEntryLockAsync(long fileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-file-entry-lock", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<long> GetFoldersFileEntriesCountAsync(long groupId, IEnumerable<object> folderIds, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderIds", folderIds);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-folders-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IDictionary<string, object>> GetGroupFileEntriesAsync(long groupId, long userId, long rootFolderId, int start, int end, IDictionary<string, object> obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("rootFolderId", rootFolderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("obc", obc);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-group-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetGroupFileEntriesAsync(long groupId, long userId, long rootFolderId, IEnumerable<string> mimeTypes, int status, int start, int end, IDictionary<string, object> obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("rootFolderId", rootFolderId);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("obc", obc);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-group-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetGroupFileEntriesAsync(long groupId, long userId, long repositoryId, long rootFolderId, IEnumerable<string> mimeTypes, int status, int start, int end, IDictionary<string, object> obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("rootFolderId", rootFolderId);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("obc", obc);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-group-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<long> GetGroupFileEntriesCountAsync(long groupId, long userId, long rootFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("rootFolderId", rootFolderId);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-group-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetGroupFileEntriesCountAsync(long groupId, long userId, long rootFolderId, IEnumerable<string> mimeTypes, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("rootFolderId", rootFolderId);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-group-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetGroupFileEntriesCountAsync(long groupId, long userId, long repositoryId, long rootFolderId, IEnumerable<string> mimeTypes, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("rootFolderId", rootFolderId);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/get-group-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<bool> HasFileEntryLockAsync(long fileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/has-file-entry-lock", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<bool> IsFileEntryCheckedOutAsync(long fileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/is-file-entry-checked-out", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<IDictionary<string, object>> MoveFileEntryAsync(long fileEntryId, long newFolderId, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("newFolderId", newFolderId);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/move-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> RefreshFileEntryLockAsync(string lockUuid, long companyId, long expirationTime)
		{
			var _parameters = new JsonObject();

			_parameters.Add("lockUuid", lockUuid);
			_parameters.Add("companyId", companyId);
			_parameters.Add("expirationTime", expirationTime);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/refresh-file-entry-lock", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task RevertFileEntryAsync(long fileEntryId, string version, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("version", version);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/revert-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> SearchAsync(long groupId, long creatorUserId, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("creatorUserId", creatorUserId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> SearchAsync(long groupId, long creatorUserId, long folderId, IEnumerable<string> mimeTypes, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("creatorUserId", creatorUserId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<bool> VerifyFileEntryCheckOutAsync(long fileEntryId, string lockUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("lockUuid", lockUuid);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/verify-file-entry-check-out", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<bool> VerifyFileEntryLockAsync(long fileEntryId, string lockUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("lockUuid", lockUuid);

			var _command = new JsonObject()
			{
				{ "/dlfileentry/verify-file-entry-lock", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}
	}
}