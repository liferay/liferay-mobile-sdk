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

namespace Liferay.SDK.Service.V73.Commerceinventorywarehouse
{
	public class CommerceinventorywarehouseService : ServiceBase
	{
		public CommerceinventorywarehouseService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> SetActiveAsync(long commerceInventoryWarehouseId, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouse/set-active", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchByExternalReferenceCodeAsync(long companyId, string externalReferenceCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouse/fetch-by-external-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceInventoryWarehouseAsync(string name, string description, bool active, string street1, string street2, string street3, string city, string zip, string commerceRegionCode, string commerceCountryCode, double latitude, double longitude, string externalReferenceCode, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("active", active);
			_parameters.Add("street1", street1);
			_parameters.Add("street2", street2);
			_parameters.Add("street3", street3);
			_parameters.Add("city", city);
			_parameters.Add("zip", zip);
			_parameters.Add("commerceRegionCode", commerceRegionCode);
			_parameters.Add("commerceCountryCode", commerceCountryCode);
			_parameters.Add("latitude", latitude);
			_parameters.Add("longitude", longitude);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouse/add-commerce-inventory-warehouse", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteCommerceInventoryWarehouseAsync(long commerceInventoryWarehouseId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceInventoryWarehouseId", commerceInventoryWarehouseId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouse/delete-commerce-inventory-warehouse", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GeolocateCommerceInventoryWarehouseAsync(long commerceInventoryWarehouseId, double latitude, double longitude)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_parameters.Add("latitude", latitude);
			_parameters.Add("longitude", longitude);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouse/geolocate-commerce-inventory-warehouse", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceInventoryWarehouseAsync(long commerceInventoryWarehouseId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceInventoryWarehouseId", commerceInventoryWarehouseId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouse/get-commerce-inventory-warehouse", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceInventoryWarehousesAsync(long companyId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouse/get-commerce-inventory-warehouses", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceInventoryWarehousesAsync(long companyId, long groupId, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouse/get-commerce-inventory-warehouses", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceInventoryWarehousesAsync(long companyId, bool active, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("active", active);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouse/get-commerce-inventory-warehouses", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceInventoryWarehousesAsync(long companyId, bool active, string commerceCountryCode, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("active", active);
			_parameters.Add("commerceCountryCode", commerceCountryCode);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouse/get-commerce-inventory-warehouses", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceInventoryWarehousesCountAsync(long companyId, bool active, string commerceCountryCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("active", active);
			_parameters.Add("commerceCountryCode", commerceCountryCode);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouse/get-commerce-inventory-warehouses-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceInventoryWarehousesCountAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouse/get-commerce-inventory-warehouses-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchCommerceInventoryWarehousesAsync(long companyId, bool active, string commerceCountryCode, string keywords, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("active", active);
			_parameters.Add("commerceCountryCode", commerceCountryCode);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouse/search-commerce-inventory-warehouses", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> SearchCommerceInventoryWarehousesCountAsync(long companyId, bool active, string commerceCountryCode, string keywords)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("active", active);
			_parameters.Add("commerceCountryCode", commerceCountryCode);
			_parameters.Add("keywords", keywords);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouse/search-commerce-inventory-warehouses-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCommerceInventoryWarehouseAsync(long commerceInventoryWarehouseId, string name, string description, bool active, string street1, string street2, string street3, string city, string zip, string commerceRegionCode, string commerceCountryCode, double latitude, double longitude, long mvccVersion, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceInventoryWarehouseId", commerceInventoryWarehouseId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("active", active);
			_parameters.Add("street1", street1);
			_parameters.Add("street2", street2);
			_parameters.Add("street3", street3);
			_parameters.Add("city", city);
			_parameters.Add("zip", zip);
			_parameters.Add("commerceRegionCode", commerceRegionCode);
			_parameters.Add("commerceCountryCode", commerceCountryCode);
			_parameters.Add("latitude", latitude);
			_parameters.Add("longitude", longitude);
			_parameters.Add("mvccVersion", mvccVersion);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceinventorywarehouse/update-commerce-inventory-warehouse", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}