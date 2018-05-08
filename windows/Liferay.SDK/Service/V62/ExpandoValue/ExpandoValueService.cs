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

namespace Liferay.SDK.Service.V62.ExpandoValue
{
	public class ExpandoValueService : ServiceBase
	{
		public ExpandoValueService(ISession session)
			: base(session)
		{
		}

		public async Task<IDictionary<string, object>> AddValueAsync(long companyId, string className, string tableName, string columnName, long classPK, string data)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("className", className);
			_parameters.Add("tableName", tableName);
			_parameters.Add("columnName", columnName);
			_parameters.Add("classPK", classPK);
			_parameters.Add("data", data);

			var _command = new JsonObject()
			{
				{ "/expandovalue/add-value", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task AddValuesAsync(long companyId, string className, string tableName, long classPK, IDictionary<string, object> attributeValues)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("className", className);
			_parameters.Add("tableName", tableName);
			_parameters.Add("classPK", classPK);
			_parameters.Add("attributeValues", attributeValues);

			var _command = new JsonObject()
			{
				{ "/expandovalue/add-values", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<IDictionary<string, object>> GetDataAsync(long companyId, string className, string tableName, string columnName, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("className", className);
			_parameters.Add("tableName", tableName);
			_parameters.Add("columnName", columnName);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/expandovalue/get-data", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetDataAsync(long companyId, string className, string tableName, IDictionary<string, object> columnNames, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("className", className);
			_parameters.Add("tableName", tableName);
			_parameters.Add("columnNames", columnNames);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/expandovalue/get-data", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}

		public async Task<IDictionary<string, object>> GetJsonDataAsync(long companyId, string className, string tableName, string columnName, long classPK)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("className", className);
			_parameters.Add("tableName", tableName);
			_parameters.Add("columnName", columnName);
			_parameters.Add("classPK", classPK);

			var _command = new JsonObject()
			{
				{ "/expandovalue/get-json-data", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IDictionary<string, object>)_obj;
		}
	}
}