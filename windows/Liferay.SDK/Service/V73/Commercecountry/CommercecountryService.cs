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

namespace Liferay.SDK.Service.V73.Commercecountry
{
	public class CommercecountryService : ServiceBase
	{
		public CommercecountryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> SetActiveAsync(long commerceCountryId, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceCountryId", commerceCountryId);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecountry/set-active", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceCountryAsync(long companyId, string twoLettersISOCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("twoLettersISOCode", twoLettersISOCode);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecountry/get-commerce-country", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceCountryAsync(long commerceCountryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceCountryId", commerceCountryId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecountry/get-commerce-country", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCommerceCountryAsync(long companyId, string twoLettersISOCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("twoLettersISOCode", twoLettersISOCode);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecountry/fetch-commerce-country", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceCountryAsync(IDictionary<string, string> nameMap, bool billingAllowed, bool shippingAllowed, string twoLettersISOCode, string threeLettersISOCode, int numericISOCode, bool subjectToVAT, double priority, bool active, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nameMap", nameMap);
			_parameters.Add("billingAllowed", billingAllowed);
			_parameters.Add("shippingAllowed", shippingAllowed);
			_parameters.Add("twoLettersISOCode", twoLettersISOCode);
			_parameters.Add("threeLettersISOCode", threeLettersISOCode);
			_parameters.Add("numericISOCode", numericISOCode);
			_parameters.Add("subjectToVAT", subjectToVAT);
			_parameters.Add("priority", priority);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecountry/add-commerce-country", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceCountryAsync(long commerceCountryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceCountryId", commerceCountryId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecountry/delete-commerce-country", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetBillingCommerceCountriesAsync(long companyId, bool billingAllowed, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("billingAllowed", billingAllowed);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecountry/get-billing-commerce-countries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetBillingCommerceCountriesByChannelIdAsync(long commerceChannelId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceChannelId", commerceChannelId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecountry/get-billing-commerce-countries-by-channel-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceCountriesAsync(long companyId, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecountry/get-commerce-countries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceCountriesAsync(long companyId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecountry/get-commerce-countries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceCountriesAsync(long companyId, bool active, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("active", active);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecountry/get-commerce-countries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceCountriesCountAsync(long companyId, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecountry/get-commerce-countries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceCountriesCountAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecountry/get-commerce-countries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetShippingCommerceCountriesAsync(long companyId, bool shippingAllowed, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("shippingAllowed", shippingAllowed);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecountry/get-shipping-commerce-countries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetShippingCommerceCountriesByChannelIdAsync(long commerceChannelId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceChannelId", commerceChannelId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecountry/get-shipping-commerce-countries-by-channel-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetWarehouseCommerceCountriesAsync(long companyId, bool all)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("all", all);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecountry/get-warehouse-commerce-countries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> SearchCommerceCountriesAsync(long companyId, bool active, string keywords, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("active", active);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecountry/search-commerce-countries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchCommerceCountriesAsync(JsonObjectWrapper searchContext)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "searchContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", searchContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecountry/search-commerce-countries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceCountryAsync(long commerceCountryId, IDictionary<string, string> nameMap, bool billingAllowed, bool shippingAllowed, string twoLettersISOCode, string threeLettersISOCode, int numericISOCode, bool subjectToVAT, double priority, bool active, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceCountryId", commerceCountryId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("billingAllowed", billingAllowed);
			_parameters.Add("shippingAllowed", shippingAllowed);
			_parameters.Add("twoLettersISOCode", twoLettersISOCode);
			_parameters.Add("threeLettersISOCode", threeLettersISOCode);
			_parameters.Add("numericISOCode", numericISOCode);
			_parameters.Add("subjectToVAT", subjectToVAT);
			_parameters.Add("priority", priority);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecountry/update-commerce-country", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceCountryChannelFilterAsync(long commerceCountryId, bool enable)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceCountryId", commerceCountryId);
			_parameters.Add("enable", enable);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecountry/update-commerce-country-channel-filter", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}