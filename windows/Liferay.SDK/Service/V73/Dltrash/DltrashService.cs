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

namespace Liferay.SDK.Service.V73.Dltrash
{
	public class DltrashService : ServiceBase
	{
		public DltrashService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> MoveFileEntryFromTrashAsync(long fileEntryId, long newFolderId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);
			_parameters.Add("newFolderId", newFolderId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dltrash/move-file-entry-from-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> MoveFileEntryToTrashAsync(long fileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);

			var _command = new JsonObject()
			{
				{ "/dltrash/move-file-entry-to-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> MoveFileShortcutFromTrashAsync(long fileShortcutId, long newFolderId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileShortcutId", fileShortcutId);
			_parameters.Add("newFolderId", newFolderId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dltrash/move-file-shortcut-from-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> MoveFileShortcutToTrashAsync(long fileShortcutId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileShortcutId", fileShortcutId);

			var _command = new JsonObject()
			{
				{ "/dltrash/move-file-shortcut-to-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> MoveFolderFromTrashAsync(long folderId, long parentFolderId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);
			_parameters.Add("parentFolderId", parentFolderId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/dltrash/move-folder-from-trash", _parameters }
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
				{ "/dltrash/move-folder-to-trash", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task RestoreFileEntryFromTrashAsync(long fileEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileEntryId", fileEntryId);

			var _command = new JsonObject()
			{
				{ "/dltrash/restore-file-entry-from-trash", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task RestoreFileShortcutFromTrashAsync(long fileShortcutId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fileShortcutId", fileShortcutId);

			var _command = new JsonObject()
			{
				{ "/dltrash/restore-file-shortcut-from-trash", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task RestoreFolderFromTrashAsync(long folderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("folderId", folderId);

			var _command = new JsonObject()
			{
				{ "/dltrash/restore-folder-from-trash", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}