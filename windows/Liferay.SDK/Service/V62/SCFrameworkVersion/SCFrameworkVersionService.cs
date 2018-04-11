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

namespace Liferay.SDK.Service.V62.SCFrameworkVersion
{
	public class SCFrameworkVersionService : ServiceBase
	{
		public SCFrameworkVersionService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddFrameworkVersionAsync(string name, string url, bool active, int priority, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);
			_parameters.Add("url", url);
			_parameters.Add("active", active);
			_parameters.Add("priority", priority);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/scframeworkversion/add-framework-version", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteFrameworkVersionAsync(long frameworkVersionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("frameworkVersionId", frameworkVersionId);

			var _command = new JsonObject()
			{
				{ "/scframeworkversion/delete-framework-version", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetFrameworkVersionAsync(long frameworkVersionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("frameworkVersionId", frameworkVersionId);

			var _command = new JsonObject()
			{
				{ "/scframeworkversion/get-framework-version", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFrameworkVersionsAsync(long groupId, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/scframeworkversion/get-framework-versions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFrameworkVersionsAsync(long groupId, bool active, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("active", active);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/scframeworkversion/get-framework-versions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> UpdateFrameworkVersionAsync(long frameworkVersionId, string name, string url, bool active, int priority)
		{
			var _parameters = new JsonObject();

			_parameters.Add("frameworkVersionId", frameworkVersionId);
			_parameters.Add("name", name);
			_parameters.Add("url", url);
			_parameters.Add("active", active);
			_parameters.Add("priority", priority);

			var _command = new JsonObject()
			{
				{ "/scframeworkversion/update-framework-version", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}