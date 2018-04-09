//------------------------------------------------------------------------------
// <copyright file="LayoutPrototypeService.cs">
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

namespace Liferay.SDK.Service.V62.LayoutPrototype
{
	public class LayoutPrototypeService : ServiceBase
	{
		public LayoutPrototypeService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> AddLayoutPrototypeAsync(IDictionary<string, string> nameMap, string description, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nameMap", nameMap);
			_parameters.Add("description", description);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/add-layout-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddLayoutPrototypeAsync(IDictionary<string, string> nameMap, string description, bool active, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nameMap", nameMap);
			_parameters.Add("description", description);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/add-layout-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteLayoutPrototypeAsync(long layoutPrototypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPrototypeId", layoutPrototypeId);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/delete-layout-prototype", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> GetLayoutPrototypeAsync(long layoutPrototypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPrototypeId", layoutPrototypeId);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/get-layout-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, JsonObjectWrapper active, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			this.MangleWrapper(_parameters, "active", "java.lang.Boolean", active);
			this.MangleWrapper(_parameters, "obc", "com.liferay.portal.kernel.util.OrderByComparator", obc);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> UpdateLayoutPrototypeAsync(long layoutPrototypeId, IDictionary<string, string> nameMap, string description, bool active)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPrototypeId", layoutPrototypeId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("description", description);
			_parameters.Add("active", active);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/update-layout-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutPrototypeAsync(long layoutPrototypeId, IDictionary<string, string> nameMap, string description, bool active, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutPrototypeId", layoutPrototypeId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("description", description);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "serviceContext", "com.liferay.portal.service.ServiceContext", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutprototype/update-layout-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}