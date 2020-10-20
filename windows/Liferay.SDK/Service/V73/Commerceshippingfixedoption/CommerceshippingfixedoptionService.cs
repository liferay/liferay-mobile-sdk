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

namespace Liferay.SDK.Service.V73.Commerceshippingfixedoption
{
	public class CommerceshippingfixedoptionService : ServiceBase
	{
		public CommerceshippingfixedoptionService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddCommerceShippingFixedOptionAsync(long commerceShippingMethodId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, IDictionary<string, object> amount, double priority, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShippingMethodId", commerceShippingMethodId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("amount", amount);
			_parameters.Add("priority", priority);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingfixedoption/add-commerce-shipping-fixed-option", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceShippingFixedOptionAsync(long userId, long groupId, long commerceShippingMethodId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, IDictionary<string, object> amount, double priority)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceShippingMethodId", commerceShippingMethodId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("amount", amount);
			_parameters.Add("priority", priority);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingfixedoption/add-commerce-shipping-fixed-option", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceShippingFixedOptionAsync(long commerceShippingFixedOptionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShippingFixedOptionId", commerceShippingFixedOptionId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingfixedoption/delete-commerce-shipping-fixed-option", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetCommerceShippingFixedOptionsAsync(long commerceShippingMethodId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShippingMethodId", commerceShippingMethodId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingfixedoption/get-commerce-shipping-fixed-options", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceShippingFixedOptionsAsync(long companyId, long groupId, long commerceShippingMethodId, string keywords, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceShippingMethodId", commerceShippingMethodId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingfixedoption/get-commerce-shipping-fixed-options", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceShippingFixedOptionsAsync(long commerceShippingMethodId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShippingMethodId", commerceShippingMethodId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingfixedoption/get-commerce-shipping-fixed-options", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceShippingFixedOptionsCountAsync(long commerceShippingMethodId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShippingMethodId", commerceShippingMethodId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingfixedoption/get-commerce-shipping-fixed-options-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCommerceShippingFixedOptionAsync(long commerceShippingFixedOptionId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, IDictionary<string, object> amount, double priority)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShippingFixedOptionId", commerceShippingFixedOptionId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("amount", amount);
			_parameters.Add("priority", priority);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingfixedoption/update-commerce-shipping-fixed-option", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCommerceShippingFixedOptionAsync(long commerceShippingFixedOptionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShippingFixedOptionId", commerceShippingFixedOptionId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingfixedoption/fetch-commerce-shipping-fixed-option", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}