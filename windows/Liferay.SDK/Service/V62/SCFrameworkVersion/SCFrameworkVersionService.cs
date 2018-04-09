//------------------------------------------------------------------------------
// <copyright file="SCFrameworkVersionService.cs">
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