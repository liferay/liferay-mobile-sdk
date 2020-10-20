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

namespace Liferay.SDK.Service.V73.Cpdefinition
{
	public class CpdefinitionService : ServiceBase
	{
		public CpdefinitionService(ISession session)
			: base(session)
		{
		}

		public async Task<string> GetLayoutUuidAsync(long cpDefinitionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinition/get-layout-uuid", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task<dynamic> UpdateStatusAsync(long userId, long cpDefinitionId, int status, JsonObjectWrapper serviceContext, IDictionary<string, object> workflowContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("status", status);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);
			_parameters.Add("workflowContext", workflowContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinition/update-status", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<string> GetUrlTitleMapAsXmlAsync(long cpDefinitionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinition/get-url-title-map-as-xml", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (string)_obj;
		}

		public async Task<dynamic> GetCpDefinitionAsync(long cpDefinitionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinition/get-cp-definition", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCpDefinitionAsync(long cpDefinitionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinition/delete-cp-definition", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> CopyCpDefinitionAsync(long cpDefinitionId, long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinition/copy-cp-definition", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCpDefinitionAsync(long groupId, long userId, IDictionary<string, string> nameMap, IDictionary<string, string> shortDescriptionMap, IDictionary<string, string> descriptionMap, IDictionary<string, string> urlTitleMap, IDictionary<string, string> metaTitleMap, IDictionary<string, string> metaDescriptionMap, IDictionary<string, string> metaKeywordsMap, string productTypeName, bool ignoreSKUCombinations, bool shippable, bool freeShipping, bool shipSeparately, double shippingExtraPrice, double width, double height, double depth, double weight, long cpTaxCategoryId, bool taxExempt, bool telcoOrElectronics, string ddmStructureKey, bool published, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, string defaultSku, bool subscriptionEnabled, int subscriptionLength, string subscriptionType, IDictionary<string, object> subscriptionTypeSettingsUnicodeProperties, long maxSubscriptionCycles, string externalReferenceCode, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("shortDescriptionMap", shortDescriptionMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("urlTitleMap", urlTitleMap);
			_parameters.Add("metaTitleMap", metaTitleMap);
			_parameters.Add("metaDescriptionMap", metaDescriptionMap);
			_parameters.Add("metaKeywordsMap", metaKeywordsMap);
			_parameters.Add("productTypeName", productTypeName);
			_parameters.Add("ignoreSKUCombinations", ignoreSKUCombinations);
			_parameters.Add("shippable", shippable);
			_parameters.Add("freeShipping", freeShipping);
			_parameters.Add("shipSeparately", shipSeparately);
			_parameters.Add("shippingExtraPrice", shippingExtraPrice);
			_parameters.Add("width", width);
			_parameters.Add("height", height);
			_parameters.Add("depth", depth);
			_parameters.Add("weight", weight);
			_parameters.Add("cpTaxCategoryId", cpTaxCategoryId);
			_parameters.Add("taxExempt", taxExempt);
			_parameters.Add("telcoOrElectronics", telcoOrElectronics);
			_parameters.Add("ddmStructureKey", ddmStructureKey);
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
			_parameters.Add("defaultSku", defaultSku);
			_parameters.Add("subscriptionEnabled", subscriptionEnabled);
			_parameters.Add("subscriptionLength", subscriptionLength);
			_parameters.Add("subscriptionType", subscriptionType);
			_parameters.Add("subscriptionTypeSettingsUnicodeProperties", subscriptionTypeSettingsUnicodeProperties);
			_parameters.Add("maxSubscriptionCycles", maxSubscriptionCycles);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinition/add-cp-definition", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCpDefinitionAsync(long groupId, long userId, IDictionary<string, string> nameMap, IDictionary<string, string> shortDescriptionMap, IDictionary<string, string> descriptionMap, IDictionary<string, string> urlTitleMap, IDictionary<string, string> metaTitleMap, IDictionary<string, string> metaDescriptionMap, IDictionary<string, string> metaKeywordsMap, string productTypeName, bool ignoreSKUCombinations, bool shippable, bool freeShipping, bool shipSeparately, double shippingExtraPrice, double width, double height, double depth, double weight, long cpTaxCategoryId, bool taxExempt, bool telcoOrElectronics, string ddmStructureKey, bool published, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, string defaultSku, bool subscriptionEnabled, int subscriptionLength, string subscriptionType, IDictionary<string, object> subscriptionTypeSettingsUnicodeProperties, long maxSubscriptionCycles, bool deliverySubscriptionEnabled, int deliverySubscriptionLength, string deliverySubscriptionType, IDictionary<string, object> deliverySubscriptionTypeSettingsUnicodeProperties, long deliveryMaxSubscriptionCycles, string externalReferenceCode, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("shortDescriptionMap", shortDescriptionMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("urlTitleMap", urlTitleMap);
			_parameters.Add("metaTitleMap", metaTitleMap);
			_parameters.Add("metaDescriptionMap", metaDescriptionMap);
			_parameters.Add("metaKeywordsMap", metaKeywordsMap);
			_parameters.Add("productTypeName", productTypeName);
			_parameters.Add("ignoreSKUCombinations", ignoreSKUCombinations);
			_parameters.Add("shippable", shippable);
			_parameters.Add("freeShipping", freeShipping);
			_parameters.Add("shipSeparately", shipSeparately);
			_parameters.Add("shippingExtraPrice", shippingExtraPrice);
			_parameters.Add("width", width);
			_parameters.Add("height", height);
			_parameters.Add("depth", depth);
			_parameters.Add("weight", weight);
			_parameters.Add("cpTaxCategoryId", cpTaxCategoryId);
			_parameters.Add("taxExempt", taxExempt);
			_parameters.Add("telcoOrElectronics", telcoOrElectronics);
			_parameters.Add("ddmStructureKey", ddmStructureKey);
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
			_parameters.Add("defaultSku", defaultSku);
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
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinition/add-cp-definition", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteAssetCategoryCpDefinitionAsync(long cpDefinitionId, long categoryId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("categoryId", categoryId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinition/delete-asset-category-cp-definition", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchCpDefinitionAsync(long cpDefinitionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinition/fetch-cp-definition", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCpDefinitionByCProductExternalReferenceCodeAsync(long companyId, string externalReferenceCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinition/fetch-cp-definition-by-c-product-external-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCpDefinitionByCProductIdAsync(long cProductId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cProductId", cProductId);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinition/fetch-cp-definition-by-c-product-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCpDefinitionsAsync(long groupId, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinition/get-cp-definitions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCpDefinitionsCountAsync(long groupId, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinition/get-cp-definitions-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> SearchCpDefinitionsAsync(long companyId, string keywords, int status, int start, int end, JsonObjectWrapper sort)
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
				{ "/commerce.cpdefinition/search-cp-definitions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> SearchCpDefinitionsAsync(long companyId, string keywords, string filterFields, string filterValues, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("filterFields", filterFields);
			_parameters.Add("filterValues", filterValues);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinition/search-cp-definitions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCpDefinitionAsync(long cpDefinitionId, IDictionary<string, string> nameMap, IDictionary<string, string> shortDescriptionMap, IDictionary<string, string> descriptionMap, IDictionary<string, string> urlTitleMap, IDictionary<string, string> metaTitleMap, IDictionary<string, string> metaDescriptionMap, IDictionary<string, string> metaKeywordsMap, bool ignoreSKUCombinations, string ddmStructureKey, bool published, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("shortDescriptionMap", shortDescriptionMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("urlTitleMap", urlTitleMap);
			_parameters.Add("metaTitleMap", metaTitleMap);
			_parameters.Add("metaDescriptionMap", metaDescriptionMap);
			_parameters.Add("metaKeywordsMap", metaKeywordsMap);
			_parameters.Add("ignoreSKUCombinations", ignoreSKUCombinations);
			_parameters.Add("ddmStructureKey", ddmStructureKey);
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
				{ "/commerce.cpdefinition/update-cp-definition", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCpDefinitionAccountGroupFilterAsync(long cpDefinitionId, bool enable)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("enable", enable);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinition/update-cp-definition-account-group-filter", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCpDefinitionCategorizationAsync(long cpDefinitionId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinition/update-cp-definition-categorization", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCpDefinitionChannelFilterAsync(long cpDefinitionId, bool enable)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("enable", enable);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinition/update-cp-definition-channel-filter", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateShippingInfoAsync(long cpDefinitionId, bool shippable, bool freeShipping, bool shipSeparately, double shippingExtraPrice, double width, double height, double depth, double weight, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("shippable", shippable);
			_parameters.Add("freeShipping", freeShipping);
			_parameters.Add("shipSeparately", shipSeparately);
			_parameters.Add("shippingExtraPrice", shippingExtraPrice);
			_parameters.Add("width", width);
			_parameters.Add("height", height);
			_parameters.Add("depth", depth);
			_parameters.Add("weight", weight);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinition/update-shipping-info", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateSubscriptionInfoAsync(long cpDefinitionId, bool subscriptionEnabled, int subscriptionLength, string subscriptionType, IDictionary<string, object> subscriptionTypeSettingsUnicodeProperties, long maxSubscriptionCycles, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("subscriptionEnabled", subscriptionEnabled);
			_parameters.Add("subscriptionLength", subscriptionLength);
			_parameters.Add("subscriptionType", subscriptionType);
			_parameters.Add("subscriptionTypeSettingsUnicodeProperties", subscriptionTypeSettingsUnicodeProperties);
			_parameters.Add("maxSubscriptionCycles", maxSubscriptionCycles);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinition/update-subscription-info", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateSubscriptionInfoAsync(long cpDefinitionId, bool subscriptionEnabled, int subscriptionLength, string subscriptionType, IDictionary<string, object> subscriptionTypeSettingsUnicodeProperties, long maxSubscriptionCycles, bool deliverySubscriptionEnabled, int deliverySubscriptionLength, string deliverySubscriptionType, IDictionary<string, object> deliverySubscriptionTypeSettingsUnicodeProperties, long deliveryMaxSubscriptionCycles)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
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
				{ "/commerce.cpdefinition/update-subscription-info", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateTaxCategoryInfoAsync(long cpDefinitionId, long cpTaxCategoryId, bool taxExempt, bool telcoOrElectronics)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("cpTaxCategoryId", cpTaxCategoryId);
			_parameters.Add("taxExempt", taxExempt);
			_parameters.Add("telcoOrElectronics", telcoOrElectronics);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinition/update-tax-category-info", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpsertCpDefinitionAsync(long groupId, long userId, IDictionary<string, string> nameMap, IDictionary<string, string> shortDescriptionMap, IDictionary<string, string> descriptionMap, IDictionary<string, string> urlTitleMap, IDictionary<string, string> metaTitleMap, IDictionary<string, string> metaDescriptionMap, IDictionary<string, string> metaKeywordsMap, string productTypeName, bool ignoreSKUCombinations, bool shippable, bool freeShipping, bool shipSeparately, double shippingExtraPrice, double width, double height, double depth, double weight, long cpTaxCategoryId, bool taxExempt, bool telcoOrElectronics, string ddmStructureKey, bool published, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, string defaultSku, bool subscriptionEnabled, int subscriptionLength, string subscriptionType, IDictionary<string, object> subscriptionTypeSettingsUnicodeProperties, long maxSubscriptionCycles, bool deliverySubscriptionEnabled, int deliverySubscriptionLength, string deliverySubscriptionType, IDictionary<string, object> deliverySubscriptionTypeSettingsUnicodeProperties, long deliveryMaxSubscriptionCycles, string externalReferenceCode, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("shortDescriptionMap", shortDescriptionMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("urlTitleMap", urlTitleMap);
			_parameters.Add("metaTitleMap", metaTitleMap);
			_parameters.Add("metaDescriptionMap", metaDescriptionMap);
			_parameters.Add("metaKeywordsMap", metaKeywordsMap);
			_parameters.Add("productTypeName", productTypeName);
			_parameters.Add("ignoreSKUCombinations", ignoreSKUCombinations);
			_parameters.Add("shippable", shippable);
			_parameters.Add("freeShipping", freeShipping);
			_parameters.Add("shipSeparately", shipSeparately);
			_parameters.Add("shippingExtraPrice", shippingExtraPrice);
			_parameters.Add("width", width);
			_parameters.Add("height", height);
			_parameters.Add("depth", depth);
			_parameters.Add("weight", weight);
			_parameters.Add("cpTaxCategoryId", cpTaxCategoryId);
			_parameters.Add("taxExempt", taxExempt);
			_parameters.Add("telcoOrElectronics", telcoOrElectronics);
			_parameters.Add("ddmStructureKey", ddmStructureKey);
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
			_parameters.Add("defaultSku", defaultSku);
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
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinition/upsert-cp-definition", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpsertCpDefinitionAsync(long groupId, long userId, IDictionary<string, string> nameMap, IDictionary<string, string> shortDescriptionMap, IDictionary<string, string> descriptionMap, IDictionary<string, string> urlTitleMap, IDictionary<string, string> metaTitleMap, IDictionary<string, string> metaDescriptionMap, IDictionary<string, string> metaKeywordsMap, string productTypeName, bool ignoreSKUCombinations, bool shippable, bool freeShipping, bool shipSeparately, double shippingExtraPrice, double width, double height, double depth, double weight, long cpTaxCategoryId, bool taxExempt, bool telcoOrElectronics, string ddmStructureKey, bool published, int displayDateMonth, int displayDateDay, int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth, int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute, bool neverExpire, string defaultSku, bool subscriptionEnabled, int subscriptionLength, string subscriptionType, IDictionary<string, object> subscriptionTypeSettingsUnicodeProperties, long maxSubscriptionCycles, string externalReferenceCode, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("userId", userId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("shortDescriptionMap", shortDescriptionMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("urlTitleMap", urlTitleMap);
			_parameters.Add("metaTitleMap", metaTitleMap);
			_parameters.Add("metaDescriptionMap", metaDescriptionMap);
			_parameters.Add("metaKeywordsMap", metaKeywordsMap);
			_parameters.Add("productTypeName", productTypeName);
			_parameters.Add("ignoreSKUCombinations", ignoreSKUCombinations);
			_parameters.Add("shippable", shippable);
			_parameters.Add("freeShipping", freeShipping);
			_parameters.Add("shipSeparately", shipSeparately);
			_parameters.Add("shippingExtraPrice", shippingExtraPrice);
			_parameters.Add("width", width);
			_parameters.Add("height", height);
			_parameters.Add("depth", depth);
			_parameters.Add("weight", weight);
			_parameters.Add("cpTaxCategoryId", cpTaxCategoryId);
			_parameters.Add("taxExempt", taxExempt);
			_parameters.Add("telcoOrElectronics", telcoOrElectronics);
			_parameters.Add("ddmStructureKey", ddmStructureKey);
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
			_parameters.Add("defaultSku", defaultSku);
			_parameters.Add("subscriptionEnabled", subscriptionEnabled);
			_parameters.Add("subscriptionLength", subscriptionLength);
			_parameters.Add("subscriptionType", subscriptionType);
			_parameters.Add("subscriptionTypeSettingsUnicodeProperties", subscriptionTypeSettingsUnicodeProperties);
			_parameters.Add("maxSubscriptionCycles", maxSubscriptionCycles);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinition/upsert-cp-definition", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task UpdateCpDisplayLayoutAsync(long cpDefinitionId, string layoutUuid, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("cpDefinitionId", cpDefinitionId);
			_parameters.Add("layoutUuid", layoutUuid);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.cpdefinition/update-cp-display-layout", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}