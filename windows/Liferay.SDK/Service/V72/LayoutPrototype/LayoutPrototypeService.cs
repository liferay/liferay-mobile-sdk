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

namespace Liferay.SDK.Service.V72.LayoutPrototype
{
	public class LayoutPrototypeService : ServiceBase
	{
		public LayoutPrototypeService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, bool active, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> FetchLayoutPrototypeAsync(long layoutPrototypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPrototypeId", layoutPrototypeId);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/fetch-layout-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetLayoutPrototypeAsync(long layoutPrototypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPrototypeId", layoutPrototypeId);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/get-layout-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
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

		public async Task<dynamic> AddLayoutPrototypeAsync(IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, bool active, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/add-layout-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutPrototypeAsync(long layoutPrototypeId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, bool active, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPrototypeId", layoutPrototypeId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/update-layout-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}