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

namespace Liferay.SDK.Service.V72.LayoutSetPrototype
{
	public class LayoutSetPrototypeService : ServiceBase
	{
		public LayoutSetPrototypeService(ISession session)
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
				{ "/layoutsetprototype/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> FetchLayoutSetPrototypeAsync(long layoutSetPrototypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutSetPrototypeId", layoutSetPrototypeId);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/fetch-layout-set-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddLayoutSetPrototypeAsync(IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, bool active, bool layoutsUpdateable, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("active", active);
			_parameters.Add("layoutsUpdateable", layoutsUpdateable);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/add-layout-set-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutSetPrototypeAsync(long layoutSetPrototypeId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, bool active, bool layoutsUpdateable, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutSetPrototypeId", layoutSetPrototypeId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("active", active);
			_parameters.Add("layoutsUpdateable", layoutsUpdateable);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/update-layout-set-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutSetPrototypeAsync(long layoutSetPrototypeId, string settings)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutSetPrototypeId", layoutSetPrototypeId);
			_parameters.Add("settings", settings);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/update-layout-set-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetLayoutSetPrototypeAsync(long layoutSetPrototypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutSetPrototypeId", layoutSetPrototypeId);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/get-layout-set-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
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
	}
}