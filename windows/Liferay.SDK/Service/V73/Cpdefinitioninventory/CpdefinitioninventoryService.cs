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

namespace Liferay.SDK.Service.V73.Cpdefinitioninventory
{
	public class CpdefinitioninventoryService : ServiceBase
	{
		public CpdefinitioninventoryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddCpDefinitionInventoryAsync(long userId, long cpDefinitionId, string cpDefinitionInventoryEngine, string lowStockActivity, bool displayAvailability, bool displayStockQuantity, int minStockQuantity, bool backOrders, int minOrderQuantity, int maxOrderQuantity, string allowedOrderQuantities, int multipleOrderQuantity)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("cpDefinitionInventoryEngine", cpDefinitionInventoryEngine);
			_parameters.Add("lowStockActivity", lowStockActivity);
			_parameters.Add("displayAvailability", displayAvailability);
			_parameters.Add("displayStockQuantity", displayStockQuantity);
			_parameters.Add("minStockQuantity", minStockQuantity);
			_parameters.Add("backOrders", backOrders);
			_parameters.Add("minOrderQuantity", minOrderQuantity);
			_parameters.Add("maxOrderQuantity", maxOrderQuantity);
			_parameters.Add("allowedOrderQuantities", allowedOrderQuantities);
			_parameters.Add("multipleOrderQuantity", multipleOrderQuantity);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitioninventory/add-cp-definition-inventory", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCpDefinitionInventoryAsync(long cpDefinitionInventoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionInventoryId", cpDefinitionInventoryId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitioninventory/delete-cp-definition-inventory", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchCpDefinitionInventoryByCpDefinitionIdAsync(long cpDefinitionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitioninventory/fetch-cp-definition-inventory-by-cp-definition-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCpDefinitionInventoryAsync(long cpDefinitionInventoryId, string cpDefinitionInventoryEngine, string lowStockActivity, bool displayAvailability, bool displayStockQuantity, int minStockQuantity, bool backOrders, int minOrderQuantity, int maxOrderQuantity, string allowedOrderQuantities, int multipleOrderQuantity)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionInventoryId", cpDefinitionInventoryId);
			_parameters.Add("cpDefinitionInventoryEngine", cpDefinitionInventoryEngine);
			_parameters.Add("lowStockActivity", lowStockActivity);
			_parameters.Add("displayAvailability", displayAvailability);
			_parameters.Add("displayStockQuantity", displayStockQuantity);
			_parameters.Add("minStockQuantity", minStockQuantity);
			_parameters.Add("backOrders", backOrders);
			_parameters.Add("minOrderQuantity", minOrderQuantity);
			_parameters.Add("maxOrderQuantity", maxOrderQuantity);
			_parameters.Add("allowedOrderQuantities", allowedOrderQuantities);
			_parameters.Add("multipleOrderQuantity", multipleOrderQuantity);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitioninventory/update-cp-definition-inventory", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCpDefinitionInventoryAsync(long groupId, long cpDefinitionInventoryId, string cpDefinitionInventoryEngine, string lowStockActivity, bool displayAvailability, bool displayStockQuantity, int minStockQuantity, bool backOrders, int minOrderQuantity, int maxOrderQuantity, string allowedOrderQuantities, int multipleOrderQuantity)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("cpDefinitionInventoryId", cpDefinitionInventoryId);
			_parameters.Add("cpDefinitionInventoryEngine", cpDefinitionInventoryEngine);
			_parameters.Add("lowStockActivity", lowStockActivity);
			_parameters.Add("displayAvailability", displayAvailability);
			_parameters.Add("displayStockQuantity", displayStockQuantity);
			_parameters.Add("minStockQuantity", minStockQuantity);
			_parameters.Add("backOrders", backOrders);
			_parameters.Add("minOrderQuantity", minOrderQuantity);
			_parameters.Add("maxOrderQuantity", maxOrderQuantity);
			_parameters.Add("allowedOrderQuantities", allowedOrderQuantities);
			_parameters.Add("multipleOrderQuantity", multipleOrderQuantity);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinitioninventory/update-cp-definition-inventory", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}