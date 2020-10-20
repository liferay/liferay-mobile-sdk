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

namespace Liferay.SDK.Service.V73.Commercecatalog
{
	public class CommercecatalogService : ServiceBase
	{
		public CommercecatalogService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> GetCommerceCatalogAsync(long commerceCatalogId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceCatalogId", commerceCatalogId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecatalog/get-commerce-catalog", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchByExternalReferenceCodeAsync(long companyId, string externalReferenceCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecatalog/fetch-by-external-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceCatalogAsync(string name, string commerceCurrencyCode, string catalogDefaultLanguageId, string externalReferenceCode, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);
			_parameters.Add("commerceCurrencyCode", commerceCurrencyCode);
			_parameters.Add("catalogDefaultLanguageId", catalogDefaultLanguageId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecatalog/add-commerce-catalog", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteCommerceCatalogAsync(long commerceCatalogId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceCatalogId", commerceCatalogId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecatalog/delete-commerce-catalog", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCommerceCatalogAsync(long commerceCatalogId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceCatalogId", commerceCatalogId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecatalog/fetch-commerce-catalog", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCommerceCatalogByGroupIdAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecatalog/fetch-commerce-catalog-by-group-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceCatalogsAsync(long companyId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecatalog/get-commerce-catalogs", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchCommerceCatalogsAsync(long companyId, string keywords, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecatalog/search-commerce-catalogs", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> SearchCommerceCatalogsCountAsync(long companyId, string keywords)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("keywords", keywords);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecatalog/search-commerce-catalogs-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCommerceCatalogAsync(long commerceCatalogId, string name, string commerceCurrencyCode, string catalogDefaultLanguageId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceCatalogId", commerceCatalogId);
			_parameters.Add("name", name);
			_parameters.Add("commerceCurrencyCode", commerceCurrencyCode);
			_parameters.Add("catalogDefaultLanguageId", catalogDefaultLanguageId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecatalog/update-commerce-catalog", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceCatalogExternalReferenceCodeAsync(long commerceCatalogId, string externalReferenceCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceCatalogId", commerceCatalogId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecatalog/update-commerce-catalog-external-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}