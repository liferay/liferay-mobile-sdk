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

namespace Liferay.SDK.Service.V70.ExpandoColumn
{
	public class ExpandoColumnService : ServiceBase
	{
		public ExpandoColumnService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> UpdateColumnAsync(long columnId, string name, int type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("columnId", columnId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/expandocolumn/update-column", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateColumnAsync(long columnId, string name, int type, IDictionary<string, object> defaultData)
		{
			var _parameters = new JsonObject();

			_parameters.Add("columnId", columnId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("defaultData", defaultData);

			var _command = new JsonObject()
			{
				{ "/expandocolumn/update-column", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateTypeSettingsAsync(long columnId, string typeSettings)
		{
			var _parameters = new JsonObject();

			_parameters.Add("columnId", columnId);
			_parameters.Add("typeSettings", typeSettings);

			var _command = new JsonObject()
			{
				{ "/expandocolumn/update-type-settings", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteColumnAsync(long columnId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("columnId", columnId);

			var _command = new JsonObject()
			{
				{ "/expandocolumn/delete-column", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchExpandoColumnAsync(long columnId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("columnId", columnId);

			var _command = new JsonObject()
			{
				{ "/expandocolumn/fetch-expando-column", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddColumnAsync(long tableId, string name, int type, IDictionary<string, object> defaultData)
		{
			var _parameters = new JsonObject();

			_parameters.Add("tableId", tableId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);
			_parameters.Add("defaultData", defaultData);

			var _command = new JsonObject()
			{
				{ "/expandocolumn/add-column", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddColumnAsync(long tableId, string name, int type)
		{
			var _parameters = new JsonObject();

			_parameters.Add("tableId", tableId);
			_parameters.Add("name", name);
			_parameters.Add("type", type);

			var _command = new JsonObject()
			{
				{ "/expandocolumn/add-column", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}