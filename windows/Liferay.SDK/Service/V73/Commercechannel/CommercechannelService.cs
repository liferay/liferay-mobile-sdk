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

namespace Liferay.SDK.Service.V73.Commercechannel
{
	public class CommercechannelService : ServiceBase
	{
		public CommercechannelService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> GetCommerceChannelAsync(long commerceChannelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceChannelId", commerceChannelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercechannel/get-commerce-channel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceChannelAsync(long siteGroupId, string name, string type, IDictionary<string, object> typeSettingsUnicodeProperties, string commerceCurrencyCode, string externalReferenceCode, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("siteGroupId", siteGroupId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("typeSettingsUnicodeProperties", typeSettingsUnicodeProperties);
			_parameters.Add("commerceCurrencyCode", commerceCurrencyCode);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercechannel/add-commerce-channel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteCommerceChannelAsync(long commerceChannelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceChannelId", commerceChannelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercechannel/delete-commerce-channel", _parameters }
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
				{ "/commerce.commercechannel/fetch-by-external-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCommerceChannelAsync(long commerceChannelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceChannelId", commerceChannelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercechannel/fetch-commerce-channel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceChannelByOrderGroupIdAsync(long groupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercechannel/get-commerce-channel-by-order-group-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceChannelsAsync(int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercechannel/get-commerce-channels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceChannelsAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercechannel/get-commerce-channels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchCommerceChannelsAsync(long companyId, string keywords, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/commerce.commercechannel/search-commerce-channels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchCommerceChannelsAsync(long companyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercechannel/search-commerce-channels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> SearchCommerceChannelsCountAsync(long companyId, string keywords)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("keywords", keywords);

			var _command = new JsonObject()
			{
				{ "/commerce.commercechannel/search-commerce-channels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCommerceChannelAsync(long commerceChannelId, long siteGroupId, string name, string type, IDictionary<string, object> typeSettingsUnicodeProperties, string commerceCurrencyCode, string priceDisplayType, bool discountsTargetNetPrice)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceChannelId", commerceChannelId);
			_parameters.Add("siteGroupId", siteGroupId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("typeSettingsUnicodeProperties", typeSettingsUnicodeProperties);
			_parameters.Add("commerceCurrencyCode", commerceCurrencyCode);
			_parameters.Add("priceDisplayType", priceDisplayType);
			_parameters.Add("discountsTargetNetPrice", discountsTargetNetPrice);

			var _command = new JsonObject()
			{
				{ "/commerce.commercechannel/update-commerce-channel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceChannelAsync(long commerceChannelId, long siteGroupId, string name, string type, IDictionary<string, object> typeSettingsUnicodeProperties, string commerceCurrencyCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceChannelId", commerceChannelId);
			_parameters.Add("siteGroupId", siteGroupId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("typeSettingsUnicodeProperties", typeSettingsUnicodeProperties);
			_parameters.Add("commerceCurrencyCode", commerceCurrencyCode);

			var _command = new JsonObject()
			{
				{ "/commerce.commercechannel/update-commerce-channel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceChannelExternalReferenceCodeAsync(long commerceChannelId, string externalReferenceCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceChannelId", commerceChannelId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);

			var _command = new JsonObject()
			{
				{ "/commerce.commercechannel/update-commerce-channel-external-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}