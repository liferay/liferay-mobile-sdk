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

namespace Liferay.SDK.Service.V73.ListType
{
	public class ListTypeService : ServiceBase
	{
		public ListTypeService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> GetListTypeAsync(string name, string type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("name", name);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/listtype/get-list-type", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetListTypeAsync(long listTypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("listTypeId", listTypeId);

			var _command = new JsonObject()
			{
				{ "/listtype/get-list-type", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetListTypesAsync(string type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/listtype/get-list-types", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task ValidateAsync(long listTypeId, long classNameId, string type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("listTypeId", listTypeId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/listtype/validate", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task ValidateAsync(long listTypeId, string type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("listTypeId", listTypeId);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/listtype/validate", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}