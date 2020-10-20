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

namespace Liferay.SDK.Service.V73.Commercepricelistchannelrel
{
	public class CommercepricelistchannelrelService : ServiceBase
	{
		public CommercepricelistchannelrelService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> GetCommercePriceListChannelRelAsync(long commercePriceListChannelRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListChannelRelId", commercePriceListChannelRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistchannelrel/get-commerce-price-list-channel-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommercePriceListChannelRelAsync(long commercePriceListChannelRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListChannelRelId", commercePriceListChannelRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistchannelrel/delete-commerce-price-list-channel-rel", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchCommercePriceListChannelRelAsync(long commerceChannelId, long commercePriceListId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceChannelId", commerceChannelId);
			_parameters.Add("commercePriceListId", commercePriceListId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistchannelrel/fetch-commerce-price-list-channel-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommercePriceListChannelRelAsync(long commercePriceListId, long commerceChannelId, int order, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("commerceChannelId", commerceChannelId);
			_parameters.Add("order", order);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistchannelrel/add-commerce-price-list-channel-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePriceListChannelRelsAsync(long commercePriceListId, string name, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistchannelrel/get-commerce-price-list-channel-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePriceListChannelRelsAsync(long commercePriceListId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistchannelrel/get-commerce-price-list-channel-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePriceListChannelRelsAsync(long commercePriceListId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistchannelrel/get-commerce-price-list-channel-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommercePriceListChannelRelsCountAsync(long commercePriceListId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistchannelrel/get-commerce-price-list-channel-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommercePriceListChannelRelsCountAsync(long commercePriceListId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricelistchannelrel/get-commerce-price-list-channel-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}
	}
}