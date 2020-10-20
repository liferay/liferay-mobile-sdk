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

namespace Liferay.SDK.Service.V73.Commercepricelistcommerceaccountgrouprel
{
	public class CommercepricelistcommerceaccountgrouprelService : ServiceBase
	{
		public CommercepricelistcommerceaccountgrouprelService(ISession session)
			: base(session)
		{
		}

		public async Task DeleteCommercePriceListAccountGroupRelsByCommercePriceListIdAsync(long commercePriceListId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistcommerceaccountgrouprel/delete-commerce-price-list-account-group-rels-by-commerce-price-list-id", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddCommercePriceListCommerceAccountGroupRelAsync(long commercePriceListId, long commerceAccountGroupId, int order, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("commerceAccountGroupId", commerceAccountGroupId);
			_parameters.Add("order", order);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistcommerceaccountgrouprel/add-commerce-price-list-commerce-account-group-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommercePriceListCommerceAccountGroupRelAsync(long commercePriceListCommerceAccountGroupRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListCommerceAccountGroupRelId", commercePriceListCommerceAccountGroupRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistcommerceaccountgrouprel/delete-commerce-price-list-commerce-account-group-rel", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchCommercePriceListCommerceAccountGroupRelAsync(long commercePriceListId, long commerceAccountGroupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("commerceAccountGroupId", commerceAccountGroupId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistcommerceaccountgrouprel/fetch-commerce-price-list-commerce-account-group-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePriceListCommerceAccountGroupRelsAsync(long commercePriceListId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistcommerceaccountgrouprel/get-commerce-price-list-commerce-account-group-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePriceListCommerceAccountGroupRelsAsync(long commercePriceListId, string name, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistcommerceaccountgrouprel/get-commerce-price-list-commerce-account-group-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePriceListCommerceAccountGroupRelsAsync(long commercePriceListId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistcommerceaccountgrouprel/get-commerce-price-list-commerce-account-group-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommercePriceListCommerceAccountGroupRelsCountAsync(long commercePriceListId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistcommerceaccountgrouprel/get-commerce-price-list-commerce-account-group-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommercePriceListCommerceAccountGroupRelsCountAsync(long commercePriceListId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistcommerceaccountgrouprel/get-commerce-price-list-commerce-account-group-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCommercePriceListCommerceAccountGroupRelAsync(long commercePriceListCommerceAccountGroupRelId, int order, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListCommerceAccountGroupRelId", commercePriceListCommerceAccountGroupRelId);
			_parameters.Add("order", order);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistcommerceaccountgrouprel/update-commerce-price-list-commerce-account-group-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommercePriceListCommerceAccountGroupRelAsync(long commercePriceListCommerceAccoungGroupRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListCommerceAccoungGroupRelId", commercePriceListCommerceAccoungGroupRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistcommerceaccountgrouprel/get-commerce-price-list-commerce-account-group-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}