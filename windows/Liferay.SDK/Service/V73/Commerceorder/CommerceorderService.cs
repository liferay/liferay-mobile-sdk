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

namespace Liferay.SDK.Service.V73.Commerceorder
{
	public class CommerceorderService : ServiceBase
	{
		public CommerceorderService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> UpdateUserAsync(long commerceOrderId, long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/update-user", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceOrderAsync(long commerceOrderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/get-commerce-order", _parameters }
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
				{ "/commerce.commerceorder/fetch-by-external-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCustomFieldsAsync(long commerceOrderId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/update-custom-fields", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceOrderAsync(long userId, long groupId, long commerceAccountId, long commerceCurrencyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("commerceCurrencyId", commerceCurrencyId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/add-commerce-order", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceOrderAsync(long groupId, long commerceAccountId, long commerceCurrencyId, long shippingAddressId, string purchaseOrderNumber)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("commerceCurrencyId", commerceCurrencyId);
			_parameters.Add("shippingAddressId", shippingAddressId);
			_parameters.Add("purchaseOrderNumber", purchaseOrderNumber);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/add-commerce-order", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceOrderAsync(long groupId, long commerceAccountId, long shippingAddressId, string purchaseOrderNumber)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("shippingAddressId", shippingAddressId);
			_parameters.Add("purchaseOrderNumber", purchaseOrderNumber);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/add-commerce-order", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> ApplyCouponCodeAsync(long commerceOrderId, string couponCode, JsonObjectWrapper commerceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("couponCode", couponCode);
			this.MangleWrapper(_parameters, "commerceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", commerceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/apply-coupon-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceOrderAsync(long commerceOrderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/delete-commerce-order", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> ExecuteWorkflowTransitionAsync(long commerceOrderId, long workflowTaskId, string transitionName, string comment)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("workflowTaskId", workflowTaskId);
			_parameters.Add("transitionName", transitionName);
			_parameters.Add("comment", comment);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/execute-workflow-transition", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCommerceOrderAsync(string uuid, long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("uuid", uuid);
			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/fetch-commerce-order", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCommerceOrderAsync(long commerceOrderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/fetch-commerce-order", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCommerceOrderAsync(long commerceAccountId, long groupId, int orderStatus)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("orderStatus", orderStatus);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/fetch-commerce-order", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCommerceOrderAsync(long commerceAccountId, long groupId, long userId, int orderStatus)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("orderStatus", orderStatus);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/fetch-commerce-order", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceOrderByUuidAndGroupIdAsync(string uuid, long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("uuid", uuid);
			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/get-commerce-order-by-uuid-and-group-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceOrdersAsync(long groupId, IEnumerable<int> orderStatuses, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("orderStatuses", orderStatuses);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/get-commerce-orders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceOrdersAsync(long groupId, long commerceAccountId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/get-commerce-orders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceOrdersAsync(long groupId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/get-commerce-orders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceOrdersAsync(long groupId, IEnumerable<int> orderStatuses)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("orderStatuses", orderStatuses);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/get-commerce-orders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceOrdersCountAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/get-commerce-orders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceOrdersCountAsync(long groupId, long commerceAccountId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceAccountId", commerceAccountId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/get-commerce-orders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetPendingCommerceOrdersAsync(long groupId, long commerceAccountId, string keywords, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/get-pending-commerce-orders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetPendingCommerceOrdersCountAsync(long groupId, long commerceAccountId, string keywords)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("keywords", keywords);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/get-pending-commerce-orders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetPendingCommerceOrdersCountAsync(long companyId, long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/get-pending-commerce-orders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetPlacedCommerceOrdersAsync(long groupId, long commerceAccountId, string keywords, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/get-placed-commerce-orders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetPlacedCommerceOrdersAsync(long companyId, long groupId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/get-placed-commerce-orders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetPlacedCommerceOrdersCountAsync(long companyId, long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/get-placed-commerce-orders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetPlacedCommerceOrdersCountAsync(long groupId, long commerceAccountId, string keywords)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("keywords", keywords);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/get-placed-commerce-orders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserPendingCommerceOrdersAsync(long companyId, long groupId, string keywords, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/get-user-pending-commerce-orders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetUserPendingCommerceOrdersCountAsync(long companyId, long groupId, string keywords)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("keywords", keywords);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/get-user-pending-commerce-orders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserPlacedCommerceOrdersAsync(long companyId, long groupId, string keywords, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/get-user-placed-commerce-orders", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetUserPlacedCommerceOrdersCountAsync(long companyId, long groupId, string keywords)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("keywords", keywords);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/get-user-placed-commerce-orders-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task MergeGuestCommerceOrderAsync(long guestCommerceOrderId, long userCommerceOrderId, JsonObjectWrapper commerceContext, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("guestCommerceOrderId", guestCommerceOrderId);
			_parameters.Add("userCommerceOrderId", userCommerceOrderId);
			this.MangleWrapper(_parameters, "commerceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", commerceContext);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/merge-guest-commerce-order", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> RecalculatePriceAsync(long commerceOrderId, JsonObjectWrapper commerceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			this.MangleWrapper(_parameters, "commerceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", commerceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/recalculate-price", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> ReorderCommerceOrderAsync(long commerceOrderId, JsonObjectWrapper commerceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			this.MangleWrapper(_parameters, "commerceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", commerceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/reorder-commerce-order", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateBillingAddressAsync(long commerceOrderId, long billingAddressId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("billingAddressId", billingAddressId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/update-billing-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateBillingAddressAsync(long commerceOrderId, string name, string description, string street1, string street2, string street3, string city, string zip, long commerceRegionId, long commerceCountryId, string phoneNumber, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
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
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/update-billing-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceOrderAsync(long commerceOrderId, long billingAddressId, long shippingAddressId, string commercePaymentMethodKey, long commerceShippingMethodId, string shippingOptionName, string purchaseOrderNumber, IDictionary<string, object> subtotal, IDictionary<string, object> shippingAmount, IDictionary<string, object> total, string advanceStatus, string externalReferenceCode, JsonObjectWrapper commerceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("billingAddressId", billingAddressId);
			_parameters.Add("shippingAddressId", shippingAddressId);
			_parameters.Add("commercePaymentMethodKey", commercePaymentMethodKey);
			_parameters.Add("commerceShippingMethodId", commerceShippingMethodId);
			_parameters.Add("shippingOptionName", shippingOptionName);
			_parameters.Add("purchaseOrderNumber", purchaseOrderNumber);
			_parameters.Add("subtotal", subtotal);
			_parameters.Add("shippingAmount", shippingAmount);
			_parameters.Add("total", total);
			_parameters.Add("advanceStatus", advanceStatus);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			this.MangleWrapper(_parameters, "commerceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", commerceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/update-commerce-order", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceOrderAsync(long commerceOrderId, long billingAddressId, long shippingAddressId, string commercePaymentMethodKey, long commerceShippingMethodId, string shippingOptionName, string purchaseOrderNumber, IDictionary<string, object> subtotal, IDictionary<string, object> shippingAmount, IDictionary<string, object> total, IDictionary<string, object> subtotalWithTaxAmount, IDictionary<string, object> shippingWithTaxAmount, IDictionary<string, object> totalWithTaxAmount, string advanceStatus, string externalReferenceCode, JsonObjectWrapper commerceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("billingAddressId", billingAddressId);
			_parameters.Add("shippingAddressId", shippingAddressId);
			_parameters.Add("commercePaymentMethodKey", commercePaymentMethodKey);
			_parameters.Add("commerceShippingMethodId", commerceShippingMethodId);
			_parameters.Add("shippingOptionName", shippingOptionName);
			_parameters.Add("purchaseOrderNumber", purchaseOrderNumber);
			_parameters.Add("subtotal", subtotal);
			_parameters.Add("shippingAmount", shippingAmount);
			_parameters.Add("total", total);
			_parameters.Add("subtotalWithTaxAmount", subtotalWithTaxAmount);
			_parameters.Add("shippingWithTaxAmount", shippingWithTaxAmount);
			_parameters.Add("totalWithTaxAmount", totalWithTaxAmount);
			_parameters.Add("advanceStatus", advanceStatus);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			this.MangleWrapper(_parameters, "commerceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", commerceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/update-commerce-order", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceOrderAsync(JsonObjectWrapper commerceOrder)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "commerceOrder", "$languageUtil.getJSONWrapperClassName($parameter.type)", commerceOrder);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/update-commerce-order", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceOrderAsync(long commerceOrderId, long billingAddressId, long shippingAddressId, string commercePaymentMethodKey, long commerceShippingMethodId, string shippingOptionName, string purchaseOrderNumber, IDictionary<string, object> subtotal, IDictionary<string, object> shippingAmount, IDictionary<string, object> total, string advanceStatus, JsonObjectWrapper commerceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("billingAddressId", billingAddressId);
			_parameters.Add("shippingAddressId", shippingAddressId);
			_parameters.Add("commercePaymentMethodKey", commercePaymentMethodKey);
			_parameters.Add("commerceShippingMethodId", commerceShippingMethodId);
			_parameters.Add("shippingOptionName", shippingOptionName);
			_parameters.Add("purchaseOrderNumber", purchaseOrderNumber);
			_parameters.Add("subtotal", subtotal);
			_parameters.Add("shippingAmount", shippingAmount);
			_parameters.Add("total", total);
			_parameters.Add("advanceStatus", advanceStatus);
			this.MangleWrapper(_parameters, "commerceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", commerceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/update-commerce-order", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceOrderExternalReferenceCodeAsync(long commerceOrderId, string externalReferenceCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/update-commerce-order-external-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceOrderPricesAsync(long commerceOrderId, IDictionary<string, object> subtotal, IDictionary<string, object> subtotalDiscountAmount, IDictionary<string, object> subtotalDiscountPercentageLevel1, IDictionary<string, object> subtotalDiscountPercentageLevel2, IDictionary<string, object> subtotalDiscountPercentageLevel3, IDictionary<string, object> subtotalDiscountPercentageLevel4, IDictionary<string, object> shippingAmount, IDictionary<string, object> shippingDiscountAmount, IDictionary<string, object> shippingDiscountPercentageLevel1, IDictionary<string, object> shippingDiscountPercentageLevel2, IDictionary<string, object> shippingDiscountPercentageLevel3, IDictionary<string, object> shippingDiscountPercentageLevel4, IDictionary<string, object> taxAmount, IDictionary<string, object> total, IDictionary<string, object> totalDiscountAmount, IDictionary<string, object> totalDiscountPercentageLevel1, IDictionary<string, object> totalDiscountPercentageLevel2, IDictionary<string, object> totalDiscountPercentageLevel3, IDictionary<string, object> totalDiscountPercentageLevel4)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("subtotal", subtotal);
			_parameters.Add("subtotalDiscountAmount", subtotalDiscountAmount);
			_parameters.Add("subtotalDiscountPercentageLevel1", subtotalDiscountPercentageLevel1);
			_parameters.Add("subtotalDiscountPercentageLevel2", subtotalDiscountPercentageLevel2);
			_parameters.Add("subtotalDiscountPercentageLevel3", subtotalDiscountPercentageLevel3);
			_parameters.Add("subtotalDiscountPercentageLevel4", subtotalDiscountPercentageLevel4);
			_parameters.Add("shippingAmount", shippingAmount);
			_parameters.Add("shippingDiscountAmount", shippingDiscountAmount);
			_parameters.Add("shippingDiscountPercentageLevel1", shippingDiscountPercentageLevel1);
			_parameters.Add("shippingDiscountPercentageLevel2", shippingDiscountPercentageLevel2);
			_parameters.Add("shippingDiscountPercentageLevel3", shippingDiscountPercentageLevel3);
			_parameters.Add("shippingDiscountPercentageLevel4", shippingDiscountPercentageLevel4);
			_parameters.Add("taxAmount", taxAmount);
			_parameters.Add("total", total);
			_parameters.Add("totalDiscountAmount", totalDiscountAmount);
			_parameters.Add("totalDiscountPercentageLevel1", totalDiscountPercentageLevel1);
			_parameters.Add("totalDiscountPercentageLevel2", totalDiscountPercentageLevel2);
			_parameters.Add("totalDiscountPercentageLevel3", totalDiscountPercentageLevel3);
			_parameters.Add("totalDiscountPercentageLevel4", totalDiscountPercentageLevel4);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/update-commerce-order-prices", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceOrderPricesAsync(long commerceOrderId, IDictionary<string, object> subtotal, IDictionary<string, object> subtotalDiscountAmount, IDictionary<string, object> subtotalDiscountPercentageLevel1, IDictionary<string, object> subtotalDiscountPercentageLevel2, IDictionary<string, object> subtotalDiscountPercentageLevel3, IDictionary<string, object> subtotalDiscountPercentageLevel4, IDictionary<string, object> shippingAmount, IDictionary<string, object> shippingDiscountAmount, IDictionary<string, object> shippingDiscountPercentageLevel1, IDictionary<string, object> shippingDiscountPercentageLevel2, IDictionary<string, object> shippingDiscountPercentageLevel3, IDictionary<string, object> shippingDiscountPercentageLevel4, IDictionary<string, object> taxAmount, IDictionary<string, object> total, IDictionary<string, object> totalDiscountAmount, IDictionary<string, object> totalDiscountPercentageLevel1, IDictionary<string, object> totalDiscountPercentageLevel2, IDictionary<string, object> totalDiscountPercentageLevel3, IDictionary<string, object> totalDiscountPercentageLevel4, IDictionary<string, object> subtotalWithTaxAmount, IDictionary<string, object> subtotalDiscountWithTaxAmount, IDictionary<string, object> subtotalDiscountPercentageLevel1WithTaxAmount, IDictionary<string, object> subtotalDiscountPercentageLevel2WithTaxAmount, IDictionary<string, object> subtotalDiscountPercentageLevel3WithTaxAmount, IDictionary<string, object> subtotalDiscountPercentageLevel4WithTaxAmount, IDictionary<string, object> shippingWithTaxAmount, IDictionary<string, object> shippingDiscountWithTaxAmount, IDictionary<string, object> shippingDiscountPercentageLevel1WithTaxAmount, IDictionary<string, object> shippingDiscountPercentageLevel2WithTaxAmount, IDictionary<string, object> shippingDiscountPercentageLevel3WithTaxAmount, IDictionary<string, object> shippingDiscountPercentageLevel4WithTaxAmount, IDictionary<string, object> totalWithTaxAmount, IDictionary<string, object> totalDiscountWithTaxAmount, IDictionary<string, object> totalDiscountPercentageLevel1WithTaxAmount, IDictionary<string, object> totalDiscountPercentageLevel2WithTaxAmount, IDictionary<string, object> totalDiscountPercentageLevel3WithTaxAmount, IDictionary<string, object> totalDiscountPercentageLevel4WithTaxAmount)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("subtotal", subtotal);
			_parameters.Add("subtotalDiscountAmount", subtotalDiscountAmount);
			_parameters.Add("subtotalDiscountPercentageLevel1", subtotalDiscountPercentageLevel1);
			_parameters.Add("subtotalDiscountPercentageLevel2", subtotalDiscountPercentageLevel2);
			_parameters.Add("subtotalDiscountPercentageLevel3", subtotalDiscountPercentageLevel3);
			_parameters.Add("subtotalDiscountPercentageLevel4", subtotalDiscountPercentageLevel4);
			_parameters.Add("shippingAmount", shippingAmount);
			_parameters.Add("shippingDiscountAmount", shippingDiscountAmount);
			_parameters.Add("shippingDiscountPercentageLevel1", shippingDiscountPercentageLevel1);
			_parameters.Add("shippingDiscountPercentageLevel2", shippingDiscountPercentageLevel2);
			_parameters.Add("shippingDiscountPercentageLevel3", shippingDiscountPercentageLevel3);
			_parameters.Add("shippingDiscountPercentageLevel4", shippingDiscountPercentageLevel4);
			_parameters.Add("taxAmount", taxAmount);
			_parameters.Add("total", total);
			_parameters.Add("totalDiscountAmount", totalDiscountAmount);
			_parameters.Add("totalDiscountPercentageLevel1", totalDiscountPercentageLevel1);
			_parameters.Add("totalDiscountPercentageLevel2", totalDiscountPercentageLevel2);
			_parameters.Add("totalDiscountPercentageLevel3", totalDiscountPercentageLevel3);
			_parameters.Add("totalDiscountPercentageLevel4", totalDiscountPercentageLevel4);
			_parameters.Add("subtotalWithTaxAmount", subtotalWithTaxAmount);
			_parameters.Add("subtotalDiscountWithTaxAmount", subtotalDiscountWithTaxAmount);
			_parameters.Add("subtotalDiscountPercentageLevel1WithTaxAmount", subtotalDiscountPercentageLevel1WithTaxAmount);
			_parameters.Add("subtotalDiscountPercentageLevel2WithTaxAmount", subtotalDiscountPercentageLevel2WithTaxAmount);
			_parameters.Add("subtotalDiscountPercentageLevel3WithTaxAmount", subtotalDiscountPercentageLevel3WithTaxAmount);
			_parameters.Add("subtotalDiscountPercentageLevel4WithTaxAmount", subtotalDiscountPercentageLevel4WithTaxAmount);
			_parameters.Add("shippingWithTaxAmount", shippingWithTaxAmount);
			_parameters.Add("shippingDiscountWithTaxAmount", shippingDiscountWithTaxAmount);
			_parameters.Add("shippingDiscountPercentageLevel1WithTaxAmount", shippingDiscountPercentageLevel1WithTaxAmount);
			_parameters.Add("shippingDiscountPercentageLevel2WithTaxAmount", shippingDiscountPercentageLevel2WithTaxAmount);
			_parameters.Add("shippingDiscountPercentageLevel3WithTaxAmount", shippingDiscountPercentageLevel3WithTaxAmount);
			_parameters.Add("shippingDiscountPercentageLevel4WithTaxAmount", shippingDiscountPercentageLevel4WithTaxAmount);
			_parameters.Add("totalWithTaxAmount", totalWithTaxAmount);
			_parameters.Add("totalDiscountWithTaxAmount", totalDiscountWithTaxAmount);
			_parameters.Add("totalDiscountPercentageLevel1WithTaxAmount", totalDiscountPercentageLevel1WithTaxAmount);
			_parameters.Add("totalDiscountPercentageLevel2WithTaxAmount", totalDiscountPercentageLevel2WithTaxAmount);
			_parameters.Add("totalDiscountPercentageLevel3WithTaxAmount", totalDiscountPercentageLevel3WithTaxAmount);
			_parameters.Add("totalDiscountPercentageLevel4WithTaxAmount", totalDiscountPercentageLevel4WithTaxAmount);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/update-commerce-order-prices", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommercePaymentMethodKeyAsync(long commerceOrderId, string commercePaymentMethodKey)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("commercePaymentMethodKey", commercePaymentMethodKey);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/update-commerce-payment-method-key", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateInfoAsync(long commerceOrderId, string printedNote, int requestedDeliveryDateMonth, int requestedDeliveryDateDay, int requestedDeliveryDateYear, int requestedDeliveryDateHour, int requestedDeliveryDateMinute, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("printedNote", printedNote);
			_parameters.Add("requestedDeliveryDateMonth", requestedDeliveryDateMonth);
			_parameters.Add("requestedDeliveryDateDay", requestedDeliveryDateDay);
			_parameters.Add("requestedDeliveryDateYear", requestedDeliveryDateYear);
			_parameters.Add("requestedDeliveryDateHour", requestedDeliveryDateHour);
			_parameters.Add("requestedDeliveryDateMinute", requestedDeliveryDateMinute);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/update-info", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateOrderDateAsync(long commerceOrderId, int orderDateMonth, int orderDateDay, int orderDateYear, int orderDateHour, int orderDateMinute, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("orderDateMonth", orderDateMonth);
			_parameters.Add("orderDateDay", orderDateDay);
			_parameters.Add("orderDateYear", orderDateYear);
			_parameters.Add("orderDateHour", orderDateHour);
			_parameters.Add("orderDateMinute", orderDateMinute);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/update-order-date", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdatePaymentStatusAsync(long commerceOrderId, int paymentStatus)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("paymentStatus", paymentStatus);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/update-payment-status", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdatePaymentStatusAndTransactionIdAsync(long commerceOrderId, int paymentStatus, string transactionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("paymentStatus", paymentStatus);
			_parameters.Add("transactionId", transactionId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/update-payment-status-and-transaction-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdatePrintedNoteAsync(long commerceOrderId, string printedNote)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("printedNote", printedNote);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/update-printed-note", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdatePurchaseOrderNumberAsync(long commerceOrderId, string purchaseOrderNumber)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("purchaseOrderNumber", purchaseOrderNumber);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/update-purchase-order-number", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateShippingAddressAsync(long commerceOrderId, string name, string description, string street1, string street2, string street3, string city, string zip, long commerceRegionId, long commerceCountryId, string phoneNumber, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
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
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/update-shipping-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateShippingAddressAsync(long commerceOrderId, long shippingAddressId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("shippingAddressId", shippingAddressId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/update-shipping-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateTransactionIdAsync(long commerceOrderId, string transactionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceOrderId", commerceOrderId);
			_parameters.Add("transactionId", transactionId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/update-transaction-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpsertCommerceOrderAsync(long userId, long groupId, long commerceAccountId, long commerceCurrencyId, long billingAddressId, long shippingAddressId, string commercePaymentMethodKey, long commerceShippingMethodId, string shippingOptionName, string purchaseOrderNumber, IDictionary<string, object> subtotal, IDictionary<string, object> shippingAmount, IDictionary<string, object> total, IDictionary<string, object> subtotalWithTaxAmount, IDictionary<string, object> shippingWithTaxAmount, IDictionary<string, object> totalWithTaxAmount, int paymentStatus, int orderStatus, string advanceStatus, string externalReferenceCode, JsonObjectWrapper commerceContext, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("commerceCurrencyId", commerceCurrencyId);
			_parameters.Add("billingAddressId", billingAddressId);
			_parameters.Add("shippingAddressId", shippingAddressId);
			_parameters.Add("commercePaymentMethodKey", commercePaymentMethodKey);
			_parameters.Add("commerceShippingMethodId", commerceShippingMethodId);
			_parameters.Add("shippingOptionName", shippingOptionName);
			_parameters.Add("purchaseOrderNumber", purchaseOrderNumber);
			_parameters.Add("subtotal", subtotal);
			_parameters.Add("shippingAmount", shippingAmount);
			_parameters.Add("total", total);
			_parameters.Add("subtotalWithTaxAmount", subtotalWithTaxAmount);
			_parameters.Add("shippingWithTaxAmount", shippingWithTaxAmount);
			_parameters.Add("totalWithTaxAmount", totalWithTaxAmount);
			_parameters.Add("paymentStatus", paymentStatus);
			_parameters.Add("orderStatus", orderStatus);
			_parameters.Add("advanceStatus", advanceStatus);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			this.MangleWrapper(_parameters, "commerceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", commerceContext);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/upsert-commerce-order", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpsertCommerceOrderAsync(long userId, long groupId, long commerceAccountId, long commerceCurrencyId, long billingAddressId, long shippingAddressId, string commercePaymentMethodKey, long commerceShippingMethodId, string shippingOptionName, string purchaseOrderNumber, IDictionary<string, object> subtotal, IDictionary<string, object> shippingAmount, IDictionary<string, object> total, int paymentStatus, int orderStatus, string advanceStatus, string externalReferenceCode, JsonObjectWrapper commerceContext, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("commerceCurrencyId", commerceCurrencyId);
			_parameters.Add("billingAddressId", billingAddressId);
			_parameters.Add("shippingAddressId", shippingAddressId);
			_parameters.Add("commercePaymentMethodKey", commercePaymentMethodKey);
			_parameters.Add("commerceShippingMethodId", commerceShippingMethodId);
			_parameters.Add("shippingOptionName", shippingOptionName);
			_parameters.Add("purchaseOrderNumber", purchaseOrderNumber);
			_parameters.Add("subtotal", subtotal);
			_parameters.Add("shippingAmount", shippingAmount);
			_parameters.Add("total", total);
			_parameters.Add("paymentStatus", paymentStatus);
			_parameters.Add("orderStatus", orderStatus);
			_parameters.Add("advanceStatus", advanceStatus);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			this.MangleWrapper(_parameters, "commerceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", commerceContext);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceorder/upsert-commerce-order", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}