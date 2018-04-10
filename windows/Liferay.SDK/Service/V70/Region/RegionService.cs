//------------------------------------------------------------------------------
// <copyright file="RegionService.cs">
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