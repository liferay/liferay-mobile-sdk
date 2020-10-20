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

namespace Liferay.SDK.Service.V73.Cptaxcategory
{
	public class CptaxcategoryService : ServiceBase
	{
		public CptaxcategoryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddCpTaxCategoryAsync(string externalReferenceCode, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("externalReferenceCode", externalReferenceCode);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cptaxcategory/add-cp-tax-category", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCpTaxCategoryAsync(IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cptaxcategory/add-cp-tax-category", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> CountCpTaxCategoriesByCompanyIdAsync(long companyId, string keyword)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("keyword", keyword);

			var _command = new JsonObject()
			{
				{ "/commerce.cptaxcategory/count-cp-tax-categories-by-company-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task DeleteCpTaxCategoryAsync(long cpTaxCategoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpTaxCategoryId", cpTaxCategoryId);

			var _command = new JsonObject()
			{
				{ "/commerce.cptaxcategory/delete-cp-tax-category", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> FindCpTaxCategoriesByCompanyIdAsync(long companyId, string keyword, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("keyword", keyword);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.cptaxcategory/find-cp-tax-categories-by-company-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCpTaxCategoriesAsync(long companyId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.cptaxcategory/get-cp-tax-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCpTaxCategoriesAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/commerce.cptaxcategory/get-cp-tax-categories", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCpTaxCategoriesCountAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/commerce.cptaxcategory/get-cp-tax-categories-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCpTaxCategoryAsync(long cpTaxCategoryId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpTaxCategoryId", cpTaxCategoryId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);

			var _command = new JsonObject()
			{
				{ "/commerce.cptaxcategory/update-cp-tax-category", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCpTaxCategoryAsync(string externalReferenceCode, long cpTaxCategoryId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap)
		{
			var _parameters = new JsonObject();

			_parameters.Add("externalReferenceCode", externalReferenceCode);
			_parameters.Add("cpTaxCategoryId", cpTaxCategoryId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);

			var _command = new JsonObject()
			{
				{ "/commerce.cptaxcategory/update-cp-tax-category", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCpTaxCategoryAsync(long cpTaxCategoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpTaxCategoryId", cpTaxCategoryId);

			var _command = new JsonObject()
			{
				{ "/commerce.cptaxcategory/get-cp-tax-category", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}