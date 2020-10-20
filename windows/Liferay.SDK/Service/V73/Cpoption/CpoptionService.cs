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

namespace Liferay.SDK.Service.V73.Cpoption
{
	public class CpoptionService : ServiceBase
	{
		public CpoptionService(ISession session)
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
				{ "/commerce.cpoption/fetch-by-external-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCpOptionAsync(long cpOptionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpOptionId", cpOptionId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpoption/get-cp-option", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchCpOptionsAsync(long companyId, string keywords, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.cpoption/search-cp-options", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCpOptionAsync(IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string ddmFormFieldTypeName, bool facetable, bool required, bool skuContributor, string key, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("ddmFormFieldTypeName", ddmFormFieldTypeName);
			_parameters.Add("facetable", facetable);
			_parameters.Add("required", required);
			_parameters.Add("skuContributor", skuContributor);
			_parameters.Add("key", key);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpoption/add-cp-option", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCpOptionAsync(long companyId, string key)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("key", key);

			var _command = new JsonObject()
			{
				{ "/commerce.cpoption/fetch-cp-option", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCpOptionAsync(long cpOptionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpOptionId", cpOptionId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpoption/fetch-cp-option", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCpOptionAsync(long cpOptionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpOptionId", cpOptionId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpoption/delete-cp-option", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> FindCpOptionByCompanyIdAsync(long companyId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.cpoption/find-cp-option-by-company-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> UpdateCpOptionAsync(long cpOptionId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string ddmFormFieldTypeName, bool facetable, bool required, bool skuContributor, string key, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpOptionId", cpOptionId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("ddmFormFieldTypeName", ddmFormFieldTypeName);
			_parameters.Add("facetable", facetable);
			_parameters.Add("required", required);
			_parameters.Add("skuContributor", skuContributor);
			_parameters.Add("key", key);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpoption/update-cp-option", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpsertCpOptionAsync(IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, string ddmFormFieldTypeName, bool facetable, bool required, bool skuContributor, string key, string externalReferenceCode, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("ddmFormFieldTypeName", ddmFormFieldTypeName);
			_parameters.Add("facetable", facetable);
			_parameters.Add("required", required);
			_parameters.Add("skuContributor", skuContributor);
			_parameters.Add("key", key);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpoption/upsert-cp-option", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}