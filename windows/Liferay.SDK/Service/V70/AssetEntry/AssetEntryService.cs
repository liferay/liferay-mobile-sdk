//------------------------------------------------------------------------------
// <copyright file="AssetEntryService.cs">
//    Copyright (c) 2014-present Andrea Di Giorgi
//
//    Permission is hereby granted, free of charge, to any person obtaining a
//    copy of this software and associated documentation files (the "Software"),
//    to deal in the Software without restriction, including without limitation
//    the rights to use, copy, modify, merge, publish, distribute, sublicense,
//    and/or sell copies of the Software, and to permit persons to whom the
//    Software is furnished to do so, subject to the following conditions:
//
//    The above copyright notice and this permission notice shall be included in
//    all copies or substantial portions of the Software.
//
//    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
//    THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
//    FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
//    DEALINGS IN THE SOFTWARE.
// </copyright>
// <author>Andrea Di Giorgi</author>
// <website>https://github.com/Ithildir/liferay-sdk-builder-windows</website>
//------------------------------------------------------------------------------

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading.Tasks;

namespace Liferay.SDK.Service.V70.AssetEntry
{
	public class AssetEntryService : ServiceBase
	{
		public AssetEntryService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> GetCompanyEntriesAsync(long companyId, int start, int end)
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

			return (IEnumerable<dynamic>)_obj;
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

		public async Task<dynamic> IncrementViewCounterAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/assetentry/increment-view-counter", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetEntriesCountAsync(JsonObjectWrapper entryQuery)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "entryQuery", "$languageUtil.getJSONWrapperClassName($parameter.type)", entryQuery);

			var _command = new JsonObject()
			{
				{ "/assetentry/get-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateEntryAsync(long groupId, long createDate, long modifiedDate, string className, long classPK, string classUuid, long classTypeId, IEnumerable<long> categoryIds, IEnumerable<string> tagNames, bool listable, bool visible, long startDate, long endDate, long expirationDate, string mimeType, string title, string description, string summary, string url, string layoutUuid, int height, int width, double priority)
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
			_parameters.Add("listable", listable);
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

			var _command = new JsonObject()
			{
				{ "/assetentry/update-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateEntryAsync(long groupId, long createDate, long modifiedDate, string className, long classPK, string classUuid, long classTypeId, IEnumerable<long> categoryIds, IEnumerable<string> tagNames, bool visible, long startDate, long endDate, long expirationDate, string mimeType, string title, string description, string summary, string url, string layoutUuid, int height, int width, int priority, bool sync)
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

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateEntryAsync(long groupId, long createDate, long modifiedDate, string className, long classPK, string classUuid, long classTypeId, IEnumerable<long> categoryIds, IEnumerable<string> tagNames, bool listable, bool visible, long startDate, long endDate, long publishDate, long expirationDate, string mimeType, string title, string description, string summary, string url, string layoutUuid, int height, int width, double priority)
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
			_parameters.Add("listable", listable);
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

			var _command = new JsonObject()
			{
				{ "/assetentry/update-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchEntryAsync(long entryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);

			var _command = new JsonObject()
			{
				{ "/assetentry/fetch-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetEntriesAsync(JsonObjectWrapper entryQuery)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "entryQuery", "$languageUtil.getJSONWrapperClassName($parameter.type)", entryQuery);

			var _command = new JsonObject()
			{
				{ "/assetentry/get-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetEntryAsync(long entryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);

			var _command = new JsonObject()
			{
				{ "/assetentry/get-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}