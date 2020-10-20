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

namespace Liferay.SDK.Service.V73.Commercesubscriptionentry
{
	public class CommercesubscriptionentryService : ServiceBase
	{
		public CommercesubscriptionentryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> UpdateSubscriptionStatusAsync(long commerceSubscriptionEntryId, int subscriptionStatus)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceSubscriptionEntryId", commerceSubscriptionEntryId);
			_parameters.Add("subscriptionStatus", subscriptionStatus);

			var _command = new JsonObject()
			{
				{ "/commerce.commercesubscriptionentry/update-subscription-status", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceSubscriptionEntryAsync(long commerceSubscriptionEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceSubscriptionEntryId", commerceSubscriptionEntryId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercesubscriptionentry/delete-commerce-subscription-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchCommerceSubscriptionEntryAsync(long commerceSubscriptionEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceSubscriptionEntryId", commerceSubscriptionEntryId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercesubscriptionentry/fetch-commerce-subscription-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceSubscriptionEntriesAsync(long companyId, long groupId, long userId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercesubscriptionentry/get-commerce-subscription-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceSubscriptionEntriesAsync(long companyId, long userId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("userId", userId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercesubscriptionentry/get-commerce-subscription-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceSubscriptionEntriesCountAsync(long companyId, long groupId, long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercesubscriptionentry/get-commerce-subscription-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceSubscriptionEntriesCountAsync(long companyId, long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercesubscriptionentry/get-commerce-subscription-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> SearchCommerceSubscriptionEntriesAsync(long companyId, IEnumerable<long> groupIds, long maxSubscriptionCycles, int subscriptionStatus, string keywords, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("maxSubscriptionCycles", maxSubscriptionCycles);
			_parameters.Add("subscriptionStatus", subscriptionStatus);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.commercesubscriptionentry/search-commerce-subscription-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchCommerceSubscriptionEntriesAsync(long companyId, long maxSubscriptionCycles, int subscriptionStatus, string keywords, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("maxSubscriptionCycles", maxSubscriptionCycles);
			_parameters.Add("subscriptionStatus", subscriptionStatus);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.commercesubscriptionentry/search-commerce-subscription-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceSubscriptionEntryAsync(long commerceSubscriptionEntryId, int subscriptionLength, string subscriptionType, IDictionary<string, object> subscriptionTypeSettingsUnicodeProperties, long maxSubscriptionCycles, int subscriptionStatus, int nextIterationDateMonth, int nextIterationDateDay, int nextIterationDateYear, int nextIterationDateHour, int nextIterationDateMinute, int deliverySubscriptionLength, string deliverySubscriptionType, IDictionary<string, object> deliverySubscriptionTypeSettingsUnicodeProperties, long deliveryMaxSubscriptionCycles, int deliverySubscriptionStatus, int deliveryNextIterationDateMonth, int deliveryNextIterationDateDay, int deliveryNextIterationDateYear, int deliveryNextIterationDateHour, int deliveryNextIterationDateMinute)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceSubscriptionEntryId", commerceSubscriptionEntryId);
			_parameters.Add("subscriptionLength", subscriptionLength);
			_parameters.Add("subscriptionType", subscriptionType);
			_parameters.Add("subscriptionTypeSettingsUnicodeProperties", subscriptionTypeSettingsUnicodeProperties);
			_parameters.Add("maxSubscriptionCycles", maxSubscriptionCycles);
			_parameters.Add("subscriptionStatus", subscriptionStatus);
			_parameters.Add("nextIterationDateMonth", nextIterationDateMonth);
			_parameters.Add("nextIterationDateDay", nextIterationDateDay);
			_parameters.Add("nextIterationDateYear", nextIterationDateYear);
			_parameters.Add("nextIterationDateHour", nextIterationDateHour);
			_parameters.Add("nextIterationDateMinute", nextIterationDateMinute);
			_parameters.Add("deliverySubscriptionLength", deliverySubscriptionLength);
			_parameters.Add("deliverySubscriptionType", deliverySubscriptionType);
			_parameters.Add("deliverySubscriptionTypeSettingsUnicodeProperties", deliverySubscriptionTypeSettingsUnicodeProperties);
			_parameters.Add("deliveryMaxSubscriptionCycles", deliveryMaxSubscriptionCycles);
			_parameters.Add("deliverySubscriptionStatus", deliverySubscriptionStatus);
			_parameters.Add("deliveryNextIterationDateMonth", deliveryNextIterationDateMonth);
			_parameters.Add("deliveryNextIterationDateDay", deliveryNextIterationDateDay);
			_parameters.Add("deliveryNextIterationDateYear", deliveryNextIterationDateYear);
			_parameters.Add("deliveryNextIterationDateHour", deliveryNextIterationDateHour);
			_parameters.Add("deliveryNextIterationDateMinute", deliveryNextIterationDateMinute);

			var _command = new JsonObject()
			{
				{ "/commerce.commercesubscriptionentry/update-commerce-subscription-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}