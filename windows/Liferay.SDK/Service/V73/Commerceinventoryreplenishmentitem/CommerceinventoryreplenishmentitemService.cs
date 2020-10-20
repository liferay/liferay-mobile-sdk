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

namespace Liferay.SDK.Service.V73.Commerceinventoryreplenishmentitem
{
	public class CommerceinventoryreplenishmentitemService : ServiceBase
	{
		public CommerceinventoryreplenishmentitemService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddCommerceInventoryReplenishmentItemAsync(long userId, long commerceInventoryWarehouseId, string sku, long availabilityDate, int quantity)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_parameters.Add("sku", sku);
			_parameters.Add("availabilityDate", availabilityDate);
			_parameters.Add("quantity", quantity);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventoryreplenishmentitem/add-commerce-inventory-replenishment-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceInventoryReplenishmentItemsByCompanyIdAndSkuAsync(long companyId, string sku, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("sku", sku);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventoryreplenishmentitem/get-commerce-inventory-replenishment-items-by-company-id-and-sku", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceInventoryReplenishmentItemsCountAsync(long commerceInventoryWarehouseId, string sku)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_parameters.Add("sku", sku);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventoryreplenishmentitem/get-commerce-inventory-replenishment-items-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceInventoryReplenishmentItemsCountByCompanyIdAndSkuAsync(long companyId, string sku)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("sku", sku);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventoryreplenishmentitem/get-commerce-inventory-replenishment-items-count-by-company-id-and-sku", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCommerceInventoryReplenishmentItemAsync(long commerceInventoryReplenishmentItemId, long availabilityDate, int quantity, long mvccVersion)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceInventoryReplenishmentItemId", commerceInventoryReplenishmentItemId);
			_parameters.Add("availabilityDate", availabilityDate);
			_parameters.Add("quantity", quantity);
			_parameters.Add("mvccVersion", mvccVersion);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventoryreplenishmentitem/update-commerce-inventory-replenishment-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceInventoryReplenishmentItemAsync(long commerceInventoryReplenishmentItemId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceInventoryReplenishmentItemId", commerceInventoryReplenishmentItemId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventoryreplenishmentitem/delete-commerce-inventory-replenishment-item", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetCommerceInventoryReplenishmentItemAsync(long commerceInventoryReplenishmentItemId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceInventoryReplenishmentItemId", commerceInventoryReplenishmentItemId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventoryreplenishmentitem/get-commerce-inventory-replenishment-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}