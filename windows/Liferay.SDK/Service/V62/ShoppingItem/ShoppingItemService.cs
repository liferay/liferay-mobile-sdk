//------------------------------------------------------------------------------
// <copyright file="ShoppingItemService.cs">
//    Copyright (c) 2014-present Andrea Di Giorgi
//
//    Permission is hereby granted, free of charge, to any person obtaining a
//    copy of this software and associated documentation files (the "Software"),
//    to deal in the Software without restriction, including without limitation
//    the rights to use, copy, modify, merge, publish, distribute, sublicense,
//    and/or sell copies of the Software, and to permit persons to whom the
//    Software is furnished to do so, subject to the following conditions:
//
//    The above copyright notice and this permission notice shall be included in
//    all copies or substantial portions of the Software.
//
//    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
//    THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
//    FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
//    DEALINGS IN THE SOFTWARE.
// </copyright>
// <author>Andrea Di Giorgi</author>
// <website>https://github.com/Ithildir/liferay-sdk-builder-windows</website>
//------------------------------------------------------------------------------

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