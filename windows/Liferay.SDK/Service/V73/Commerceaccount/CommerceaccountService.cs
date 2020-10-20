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

namespace Liferay.SDK.Service.V73.Commerceaccount
{
	public class CommerceaccountService : ServiceBase
	{
		public CommerceaccountService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> SetActiveAsync(long commerceAccountId, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccount/set-active", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceAccountAsync(long commerceAccountId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccount/get-commerce-account", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddBusinessCommerceAccountAsync(string name, long parentCommerceAccountId, string email, string taxId, bool active, string externalReferenceCode, IEnumerable<long> userIds, IEnumerable<string> emailAddresses, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);
			_parameters.Add("parentCommerceAccountId", parentCommerceAccountId);
			_parameters.Add("email", email);
			_parameters.Add("taxId", taxId);
			_parameters.Add("active", active);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			_parameters.Add("userIds", userIds);
			_parameters.Add("emailAddresses", emailAddresses);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccount/add-business-commerce-account", _parameters }
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
				{ "/commerce.commerceaccount/fetch-by-external-reference-code", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCommerceAccountAsync(string name, long parentCommerceAccountId, string email, string taxId, int type, bool active, string externalReferenceCode, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);
			_parameters.Add("parentCommerceAccountId", parentCommerceAccountId);
			_parameters.Add("email", email);
			_parameters.Add("taxId", taxId);
			_parameters.Add("type", type);
			_parameters.Add("active", active);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccount/add-commerce-account", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceAccountAsync(long commerceAccountId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccount/delete-commerce-account", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchCommerceAccountAsync(long commerceAccountId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccount/fetch-commerce-account", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetPersonalCommerceAccountAsync(long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccount/get-personal-commerce-account", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserCommerceAccountsAsync(long userId, long parentCommerceAccountId, int commerceSiteType, string keywords, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("parentCommerceAccountId", parentCommerceAccountId);
			_parameters.Add("commerceSiteType", commerceSiteType);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccount/get-user-commerce-accounts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetUserCommerceAccountsAsync(long userId, long parentCommerceAccountId, int commerceSiteType, string keywords, bool active, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("parentCommerceAccountId", parentCommerceAccountId);
			_parameters.Add("commerceSiteType", commerceSiteType);
			_parameters.Add("keywords", keywords);
			_parameters.Add("active", active);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccount/get-user-commerce-accounts", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetUserCommerceAccountsCountAsync(long userId, long parentCommerceAccountId, int commerceSiteType, string keywords)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("parentCommerceAccountId", parentCommerceAccountId);
			_parameters.Add("commerceSiteType", commerceSiteType);
			_parameters.Add("keywords", keywords);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccount/get-user-commerce-accounts-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetUserCommerceAccountsCountAsync(long userId, long parentCommerceAccountId, int commerceSiteType, string keywords, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("parentCommerceAccountId", parentCommerceAccountId);
			_parameters.Add("commerceSiteType", commerceSiteType);
			_parameters.Add("keywords", keywords);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccount/get-user-commerce-accounts-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> UpdateCommerceAccountAsync(long commerceAccountId, string name, bool logo, byte[] logoBytes, string email, string taxId, bool active, long defaultBillingAddressId, long defaultShippingAddressId, string externalReferenceCode, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("name", name);
			_parameters.Add("logo", logo);
			_parameters.Add("logoBytes", logoBytes);
			_parameters.Add("email", email);
			_parameters.Add("taxId", taxId);
			_parameters.Add("active", active);
			_parameters.Add("defaultBillingAddressId", defaultBillingAddressId);
			_parameters.Add("defaultShippingAddressId", defaultShippingAddressId);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccount/update-commerce-account", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceAccountAsync(long commerceAccountId, string name, bool logo, byte[] logoBytes, string email, string taxId, bool active, long defaultBillingAddressId, long defaultShippingAddressId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("name", name);
			_parameters.Add("logo", logo);
			_parameters.Add("logoBytes", logoBytes);
			_parameters.Add("email", email);
			_parameters.Add("taxId", taxId);
			_parameters.Add("active", active);
			_parameters.Add("defaultBillingAddressId", defaultBillingAddressId);
			_parameters.Add("defaultShippingAddressId", defaultShippingAddressId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccount/update-commerce-account", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCommerceAccountAsync(long commerceAccountId, string name, bool logo, byte[] logoBytes, string email, string taxId, bool active, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("name", name);
			_parameters.Add("logo", logo);
			_parameters.Add("logoBytes", logoBytes);
			_parameters.Add("email", email);
			_parameters.Add("taxId", taxId);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccount/update-commerce-account", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateDefaultBillingAddressAsync(long commerceAccountId, long commerceAddressId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("commerceAddressId", commerceAddressId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccount/update-default-billing-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateDefaultShippingAddressAsync(long commerceAccountId, long commerceAddressId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("commerceAddressId", commerceAddressId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccount/update-default-shipping-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpsertCommerceAccountAsync(string name, long parentCommerceAccountId, bool logo, byte[] logoBytes, string email, string taxId, int type, bool active, string externalReferenceCode, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);
			_parameters.Add("parentCommerceAccountId", parentCommerceAccountId);
			_parameters.Add("logo", logo);
			_parameters.Add("logoBytes", logoBytes);
			_parameters.Add("email", email);
			_parameters.Add("taxId", taxId);
			_parameters.Add("type", type);
			_parameters.Add("active", active);
			_parameters.Add("externalReferenceCode", externalReferenceCode);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccount/upsert-commerce-account", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}