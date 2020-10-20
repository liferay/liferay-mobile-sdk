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

namespace Liferay.SDK.Service.V73.Cpoptioncategory
{
	public class CpoptioncategoryService : ServiceBase
	{
		public CpoptioncategoryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> GetCpOptionCategoryAsync(long cpOptionCategoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpOptionCategoryId", cpOptionCategoryId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpoptioncategory/get-cp-option-category", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCpOptionCategoryAsync(IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, double priority, string key, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("priority", priority);
			_parameters.Add("key", key);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpoptioncategory/add-cp-option-category", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCpOptionCategoryAsync(long cpOptionCategoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpOptionCategoryId", cpOptionCategoryId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpoptioncategory/delete-cp-option-category", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchCpOptionCategoryAsync(long cpOptionCategoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpOptionCategoryId", cpOptionCategoryId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpoptioncategory/fetch-cp-option-category", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchCpOptionCategoriesAsync(long companyId, string keywords, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.cpoptioncategory/search-cp-option-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCpOptionCategoryAsync(long cpOptionCategoryId, IDictionary<string, string> titleMap, IDictionary<string, string> descriptionMap, double priority, string key)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpOptionCategoryId", cpOptionCategoryId);
			_parameters.Add("titleMap", titleMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("priority", priority);
			_parameters.Add("key", key);

			var _command = new JsonObject()
			{
				{ "/commerce.cpoptioncategory/update-cp-option-category", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}