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

namespace Liferay.SDK.Service.V73.Source
{
	public class SourceService : ServiceBase
	{
		public SourceService(ISession session)
			: base(session)
		{
		}

		public async Task<IEnumerable<dynamic>> GetSourcesAsync(long groupId, string name, string driverUrl, bool andSearch, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("driverUrl", driverUrl);
			_parameters.Add("andSearch", andSearch);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/reports.source/get-sources", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> UpdateSourceAsync(long sourceId, IDictionary<string, string> nameMap, string driverClassName, string driverUrl, string driverUserName, string driverPassword, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("sourceId", sourceId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("driverClassName", driverClassName);
			_parameters.Add("driverUrl", driverUrl);
			_parameters.Add("driverUserName", driverUserName);
			_parameters.Add("driverPassword", driverPassword);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/reports.source/update-source", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddSourceAsync(long groupId, IDictionary<string, string> nameMap, string driverClassName, string driverUrl, string driverUserName, string driverPassword, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("driverClassName", driverClassName);
			_parameters.Add("driverUrl", driverUrl);
			_parameters.Add("driverUserName", driverUserName);
			_parameters.Add("driverPassword", driverPassword);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/reports.source/add-source", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> GetSourcesCountAsync(long groupId, string name, string driverUrl, bool andSearch)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("name", name);
			_parameters.Add("driverUrl", driverUrl);
			_parameters.Add("andSearch", andSearch);

			var _command = new JsonObject()
			{
				{ "/reports.source/get-sources-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> GetSourceAsync(long sourceId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("sourceId", sourceId);

			var _command = new JsonObject()
			{
				{ "/reports.source/get-source", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> DeleteSourceAsync(long sourceId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("sourceId", sourceId);

			var _command = new JsonObject()
			{
				{ "/reports.source/delete-source", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}