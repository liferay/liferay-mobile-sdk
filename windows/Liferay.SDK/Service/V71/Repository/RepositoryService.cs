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

namespace Liferay.SDK.Service.V71.Repository
{
	public class RepositoryService : ServiceBase
	{
		public RepositoryService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> GetRepositoryAsync(long repositoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);

			var _command = new JsonObject()
			{
				{ "/repository/get-repository", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IDictionary<string, object>> GetTypeSettingsPropertiesAsync(long repositoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);

			var _command = new JsonObject()
			{
				{ "/repository/get-type-settings-properties", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task CheckRepositoryAsync(long repositoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);

			var _command = new JsonObject()
			{
				{ "/repository/check-repository", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddRepositoryAsync(long groupId, long classNameId, long parentFolderId, string name, string description, string portletId, IDictionary<string, object> typeSettingsProperties, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("classNameId", classNameId);
			_parameters.Add("parentFolderId", parentFolderId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("portletId", portletId);
			_parameters.Add("typeSettingsProperties", typeSettingsProperties);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/repository/add-repository", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task UpdateRepositoryAsync(long repositoryId, string name, string description)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);
			_parameters.Add("name", name);
			_parameters.Add("description", description);

			var _command = new JsonObject()
			{
				{ "/repository/update-repository", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IEnumerable<string>> GetSupportedConfigurationsAsync(long classNameId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classNameId", classNameId);

			var _command = new JsonObject()
			{
				{ "/repository/get-supported-configurations", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<string>();
		}

		public async Task<IEnumerable<string>> GetSupportedParametersAsync(long classNameId, string configuration)
		{
			var _parameters = new JsonObject();

			_parameters.Add("classNameId", classNameId);
			_parameters.Add("configuration", configuration);

			var _command = new JsonObject()
			{
				{ "/repository/get-supported-parameters", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<string>();
		}

		public async Task<IEnumerable<string>> GetSupportedParametersAsync(string className, string configuration)
		{
			var _parameters = new JsonObject();

			_parameters.Add("className", className);
			_parameters.Add("configuration", configuration);

			var _command = new JsonObject()
			{
				{ "/repository/get-supported-parameters", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			var _jsonArray = (JsonArray)_obj;

			return _jsonArray.Cast<string>();
		}

		public async Task DeleteRepositoryAsync(long repositoryId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("repositoryId", repositoryId);

			var _command = new JsonObject()
			{
				{ "/repository/delete-repository", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}
	}
}