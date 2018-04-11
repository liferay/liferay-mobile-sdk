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

namespace Liferay.SDK.Service.V62.ShoppingItem
{
	public class ShoppingItemService : ServiceBase
	{
		public ShoppingItemService(ISession session)
			: base(session)
		{
		}

		public async Task AddBookItemsAsync(long groupId, long categoryId, IEnumerable<string> isbns)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);
			_parameters.Add("isbns", isbns);

			var _command = new JsonObject()
			{
				{ "/shoppingitem/add-book-items", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddItemAsync(long groupId, long categoryId, string sku, string name, string description, string properties, string fieldsQuantities, bool requiresShipping, int stockQuantity, bool featured, JsonObjectWrapper sale, bool smallImage, string smallImageURL, Stream smallFile, bool mediumImage, string mediumImageURL, Stream mediumFile, bool largeImage, string largeImageURL, Stream largeFile, IEnumerable<object> itemFields, IEnumerable<object> itemPrices, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);
			_parameters.Add("sku", sku);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("properties", properties);
			_parameters.Add("fieldsQuantities", fieldsQuantities);
			_parameters.Add("requiresShipping", requiresShipping);
			_parameters.Add("stockQuantity", stockQuantity);
			_parameters.Add("featured", featured);
			this.MangleWrapper(_parameters, "sale", "java.lang.Boolean", sale);
			_parameters.Add("smallImage", smallImage);
			_parameters.Add("smallImageURL", smallImageURL);
			_parameters.Add("smallFile", smallFile);
			_parameters.Add("mediumImage", mediumImage);
			_parameters.Add("mediumImageURL", mediumImageURL);
			_parameters.Add("mediumFile", mediumFile);
			_parameters.Add("largeImage", largeImage);
			_parameters.Add("largeImageURL", largeImageURL);
			_parameters.Add("largeFile", largeFile);
			_parameters.Add("itemFields", itemFields);
			_parameters.Add("itemPrices", itemPrices);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/shoppingitem/add-item", _parameters }
			};

			var _obj = await this.Session.UploadAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteItemAsync(long itemId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("itemId", itemId);

			var _command = new JsonObject()
			{
				{ "/shoppingitem/delete-item", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<long> GetCategoriesItemsCountAsync(long groupId, IEnumerable<object> categoryIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryIds", categoryIds);

			var _command = new JsonObject()
			{
				{ "/shoppingitem/get-categories-items-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> GetItemAsync(long itemId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("itemId", itemId);

			var _command = new JsonObject()
			{
				{ "/shoppingitem/get-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetItemsAsync(long groupId, long categoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);

			var _command = new JsonObject()
			{
				{ "/shoppingitem/get-items", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetItemsAsync(long groupId, long categoryId, int start, int end, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "obc", "com.liferay.portal.kernel.util.OrderByComparator", obc);

			var _command = new JsonObject()
			{
				{ "/shoppingitem/get-items", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetItemsCountAsync(long groupId, long categoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);

			var _command = new JsonObject()
			{
				{ "/shoppingitem/get-items-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetItemsPrevAndNextAsync(long itemId, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("itemId", itemId);
			this.MangleWrapper(_parameters, "obc", "com.liferay.portal.kernel.util.OrderByComparator", obc);

			var _command = new JsonObject()
			{
				{ "/shoppingitem/get-items-prev-and-next", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> UpdateItemAsync(long itemId, long groupId, long categoryId, string sku, string name, string description, string properties, string fieldsQuantities, bool requiresShipping, int stockQuantity, bool featured, JsonObjectWrapper sale, bool smallImage, string smallImageURL, Stream smallFile, bool mediumImage, string mediumImageURL, Stream mediumFile, bool largeImage, string largeImageURL, Stream largeFile, IEnumerable<object> itemFields, IEnumerable<object> itemPrices, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("itemId", itemId);
			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);
			_parameters.Add("sku", sku);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("properties", properties);
			_parameters.Add("fieldsQuantities", fieldsQuantities);
			_parameters.Add("requiresShipping", requiresShipping);
			_parameters.Add("stockQuantity", stockQuantity);
			_parameters.Add("featured", featured);
			this.MangleWrapper(_parameters, "sale", "java.lang.Boolean", sale);
			_parameters.Add("smallImage", smallImage);
			_parameters.Add("smallImageURL", smallImageURL);
			_parameters.Add("smallFile", smallFile);
			_parameters.Add("mediumImage", mediumImage);
			_parameters.Add("mediumImageURL", mediumImageURL);
			_parameters.Add("mediumFile", mediumFile);
			_parameters.Add("largeImage", largeImage);
			_parameters.Add("largeImageURL", largeImageURL);
			_parameters.Add("largeFile", largeFile);
			_parameters.Add("itemFields", itemFields);
			_parameters.Add("itemPrices", itemPrices);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/shoppingitem/update-item", _parameters }
			};

			var _obj = await this.Session.UploadAsync(_command);

			return (dynamic)_obj;
		}
	}
}