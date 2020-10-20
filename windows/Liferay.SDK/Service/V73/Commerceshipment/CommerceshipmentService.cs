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

namespace Liferay.SDK.Service.V73.Commerceshipment
{
	public class CommerceshipmentService : ServiceBase
	{
		public CommerceshipmentService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> UpdateAddressAsync(long commerceShipmentId, string name, string description, string street1, string street2, string street3, string city, string zip, long commerceRegionId, long commerceCountryId, string phoneNumber)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShipmentId", commerceShipmentId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("street1", street1);
			_parameters.Add("street2", street2);
			_parameters.Add("street3", street3);
			_parameters.Add("city", city);
			_parameters.Add("zip", zip);
			_parameters.Add("commerceRegionId", commerceRegionId);
			_parameters.Add("commerceCountryId", commerceCountryId);
			_parameters.Add("phoneNumber", phoneNumber);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipment/update-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateStatusAsync(long commerceShipmentId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShipmentId", commerceShipmentId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipment/update-status", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceShipmentAsync(long commerceShipmentId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShipmentId", commerceShipmentId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipment/delete-commerce-shipment", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteCommerceShipmentAsync(long commerceShipmentId, bool restoreStockQuantity)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShipmentId", commerceShipmentId);
			_parameters.Add("restoreStockQuantity", restoreStockQuantity);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipment/delete-commerce-shipment", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddCommerceShipmentAsync(long groupId, long commerceAccountId, long commerceAddressId, long commerceShippingMethodId, string commerceShippingOptionName, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("commerceAddressId", commerceAddressId);
			_parameters.Add("commerceShippingMethodId", commerceShippingMethodId);
			_parameters.Add("commerceShippingOptionName", commerceShippingOptionName);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipment/add-commerce-shipment", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceShipmentAsync(long commerceOrderId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipment/add-commerce-shipment", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceShipmentAsync(long commerceShipmentId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShipmentId", commerceShipmentId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipment/get-commerce-shipment", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceShipmentsAsync(long companyId, long commerceAddressId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("commerceAddressId", commerceAddressId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipment/get-commerce-shipments", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceShipmentsAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> commerceAccountIds, string keywords, IEnumerable<int> shipmentStatuses, bool excludeShipmentStatus, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("commerceAccountIds", commerceAccountIds);
			_parameters.Add("keywords", keywords);
			_parameters.Add("shipmentStatuses", shipmentStatuses);
			_parameters.Add("excludeShipmentStatus", excludeShipmentStatus);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipment/get-commerce-shipments", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceShipmentsAsync(long companyId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipment/get-commerce-shipments", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceShipmentsAsync(long companyId, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipment/get-commerce-shipments", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceShipmentsCountAsync(long companyId, long commerceAddressId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("commerceAddressId", commerceAddressId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipment/get-commerce-shipments-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceShipmentsCountAsync(long companyId, IEnumerable<long> groupIds, IEnumerable<long> commerceAccountIds, string keywords, IEnumerable<int> shipmentStatuses, bool excludeShipmentStatus)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("commerceAccountIds", commerceAccountIds);
			_parameters.Add("keywords", keywords);
			_parameters.Add("shipmentStatuses", shipmentStatuses);
			_parameters.Add("excludeShipmentStatus", excludeShipmentStatus);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipment/get-commerce-shipments-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceShipmentsCountAsync(long companyId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipment/get-commerce-shipments-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceShipmentsCountAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipment/get-commerce-shipments-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCarrierDetailsAsync(long commerceShipmentId, string carrier, string trackingNumber)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShipmentId", commerceShipmentId);
			_parameters.Add("carrier", carrier);
			_parameters.Add("trackingNumber", trackingNumber);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipment/update-carrier-details", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceShipmentAsync(long commerceShipmentId, string carrier, string trackingNumber, int status, int shippingDateMonth, int shippingDateDay, int shippingDateYear, int shippingDateHour, int shippingDateMinute, int expectedDateMonth, int expectedDateDay, int expectedDateYear, int expectedDateHour, int expectedDateMinute)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShipmentId", commerceShipmentId);
			_parameters.Add("carrier", carrier);
			_parameters.Add("trackingNumber", trackingNumber);
			_parameters.Add("status", status);
			_parameters.Add("shippingDateMonth", shippingDateMonth);
			_parameters.Add("shippingDateDay", shippingDateDay);
			_parameters.Add("shippingDateYear", shippingDateYear);
			_parameters.Add("shippingDateHour", shippingDateHour);
			_parameters.Add("shippingDateMinute", shippingDateMinute);
			_parameters.Add("expectedDateMonth", expectedDateMonth);
			_parameters.Add("expectedDateDay", expectedDateDay);
			_parameters.Add("expectedDateYear", expectedDateYear);
			_parameters.Add("expectedDateHour", expectedDateHour);
			_parameters.Add("expectedDateMinute", expectedDateMinute);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipment/update-commerce-shipment", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceShipmentAsync(long commerceShipmentId, string name, string description, string street1, string street2, string street3, string city, string zip, long commerceRegionId, long commerceCountryId, string phoneNumber, string carrier, string trackingNumber, int status, int shippingDateMonth, int shippingDateDay, int shippingDateYear, int shippingDateHour, int shippingDateMinute, int expectedDateMonth, int expectedDateDay, int expectedDateYear, int expectedDateHour, int expectedDateMinute)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShipmentId", commerceShipmentId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("street1", street1);
			_parameters.Add("street2", street2);
			_parameters.Add("street3", street3);
			_parameters.Add("city", city);
			_parameters.Add("zip", zip);
			_parameters.Add("commerceRegionId", commerceRegionId);
			_parameters.Add("commerceCountryId", commerceCountryId);
			_parameters.Add("phoneNumber", phoneNumber);
			_parameters.Add("carrier", carrier);
			_parameters.Add("trackingNumber", trackingNumber);
			_parameters.Add("status", status);
			_parameters.Add("shippingDateMonth", shippingDateMonth);
			_parameters.Add("shippingDateDay", shippingDateDay);
			_parameters.Add("shippingDateYear", shippingDateYear);
			_parameters.Add("shippingDateHour", shippingDateHour);
			_parameters.Add("shippingDateMinute", shippingDateMinute);
			_parameters.Add("expectedDateMonth", expectedDateMonth);
			_parameters.Add("expectedDateDay", expectedDateDay);
			_parameters.Add("expectedDateYear", expectedDateYear);
			_parameters.Add("expectedDateHour", expectedDateHour);
			_parameters.Add("expectedDateMinute", expectedDateMinute);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipment/update-commerce-shipment", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateExpectedDateAsync(long commerceShipmentId, int expectedDateMonth, int expectedDateDay, int expectedDateYear, int expectedDateHour, int expectedDateMinute)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShipmentId", commerceShipmentId);
			_parameters.Add("expectedDateMonth", expectedDateMonth);
			_parameters.Add("expectedDateDay", expectedDateDay);
			_parameters.Add("expectedDateYear", expectedDateYear);
			_parameters.Add("expectedDateHour", expectedDateHour);
			_parameters.Add("expectedDateMinute", expectedDateMinute);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipment/update-expected-date", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateShippingDateAsync(long commerceShipmentId, int shippingDateMonth, int shippingDateDay, int shippingDateYear, int shippingDateHour, int shippingDateMinute)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceShipmentId", commerceShipmentId);
			_parameters.Add("shippingDateMonth", shippingDateMonth);
			_parameters.Add("shippingDateDay", shippingDateDay);
			_parameters.Add("shippingDateYear", shippingDateYear);
			_parameters.Add("shippingDateHour", shippingDateHour);
			_parameters.Add("shippingDateMinute", shippingDateMinute);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipment/update-shipping-date", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceShipmentsByOrderIdAsync(long commerceOrderId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipment/get-commerce-shipments-by-order-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceShipmentsCountByOrderIdAsync(long commerceOrderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceshipment/get-commerce-shipments-count-by-order-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}
	}
}