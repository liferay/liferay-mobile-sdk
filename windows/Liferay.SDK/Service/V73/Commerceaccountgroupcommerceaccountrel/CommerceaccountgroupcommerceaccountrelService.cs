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

namespace Liferay.SDK.Service.V73.Commerceaccountgroupcommerceaccountrel
{
	public class CommerceaccountgroupcommerceaccountrelService : ServiceBase
	{
		public CommerceaccountgroupcommerceaccountrelService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddCommerceAccountGroupCommerceAccountRelAsync(long commerceAccountGroupId, long commerceAccountId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountGroupId", commerceAccountGroupId);
			_parameters.Add("commerceAccountId", commerceAccountId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountgroupcommerceaccountrel/add-commerce-account-group-commerce-account-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceAccountGroupCommerceAccountRelAsync(long commerceAccountGroupId, long commerceAccountId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountGroupId", commerceAccountGroupId);
			_parameters.Add("commerceAccountId", commerceAccountId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountgroupcommerceaccountrel/get-commerce-account-group-commerce-account-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceAccountGroupCommerceAccountRelsAsync(long commerceAccountGroupId, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountGroupId", commerceAccountGroupId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountgroupcommerceaccountrel/get-commerce-account-group-commerce-account-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceAccountGroupCommerceAccountRelsCountAsync(long commerceAccountGroupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountGroupId", commerceAccountGroupId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountgroupcommerceaccountrel/get-commerce-account-group-commerce-account-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task DeleteCommerceAccountGroupCommerceAccountRelAsync(long commerceAccountGroupCommerceAccountRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountGroupCommerceAccountRelId", commerceAccountGroupCommerceAccountRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountgroupcommerceaccountrel/delete-commerce-account-group-commerce-account-rel", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}