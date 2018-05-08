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

namespace Liferay.SDK.Service.V62.AssetCategoryProperty
{
	public class AssetCategoryPropertyService : ServiceBase
	{
		public AssetCategoryPropertyService(ISession session)
			: base(session)
		{
		}

		public async Task<IDictionary<string, object>> AddCategoryPropertyAsync(long entryId, string key, string value)
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

			return (IDictionary<string, object>)_obj;
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

		public async Task<IDictionary<string, object>> GetCategoryPropertiesAsync(long entryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("entryId", entryId);

			var _command = new JsonObject()
			{
				{ "/assetcategoryproperty/get-category-properties", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetCategoryPropertyValuesAsync(long companyId, string key)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("key", key);

			var _command = new JsonObject()
			{
				{ "/assetcategoryproperty/get-category-property-values", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateCategoryPropertyAsync(long categoryPropertyId, string key, string value)
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

			return (IDictionary<string, object>)_obj;
		}
	}
}