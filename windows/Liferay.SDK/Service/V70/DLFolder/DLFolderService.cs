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

namespace Liferay.SDK.Service.V70.DLFolder
{
	public class DLFolderService : ServiceBase
	{
		public DLFolderService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<long>> GetFolderIdsAsync(long groupId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-folder-ids", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<long>();
		}

		public async Task<bool> HasFolderLockAsync(long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlfolder/has-folder-lock", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<bool> IsFolderLockedAsync(long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlfolder/is-folder-locked", _parameters }
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
				{ "/dlfolder/get-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetFolderAsync(long groupId, long parentFolderId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAsync(long groupId, long parentFolderId, int status, bool includeMountfolders, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("status", status);
			_parameters.Add("includeMountfolders", includeMountfolders);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAsync(long groupId, long parentFolderId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> AddFolderAsync(long groupId, long repositoryId, bool mountPoint, long parentFolderId, string name, string description, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("mountPoint", mountPoint);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfolder/add-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> MoveFolderAsync(long folderId, long parentFolderId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("parentFolderId", parentFolderId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfolder/move-folder", _parameters }
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
				{ "/dlfolder/delete-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteFolderAsync(long folderId, bool includeTrashedEntries)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("includeTrashedEntries", includeTrashedEntries);

			var _command = new JsonObject()
			{
				{ "/dlfolder/delete-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteFolderAsync(long groupId, long parentFolderId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/dlfolder/delete-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateFolderAsync(long folderId, long parentFolderId, string name, string description, long defaultFileEntryTypeId, IEnumerable<long> fileEntryTypeIds, int restrictionType, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("defaultFileEntryTypeId", defaultFileEntryTypeId);
			_parameters.Add("fileEntryTypeIds", fileEntryTypeIds);
			_parameters.Add("restrictionType", restrictionType);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfolder/update-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFolderAsync(long folderId, string name, string description, long defaultFileEntryTypeId, IEnumerable<long> fileEntryTypeIds, bool overrideFileEntryTypes, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("defaultFileEntryTypeId", defaultFileEntryTypeId);
			_parameters.Add("fileEntryTypeIds", fileEntryTypeIds);
			_parameters.Add("overrideFileEntryTypes", overrideFileEntryTypes);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfolder/update-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFolderAsync(long folderId, string name, string description, long defaultFileEntryTypeId, IEnumerable<long> fileEntryTypeIds, int restrictionType, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("defaultFileEntryTypeId", defaultFileEntryTypeId);
			_parameters.Add("fileEntryTypeIds", fileEntryTypeIds);
			_parameters.Add("restrictionType", restrictionType);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dlfolder/update-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAndFileEntriesAndFileShortcutsAsync(long groupId, long folderId, IEnumerable<string> mimeTypes, bool includeMountFolders, JsonObjectWrapper queryDefinition)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("includeMountFolders", includeMountFolders);
			this.MangleWrapper(_parameters, "queryDefinition", "$languageUtil.getJSONWrapperClassName($parameter.type)", queryDefinition);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-folders-and-file-entries-and-file-shortcuts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAndFileEntriesAndFileShortcutsAsync(long groupId, long folderId, int status, IEnumerable<string> mimeTypes, bool includeMountFolders, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("includeMountFolders", includeMountFolders);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-folders-and-file-entries-and-file-shortcuts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAndFileEntriesAndFileShortcutsAsync(long groupId, long folderId, int status, bool includeMountFolders, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("includeMountFolders", includeMountFolders);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-folders-and-file-entries-and-file-shortcuts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFileEntriesAndFileShortcutsAsync(long groupId, long folderId, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-file-entries-and-file-shortcuts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetFileEntriesAndFileShortcutsCountAsync(long groupId, long folderId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-file-entries-and-file-shortcuts-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFileEntriesAndFileShortcutsCountAsync(long groupId, long folderId, int status, IEnumerable<string> mimeTypes)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("mimeTypes", mimeTypes);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-file-entries-and-file-shortcuts-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersAndFileEntriesAndFileShortcutsCountAsync(long groupId, long folderId, IEnumerable<string> mimeTypes, bool includeMountFolders, JsonObjectWrapper queryDefinition)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("includeMountFolders", includeMountFolders);
			this.MangleWrapper(_parameters, "queryDefinition", "$languageUtil.getJSONWrapperClassName($parameter.type)", queryDefinition);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-folders-and-file-entries-and-file-shortcuts-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersAndFileEntriesAndFileShortcutsCountAsync(long groupId, long folderId, int status, bool includeMountFolders)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("includeMountFolders", includeMountFolders);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-folders-and-file-entries-and-file-shortcuts-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersAndFileEntriesAndFileShortcutsCountAsync(long groupId, long folderId, int status, IEnumerable<string> mimeTypes, bool includeMountFolders)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("mimeTypes", mimeTypes);
			_parameters.Add("includeMountFolders", includeMountFolders);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-folders-and-file-entries-and-file-shortcuts-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersCountAsync(long groupId, long parentFolderId, int status, bool includeMountfolders)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("status", status);
			_parameters.Add("includeMountfolders", includeMountfolders);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-folders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersCountAsync(long groupId, long parentFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentFolderId", parentFolderId);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-folders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetMountFoldersAsync(long groupId, long parentFolderId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-mount-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetMountFoldersCountAsync(long groupId, long parentFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentFolderId", parentFolderId);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-mount-folders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<long>> GetSubfolderIdsAsync(long groupId, long folderId, bool recurse)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("recurse", recurse);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-subfolder-ids", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<long>();
		}

		public async Task GetSubfolderIdsAsync(IEnumerable<long> folderIds, long groupId, long folderId, bool recurse)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderIds", folderIds);
			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("recurse", recurse);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-subfolder-ids", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task GetSubfolderIdsAsync(IEnumerable<long> folderIds, long groupId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderIds", folderIds);
			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlfolder/get-subfolder-ids", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> LockFolderAsync(long folderId, string owner, bool inheritable, long expirationTime)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("owner", owner);
			_parameters.Add("inheritable", inheritable);
			_parameters.Add("expirationTime", expirationTime);

			var _command = new JsonObject()
			{
				{ "/dlfolder/lock-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> LockFolderAsync(long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlfolder/lock-folder", _parameters }
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
				{ "/dlfolder/refresh-folder-lock", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task UnlockFolderAsync(long folderId, string lockUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("lockUuid", lockUuid);

			var _command = new JsonObject()
			{
				{ "/dlfolder/unlock-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UnlockFolderAsync(long groupId, long parentFolderId, string name, string lockUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);
			_parameters.Add("lockUuid", lockUuid);

			var _command = new JsonObject()
			{
				{ "/dlfolder/unlock-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<bool> VerifyInheritableLockAsync(long folderId, string lockUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("lockUuid", lockUuid);

			var _command = new JsonObject()
			{
				{ "/dlfolder/verify-inheritable-lock", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}

		public async Task<bool> HasInheritableLockAsync(long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dlfolder/has-inheritable-lock", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (bool)_obj;
		}
	}
}