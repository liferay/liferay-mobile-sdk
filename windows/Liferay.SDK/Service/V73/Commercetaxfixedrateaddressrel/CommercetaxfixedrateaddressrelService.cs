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

namespace Liferay.SDK.Service.V73.Commercetaxfixedrateaddressrel
{
	public class CommercetaxfixedrateaddressrelService : ServiceBase
	{
		public CommercetaxfixedrateaddressrelService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddCommerceTaxFixedRateAddressRelAsync(long commerceTaxMethodId, long cpTaxCategoryId, long commerceCountryId, long commerceRegionId, string zip, double rate, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceTaxMethodId", commerceTaxMethodId);
			_parameters.Add("cpTaxCategoryId", cpTaxCategoryId);
			_parameters.Add("commerceCountryId", commerceCountryId);
			_parameters.Add("commerceRegionId", commerceRegionId);
			_parameters.Add("zip", zip);
			_parameters.Add("rate", rate);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetaxfixedrateaddressrel/add-commerce-tax-fixed-rate-address-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceTaxFixedRateAddressRelAsync(long userId, long groupId, long commerceTaxMethodId, long cpTaxCategoryId, long commerceCountryId, long commerceRegionId, string zip, double rate)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceTaxMethodId", commerceTaxMethodId);
			_parameters.Add("cpTaxCategoryId", cpTaxCategoryId);
			_parameters.Add("commerceCountryId", commerceCountryId);
			_parameters.Add("commerceRegionId", commerceRegionId);
			_parameters.Add("zip", zip);
			_parameters.Add("rate", rate);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetaxfixedrateaddressrel/add-commerce-tax-fixed-rate-address-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceTaxFixedRateAddressRelAsync(long commerceTaxFixedRateAddressRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceTaxFixedRateAddressRelId", commerceTaxFixedRateAddressRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetaxfixedrateaddressrel/delete-commerce-tax-fixed-rate-address-rel", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchCommerceTaxFixedRateAddressRelAsync(long commerceTaxFixedRateAddressRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceTaxFixedRateAddressRelId", commerceTaxFixedRateAddressRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetaxfixedrateaddressrel/fetch-commerce-tax-fixed-rate-address-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceTaxMethodFixedRateAddressRelsAsync(long groupId, long commerceTaxMethodId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceTaxMethodId", commerceTaxMethodId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetaxfixedrateaddressrel/get-commerce-tax-method-fixed-rate-address-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceTaxMethodFixedRateAddressRelsCountAsync(long groupId, long commerceTaxMethodId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceTaxMethodId", commerceTaxMethodId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetaxfixedrateaddressrel/get-commerce-tax-method-fixed-rate-address-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCommerceTaxFixedRateAddressRelAsync(long commerceTaxFixedRateAddressRelId, long commerceCountryId, long commerceRegionId, string zip, double rate)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceTaxFixedRateAddressRelId", commerceTaxFixedRateAddressRelId);
			_parameters.Add("commerceCountryId", commerceCountryId);
			_parameters.Add("commerceRegionId", commerceRegionId);
			_parameters.Add("zip", zip);
			_parameters.Add("rate", rate);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetaxfixedrateaddressrel/update-commerce-tax-fixed-rate-address-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}