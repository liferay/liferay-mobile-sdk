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

namespace Liferay.SDK.Service.V62.LayoutSetPrototype
{
	public class LayoutSetPrototypeService : ServiceBase
	{
		public LayoutSetPrototypeService(ISession session)
			: base(session)
		{
		}

		public async Task<IDictionary<string, object>> AddLayoutSetPrototypeAsync(IDictionary<string, string> nameMap, string description, bool active, bool layoutsUpdateable, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nameMap", nameMap);
			_parameters.Add("description", description);
			_parameters.Add("active", active);
			_parameters.Add("layoutsUpdateable", layoutsUpdateable);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/add-layout-set-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task DeleteLayoutSetPrototypeAsync(long layoutSetPrototypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutSetPrototypeId", layoutSetPrototypeId);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/delete-layout-set-prototype", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> GetLayoutSetPrototypeAsync(long layoutSetPrototypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutSetPrototypeId", layoutSetPrototypeId);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/get-layout-set-prototype", _parameters }
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
				{ "/layoutsetprototype/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateLayoutSetPrototypeAsync(long layoutSetPrototypeId, string settings)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutSetPrototypeId", layoutSetPrototypeId);
			_parameters.Add("settings", settings);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/update-layout-set-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> UpdateLayoutSetPrototypeAsync(long layoutSetPrototypeId, IDictionary<string, string> nameMap, string description, bool active, bool layoutsUpdateable, IDictionary<string, object> serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutSetPrototypeId", layoutSetPrototypeId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("description", description);
			_parameters.Add("active", active);
			_parameters.Add("layoutsUpdateable", layoutsUpdateable);
			_parameters.Add("serviceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/update-layout-set-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}
	}
}