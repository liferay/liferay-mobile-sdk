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

namespace Liferay.SDK.Service.V73.Commerceapplicationbrand
{
	public class CommerceapplicationbrandService : ServiceBase
	{
		public CommerceapplicationbrandService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddCommerceApplicationBrandAsync(long userId, string name, bool logo, byte[] logoBytes)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("name", name);
			_parameters.Add("logo", logo);
			_parameters.Add("logoBytes", logoBytes);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceapplicationbrand/add-commerce-application-brand", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceApplicationBrandAsync(long commerceApplicationBrandId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceApplicationBrandId", commerceApplicationBrandId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceapplicationbrand/delete-commerce-application-brand", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateCommerceApplicationBrandAsync(long commerceApplicationBrandId, string name, bool logo, byte[] logoBytes)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceApplicationBrandId", commerceApplicationBrandId);
			_parameters.Add("name", name);
			_parameters.Add("logo", logo);
			_parameters.Add("logoBytes", logoBytes);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceapplicationbrand/update-commerce-application-brand", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceApplicationBrandAsync(long commerceApplicationBrandId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceApplicationBrandId", commerceApplicationBrandId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceapplicationbrand/get-commerce-application-brand", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceApplicationBrandsAsync(long companyId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceapplicationbrand/get-commerce-application-brands", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceApplicationBrandsCountAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceapplicationbrand/get-commerce-application-brands-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}
	}
}