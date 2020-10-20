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

namespace Liferay.SDK.Service.V73.Commercediscountaccountrel
{
	public class CommercediscountaccountrelService : ServiceBase
	{
		public CommercediscountaccountrelService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddCommerceDiscountAccountRelAsync(long commerceDiscountId, long commerceAccountId, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("commerceAccountId", commerceAccountId);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountaccountrel/add-commerce-discount-account-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceDiscountAccountRelAsync(long commerceDiscountAccountRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountAccountRelId", commerceDiscountAccountRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountaccountrel/get-commerce-discount-account-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteCommerceDiscountAccountRelAsync(long commerceDiscountAccountRelId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountAccountRelId", commerceDiscountAccountRelId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountaccountrel/delete-commerce-discount-account-rel", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task DeleteCommerceDiscountAccountRelsByCommerceDiscountIdAsync(long commerceDiscountId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountaccountrel/delete-commerce-discount-account-rels-by-commerce-discount-id", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchCommerceDiscountAccountRelAsync(long commerceDiscountId, long commerceAccountId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("commerceAccountId", commerceAccountId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountaccountrel/fetch-commerce-discount-account-rel", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceDiscountAccountRelsAsync(long commerceDiscountId, string name, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("name", name);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountaccountrel/get-commerce-discount-account-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCommerceDiscountAccountRelsAsync(long commerceDiscountId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountaccountrel/get-commerce-discount-account-rels", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetCommerceDiscountAccountRelsCountAsync(long commerceDiscountId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountaccountrel/get-commerce-discount-account-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceDiscountAccountRelsCountAsync(long commerceDiscountId, string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceDiscountId", commerceDiscountId);
			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/commerce.commercediscountaccountrel/get-commerce-discount-account-rels-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}
	}
}