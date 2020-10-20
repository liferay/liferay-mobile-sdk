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

namespace Liferay.SDK.Service.V73.Commercewishlistitem
{
	public class CommercewishlistitemService : ServiceBase
	{
		public CommercewishlistitemService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> GetCommerceWishListItemsAsync(long commerceWishListId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceWishListId", commerceWishListId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/commerce.commercewishlistitem/get-commerce-wish-list-items", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> AddCommerceWishListItemAsync(long commerceAccountId, long commerceWishListId, long cProductId, string cpInstanceUuid, string json, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceAccountId", commerceAccountId);
			_parameters.Add("commerceWishListId", commerceWishListId);
			_parameters.Add("cProductId", cProductId);
			_parameters.Add("cpInstanceUuid", cpInstanceUuid);
			_parameters.Add("json", json);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/commerce.commercewishlistitem/add-commerce-wish-list-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceWishListItemAsync(long commerceWishListItemId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceWishListItemId", commerceWishListItemId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercewishlistitem/get-commerce-wish-list-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCommerceWishListItemAsync(long commerceWishListId, string cpInstanceUuid, long cProductId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceWishListId", commerceWishListId);
			_parameters.Add("cpInstanceUuid", cpInstanceUuid);
			_parameters.Add("cProductId", cProductId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercewishlistitem/get-commerce-wish-list-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetCommerceWishListItemByContainsCpInstanceCountAsync(long commerceWishListId, string cpInstanceUuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceWishListId", commerceWishListId);
			_parameters.Add("cpInstanceUuid", cpInstanceUuid);

			var _command = new JsonObject()
			{
				{ "/commerce.commercewishlistitem/get-commerce-wish-list-item-by-contains-cp-instance-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceWishListItemByContainsCProductCountAsync(long commerceWishListId, long cProductId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceWishListId", commerceWishListId);
			_parameters.Add("cProductId", cProductId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercewishlistitem/get-commerce-wish-list-item-by-contains-c-product-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetCommerceWishListItemsCountAsync(long commerceWishListId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceWishListId", commerceWishListId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercewishlistitem/get-commerce-wish-list-items-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task DeleteCommerceWishListItemAsync(long commerceWishListItemId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("commerceWishListItemId", commerceWishListItemId);

			var _command = new JsonObject()
			{
				{ "/commerce.commercewishlistitem/delete-commerce-wish-list-item", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}