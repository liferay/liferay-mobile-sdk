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

namespace Liferay.SDK.Service.V73.Cpspecificationoption
{
	public class CpspecificationoptionService : ServiceBase
	{
		public CpspecificationoptionService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> FetchCpSpecificationOptionAsync(long companyId, string key)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("key", key);

			var _command = new JsonObject()
			{
				{ "/commerce.cpspecificationoption/fetch-cp-specification-option", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCpSpecificationOptionAsync(long cpSpecificationOptionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpSpecificationOptionId", cpSpecificationOptionId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpspecificationoption/get-cp-specification-option", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCpSpecificationOptionAsync(long cpOptionCategoryId, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, bool facetable, string key, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpOptionCategoryId", cpOptionCategoryId);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("facetable", facetable);
			_parameters.Add("key", key);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpspecificationoption/add-cp-specification-option", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCpSpecificationOptionAsync(long cpSpecificationOptionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpSpecificationOptionId", cpSpecificationOptionId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpspecificationoption/delete-cp-specification-option", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> SearchCpSpecificationOptionsAsync(long companyId, bool facetable, string keywords, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("facetable", facetable);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.cpspecificationoption/search-cp-specification-options", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCpSpecificationOptionAsync(long cpSpecificationOptionId, long cpOptionCategoryId, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, bool facetable, string key, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpSpecificationOptionId", cpSpecificationOptionId);
			_parameters.Add("cpOptionCategoryId", cpOptionCategoryId);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("facetable", facetable);
			_parameters.Add("key", key);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpspecificationoption/update-cp-specification-option", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}