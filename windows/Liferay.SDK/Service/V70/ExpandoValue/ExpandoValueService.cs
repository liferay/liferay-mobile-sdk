//------------------------------------------------------------------------------
// <copyright file="ExpandoValueService.cs">
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

namespace Liferay.SDK.Service.V70.ExpandoValue
{
	public class ExpandoValueService : ServiceBase
	{
		public ExpandoValueService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> GetJsonDataAsync(long companyId, string className, string tableName, string columnName, long classPK)
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

			return (dynamic)_obj;
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

		public async Task<IDictionary<string, object>> GetDataAsync(long companyId, string className, string tableName, IEnumerable<string> columnNames, long classPK)
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

		public async Task<dynamic> AddValueAsync(long companyId, string className, string tableName, string columnName, long classPK, string data)
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

			return (dynamic)_obj;
		}
	}
}