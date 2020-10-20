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

namespace Liferay.SDK.Service.V73.Commercediscountcommerceaccountgrouprel
{
	public class CommercediscountcommerceaccountgrouprelService : ServiceBase
	{
		public CommercediscountcommerceaccountgrouprelService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> GetCommerceDiscountCommerceAccountGroupRelsAsync(long commerceDiscountId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountcommerceaccountgrouprel/get-commerce-discount-commerce-account-group-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceDiscountCommerceAccountGroupRelsAsync(long commerceDiscountId, string name, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountcommerceaccountgrouprel/get-commerce-discount-commerce-account-group-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task DeleteCommerceDiscountCommerceAccountGroupRelsByCommerceDiscountIdAsync(long commerceDiscountId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountcommerceaccountgrouprel/delete-commerce-discount-commerce-account-group-rels-by-commerce-discount-id", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddCommerceDiscountCommerceAccountGroupRelAsync(long commerceDiscountId, long commerceAccountGroupId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("commerceAccountGroupId", commerceAccountGroupId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountcommerceaccountgrouprel/add-commerce-discount-commerce-account-group-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceDiscountCommerceAccountGroupRelAsync(long commerceDiscountCommerceAccountGroupRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountCommerceAccountGroupRelId", commerceDiscountCommerceAccountGroupRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountcommerceaccountgrouprel/delete-commerce-discount-commerce-account-group-rel", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchCommerceDiscountCommerceAccountGroupRelAsync(long commerceDiscountId, long commerceAccountGroupId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("commerceAccountGroupId", commerceAccountGroupId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountcommerceaccountgrouprel/fetch-commerce-discount-commerce-account-group-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetCommerceDiscountCommerceAccountGroupRelsCountAsync(long commerceDiscountId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountcommerceaccountgrouprel/get-commerce-discount-commerce-account-group-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceDiscountCommerceAccountGroupRelsCountAsync(long commerceDiscountId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountcommerceaccountgrouprel/get-commerce-discount-commerce-account-group-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> GetCommerceDiscountCommerceAccountGroupRelAsync(long commerceDiscountCommerceAccountGroupRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountCommerceAccountGroupRelId", commerceDiscountCommerceAccountGroupRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountcommerceaccountgrouprel/get-commerce-discount-commerce-account-group-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}