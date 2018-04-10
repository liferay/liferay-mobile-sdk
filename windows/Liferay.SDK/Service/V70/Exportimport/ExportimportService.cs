//------------------------------------------------------------------------------
// <copyright file="ExportimportService.cs">
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

namespace Liferay.SDK.Service.V70.Exportimport
{
	public class ExportimportService : ServiceBase
	{
		public ExportimportService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> ExportPortletInfoAsFileAsync(JsonObjectWrapper exportImportConfiguration)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);

			var _command = new JsonObject()
			{
				{ "/exportimport/export-portlet-info-as-file", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> ExportLayoutsAsFileAsync(JsonObjectWrapper exportImportConfiguration)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);

			var _command = new JsonObject()
			{
				{ "/exportimport/export-layouts-as-file", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<long> ExportPortletInfoAsFileInBackgroundAsync(JsonObjectWrapper exportImportConfiguration)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);

			var _command = new JsonObject()
			{
				{ "/exportimport/export-portlet-info-as-file-in-background", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> ExportLayoutsAsFileInBackgroundAsync(long exportImportConfigurationId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("exportImportConfigurationId", exportImportConfigurationId);

			var _command = new JsonObject()
			{
				{ "/exportimport/export-layouts-as-file-in-background", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> ExportLayoutsAsFileInBackgroundAsync(JsonObjectWrapper exportImportConfiguration)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);

			var _command = new JsonObject()
			{
				{ "/exportimport/export-layouts-as-file-in-background", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task<long> ImportLayoutsInBackgroundAsync(JsonObjectWrapper exportImportConfiguration, Stream file)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/exportimport/import-layouts-in-background", _parameters }
			};

			var _obj = await this.Session.UploadAsync(_command);

			return (long)_obj;
		}

		public async Task ImportLayoutsAsync(JsonObjectWrapper exportImportConfiguration, Stream file)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/exportimport/import-layouts", _parameters }
			};

			await this.Session.UploadAsync(_command);
		}

		public async Task ImportPortletInfoAsync(JsonObjectWrapper exportImportConfiguration, Stream file)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/exportimport/import-portlet-info", _parameters }
			};

			await this.Session.UploadAsync(_command);
		}

		public async Task<long> ImportPortletInfoInBackgroundAsync(JsonObjectWrapper exportImportConfiguration, Stream file)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/exportimport/import-portlet-info-in-background", _parameters }
			};

			var _obj = await this.Session.UploadAsync(_command);

			return (long)_obj;
		}

		public async Task<dynamic> ValidateImportLayoutsFileAsync(JsonObjectWrapper exportImportConfiguration, Stream file)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/exportimport/validate-import-layouts-file", _parameters }
			};

			var _obj = await this.Session.UploadAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> ValidateImportPortletInfoAsync(JsonObjectWrapper exportImportConfiguration, Stream file)
		{
			var _parameters = new JsonObject();

			this.MangleWrapper(_parameters, "exportImportConfiguration", "$languageUtil.getJSONWrapperClassName($parameter.type)", exportImportConfiguration);
			_parameters.Add("file", file);

			var _command = new JsonObject()
			{
				{ "/exportimport/validate-import-portlet-info", _parameters }
			};

			var _obj = await this.Session.UploadAsync(_command);

			return (dynamic)_obj;
		}
	}
}