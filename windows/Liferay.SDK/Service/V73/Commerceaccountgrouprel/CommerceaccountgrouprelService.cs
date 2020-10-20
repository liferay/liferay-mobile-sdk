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

namespace Liferay.SDK.Service.V73.Commerceaccountgrouprel
{
	public class CommerceaccountgrouprelService : ServiceBase
	{
		public CommerceaccountgrouprelService(ISession session)
			: base(session)
		{
		}

		public async Task DeleteCommerceAccountGroupRelsAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountgrouprel/delete-commerce-account-group-rels", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddCommerceAccountGroupRelAsync(string className, long classPK, long commerceAccountGroupId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("commerceAccountGroupId", commerceAccountGroupId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountgrouprel/add-commerce-account-group-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceAccountGroupRelsAsync(string className, long classPK, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountgrouprel/get-commerce-account-group-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceAccountGroupRelsAsync(long commerceAccountGroupId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountGroupId", commerceAccountGroupId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountgrouprel/get-commerce-account-group-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceAccountGroupRelsCountAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountgrouprel/get-commerce-account-group-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceAccountGroupRelsCountAsync(long commerceAccountGroupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountGroupId", commerceAccountGroupId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountgrouprel/get-commerce-account-group-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task DeleteCommerceAccountGroupRelAsync(long commerceAccountGroupRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountGroupRelId", commerceAccountGroupRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountgrouprel/delete-commerce-account-group-rel", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetCommerceAccountGroupRelAsync(long commerceAccountGroupRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountGroupRelId", commerceAccountGroupRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commerceaccountgrouprel/get-commerce-account-group-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}