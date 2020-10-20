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

namespace Liferay.SDK.Service.V73.Commercepricemodifier
{
	public class CommercepricemodifierService : ServiceBase
	{
		public CommercepricemodifierService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> FetchByExternalReferenceCodeAsync(long companyId, string externalReferenceCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifier/fetch-by-external-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommercePriceModifierAsync(long userId, long groupId, string title, string target, long commercePriceListId, string modifierType, IDictionary<string, object> modifierAmount, double priority, bool active, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("title", title);
			_parameters.Add("target", target);
			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("modifierType", modifierType);
			_parameters.Add("modifierAmount", modifierAmount);
			_parameters.Add("priority", priority);
			_parameters.Add("active", active);
			_parameters.Add("displayDateMonth", displayDateMonth);
			_parameters.Add("displayDateDay", displayDateDay);
			_parameters.Add("displayDateYear", displayDateYear);
			_parameters.Add("displayDateHour", displayDateHour);
			_parameters.Add("displayDateMinute", displayDateMinute);
			_parameters.Add("expirationDateMonth", expirationDateMonth);
			_parameters.Add("expirationDateDay", expirationDateDay);
			_parameters.Add("expirationDateYear", expirationDateYear);
			_parameters.Add("expirationDateHour", expirationDateHour);
			_parameters.Add("expirationDateMinute", expirationDateMinute);
			_parameters.Add("neverExpire", neverExpire);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifier/add-commerce-price-modifier", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommercePriceModifierAsync(long commercePriceModifierId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceModifierId", commercePriceModifierId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifier/get-commerce-price-modifier", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteCommercePriceModifierAsync(long commercePriceModifierId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceModifierId", commercePriceModifierId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifier/delete-commerce-price-modifier", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCommercePriceModifierAsync(long commercePriceModifierId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceModifierId", commercePriceModifierId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifier/fetch-commerce-price-modifier", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePriceModifiersAsync(long commercePriceListId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifier/get-commerce-price-modifiers", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePriceModifiersAsync(long companyId, string target)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("target", target);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifier/get-commerce-price-modifiers", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommercePriceModifiersCountAsync(long commercePriceListId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifier/get-commerce-price-modifiers-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommercePriceModifiersCountAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifier/get-commerce-price-modifiers-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCommercePriceModifierAsync(long commercePriceModifierId, long groupId, string title, string target, long commercePriceListId, string modifierType, IDictionary<string, object> modifierAmount, double priority, bool active, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceModifierId", commercePriceModifierId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("title", title);
			_parameters.Add("target", target);
			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("modifierType", modifierType);
			_parameters.Add("modifierAmount", modifierAmount);
			_parameters.Add("priority", priority);
			_parameters.Add("active", active);
			_parameters.Add("displayDateMonth", displayDateMonth);
			_parameters.Add("displayDateDay", displayDateDay);
			_parameters.Add("displayDateYear", displayDateYear);
			_parameters.Add("displayDateHour", displayDateHour);
			_parameters.Add("displayDateMinute", displayDateMinute);
			_parameters.Add("expirationDateMonth", expirationDateMonth);
			_parameters.Add("expirationDateDay", expirationDateDay);
			_parameters.Add("expirationDateYear", expirationDateYear);
			_parameters.Add("expirationDateHour", expirationDateHour);
			_parameters.Add("expirationDateMinute", expirationDateMinute);
			_parameters.Add("neverExpire", neverExpire);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifier/update-commerce-price-modifier", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpsertCommercePriceModifierAsync(long userId, long commercePriceModifierId, long groupId, string title, string target, long commercePriceListId, string modifierType, IDictionary<string, object> modifierAmount, double priority, bool active, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, string externalReferenceCode, bool neverExpire, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("commercePriceModifierId", commercePriceModifierId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("title", title);
			_parameters.Add("target", target);
			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("modifierType", modifierType);
			_parameters.Add("modifierAmount", modifierAmount);
			_parameters.Add("priority", priority);
			_parameters.Add("active", active);
			_parameters.Add("displayDateMonth", displayDateMonth);
			_parameters.Add("displayDateDay", displayDateDay);
			_parameters.Add("displayDateYear", displayDateYear);
			_parameters.Add("displayDateHour", displayDateHour);
			_parameters.Add("displayDateMinute", displayDateMinute);
			_parameters.Add("expirationDateMonth", expirationDateMonth);
			_parameters.Add("expirationDateDay", expirationDateDay);
			_parameters.Add("expirationDateYear", expirationDateYear);
			_parameters.Add("expirationDateHour", expirationDateHour);
			_parameters.Add("expirationDateMinute", expirationDateMinute);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			_parameters.Add("neverExpire", neverExpire);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifier/upsert-commerce-price-modifier", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchCommercePriceModifiersAsync(long companyId, string keywords, int status, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepricemodifier/search-commerce-price-modifiers", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}