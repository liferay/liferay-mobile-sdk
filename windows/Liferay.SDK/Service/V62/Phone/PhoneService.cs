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

namespace Liferay.SDK.Service.V62.Phone
{
	public class PhoneService : ServiceBase
	{
		public PhoneService(ISession session)
			: base(session)
		{
		}

		public async Task<IDictionary<string, object>> AddPhoneAsync(string className, long classPK, string number, string extension, int typeId, bool primary)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("number", number);
			_parameters.Add("extension", extension);
			_parameters.Add("typeId", typeId);
			_parameters.Add("primary", primary);

			var _command = new JsonObject()
			{
				{ "/phone/add-phone", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> AddPhoneAsync(string className, long classPK, string number, string extension, int typeId, bool primary, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);
			_parameters.Add("number", number);
			_parameters.Add("extension", extension);
			_parameters.Add("typeId", typeId);
			_parameters.Add("primary", primary);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/phone/add-phone", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task DeletePhoneAsync(long phoneId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("phoneId", phoneId);

			var _command = new JsonObject()
			{
				{ "/phone/delete-phone", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> GetPhoneAsync(long phoneId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("phoneId", phoneId);

			var _command = new JsonObject()
			{
				{ "/phone/get-phone", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetPhonesAsync(string className, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/phone/get-phones", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdatePhoneAsync(long phoneId, string number, string extension, int typeId, bool primary)
		{
			var _parameters = new JsonObject();

			_parameters.Add("phoneId", phoneId);
			_parameters.Add("number", number);
			_parameters.Add("extension", extension);
			_parameters.Add("typeId", typeId);
			_parameters.Add("primary", primary);

			var _command = new JsonObject()
			{
				{ "/phone/update-phone", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}
	}
}