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

namespace Liferay.SDK.Service.V73.Ddmdataproviderinstance
{
	public class DdmdataproviderinstanceService : ServiceBase
	{
		public DdmdataproviderinstanceService(ISession session)
			: base(session)
		{
		}

		public async Task<long> SearchCountAsync(long companyId, IEnumerable<long> groupIds, string name, string description, bool andOperator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("andOperator", andOperator);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmdataproviderinstance/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> SearchCountAsync(long companyId, IEnumerable<long> groupIds, string keywords)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("keywords", keywords);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmdataproviderinstance/search-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> GetDataProviderInstancesCountAsync(long companyId, IEnumerable<long> groupIds)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmdataproviderinstance/get-data-provider-instances-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> FetchDataProviderInstanceByUuidAsync(string uuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("uuid", uuid);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmdataproviderinstance/fetch-data-provider-instance-by-uuid", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetDataProviderInstanceAsync(long dataProviderInstanceId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("dataProviderInstanceId", dataProviderInstanceId);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmdataproviderinstance/get-data-provider-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddDataProviderInstanceAsync(long groupId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, JsonObjectWrapper ddmFormValues, string type, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			this.MangleWrapper(_parameters, "ddmFormValues", "$languageUtil.getJSONWrapperClassName($parameter.type)", ddmFormValues);
			_parameters.Add("type", type);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmdataproviderinstance/add-data-provider-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteDataProviderInstanceAsync(long dataProviderInstanceId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("dataProviderInstanceId", dataProviderInstanceId);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmdataproviderinstance/delete-data-provider-instance", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> FetchDataProviderInstanceAsync(long dataProviderInstanceId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("dataProviderInstanceId", dataProviderInstanceId);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmdataproviderinstance/fetch-data-provider-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetDataProviderInstanceByUuidAsync(string uuid)
		{
			var _parameters = new JsonObject();

			_parameters.Add("uuid", uuid);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmdataproviderinstance/get-data-provider-instance-by-uuid", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetDataProviderInstancesAsync(long companyId, IEnumerable<long> groupIds, int start, int end)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("start", start);
			_parameters.Add("end", end);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmdataproviderinstance/get-data-provider-instances", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> UpdateDataProviderInstanceAsync(long dataProviderInstanceId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, JsonObjectWrapper ddmFormValues, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("dataProviderInstanceId", dataProviderInstanceId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			this.MangleWrapper(_parameters, "ddmFormValues", "$languageUtil.getJSONWrapperClassName($parameter.type)", ddmFormValues);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmdataproviderinstance/update-data-provider-instance", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, IEnumerable<long> groupIds, string keywords, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("keywords", keywords);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmdataproviderinstance/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, IEnumerable<long> groupIds, string name, string description, bool andOperator, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("groupIds", groupIds);
			_parameters.Add("name", name);
			_parameters.Add("description", description);
			_parameters.Add("andOperator", andOperator);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmdataproviderinstance/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}
	}
}