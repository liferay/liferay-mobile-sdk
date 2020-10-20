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

namespace Liferay.SDK.Service.V73.Commercepricelistdiscountrel
{
	public class CommercepricelistdiscountrelService : ServiceBase
	{
		public CommercepricelistdiscountrelService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddCommercePriceListDiscountRelAsync(long commercePriceListId, long commerceDiscountId, int order, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("order", order);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistdiscountrel/add-commerce-price-list-discount-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommercePriceListDiscountRelAsync(long commercePriceListDiscountRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListDiscountRelId", commercePriceListDiscountRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistdiscountrel/get-commerce-price-list-discount-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommercePriceListDiscountRelAsync(long commercePriceListDiscountRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListDiscountRelId", commercePriceListDiscountRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistdiscountrel/delete-commerce-price-list-discount-rel", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchCommercePriceListDiscountRelAsync(long commercePriceListId, long commerceDiscountId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("commerceDiscountId", commerceDiscountId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistdiscountrel/fetch-commerce-price-list-discount-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePriceListDiscountRelsAsync(long commercePriceListId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistdiscountrel/get-commerce-price-list-discount-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePriceListDiscountRelsAsync(long commercePriceListId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistdiscountrel/get-commerce-price-list-discount-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommercePriceListDiscountRelsCountAsync(long commercePriceListId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistdiscountrel/get-commerce-price-list-discount-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}
	}
}