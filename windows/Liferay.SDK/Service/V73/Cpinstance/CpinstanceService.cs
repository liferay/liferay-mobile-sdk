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

namespace Liferay.SDK.Service.V73.Cpinstance
{
	public class CpinstanceService : ServiceBase
	{
		public CpinstanceService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> FetchCpInstanceAsync(long cpInstanceId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpInstanceId", cpInstanceId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpinstance/fetch-cp-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCpInstanceAsync(long cpInstanceId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpInstanceId", cpInstanceId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpinstance/get-cp-instance", _parameters }
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
				{ "/commerce.cpinstance/fetch-by-external-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task BuildCpInstancesAsync(long cpDefinitionId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpinstance/build-cp-instances", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> UpdateShippingInfoAsync(long cpInstanceId, double width, double height, double depth, double weight, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpInstanceId", cpInstanceId);
			_parameters.Add("width", width);
			_parameters.Add("height", height);
			_parameters.Add("depth", depth);
			_parameters.Add("weight", weight);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpinstance/update-shipping-info", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateSubscriptionInfoAsync(long cpInstanceId, bool overrideSubscriptionInfo, bool subscriptionEnabled, int subscriptionLength, string subscriptionType, IDictionary<string, object> subscriptionTypeSettingsUnicodeProperties, long maxSubscriptionCycles, bool deliverySubscriptionEnabled, int deliverySubscriptionLength, string deliverySubscriptionType, IDictionary<string, object> deliverySubscriptionTypeSettingsUnicodeProperties, long deliveryMaxSubscriptionCycles)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpInstanceId", cpInstanceId);
			_parameters.Add("overrideSubscriptionInfo", overrideSubscriptionInfo);
			_parameters.Add("subscriptionEnabled", subscriptionEnabled);
			_parameters.Add("subscriptionLength", subscriptionLength);
			_parameters.Add("subscriptionType", subscriptionType);
			_parameters.Add("subscriptionTypeSettingsUnicodeProperties", subscriptionTypeSettingsUnicodeProperties);
			_parameters.Add("maxSubscriptionCycles", maxSubscriptionCycles);
			_parameters.Add("deliverySubscriptionEnabled", deliverySubscriptionEnabled);
			_parameters.Add("deliverySubscriptionLength", deliverySubscriptionLength);
			_parameters.Add("deliverySubscriptionType", deliverySubscriptionType);
			_parameters.Add("deliverySubscriptionTypeSettingsUnicodeProperties", deliverySubscriptionTypeSettingsUnicodeProperties);
			_parameters.Add("deliveryMaxSubscriptionCycles", deliveryMaxSubscriptionCycles);

			var _command = new JsonObject()
			{
				{ "/commerce.cpinstance/update-subscription-info", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateSubscriptionInfoAsync(long cpInstanceId, bool overrideSubscriptionInfo, bool subscriptionEnabled, int subscriptionLength, string subscriptionType, IDictionary<string, object> subscriptionTypeSettingsUnicodeProperties, long maxSubscriptionCycles, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpInstanceId", cpInstanceId);
			_parameters.Add("overrideSubscriptionInfo", overrideSubscriptionInfo);
			_parameters.Add("subscriptionEnabled", subscriptionEnabled);
			_parameters.Add("subscriptionLength", subscriptionLength);
			_parameters.Add("subscriptionType", subscriptionType);
			_parameters.Add("subscriptionTypeSettingsUnicodeProperties", subscriptionTypeSettingsUnicodeProperties);
			_parameters.Add("maxSubscriptionCycles", maxSubscriptionCycles);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpinstance/update-subscription-info", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCpInstanceAsync(long cpDefinitionId, long groupId, string sku, string gtin, string manufacturerPartNumber, bool purchasable, IDictionary<string, object> cpDefinitionOptionRelIdCPDefinitionOptionValueRelIds, bool published, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("sku", sku);
			_parameters.Add("gtin", gtin);
			_parameters.Add("manufacturerPartNumber", manufacturerPartNumber);
			_parameters.Add("purchasable", purchasable);
			_parameters.Add("cpDefinitionOptionRelIdCPDefinitionOptionValueRelIds", cpDefinitionOptionRelIdCPDefinitionOptionValueRelIds);
			_parameters.Add("published", published);
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
				{ "/commerce.cpinstance/add-cp-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCpInstanceAsync(long cpDefinitionId, long groupId, string sku, string gtin, string manufacturerPartNumber, bool purchasable, string json, bool published, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, string unspsc, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("sku", sku);
			_parameters.Add("gtin", gtin);
			_parameters.Add("manufacturerPartNumber", manufacturerPartNumber);
			_parameters.Add("purchasable", purchasable);
			_parameters.Add("json", json);
			_parameters.Add("published", published);
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
			_parameters.Add("unspsc", unspsc);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpinstance/add-cp-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCpInstanceAsync(long cpDefinitionId, long groupId, string sku, string gtin, string manufacturerPartNumber, bool purchasable, string json, bool published, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("sku", sku);
			_parameters.Add("gtin", gtin);
			_parameters.Add("manufacturerPartNumber", manufacturerPartNumber);
			_parameters.Add("purchasable", purchasable);
			_parameters.Add("json", json);
			_parameters.Add("published", published);
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
				{ "/commerce.cpinstance/add-cp-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCpInstanceAsync(long cpDefinitionId, long groupId, string sku, string gtin, string manufacturerPartNumber, bool purchasable, IDictionary<string, object> cpDefinitionOptionRelIdCPDefinitionOptionValueRelIds, bool published, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, string unspsc, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("sku", sku);
			_parameters.Add("gtin", gtin);
			_parameters.Add("manufacturerPartNumber", manufacturerPartNumber);
			_parameters.Add("purchasable", purchasable);
			_parameters.Add("cpDefinitionOptionRelIdCPDefinitionOptionValueRelIds", cpDefinitionOptionRelIdCPDefinitionOptionValueRelIds);
			_parameters.Add("published", published);
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
			_parameters.Add("unspsc", unspsc);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpinstance/add-cp-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCpInstanceAsync(long cpInstanceId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpInstanceId", cpInstanceId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpinstance/delete-cp-instance", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchCProductInstanceAsync(long cProductId, string cpInstanceUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cProductId", cProductId);
			_parameters.Add("cpInstanceUuid", cpInstanceUuid);

			var _command = new JsonObject()
			{
				{ "/commerce.cpinstance/fetch-c-product-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCpDefinitionInstancesAsync(long cpDefinitionId, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.cpinstance/get-cp-definition-instances", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCpDefinitionInstancesCountAsync(long cpDefinitionId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/commerce.cpinstance/get-cp-definition-instances-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCpInstancesAsync(long groupId, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.cpinstance/get-cp-instances", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCpInstancesCountAsync(long groupId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/commerce.cpinstance/get-cp-instances-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> SearchCpDefinitionInstancesAsync(long companyId, long cpDefinitionId, string keywords, int status, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("status", status);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.cpinstance/search-cp-definition-instances", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchCpDefinitionInstancesAsync(long companyId, long cpDefinitionId, string keywords, int status, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.cpinstance/search-cp-definition-instances", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchCpInstancesAsync(long companyId, long groupId, string keywords, int status, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.cpinstance/search-cp-instances", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchCpInstancesAsync(long companyId, string keywords, int status, int start, int end, JsonObjectWrapper sort)
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
				{ "/commerce.cpinstance/search-cp-instances", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCpInstanceAsync(long cpInstanceId, string sku, string gtin, string manufacturerPartNumber, bool purchasable, bool published, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, string unspsc, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpInstanceId", cpInstanceId);
			_parameters.Add("sku", sku);
			_parameters.Add("gtin", gtin);
			_parameters.Add("manufacturerPartNumber", manufacturerPartNumber);
			_parameters.Add("purchasable", purchasable);
			_parameters.Add("published", published);
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
			_parameters.Add("unspsc", unspsc);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpinstance/update-cp-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCpInstanceAsync(long cpInstanceId, string sku, string gtin, string manufacturerPartNumber, bool purchasable, bool published, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpInstanceId", cpInstanceId);
			_parameters.Add("sku", sku);
			_parameters.Add("gtin", gtin);
			_parameters.Add("manufacturerPartNumber", manufacturerPartNumber);
			_parameters.Add("purchasable", purchasable);
			_parameters.Add("published", published);
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
				{ "/commerce.cpinstance/update-cp-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdatePricingInfoAsync(long cpInstanceId, IDictionary<string, object> price, IDictionary<string, object> promoPrice, IDictionary<string, object> cost, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpInstanceId", cpInstanceId);
			_parameters.Add("price", price);
			_parameters.Add("promoPrice", promoPrice);
			_parameters.Add("cost", cost);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpinstance/update-pricing-info", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpsertCpInstanceAsync(long cpDefinitionId, long groupId, string sku, string gtin, string manufacturerPartNumber, bool purchasable, string json, double width, double height, double depth, double weight, IDictionary<string, object> price, IDictionary<string, object> promoPrice, IDictionary<string, object> cost, bool published, string externalReferenceCode, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("sku", sku);
			_parameters.Add("gtin", gtin);
			_parameters.Add("manufacturerPartNumber", manufacturerPartNumber);
			_parameters.Add("purchasable", purchasable);
			_parameters.Add("json", json);
			_parameters.Add("width", width);
			_parameters.Add("height", height);
			_parameters.Add("depth", depth);
			_parameters.Add("weight", weight);
			_parameters.Add("price", price);
			_parameters.Add("promoPrice", promoPrice);
			_parameters.Add("cost", cost);
			_parameters.Add("published", published);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
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
				{ "/commerce.cpinstance/upsert-cp-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpsertCpInstanceAsync(long cpDefinitionId, long groupId, string sku, string gtin, string manufacturerPartNumber, bool purchasable, string json, double width, double height, double depth, double weight, IDictionary<string, object> price, IDictionary<string, object> promoPrice, IDictionary<string, object> cost, bool published, string externalReferenceCode, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, string unspsc, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("sku", sku);
			_parameters.Add("gtin", gtin);
			_parameters.Add("manufacturerPartNumber", manufacturerPartNumber);
			_parameters.Add("purchasable", purchasable);
			_parameters.Add("json", json);
			_parameters.Add("width", width);
			_parameters.Add("height", height);
			_parameters.Add("depth", depth);
			_parameters.Add("weight", weight);
			_parameters.Add("price", price);
			_parameters.Add("promoPrice", promoPrice);
			_parameters.Add("cost", cost);
			_parameters.Add("published", published);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
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
			_parameters.Add("unspsc", unspsc);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpinstance/upsert-cp-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}