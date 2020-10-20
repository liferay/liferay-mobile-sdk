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

namespace Liferay.SDK.Service.V73.JournalFolder
{
	public class JournalFolderService : ServiceBase
	{
		public JournalFolderService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> GetFolderAsync(long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/journal.journalfolder/get-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetDdmStructuresAsync(IEnumerable<long> groupIds, long folderId, int restrictionType, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);
			_parameters.Add("folderId", folderId);
			_parameters.Add("restrictionType", restrictionType);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/journal.journalfolder/get-ddm-structures", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetDdmStructuresAsync(IEnumerable<long> groupIds, long folderId, int restrictionType)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupIds", groupIds);
			_parameters.Add("folderId", folderId);
			_parameters.Add("restrictionType", restrictionType);

			var _command = new JsonObject()
			{
				{ "/journal.journalfolder/get-ddm-structures", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> MoveFolderFromTrashAsync(long folderId, long parentFolderId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("parentFolderId", parentFolderId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journal.journalfolder/move-folder-from-trash", _parameters }
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
				{ "/journal.journalfolder/move-folder-to-trash", _parameters }
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
				{ "/journal.journalfolder/restore-folder-from-trash", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddFolderAsync(long groupId, long parentFolderId, string name, string description, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journal.journalfolder/add-folder", _parameters }
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
				{ "/journal.journalfolder/delete-folder", _parameters }
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
				{ "/journal.journalfolder/delete-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> MoveFolderAsync(long folderId, long parentFolderId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("parentFolderId", parentFolderId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journal.journalfolder/move-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFolderAsync(long groupId, long folderId, long parentFolderId, string name, string description, bool mergeWithParentFolder, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("mergeWithParentFolder", mergeWithParentFolder);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journal.journalfolder/update-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFolderAsync(long groupId, long folderId, long parentFolderId, string name, string description, IEnumerable<long> ddmStructureIds, int restrictionType, bool mergeWithParentFolder, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("ddmStructureIds", ddmStructureIds);
			_parameters.Add("restrictionType", restrictionType);
			_parameters.Add("mergeWithParentFolder", mergeWithParentFolder);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/journal.journalfolder/update-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/journal.journalfolder/get-folders", _parameters }
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
				{ "/journal.journalfolder/get-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAsync(long groupId, long parentFolderId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/journal.journalfolder/get-folders", _parameters }
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
				{ "/journal.journalfolder/get-folders", _parameters }
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
				{ "/journal.journalfolder/get-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetFoldersCountAsync(long groupId, long parentFolderId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/journal.journalfolder/get-folders-count", _parameters }
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
				{ "/journal.journalfolder/get-folders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
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
				{ "/journal.journalfolder/get-subfolder-ids", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<long>> GetSubfolderIdsAsync(long groupId, long folderId, bool recurse)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("recurse", recurse);

			var _command = new JsonObject()
			{
				{ "/journal.journalfolder/get-subfolder-ids", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<long>();
		}

		public async Task<IEnumerable<long>> GetFolderIdsAsync(long groupId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/journal.journalfolder/get-folder-ids", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<long>();
		}

		public async Task<dynamic> FetchFolderAsync(long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/journal.journalfolder/fetch-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task UnsubscribeAsync(long groupId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/journal.journalfolder/unsubscribe", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task SubscribeAsync(long groupId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/journal.journalfolder/subscribe", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<long> GetFoldersAndArticlesCountAsync(long groupId, IEnumerable<long> folderIds, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderIds", folderIds);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/journal.journalfolder/get-folders-and-articles-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersAndArticlesCountAsync(long groupId, long userId, long folderId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/journal.journalfolder/get-folders-and-articles-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersAndArticlesCountAsync(long groupId, long folderId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/journal.journalfolder/get-folders-and-articles-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetFoldersAndArticlesCountAsync(long groupId, long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/journal.journalfolder/get-folders-and-articles-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAndArticlesAsync(long groupId, long userId, long folderId, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/journal.journalfolder/get-folders-and-articles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAndArticlesAsync(long groupId, long folderId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/journal.journalfolder/get-folders-and-articles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAndArticlesAsync(long groupId, long folderId, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/journal.journalfolder/get-folders-and-articles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFoldersAndArticlesAsync(long groupId, long userId, long folderId, int status, string locale, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("folderId", folderId);
			_parameters.Add("status", status);
			_parameters.Add("locale", locale);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/journal.journalfolder/get-folders-and-articles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchDdmStructuresAsync(long companyId, IEnumerable<long> groupIds, long folderId, int restrictionType, string keywords, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("folderId", folderId);
			_parameters.Add("restrictionType", restrictionType);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/journal.journalfolder/search-ddm-structures", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}
	}
}