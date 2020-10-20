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

namespace Liferay.SDK.Service.V73.Commercepriceentry
{
	public class CommercepriceentryService : ServiceBase
	{
		public CommercepriceentryService(ISession session)
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
				{ "/commerce.commercepriceentry/fetch-by-external-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommercePriceEntryAsync(long cProductId, string cpInstanceUuid, long commercePriceListId, string externalReferenceCode, IDictionary<string, object> price, bool discountDiscovery, IDictionary<string, object> discountLevel1, IDictionary<string, object> discountLevel2, IDictionary<string, object> discountLevel3, IDictionary<string, object> discountLevel4, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cProductId", cProductId);
			_parameters.Add("cpInstanceUuid", cpInstanceUuid);
			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			_parameters.Add("price", price);
			_parameters.Add("discountDiscovery", discountDiscovery);
			_parameters.Add("discountLevel1", discountLevel1);
			_parameters.Add("discountLevel2", discountLevel2);
			_parameters.Add("discountLevel3", discountLevel3);
			_parameters.Add("discountLevel4", discountLevel4);
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
				{ "/commerce.commercepriceentry/add-commerce-price-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommercePriceEntryAsync(long cpInstanceId, long commercePriceListId, string externalReferenceCode, IDictionary<string, object> price, IDictionary<string, object> promoPrice, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpInstanceId", cpInstanceId);
			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			_parameters.Add("price", price);
			_parameters.Add("promoPrice", promoPrice);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepriceentry/add-commerce-price-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommercePriceEntryAsync(long cpInstanceId, long commercePriceListId, IDictionary<string, object> price, IDictionary<string, object> promoPrice, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpInstanceId", cpInstanceId);
			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("price", price);
			_parameters.Add("promoPrice", promoPrice);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepriceentry/add-commerce-price-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommercePriceEntryAsync(long commercePriceEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceEntryId", commercePriceEntryId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepriceentry/delete-commerce-price-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchCommercePriceEntryAsync(long commercePriceEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceEntryId", commercePriceEntryId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepriceentry/fetch-commerce-price-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePriceEntriesAsync(long commercePriceListId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepriceentry/get-commerce-price-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePriceEntriesAsync(long commercePriceListId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepriceentry/get-commerce-price-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommercePriceEntriesByCompanyIdAsync(long companyId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepriceentry/get-commerce-price-entries-by-company-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommercePriceEntriesCountAsync(long commercePriceListId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceListId", commercePriceListId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepriceentry/get-commerce-price-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommercePriceEntriesCountByCompanyIdAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepriceentry/get-commerce-price-entries-count-by-company-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> GetInstanceBaseCommercePriceEntryAsync(string cpInstanceUuid, string priceListType)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpInstanceUuid", cpInstanceUuid);
			_parameters.Add("priceListType", priceListType);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepriceentry/get-instance-base-commerce-price-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetInstanceCommercePriceEntriesAsync(long cpInstanceId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpInstanceId", cpInstanceId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepriceentry/get-instance-commerce-price-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetInstanceCommercePriceEntriesAsync(long cpInstanceId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpInstanceId", cpInstanceId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepriceentry/get-instance-commerce-price-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetInstanceCommercePriceEntriesCountAsync(long cpInstanceId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpInstanceId", cpInstanceId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepriceentry/get-instance-commerce-price-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> SearchCommercePriceEntriesAsync(long companyId, long commercePriceListId, string keywords, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepriceentry/search-commerce-price-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> SearchCommercePriceEntriesCountAsync(long companyId, long commercePriceListId, string keywords)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("keywords", keywords);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepriceentry/search-commerce-price-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCommercePriceEntryAsync(long commercePriceEntryId, IDictionary<string, object> price, IDictionary<string, object> promoPrice, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceEntryId", commercePriceEntryId);
			_parameters.Add("price", price);
			_parameters.Add("promoPrice", promoPrice);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepriceentry/update-commerce-price-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommercePriceEntryAsync(long commercePriceEntryId, IDictionary<string, object> price, bool discountDiscovery, IDictionary<string, object> discountLevel1, IDictionary<string, object> discountLevel2, IDictionary<string, object> discountLevel3, IDictionary<string, object> discountLevel4, bool bulkPricing, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceEntryId", commercePriceEntryId);
			_parameters.Add("price", price);
			_parameters.Add("discountDiscovery", discountDiscovery);
			_parameters.Add("discountLevel1", discountLevel1);
			_parameters.Add("discountLevel2", discountLevel2);
			_parameters.Add("discountLevel3", discountLevel3);
			_parameters.Add("discountLevel4", discountLevel4);
			_parameters.Add("bulkPricing", bulkPricing);
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
				{ "/commerce.commercepriceentry/update-commerce-price-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommercePriceEntryAsync(long commercePriceEntryId, IDictionary<string, object> price, bool discountDiscovery, IDictionary<string, object> discountLevel1, IDictionary<string, object> discountLevel2, IDictionary<string, object> discountLevel3, IDictionary<string, object> discountLevel4, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceEntryId", commercePriceEntryId);
			_parameters.Add("price", price);
			_parameters.Add("discountDiscovery", discountDiscovery);
			_parameters.Add("discountLevel1", discountLevel1);
			_parameters.Add("discountLevel2", discountLevel2);
			_parameters.Add("discountLevel3", discountLevel3);
			_parameters.Add("discountLevel4", discountLevel4);
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
				{ "/commerce.commercepriceentry/update-commerce-price-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateExternalReferenceCodeAsync(JsonObjectWrapper commercePriceEntry, string externalReferenceCode)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "commercePriceEntry", "$languageUtil.getJSONWrapperClassName($parameter.type)", commercePriceEntry);
			_parameters.Add("externalReferenceCode", externalReferenceCode);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepriceentry/update-external-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpsertCommercePriceEntryAsync(long commercePriceEntryId, long cpInstanceId, long commercePriceListId, string externalReferenceCode, IDictionary<string, object> price, IDictionary<string, object> promoPrice, string skuExternalReferenceCode, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceEntryId", commercePriceEntryId);
			_parameters.Add("cpInstanceId", cpInstanceId);
			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			_parameters.Add("price", price);
			_parameters.Add("promoPrice", promoPrice);
			_parameters.Add("skuExternalReferenceCode", skuExternalReferenceCode);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepriceentry/upsert-commerce-price-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpsertCommercePriceEntryAsync(long commercePriceEntryId, long cProductId, string cpInstanceUuid, long commercePriceListId, string externalReferenceCode, IDictionary<string, object> price, bool discountDiscovery, IDictionary<string, object> discountLevel1, IDictionary<string, object> discountLevel2, IDictionary<string, object> discountLevel3, IDictionary<string, object> discountLevel4, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, string skuExternalReferenceCode, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceEntryId", commercePriceEntryId);
			_parameters.Add("cProductId", cProductId);
			_parameters.Add("cpInstanceUuid", cpInstanceUuid);
			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			_parameters.Add("price", price);
			_parameters.Add("discountDiscovery", discountDiscovery);
			_parameters.Add("discountLevel1", discountLevel1);
			_parameters.Add("discountLevel2", discountLevel2);
			_parameters.Add("discountLevel3", discountLevel3);
			_parameters.Add("discountLevel4", discountLevel4);
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
			_parameters.Add("skuExternalReferenceCode", skuExternalReferenceCode);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepriceentry/upsert-commerce-price-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpsertCommercePriceEntryAsync(long commercePriceEntryId, long cProductId, string cpInstanceUuid, long commercePriceListId, string externalReferenceCode, IDictionary<string, object> price, IDictionary<string, object> promoPrice, string skuExternalReferenceCode, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceEntryId", commercePriceEntryId);
			_parameters.Add("cProductId", cProductId);
			_parameters.Add("cpInstanceUuid", cpInstanceUuid);
			_parameters.Add("commercePriceListId", commercePriceListId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			_parameters.Add("price", price);
			_parameters.Add("promoPrice", promoPrice);
			_parameters.Add("skuExternalReferenceCode", skuExternalReferenceCode);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepriceentry/upsert-commerce-price-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommercePriceEntryAsync(long commercePriceEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceEntryId", commercePriceEntryId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercepriceentry/get-commerce-price-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}