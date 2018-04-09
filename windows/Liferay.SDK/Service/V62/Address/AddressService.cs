//------------------------------------------------------------------------------
// <copyright file="AddressService.cs">
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

namespace Liferay.SDK.Service.V62.Address
{
	public class AddressService : ServiceBase
	{
		public AddressService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddAddressAsync(string className, long classPK, string street1, string street2, string street3, string city, string zip, long regionId, long countryId, int typeId, bool mailing, bool primary)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("street1", street1);
			_parameters.Add("street2", street2);
			_parameters.Add("street3", street3);
			_parameters.Add("city", city);
			_parameters.Add("zip", zip);
			_parameters.Add("regionId", regionId);
			_parameters.Add("countryId", countryId);
			_parameters.Add("typeId", typeId);
			_parameters.Add("mailing", mailing);
			_parameters.Add("primary", primary);

			var _command = new JsonObject()
			{
				{ "/address/add-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddAddressAsync(string className, long classPK, string street1, string street2, string street3, string city, string zip, long regionId, long countryId, int typeId, bool mailing, bool primary, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("street1", street1);
			_parameters.Add("street2", street2);
			_parameters.Add("street3", street3);
			_parameters.Add("city", city);
			_parameters.Add("zip", zip);
			_parameters.Add("regionId", regionId);
			_parameters.Add("countryId", countryId);
			_parameters.Add("typeId", typeId);
			_parameters.Add("mailing", mailing);
			_parameters.Add("primary", primary);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/address/add-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteAddressAsync(long addressId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("addressId", addressId);

			var _command = new JsonObject()
			{
				{ "/address/delete-address", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetAddressAsync(long addressId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("addressId", addressId);

			var _command = new JsonObject()
			{
				{ "/address/get-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetAddressesAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/address/get-addresses", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> UpdateAddressAsync(long addressId, string street1, string street2, string street3, string city, string zip, long regionId, long countryId, int typeId, bool mailing, bool primary)
		{
			var _parameters = new JsonObject();

			_parameters.Add("addressId", addressId);
			_parameters.Add("street1", street1);
			_parameters.Add("street2", street2);
			_parameters.Add("street3", street3);
			_parameters.Add("city", city);
			_parameters.Add("zip", zip);
			_parameters.Add("regionId", regionId);
			_parameters.Add("countryId", countryId);
			_parameters.Add("typeId", typeId);
			_parameters.Add("mailing", mailing);
			_parameters.Add("primary", primary);

			var _command = new JsonObject()
			{
				{ "/address/update-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}