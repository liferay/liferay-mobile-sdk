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

namespace Liferay.SDK.Service.V73.Commerceorderitem
{
	public class CommerceorderitemService : ServiceBase
	{
		public CommerceorderitemService(ISession session)
			: base(session)
		{
		}

		public async Task DeleteCommerceOrderItemAsync(long commerceOrderItemId, JsonObjectWrapper commerceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderItemId", commerceOrderItemId);
			this.MangleWrapper(_parameters, "commerceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", commerceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/delete-commerce-order-item", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteCommerceOrderItemAsync(long commerceOrderItemId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderItemId", commerceOrderItemId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/delete-commerce-order-item", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetCommerceOrderItemsAsync(long groupId, long commerceAccountId, IEnumerable<int> orderStatuses, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("orderStatuses", orderStatuses);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/get-commerce-order-items", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceOrderItemsAsync(long commerceOrderId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/get-commerce-order-items", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetChildCommerceOrderItemsAsync(long parentCommerceOrderItemId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("parentCommerceOrderItemId", parentCommerceOrderItemId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/get-child-commerce-order-items", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceOrderItemsCountAsync(long commerceOrderId, long cpInstanceId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("cpInstanceId", cpInstanceId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/get-commerce-order-items-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceOrderItemsCountAsync(long groupId, long commerceAccountId, IEnumerable<int> orderStatuses)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("orderStatuses", orderStatuses);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/get-commerce-order-items-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceOrderItemsCountAsync(long commerceOrderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/get-commerce-order-items-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> FetchByExternalReferenceCodeAsync(long companyId, string externalReferenceCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/fetch-by-external-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceOrderItemAsync(long commerceOrderId, long cpInstanceId, int quantity, int shippedQuantity, string json, JsonObjectWrapper commerceContext, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("cpInstanceId", cpInstanceId);
			_parameters.Add("quantity", quantity);
			_parameters.Add("shippedQuantity", shippedQuantity);
			_parameters.Add("json", json);
			this.MangleWrapper(_parameters, "commerceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", commerceContext);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/add-commerce-order-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> CountSubscriptionCommerceOrderItemsAsync(long commerceOrderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/count-subscription-commerce-order-items", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task DeleteCommerceOrderItemsAsync(long commerceOrderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/delete-commerce-order-items", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchCommerceOrderItemAsync(long commerceOrderItemId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderItemId", commerceOrderItemId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/fetch-commerce-order-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetAvailableForShipmentCommerceOrderItemsAsync(long commerceOrderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/get-available-for-shipment-commerce-order-items", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceInventoryWarehouseItemQuantityAsync(long commerceOrderItemId, long commerceInventoryWarehouseId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderItemId", commerceOrderItemId);
			_parameters.Add("commerceInventoryWarehouseId", commerceInventoryWarehouseId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/get-commerce-inventory-warehouse-item-quantity", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> GetCommerceOrderItemAsync(long commerceOrderItemId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderItemId", commerceOrderItemId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/get-commerce-order-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetCommerceOrderItemsQuantityAsync(long commerceOrderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/get-commerce-order-items-quantity", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCommerceOrderItemAsync(long commerceOrderItemId, int quantity, string json, JsonObjectWrapper commerceContext, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderItemId", commerceOrderItemId);
			_parameters.Add("quantity", quantity);
			_parameters.Add("json", json);
			this.MangleWrapper(_parameters, "commerceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", commerceContext);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/update-commerce-order-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceOrderItemAsync(long commerceOrderItemId, int quantity, JsonObjectWrapper commerceContext, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderItemId", commerceOrderItemId);
			_parameters.Add("quantity", quantity);
			this.MangleWrapper(_parameters, "commerceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", commerceContext);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/update-commerce-order-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceOrderItemDeliveryDateAsync(long commerceOrderItemId, long requestedDeliveryDate)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderItemId", commerceOrderItemId);
			_parameters.Add("requestedDeliveryDate", requestedDeliveryDate);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/update-commerce-order-item-delivery-date", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceOrderItemInfoAsync(long commerceOrderItemId, string deliveryGroup, long shippingAddressId, string printedNote, int requestedDeliveryDateMonth, int requestedDeliveryDateDay, int requestedDeliveryDateYear)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderItemId", commerceOrderItemId);
			_parameters.Add("deliveryGroup", deliveryGroup);
			_parameters.Add("shippingAddressId", shippingAddressId);
			_parameters.Add("printedNote", printedNote);
			_parameters.Add("requestedDeliveryDateMonth", requestedDeliveryDateMonth);
			_parameters.Add("requestedDeliveryDateDay", requestedDeliveryDateDay);
			_parameters.Add("requestedDeliveryDateYear", requestedDeliveryDateYear);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/update-commerce-order-item-info", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceOrderItemInfoAsync(long commerceOrderItemId, string deliveryGroup, long shippingAddressId, string printedNote, int requestedDeliveryDateMonth, int requestedDeliveryDateDay, int requestedDeliveryDateYear, int requestedDeliveryDateHour, int requestedDeliveryDateMinute, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderItemId", commerceOrderItemId);
			_parameters.Add("deliveryGroup", deliveryGroup);
			_parameters.Add("shippingAddressId", shippingAddressId);
			_parameters.Add("printedNote", printedNote);
			_parameters.Add("requestedDeliveryDateMonth", requestedDeliveryDateMonth);
			_parameters.Add("requestedDeliveryDateDay", requestedDeliveryDateDay);
			_parameters.Add("requestedDeliveryDateYear", requestedDeliveryDateYear);
			_parameters.Add("requestedDeliveryDateHour", requestedDeliveryDateHour);
			_parameters.Add("requestedDeliveryDateMinute", requestedDeliveryDateMinute);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/update-commerce-order-item-info", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceOrderItemInfoAsync(long commerceOrderItemId, string deliveryGroup, long shippingAddressId, string printedNote)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderItemId", commerceOrderItemId);
			_parameters.Add("deliveryGroup", deliveryGroup);
			_parameters.Add("shippingAddressId", shippingAddressId);
			_parameters.Add("printedNote", printedNote);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/update-commerce-order-item-info", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceOrderItemPricesAsync(long commerceOrderItemId, IDictionary<string, object> unitPrice, IDictionary<string, object> promoPrice, IDictionary<string, object> discountAmount, IDictionary<string, object> finalPrice, IDictionary<string, object> discountPercentageLevel1, IDictionary<string, object> discountPercentageLevel2, IDictionary<string, object> discountPercentageLevel3, IDictionary<string, object> discountPercentageLevel4)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderItemId", commerceOrderItemId);
			_parameters.Add("unitPrice", unitPrice);
			_parameters.Add("promoPrice", promoPrice);
			_parameters.Add("discountAmount", discountAmount);
			_parameters.Add("finalPrice", finalPrice);
			_parameters.Add("discountPercentageLevel1", discountPercentageLevel1);
			_parameters.Add("discountPercentageLevel2", discountPercentageLevel2);
			_parameters.Add("discountPercentageLevel3", discountPercentageLevel3);
			_parameters.Add("discountPercentageLevel4", discountPercentageLevel4);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/update-commerce-order-item-prices", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceOrderItemPricesAsync(long commerceOrderItemId, IDictionary<string, object> unitPrice, IDictionary<string, object> promoPrice, IDictionary<string, object> discountAmount, IDictionary<string, object> finalPrice, IDictionary<string, object> discountPercentageLevel1, IDictionary<string, object> discountPercentageLevel2, IDictionary<string, object> discountPercentageLevel3, IDictionary<string, object> discountPercentageLevel4, IDictionary<string, object> unitPriceWithTaxAmount, IDictionary<string, object> promoPriceWithTaxAmount, IDictionary<string, object> discountAmountWithTaxAmount, IDictionary<string, object> finalPriceWithTaxAmount, IDictionary<string, object> discountPercentageLevel1WithTaxAmount, IDictionary<string, object> discountPercentageLevel2WithTaxAmount, IDictionary<string, object> discountPercentageLevel3WithTaxAmount, IDictionary<string, object> discountPercentageLevel4WithTaxAmount)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderItemId", commerceOrderItemId);
			_parameters.Add("unitPrice", unitPrice);
			_parameters.Add("promoPrice", promoPrice);
			_parameters.Add("discountAmount", discountAmount);
			_parameters.Add("finalPrice", finalPrice);
			_parameters.Add("discountPercentageLevel1", discountPercentageLevel1);
			_parameters.Add("discountPercentageLevel2", discountPercentageLevel2);
			_parameters.Add("discountPercentageLevel3", discountPercentageLevel3);
			_parameters.Add("discountPercentageLevel4", discountPercentageLevel4);
			_parameters.Add("unitPriceWithTaxAmount", unitPriceWithTaxAmount);
			_parameters.Add("promoPriceWithTaxAmount", promoPriceWithTaxAmount);
			_parameters.Add("discountAmountWithTaxAmount", discountAmountWithTaxAmount);
			_parameters.Add("finalPriceWithTaxAmount", finalPriceWithTaxAmount);
			_parameters.Add("discountPercentageLevel1WithTaxAmount", discountPercentageLevel1WithTaxAmount);
			_parameters.Add("discountPercentageLevel2WithTaxAmount", discountPercentageLevel2WithTaxAmount);
			_parameters.Add("discountPercentageLevel3WithTaxAmount", discountPercentageLevel3WithTaxAmount);
			_parameters.Add("discountPercentageLevel4WithTaxAmount", discountPercentageLevel4WithTaxAmount);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/update-commerce-order-item-prices", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceOrderItemUnitPriceAsync(long commerceOrderItemId, IDictionary<string, object> unitPrice, int quantity)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderItemId", commerceOrderItemId);
			_parameters.Add("unitPrice", unitPrice);
			_parameters.Add("quantity", quantity);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/update-commerce-order-item-unit-price", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceOrderItemUnitPriceAsync(long commerceOrderItemId, IDictionary<string, object> unitPrice)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderItemId", commerceOrderItemId);
			_parameters.Add("unitPrice", unitPrice);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/update-commerce-order-item-unit-price", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCustomFieldsAsync(long commerceOrderItemId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderItemId", commerceOrderItemId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/update-custom-fields", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpsertCommerceOrderItemAsync(long commerceOrderId, long cpInstanceId, int quantity, int shippedQuantity, string json, JsonObjectWrapper commerceContext, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("cpInstanceId", cpInstanceId);
			_parameters.Add("quantity", quantity);
			_parameters.Add("shippedQuantity", shippedQuantity);
			_parameters.Add("json", json);
			this.MangleWrapper(_parameters, "commerceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", commerceContext);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/upsert-commerce-order-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchAsync(long commerceOrderId, string sku, string name, bool andOperator, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("sku", sku);
			_parameters.Add("name", name);
			_parameters.Add("andOperator", andOperator);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchAsync(long commerceOrderId, long parentCommerceOrderItemId, string keywords, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("parentCommerceOrderItemId", parentCommerceOrderItemId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchAsync(long commerceOrderId, string keywords, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorderitem/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}