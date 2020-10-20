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

namespace Liferay.SDK.Service.V73.Commercepricelistaccountrel
{
	public class CommercepricelistaccountrelService : ServiceBase
	{
		public CommercepricelistaccountrelService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddCommercePriceListAccountRelAsync(long commercePriceListId, long commerceAccountId, int order, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("order", order);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistaccountrel/add-commerce-price-list-account-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommercePriceListAccountRelAsync(long commercePriceListAccountRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListAccountRelId", commercePriceListAccountRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistaccountrel/delete-commerce-price-list-account-rel", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetCommercePriceListAccountRelAsync(long commercePriceListAccountRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListAccountRelId", commercePriceListAccountRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistaccountrel/get-commerce-price-list-account-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommercePriceListAccountRelsByCommercePriceListIdAsync(long commercePriceListId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistaccountrel/delete-commerce-price-list-account-rels-by-commerce-price-list-id", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchCommercePriceListAccountRelAsync(long commercePriceListId, long commerceAccountId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("commerceAccountId", commerceAccountId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistaccountrel/fetch-commerce-price-list-account-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePriceListAccountRelsAsync(long commercePriceListId, string name, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistaccountrel/get-commerce-price-list-account-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePriceListAccountRelsAsync(long commercePriceListId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistaccountrel/get-commerce-price-list-account-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePriceListAccountRelsAsync(long commercePriceListId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistaccountrel/get-commerce-price-list-account-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommercePriceListAccountRelsCountAsync(long commercePriceListId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistaccountrel/get-commerce-price-list-account-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommercePriceListAccountRelsCountAsync(long commercePriceListId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistaccountrel/get-commerce-price-list-account-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}
	}
}