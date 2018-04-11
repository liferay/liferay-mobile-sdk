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

namespace Liferay.SDK.Service.V62.Country
{
	public class CountryService : ServiceBase
	{
		public CountryService(ISession session)
			: base(session)
		{
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
	}
}