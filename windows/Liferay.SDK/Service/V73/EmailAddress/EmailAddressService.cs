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

namespace Liferay.SDK.Service.V73.EmailAddress
{
	public class EmailAddressService : ServiceBase
	{
		public EmailAddressService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddEmailAddressAsync(string className, long classPK, string address, long typeId, bool primary, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("address", address);
			_parameters.Add("typeId", typeId);
			_parameters.Add("primary", primary);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/emailaddress/add-email-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateEmailAddressAsync(long emailAddressId, string address, long typeId, bool primary)
		{
			var _parameters = new JsonObject();

			_parameters.Add("emailAddressId", emailAddressId);
			_parameters.Add("address", address);
			_parameters.Add("typeId", typeId);
			_parameters.Add("primary", primary);

			var _command = new JsonObject()
			{
				{ "/emailaddress/update-email-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetEmailAddressesAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/emailaddress/get-email-addresses", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> GetEmailAddressAsync(long emailAddressId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("emailAddressId", emailAddressId);

			var _command = new JsonObject()
			{
				{ "/emailaddress/get-email-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteEmailAddressAsync(long emailAddressId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("emailAddressId", emailAddressId);

			var _command = new JsonObject()
			{
				{ "/emailaddress/delete-email-address", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchEmailAddressAsync(long emailAddressId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("emailAddressId", emailAddressId);

			var _command = new JsonObject()
			{
				{ "/emailaddress/fetch-email-address", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}