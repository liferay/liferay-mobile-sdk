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

namespace Liferay.SDK.Service.V73.Commerceaccountuserrel
{
	public class CommerceaccountuserrelService : ServiceBase
	{
		public CommerceaccountuserrelService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> GetCommerceAccountUserRelsAsync(long commerceAccountId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountuserrel/get-commerce-account-user-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task AddCommerceAccountUserRelsAsync(long commerceAccountId, IEnumerable<long> userIds, IEnumerable<string> emailAddresses, IEnumerable<long> roleIds, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("userIds", userIds);
			_parameters.Add("emailAddresses", emailAddresses);
			_parameters.Add("roleIds", roleIds);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountuserrel/add-commerce-account-user-rels", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddCommerceAccountUserRelAsync(long commerceAccountId, long commerceAccountUserId, IEnumerable<long> roleIds, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("commerceAccountUserId", commerceAccountUserId);
			_parameters.Add("roleIds", roleIds);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountuserrel/add-commerce-account-user-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> InviteUserAsync(long commerceAccountId, string emailAddress, IEnumerable<long> roleIds, string userExternalReferenceCode, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("emailAddress", emailAddress);
			_parameters.Add("roleIds", roleIds);
			_parameters.Add("userExternalReferenceCode", userExternalReferenceCode);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountuserrel/invite-user", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceAccountUserRelsAsync(long commerceAccountId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountuserrel/delete-commerce-account-user-rels", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteCommerceAccountUserRelsAsync(long commerceAccountId, IEnumerable<long> userIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("userIds", userIds);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountuserrel/delete-commerce-account-user-rels", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<long> GetCommerceAccountUserRelsCountAsync(long commerceAccountId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountuserrel/get-commerce-account-user-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task DeleteCommerceAccountUserRelAsync(long commerceAccountId, long userId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("userId", userId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountuserrel/delete-commerce-account-user-rel", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchCommerceAccountUserRelAsync(JsonObjectWrapper commerceAccountUserRelPK)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "commerceAccountUserRelPK", "$languageUtil.getJSONWrapperClassName($parameter.type)", commerceAccountUserRelPK);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountuserrel/fetch-commerce-account-user-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceAccountUserRelAsync(JsonObjectWrapper commerceAccountUserRelPK)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "commerceAccountUserRelPK", "$languageUtil.getJSONWrapperClassName($parameter.type)", commerceAccountUserRelPK);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountuserrel/get-commerce-account-user-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}