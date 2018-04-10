//------------------------------------------------------------------------------
// <copyright file="LayoutSetPrototypeService.cs">
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

namespace Liferay.SDK.Service.V70.LayoutSetPrototype
{
	public class LayoutSetPrototypeService : ServiceBase
	{
		public LayoutSetPrototypeService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> GetLayoutSetPrototypeAsync(long layoutSetPrototypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutSetPrototypeId", layoutSetPrototypeId);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/get-layout-set-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchLayoutSetPrototypeAsync(long layoutSetPrototypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutSetPrototypeId", layoutSetPrototypeId);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/fetch-layout-set-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteLayoutSetPrototypeAsync(long layoutSetPrototypeId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutSetPrototypeId", layoutSetPrototypeId);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/delete-layout-set-prototype", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddLayoutSetPrototypeAsync(IDictionary<string, string> nameMap, string description, bool active, bool layoutsUpdateable, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nameMap", nameMap);
			_parameters.Add("description", description);
			_parameters.Add("active", active);
			_parameters.Add("layoutsUpdateable", layoutsUpdateable);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/add-layout-set-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddLayoutSetPrototypeAsync(IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, bool active, bool layoutsUpdateable, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("active", active);
			_parameters.Add("layoutsUpdateable", layoutsUpdateable);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/add-layout-set-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutSetPrototypeAsync(long layoutSetPrototypeId, IDictionary<string, string> nameMap, IDictionary<string, string> descriptionMap, bool active, bool layoutsUpdateable, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutSetPrototypeId", layoutSetPrototypeId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("descriptionMap", descriptionMap);
			_parameters.Add("active", active);
			_parameters.Add("layoutsUpdateable", layoutsUpdateable);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/update-layout-set-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutSetPrototypeAsync(long layoutSetPrototypeId, IDictionary<string, string> nameMap, string description, bool active, bool layoutsUpdateable, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutSetPrototypeId", layoutSetPrototypeId);
			_parameters.Add("nameMap", nameMap);
			_parameters.Add("description", description);
			_parameters.Add("active", active);
			_parameters.Add("layoutsUpdateable", layoutsUpdateable);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/update-layout-set-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateLayoutSetPrototypeAsync(long layoutSetPrototypeId, string settings)
		{
			var _parameters = new JsonObject();

			_parameters.Add("layoutSetPrototypeId", layoutSetPrototypeId);
			_parameters.Add("settings", settings);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/update-layout-set-prototype", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> SearchAsync(long companyId, bool active, JsonObjectWrapper obc)
		{
			var _parameters = new JsonObject();

			_parameters.Add("companyId", companyId);
			_parameters.Add("active", active);
			this.MangleWrapper(_parameters, "obc", "$languageUtil.getJSONWrapperClassName($parameter.type)", obc);

			var _command = new JsonObject()
			{
				{ "/layoutsetprototype/search", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}
	}
}