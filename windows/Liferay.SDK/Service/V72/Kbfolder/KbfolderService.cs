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

namespace Liferay.SDK.Service.V72.Kbfolder
{
	public class KbfolderService : ServiceBase
	{
		public KbfolderService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> DeleteKbFolderAsync(long kbFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("kbFolderId", kbFolderId);

			var _command = new JsonObject()
			{
				{ "/kb.kbfolder/delete-kb-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetKbFoldersAsync(long groupId, long parentKBFolderId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentKBFolderId", parentKBFolderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/kb.kbfolder/get-kb-folders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetKbFoldersCountAsync(long groupId, long parentKBFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentKBFolderId", parentKBFolderId);

			var _command = new JsonObject()
			{
				{ "/kb.kbfolder/get-kb-folders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> AddKbFolderAsync(long groupId, long parentResourceClassNameId, long parentResourcePrimKey, string name, string description, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentResourceClassNameId", parentResourceClassNameId);
			_parameters.Add("parentResourcePrimKey", parentResourcePrimKey);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/kb.kbfolder/add-kb-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateKbFolderAsync(long parentResourceClassNameId, long parentResourcePrimKey, long kbFolderId, string name, string description)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentResourceClassNameId", parentResourceClassNameId);
			_parameters.Add("parentResourcePrimKey", parentResourcePrimKey);
			_parameters.Add("kbFolderId", kbFolderId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);

			var _command = new JsonObject()
			{
				{ "/kb.kbfolder/update-kb-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateKbFolderAsync(long parentResourceClassNameId, long parentResourcePrimKey, long kbFolderId, string name, string description, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentResourceClassNameId", parentResourceClassNameId);
			_parameters.Add("parentResourcePrimKey", parentResourcePrimKey);
			_parameters.Add("kbFolderId", kbFolderId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/kb.kbfolder/update-kb-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchKbFolderAsync(long kbFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("kbFolderId", kbFolderId);

			var _command = new JsonObject()
			{
				{ "/kb.kbfolder/fetch-kb-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchFirstChildKbFolderAsync(long groupId, long kbFolderId, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("kbFolderId", kbFolderId);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/kb.kbfolder/fetch-first-child-kb-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchFirstChildKbFolderAsync(long groupId, long kbFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("kbFolderId", kbFolderId);

			var _command = new JsonObject()
			{
				{ "/kb.kbfolder/fetch-first-child-kb-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchKbFolderByUrlTitleAsync(long groupId, long parentKbFolderId, string urlTitle)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentKbFolderId", parentKbFolderId);
			_parameters.Add("urlTitle", urlTitle);

			var _command = new JsonObject()
			{
				{ "/kb.kbfolder/fetch-kb-folder-by-url-title", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetKbFolderByUrlTitleAsync(long groupId, long parentKbFolderId, string urlTitle)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentKbFolderId", parentKbFolderId);
			_parameters.Add("urlTitle", urlTitle);

			var _command = new JsonObject()
			{
				{ "/kb.kbfolder/get-kb-folder-by-url-title", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetKbFoldersAndKbArticlesAsync(long groupId, long parentResourcePrimKey, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentResourcePrimKey", parentResourcePrimKey);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/kb.kbfolder/get-kb-folders-and-kb-articles", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetKbFoldersAndKbArticlesCountAsync(long groupId, long parentResourcePrimKey, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("parentResourcePrimKey", parentResourcePrimKey);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/kb.kbfolder/get-kb-folders-and-kb-articles-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task MoveKbFolderAsync(long kbFolderId, long parentKBFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("kbFolderId", kbFolderId);
			_parameters.Add("parentKBFolderId", parentKBFolderId);

			var _command = new JsonObject()
			{
				{ "/kb.kbfolder/move-kb-folder", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetKbFolderAsync(long kbFolderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("kbFolderId", kbFolderId);

			var _command = new JsonObject()
			{
				{ "/kb.kbfolder/get-kb-folder", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}