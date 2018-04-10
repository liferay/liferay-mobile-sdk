//------------------------------------------------------------------------------
// <copyright file="AssetCategoryPropertyService.cs">
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

namespace Liferay.SDK.Service.V70.AssetCategoryProperty
{
	public class AssetCategoryPropertyService : ServiceBase
	{
		public AssetCategoryPropertyService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> GetCategoryPropertiesAsync(long entryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);

			var _command = new JsonObject()
			{
				{ "/assetcategoryproperty/get-category-properties", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCategoryPropertyValuesAsync(long companyId, string key)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("key", key);

			var _command = new JsonObject()
			{
				{ "/assetcategoryproperty/get-category-property-values", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task DeleteCategoryPropertyAsync(long categoryPropertyId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryPropertyId", categoryPropertyId);

			var _command = new JsonObject()
			{
				{ "/assetcategoryproperty/delete-category-property", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddCategoryPropertyAsync(long entryId, string key, string value)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);
			_parameters.Add("key", key);
			_parameters.Add("value", value);

			var _command = new JsonObject()
			{
				{ "/assetcategoryproperty/add-category-property", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCategoryPropertyAsync(long userId, long categoryPropertyId, string key, string value)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("categoryPropertyId", categoryPropertyId);
			_parameters.Add("key", key);
			_parameters.Add("value", value);

			var _command = new JsonObject()
			{
				{ "/assetcategoryproperty/update-category-property", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateCategoryPropertyAsync(long categoryPropertyId, string key, string value)
		{
			var _parameters = new JsonObject();

			_parameters.Add("categoryPropertyId", categoryPropertyId);
			_parameters.Add("key", key);
			_parameters.Add("value", value);

			var _command = new JsonObject()
			{
				{ "/assetcategoryproperty/update-category-property", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}