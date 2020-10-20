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

namespace Liferay.SDK.Service.V73.Sapentry
{
	public class SapentryService : ServiceBase
	{
		public SapentryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddSapEntryAsync(string allowedServiceSignatures, bool defaultSAPEntry, bool enabled, string name, IDictionary<string, string> titleMap, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("allowedServiceSignatures", allowedServiceSignatures);
			_parameters.Add("defaultSAPEntry", defaultSAPEntry);
			_parameters.Add("enabled", enabled);
			_parameters.Add("name", name);
			_parameters.Add("titleMap", titleMap);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/sap.sapentry/add-sap-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateSapEntryAsync(long sapEntryId, string allowedServiceSignatures, bool defaultSAPEntry, bool enabled, string name, IDictionary<string, string> titleMap, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("sapEntryId", sapEntryId);
			_parameters.Add("allowedServiceSignatures", allowedServiceSignatures);
			_parameters.Add("defaultSAPEntry", defaultSAPEntry);
			_parameters.Add("enabled", enabled);
			_parameters.Add("name", name);
			_parameters.Add("titleMap", titleMap);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/sap.sapentry/update-sap-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteSapEntryAsync(JsonObjectWrapper sapEntry)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "sapEntry", "$languageUtil.getJSONWrapperClassName($parameter.type)", sapEntry);

			var _command = new JsonObject()
			{
				{ "/sap.sapentry/delete-sap-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteSapEntryAsync(long sapEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("sapEntryId", sapEntryId);

			var _command = new JsonObject()
			{
				{ "/sap.sapentry/delete-sap-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchSapEntryAsync(long companyId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/sap.sapentry/fetch-sap-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetSapEntryAsync(long sapEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("sapEntryId", sapEntryId);

			var _command = new JsonObject()
			{
				{ "/sap.sapentry/get-sap-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetSapEntryAsync(long companyId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/sap.sapentry/get-sap-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCompanySapEntriesAsync(long companyId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/sap.sapentry/get-company-sap-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCompanySapEntriesAsync(long companyId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/sap.sapentry/get-company-sap-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCompanySapEntriesCountAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/sap.sapentry/get-company-sap-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}
	}
}