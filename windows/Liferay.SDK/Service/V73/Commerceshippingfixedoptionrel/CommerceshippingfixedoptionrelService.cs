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

namespace Liferay.SDK.Service.V73.Commerceshippingfixedoptionrel
{
	public class CommerceshippingfixedoptionrelService : ServiceBase
	{
		public CommerceshippingfixedoptionrelService(ISession session)
			: base(session)
		{
		}

		public async Task DeleteCommerceShippingFixedOptionRelAsync(long commerceShippingFixedOptionRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShippingFixedOptionRelId", commerceShippingFixedOptionRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingfixedoptionrel/delete-commerce-shipping-fixed-option-rel", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddCommerceShippingFixedOptionRelAsync(long commerceShippingMethodId, long commerceShippingFixedOptionId, long commerceInventoryWarehouseId, long commerceCountryId, long commerceRegionId, string zip, double weightFrom, double weightTo, IDictionary<string, object> fixedPrice, IDictionary<string, object> rateUnitWeightPrice, double ratePercentage, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShippingMethodId", commerceShippingMethodId);
			_parameters.Add("commerceShippingFixedOptionId", commerceShippingFixedOptionId);
			_parameters.Add("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_parameters.Add("commerceCountryId", commerceCountryId);
			_parameters.Add("commerceRegionId", commerceRegionId);
			_parameters.Add("zip", zip);
			_parameters.Add("weightFrom", weightFrom);
			_parameters.Add("weightTo", weightTo);
			_parameters.Add("fixedPrice", fixedPrice);
			_parameters.Add("rateUnitWeightPrice", rateUnitWeightPrice);
			_parameters.Add("ratePercentage", ratePercentage);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingfixedoptionrel/add-commerce-shipping-fixed-option-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceShippingFixedOptionRelAsync(long userId, long groupId, long commerceShippingMethodId, long commerceShippingFixedOptionId, long commerceInventoryWarehouseId, long commerceCountryId, long commerceRegionId, string zip, double weightFrom, double weightTo, IDictionary<string, object> fixedPrice, IDictionary<string, object> rateUnitWeightPrice, double ratePercentage)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceShippingMethodId", commerceShippingMethodId);
			_parameters.Add("commerceShippingFixedOptionId", commerceShippingFixedOptionId);
			_parameters.Add("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_parameters.Add("commerceCountryId", commerceCountryId);
			_parameters.Add("commerceRegionId", commerceRegionId);
			_parameters.Add("zip", zip);
			_parameters.Add("weightFrom", weightFrom);
			_parameters.Add("weightTo", weightTo);
			_parameters.Add("fixedPrice", fixedPrice);
			_parameters.Add("rateUnitWeightPrice", rateUnitWeightPrice);
			_parameters.Add("ratePercentage", ratePercentage);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingfixedoptionrel/add-commerce-shipping-fixed-option-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCommerceShippingFixedOptionRelAsync(long commerceShippingFixedOptionRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShippingFixedOptionRelId", commerceShippingFixedOptionRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingfixedoptionrel/fetch-commerce-shipping-fixed-option-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceShippingMethodFixedOptionRelsAsync(long commerceShippingMethodId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShippingMethodId", commerceShippingMethodId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingfixedoptionrel/get-commerce-shipping-method-fixed-option-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceShippingMethodFixedOptionRelsCountAsync(long commerceShippingMethodId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShippingMethodId", commerceShippingMethodId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingfixedoptionrel/get-commerce-shipping-method-fixed-option-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCommerceShippingFixedOptionRelAsync(long commerceShippingFixedOptionRelId, long commerceInventoryWarehouseId, long commerceCountryId, long commerceRegionId, string zip, double weightFrom, double weightTo, IDictionary<string, object> fixedPrice, IDictionary<string, object> rateUnitWeightPrice, double ratePercentage)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShippingFixedOptionRelId", commerceShippingFixedOptionRelId);
			_parameters.Add("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_parameters.Add("commerceCountryId", commerceCountryId);
			_parameters.Add("commerceRegionId", commerceRegionId);
			_parameters.Add("zip", zip);
			_parameters.Add("weightFrom", weightFrom);
			_parameters.Add("weightTo", weightTo);
			_parameters.Add("fixedPrice", fixedPrice);
			_parameters.Add("rateUnitWeightPrice", rateUnitWeightPrice);
			_parameters.Add("ratePercentage", ratePercentage);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshippingfixedoptionrel/update-commerce-shipping-fixed-option-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}