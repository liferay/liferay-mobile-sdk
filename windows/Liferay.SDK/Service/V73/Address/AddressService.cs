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

namespace Liferay.SDK.Service.V73.Address
{
	public class AddressService : ServiceBase
	{
		public AddressService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> UpdateAddressAsync(long addressId, string street1, string street2, string street3, string city, string zip, long regionId, long countryId, long typeId, bool mailing, bool primary)
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

		public async Task<dynamic> AddAddressAsync(string className, long classPK, string street1, string street2, string street3, string city, string zip, long regionId, long countryId, long typeId, bool mailing, bool primary, JsonObjectWrapper serviceContext)
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
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/address/add-address", _parameters }
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
	}
}