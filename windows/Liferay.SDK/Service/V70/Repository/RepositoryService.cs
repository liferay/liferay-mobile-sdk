//------------------------------------------------------------------------------
// <copyright file="RepositoryService.cs">
//    Copyright (c) 2014-present Andrea Di Giorgi
//
//    Permission is hereby granted, free of charge, to any person obtaining a
//    copy of this software and associated documentation files (the "Software"),
//    to deal in the Software without restriction, including without limitation
//    the rights to use, copy, modify, merge, publish, distribute, sublicense,
//    and/or sell copies of the Software, and to permit persons to whom the
//    Software is furnished to do so, subject to the following conditions:
//
//    The above copyright notice and this permission notice shall be included in
//    all copies or substantial portions of the Software.
//
//    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
//    THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
//    FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
//    DEALINGS IN THE SOFTWARE.
// </copyright>
// <author>Andrea Di Giorgi</author>
// <website>https://github.com/Ithildir/liferay-sdk-builder-windows</website>
//------------------------------------------------------------------------------

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading.Tasks;

namespace Liferay.SDK.Service.V70.Repository
{
	public class RepositoryService : ServiceBase
	{
		public RepositoryService(ISession session)
			: base(session)
		{
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
	}
}