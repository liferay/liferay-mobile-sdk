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

namespace Liferay.SDK.Service.V62.LayoutPrototype
{
	public class LayoutPrototypeService : ServiceBase
	{
		public LayoutPrototypeService(ISession session)
			: base(session)
		{
		}

		public async Task<IDictionary<string, object>> AddLayoutPrototypeAsync(IDictionary<string, string> nameMap, string description, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nameMap", nameMap);
			_parameters.Add("description", description);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/add-layout-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> AddLayoutPrototypeAsync(IDictionary<string, string> nameMap, string description, bool active, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nameMap", nameMap);
			_parameters.Add("description", description);
			_parameters.Add("active", active);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/add-layout-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task DeleteLayoutPrototypeAsync(long layoutPrototypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPrototypeId", layoutPrototypeId);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/delete-layout-prototype", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> GetLayoutPrototypeAsync(long layoutPrototypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPrototypeId", layoutPrototypeId);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/get-layout-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> SearchAsync(long companyId, IDictionary<string, object> active, IDictionary<string, object> obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("active", active);
			_parameters.Add("obc", obc);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateLayoutPrototypeAsync(long layoutPrototypeId, IDictionary<string, string> nameMap, string description, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPrototypeId", layoutPrototypeId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("description", description);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/update-layout-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateLayoutPrototypeAsync(long layoutPrototypeId, IDictionary<string, string> nameMap, string description, bool active, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPrototypeId", layoutPrototypeId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("description", description);
			_parameters.Add("active", active);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/update-layout-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}
	}
}