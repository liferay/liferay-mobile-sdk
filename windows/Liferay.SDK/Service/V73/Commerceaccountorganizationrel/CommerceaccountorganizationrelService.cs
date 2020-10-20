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

namespace Liferay.SDK.Service.V73.Commerceaccountorganizationrel
{
	public class CommerceaccountorganizationrelService : ServiceBase
	{
		public CommerceaccountorganizationrelService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> GetCommerceAccountOrganizationRelsAsync(long commerceAccountId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountorganizationrel/get-commerce-account-organization-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceAccountOrganizationRelsAsync(long commerceAccountId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountorganizationrel/get-commerce-account-organization-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task DeleteCommerceAccountOrganizationRelAsync(long commerceAccountId, long organizationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("organizationId", organizationId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountorganizationrel/delete-commerce-account-organization-rel", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddCommerceAccountOrganizationRelAsync(long commerceAccountId, long organizationId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("organizationId", organizationId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountorganizationrel/add-commerce-account-organization-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task AddCommerceAccountOrganizationRelsAsync(long commerceAccountId, IEnumerable<long> organizationIds, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("organizationIds", organizationIds);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountorganizationrel/add-commerce-account-organization-rels", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteCommerceAccountOrganizationRelsAsync(long commerceAccountId, IEnumerable<long> organizationIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("organizationIds", organizationIds);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountorganizationrel/delete-commerce-account-organization-rels", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<dynamic>> GetCommerceAccountOrganizationRelsByOrganizationIdAsync(long organizationId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountorganizationrel/get-commerce-account-organization-rels-by-organization-id", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceAccountOrganizationRelsByOrganizationIdCountAsync(long organizationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("organizationId", organizationId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountorganizationrel/get-commerce-account-organization-rels-by-organization-id-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceAccountOrganizationRelsCountAsync(long commerceAccountId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountorganizationrel/get-commerce-account-organization-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> FetchCommerceAccountOrganizationRelAsync(JsonObjectWrapper commerceAccountOrganizationRelPK)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "commerceAccountOrganizationRelPK", "$languageUtil.getJSONWrapperClassName($parameter.type)", commerceAccountOrganizationRelPK);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountorganizationrel/fetch-commerce-account-organization-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceAccountOrganizationRelAsync(JsonObjectWrapper commerceAccountOrganizationRelPK)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "commerceAccountOrganizationRelPK", "$languageUtil.getJSONWrapperClassName($parameter.type)", commerceAccountOrganizationRelPK);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountorganizationrel/get-commerce-account-organization-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}