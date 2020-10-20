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

namespace Liferay.SDK.Service.V73.Commerceaddress
{
	public class CommerceaddressService : ServiceBase
	{
		public CommerceaddressService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> FetchByExternalReferenceCodeAsync(long companyId, string externalReferenceCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaddress/fetch-by-external-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceAddressAsync(string className, long classPK, string name, string description, string street1, string street2, string street3, string city, string zip, long commerceRegionId, long commerceCountryId, string phoneNumber, int type, string externalReferenceCode, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("street1", street1);
			_parameters.Add("street2", street2);
			_parameters.Add("street3", street3);
			_parameters.Add("city", city);
			_parameters.Add("zip", zip);
			_parameters.Add("commerceRegionId", commerceRegionId);
			_parameters.Add("commerceCountryId", commerceCountryId);
			_parameters.Add("phoneNumber", phoneNumber);
			_parameters.Add("type", type);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaddress/add-commerce-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceAddressAsync(string className, long classPK, string name, string description, string street1, string street2, string street3, string city, string zip, long commerceRegionId, long commerceCountryId, string phoneNumber, int type, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("street1", street1);
			_parameters.Add("street2", street2);
			_parameters.Add("street3", street3);
			_parameters.Add("city", city);
			_parameters.Add("zip", zip);
			_parameters.Add("commerceRegionId", commerceRegionId);
			_parameters.Add("commerceCountryId", commerceCountryId);
			_parameters.Add("phoneNumber", phoneNumber);
			_parameters.Add("type", type);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaddress/add-commerce-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceAddressAsync(string className, long classPK, string name, string description, string street1, string street2, string street3, string city, string zip, long commerceRegionId, long commerceCountryId, string phoneNumber, bool defaultBilling, bool defaultShipping, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("street1", street1);
			_parameters.Add("street2", street2);
			_parameters.Add("street3", street3);
			_parameters.Add("city", city);
			_parameters.Add("zip", zip);
			_parameters.Add("commerceRegionId", commerceRegionId);
			_parameters.Add("commerceCountryId", commerceCountryId);
			_parameters.Add("phoneNumber", phoneNumber);
			_parameters.Add("defaultBilling", defaultBilling);
			_parameters.Add("defaultShipping", defaultShipping);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaddress/add-commerce-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceAddressAsync(long commerceAddressId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAddressId", commerceAddressId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaddress/delete-commerce-address", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetBillingCommerceAddressesAsync(long companyId, string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaddress/get-billing-commerce-addresses", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetBillingCommerceAddressesAsync(long companyId, string className, long classPK, string keywords, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaddress/get-billing-commerce-addresses", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetBillingCommerceAddressesCountAsync(long companyId, string className, long classPK, string keywords)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("keywords", keywords);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaddress/get-billing-commerce-addresses-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceAddressesAsync(string className, long classPK, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaddress/get-commerce-addresses", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceAddressesAsync(long groupId, string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaddress/get-commerce-addresses", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceAddressesAsync(long groupId, string className, long classPK, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaddress/get-commerce-addresses", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceAddressesByCompanyIdAsync(long companyId, string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaddress/get-commerce-addresses-by-company-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceAddressesByCompanyIdAsync(long companyId, string className, long classPK, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaddress/get-commerce-addresses-by-company-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceAddressesCountAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaddress/get-commerce-addresses-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceAddressesCountAsync(long groupId, string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaddress/get-commerce-addresses-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceAddressesCountByCompanyIdAsync(long companyId, string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaddress/get-commerce-addresses-count-by-company-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetShippingCommerceAddressesAsync(long companyId, string className, long classPK, string keywords, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaddress/get-shipping-commerce-addresses", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetShippingCommerceAddressesAsync(long companyId, string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaddress/get-shipping-commerce-addresses", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetShippingCommerceAddressesCountAsync(long companyId, string className, long classPK, string keywords)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("keywords", keywords);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaddress/get-shipping-commerce-addresses-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> SearchCommerceAddressesAsync(long companyId, long groupId, string className, long classPK, string keywords, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaddress/search-commerce-addresses", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchCommerceAddressesAsync(long companyId, string className, long classPK, string keywords, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaddress/search-commerce-addresses", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceAddressAsync(long commerceAddressId, string name, string description, string street1, string street2, string street3, string city, string zip, long commerceRegionId, long commerceCountryId, string phoneNumber, int type, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAddressId", commerceAddressId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("street1", street1);
			_parameters.Add("street2", street2);
			_parameters.Add("street3", street3);
			_parameters.Add("city", city);
			_parameters.Add("zip", zip);
			_parameters.Add("commerceRegionId", commerceRegionId);
			_parameters.Add("commerceCountryId", commerceCountryId);
			_parameters.Add("phoneNumber", phoneNumber);
			_parameters.Add("type", type);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaddress/update-commerce-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceAddressAsync(long commerceAddressId, string name, string description, string street1, string street2, string street3, string city, string zip, long commerceRegionId, long commerceCountryId, string phoneNumber, bool defaultBilling, bool defaultShipping, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAddressId", commerceAddressId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("street1", street1);
			_parameters.Add("street2", street2);
			_parameters.Add("street3", street3);
			_parameters.Add("city", city);
			_parameters.Add("zip", zip);
			_parameters.Add("commerceRegionId", commerceRegionId);
			_parameters.Add("commerceCountryId", commerceCountryId);
			_parameters.Add("phoneNumber", phoneNumber);
			_parameters.Add("defaultBilling", defaultBilling);
			_parameters.Add("defaultShipping", defaultShipping);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaddress/update-commerce-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCommerceAddressAsync(long commerceAddressId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAddressId", commerceAddressId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaddress/fetch-commerce-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceAddressAsync(long commerceAddressId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAddressId", commerceAddressId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaddress/get-commerce-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}