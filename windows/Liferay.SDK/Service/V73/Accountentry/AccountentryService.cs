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

namespace Liferay.SDK.Service.V73.Accountentry
{
	public class AccountentryService : ServiceBase
	{
		public AccountentryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddAccountEntryAsync(long userId, long parentAccountEntryId, string name, string description, IEnumerable<string> domains, byte[] logoBytes, string taxIdNumber, string type, int status, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("parentAccountEntryId", parentAccountEntryId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("domains", domains);
			_parameters.Add("logoBytes", logoBytes);
			_parameters.Add("taxIdNumber", taxIdNumber);
			_parameters.Add("type", type);
			_parameters.Add("status", status);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/account.accountentry/add-account-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddAccountEntryAsync(long userId, long parentAccountEntryId, string name, string description, IEnumerable<string> domains, byte[] logoBytes, int status, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("parentAccountEntryId", parentAccountEntryId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("domains", domains);
			_parameters.Add("logoBytes", logoBytes);
			_parameters.Add("status", status);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/account.accountentry/add-account-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddAccountEntryAsync(long userId, long parentAccountEntryId, string name, string description, IEnumerable<string> domains, byte[] logoBytes, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("parentAccountEntryId", parentAccountEntryId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("domains", domains);
			_parameters.Add("logoBytes", logoBytes);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/account.accountentry/add-account-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetAccountEntriesAsync(long companyId, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/account.accountentry/get-account-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> SearchAsync(string keywords, IDictionary<string, object> _params, int cur, int delta, string orderByField, bool reverse)
		{
			var _parameters = new JsonObject();

			_parameters.Add("keywords", keywords);
			_parameters.Add("params", _params);
			_parameters.Add("cur", cur);
			_parameters.Add("delta", delta);
			_parameters.Add("orderByField", orderByField);
			_parameters.Add("reverse", reverse);

			var _command = new JsonObject()
			{
				{ "/account.accountentry/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}