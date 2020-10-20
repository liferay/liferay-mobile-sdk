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

namespace Liferay.SDK.Service.V73.Commerceinventorywarehouseitem
{
	public class CommerceinventorywarehouseitemService : ServiceBase
	{
		public CommerceinventorywarehouseitemService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> GetCommerceInventoryWarehouseItemsAsync(long companyId, string sku, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("sku", sku);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceInventoryWarehouseItemsAsync(long commerceInventoryWarehouseId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> AddCommerceInventoryWarehouseItemAsync(long userId, long commerceInventoryWarehouseId, string sku, int quantity)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_parameters.Add("sku", sku);
			_parameters.Add("quantity", quantity);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouseitem/add-commerce-inventory-warehouse-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceInventoryWarehouseItemAsync(long userId, long commerceInventoryWarehouseId, string externalReferenceCode, string sku, int quantity)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			_parameters.Add("sku", sku);
			_parameters.Add("quantity", quantity);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouseitem/add-commerce-inventory-warehouse-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceInventoryWarehouseItemAsync(long commerceInventoryWarehouseItemId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceInventoryWarehouseItemId", commerceInventoryWarehouseItemId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouseitem/delete-commerce-inventory-warehouse-item", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteCommerceInventoryWarehouseItemsAsync(long companyId, string sku)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("sku", sku);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouseitem/delete-commerce-inventory-warehouse-items", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchCommerceInventoryWarehouseItemAsync(long commerceInventoryWarehouseId, string sku)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_parameters.Add("sku", sku);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouseitem/fetch-commerce-inventory-warehouse-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCommerceInventoryWarehouseItemByReferenceCodeAsync(long companyId, string externalReferenceCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouseitem/fetch-commerce-inventory-warehouse-item-by-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceInventoryWarehouseItemAsync(long commerceInventoryWarehouseItemId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceInventoryWarehouseItemId", commerceInventoryWarehouseItemId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceInventoryWarehouseItemByReferenceCodeAsync(long companyId, string externalReferenceCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-item-by-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceInventoryWarehouseItemsByCompanyIdAsync(long companyId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items-by-company-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceInventoryWarehouseItemsByCompanyIdAndSkuAsync(long companyId, string sku, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("sku", sku);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items-by-company-id-and-sku", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceInventoryWarehouseItemsCountAsync(long companyId, string sku)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("sku", sku);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceInventoryWarehouseItemsCountAsync(long commerceInventoryWarehouseId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceInventoryWarehouseId", commerceInventoryWarehouseId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceInventoryWarehouseItemsCountByCompanyIdAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items-count-by-company-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceInventoryWarehouseItemsCountByModifiedDateAsync(long companyId, long startDate, long endDate)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items-count-by-modified-date", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceInventoryWarehouseItemsCountByModifiedDateAsync(long companyId, long startDate, long endDate, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("startDate", startDate);
			_parameters.Add("endDate", endDate);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouseitem/get-commerce-inventory-warehouse-items-count-by-modified-date", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> IncreaseCommerceInventoryWarehouseItemQuantityAsync(long commerceInventoryWarehouseItemId, int quantity)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceInventoryWarehouseItemId", commerceInventoryWarehouseItemId);
			_parameters.Add("quantity", quantity);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouseitem/increase-commerce-inventory-warehouse-item-quantity", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task MoveQuantitiesBetweenWarehousesAsync(long fromCommerceInventoryWarehouseId, long toCommerceInventoryWarehouseId, string sku, int quantity)
		{
			var _parameters = new JsonObject();

			_parameters.Add("fromCommerceInventoryWarehouseId", fromCommerceInventoryWarehouseId);
			_parameters.Add("toCommerceInventoryWarehouseId", toCommerceInventoryWarehouseId);
			_parameters.Add("sku", sku);
			_parameters.Add("quantity", quantity);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouseitem/move-quantities-between-warehouses", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateCommerceInventoryWarehouseItemAsync(long commerceInventoryWarehouseItemId, int quantity, int reservedQuantity, long mvccVersion)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceInventoryWarehouseItemId", commerceInventoryWarehouseItemId);
			_parameters.Add("quantity", quantity);
			_parameters.Add("reservedQuantity", reservedQuantity);
			_parameters.Add("mvccVersion", mvccVersion);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouseitem/update-commerce-inventory-warehouse-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceInventoryWarehouseItemAsync(long commerceInventoryWarehouseItemId, int quantity, long mvccVersion)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceInventoryWarehouseItemId", commerceInventoryWarehouseItemId);
			_parameters.Add("quantity", quantity);
			_parameters.Add("mvccVersion", mvccVersion);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouseitem/update-commerce-inventory-warehouse-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpsertCommerceInventoryWarehouseItemAsync(long companyId, long userId, long commerceInventoryWarehouseId, string externalReferenceCode, string sku, int quantity)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("userId", userId);
			_parameters.Add("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			_parameters.Add("sku", sku);
			_parameters.Add("quantity", quantity);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouseitem/upsert-commerce-inventory-warehouse-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpsertCommerceInventoryWarehouseItemAsync(long userId, long commerceInventoryWarehouseId, string sku, int quantity)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_parameters.Add("sku", sku);
			_parameters.Add("quantity", quantity);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouseitem/upsert-commerce-inventory-warehouse-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}