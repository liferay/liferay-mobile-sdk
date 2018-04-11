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

namespace Liferay.SDK.Service.V62.ShoppingOrder
{
	public class ShoppingOrderService : ServiceBase
	{
		public ShoppingOrderService(ISession session)
			: base(session)
		{
		}

		public async Task CompleteOrderAsync(long groupId, string number, string ppTxnId, string ppPaymentStatus, double ppPaymentGross, string ppReceiverEmail, string ppPayerEmail, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("number", number);
			_parameters.Add("ppTxnId", ppTxnId);
			_parameters.Add("ppPaymentStatus", ppPaymentStatus);
			_parameters.Add("ppPaymentGross", ppPaymentGross);
			_parameters.Add("ppReceiverEmail", ppReceiverEmail);
			_parameters.Add("ppPayerEmail", ppPayerEmail);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/shoppingorder/complete-order", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteOrderAsync(long groupId, long orderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("orderId", orderId);

			var _command = new JsonObject()
			{
				{ "/shoppingorder/delete-order", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetOrderAsync(long groupId, long orderId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("orderId", orderId);

			var _command = new JsonObject()
			{
				{ "/shoppingorder/get-order", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task SendEmailAsync(long groupId, long orderId, string emailType, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("orderId", orderId);
			_parameters.Add("emailType", emailType);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/shoppingorder/send-email", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateOrderAsync(long groupId, long orderId, string billingFirstName, string billingLastName, string billingEmailAddress, string billingCompany, string billingStreet, string billingCity, string billingState, string billingZip, string billingCountry, string billingPhone, bool shipToBilling, string shippingFirstName, string shippingLastName, string shippingEmailAddress, string shippingCompany, string shippingStreet, string shippingCity, string shippingState, string shippingZip, string shippingCountry, string shippingPhone, string ccName, string ccType, string ccNumber, int ccExpMonth, int ccExpYear, string ccVerNumber, string comments)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("orderId", orderId);
			_parameters.Add("billingFirstName", billingFirstName);
			_parameters.Add("billingLastName", billingLastName);
			_parameters.Add("billingEmailAddress", billingEmailAddress);
			_parameters.Add("billingCompany", billingCompany);
			_parameters.Add("billingStreet", billingStreet);
			_parameters.Add("billingCity", billingCity);
			_parameters.Add("billingState", billingState);
			_parameters.Add("billingZip", billingZip);
			_parameters.Add("billingCountry", billingCountry);
			_parameters.Add("billingPhone", billingPhone);
			_parameters.Add("shipToBilling", shipToBilling);
			_parameters.Add("shippingFirstName", shippingFirstName);
			_parameters.Add("shippingLastName", shippingLastName);
			_parameters.Add("shippingEmailAddress", shippingEmailAddress);
			_parameters.Add("shippingCompany", shippingCompany);
			_parameters.Add("shippingStreet", shippingStreet);
			_parameters.Add("shippingCity", shippingCity);
			_parameters.Add("shippingState", shippingState);
			_parameters.Add("shippingZip", shippingZip);
			_parameters.Add("shippingCountry", shippingCountry);
			_parameters.Add("shippingPhone", shippingPhone);
			_parameters.Add("ccName", ccName);
			_parameters.Add("ccType", ccType);
			_parameters.Add("ccNumber", ccNumber);
			_parameters.Add("ccExpMonth", ccExpMonth);
			_parameters.Add("ccExpYear", ccExpYear);
			_parameters.Add("ccVerNumber", ccVerNumber);
			_parameters.Add("comments", comments);

			var _command = new JsonObject()
			{
				{ "/shoppingorder/update-order", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateOrderAsync(long groupId, long orderId, string ppTxnId, string ppPaymentStatus, double ppPaymentGross, string ppReceiverEmail, string ppPayerEmail)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("orderId", orderId);
			_parameters.Add("ppTxnId", ppTxnId);
			_parameters.Add("ppPaymentStatus", ppPaymentStatus);
			_parameters.Add("ppPaymentGross", ppPaymentGross);
			_parameters.Add("ppReceiverEmail", ppReceiverEmail);
			_parameters.Add("ppPayerEmail", ppPayerEmail);

			var _command = new JsonObject()
			{
				{ "/shoppingorder/update-order", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}