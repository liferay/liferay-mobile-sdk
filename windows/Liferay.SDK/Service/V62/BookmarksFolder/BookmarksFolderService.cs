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

namespace Liferay.SDK.Service.V62.BookmarksFolder
{
	public class BookmarksFolderService : ServiceBase
	{
		public BookmarksFolderService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddFolderAsync(long parentFolderId, string name, string description, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/bookmarksfolder/add-folder", _parameters }
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
				{ "/bookmarksfolder/delete-folder", _parameters }
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
				{ "/bookmarksfolder/delete-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetFolderAsync(long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/bookmarksfolder/get-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFolderIdsAsync(long groupId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/bookmarksfolder/get-folder-ids", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/bookmarksfolder/get-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAsync(long groupId, long parentFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentFolderId", parentFolderId);

			var _command = new JsonObject()
			{
				{ "/bookmarksfolder/get-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAsync(long groupId, long parentFolderId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/bookmarksfolder/get-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAsync(long groupId, long parentFolderId, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/bookmarksfolder/get-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAndEntriesAsync(long groupId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/bookmarksfolder/get-folders-and-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAndEntriesAsync(long groupId, long folderId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/bookmarksfolder/get-folders-and-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAndEntriesAsync(long groupId, long folderId, int status, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/bookmarksfolder/get-folders-and-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetFoldersAndEntriesCountAsync(long groupId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/bookmarksfolder/get-folders-and-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersAndEntriesCountAsync(long groupId, long folderId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/bookmarksfolder/get-folders-and-entries-count", _parameters }
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
				{ "/bookmarksfolder/get-folders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersCountAsync(long groupId, long parentFolderId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/bookmarksfolder/get-folders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task GetSubfolderIdsAsync(IEnumerable<object> folderIds, long groupId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderIds", folderIds);
			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/bookmarksfolder/get-subfolder-ids", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetSubfolderIdsAsync(long groupId, long folderId, bool recurse)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("recurse", recurse);

			var _command = new JsonObject()
			{
				{ "/bookmarksfolder/get-subfolder-ids", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task GetSubfolderIdsAsync(IEnumerable<object> folderIds, long groupId, long folderId, bool recurse)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderIds", folderIds);
			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("recurse", recurse);

			var _command = new JsonObject()
			{
				{ "/bookmarksfolder/get-subfolder-ids", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> MoveFolderAsync(long folderId, long parentFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("parentFolderId", parentFolderId);

			var _command = new JsonObject()
			{
				{ "/bookmarksfolder/move-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> MoveFolderFromTrashAsync(long folderId, long parentFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("parentFolderId", parentFolderId);

			var _command = new JsonObject()
			{
				{ "/bookmarksfolder/move-folder-from-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> MoveFolderToTrashAsync(long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/bookmarksfolder/move-folder-to-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task RestoreFolderFromTrashAsync(long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/bookmarksfolder/restore-folder-from-trash", _parameters }
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
				{ "/bookmarksfolder/subscribe-folder", _parameters }
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
				{ "/bookmarksfolder/unsubscribe-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateFolderAsync(long folderId, long parentFolderId, string name, string description, bool mergeWithParentFolder, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("mergeWithParentFolder", mergeWithParentFolder);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/bookmarksfolder/update-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}