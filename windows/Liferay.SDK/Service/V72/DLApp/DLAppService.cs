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

namespace Liferay.SDK.Service.V72.DLApp
{
	public class DLAppService : ServiceBase
	{
		public DLAppService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> SearchAsync(long repositoryId, long creatorUserId, long folderId, IEnumerable<string> mimeTypes, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("creatorUserId", creatorUserId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlapp/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchAsync(long repositoryId, JsonObjectWrapper searchContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			this.MangleWrapper(_parameters, "searchContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", searchContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchAsync(long repositoryId, JsonObjectWrapper searchContext, JsonObjectWrapper query)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			this.MangleWrapper(_parameters, "searchContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", searchContext);
			this.MangleWrapper(_parameters, "query", "$languageUtil.getJSONWrapperClassName($parameter.type)", query);

			var _command = new JsonObject()
			{
				{ "/dlapp/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchAsync(long repositoryId, long creatorUserId, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("creatorUserId", creatorUserId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlapp/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddTempFileEntryAsync(long groupId, long folderId, string folderName, string fileName, Stream file, string mimeType)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("folderName", folderName);
			_parameters.Add("fileName", fileName);
			_parameters.Add("file", file);
			_parameters.Add("mimeType", mimeType);

			var _command = new JsonObject()
			{
				{ "/dlapp/add-temp-file-entry", _parameters }
			};

			var _obj = await this.Session.UploadAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteTempFileEntryAsync(long groupId, long folderId, string folderName, string fileName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("folderName", folderName);
			_parameters.Add("fileName", fileName);

			var _command = new JsonObject()
			{
				{ "/dlapp/delete-temp-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteFileEntryByTitleAsync(long repositoryId, long folderId, string title)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("title", title);

			var _command = new JsonObject()
			{
				{ "/dlapp/delete-file-entry-by-title", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> CheckOutFileEntryAsync(long fileEntryId, string owner, long expirationTime, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("owner", owner);
			_parameters.Add("expirationTime", expirationTime);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/check-out-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task CheckOutFileEntryAsync(long fileEntryId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/check-out-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetFileEntriesAndFileShortcutsAsync(long repositoryId, long folderId, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries-and-file-shortcuts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetFileEntriesAndFileShortcutsCountAsync(long repositoryId, long folderId, int status, IEnumerable<string> mimeTypes)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("mimeTypes", mimeTypes);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries-and-file-shortcuts-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFileEntriesAndFileShortcutsCountAsync(long repositoryId, long folderId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries-and-file-shortcuts-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAsync(long repositoryId, long parentFolderId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAsync(long repositoryId, long parentFolderId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAsync(long repositoryId, long parentFolderId, bool includeMountFolders, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("includeMountFolders", includeMountFolders);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAsync(long repositoryId, long parentFolderId, int status, bool includeMountFolders, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("status", status);
			_parameters.Add("includeMountFolders", includeMountFolders);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAsync(long repositoryId, long parentFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAsync(long repositoryId, long parentFolderId, bool includeMountFolders, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("includeMountFolders", includeMountFolders);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAsync(long repositoryId, long parentFolderId, bool includeMountFolders)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("includeMountFolders", includeMountFolders);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetFoldersAndFileEntriesAndFileShortcutsCountAsync(long repositoryId, long folderId, int status, IEnumerable<string> mimeTypes, bool includeMountFolders, bool includeOwner)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("includeMountFolders", includeMountFolders);
			_parameters.Add("includeOwner", includeOwner);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders-and-file-entries-and-file-shortcuts-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersAndFileEntriesAndFileShortcutsCountAsync(long repositoryId, long folderId, int status, IEnumerable<string> mimeTypes, bool includeMountFolders)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("includeMountFolders", includeMountFolders);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders-and-file-entries-and-file-shortcuts-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersAndFileEntriesAndFileShortcutsCountAsync(long repositoryId, long folderId, int status, bool includeMountFolders)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("includeMountFolders", includeMountFolders);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders-and-file-entries-and-file-shortcuts-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersCountAsync(long repositoryId, long parentFolderId, int status, bool includeMountFolders)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("status", status);
			_parameters.Add("includeMountFolders", includeMountFolders);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersCountAsync(long repositoryId, long parentFolderId, bool includeMountFolders)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("includeMountFolders", includeMountFolders);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersCountAsync(long repositoryId, long parentFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersFileEntriesCountAsync(long repositoryId, IEnumerable<long> folderIds, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderIds", folderIds);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupFileEntriesAsync(long groupId, long userId, long rootFolderId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("rootFolderId", rootFolderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-group-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupFileEntriesAsync(long groupId, long userId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-group-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupFileEntriesAsync(long groupId, long userId, long rootFolderId, IEnumerable<string> mimeTypes, int status, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("rootFolderId", rootFolderId);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-group-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupFileEntriesAsync(long groupId, long userId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-group-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetGroupFileEntriesAsync(long groupId, long userId, long rootFolderId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("rootFolderId", rootFolderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-group-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
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
				{ "/dlapp/get-group-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetGroupFileEntriesCountAsync(long groupId, long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-group-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetGroupFileEntriesCountAsync(long groupId, long userId, long rootFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("rootFolderId", rootFolderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-group-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetMountFoldersAsync(long repositoryId, long parentFolderId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-mount-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetMountFoldersAsync(long repositoryId, long parentFolderId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-mount-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetMountFoldersAsync(long repositoryId, long parentFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-mount-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetMountFoldersCountAsync(long repositoryId, long parentFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-mount-folders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<long>> GetSubfolderIdsAsync(long repositoryId, long folderId, bool recurse)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("recurse", recurse);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-subfolder-ids", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<long>();
		}

		public async Task<IEnumerable<long>> GetSubfolderIdsAsync(long repositoryId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-subfolder-ids", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<long>();
		}

		public async Task GetSubfolderIdsAsync(long repositoryId, IEnumerable<long> folderIds, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderIds", folderIds);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-subfolder-ids", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<string>> GetTempFileNamesAsync(long groupId, long folderId, string folderName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("folderName", folderName);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-temp-file-names", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<string>();
		}

		public async Task<dynamic> LockFolderAsync(long repositoryId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/lock-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> LockFolderAsync(long repositoryId, long folderId, string owner, bool inheritable, long expirationTime)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("owner", owner);
			_parameters.Add("inheritable", inheritable);
			_parameters.Add("expirationTime", expirationTime);

			var _command = new JsonObject()
			{
				{ "/dlapp/lock-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> RefreshFileEntryLockAsync(string lockUuid, long companyId, long expirationTime)
		{
			var _parameters = new JsonObject();

			_parameters.Add("lockUuid", lockUuid);
			_parameters.Add("companyId", companyId);
			_parameters.Add("expirationTime", expirationTime);

			var _command = new JsonObject()
			{
				{ "/dlapp/refresh-file-entry-lock", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> RefreshFolderLockAsync(string lockUuid, long companyId, long expirationTime)
		{
			var _parameters = new JsonObject();

			_parameters.Add("lockUuid", lockUuid);
			_parameters.Add("companyId", companyId);
			_parameters.Add("expirationTime", expirationTime);

			var _command = new JsonObject()
			{
				{ "/dlapp/refresh-folder-lock", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task RevertFileEntryAsync(long fileEntryId, string version, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("version", version);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/revert-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnlockFolderAsync(long repositoryId, long parentFolderId, string name, string lockUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);
			_parameters.Add("lockUuid", lockUuid);

			var _command = new JsonObject()
			{
				{ "/dlapp/unlock-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnlockFolderAsync(long repositoryId, long folderId, string lockUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("lockUuid", lockUuid);

			var _command = new JsonObject()
			{
				{ "/dlapp/unlock-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateFileEntryAndCheckInAsync(long fileEntryId, string sourceFileName, string mimeType, string title, string description, string changeLog, bool majorVersion, Stream file, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("sourceFileName", sourceFileName);
			_parameters.Add("mimeType", mimeType);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("changeLog", changeLog);
			_parameters.Add("majorVersion", majorVersion);
			_parameters.Add("file", file);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/update-file-entry-and-check-in", _parameters }
			};

			var _obj = await this.Session.UploadAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFileEntryAndCheckInAsync(long fileEntryId, string sourceFileName, string mimeType, string title, string description, string changeLog, JsonObjectWrapper dlVersionNumberIncrease, Stream file, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("sourceFileName", sourceFileName);
			_parameters.Add("mimeType", mimeType);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("changeLog", changeLog);
			this.MangleWrapper(_parameters, "dlVersionNumberIncrease", "$languageUtil.getJSONWrapperClassName($parameter.type)", dlVersionNumberIncrease);
			_parameters.Add("file", file);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/update-file-entry-and-check-in", _parameters }
			};

			var _obj = await this.Session.UploadAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<bool> VerifyFileEntryCheckOutAsync(long repositoryId, long fileEntryId, string lockUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("lockUuid", lockUuid);

			var _command = new JsonObject()
			{
				{ "/dlapp/verify-file-entry-check-out", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<bool> VerifyFileEntryLockAsync(long repositoryId, long fileEntryId, string lockUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("lockUuid", lockUuid);

			var _command = new JsonObject()
			{
				{ "/dlapp/verify-file-entry-lock", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<bool> VerifyInheritableLockAsync(long repositoryId, long folderId, string lockUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("lockUuid", lockUuid);

			var _command = new JsonObject()
			{
				{ "/dlapp/verify-inheritable-lock", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<dynamic> GetFolderAsync(long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetFolderAsync(long repositoryId, long parentFolderId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetFileVersionAsync(long fileVersionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileVersionId", fileVersionId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-version", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetFileEntryAsync(long groupId, long folderId, string title)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("title", title);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetFileEntryAsync(long fileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddFileEntryAsync(long repositoryId, long folderId, string sourceFileName, string mimeType, string title, string description, string changeLog, Stream file, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("sourceFileName", sourceFileName);
			_parameters.Add("mimeType", mimeType);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("changeLog", changeLog);
			_parameters.Add("file", file);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/add-file-entry", _parameters }
			};

			var _obj = await this.Session.UploadAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddFileEntryAsync(long repositoryId, long folderId, string sourceFileName, string mimeType, string title, string description, string changeLog, byte[] bytes, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("sourceFileName", sourceFileName);
			_parameters.Add("mimeType", mimeType);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("changeLog", changeLog);
			_parameters.Add("bytes", bytes);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/add-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFileEntriesAsync(long repositoryId, long folderId, long fileEntryTypeId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("fileEntryTypeId", fileEntryTypeId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFileEntriesAsync(long repositoryId, long folderId, long fileEntryTypeId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("fileEntryTypeId", fileEntryTypeId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFileEntriesAsync(long repositoryId, long folderId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFileEntriesAsync(long repositoryId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFileEntriesAsync(long repositoryId, long folderId, long fileEntryTypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("fileEntryTypeId", fileEntryTypeId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFileEntriesAsync(long repositoryId, long folderId, IEnumerable<string> mimeTypes)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("mimeTypes", mimeTypes);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFileEntriesAsync(long repositoryId, long folderId, IEnumerable<string> mimeTypes, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFileEntriesAsync(long repositoryId, long folderId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetFileEntriesCountAsync(long repositoryId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFileEntriesCountAsync(long repositoryId, long folderId, long fileEntryTypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("fileEntryTypeId", fileEntryTypeId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFileEntriesCountAsync(long repositoryId, long folderId, IEnumerable<string> mimeTypes)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("mimeTypes", mimeTypes);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> MoveFolderAsync(long folderId, long parentFolderId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("parentFolderId", parentFolderId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/move-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteFolderAsync(long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/delete-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteFolderAsync(long repositoryId, long parentFolderId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/dlapp/delete-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteFileEntryAsync(long fileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);

			var _command = new JsonObject()
			{
				{ "/dlapp/delete-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddFolderAsync(long repositoryId, long parentFolderId, string name, string description, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/add-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddFileShortcutAsync(long repositoryId, long folderId, long toFileEntryId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("toFileEntryId", toFileEntryId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/add-file-shortcut", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteFileShortcutAsync(long fileShortcutId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileShortcutId", fileShortcutId);

			var _command = new JsonObject()
			{
				{ "/dlapp/delete-file-shortcut", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteFileVersionAsync(long fileVersionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileVersionId", fileVersionId);

			var _command = new JsonObject()
			{
				{ "/dlapp/delete-file-version", _parameters }
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
				{ "/dlapp/delete-file-version", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetFileEntryByUuidAndGroupIdAsync(string uuid, long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("uuid", uuid);
			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-entry-by-uuid-and-group-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetFileShortcutAsync(long fileShortcutId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileShortcutId", fileShortcutId);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-file-shortcut", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> MoveFileEntryAsync(long fileEntryId, long newFolderId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("newFolderId", newFolderId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/move-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task SubscribeFileEntryTypeAsync(long groupId, long fileEntryTypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fileEntryTypeId", fileEntryTypeId);

			var _command = new JsonObject()
			{
				{ "/dlapp/subscribe-file-entry-type", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SubscribeFolderAsync(long groupId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/subscribe-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnsubscribeFileEntryTypeAsync(long groupId, long fileEntryTypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("fileEntryTypeId", fileEntryTypeId);

			var _command = new JsonObject()
			{
				{ "/dlapp/unsubscribe-file-entry-type", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnsubscribeFolderAsync(long groupId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlapp/unsubscribe-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateFileEntryAsync(long fileEntryId, string sourceFileName, string mimeType, string title, string description, string changeLog, bool majorVersion, byte[] bytes, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("sourceFileName", sourceFileName);
			_parameters.Add("mimeType", mimeType);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("changeLog", changeLog);
			_parameters.Add("majorVersion", majorVersion);
			_parameters.Add("bytes", bytes);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/update-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFileEntryAsync(long fileEntryId, string sourceFileName, string mimeType, string title, string description, string changeLog, bool majorVersion, Stream file, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("sourceFileName", sourceFileName);
			_parameters.Add("mimeType", mimeType);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("changeLog", changeLog);
			_parameters.Add("majorVersion", majorVersion);
			_parameters.Add("file", file);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/update-file-entry", _parameters }
			};

			var _obj = await this.Session.UploadAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFileEntryAsync(long fileEntryId, string sourceFileName, string mimeType, string title, string description, string changeLog, JsonObjectWrapper dlVersionNumberIncrease, byte[] bytes, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("sourceFileName", sourceFileName);
			_parameters.Add("mimeType", mimeType);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("changeLog", changeLog);
			this.MangleWrapper(_parameters, "dlVersionNumberIncrease", "$languageUtil.getJSONWrapperClassName($parameter.type)", dlVersionNumberIncrease);
			_parameters.Add("bytes", bytes);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/update-file-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFileEntryAsync(long fileEntryId, string sourceFileName, string mimeType, string title, string description, string changeLog, JsonObjectWrapper dlVersionNumberIncrease, Stream file, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("sourceFileName", sourceFileName);
			_parameters.Add("mimeType", mimeType);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("changeLog", changeLog);
			this.MangleWrapper(_parameters, "dlVersionNumberIncrease", "$languageUtil.getJSONWrapperClassName($parameter.type)", dlVersionNumberIncrease);
			_parameters.Add("file", file);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/update-file-entry", _parameters }
			};

			var _obj = await this.Session.UploadAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFileShortcutAsync(long fileShortcutId, long folderId, long toFileEntryId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileShortcutId", fileShortcutId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("toFileEntryId", toFileEntryId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/update-file-shortcut", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFolderAsync(long folderId, string name, string description, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/update-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> CopyFolderAsync(long repositoryId, long sourceFolderId, long parentFolderId, string name, string description, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("sourceFolderId", sourceFolderId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/copy-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAndFileEntriesAndFileShortcutsAsync(long repositoryId, long folderId, int status, IEnumerable<string> mimeTypes, bool includeMountFolders, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("includeMountFolders", includeMountFolders);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders-and-file-entries-and-file-shortcuts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAndFileEntriesAndFileShortcutsAsync(long repositoryId, long folderId, int status, IEnumerable<string> mimeTypes, bool includeMountFolders, bool includeOwner, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("includeMountFolders", includeMountFolders);
			_parameters.Add("includeOwner", includeOwner);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders-and-file-entries-and-file-shortcuts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAndFileEntriesAndFileShortcutsAsync(long repositoryId, long folderId, int status, bool includeMountFolders, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("includeMountFolders", includeMountFolders);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders-and-file-entries-and-file-shortcuts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAndFileEntriesAndFileShortcutsAsync(long repositoryId, long folderId, int status, bool includeMountFolders, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("includeMountFolders", includeMountFolders);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlapp/get-folders-and-file-entries-and-file-shortcuts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task CheckInFileEntryAsync(long fileEntryId, JsonObjectWrapper dlVersionNumberIncrease, string changeLog, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			this.MangleWrapper(_parameters, "dlVersionNumberIncrease", "$languageUtil.getJSONWrapperClassName($parameter.type)", dlVersionNumberIncrease);
			_parameters.Add("changeLog", changeLog);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/check-in-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task CheckInFileEntryAsync(long fileEntryId, bool majorVersion, string changeLog, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("majorVersion", majorVersion);
			_parameters.Add("changeLog", changeLog);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/check-in-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task CheckInFileEntryAsync(long fileEntryId, string lockUuid, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("lockUuid", lockUuid);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlapp/check-in-file-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task CancelCheckOutAsync(long fileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);

			var _command = new JsonObject()
			{
				{ "/dlapp/cancel-check-out", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}