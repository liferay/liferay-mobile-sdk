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

namespace Liferay.SDK.Service.V73.Exportimport
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
	}
}