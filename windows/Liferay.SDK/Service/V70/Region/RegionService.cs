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

namespace Liferay.SDK.Service.V70.Region
{
	public class RegionService : ServiceBase
	{
		public RegionService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddRegionAsync(long countryId, string regionCode, string name, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("countryId", countryId);
			_parameters.Add("regionCode", regionCode);
			_parameters.Add("name", name);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/region/add-region", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetRegionsAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/region/get-regions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetRegionsAsync(long countryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("countryId", countryId);

			var _command = new JsonObject()
			{
				{ "/region/get-regions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetRegionsAsync(bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/region/get-regions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetRegionsAsync(long countryId, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("countryId", countryId);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/region/get-regions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> FetchRegionAsync(long regionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("regionId", regionId);

			var _command = new JsonObject()
			{
				{ "/region/fetch-region", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchRegionAsync(long countryId, string regionCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("countryId", countryId);
			_parameters.Add("regionCode", regionCode);

			var _command = new JsonObject()
			{
				{ "/region/fetch-region", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetRegionAsync(long regionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("regionId", regionId);

			var _command = new JsonObject()
			{
				{ "/region/get-region", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetRegionAsync(long countryId, string regionCode)
		{
			var _parameters = new JsonObject();

			_parameters.Add("countryId", countryId);
			_parameters.Add("regionCode", regionCode);

			var _command = new JsonObject()
			{
				{ "/region/get-region", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}