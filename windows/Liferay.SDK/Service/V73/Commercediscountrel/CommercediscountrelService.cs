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

namespace Liferay.SDK.Service.V73.Commercediscountrel
{
	public class CommercediscountrelService : ServiceBase
	{
		public CommercediscountrelService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<long>> GetClassPKsAsync(long commerceDiscountId, string className)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("className", className);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountrel/get-class-p-ks", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<long>();
		}

		public async Task<dynamic> AddCommerceDiscountRelAsync(long commerceDiscountId, string className, long classPK, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountrel/add-commerce-discount-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceDiscountRelAsync(long commerceDiscountRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountRelId", commerceDiscountRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountrel/delete-commerce-discount-rel", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchCommerceDiscountRelAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountrel/fetch-commerce-discount-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceDiscountRelsAsync(long commerceDiscountId, string className, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("className", className);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountrel/get-commerce-discount-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceDiscountRelsAsync(long commerceDiscountId, string className)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("className", className);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountrel/get-commerce-discount-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCategoriesByCommerceDiscountIdAsync(long commerceDiscountId, string name, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountrel/get-categories-by-commerce-discount-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCategoriesByCommerceDiscountIdCountAsync(long commerceDiscountId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountrel/get-categories-by-commerce-discount-id-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceDiscountRelsCountAsync(long commerceDiscountId, string className)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("className", className);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountrel/get-commerce-discount-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePricingClassesByCommerceDiscountIdAsync(long commerceDiscountId, string title, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("title", title);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountrel/get-commerce-pricing-classes-by-commerce-discount-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommercePricingClassesByCommerceDiscountIdCountAsync(long commerceDiscountId, string title)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("title", title);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountrel/get-commerce-pricing-classes-by-commerce-discount-id-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCpDefinitionsByCommerceDiscountIdAsync(long commerceDiscountId, string name, string languageId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("name", name);
			_parameters.Add("languageId", languageId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountrel/get-cp-definitions-by-commerce-discount-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCpDefinitionsByCommerceDiscountIdCountAsync(long commerceDiscountId, string name, string languageId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("name", name);
			_parameters.Add("languageId", languageId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountrel/get-cp-definitions-by-commerce-discount-id-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> GetCommerceDiscountRelAsync(long commerceDiscountRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountRelId", commerceDiscountRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountrel/get-commerce-discount-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}