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

namespace Liferay.SDK.Service.V73.AnnouncementsEntry
{
	public class AnnouncementsEntryService : ServiceBase
	{
		public AnnouncementsEntryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> UpdateEntryAsync(long entryId, string title, string content, string url, string type, long displayDate, long expirationDate, int priority)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);
			_parameters.Add("title", title);
			_parameters.Add("content", content);
			_parameters.Add("url", url);
			_parameters.Add("type", type);
			_parameters.Add("displayDate", displayDate);
			_parameters.Add("expirationDate", expirationDate);
			_parameters.Add("priority", priority);

			var _command = new JsonObject()
			{
				{ "/announcementsentry/update-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddEntryAsync(long classNameId, long classPK, string title, string content, string url, string type, long displayDate, long expirationDate, int priority, bool alert)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classNameId", classNameId);
			_parameters.Add("classPK", classPK);
			_parameters.Add("title", title);
			_parameters.Add("content", content);
			_parameters.Add("url", url);
			_parameters.Add("type", type);
			_parameters.Add("displayDate", displayDate);
			_parameters.Add("expirationDate", expirationDate);
			_parameters.Add("priority", priority);
			_parameters.Add("alert", alert);

			var _command = new JsonObject()
			{
				{ "/announcementsentry/add-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetEntryAsync(long entryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);

			var _command = new JsonObject()
			{
				{ "/announcementsentry/get-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteEntryAsync(long entryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);

			var _command = new JsonObject()
			{
				{ "/announcementsentry/delete-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}