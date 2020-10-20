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

namespace Liferay.SDK.Service.V73.Commercetierpriceentry
{
	public class CommercetierpriceentryService : ServiceBase
	{
		public CommercetierpriceentryService(ISession session)
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
				{ "/commerce.commercetierpriceentry/fetch-by-external-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceTierPriceEntryAsync(long commerceTierPriceEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceTierPriceEntryId", commerceTierPriceEntryId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetierpriceentry/get-commerce-tier-price-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateExternalReferenceCodeAsync(JsonObjectWrapper commerceTierPriceEntry, string externalReferenceCode)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "commerceTierPriceEntry", "$languageUtil.getJSONWrapperClassName($parameter.type)", commerceTierPriceEntry);
			_parameters.Add("externalReferenceCode", externalReferenceCode);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetierpriceentry/update-external-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceTierPriceEntryAsync(long commercePriceEntryId, IDictionary<string, object> price, IDictionary<string, object> promoPrice, int minQuantity, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceEntryId", commercePriceEntryId);
			_parameters.Add("price", price);
			_parameters.Add("promoPrice", promoPrice);
			_parameters.Add("minQuantity", minQuantity);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetierpriceentry/add-commerce-tier-price-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceTierPriceEntryAsync(long commercePriceEntryId, string externalReferenceCode, IDictionary<string, object> price, IDictionary<string, object> promoPrice, int minQuantity, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceEntryId", commercePriceEntryId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			_parameters.Add("price", price);
			_parameters.Add("promoPrice", promoPrice);
			_parameters.Add("minQuantity", minQuantity);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetierpriceentry/add-commerce-tier-price-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceTierPriceEntryAsync(long commercePriceEntryId, string externalReferenceCode, IDictionary<string, object> price, int minQuantity, bool bulkPricing, bool discountDiscovery, IDictionary<string, object> discountLevel1, IDictionary<string, object> discountLevel2, IDictionary<string, object> discountLevel3, IDictionary<string, object> discountLevel4, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceEntryId", commercePriceEntryId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			_parameters.Add("price", price);
			_parameters.Add("minQuantity", minQuantity);
			_parameters.Add("bulkPricing", bulkPricing);
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
				{ "/commerce.commercetierpriceentry/add-commerce-tier-price-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceTierPriceEntryAsync(long commerceTierPriceEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceTierPriceEntryId", commerceTierPriceEntryId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetierpriceentry/delete-commerce-tier-price-entry", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> FetchCommerceTierPriceEntriesAsync(long companyId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetierpriceentry/fetch-commerce-tier-price-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceTierPriceEntriesAsync(long commercePriceEntryId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceEntryId", commercePriceEntryId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetierpriceentry/get-commerce-tier-price-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceTierPriceEntriesAsync(long commercePriceEntryId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceEntryId", commercePriceEntryId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetierpriceentry/get-commerce-tier-price-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceTierPriceEntriesCountAsync(long commercePriceEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commercePriceEntryId", commercePriceEntryId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetierpriceentry/get-commerce-tier-price-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceTierPriceEntriesCountByCompanyIdAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetierpriceentry/get-commerce-tier-price-entries-count-by-company-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> SearchCommerceTierPriceEntriesAsync(long companyId, long commercePriceEntryId, string keywords, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("commercePriceEntryId", commercePriceEntryId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetierpriceentry/search-commerce-tier-price-entries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> SearchCommerceTierPriceEntriesCountAsync(long companyId, long commercePriceEntryId, string keywords)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("commercePriceEntryId", commercePriceEntryId);
			_parameters.Add("keywords", keywords);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetierpriceentry/search-commerce-tier-price-entries-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCommerceTierPriceEntryAsync(long commerceTierPriceEntryId, IDictionary<string, object> price, IDictionary<string, object> promoPrice, int minQuantity, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceTierPriceEntryId", commerceTierPriceEntryId);
			_parameters.Add("price", price);
			_parameters.Add("promoPrice", promoPrice);
			_parameters.Add("minQuantity", minQuantity);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetierpriceentry/update-commerce-tier-price-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceTierPriceEntryAsync(long commerceTierPriceEntryId, IDictionary<string, object> price, int minQuantity, bool bulkPricing, bool discountDiscovery, IDictionary<string, object> discountLevel1, IDictionary<string, object> discountLevel2, IDictionary<string, object> discountLevel3, IDictionary<string, object> discountLevel4, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceTierPriceEntryId", commerceTierPriceEntryId);
			_parameters.Add("price", price);
			_parameters.Add("minQuantity", minQuantity);
			_parameters.Add("bulkPricing", bulkPricing);
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
				{ "/commerce.commercetierpriceentry/update-commerce-tier-price-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpsertCommerceTierPriceEntryAsync(long commerceTierPriceEntryId, long commercePriceEntryId, string externalReferenceCode, IDictionary<string, object> price, IDictionary<string, object> promoPrice, int minQuantity, string priceEntryExternalReferenceCode, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceTierPriceEntryId", commerceTierPriceEntryId);
			_parameters.Add("commercePriceEntryId", commercePriceEntryId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			_parameters.Add("price", price);
			_parameters.Add("promoPrice", promoPrice);
			_parameters.Add("minQuantity", minQuantity);
			_parameters.Add("priceEntryExternalReferenceCode", priceEntryExternalReferenceCode);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetierpriceentry/upsert-commerce-tier-price-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpsertCommerceTierPriceEntryAsync(long commerceTierPriceEntryId, long commercePriceEntryId, string externalReferenceCode, IDictionary<string, object> price, int minQuantity, bool bulkPricing, bool discountDiscovery, IDictionary<string, object> discountLevel1, IDictionary<string, object> discountLevel2, IDictionary<string, object> discountLevel3, IDictionary<string, object> discountLevel4, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, string priceEntryExternalReferenceCode, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceTierPriceEntryId", commerceTierPriceEntryId);
			_parameters.Add("commercePriceEntryId", commercePriceEntryId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			_parameters.Add("price", price);
			_parameters.Add("minQuantity", minQuantity);
			_parameters.Add("bulkPricing", bulkPricing);
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
			_parameters.Add("priceEntryExternalReferenceCode", priceEntryExternalReferenceCode);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetierpriceentry/upsert-commerce-tier-price-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCommerceTierPriceEntryAsync(long commerceTierPriceEntryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceTierPriceEntryId", commerceTierPriceEntryId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercetierpriceentry/fetch-commerce-tier-price-entry", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}