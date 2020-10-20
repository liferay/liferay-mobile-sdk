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

namespace Liferay.SDK.Service.V73.Ddmforminstancerecordversion
{
	public class DdmforminstancerecordversionService : ServiceBase
	{
		public DdmforminstancerecordversionService(ISession session)
			: base(session)
		{
		}

		public async Task<dynamic> GetFormInstanceRecordVersionAsync(long ddmFormInstanceRecordVersionId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddmFormInstanceRecordVersionId", ddmFormInstanceRecordVersionId);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstancerecordversion/get-form-instance-record-version", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> GetFormInstanceRecordVersionAsync(long ddmFormInstanceRecordId, string version)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddmFormInstanceRecordId", ddmFormInstanceRecordId);
			_parameters.Add("version", version);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstancerecordversion/get-form-instance-record-version", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<dynamic> FetchLatestFormInstanceRecordVersionAsync(long userId, long formInstanceId, string formInstanceVersion, int status)
		{
			var _parameters = new JsonObject();

			_parameters.Add("userId", userId);
			_parameters.Add("formInstanceId", formInstanceId);
			_parameters.Add("formInstanceVersion", formInstanceVersion);
			_parameters.Add("status", status);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstancerecordversion/fetch-latest-form-instance-record-version", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (dynamic)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFormInstanceRecordVersionsAsync(long ddmFormInstanceRecordId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddmFormInstanceRecordId", ddmFormInstanceRecordId);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstancerecordversion/get-form-instance-record-versions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<IEnumerable<dynamic>> GetFormInstanceRecordVersionsAsync(long ddmFormInstanceRecordId, int start, int end, JsonObjectWrapper orderByComparator)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddmFormInstanceRecordId", ddmFormInstanceRecordId);
			_parameters.Add("start", start);
			_parameters.Add("end", end);
			this.MangleWrapper(_parameters, "orderByComparator", "$languageUtil.getJSONWrapperClassName($parameter.type)", orderByComparator);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstancerecordversion/get-form-instance-record-versions", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (IEnumerable<dynamic>)_obj;
		}

		public async Task<long> GetFormInstanceRecordVersionsCountAsync(long ddmFormInstanceRecordId)
		{
			var _parameters = new JsonObject();

			_parameters.Add("ddmFormInstanceRecordId", ddmFormInstanceRecordId);

			var _command = new JsonObject()
			{
				{ "/ddm.ddmforminstancerecordversion/get-form-instance-record-versions-count", _parameters }
			};

			var _obj = await this.Session.InvokeAsync(_command);

			return (long)_obj;
		}
	}
}