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

namespace Liferay.SDK.Service.V73.Commercecurrency
{
	public class CommercecurrencyService : ServiceBase
	{
		public CommercecurrencyService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> SetActiveAsync(long commerceCurrencyId, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceCurrencyId", commerceCurrencyId);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecurrency/set-active", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceCurrencyAsync(long companyId, string code)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("code", code);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecurrency/get-commerce-currency", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceCurrencyAsync(long commerceCurrencyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceCurrencyId", commerceCurrencyId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecurrency/get-commerce-currency", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceCurrencyAsync(long userId, string code, IDictionary<string, string> nameMap, string symbol, IDictionary<string, object> rate, IDictionary<string, string> formatPatternMap, int maxFractionDigits, int minFractionDigits, string roundingMode, bool primary, double priority, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("code", code);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("symbol", symbol);
			_parameters.Add("rate", rate);
			_parameters.Add("formatPatternMap", formatPatternMap);
			_parameters.Add("maxFractionDigits", maxFractionDigits);
			_parameters.Add("minFractionDigits", minFractionDigits);
			_parameters.Add("roundingMode", roundingMode);
			_parameters.Add("primary", primary);
			_parameters.Add("priority", priority);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecurrency/add-commerce-currency", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceCurrencyAsync(long commerceCurrencyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceCurrencyId", commerceCurrencyId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecurrency/delete-commerce-currency", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchPrimaryCommerceCurrencyAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecurrency/fetch-primary-commerce-currency", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceCurrenciesAsync(long companyId, bool active, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("active", active);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecurrency/get-commerce-currencies", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceCurrenciesAsync(long companyId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecurrency/get-commerce-currencies", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceCurrenciesCountAsync(long companyId, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecurrency/get-commerce-currencies-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceCurrenciesCountAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecurrency/get-commerce-currencies-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCommerceCurrencyAsync(long commerceCurrencyId, string code, IDictionary<string, string> nameMap, string symbol, IDictionary<string, object> rate, IDictionary<string, string> formatPatternMap, int maxFractionDigits, int minFractionDigits, string roundingMode, bool primary, double priority, bool active, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceCurrencyId", commerceCurrencyId);
			_parameters.Add("code", code);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("symbol", symbol);
			_parameters.Add("rate", rate);
			_parameters.Add("formatPatternMap", formatPatternMap);
			_parameters.Add("maxFractionDigits", maxFractionDigits);
			_parameters.Add("minFractionDigits", minFractionDigits);
			_parameters.Add("roundingMode", roundingMode);
			_parameters.Add("primary", primary);
			_parameters.Add("priority", priority);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecurrency/update-commerce-currency", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task UpdateExchangeRateAsync(long commerceCurrencyId, string exchangeRateProviderKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceCurrencyId", commerceCurrencyId);
			_parameters.Add("exchangeRateProviderKey", exchangeRateProviderKey);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecurrency/update-exchange-rate", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task UpdateExchangeRatesAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/commerce.commercecurrency/update-exchange-rates", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> SetPrimaryAsync(long commerceCurrencyId, bool primary)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceCurrencyId", commerceCurrencyId);
			_parameters.Add("primary", primary);

			var _command = new JsonObject()
			{
				{ "/commerce.commercecurrency/set-primary", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}