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

namespace Liferay.SDK.Service.V73.Commerceshipmentitem
{
	public class CommerceshipmentitemService : ServiceBase
	{
		public CommerceshipmentitemService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> GetCommerceShipmentItemsAsync(long commerceOrderItemId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderItemId", commerceOrderItemId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipmentitem/get-commerce-shipment-items", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceShipmentItemsAsync(long commerceShipmentId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShipmentId", commerceShipmentId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipmentitem/get-commerce-shipment-items", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> AddCommerceShipmentItemAsync(long commerceShipmentId, long commerceOrderItemId, long commerceInventoryWarehouseId, int quantity, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShipmentId", commerceShipmentId);
			_parameters.Add("commerceOrderItemId", commerceOrderItemId);
			_parameters.Add("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_parameters.Add("quantity", quantity);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipmentitem/add-commerce-shipment-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCommerceShipmentItemAsync(long commerceShipmentId, long commerceOrderItemId, long commerceInventoryWarehouseId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShipmentId", commerceShipmentId);
			_parameters.Add("commerceOrderItemId", commerceOrderItemId);
			_parameters.Add("commerceInventoryWarehouseId", commerceInventoryWarehouseId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipmentitem/fetch-commerce-shipment-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceShipmentItemAsync(long commerceShipmentItemId, bool restoreStockQuantity)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShipmentItemId", commerceShipmentItemId);
			_parameters.Add("restoreStockQuantity", restoreStockQuantity);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipmentitem/delete-commerce-shipment-item", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteCommerceShipmentItemAsync(long commerceShipmentItemId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShipmentItemId", commerceShipmentItemId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipmentitem/delete-commerce-shipment-item", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetCommerceShipmentItemsByCommerceOrderItemIdAsync(long commerceOrderItemId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderItemId", commerceOrderItemId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipmentitem/get-commerce-shipment-items-by-commerce-order-item-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceShipmentItemsCountAsync(long commerceShipmentId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShipmentId", commerceShipmentId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipmentitem/get-commerce-shipment-items-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceShipmentItemsCountByCommerceOrderItemIdAsync(long commerceOrderItemId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderItemId", commerceOrderItemId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipmentitem/get-commerce-shipment-items-count-by-commerce-order-item-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceShipmentOrderItemsQuantityAsync(long commerceShipmentId, long commerceOrderItemId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShipmentId", commerceShipmentId);
			_parameters.Add("commerceOrderItemId", commerceOrderItemId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipmentitem/get-commerce-shipment-order-items-quantity", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCommerceShipmentItemAsync(long commerceShipmentItemId, int quantity)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShipmentItemId", commerceShipmentItemId);
			_parameters.Add("quantity", quantity);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipmentitem/update-commerce-shipment-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceShipmentItemAsync(long commerceShipmentItemId, long commerceInventoryWarehouseId, int quantity)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShipmentItemId", commerceShipmentItemId);
			_parameters.Add("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_parameters.Add("quantity", quantity);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipmentitem/update-commerce-shipment-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceShipmentItemAsync(long commerceShipmentItemId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShipmentItemId", commerceShipmentItemId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipmentitem/get-commerce-shipment-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}