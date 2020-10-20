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

namespace Liferay.SDK.Service.V73.Commerceapplicationmodel
{
	public class CommerceapplicationmodelService : ServiceBase
	{
		public CommerceapplicationmodelService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> GetCommerceApplicationModelAsync(long commerceApplicationModelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceApplicationModelId", commerceApplicationModelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceapplicationmodel/get-commerce-application-model", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceApplicationModelsAsync(long commerceApplicationBrandId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceApplicationBrandId", commerceApplicationBrandId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceapplicationmodel/get-commerce-application-models", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceApplicationModelsCountAsync(long commerceApplicationBrandId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceApplicationBrandId", commerceApplicationBrandId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceapplicationmodel/get-commerce-application-models-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceApplicationModelsCountByCompanyIdAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceapplicationmodel/get-commerce-application-models-count-by-company-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceApplicationModelsByCompanyIdAsync(long companyId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceapplicationmodel/get-commerce-application-models-by-company-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> AddCommerceApplicationModelAsync(long userId, long commerceApplicationBrandId, string name, string year)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("commerceApplicationBrandId", commerceApplicationBrandId);
			_parameters.Add("name", name);
			_parameters.Add("year", year);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceapplicationmodel/add-commerce-application-model", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceApplicationModelAsync(long commerceApplicationModelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceApplicationModelId", commerceApplicationModelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceapplicationmodel/delete-commerce-application-model", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateCommerceApplicationModelAsync(long commerceApplicationModelId, string name, string year)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceApplicationModelId", commerceApplicationModelId);
			_parameters.Add("name", name);
			_parameters.Add("year", year);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceapplicationmodel/update-commerce-application-model", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}