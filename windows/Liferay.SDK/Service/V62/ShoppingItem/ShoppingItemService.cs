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

		public async Task<IDictionary<string, object>> AddItemAsync(long groupId, long categoryId, string sku, string name, string description, string properties, string fieldsQuantities, bool requiresShipping, int stockQuantity, bool featured, IDictionary<string, object> sale, bool smallImage, string smallImageURL, IDictionary<string, object> smallFile, bool mediumImage, string mediumImageURL, IDictionary<string, object> mediumFile, bool largeImage, string largeImageURL, IDictionary<string, object> largeFile, IEnumerable<object> itemFields, IEnumerable<object> itemPrices, IDictionary<string, object> serviceContext)
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
			_parameters.Add("sale", sale);
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
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/shoppingitem/add-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
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

		public async Task<IDictionary<string, object>> GetItemAsync(long itemId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("itemId", itemId);

			var _command = new JsonObject()
			{
				{ "/shoppingitem/get-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetItemsAsync(long groupId, long categoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);

			var _command = new JsonObject()
			{
				{ "/shoppingitem/get-items", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetItemsAsync(long groupId, long categoryId, int start, int end, IDictionary<string, object> obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("categoryId", categoryId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			_parameters.Add("obc", obc);

			var _command = new JsonObject()
			{
				{ "/shoppingitem/get-items", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
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

		public async Task<IEnumerable<dynamic>> GetItemsPrevAndNextAsync(long itemId, IDictionary<string, object> obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("itemId", itemId);
			_parameters.Add("obc", obc);

			var _command = new JsonObject()
			{
				{ "/shoppingitem/get-items-prev-and-next", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateItemAsync(long itemId, long groupId, long categoryId, string sku, string name, string description, string properties, string fieldsQuantities, bool requiresShipping, int stockQuantity, bool featured, IDictionary<string, object> sale, bool smallImage, string smallImageURL, IDictionary<string, object> smallFile, bool mediumImage, string mediumImageURL, IDictionary<string, object> mediumFile, bool largeImage, string largeImageURL, IDictionary<string, object> largeFile, IEnumerable<object> itemFields, IEnumerable<object> itemPrices, IDictionary<string, object> serviceContext)
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
			_parameters.Add("sale", sale);
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
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/shoppingitem/update-item", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}
	}
}