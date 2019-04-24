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

namespace Liferay.SDK.Service.V72.Microblogsentry
{
	public class MicroblogsentryService : ServiceBase
	{
		public MicroblogsentryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> DeleteMicroblogsEntryAsync(long microblogsEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("microblogsEntryId", microblogsEntryId);

			var _command = new JsonObject()
			{
				{ "/microblogs.microblogsentry/delete-microblogs-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddMicroblogsEntryAsync(long userId, string content, int type, long parentMicroblogsEntryId, int socialRelationType, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("content", content);
			_parameters.Add("type", type);
			_parameters.Add("parentMicroblogsEntryId", parentMicroblogsEntryId);
			_parameters.Add("socialRelationType", socialRelationType);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/microblogs.microblogsentry/add-microblogs-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetMicroblogsEntriesAsync(string assetTagName, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("assetTagName", assetTagName);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/microblogs.microblogsentry/get-microblogs-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetMicroblogsEntriesAsync(int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/microblogs.microblogsentry/get-microblogs-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetMicroblogsEntriesCountAsync(string assetTagName)
		{
			var _parameters = new JsonObject();

			_parameters.Add("assetTagName", assetTagName);

			var _command = new JsonObject()
			{
				{ "/microblogs.microblogsentry/get-microblogs-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetMicroblogsEntriesCountAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/microblogs.microblogsentry/get-microblogs-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> GetMicroblogsEntryAsync(long microblogsEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("microblogsEntryId", microblogsEntryId);

			var _command = new JsonObject()
			{
				{ "/microblogs.microblogsentry/get-microblogs-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserMicroblogsEntriesAsync(long microblogsEntryUserId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("microblogsEntryUserId", microblogsEntryUserId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/microblogs.microblogsentry/get-user-microblogs-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserMicroblogsEntriesAsync(long microblogsEntryUserId, int type, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("microblogsEntryUserId", microblogsEntryUserId);
			_parameters.Add("type", type);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/microblogs.microblogsentry/get-user-microblogs-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetUserMicroblogsEntriesCountAsync(long microblogsEntryUserId, int type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("microblogsEntryUserId", microblogsEntryUserId);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/microblogs.microblogsentry/get-user-microblogs-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetUserMicroblogsEntriesCountAsync(long microblogsEntryUserId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("microblogsEntryUserId", microblogsEntryUserId);

			var _command = new JsonObject()
			{
				{ "/microblogs.microblogsentry/get-user-microblogs-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateMicroblogsEntryAsync(long microblogsEntryId, string content, int socialRelationType, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("microblogsEntryId", microblogsEntryId);
			_parameters.Add("content", content);
			_parameters.Add("socialRelationType", socialRelationType);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/microblogs.microblogsentry/update-microblogs-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}