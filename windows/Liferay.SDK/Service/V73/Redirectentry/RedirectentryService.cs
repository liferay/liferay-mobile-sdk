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

namespace Liferay.SDK.Service.V73.Redirectentry
{
	public class RedirectentryService : ServiceBase
	{
		public RedirectentryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddRedirectEntryAsync(long groupId, string destinationURL, long expirationDate, string groupBaseURL, bool permanent, string sourceURL, bool updateChainedRedirectEntries, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("destinationURL", destinationURL);
			_parameters.Add("expirationDate", expirationDate);
			_parameters.Add("groupBaseURL", groupBaseURL);
			_parameters.Add("permanent", permanent);
			_parameters.Add("sourceURL", sourceURL);
			_parameters.Add("updateChainedRedirectEntries", updateChainedRedirectEntries);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/redirect.redirectentry/add-redirect-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddRedirectEntryAsync(long groupId, string destinationURL, long expirationDate, bool permanent, string sourceURL, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("destinationURL", destinationURL);
			_parameters.Add("expirationDate", expirationDate);
			_parameters.Add("permanent", permanent);
			_parameters.Add("sourceURL", sourceURL);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/redirect.redirectentry/add-redirect-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateRedirectEntryAsync(long redirectEntryId, string destinationURL, long expirationDate, bool permanent, string sourceURL)
		{
			var _parameters = new JsonObject();

			_parameters.Add("redirectEntryId", redirectEntryId);
			_parameters.Add("destinationURL", destinationURL);
			_parameters.Add("expirationDate", expirationDate);
			_parameters.Add("permanent", permanent);
			_parameters.Add("sourceURL", sourceURL);

			var _command = new JsonObject()
			{
				{ "/redirect.redirectentry/update-redirect-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateRedirectEntryAsync(long redirectEntryId, string destinationURL, long expirationDate, string groupBaseURL, bool permanent, string sourceURL, bool updateChainedRedirectEntries)
		{
			var _parameters = new JsonObject();

			_parameters.Add("redirectEntryId", redirectEntryId);
			_parameters.Add("destinationURL", destinationURL);
			_parameters.Add("expirationDate", expirationDate);
			_parameters.Add("groupBaseURL", groupBaseURL);
			_parameters.Add("permanent", permanent);
			_parameters.Add("sourceURL", sourceURL);
			_parameters.Add("updateChainedRedirectEntries", updateChainedRedirectEntries);

			var _command = new JsonObject()
			{
				{ "/redirect.redirectentry/update-redirect-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteRedirectEntryAsync(long redirectEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("redirectEntryId", redirectEntryId);

			var _command = new JsonObject()
			{
				{ "/redirect.redirectentry/delete-redirect-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchRedirectEntryAsync(long redirectEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("redirectEntryId", redirectEntryId);

			var _command = new JsonObject()
			{
				{ "/redirect.redirectentry/fetch-redirect-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetRedirectEntriesAsync(long groupId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/redirect.redirectentry/get-redirect-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetRedirectEntriesCountAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/redirect.redirectentry/get-redirect-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}
	}
}