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

namespace Liferay.SDK.Service.V73.Ddmforminstancerecord
{
	public class DdmforminstancerecordService : ServiceBase
	{
		public DdmforminstancerecordService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> GetFormInstanceRecordAsync(long ddmFormInstanceRecordId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddmFormInstanceRecordId", ddmFormInstanceRecordId);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstancerecord/get-form-instance-record", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFormInstanceRecordsAsync(long ddmFormInstanceId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddmFormInstanceId", ddmFormInstanceId);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstancerecord/get-form-instance-records", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFormInstanceRecordsAsync(long ddmFormInstanceId, int status, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddmFormInstanceId", ddmFormInstanceId);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstancerecord/get-form-instance-records", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<dynamic> AddFormInstanceRecordAsync(long groupId, long ddmFormInstanceId, JsonObjectWrapper ddmFormValues, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("groupId", groupId);
			_parameters.Add("ddmFormInstanceId", ddmFormInstanceId);
			this.MangleWrapper(_parameters, "ddmFormValues", "$languageUtil.getJSONWrapperClassName($parameter.type)", ddmFormValues);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstancerecord/add-form-instance-record", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task DeleteFormInstanceRecordAsync(long ddmFormInstanceRecordId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddmFormInstanceRecordId", ddmFormInstanceRecordId);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstancerecord/delete-form-instance-record", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<long> GetFormInstanceRecordsCountAsync(long ddmFormInstanceId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddmFormInstanceId", ddmFormInstanceId);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstancerecord/get-form-instance-records-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}

		public async Task RevertFormInstanceRecordAsync(long ddmFormInstanceRecordId, string version, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddmFormInstanceRecordId", ddmFormInstanceRecordId);
			_parameters.Add("version", version);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstancerecord/revert-form-instance-record", _parameters }
			};

			await this.Session.InvokeAsync(_command);
		}

		public async Task<dynamic> SearchFormInstanceRecordsAsync(long ddmFormInstanceId, IEnumerable<string> notEmptyFields, int status, int start, int end, JsonObjectWrapper sort)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddmFormInstanceId", ddmFormInstanceId);
			_parameters.Add("notEmptyFields", notEmptyFields);
			_parameters.Add("status", status);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "sort", "$languageUtil.getJSONWrapperClassName($parameter.type)", sort);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstancerecord/search-form-instance-records", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> UpdateFormInstanceRecordAsync(long ddmFormInstanceRecordId, bool majorVersion, JsonObjectWrapper ddmFormValues, JsonObjectWrapper serviceContext)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddmFormInstanceRecordId", ddmFormInstanceRecordId);
			_parameters.Add("majorVersion", majorVersion);
			this.MangleWrapper(_parameters, "ddmFormValues", "$languageUtil.getJSONWrapperClassName($parameter.type)", ddmFormValues);
			this.MangleWrapper(_parameters, "serviceContext", "$languageUtil.getJSONWrapperClassName($parameter.type)", serviceContext);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstancerecord/update-form-instance-record", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}
	}
}