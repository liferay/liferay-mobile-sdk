//------------------------------------------------------------------------------
// <copyright file="CountryService.cs">
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

namespace Liferay.SDK.Service.V70.Country
{
	public class CountryService : ServiceBase
	{
		public CountryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> FetchCountryByA2Async(string a2)
		{
			var _parameters = new JsonObject();

			_parameters.Add("a2", a2);

			var _command = new JsonObject()
			{
				{ "/country/fetch-country-by-a2", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCountryByA3Async(string a3)
		{
			var _parameters = new JsonObject();

			_parameters.Add("a3", a3);

			var _command = new JsonObject()
			{
				{ "/country/fetch-country-by-a3", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCountriesAsync(bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/country/get-countries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetCountriesAsync()
		{
			var _parameters = new JsonObject();

			var _command = new JsonObject()
			{
				{ "/country/get-countries", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetCountryByA2Async(string a2)
		{
			var _parameters = new JsonObject();

			_parameters.Add("a2", a2);

			var _command = new JsonObject()
			{
				{ "/country/get-country-by-a2", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCountryByA3Async(string a3)
		{
			var _parameters = new JsonObject();

			_parameters.Add("a3", a3);

			var _command = new JsonObject()
			{
				{ "/country/get-country-by-a3", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCountryByNameAsync(string name)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);

			var _command = new JsonObject()
			{
				{ "/country/get-country-by-name", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchCountryAsync(long countryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("countryId", countryId);

			var _command = new JsonObject()
			{
				{ "/country/fetch-country", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddCountryAsync(string name, string a2, string a3, string number, string idd, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);
			_parameters.Add("a2", a2);
			_parameters.Add("a3", a3);
			_parameters.Add("number", number);
			_parameters.Add("idd", idd);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/country/add-country", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetCountryAsync(long countryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("countryId", countryId);

			var _command = new JsonObject()
			{
				{ "/country/get-country", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}