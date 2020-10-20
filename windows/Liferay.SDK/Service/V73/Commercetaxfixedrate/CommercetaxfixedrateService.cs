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

namespace Liferay.SDK.Service.V73.Commercetaxfixedrate
{
	public class CommercetaxfixedrateService : ServiceBase
	{
		public CommercetaxfixedrateService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddCommerceTaxFixedRateAsync(long commerceTaxMethodId, long cpTaxCategoryId, double rate, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceTaxMethodId", commerceTaxMethodId);
			_parameters.Add("cpTaxCategoryId", cpTaxCategoryId);
			_parameters.Add("rate", rate);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetaxfixedrate/add-commerce-tax-fixed-rate", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceTaxFixedRateAsync(long userId, long groupId, long commerceTaxMethodId, long cpTaxCategoryId, double rate)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceTaxMethodId", commerceTaxMethodId);
			_parameters.Add("cpTaxCategoryId", cpTaxCategoryId);
			_parameters.Add("rate", rate);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetaxfixedrate/add-commerce-tax-fixed-rate", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceTaxFixedRatesAsync(long groupId, long commerceTaxMethodId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceTaxMethodId", commerceTaxMethodId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetaxfixedrate/get-commerce-tax-fixed-rates", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> FetchCommerceTaxFixedRateAsync(long commerceTaxFixedRateId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceTaxFixedRateId", commerceTaxFixedRateId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetaxfixedrate/fetch-commerce-tax-fixed-rate", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCommerceTaxFixedRateAsync(long cpTaxCategoryId, long commerceTaxMethodId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpTaxCategoryId", cpTaxCategoryId);
			_parameters.Add("commerceTaxMethodId", commerceTaxMethodId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetaxfixedrate/fetch-commerce-tax-fixed-rate", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetCommerceTaxFixedRatesCountAsync(long groupId, long commerceTaxMethodId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceTaxMethodId", commerceTaxMethodId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetaxfixedrate/get-commerce-tax-fixed-rates-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCommerceTaxFixedRateAsync(long commerceTaxFixedRateId, double rate)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceTaxFixedRateId", commerceTaxFixedRateId);
			_parameters.Add("rate", rate);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetaxfixedrate/update-commerce-tax-fixed-rate", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceTaxFixedRateAsync(long commerceTaxFixedRateId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceTaxFixedRateId", commerceTaxFixedRateId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetaxfixedrate/delete-commerce-tax-fixed-rate", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}