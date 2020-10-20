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

namespace Liferay.SDK.Service.V73.Commerceapplicationmodelcproductrel
{
	public class CommerceapplicationmodelcproductrelService : ServiceBase
	{
		public CommerceapplicationmodelcproductrelService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddCommerceApplicationModelCProductRelAsync(long userId, long commerceApplicationModelId, long cProductId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("commerceApplicationModelId", commerceApplicationModelId);
			_parameters.Add("cProductId", cProductId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceapplicationmodelcproductrel/add-commerce-application-model-c-product-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceApplicationModelCProductRelsAsync(long commerceApplicationModelId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceApplicationModelId", commerceApplicationModelId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceapplicationmodelcproductrel/get-commerce-application-model-c-product-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceApplicationModelCProductRelsCountAsync(long commerceApplicationModelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceApplicationModelId", commerceApplicationModelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceapplicationmodelcproductrel/get-commerce-application-model-c-product-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task DeleteCommerceApplicationModelCProductRelAsync(long commerceApplicationModelCProductRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceApplicationModelCProductRelId", commerceApplicationModelCProductRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceapplicationmodelcproductrel/delete-commerce-application-model-c-product-rel", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}