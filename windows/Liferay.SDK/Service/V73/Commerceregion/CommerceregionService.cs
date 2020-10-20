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

namespace Liferay.SDK.Service.V73.Commerceregion
{
	public class CommerceregionService : ServiceBase
	{
		public CommerceregionService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> SetActiveAsync(long commerceRegionId, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceRegionId", commerceRegionId);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceregion/set-active", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceRegionAsync(long commerceRegionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceRegionId", commerceRegionId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceregion/get-commerce-region", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceRegionAsync(long commerceRegionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceRegionId", commerceRegionId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceregion/delete-commerce-region", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddCommerceRegionAsync(long commerceCountryId, string name, string code, double priority, bool active, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceCountryId", commerceCountryId);
			_parameters.Add("name", name);
			_parameters.Add("code", code);
			_parameters.Add("priority", priority);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceregion/add-commerce-region", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceRegionsAsync(long commerceCountryId, bool active, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceCountryId", commerceCountryId);
			_parameters.Add("active", active);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceregion/get-commerce-regions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceRegionsAsync(long companyId, string countryTwoLettersISOCode, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("countryTwoLettersISOCode", countryTwoLettersISOCode);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceregion/get-commerce-regions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceRegionsAsync(long commerceCountryId, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceCountryId", commerceCountryId);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceregion/get-commerce-regions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceRegionsAsync(long commerceCountryId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceCountryId", commerceCountryId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceregion/get-commerce-regions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceRegionsCountAsync(long commerceCountryId, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceCountryId", commerceCountryId);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceregion/get-commerce-regions-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceRegionsCountAsync(long commerceCountryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceCountryId", commerceCountryId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceregion/get-commerce-regions-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCommerceRegionAsync(long commerceRegionId, string name, string code, double priority, bool active, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceRegionId", commerceRegionId);
			_parameters.Add("name", name);
			_parameters.Add("code", code);
			_parameters.Add("priority", priority);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceregion/update-commerce-region", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}