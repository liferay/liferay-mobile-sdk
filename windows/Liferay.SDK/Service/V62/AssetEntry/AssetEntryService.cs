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

namespace Liferay.SDK.Service.V62.AssetEntry
{
	public class AssetEntryService : ServiceBase
	{
		public AssetEntryService(ISession session)
			: base(session)
		{
		}

		public async Task<IDictionary<string, object>> GetCompanyEntriesAsync(long companyId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/assetentry/get-company-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<long> GetCompanyEntriesCountAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/assetentry/get-company-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IDictionary<string, object>> GetEntriesAsync(IDictionary<string, object> entryQuery)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryQuery", entryQuery);

			var _command = new JsonObject()
			{
				{ "/assetentry/get-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<long> GetEntriesCountAsync(IDictionary<string, object> entryQuery)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryQuery", entryQuery);

			var _command = new JsonObject()
			{
				{ "/assetentry/get-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IDictionary<string, object>> GetEntryAsync(long entryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);

			var _command = new JsonObject()
			{
				{ "/assetentry/get-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> IncrementViewCounterAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/assetentry/increment-view-counter", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateEntryAsync(long groupId, string className, long classPK, string classUuid, long classTypeId, IEnumerable<long> categoryIds, IEnumerable<string> tagNames, bool visible, long startDate, long endDate, long expirationDate, string mimeType, string title, string description, string summary, string url, string layoutUuid, int height, int width, IDictionary<string, object> priority, bool sync)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("classUuid", classUuid);
			_parameters.Add("classTypeId", classTypeId);
			_parameters.Add("categoryIds", categoryIds);
			_parameters.Add("tagNames", tagNames);
			_parameters.Add("visible", visible);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);
			_parameters.Add("expirationDate", expirationDate);
			_parameters.Add("mimeType", mimeType);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("summary", summary);
			_parameters.Add("url", url);
			_parameters.Add("layoutUuid", layoutUuid);
			_parameters.Add("height", height);
			_parameters.Add("width", width);
			_parameters.Add("priority", priority);
			_parameters.Add("sync", sync);

			var _command = new JsonObject()
			{
				{ "/assetentry/update-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateEntryAsync(long groupId, string className, long classPK, string classUuid, long classTypeId, IEnumerable<long> categoryIds, IEnumerable<string> tagNames, bool visible, long startDate, long endDate, long publishDate, long expirationDate, string mimeType, string title, string description, string summary, string url, string layoutUuid, int height, int width, IDictionary<string, object> priority, bool sync)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("classUuid", classUuid);
			_parameters.Add("classTypeId", classTypeId);
			_parameters.Add("categoryIds", categoryIds);
			_parameters.Add("tagNames", tagNames);
			_parameters.Add("visible", visible);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);
			_parameters.Add("publishDate", publishDate);
			_parameters.Add("expirationDate", expirationDate);
			_parameters.Add("mimeType", mimeType);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("summary", summary);
			_parameters.Add("url", url);
			_parameters.Add("layoutUuid", layoutUuid);
			_parameters.Add("height", height);
			_parameters.Add("width", width);
			_parameters.Add("priority", priority);
			_parameters.Add("sync", sync);

			var _command = new JsonObject()
			{
				{ "/assetentry/update-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateEntryAsync(long groupId, long createDate, long modifiedDate, string className, long classPK, string classUuid, long classTypeId, IEnumerable<long> categoryIds, IEnumerable<string> tagNames, bool visible, long startDate, long endDate, long expirationDate, string mimeType, string title, string description, string summary, string url, string layoutUuid, int height, int width, IDictionary<string, object> priority, bool sync)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("createDate", createDate);
			_parameters.Add("modifiedDate", modifiedDate);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("classUuid", classUuid);
			_parameters.Add("classTypeId", classTypeId);
			_parameters.Add("categoryIds", categoryIds);
			_parameters.Add("tagNames", tagNames);
			_parameters.Add("visible", visible);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);
			_parameters.Add("expirationDate", expirationDate);
			_parameters.Add("mimeType", mimeType);
			_parameters.Add("title", title);
			_parameters.Add("description", description);
			_parameters.Add("summary", summary);
			_parameters.Add("url", url);
			_parameters.Add("layoutUuid", layoutUuid);
			_parameters.Add("height", height);
			_parameters.Add("width", width);
			_parameters.Add("priority", priority);
			_parameters.Add("sync", sync);

			var _command = new JsonObject()
			{
				{ "/assetentry/update-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}
	}
}