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

namespace Liferay.SDK.Service.V72.DDLRecord
{
	public class DDLRecordService : ServiceBase
	{
		public DDLRecordService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> GetRecordAsync(long recordId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("recordId", recordId);

			var _command = new JsonObject()
			{
				{ "/ddl.ddlrecord/get-record", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateRecordAsync(long recordId, bool majorVersion, int displayIndex, JsonObjectWrapper ddmFormValues, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("recordId", recordId);
			_parameters.Add("majorVersion", majorVersion);
			_parameters.Add("displayIndex", displayIndex);
			this.MangleWrapper(_parameters, "ddmFormValues", "$languageUtil.getJSONWrapperClassName($parameter.type)", ddmFormValues);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddl.ddlrecord/update-record", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateRecordAsync(long recordId, bool majorVersion, int displayIndex, JsonObjectWrapper fields, bool mergeFields, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("recordId", recordId);
			_parameters.Add("majorVersion", majorVersion);
			_parameters.Add("displayIndex", displayIndex);
			this.MangleWrapper(_parameters, "fields", "$languageUtil.getJSONWrapperClassName($parameter.type)", fields);
			_parameters.Add("mergeFields", mergeFields);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddl.ddlrecord/update-record", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateRecordAsync(long recordId, int displayIndex, IDictionary<string, object> fieldsMap, bool mergeFields, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("recordId", recordId);
			_parameters.Add("displayIndex", displayIndex);
			_parameters.Add("fieldsMap", fieldsMap);
			_parameters.Add("mergeFields", mergeFields);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddl.ddlrecord/update-record", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteRecordAsync(long recordId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("recordId", recordId);

			var _command = new JsonObject()
			{
				{ "/ddl.ddlrecord/delete-record", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> DeleteRecordLocaleAsync(long recordId, string locale, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("recordId", recordId);
			_parameters.Add("locale", locale);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddl.ddlrecord/delete-record-locale", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task RevertRecordAsync(long recordId, string version, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("recordId", recordId);
			_parameters.Add("version", version);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddl.ddlrecord/revert-record", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task RevertRecordVersionAsync(long recordId, string version, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("recordId", recordId);
			_parameters.Add("version", version);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddl.ddlrecord/revert-record-version", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> AddRecordAsync(long groupId, long recordSetId, int displayIndex, IDictionary<string, object> fieldsMap, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("recordSetId", recordSetId);
			_parameters.Add("displayIndex", displayIndex);
			_parameters.Add("fieldsMap", fieldsMap);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddl.ddlrecord/add-record", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddRecordAsync(long groupId, long recordSetId, int displayIndex, JsonObjectWrapper ddmFormValues, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("recordSetId", recordSetId);
			_parameters.Add("displayIndex", displayIndex);
			this.MangleWrapper(_parameters, "ddmFormValues", "$languageUtil.getJSONWrapperClassName($parameter.type)", ddmFormValues);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddl.ddlrecord/add-record", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> AddRecordAsync(long groupId, long recordSetId, int displayIndex, JsonObjectWrapper fields, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("recordSetId", recordSetId);
			_parameters.Add("displayIndex", displayIndex);
			this.MangleWrapper(_parameters, "fields", "$languageUtil.getJSONWrapperClassName($parameter.type)", fields);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddl.ddlrecord/add-record", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetRecordsAsync(long recordSetId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("recordSetId", recordSetId);

			var _command = new JsonObject()
			{
				{ "/ddl.ddlrecord/get-records", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}
	}
}