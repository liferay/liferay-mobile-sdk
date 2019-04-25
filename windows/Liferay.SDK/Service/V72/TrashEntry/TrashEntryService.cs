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

namespace Liferay.SDK.Service.V72.TrashEntry
{
	public class TrashEntryService : ServiceBase
	{
		public TrashEntryService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> GetEntriesAsync(long groupId, string className)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);

			var _command = new JsonObject()
			{
				{ "/trash.trashentry/get-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetEntriesAsync(long groupId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/trash.trashentry/get-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetEntriesAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/trash.trashentry/get-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetEntriesAsync(long groupId, string className, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/trash.trashentry/get-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteEntriesAsync(IEnumerable<long> entryIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryIds", entryIds);

			var _command = new JsonObject()
			{
				{ "/trash.trashentry/delete-entries", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteEntriesAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/trash.trashentry/delete-entries", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteEntryAsync(long entryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);

			var _command = new JsonObject()
			{
				{ "/trash.trashentry/delete-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteEntryAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/trash.trashentry/delete-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task MoveEntryAsync(string className, long classPK, long destinationContainerModelId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("destinationContainerModelId", destinationContainerModelId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/trash.trashentry/move-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> RestoreEntryAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/trash.trashentry/restore-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> RestoreEntryAsync(long entryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);

			var _command = new JsonObject()
			{
				{ "/trash.trashentry/restore-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> RestoreEntryAsync(string className, long classPK, long overrideClassPK, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("overrideClassPK", overrideClassPK);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/trash.trashentry/restore-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> RestoreEntryAsync(long entryId, long overrideClassPK, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);
			_parameters.Add("overrideClassPK", overrideClassPK);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/trash.trashentry/restore-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}