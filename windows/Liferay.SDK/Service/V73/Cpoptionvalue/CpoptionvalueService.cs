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

namespace Liferay.SDK.Service.V73.Cpoptionvalue
{
	public class CpoptionvalueService : ServiceBase
	{
		public CpoptionvalueService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> FetchByExternalReferenceCodeAsync(long companyId, string externalReferenceCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);

			var _command = new JsonObject()
			{
				{ "/commerce.cpoptionvalue/fetch-by-external-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCpOptionValuesAsync(long cpOptionId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpOptionId", cpOptionId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.cpoptionvalue/get-cp-option-values", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> AddCpOptionValueAsync(long cpOptionId, IDictionary<string, string> titleMap, double priority, string key, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpOptionId", cpOptionId);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("priority", priority);
			_parameters.Add("key", key);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpoptionvalue/add-cp-option-value", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCpOptionValueAsync(long cpOptionValueId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpOptionValueId", cpOptionValueId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpoptionvalue/delete-cp-option-value", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetCpOptionValueAsync(long cpOptionValueId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpOptionValueId", cpOptionValueId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpoptionvalue/get-cp-option-value", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetCpOptionValuesCountAsync(long cpOptionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpOptionId", cpOptionId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpoptionvalue/get-cp-option-values-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCpOptionValueAsync(long cpOptionValueId, IDictionary<string, string> titleMap, double priority, string key, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpOptionValueId", cpOptionValueId);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("priority", priority);
			_parameters.Add("key", key);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpoptionvalue/update-cp-option-value", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpsertCpOptionValueAsync(long cpOptionId, IDictionary<string, string> nameMap, double priority, string key, string externalReferenceCode, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpOptionId", cpOptionId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("priority", priority);
			_parameters.Add("key", key);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpoptionvalue/upsert-cp-option-value", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCpOptionValueAsync(long cpOptionValueId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpOptionValueId", cpOptionValueId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpoptionvalue/fetch-cp-option-value", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}